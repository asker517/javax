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

package me.panpf.javaxkt.util

import java.nio.ByteBuffer
import java.nio.charset.Charset

/*
 * Base64 tool method
 */


fun ByteArray.base64EncodeToString(): String {
    return Base64.getEncoder().encodeToString(this)
}

fun String.base64EncodeToString(): String {
    return Base64.getEncoder().encodeToString(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.base64EncodeToString(): String {
    return Base64.getEncoder().encodeToString(this.array())
}


fun ByteArray.base64EncodeToBytes(): ByteArray {
    return Base64.getEncoder().encode(this)
}

fun String.base64EncodeToBytes(): ByteArray {
    return Base64.getEncoder().encode(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.base64EncodeToBytes(): ByteArray {
    return Base64.getEncoder().encode(this.array())
}


fun ByteArray.base64EncodeTo(dst: ByteArray): Int {
    return Base64.getEncoder().encode(this, dst)
}

fun String.base64EncodeTo(dst: ByteArray): Int {
    return Base64.getEncoder().encode(this.toByteArray(Charset.forName("UTF-8")), dst)
}

fun ByteBuffer.base64EncodeTo(dst: ByteArray): Int {
    return Base64.getEncoder().encode(this.array(), dst)
}


fun ByteArray.base64EncodeToBuffer(): ByteBuffer {
    return Base64.getEncoder().encode(ByteBuffer.wrap(this))
}

fun String.base64EncodeToBuffer(): ByteBuffer {
    return Base64.getEncoder().encode(ByteBuffer.wrap(this.toByteArray(Charset.forName("UTF-8"))))
}

fun ByteBuffer.base64EncodeToBuffer(): ByteBuffer {
    return Base64.getEncoder().encode(this)
}


fun ByteArray.base64UrlEncodeToString(): String {
    return Base64.getUrlEncoder().encodeToString(this)
}

fun String.base64UrlEncodeToString(): String {
    return Base64.getUrlEncoder().encodeToString(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.base64UrlEncodeToString(): String {
    return Base64.getUrlEncoder().encodeToString(this.array())
}


fun ByteArray.base64UrlEncodeToBytes(): ByteArray {
    return Base64.getUrlEncoder().encode(this)
}

fun String.base64UrlEncodeToBytes(): ByteArray {
    return Base64.getUrlEncoder().encode(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.base64UrlEncodeToBytes(): ByteArray {
    return Base64.getUrlEncoder().encode(this.array())
}


fun ByteArray.base64UrlEncodeTo(dst: ByteArray): Int {
    return Base64.getUrlEncoder().encode(this, dst)
}

fun String.base64UrlEncodeTo(dst: ByteArray): Int {
    return Base64.getUrlEncoder().encode(this.toByteArray(Charset.forName("UTF-8")), dst)
}

fun ByteBuffer.base64UrlEncodeTo(dst: ByteArray): Int {
    return Base64.getUrlEncoder().encode(this.array(), dst)
}


fun ByteArray.base64UrlEncodeToBuffer(): ByteBuffer {
    return Base64.getUrlEncoder().encode(ByteBuffer.wrap(this))
}

fun String.base64UrlEncodeToBuffer(): ByteBuffer {
    return Base64.getUrlEncoder().encode(ByteBuffer.wrap(this.toByteArray(Charset.forName("UTF-8"))))
}

fun ByteBuffer.base64UrlEncodeToBuffer(): ByteBuffer {
    return Base64.getUrlEncoder().encode(this)
}


fun ByteArray.base64MimeEncodeToString(): String {
    return Base64.getMimeEncoder().encodeToString(this)
}

fun String.base64MimeEncodeToString(): String {
    return Base64.getMimeEncoder().encodeToString(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.base64MimeEncodeToString(): String {
    return Base64.getMimeEncoder().encodeToString(this.array())
}


fun ByteArray.base64MimeEncodeToBytes(): ByteArray {
    return Base64.getMimeEncoder().encode(this)
}

fun String.base64MimeEncodeToBytes(): ByteArray {
    return Base64.getMimeEncoder().encode(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.base64MimeEncodeToBytes(): ByteArray {
    return Base64.getMimeEncoder().encode(this.array())
}


fun ByteArray.base64MimeEncodeTo(dst: ByteArray): Int {
    return Base64.getMimeEncoder().encode(this, dst)
}

fun String.base64MimeEncodeTo(dst: ByteArray): Int {
    return Base64.getMimeEncoder().encode(this.toByteArray(Charset.forName("UTF-8")), dst)
}

fun ByteBuffer.base64MimeEncodeTo(dst: ByteArray): Int {
    return Base64.getMimeEncoder().encode(this.array(), dst)
}


fun ByteArray.base64MimeEncodeToBuffer(): ByteBuffer {
    return Base64.getMimeEncoder().encode(ByteBuffer.wrap(this))
}

fun String.base64MimeEncodeToBuffer(): ByteBuffer {
    return Base64.getMimeEncoder().encode(ByteBuffer.wrap(this.toByteArray(Charset.forName("UTF-8"))))
}

fun ByteBuffer.base64MimeEncodeToBuffer(): ByteBuffer {
    return Base64.getMimeEncoder().encode(this)
}


fun ByteArray.base64MimeEncodeToString(lineLength: Int, lineSeparator: ByteArray): String {
    return Base64.getMimeEncoder(lineLength, lineSeparator).encodeToString(this)
}

fun String.base64MimeEncodeToString(lineLength: Int, lineSeparator: ByteArray): String {
    return Base64.getMimeEncoder(lineLength, lineSeparator).encodeToString(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.base64MimeEncodeToString(lineLength: Int, lineSeparator: ByteArray): String {
    return Base64.getMimeEncoder(lineLength, lineSeparator).encodeToString(this.array())
}


fun ByteArray.base64MimeEncodeToBytes(lineLength: Int, lineSeparator: ByteArray): ByteArray {
    return Base64.getMimeEncoder(lineLength, lineSeparator).encode(this)
}

fun String.base64MimeEncodeToBytes(lineLength: Int, lineSeparator: ByteArray): ByteArray {
    return Base64.getMimeEncoder(lineLength, lineSeparator).encode(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.base64MimeEncodeToBytes(lineLength: Int, lineSeparator: ByteArray): ByteArray {
    return Base64.getMimeEncoder(lineLength, lineSeparator).encode(this.array())
}


fun ByteArray.base64MimeEncodeTo(lineLength: Int, lineSeparator: ByteArray, dst: ByteArray): Int {
    return Base64.getMimeEncoder(lineLength, lineSeparator).encode(this, dst)
}

fun String.base64MimeEncodeTo(lineLength: Int, lineSeparator: ByteArray, dst: ByteArray): Int {
    return Base64.getMimeEncoder(lineLength, lineSeparator).encode(this.toByteArray(Charset.forName("UTF-8")), dst)
}

fun ByteBuffer.base64MimeEncodeTo(lineLength: Int, lineSeparator: ByteArray, dst: ByteArray): Int {
    return Base64.getMimeEncoder(lineLength, lineSeparator).encode(this.array(), dst)
}


fun ByteArray.base64MimeEncodeToBuffer(lineLength: Int, lineSeparator: ByteArray): ByteBuffer {
    return Base64.getMimeEncoder(lineLength, lineSeparator).encode(ByteBuffer.wrap(this))
}

fun String.base64MimeEncodeToBuffer(lineLength: Int, lineSeparator: ByteArray): ByteBuffer {
    return Base64.getMimeEncoder(lineLength, lineSeparator).encode(ByteBuffer.wrap(this.toByteArray(Charset.forName("UTF-8"))))
}

fun ByteBuffer.base64MimeEncodeToBuffer(lineLength: Int, lineSeparator: ByteArray): ByteBuffer {
    return Base64.getMimeEncoder(lineLength, lineSeparator).encode(this)
}


fun ByteArray.base64DecodeToBytes(): ByteArray {
    return Base64.getDecoder().decode(this)
}

fun String.base64DecodeToBytes(): ByteArray {
    return Base64.getDecoder().decode(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.base64DecodeToBytes(): ByteArray {
    return Base64.getDecoder().decode(this).array()
}


fun ByteArray.base64DecodeToString(): String {
    return String(Base64.getDecoder().decode(this), Charset.forName("UTF-8"))
}

fun String.base64DecodeToString(): String {
    return String(Base64.getDecoder().decode(this.toByteArray(Charset.forName("UTF-8"))), Charset.forName("UTF-8"))
}

fun ByteBuffer.base64DecodeToString(): String {
    return String(Base64.getDecoder().decode(this).array(), Charset.forName("UTF-8"))
}


fun ByteArray.base64DecodeTo(dst: ByteArray): Int {
    return Base64.getDecoder().decode(this, dst)
}

fun String.base64DecodeTo(dst: ByteArray): Int {
    return Base64.getDecoder().decode(this.toByteArray(Charset.forName("UTF-8")), dst)
}

fun ByteBuffer.base64DecodeTo(dst: ByteArray): Int {
    return Base64.getDecoder().decode(this.array(), dst)
}


fun ByteArray.base64DecodeToBuffer(): ByteBuffer {
    return Base64.getDecoder().decode(ByteBuffer.wrap(this))
}

fun String.base64DecodeToBuffer(): ByteBuffer {
    return Base64.getDecoder().decode(ByteBuffer.wrap(this.toByteArray(Charset.forName("UTF-8"))))
}

fun ByteBuffer.base64DecodeToBuffer(): ByteBuffer {
    return Base64.getDecoder().decode(this)
}


fun ByteArray.base64UrlDecodeToBytes(): ByteArray {
    return Base64.getUrlDecoder().decode(this)
}

fun String.base64UrlDecodeToBytes(): ByteArray {
    return Base64.getUrlDecoder().decode(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.base64UrlDecodeToBytes(): ByteArray {
    return Base64.getUrlDecoder().decode(this).array()
}


fun ByteArray.base64UrlDecodeToString(): String {
    return String(Base64.getUrlDecoder().decode(this), Charset.forName("UTF-8"))
}

fun String.base64UrlDecodeToString(): String {
    return String(Base64.getUrlDecoder().decode(this.toByteArray(Charset.forName("UTF-8"))), Charset.forName("UTF-8"))
}

fun ByteBuffer.base64UrlDecodeToString(): String {
    return String(Base64.getUrlDecoder().decode(this).array(), Charset.forName("UTF-8"))
}


fun ByteArray.base64UrlDecodeTo(dst: ByteArray): Int {
    return Base64.getUrlDecoder().decode(this, dst)
}

fun String.base64UrlDecodeTo(dst: ByteArray): Int {
    return Base64.getUrlDecoder().decode(this.toByteArray(Charset.forName("UTF-8")), dst)
}

fun ByteBuffer.base64UrlDecodeTo(dst: ByteArray): Int {
    return Base64.getUrlDecoder().decode(this.array(), dst)
}


fun ByteArray.base64UrlDecodeToBuffer(): ByteBuffer {
    return Base64.getUrlDecoder().decode(ByteBuffer.wrap(this))
}

fun String.base64UrlDecodeToBuffer(): ByteBuffer {
    return Base64.getUrlDecoder().decode(ByteBuffer.wrap(this.toByteArray(Charset.forName("UTF-8"))))
}

fun ByteBuffer.base64UrlDecodeToBuffer(): ByteBuffer {
    return Base64.getUrlDecoder().decode(this)
}


fun ByteArray.base64MimeDecodeToBytes(): ByteArray {
    return Base64.getMimeDecoder().decode(this)
}

fun String.base64MimeDecodeToBytes(): ByteArray {
    return Base64.getMimeDecoder().decode(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.base64MimeDecodeToBytes(): ByteArray {
    return Base64.getMimeDecoder().decode(this).array()
}


fun ByteArray.base64MimeDecodeToString(): String {
    return String(Base64.getMimeDecoder().decode(this), Charset.forName("UTF-8"))
}

fun String.base64MimeDecodeToString(): String {
    return String(Base64.getMimeDecoder().decode(this.toByteArray(Charset.forName("UTF-8"))), Charset.forName("UTF-8"))
}

fun ByteBuffer.base64MimeDecodeToString(): String {
    return String(Base64.getMimeDecoder().decode(this).array(), Charset.forName("UTF-8"))
}


fun ByteArray.base64MimeDecodeTo(dst: ByteArray): Int {
    return Base64.getMimeDecoder().decode(this, dst)
}

fun String.base64MimeDecodeTo(dst: ByteArray): Int {
    return Base64.getMimeDecoder().decode(this.toByteArray(Charset.forName("UTF-8")), dst)
}

fun ByteBuffer.base64MimeDecodeTo(dst: ByteArray): Int {
    return Base64.getMimeDecoder().decode(this.array(), dst)
}


fun ByteArray.base64MimeDecodeToBuffer(): ByteBuffer {
    return Base64.getMimeDecoder().decode(ByteBuffer.wrap(this))
}

fun String.base64MimeDecodeToBuffer(): ByteBuffer {
    return Base64.getMimeDecoder().decode(ByteBuffer.wrap(this.toByteArray(Charset.forName("UTF-8"))))
}

fun ByteBuffer.base64MimeDecodeToBuffer(): ByteBuffer {
    return Base64.getMimeDecoder().decode(this)
}