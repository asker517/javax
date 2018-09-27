/*
 * Copyright (C) 2018 Peng fei Pan <panpfpanpf@outlook.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.panpf.javaxkt.crypto

import me.panpf.javaxkt.util.base64DecodeToBytes
import me.panpf.javaxkt.util.base64EncodeToString
import java.security.InvalidAlgorithmParameterException
import java.security.InvalidKeyException
import java.security.Key
import java.security.NoSuchAlgorithmException
import java.security.spec.AlgorithmParameterSpec
import java.security.spec.InvalidKeySpecException
import javax.crypto.*
import javax.crypto.spec.DESKeySpec
import javax.crypto.spec.IvParameterSpec


/*
 * DES encryption and decryption related extension methods or properties
 */


const val DES = "DES"
const val DES_ECB_NO = "DES/ECB/NoPadding"
const val DES_ECB_PKCS5 = "DES/ECB/PKCS5Padding"
@Suppress("unused")
const val DES_ECB_PKCS7 = "DES/ECB/PKCS7Padding"   // Java 不支持 Android 支持
const val DES_ECB_ISO10126 = "DES/ECB/ISO10126Padding"
const val DES_CBC_NO = "DES/CBC/NoPadding"
const val DES_CBC_PKCS5 = "DES/CBC/PKCS5Padding"
@Suppress("unused")
const val DES_CBC_PKCS7 = "DES/CBC/PKCS7Padding"   // Java 不支持 Android 支持
const val DES_CBC_ISO10126 = "DES/CBC/ISO10126Padding"

/**
 * Generate a secret key based on the password. The fixed password always generates a fixed key.
 *
 * @throws InvalidKeyException     Invalid password
 * @throws InvalidKeySpecException Invalid password
 */
@Throws(InvalidKeyException::class, InvalidKeySpecException::class)
fun String.createDesKeyByPassword(): Key {
    val keySpec = DESKeySpec(this.toByteArray())
    val keyFactory: SecretKeyFactory
    try {
        keyFactory = SecretKeyFactory.getInstance(DES)
    } catch (e: NoSuchAlgorithmException) {
        throw RuntimeException(e)
    }

    return keyFactory.generateSecret(keySpec)
}


/**
 * Encrypt raw data using the DES algorithm
 *
 * @param algorithm DES encryption algorithm, The following values ​​are available: [.DES],[.DES_ECB_NO],[.DES_ECB_PKCS5],[.DES_ECB_PKCS7],
 * [.DES_CBC_ISO10126],[.DES_CBC_NO],[.DES_CBC_PKCS5],[.DES_CBC_PKCS7],[.DES_CBC_ISO10126]
 * @param key       Secret key
 * @throws InvalidKeyException       Invalid key
 * @throws BadPaddingException       Padding error
 * @throws IllegalBlockSizeException Block size error
 */
@Throws(InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
fun ByteArray.desEncrypt(algorithm: String, key: Key): ByteArray {
    return createCipher(Cipher.ENCRYPT_MODE, algorithm, key).doFinal(this)
}

/**
 * Encrypt raw text using the DES algorithm
 *
 * @throws InvalidKeyException       Invalid key
 * @throws BadPaddingException       Padding error
 * @throws IllegalBlockSizeException Block size error
 */
@Throws(InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
fun String.desEncrypt(algorithm: String, key: Key): ByteArray {
    return this.toByteArray().desEncrypt(algorithm, key)
}

/**
 * Encrypt the raw data using the DES algorithm and convert the encrypted result to Base64 encoding
 *
 * @throws InvalidKeyException       Invalid key
 * @throws BadPaddingException       Padding error
 * @throws IllegalBlockSizeException Block size error
 */
@Throws(InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
fun ByteArray.desEncryptToBase64(algorithm: String, key: Key): String {
    return this.desEncrypt(algorithm, key).base64EncodeToString()
}

/**
 * Encrypt the raw text using the DES algorithm and convert the encrypted result to Base64 encoding
 *
 * @throws InvalidKeyException       Invalid key
 * @throws BadPaddingException       Padding error
 * @throws IllegalBlockSizeException Block size error
 */
@Throws(InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
fun String.desEncryptToBase64(algorithm: String, key: Key): String {
    return this.toByteArray().desEncrypt(algorithm, key).base64EncodeToString()
}


/**
 * Decrypt ciphertext encrypted using the DES algorithm
 *
 * @param algorithm  DES encryption algorithm, The following values ​​are available: [.DES],[.DES_ECB_NO],[.DES_ECB_PKCS5],[.DES_ECB_PKCS7],
 * [.DES_CBC_ISO10126],[.DES_CBC_NO],[.DES_CBC_PKCS5],[.DES_CBC_PKCS7],[.DES_CBC_ISO10126]
 * @param key        Secret key
 * @throws InvalidKeyException       Invalid key
 * @throws BadPaddingException       Padding error
 * @throws IllegalBlockSizeException Block size error
 */
@Throws(InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
fun ByteArray.desDecrypt(algorithm: String, key: Key): ByteArray {
    val cipher = createCipher(Cipher.DECRYPT_MODE, algorithm, key)
    return cipher.doFinal(this)
}

/**
 * Decryption uses the DES algorithm to encrypt and then use Base64 encoded ciphertext
 *
 * @param algorithm        DES encryption algorithm, The following values ​​are available: [.DES],[.DES_ECB_NO],[.DES_ECB_PKCS5],[.DES_ECB_PKCS7],
 * [.DES_CBC_ISO10126],[.DES_CBC_NO],[.DES_CBC_PKCS5],[.DES_CBC_PKCS7],[.DES_CBC_ISO10126]
 * @param key              Secret key
 * @throws InvalidKeyException       Invalid key
 * @throws BadPaddingException       Padding error
 * @throws IllegalBlockSizeException Block size error
 */
@Throws(InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
fun String.desDecryptFromBase64(algorithm: String, key: Key): ByteArray {
    return this.toByteArray().base64DecodeToBytes().desDecrypt(algorithm, key)
}

/**
 * Decrypt ciphertext encrypted using the DES algorithm
 *
 * @param algorithm  DES encryption algorithm, The following values ​​are available: [.DES],[.DES_ECB_NO],[.DES_ECB_PKCS5],[.DES_ECB_PKCS7],
 * [.DES_CBC_ISO10126],[.DES_CBC_NO],[.DES_CBC_PKCS5],[.DES_CBC_PKCS7],[.DES_CBC_ISO10126]
 * @param key        Secret key
 * @throws InvalidKeyException       Invalid key
 * @throws BadPaddingException       Padding error
 * @throws IllegalBlockSizeException Block size error
 */
@Throws(InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
fun ByteArray.desDecryptToString(algorithm: String, key: Key): String {
    return String(this.desDecrypt(algorithm, key))
}

/**
 * Decryption uses the DES algorithm to encrypt and then use Base64 encoded ciphertext
 *
 * @param algorithm        DES encryption algorithm, The following values ​​are available: [.DES],[.DES_ECB_NO],[.DES_ECB_PKCS5],[.DES_ECB_PKCS7],
 * [.DES_CBC_ISO10126],[.DES_CBC_NO],[.DES_CBC_PKCS5],[.DES_CBC_PKCS7],[.DES_CBC_ISO10126]
 * @param key              Secret key
 * @throws InvalidKeyException       Invalid key
 * @throws BadPaddingException       Padding error
 * @throws IllegalBlockSizeException Block size error
 */
@Throws(InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
fun String.desDecryptToStringFromBase64(algorithm: String, key: Key): String {
    return String(this.desDecryptFromBase64(algorithm, key))
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
