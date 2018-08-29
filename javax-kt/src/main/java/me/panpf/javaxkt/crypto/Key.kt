package me.panpf.javaxkt.crypto

import me.panpf.javaxkt.util.base64EncodeToString
import java.security.Key


/**
 * Convert key to a Base64 string
 */
fun Key.toBase64(): String = this.encoded.base64EncodeToString()

/**
 * Convert key to a byte array
 */
fun Key.toBytes(): ByteArray = this.encoded