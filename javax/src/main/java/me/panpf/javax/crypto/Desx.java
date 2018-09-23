package me.panpf.javax.crypto;

import me.panpf.javax.util.Base64x;
import org.jetbrains.annotations.NotNull;

import javax.crypto.*;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;

@SuppressWarnings("WeakerAccess")
public class Desx {

    public static final String DES = "DES";
    public static final String DES_ECB_NO = "DES/ECB/NoPadding";
    public static final String DES_ECB_PKCS5 = "DES/ECB/PKCS5Padding";
    @SuppressWarnings("unused")
    public static final String DES_ECB_PKCS7 = "DES/ECB/PKCS7Padding";   // Java 不支持 Android 支持
    public static final String DES_ECB_ISO10126 = "DES/ECB/ISO10126Padding";
    public static final String DES_CBC_NO = "DES/CBC/NoPadding";
    public static final String DES_CBC_PKCS5 = "DES/CBC/PKCS5Padding";
    @SuppressWarnings("unused")
    public static final String DES_CBC_PKCS7 = "DES/CBC/PKCS7Padding";   // Java 不支持 Android 支持
    public static final String DES_CBC_ISO10126 = "DES/CBC/ISO10126Padding";

    private Desx() {
    }

    /**
     * Generate a secret key based on the password. The fixed password always generates a fixed key.
     *
     * @throws InvalidKeyException     Invalid password
     * @throws InvalidKeySpecException Invalid password
     */
    @NotNull
    public static Key createKeyByPassword(@NotNull String password) throws InvalidKeyException, InvalidKeySpecException {
        DESKeySpec keySpec = new DESKeySpec(password.getBytes());
        SecretKeyFactory keyFactory;
        try {
            keyFactory = SecretKeyFactory.getInstance(DES);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        return keyFactory.generateSecret(keySpec);
    }

    /**
     * Encrypt raw data using the DES algorithm
     *
     * @param rawData   Raw data to be encrypted
     * @param algorithm DES encryption algorithm, The following values ​​are available: {@link #DES},{@link #DES_ECB_NO},{@link #DES_ECB_PKCS5},{@link #DES_ECB_PKCS7},
     *                  {@link #DES_CBC_ISO10126},{@link #DES_CBC_NO},{@link #DES_CBC_PKCS5},{@link #DES_CBC_PKCS7},{@link #DES_CBC_ISO10126}
     * @param key       Secret key
     * @throws InvalidKeyException       Invalid key
     * @throws BadPaddingException       Padding error
     * @throws IllegalBlockSizeException Block size error
     */
    @NotNull
    public static byte[] encrypt(@NotNull byte[] rawData, @NotNull String algorithm, @NotNull Key key) throws InvalidKeyException,
            BadPaddingException, IllegalBlockSizeException {
        return createCipher(Cipher.ENCRYPT_MODE, algorithm, key).doFinal(rawData);
    }

    /**
     * Encrypt raw text using the DES algorithm
     *
     * @param rawText Raw text to be encrypted
     * @throws InvalidKeyException       Invalid key
     * @throws BadPaddingException       Padding error
     * @throws IllegalBlockSizeException Block size error
     */
    @NotNull
    public static byte[] encrypt(@NotNull String rawText, @NotNull String algorithm, @NotNull Key key) throws InvalidKeyException,
            BadPaddingException, IllegalBlockSizeException {
        return encrypt(rawText.getBytes(), algorithm, key);
    }

    /**
     * Encrypt the raw data using the DES algorithm and convert the encrypted result to Base64 encoding
     *
     * @param rawData Raw data to be encrypted
     * @throws InvalidKeyException       Invalid key
     * @throws BadPaddingException       Padding error
     * @throws IllegalBlockSizeException Block size error
     */
    @NotNull
    public static String encryptToBase64(@NotNull byte[] rawData, @NotNull String algorithm, @NotNull Key key) throws InvalidKeyException,
            BadPaddingException, IllegalBlockSizeException {
        return Base64x.encodeToString(encrypt(rawData, algorithm, key));
    }

    /**
     * Encrypt the raw text using the DES algorithm and convert the encrypted result to Base64 encoding
     *
     * @param rawText Raw text to be encrypted
     * @throws InvalidKeyException       Invalid key
     * @throws BadPaddingException       Padding error
     * @throws IllegalBlockSizeException Block size error
     */
    @NotNull
    public static String encryptToBase64(@NotNull String rawText, @NotNull String algorithm, @NotNull Key key) throws InvalidKeyException,
            BadPaddingException, IllegalBlockSizeException {
        return Base64x.encodeToString(encrypt(rawText.getBytes(), algorithm, key));
    }


    /**
     * Decrypt ciphertext encrypted using the DES algorithm
     *
     * @param cipherData Ciphertext to be decrypted
     * @param algorithm  DES encryption algorithm, The following values ​​are available: {@link #DES},{@link #DES_ECB_NO},{@link #DES_ECB_PKCS5},{@link #DES_ECB_PKCS7},
     *                   {@link #DES_CBC_ISO10126},{@link #DES_CBC_NO},{@link #DES_CBC_PKCS5},{@link #DES_CBC_PKCS7},{@link #DES_CBC_ISO10126}
     * @param key        Secret key
     * @throws InvalidKeyException       Invalid key
     * @throws BadPaddingException       Padding error
     * @throws IllegalBlockSizeException Block size error
     */
    @NotNull
    public static byte[] decrypt(@NotNull byte[] cipherData, @NotNull String algorithm, @NotNull Key key) throws InvalidKeyException,
            BadPaddingException, IllegalBlockSizeException {
        Cipher cipher = createCipher(Cipher.DECRYPT_MODE, algorithm, key);
        return cipher.doFinal(cipherData);
    }

    /**
     * Decryption uses the DES algorithm to encrypt and then use Base64 encoded ciphertext
     *
     * @param base64CipherText Ciphertext to be decrypted
     * @param algorithm        DES encryption algorithm, The following values ​​are available: {@link #DES},{@link #DES_ECB_NO},{@link #DES_ECB_PKCS5},{@link #DES_ECB_PKCS7},
     *                         {@link #DES_CBC_ISO10126},{@link #DES_CBC_NO},{@link #DES_CBC_PKCS5},{@link #DES_CBC_PKCS7},{@link #DES_CBC_ISO10126}
     * @param key              Secret key
     * @throws InvalidKeyException       Invalid key
     * @throws BadPaddingException       Padding error
     * @throws IllegalBlockSizeException Block size error
     */
    @NotNull
    public static byte[] decryptFromBase64(@NotNull String base64CipherText, @NotNull String algorithm, @NotNull Key key) throws InvalidKeyException,
            BadPaddingException, IllegalBlockSizeException {
        return decrypt(Base64x.decodeToBytes(base64CipherText.getBytes()), algorithm, key);
    }

    /**
     * Decrypt ciphertext encrypted using the DES algorithm
     *
     * @param cipherData Ciphertext to be decrypted
     * @param algorithm  DES encryption algorithm, The following values ​​are available: {@link #DES},{@link #DES_ECB_NO},{@link #DES_ECB_PKCS5},{@link #DES_ECB_PKCS7},
     *                   {@link #DES_CBC_ISO10126},{@link #DES_CBC_NO},{@link #DES_CBC_PKCS5},{@link #DES_CBC_PKCS7},{@link #DES_CBC_ISO10126}
     * @param key        Secret key
     * @throws InvalidKeyException       Invalid key
     * @throws BadPaddingException       Padding error
     * @throws IllegalBlockSizeException Block size error
     */
    @NotNull
    public static String decryptToString(@NotNull byte[] cipherData, @NotNull String algorithm, @NotNull Key key) throws InvalidKeyException,
            BadPaddingException, IllegalBlockSizeException {
        return new String(decrypt(cipherData, algorithm, key));
    }

    /**
     * Decryption uses the DES algorithm to encrypt and then use Base64 encoded ciphertext
     *
     * @param base64CipherText Ciphertext to be decrypted
     * @param algorithm        DES encryption algorithm, The following values ​​are available: {@link #DES},{@link #DES_ECB_NO},{@link #DES_ECB_PKCS5},{@link #DES_ECB_PKCS7},
     *                         {@link #DES_CBC_ISO10126},{@link #DES_CBC_NO},{@link #DES_CBC_PKCS5},{@link #DES_CBC_PKCS7},{@link #DES_CBC_ISO10126}
     * @param key              Secret key
     * @throws InvalidKeyException       Invalid key
     * @throws BadPaddingException       Padding error
     * @throws IllegalBlockSizeException Block size error
     */
    @NotNull
    public static String decryptToStringFromBase64(@NotNull String base64CipherText, @NotNull String algorithm, @NotNull Key key) throws InvalidKeyException,
            BadPaddingException, IllegalBlockSizeException {
        return new String(decryptFromBase64(base64CipherText, algorithm, key));
    }


    @NotNull
    private static Cipher createCipher(int opMode, @NotNull String algorithm, @NotNull Key key) throws InvalidKeyException {
        Cipher cipher;
        try {
            cipher = Cipher.getInstance(algorithm);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(e);
        } catch (NoSuchPaddingException e) {
            throw new IllegalArgumentException(e);
        }

        AlgorithmParameterSpec spec = null;
        if (algorithm.contains("CBC")) {
            spec = new IvParameterSpec(new byte[cipher.getBlockSize()]);
        }

        try {
            cipher.init(opMode, key, spec);
        } catch (InvalidAlgorithmParameterException e) {
            throw new IllegalArgumentException(e);
        }

        return cipher;
    }
}
