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

@file:Suppress("NOTHING_TO_INLINE")

package me.panpf.javaxkt.util

import me.panpf.javax.util.Base64x
import java.nio.ByteBuffer


/*
 * Base64 related extension methods or properties
 */


inline fun ByteArray.base64EncodeToString(): String = Base64x.encodeToString(this)

inline fun String.base64EncodeToString(): String = Base64x.encodeToString(this)

inline fun ByteBuffer.base64EncodeToString(): String = Base64x.encodeToString(this)


inline fun ByteArray.base64EncodeToBytes(): ByteArray = Base64x.encodeToBytes(this)

inline fun String.base64EncodeToBytes(): ByteArray = Base64x.encodeToBytes(this)

inline fun ByteBuffer.base64EncodeToBytes(): ByteArray = Base64x.encodeToBytes(this)


inline fun ByteArray.base64EncodeTo(dst: ByteArray): Int = Base64x.encodeTo(this, dst)

inline fun String.base64EncodeTo(dst: ByteArray): Int = Base64x.encodeTo(this, dst)

inline fun ByteBuffer.base64EncodeTo(dst: ByteArray): Int = Base64x.encodeTo(this, dst)


inline fun ByteArray.base64EncodeToBuffer(): ByteBuffer = Base64x.encodeToBuffer(this)

inline fun String.base64EncodeToBuffer(): ByteBuffer = Base64x.encodeToBuffer(this)

inline fun ByteBuffer.base64EncodeToBuffer(): ByteBuffer = Base64x.encodeToBuffer(this)


inline fun ByteArray.base64UrlEncodeToString(): String = Base64x.urlEncodeToString(this)

inline fun String.base64UrlEncodeToString(): String = Base64x.urlEncodeToString(this)

inline fun ByteBuffer.base64UrlEncodeToString(): String = Base64x.urlEncodeToString(this)


inline fun ByteArray.base64UrlEncodeToBytes(): ByteArray = Base64x.urlEncodeToBytes(this)

inline fun String.base64UrlEncodeToBytes(): ByteArray = Base64x.urlEncodeToBytes(this)

inline fun ByteBuffer.base64UrlEncodeToBytes(): ByteArray = Base64x.urlEncodeToBytes(this)


inline fun ByteArray.base64UrlEncodeTo(dst: ByteArray): Int = Base64x.urlEncodeTo(this, dst)

inline fun String.base64UrlEncodeTo(dst: ByteArray): Int = Base64x.urlEncodeTo(this, dst)

inline fun ByteBuffer.base64UrlEncodeTo(dst: ByteArray): Int = Base64x.urlEncodeTo(this, dst)


inline fun ByteArray.base64UrlEncodeToBuffer(): ByteBuffer = Base64x.urlEncodeToBuffer(this)

inline fun String.base64UrlEncodeToBuffer(): ByteBuffer = Base64x.urlEncodeToBuffer(this)

inline fun ByteBuffer.base64UrlEncodeToBuffer(): ByteBuffer = Base64x.urlEncodeToBuffer(this)


inline fun ByteArray.base64MimeEncodeToString(): String = Base64x.mimeEncodeToString(this)

inline fun String.base64MimeEncodeToString(): String = Base64x.mimeEncodeToString(this)

inline fun ByteBuffer.base64MimeEncodeToString(): String = Base64x.mimeEncodeToString(this)


inline fun ByteArray.base64MimeEncodeToBytes(): ByteArray = Base64x.mimeEncodeToBytes(this)

inline fun String.base64MimeEncodeToBytes(): ByteArray = Base64x.mimeEncodeToBytes(this)

inline fun ByteBuffer.base64MimeEncodeToBytes(): ByteArray = Base64x.mimeEncodeToBytes(this)


inline fun ByteArray.base64MimeEncodeTo(dst: ByteArray): Int = Base64x.mimeEncodeTo(this, dst)

inline fun String.base64MimeEncodeTo(dst: ByteArray): Int = Base64x.mimeEncodeTo(this, dst)

inline fun ByteBuffer.base64MimeEncodeTo(dst: ByteArray): Int = Base64x.mimeEncodeTo(this, dst)


inline fun ByteArray.base64MimeEncodeToBuffer(): ByteBuffer = Base64x.mimeEncodeToBuffer(this)

inline fun String.base64MimeEncodeToBuffer(): ByteBuffer = Base64x.mimeEncodeToBuffer(this)

inline fun ByteBuffer.base64MimeEncodeToBuffer(): ByteBuffer = Base64x.mimeEncodeToBuffer(this)


inline fun ByteArray.base64MimeEncodeToString(lineLength: Int, lineSeparator: ByteArray): String = Base64x.mimeEncodeToString(lineLength, lineSeparator, this)

inline fun String.base64MimeEncodeToString(lineLength: Int, lineSeparator: ByteArray): String = Base64x.mimeEncodeToString(lineLength, lineSeparator, this)

inline fun ByteBuffer.base64MimeEncodeToString(lineLength: Int, lineSeparator: ByteArray): String = Base64x.mimeEncodeToString(lineLength, lineSeparator, this)


inline fun ByteArray.base64MimeEncodeToBytes(lineLength: Int, lineSeparator: ByteArray): ByteArray = Base64x.mimeEncodeToBytes(lineLength, lineSeparator, this)

inline fun String.base64MimeEncodeToBytes(lineLength: Int, lineSeparator: ByteArray): ByteArray = Base64x.mimeEncodeToBytes(lineLength, lineSeparator, this)

inline fun ByteBuffer.base64MimeEncodeToBytes(lineLength: Int, lineSeparator: ByteArray): ByteArray = Base64x.mimeEncodeToBytes(lineLength, lineSeparator, this)


