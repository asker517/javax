package me.panpf.javax.crypto;

import me.panpf.javax.util.Base64x;
import org.jetbrains.annotations.NotNull;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;

@SuppressWarnings("WeakerAccess")
public class Aesx {

    public static final String AES = "AES";
    public static final String AES_ECB_NO = "AES/ECB/NoPadding";
    public static final String AES_ECB_PKCS5 = "AES/ECB/PKCS5Padding";
    @SuppressWarnings("unused")
    public static final String AES_ECB_PKCS7 = "AES/ECB/PKCS7Padding";   // Java 不支持 Android 支持
    public static final String AES_ECB_ISO10126 = "AES/ECB/ISO10126Padding";
    public static final String AES_CBC_NO = "AES/CBC/NoPadding";
    public static final String AES_CBC_PKCS5 = "AES/CBC/PKCS5Padding";
    @SuppressWarnings("unused")
    public static final String AES_CBC_PKCS7 = "AES/CBC/PKCS7Padding";   // Java 不支持 Android 支持
    public static final String AES_CBC_ISO10126 = "AES/CBC/ISO10126Padding";

    private Aesx() {

    }

    /**
     * Create a secret key
     *
     * @param keySize The length of the generated key, optional 16, 32, 64, 128
     */
    @NotNull
    public static Key createKey(int keySize) {
        KeyGenerator generator;
        try {
            generator = KeyGenerator.getInstance(AES);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        generator.init(keySize);
        return generator.generateKey();
    }

    /**
     * Generate a secret key based on the password. The password can be of any length. The fixed password always generates a fixed key.
     *
     * @param password       password
     * @param keySizeInBytes The length of the generated key, optional 16, 32, 64, 128
     */
    @NotNull
    public static Key createKeyByPassword(String password, int keySizeInBytes) {
        byte[] passwordBytes = password.getBytes(Charset.forName("UTF-8"));
        byte[] key = InsecureSHA1PRNGKeyDerivator.deriveInsecureKey(passwordBytes, keySizeInBytes);
        return new SecretKeySpec(key, AES);
    }

    /**
     * Parse key from byte array
     */
    @NotNull
    public static Key keyFromBytes(@NotNull byte[] keyBytes) {
        return new SecretKeySpec(keyBytes, AES);
    }

    /**
     * Parse key from Base64 string
     */
    @NotNull
    public static Key keyFromBase64(@NotNull String passwordBase64) {
        return new SecretKeySpec(Base64x.decodeToBytes(passwordBase64), AES);
    }


    /**
     * Encrypt raw data using the AES algorithm
     *
     * @param rawData   Raw data to be encrypted
     * @param algorithm AES encryption algorithm, The following values ​​are available: {@link #AES},{@link #AES_ECB_NO},{@link #AES_ECB_PKCS5},{@link #AES_ECB_PKCS7},
     *                  {@link #AES_CBC_ISO10126},{@link #AES_CBC_NO},{@link #AES_CBC_PKCS5},{@link #AES_CBC_PKCS7},{@link #AES_CBC_ISO10126}
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
     * Encrypt raw text using the AES algorithm
     *
     * @param rawText   Raw text to be encrypted
     * @param algorithm AES encryption algorithm, The following values ​​are available: {@link #AES},{@link #AES_ECB_NO},{@link #AES_ECB_PKCS5},{@link #AES_ECB_PKCS7},
     *                  {@link #AES_CBC_ISO10126},{@link #AES_CBC_NO},{@link #AES_CBC_PKCS5},{@link #AES_CBC_PKCS7},{@link #AES_CBC_ISO10126}
     * @param key       Secret key
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
     * Encrypt the raw data using the AES algorithm and convert the encrypted result to Base64 encoding
     *
     * @param rawData   Raw data to be encrypted
     * @param algorithm AES encryption algorithm, The following values ​​are available: {@link #AES},{@link #AES_ECB_NO},{@link #AES_ECB_PKCS5},{@link #AES_ECB_PKCS7},
     *                  {@link #AES_CBC_ISO10126},{@link #AES_CBC_NO},{@link #AES_CBC_PKCS5},{@link #AES_CBC_PKCS7},{@link #AES_CBC_ISO10126}
     * @param key       Secret key
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
     * Encrypt the raw text using the AES algorithm and convert the encrypted result to Base64 encoding
     *
     * @param rawText   Raw text to be encrypted
     * @param algorithm AES encryption algorithm, The following values ​​are available: {@link #AES},{@link #AES_ECB_NO},{@link #AES_ECB_PKCS5},{@link #AES_ECB_PKCS7},
     *                  {@link #AES_CBC_ISO10126},{@link #AES_CBC_NO},{@link #AES_CBC_PKCS5},{@link #AES_CBC_PKCS7},{@link #AES_CBC_ISO10126}
     * @param key       Secret key
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
     * Decrypt ciphertext encrypted using the AES algorithm
     *
     * @param cipherData Ciphertext to be decrypted
     * @param algorithm  AES encryption algorithm, The following values ​​are available: {@link #AES},{@link #AES_ECB_NO},{@link #AES_ECB_PKCS5},{@link #AES_ECB_PKCS7},
     *                   {@link #AES_CBC_ISO10126},{@link #AES_CBC_NO},{@link #AES_CBC_PKCS5},{@link #AES_CBC_PKCS7},{@link #AES_CBC_ISO10126}
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
     * Decryption uses the AES algorithm to encrypt and then use Base64 encoded ciphertext
     *
     * @param base64CipherText Ciphertext to be decrypted
     * @param algorithm        AES encryption algorithm, The following values ​​are available: {@link #AES},{@link #AES_ECB_NO},{@link #AES_ECB_PKCS5},{@link #AES_ECB_PKCS7},
     *                         {@link #AES_CBC_ISO10126},{@link #AES_CBC_NO},{@link #AES_CBC_PKCS5},{@link #AES_CBC_PKCS7},{@link #AES_CBC_ISO10126}
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
     * Decrypt ciphertext encrypted using the AES algorithm
     *
     * @param cipherData Ciphertext to be decrypted
     * @param algorithm  AES encryption algorithm, The following values ​​are available: {@link #AES},{@link #AES_ECB_NO},{@link #AES_ECB_PKCS5},{@link #AES_ECB_PKCS7},
     *                   {@link #AES_CBC_ISO10126},{@link #AES_CBC_NO},{@link #AES_CBC_PKCS5},{@link #AES_CBC_PKCS7},{@link #AES_CBC_ISO10126}
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
     * Decryption uses the AES algorithm to encrypt and then use Base64 encoded ciphertext
     *
     * @param base64CipherText Ciphertext to be decrypted
     * @param algorithm        AES encryption algorithm, The following values ​​are available: {@link #AES},{@link #AES_ECB_NO},{@link #AES_ECB_PKCS5},{@link #AES_ECB_PKCS7},
     *                         {@link #AES_CBC_ISO10126},{@link #AES_CBC_NO},{@link #AES_CBC_PKCS5},{@link #AES_CBC_PKCS7},{@link #AES_CBC_ISO10126}
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
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
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
