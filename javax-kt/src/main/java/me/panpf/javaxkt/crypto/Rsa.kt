package me.panpf.javaxkt.crypto

import me.panpf.javaxkt.util.base64DecodeToBytes
import me.panpf.javaxkt.util.base64EncodeToString
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.security.*
import java.security.spec.InvalidKeySpecException
import java.security.spec.PKCS8EncodedKeySpec
import java.security.spec.X509EncodedKeySpec
import javax.crypto.BadPaddingException
import javax.crypto.Cipher
import javax.crypto.IllegalBlockSizeException
import javax.crypto.NoSuchPaddingException

const val RSA = "RSA"
const val RSA_ECB_PKCS1 = "RSA/ECB/PKCS1Padding"
const val RSA_ECB_OAEP = "RSA/ECB/OAEPPadding"
const val RSA_SIGNATURE = "MD5withRSA"

/**
 * Create a pair of RSA keys
 *
 * @param keySize Key length, usually a multiple of 1024
 */
fun createRsaKey(keySize: Int): KeyPair {
    val keyPairGen: KeyPairGenerator
    try {
        keyPairGen = KeyPairGenerator.getInstance(RSA)
    } catch (e: NoSuchAlgorithmException) {
        throw RuntimeException(e)
    }

    keyPairGen.initialize(keySize)
    return keyPairGen.generateKeyPair()
}

/**
 * Parse the Base 64 string into a RSA public key
 *
 * @throws InvalidKeySpecException Invalid public key
 */
@Throws(InvalidKeySpecException::class)
fun String.toRsaPubKeyFromBase64(): PublicKey {
    val buffer = this.toByteArray().base64DecodeToBytes()
    val keyFactory: KeyFactory
    try {
        keyFactory = KeyFactory.getInstance(RSA)
    } catch (e: NoSuchAlgorithmException) {
        throw RuntimeException(e)
    }

    val keySpec = X509EncodedKeySpec(buffer)
    return keyFactory.generatePublic(keySpec)
}

/**
 * Parse the Base 64 string into a RSA private key
 *
 * @throws InvalidKeySpecException Private key is invalid
 */
@Throws(InvalidKeySpecException::class)
fun String.toRsaPriKeyFromBase64(): PrivateKey {
    val buffer = this.toByteArray().base64DecodeToBytes()
    val keySpec = PKCS8EncodedKeySpec(buffer)
    val keyFactory: KeyFactory
    try {
        keyFactory = KeyFactory.getInstance(RSA)
    } catch (e: NoSuchAlgorithmException) {
        throw RuntimeException(e)
    }

    return keyFactory.generatePrivate(keySpec)
}


/**
 * Generate a RSA digital signature for the information with the private key
 *
 * @param priKey    Private key
 * @throws InvalidKeyException Private key is invalid
 * @throws SignatureException  Signature exception
 */
@Throws(InvalidKeyException::class, SignatureException::class)
fun ByteArray.rsaSign(priKey: PrivateKey): ByteArray {
    val signature: Signature
    try {
        signature = Signature.getInstance(RSA_SIGNATURE)
    } catch (e: NoSuchAlgorithmException) {
        throw RuntimeException(e)
    }

    signature.initSign(priKey)
    signature.update(this)

    return signature.sign()
}

/**
 * Generate a RSA digital signature for the information with the private key
 *
 * @param priKey Private key
 * @throws InvalidKeyException Private key is invalid
 * @throws SignatureException  Signature exception
 */
@Throws(InvalidKeyException::class, SignatureException::class)
fun String.rsaSign(priKey: PrivateKey): ByteArray {
    return this.toByteArray().rsaSign(priKey)
}

/**
 * Generate a RSA digital signature of the information with a private key and return a Base64 string
 *
 * @param priKey    Private key
 * @throws InvalidKeyException Private key is invalid
 * @throws SignatureException  Signature exception
 */
@Throws(InvalidKeyException::class, SignatureException::class)
fun ByteArray.rsaSignToBase64(priKey: PrivateKey): String {
    return this.rsaSign(priKey).base64EncodeToString()
}

/**
 * Generate a RSA digital signature of the information with a private key and return a Base64 string
 *
 * @param priKey Private key
 * @throws InvalidKeyException Private key is invalid
 * @throws SignatureException  Signature exception
 */
