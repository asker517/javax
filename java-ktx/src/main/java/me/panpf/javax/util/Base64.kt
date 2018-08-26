package me.panpf.javax.util

import java.nio.ByteBuffer
import java.nio.charset.Charset

/*
 * Base64 tool method
 */


fun ByteArray.encodeToString(): String {
    return Base64.getEncoder().encodeToString(this)
}

fun String.encodeToString(): String {
    return Base64.getEncoder().encodeToString(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.encodeToString(): String {
    return Base64.getEncoder().encodeToString(this.array())
}


fun ByteArray.encodeToBytes(): ByteArray {
    return Base64.getEncoder().encode(this)
}

fun String.encodeToBytes(): ByteArray {
    return Base64.getEncoder().encode(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.encodeToBytes(): ByteArray {
    return Base64.getEncoder().encode(this.array())
}


fun ByteArray.encodeTo(dst: ByteArray): Int {
    return Base64.getEncoder().encode(this, dst)
}

fun String.encodeTo(dst: ByteArray): Int {
    return Base64.getEncoder().encode(this.toByteArray(Charset.forName("UTF-8")), dst)
}

fun ByteBuffer.encodeTo(dst: ByteArray): Int {
    return Base64.getEncoder().encode(this.array(), dst)
}


fun ByteArray.encodeToBuffer(): ByteBuffer {
    return Base64.getEncoder().encode(ByteBuffer.wrap(this))
}

fun String.encodeToBuffer(): ByteBuffer {
    return Base64.getEncoder().encode(ByteBuffer.wrap(this.toByteArray(Charset.forName("UTF-8"))))
}

fun ByteBuffer.encodeToBuffer(): ByteBuffer {
    return Base64.getEncoder().encode(this)
}


fun ByteArray.urlEncodeToString(): String {
    return Base64.getUrlEncoder().encodeToString(this)
}

fun String.urlEncodeToString(): String {
    return Base64.getUrlEncoder().encodeToString(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.urlEncodeToString(): String {
    return Base64.getUrlEncoder().encodeToString(this.array())
}


fun ByteArray.urlEncodeToBytes(): ByteArray {
    return Base64.getUrlEncoder().encode(this)
}

fun String.urlEncodeToBytes(): ByteArray {
    return Base64.getUrlEncoder().encode(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.urlEncodeToBytes(): ByteArray {
    return Base64.getUrlEncoder().encode(this.array())
}


fun ByteArray.urlEncodeTo(dst: ByteArray): Int {
    return Base64.getUrlEncoder().encode(this, dst)
}

fun String.urlEncodeTo(dst: ByteArray): Int {
    return Base64.getUrlEncoder().encode(this.toByteArray(Charset.forName("UTF-8")), dst)
}

fun ByteBuffer.urlEncodeTo(dst: ByteArray): Int {
    return Base64.getUrlEncoder().encode(this.array(), dst)
}


fun ByteArray.urlEncodeToBuffer(): ByteBuffer {
    return Base64.getUrlEncoder().encode(ByteBuffer.wrap(this))
}

fun String.urlEncodeToBuffer(): ByteBuffer {
    return Base64.getUrlEncoder().encode(ByteBuffer.wrap(this.toByteArray(Charset.forName("UTF-8"))))
}

fun ByteBuffer.urlEncodeToBuffer(): ByteBuffer {
    return Base64.getUrlEncoder().encode(this)
}


fun ByteArray.mimeEncodeToString(): String {
    return Base64.getMimeEncoder().encodeToString(this)
}

fun String.mimeEncodeToString(): String {
    return Base64.getMimeEncoder().encodeToString(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.mimeEncodeToString(): String {
    return Base64.getMimeEncoder().encodeToString(this.array())
}


fun ByteArray.mimeEncodeToBytes(): ByteArray {
    return Base64.getMimeEncoder().encode(this)
}

fun String.mimeEncodeToBytes(): ByteArray {
    return Base64.getMimeEncoder().encode(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.mimeEncodeToBytes(): ByteArray {
    return Base64.getMimeEncoder().encode(this.array())
}


fun ByteArray.mimeEncodeTo(dst: ByteArray): Int {
    return Base64.getMimeEncoder().encode(this, dst)
}

fun String.mimeEncodeTo(dst: ByteArray): Int {
    return Base64.getMimeEncoder().encode(this.toByteArray(Charset.forName("UTF-8")), dst)
}

fun ByteBuffer.mimeEncodeTo(dst: ByteArray): Int {
    return Base64.getMimeEncoder().encode(this.array(), dst)
}


fun ByteArray.mimeEncodeToBuffer(): ByteBuffer {
    return Base64.getMimeEncoder().encode(ByteBuffer.wrap(this))
}

fun String.mimeEncodeToBuffer(): ByteBuffer {
    return Base64.getMimeEncoder().encode(ByteBuffer.wrap(this.toByteArray(Charset.forName("UTF-8"))))
}

fun ByteBuffer.mimeEncodeToBuffer(): ByteBuffer {
    return Base64.getMimeEncoder().encode(this)
}


fun ByteArray.mimeEncodeToString(lineLength: Int, lineSeparator: ByteArray): String {
    return Base64.getMimeEncoder(lineLength, lineSeparator).encodeToString(this)
}

fun String.mimeEncodeToString(lineLength: Int, lineSeparator: ByteArray): String {
    return Base64.getMimeEncoder(lineLength, lineSeparator).encodeToString(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.mimeEncodeToString(lineLength: Int, lineSeparator: ByteArray): String {
    return Base64.getMimeEncoder(lineLength, lineSeparator).encodeToString(this.array())
}


fun ByteArray.mimeEncodeToBytes(lineLength: Int, lineSeparator: ByteArray): ByteArray {
    return Base64.getMimeEncoder(lineLength, lineSeparator).encode(this)
}

fun String.mimeEncodeToBytes(lineLength: Int, lineSeparator: ByteArray): ByteArray {
    return Base64.getMimeEncoder(lineLength, lineSeparator).encode(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.mimeEncodeToBytes(lineLength: Int, lineSeparator: ByteArray): ByteArray {
    return Base64.getMimeEncoder(lineLength, lineSeparator).encode(this.array())
}


fun ByteArray.mimeEncodeTo(lineLength: Int, lineSeparator: ByteArray, dst: ByteArray): Int {
    return Base64.getMimeEncoder(lineLength, lineSeparator).encode(this, dst)
}

fun String.mimeEncodeTo(lineLength: Int, lineSeparator: ByteArray, dst: ByteArray): Int {
    return Base64.getMimeEncoder(lineLength, lineSeparator).encode(this.toByteArray(Charset.forName("UTF-8")), dst)
}

fun ByteBuffer.mimeEncodeTo(lineLength: Int, lineSeparator: ByteArray, dst: ByteArray): Int {
    return Base64.getMimeEncoder(lineLength, lineSeparator).encode(this.array(), dst)
}


fun ByteArray.mimeEncodeToBuffer(lineLength: Int, lineSeparator: ByteArray): ByteBuffer {
    return Base64.getMimeEncoder(lineLength, lineSeparator).encode(ByteBuffer.wrap(this))
}

fun String.mimeEncodeToBuffer(lineLength: Int, lineSeparator: ByteArray): ByteBuffer {
    return Base64.getMimeEncoder(lineLength, lineSeparator).encode(ByteBuffer.wrap(this.toByteArray(Charset.forName("UTF-8"))))
}

fun ByteBuffer.mimeEncodeToBuffer(lineLength: Int, lineSeparator: ByteArray): ByteBuffer {
    return Base64.getMimeEncoder(lineLength, lineSeparator).encode(this)
}


fun ByteArray.decodeToBytes(): ByteArray {
    return Base64.getDecoder().decode(this)
}

fun String.decodeToBytes(): ByteArray {
    return Base64.getDecoder().decode(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.decodeToBytes(): ByteArray {
    return Base64.getDecoder().decode(this).array()
}


fun ByteArray.decodeToString(): String {
    return String(Base64.getDecoder().decode(this), Charset.forName("UTF-8"))
}

fun String.decodeToString(): String {
    return String(Base64.getDecoder().decode(this.toByteArray(Charset.forName("UTF-8"))), Charset.forName("UTF-8"))
}

fun ByteBuffer.decodeToString(): String {
    return String(Base64.getDecoder().decode(this).array(), Charset.forName("UTF-8"))
}


fun ByteArray.decodeTo(dst: ByteArray): Int {
    return Base64.getDecoder().decode(this, dst)
}

fun String.decodeTo(dst: ByteArray): Int {
    return Base64.getDecoder().decode(this.toByteArray(Charset.forName("UTF-8")), dst)
}

fun ByteBuffer.decodeTo(dst: ByteArray): Int {
    return Base64.getDecoder().decode(this.array(), dst)
}


fun ByteArray.decodeToBuffer(): ByteBuffer {
    return Base64.getDecoder().decode(ByteBuffer.wrap(this))
}

fun String.decodeToBuffer(): ByteBuffer {
    return Base64.getDecoder().decode(ByteBuffer.wrap(this.toByteArray(Charset.forName("UTF-8"))))
}

fun ByteBuffer.decodeToBuffer(): ByteBuffer {
    return Base64.getDecoder().decode(this)
}


fun ByteArray.urlDecodeToBytes(): ByteArray {
    return Base64.getUrlDecoder().decode(this)
}

fun String.urlDecodeToBytes(): ByteArray {
    return Base64.getUrlDecoder().decode(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.urlDecodeToBytes(): ByteArray {
    return Base64.getUrlDecoder().decode(this).array()
}


fun ByteArray.urlDecodeToString(): String {
    return String(Base64.getUrlDecoder().decode(this), Charset.forName("UTF-8"))
}

fun String.urlDecodeToString(): String {
    return String(Base64.getUrlDecoder().decode(this.toByteArray(Charset.forName("UTF-8"))), Charset.forName("UTF-8"))
}

fun ByteBuffer.urlDecodeToString(): String {
    return String(Base64.getUrlDecoder().decode(this).array(), Charset.forName("UTF-8"))
}


fun ByteArray.urlDecodeTo(dst: ByteArray): Int {
    return Base64.getUrlDecoder().decode(this, dst)
}

fun String.urlDecodeTo(dst: ByteArray): Int {
    return Base64.getUrlDecoder().decode(this.toByteArray(Charset.forName("UTF-8")), dst)
}

fun ByteBuffer.urlDecodeTo(dst: ByteArray): Int {
    return Base64.getUrlDecoder().decode(this.array(), dst)
}


fun ByteArray.urlDecodeToBuffer(): ByteBuffer {
    return Base64.getUrlDecoder().decode(ByteBuffer.wrap(this))
}

fun String.urlDecodeToBuffer(): ByteBuffer {
    return Base64.getUrlDecoder().decode(ByteBuffer.wrap(this.toByteArray(Charset.forName("UTF-8"))))
}

fun ByteBuffer.urlDecodeToBuffer(): ByteBuffer {
    return Base64.getUrlDecoder().decode(this)
}


fun ByteArray.mimeDecodeToBytes(): ByteArray {
    return Base64.getMimeDecoder().decode(this)
}

fun String.mimeDecodeToBytes(): ByteArray {
    return Base64.getMimeDecoder().decode(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.mimeDecodeToBytes(): ByteArray {
    return Base64.getMimeDecoder().decode(this).array()
}


fun ByteArray.mimeDecodeToString(): String {
    return String(Base64.getMimeDecoder().decode(this), Charset.forName("UTF-8"))
}

fun String.mimeDecodeToString(): String {
    return String(Base64.getMimeDecoder().decode(this.toByteArray(Charset.forName("UTF-8"))), Charset.forName("UTF-8"))
}

fun ByteBuffer.mimeDecodeToString(): String {
    return String(Base64.getMimeDecoder().decode(this).array(), Charset.forName("UTF-8"))
}


fun ByteArray.mimeDecodeTo(dst: ByteArray): Int {
    return Base64.getMimeDecoder().decode(this, dst)
}

fun String.mimeDecodeTo(dst: ByteArray): Int {
    return Base64.getMimeDecoder().decode(this.toByteArray(Charset.forName("UTF-8")), dst)
}

fun ByteBuffer.mimeDecodeTo(dst: ByteArray): Int {
    return Base64.getMimeDecoder().decode(this.array(), dst)
}


fun ByteArray.mimeDecodeToBuffer(): ByteBuffer {
    return Base64.getMimeDecoder().decode(ByteBuffer.wrap(this))
}

fun String.mimeDecodeToBuffer(): ByteBuffer {
    return Base64.getMimeDecoder().decode(ByteBuffer.wrap(this.toByteArray(Charset.forName("UTF-8"))))
}

fun ByteBuffer.mimeDecodeToBuffer(): ByteBuffer {
    return Base64.getMimeDecoder().decode(this)
}