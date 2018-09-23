package me.panpf.javaxkt.crypto

import me.panpf.javaxkt.util.base64DecodeToBytes
import me.panpf.javaxkt.util.base64EncodeToString
import javax.crypto.spec.SecretKeySpec
import java.nio.charset.Charset
import java.security.InvalidAlgorithmParameterException
import java.security.InvalidKeyException
import java.security.Key
import java.security.NoSuchAlgorithmException
import java.security.spec.AlgorithmParameterSpec
import javax.crypto.*
import javax.crypto.spec.IvParameterSpec

const val AES = "AES"
const val AES_ECB_NO = "AES/ECB/NoPadding"
const val AES_ECB_PKCS5 = "AES/ECB/PKCS5Padding"
@Suppress("unused")
const val AES_ECB_PKCS7 = "AES/ECB/PKCS7Padding"   // Java 不支持 Android 支持
const val AES_ECB_ISO10126 = "AES/ECB/ISO10126Padding"
const val AES_CBC_NO = "AES/CBC/NoPadding"
const val AES_CBC_PKCS5 = "AES/CBC/PKCS5Padding"
@Suppress("unused")
const val AES_CBC_PKCS7 = "AES/CBC/PKCS7Padding"   // Java 不支持 Android 支持
const val AES_CBC_ISO10126 = "AES/CBC/ISO10126Padding"

/**
 * Create a secret key
 *
 * @param keySize The length of the generated key, optional 16, 32, 64, 128
 */
fun createAesKey(keySize: Int): Key {
    val generator: KeyGenerator
    try {
        generator = KeyGenerator.getInstance(AES)
    } catch (e: NoSuchAlgorithmException) {
        throw RuntimeException(e)
    }

    generator.init(keySize)
    return generator.generateKey()
}

/**
 * Generate a secret key based on the password. The password can be of any length. The fixed password always generates a fixed key.
 *
 * @param keySizeInBytes The length of the generated key, optional 16, 32, 64, 128
 */
fun String.createAesKeyByPassword(keySizeInBytes: Int): Key {
    val passwordBytes = this.toByteArray(Charset.forName("UTF-8"))
    val key = InsecureSHA1PRNGKeyDerivator.deriveInsecureKey(passwordBytes, keySizeInBytes)
    return SecretKeySpec(key, AES)
}

/**
 * Parse key from byte array
 */
fun ByteArray.toAesKeyFromBytes(): Key {
    return SecretKeySpec(this, AES)
}

/**
 * Parse key from Base64 string
 */
fun String.toAesKeyFromBase64(): Key {
    return SecretKeySpec(this.base64DecodeToBytes(), AES)
}


/**
 * Encrypt raw data using the AES algorithm
 *
 * @param algorithm AES encryption algorithm, The following values ​​are available: [.AES],[.AES_ECB_NO],[.AES_ECB_PKCS5],[.AES_ECB_PKCS7],
 * [.AES_CBC_ISO10126],[.AES_CBC_NO],[.AES_CBC_PKCS5],[.AES_CBC_PKCS7],[.AES_CBC_ISO10126]
 * @param key       Secret key
 * @throws InvalidKeyException       Invalid key
 * @throws BadPaddingException       Padding error
 * @throws IllegalBlockSizeException Block size error
 */