@Throws(InvalidKeyException::class, SignatureException::class)
fun String.rsaSignToBase64(priKey: PrivateKey): String {
    return this.toByteArray().rsaSign(priKey).base64EncodeToString()
}


/**
 * Verify the RSA signature with the public key
 *
 * @param data      Original data
 * @param pubKey    Public key
 * @throws InvalidKeyException Invalid public key
 * @throws SignatureException  Signature exception
 */
@Throws(InvalidKeyException::class, SignatureException::class)
fun ByteArray.rsaVerify(data: ByteArray, pubKey: PublicKey): Boolean {
    val signature: Signature
    try {
        signature = Signature.getInstance(RSA_SIGNATURE)
    } catch (e: NoSuchAlgorithmException) {
        throw RuntimeException(e)
    }

    signature.initVerify(pubKey)
    signature.update(data)
    return signature.verify(this)
}

/**
 * Verify the RSA signature with the public key
 *
 * @param text      Original text
 * @param pubKey    Public key
 * @throws InvalidKeyException Invalid public key
 * @throws SignatureException  Signature exception
 */
@Throws(InvalidKeyException::class, SignatureException::class)
fun ByteArray.rsaVerify(text: String, pubKey: PublicKey): Boolean {
    return this.rsaVerify(text.toByteArray(), pubKey)
}

/**
 * Verify the RSA signature with the public key
 *
 * @param data       Original data
 * @param pubKey     Public key
 * @throws InvalidKeyException Invalid public key
 * @throws SignatureException  Signature exception
 */
@Throws(InvalidKeyException::class, SignatureException::class)
fun String.rsaVerifyFromBase64(data: ByteArray, pubKey: PublicKey): Boolean {
    return this.toByteArray().base64DecodeToBytes().rsaVerify(data, pubKey)
}

/**
 * Verify the RSA signature with the public key
 *
 * @param text       Original text
 * @param pubKey     Public key
 * @throws InvalidKeyException Invalid public key
 * @throws SignatureException  Signature exception
 */
@Throws(InvalidKeyException::class, SignatureException::class)
fun String.rsaVerifyFromBase64(text: String, pubKey: PublicKey): Boolean {
    return this.base64DecodeToBytes().rsaVerify(text.toByteArray(), pubKey)
}


/**
 * Encrypt raw data using the RSA algorithm
 *
 * @param algorithm RSA encryption algorithm, The following values ​​are available: [.RSA],[.RSA_ECB_PKCS1],[.RSA_ECB_OAEP]
 * @param key       Secret key
 * @throws InvalidKeyException       Invalid key
 * @throws BadPaddingException       Padding error
 * @throws IllegalBlockSizeException Block size error
 */
