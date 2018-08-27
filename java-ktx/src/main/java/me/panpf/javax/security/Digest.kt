package me.panpf.javax.security

import java.io.File
import java.io.IOException
import java.io.InputStream
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException

import kotlin.io.DEFAULT_BUFFER_SIZE

/**
 * Message digest tool method
 */

private val HEX = charArrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f')

/**
 * Get the message digest of the input stream using the specified [algorithm]
 */
@Throws(IOException::class)
fun InputStream.getDigest(algorithm: String): String {
    val messageDigest: MessageDigest
    try {
        messageDigest = MessageDigest.getInstance(algorithm)
    } catch (e: NoSuchAlgorithmException) {
        throw RuntimeException(e)
    }

    val sb = StringBuilder()

    val buffer = ByteArray(DEFAULT_BUFFER_SIZE)
    var readLength: Int
    while (true) {
        readLength = this.read(buffer)
        if (readLength == -1) {
            break
        } else {
            messageDigest.update(buffer, 0, readLength)
        }
    }
    val result = messageDigest.digest()
    for (aMd5Byte in result) {
        sb.append(HEX[(aMd5Byte.toInt() and 0xff) / 16])
        sb.append(HEX[(aMd5Byte.toInt() and 0xff) % 16])
    }
    return sb.toString()
}

/**
 * Get the message digest of the text using the specified [algorithm]
 */
fun String.getDigest(algorithm: String): String = this.byteInputStream().use { it.getDigest(algorithm) }

/**
 * Get the message digest of the file using the specified [algorithm]
 */
fun File.getDigest(algorithm: String): String = this.inputStream().use { it.getDigest(algorithm) }

/**
 * Get the message digest of the text using the MD5 algorithm
 */
fun String.getMD5Digest(): String = this.getDigest("MD5")

/**
 * Get the message digest of the text using the MD5 algorithm, only the middle 16 bits are reserved
 */
fun String.getMD516Digest(): String = this.getDigest("MD5").substring(8, 24)

/**
 * Get the message digest of the text using the SHA1 algorithm
 */
fun String.getSHA1Digest(): String = this.getDigest("SHA1")

/**
 * Get the message digest of the text using the SHA-256 algorithm
 */
fun String.getSHA256Digest(): String = this.getDigest("SHA-256")

/**
 * Get the message digest of the text using the SHA-512 algorithm
 */
fun String.getSHA512Digest(): String = this.getDigest("SHA-512")

/**
 * Get the message digest of the file using the MD5 algorithm
 */
fun File.getMD5Digest(): String = this.getDigest("MD5")

/**
 * Get the message digest of the file using the MD5 algorithm, only the middle 16 bits are reserved
 */
fun File.getMD516Digest(): String = this.getDigest("MD5").substring(8, 24)

/**
 * Get the message digest of the file using the SHA1 algorithm
 */
fun File.getSHA1Digest(): String = this.getDigest("SHA1")

/**
 * Get the message digest of the file using the SHA-256 algorithm
 */
fun File.getSHA256Digest(): String = this.getDigest("SHA-256")

/**
 * Get the message digest of the file using the SHA-512 algorithm
 */
fun File.getSHA512Digest(): String = this.getDigest("SHA-512")