@Throws(InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
fun ByteArray.aesEncrypt(algorithm: String, key: Key): ByteArray {
    return createCipher(Cipher.ENCRYPT_MODE, algorithm, key).doFinal(this)
}

/**
 * Encrypt raw text using the AES algorithm
 *
 * @param algorithm AES encryption algorithm, The following values ​​are available: [.AES],[.AES_ECB_NO],[.AES_ECB_PKCS5],[.AES_ECB_PKCS7],
 * [.AES_CBC_ISO10126],[.AES_CBC_NO],[.AES_CBC_PKCS5],[.AES_CBC_PKCS7],[.AES_CBC_ISO10126]
 * @param key       Secret key
 * @throws InvalidKeyException       Invalid key
 * @throws BadPaddingException       Padding error
 * @throws IllegalBlockSizeException Block size error
 */
@Throws(InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
fun String.aesEncrypt(algorithm: String, key: Key): ByteArray {
    return this.toByteArray().aesEncrypt(algorithm, key)
}

/**
 * Encrypt the raw data using the AES algorithm and convert the encrypted result to Base64 encoding
 *
 * @param algorithm AES encryption algorithm, The following values ​​are available: [.AES],[.AES_ECB_NO],[.AES_ECB_PKCS5],[.AES_ECB_PKCS7],
 * [.AES_CBC_ISO10126],[.AES_CBC_NO],[.AES_CBC_PKCS5],[.AES_CBC_PKCS7],[.AES_CBC_ISO10126]
 * @param key       Secret key
 * @throws InvalidKeyException       Invalid key
 * @throws BadPaddingException       Padding error
 * @throws IllegalBlockSizeException Block size error
 */
@Throws(InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
fun ByteArray.aesEncryptToBase64(algorithm: String, key: Key): String {
    return this.aesEncrypt(algorithm, key).base64EncodeToString()
}

/**
 * Encrypt the raw text using the AES algorithm and convert the encrypted result to Base64 encoding
 *
 * @param algorithm AES encryption algorithm, The following values ​​are available: [.AES],[.AES_ECB_NO],[.AES_ECB_PKCS5],[.AES_ECB_PKCS7],
 * [.AES_CBC_ISO10126],[.AES_CBC_NO],[.AES_CBC_PKCS5],[.AES_CBC_PKCS7],[.AES_CBC_ISO10126]
 * @param key       Secret key
 * @throws InvalidKeyException       Invalid key
 * @throws BadPaddingException       Padding error
 * @throws IllegalBlockSizeException Block size error
 */
@Throws(InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
fun String.aesEncryptToBase64(algorithm: String, key: Key): String {
    return this.toByteArray().aesEncrypt(algorithm, key).base64EncodeToString()
}


/**
 * Decrypt ciphertext encrypted using the AES algorithm
 *
 * @param algorithm  AES encryption algorithm, The following values ​​are available: [.AES],[.AES_ECB_NO],[.AES_ECB_PKCS5],[.AES_ECB_PKCS7],
 * [.AES_CBC_ISO10126],[.AES_CBC_NO],[.AES_CBC_PKCS5],[.AES_CBC_PKCS7],[.AES_CBC_ISO10126]
 * @param key        Secret key
 * @throws InvalidKeyException       Invalid key
 * @throws BadPaddingException       Padding error
 * @throws IllegalBlockSizeException Block size error
 */
@Throws(InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
fun ByteArray.aesDecrypt(algorithm: String, key: Key): ByteArray {
    val cipher = createCipher(Cipher.DECRYPT_MODE, algorithm, key)
    return cipher.doFinal(this)
}

/**
 * Decryption uses the AES algorithm to encrypt and then use Base64 encoded ciphertext
 *
 * @param algorithm        AES encryption algorithm, The following values ​​are available: [.AES],[.AES_ECB_NO],[.AES_ECB_PKCS5],[.AES_ECB_PKCS7],
 * [.AES_CBC_ISO10126],[.AES_CBC_NO],[.AES_CBC_PKCS5],[.AES_CBC_PKCS7],[.AES_CBC_ISO10126]
 * @param key              Secret key
 * @throws InvalidKeyException       Invalid key
 * @throws BadPaddingException       Padding error
 * @throws IllegalBlockSizeException Block size error
 */
@Throws(InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
fun String.aesDecryptFromBase64(algorithm: String, key: Key): ByteArray {
    return this.toByteArray().base64DecodeToBytes().aesDecrypt(algorithm, key)
}

/**
 * Decrypt ciphertext encrypted using the AES algorithm
 *
 * @param algorithm  AES encryption algorithm, The following values ​​are available: [.AES],[.AES_ECB_NO],[.AES_ECB_PKCS5],[.AES_ECB_PKCS7],
 * [.AES_CBC_ISO10126],[.AES_CBC_NO],[.AES_CBC_PKCS5],[.AES_CBC_PKCS7],[.AES_CBC_ISO10126]
 * @param key        Secret key
 * @throws InvalidKeyException       Invalid key
 * @throws BadPaddingException       Padding error
 * @throws IllegalBlockSizeException Block size error
 */
@Throws(InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
fun ByteArray.aesDecryptToString(algorithm: String, key: Key): String {
    return String(this.aesDecrypt(algorithm, key))
}

/**
 * Decryption uses the AES algorithm to encrypt and then use Base64 encoded ciphertext
 *
 * @param algorithm        AES encryption algorithm, The following values ​​are available: [.AES],[.AES_ECB_NO],[.AES_ECB_PKCS5],[.AES_ECB_PKCS7],
 * [.AES_CBC_ISO10126],[.AES_CBC_NO],[.AES_CBC_PKCS5],[.AES_CBC_PKCS7],[.AES_CBC_ISO10126]
 * @param key              Secret key
 * @throws InvalidKeyException       Invalid key
 * @throws BadPaddingException       Padding error
 * @throws IllegalBlockSizeException Block size error
 */
@Throws(InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
fun String.aesDecryptToStringFromBase64(algorithm: String, key: Key): String {
    return String(this.aesDecryptFromBase64(algorithm, key))
}


@Throws(InvalidKeyException::class)
private fun createCipher(opMode: Int, algorithm: String, key: Key): Cipher {
    val cipher: Cipher
    try {
        cipher = Cipher.getInstance(algorithm)
    } catch (e: NoSuchAlgorithmException) {
        throw IllegalArgumentException(e)
    } catch (e: NoSuchPaddingException) {
        throw IllegalArgumentException(e)
    }

    var spec: AlgorithmParameterSpec? = null
    if (algorithm.contains("CBC")) {
        spec = IvParameterSpec(ByteArray(cipher.blockSize))
    }

    try {
        cipher.init(opMode, key, spec)
    } catch (e: InvalidAlgorithmParameterException) {
        throw IllegalArgumentException(e)
    }

    return cipher
}