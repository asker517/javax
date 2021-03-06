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

package me.panpf.javaxkt.test.io

import me.panpf.javax.io.CopyListener
import me.panpf.javax.io.Streamx
import me.panpf.javaxkt.io.*
import org.junit.Assert
import org.junit.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.File

class StreamxTest {

    @Test
    fun testSafeClose() {
        ByteArrayInputStream("1234567890".toByteArray()).closeQuietly()
        object : ByteArrayInputStream("1234567890".toByteArray()) {
            override fun close() {
                throw RuntimeException("test")
            }
        }.closeQuietly()

        ByteArrayOutputStream().closeQuietly()
        object : ByteArrayOutputStream() {
            override fun close() {
                throw RuntimeException("test")
            }
        }.closeQuietly()

        null.closeQuietly()
    }

    @Test
    fun testReadClose() {
        val file = File("/tmp/testReadClose.txt")
        val content = "abcdefg\nhijklmn\nopqrst\nuvwxyz"
        file.writeText(content)
        try {
            Assert.assertEquals(String(file.inputStream().readBytesClose(Streamx.DEFAULT_BUFFER_SIZE)), content)
            Assert.assertEquals(String(file.inputStream().readBytesClose()), content)
            Assert.assertEquals(file.reader().readTextClose(), content)

            Assert.assertEquals(String(file.inputStream().readBytesCloseQuietly(Streamx.DEFAULT_BUFFER_SIZE)), content)
            Assert.assertEquals(String(file.inputStream().readBytesCloseQuietly()), content)
            Assert.assertEquals(file.reader().readTextCloseQuietly(), content)
        } finally {
            file.deleteRecursively()
        }
    }

    @Test
    fun testCopyTo() {
        var inputStream = "1234567890".byteInputStream()
        var outputStream = ByteArrayOutputStream()
        try {
            inputStream.copyTo(outputStream, 1024 * 4, CopyListener { })
        } finally {
            inputStream.closeQuietly()
            outputStream.closeQuietly()
        }

        inputStream = "1234567890".byteInputStream()
        outputStream = ByteArrayOutputStream()
        try {
            inputStream.copyTo(outputStream, CopyListener { })
        } finally {
            inputStream.closeQuietly()
            outputStream.closeQuietly()
        }

        inputStream = "1234567890".byteInputStream()
        outputStream = ByteArrayOutputStream()
        try {
            inputStream.reader().copyTo(outputStream.writer(), 1024 * 4, CopyListener { })
        } finally {
            inputStream.closeQuietly()
            outputStream.closeQuietly()
        }

        inputStream = "1234567890".byteInputStream()
        outputStream = ByteArrayOutputStream()
        try {
            inputStream.reader().copyTo(outputStream.writer(), CopyListener { })
        } finally {
            inputStream.closeQuietly()
            outputStream.closeQuietly()
        }
    }
}