inline fun ByteArray.base64MimeEncodeTo(lineLength: Int, lineSeparator: ByteArray, dst: ByteArray): Int = Base64x.mimeEncodeTo(lineLength, lineSeparator, this, dst)

inline fun String.base64MimeEncodeTo(lineLength: Int, lineSeparator: ByteArray, dst: ByteArray): Int = Base64x.mimeEncodeTo(lineLength, lineSeparator, this, dst)

inline fun ByteBuffer.base64MimeEncodeTo(lineLength: Int, lineSeparator: ByteArray, dst: ByteArray): Int = Base64x.mimeEncodeTo(lineLength, lineSeparator, this, dst)


inline fun ByteArray.base64MimeEncodeToBuffer(lineLength: Int, lineSeparator: ByteArray): ByteBuffer = Base64x.mimeEncodeToBuffer(lineLength, lineSeparator, this)

inline fun String.base64MimeEncodeToBuffer(lineLength: Int, lineSeparator: ByteArray): ByteBuffer = Base64x.mimeEncodeToBuffer(lineLength, lineSeparator, this)

inline fun ByteBuffer.base64MimeEncodeToBuffer(lineLength: Int, lineSeparator: ByteArray): ByteBuffer = Base64x.mimeEncodeToBuffer(lineLength, lineSeparator, this)


inline fun ByteArray.base64DecodeToBytes(): ByteArray = Base64x.decodeToBytes(this)

inline fun String.base64DecodeToBytes(): ByteArray = Base64x.decodeToBytes(this)

inline fun ByteBuffer.base64DecodeToBytes(): ByteArray = Base64x.decodeToBytes(this)


inline fun ByteArray.base64DecodeToString(): String = Base64x.decodeToString(this)

inline fun String.base64DecodeToString(): String = Base64x.decodeToString(this)

inline fun ByteBuffer.base64DecodeToString(): String = Base64x.decodeToString(this)


inline fun ByteArray.base64DecodeTo(dst: ByteArray): Int = Base64x.decodeTo(this, dst)

inline fun String.base64DecodeTo(dst: ByteArray): Int = Base64x.decodeTo(this, dst)

inline fun ByteBuffer.base64DecodeTo(dst: ByteArray): Int = Base64x.decodeTo(this, dst)


inline fun ByteArray.base64DecodeToBuffer(): ByteBuffer = Base64x.decodeToBuffer(this)

inline fun String.base64DecodeToBuffer(): ByteBuffer = Base64x.decodeToBuffer(this)

inline fun ByteBuffer.base64DecodeToBuffer(): ByteBuffer = Base64x.decodeToBuffer(this)


inline fun ByteArray.base64UrlDecodeToBytes(): ByteArray = Base64x.urlDecodeToBytes(this)

inline fun String.base64UrlDecodeToBytes(): ByteArray = Base64x.urlDecodeToBytes(this)

inline fun ByteBuffer.base64UrlDecodeToBytes(): ByteArray = Base64x.urlDecodeToBytes(this)


inline fun ByteArray.base64UrlDecodeToString(): String = Base64x.urlDecodeToString(this)

inline fun String.base64UrlDecodeToString(): String = Base64x.urlDecodeToString(this)

inline fun ByteBuffer.base64UrlDecodeToString(): String = Base64x.urlDecodeToString(this)


inline fun ByteArray.base64UrlDecodeTo(dst: ByteArray): Int = Base64x.urlDecodeTo(this, dst)

inline fun String.base64UrlDecodeTo(dst: ByteArray): Int = Base64x.urlDecodeTo(this, dst)

inline fun ByteBuffer.base64UrlDecodeTo(dst: ByteArray): Int = Base64x.urlDecodeTo(this, dst)


inline fun ByteArray.base64UrlDecodeToBuffer(): ByteBuffer = Base64x.urlDecodeToBuffer(this)

inline fun String.base64UrlDecodeToBuffer(): ByteBuffer = Base64x.urlDecodeToBuffer(this)

inline fun ByteBuffer.base64UrlDecodeToBuffer(): ByteBuffer = Base64x.urlDecodeToBuffer(this)


inline fun ByteArray.base64MimeDecodeToBytes(): ByteArray = Base64x.mimeDecodeToBytes(this)

inline fun String.base64MimeDecodeToBytes(): ByteArray = Base64x.mimeDecodeToBytes(this)

inline fun ByteBuffer.base64MimeDecodeToBytes(): ByteArray = Base64x.mimeDecodeToBytes(this)


inline fun ByteArray.base64MimeDecodeToString(): String = Base64x.mimeDecodeToString(this)

inline fun String.base64MimeDecodeToString(): String = Base64x.mimeDecodeToString(this)

inline fun ByteBuffer.base64MimeDecodeToString(): String = Base64x.mimeDecodeToString(this)


inline fun ByteArray.base64MimeDecodeTo(dst: ByteArray): Int = Base64x.mimeDecodeTo(this, dst)

inline fun String.base64MimeDecodeTo(dst: ByteArray): Int = Base64x.mimeDecodeTo(this, dst)

inline fun ByteBuffer.base64MimeDecodeTo(dst: ByteArray): Int = Base64x.mimeDecodeTo(this, dst)


inline fun ByteArray.base64MimeDecodeToBuffer(): ByteBuffer = Base64x.mimeDecodeToBuffer(this)

inline fun String.base64MimeDecodeToBuffer(): ByteBuffer = Base64x.mimeDecodeToBuffer(this)

inline fun ByteBuffer.base64MimeDecodeToBuffer(): ByteBuffer = Base64x.mimeDecodeToBuffer(this)