@Throws(InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
fun ByteArray.encrypt(algorithm: String, key: Key): ByteArray {
    val cipher = createCipher(Cipher.ENCRYPT_MODE, algorithm, key)
    return blockDoCipher(cipher, Cipher.ENCRYPT_MODE, this)
}

/**
 * Encrypt raw text using the RSA algorithm
 *
 * @param algorithm RSA encryption algorithm, The following values ​​are available: [.RSA],[.RSA_ECB_PKCS1],[.RSA_ECB_OAEP]
 * @param key       Secret key
 * @throws InvalidKeyException       Invalid key
 * @throws BadPaddingException       Padding error
 * @throws IllegalBlockSizeException Block size error
 */
@Throws(InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
fun String.encrypt(algorithm: String, key: Key): ByteArray {
    return this.toByteArray().encrypt(algorithm, key)
}

/**
 * Encrypt the raw data using the RSA algorithm and convert the encrypted result to Base64 encoding
 *
 * @param algorithm RSA encryption algorithm, The following values ​​are available: [.RSA],[.RSA_ECB_PKCS1],[.RSA_ECB_OAEP]
 * @param key       Secret key
 * @throws InvalidKeyException       Invalid key
 * @throws BadPaddingException       Padding error
 * @throws IllegalBlockSizeException Block size error
 */
@Throws(InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
fun ByteArray.encryptToBase64(algorithm: String, key: Key): String {
    return this.encrypt(algorithm, key).base64EncodeToString()
}

/**
 * Encrypt the raw text using the RSA algorithm and convert the encrypted result to Base64 encoding
 *
 * @param algorithm RSA encryption algorithm, The following values ​​are available: [.RSA],[.RSA_ECB_PKCS1],[.RSA_ECB_OAEP]
 * @param key       Secret key
 * @throws InvalidKeyException       Invalid key
 * @throws BadPaddingException       Padding error
 * @throws IllegalBlockSizeException Block size error
 */
@Throws(InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
fun String.encryptToBase64(algorithm: String, key: Key): String {
    return this.toByteArray().encrypt(algorithm, key).base64EncodeToString()
}


/**
 * Decrypt ciphertext encrypted using the RSA algorithm
 *
 * @param algorithm  RSA encryption algorithm, The following values ​​are available: [.RSA],[.RSA_ECB_PKCS1],[.RSA_ECB_OAEP]
 * @param key        Secret key
 * @throws InvalidKeyException       Invalid key
 * @throws BadPaddingException       Padding error
 * @throws IllegalBlockSizeException Block size error
 */
@Throws(InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
fun ByteArray.decrypt(algorithm: String, key: Key): ByteArray {
    val cipher = createCipher(Cipher.DECRYPT_MODE, algorithm, key)
    return blockDoCipher(cipher, Cipher.DECRYPT_MODE, this)
}

/**
 * Decryption uses the RSA algorithm to encrypt and then use Base64 encoded ciphertext
 *
 * @param algorithm      RSA encryption algorithm, The following values ​​are available: [.RSA],[.RSA_ECB_PKCS1],[.RSA_ECB_OAEP]
 * @param key            Secret key
 * @throws InvalidKeyException       Invalid key
 * @throws BadPaddingException       Padding error
 * @throws IllegalBlockSizeException Block size error
 */
@Throws(InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
fun String.decryptFromBase64(algorithm: String, key: Key): ByteArray {
    return this.toByteArray().base64DecodeToBytes().decrypt(algorithm, key)
}

/**
 * Decrypt ciphertext encrypted using the RSA algorithm
 *
 * @param algorithm  RSA encryption algorithm, The following values ​​are available: [.RSA],[.RSA_ECB_PKCS1],[.RSA_ECB_OAEP]
 * @param key        Secret key
 * @throws InvalidKeyException       Invalid key
 * @throws BadPaddingException       Padding error
 * @throws IllegalBlockSizeException Block size error
 */
@Throws(InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
fun ByteArray.decryptToString(algorithm: String, key: Key): String {
    return String(this.decrypt(algorithm, key))
}

/**
 * Decryption uses the RSA algorithm to encrypt and then use Base64 encoded ciphertext
 *
 * @param algorithm      RSA encryption algorithm, The following values ​​are available: [.RSA],[.RSA_ECB_PKCS1],[.RSA_ECB_OAEP]
 * @param key            Secret key
 * @throws InvalidKeyException       Invalid key
 * @throws BadPaddingException       Padding error
 * @throws IllegalBlockSizeException Block size error
 */
@Throws(InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
fun String.decryptToStringFromBase64(algorithm: String, key: Key): String {
    return String(this.decryptFromBase64(algorithm, key))
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

    cipher.init(opMode, key)

    return cipher
}

@Throws(BadPaddingException::class, IllegalBlockSizeException::class)
private fun blockDoCipher(cipher: Cipher, opMode: Int, data: ByteArray): ByteArray {
    val dataLength = data.size
    var blockSize = cipher.blockSize
    if (blockSize <= 0) blockSize = if (opMode == Cipher.ENCRYPT_MODE) 117 else 128
    if (dataLength > blockSize) {
        val outputStream = ByteArrayOutputStream()
        var offset = 0
        while (offset < dataLength) {
            val length = if (offset + blockSize <= dataLength) blockSize else dataLength - offset
            val cache = cipher.doFinal(data, offset, length)
            try {
                outputStream.write(cache)
            } catch (e: IOException) {
                e.printStackTrace()
            }

            offset += length
        }
        return outputStream.toByteArray()
    } else {
        return cipher.doFinal(data)
    }
}
