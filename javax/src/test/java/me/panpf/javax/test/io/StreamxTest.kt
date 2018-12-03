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

package me.panpf.javax.test.io

import me.panpf.javax.io.Filex
import me.panpf.javax.io.Streamx
import me.panpf.javax.lang.Charx
import me.panpf.javax.sequences.Sequencex
import me.panpf.javax.util.Action
import me.panpf.javax.util.Regexx
import org.junit.Assert
import org.junit.Test

import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.File
import java.net.URL

class StreamxTest {

    @Test
    fun testSafeClose() {
        Streamx.closeQuietly(ByteArrayInputStream("1234567890".toByteArray()))
        Streamx.closeQuietly(object : ByteArrayInputStream("1234567890".toByteArray()) {
            override fun close() {
                throw RuntimeException("test")
            }
        })

        Streamx.closeQuietly(ByteArrayOutputStream())
        Streamx.closeQuietly(object : ByteArrayOutputStream() {
            override fun close() {
                throw RuntimeException("test")
            }
        })

        Streamx.closeQuietly(null)
    }

    @Test
    fun testReadClose() {
        val file = File("/tmp/testReadClose.txt")
        val content = "abcdefg\nhijklmn\nopqrst\nuvwxyz"
        Filex.writeText(file, content)
        try {
            Assert.assertEquals(String(Streamx.readBytesClose(Filex.inputStream(file), Streamx.DEFAULT_BUFFER_SIZE)), content)
            Assert.assertEquals(String(Streamx.readBytesClose(Filex.inputStream(file))), content)
            Assert.assertEquals(Streamx.readTextClose(Filex.reader(file)), content)

            Assert.assertEquals(String(Streamx.readBytesCloseQuietly(Filex.inputStream(file), Streamx.DEFAULT_BUFFER_SIZE)), content)
            Assert.assertEquals(String(Streamx.readBytesCloseQuietly(Filex.inputStream(file))), content)
            Assert.assertEquals(Streamx.readTextCloseQuietly(Filex.reader(file)), content)
        } finally {
            Filex.deleteRecursively(file)
        }
    }

    @Test
    fun testInputStream() {
        Streamx.closeQuietly(Streamx.inputStream("1234567890".toByteArray()))
        Streamx.closeQuietly(Streamx.inputStream("1234567890".toByteArray(), 0, 5))

        Streamx.closeQuietly(Streamx.byteInputStream("1234567890", Charx.UTF_8))
        Streamx.closeQuietly(Streamx.byteInputStream("1234567890"))

        Streamx.closeQuietly(Streamx.reader(Streamx.byteInputStream("1234567890"), Charx.UTF_8))
        Streamx.closeQuietly(Streamx.reader(Streamx.byteInputStream("1234567890")))
        Streamx.closeQuietly(Streamx.reader("1234567890"))

        Streamx.closeQuietly(Streamx.buffered(Streamx.byteInputStream("1234567890"), Streamx.DEFAULT_BUFFER_SIZE))
        Streamx.closeQuietly(Streamx.buffered(Streamx.byteInputStream("1234567890")))
        Streamx.closeQuietly(Streamx.buffered(Streamx.reader("1234567890"), Streamx.DEFAULT_BUFFER_SIZE))
        Streamx.closeQuietly(Streamx.buffered(Streamx.reader("1234567890")))

        Streamx.closeQuietly(Streamx.bufferedReader(Streamx.byteInputStream("1234567890"), Charx.UTF_8, Streamx.DEFAULT_BUFFER_SIZE))
        Streamx.closeQuietly(Streamx.bufferedReader(Streamx.byteInputStream("1234567890"), Streamx.DEFAULT_BUFFER_SIZE))
        Streamx.closeQuietly(Streamx.bufferedReader(Streamx.byteInputStream("1234567890"), Charx.UTF_8))
        Streamx.closeQuietly(Streamx.bufferedReader(Streamx.byteInputStream("1234567890")))
    }

    @Test
    fun testRead() {
        val file = File("/tmp/testIORead.txt")
        val content = "abcdefg\nhijklmn\nopqrst\nuvwxyz"
        Filex.writeText(file, content)
        try {
            Assert.assertEquals(String(Filex.inputStream(file).use { Streamx.readBytes(it, Streamx.DEFAULT_BUFFER_SIZE) }), content)
            Assert.assertEquals(String(Filex.inputStream(file).use { Streamx.readBytes(it) }), content)
            Assert.assertEquals(Filex.reader(file).use { Streamx.readText(it) }, content)

            val resultBytes = Streamx.readBytes(URL("http://pv.sohu.com/cityjson"))
            Assert.assertTrue(Regexx.find(Regexx.IPV4, String(resultBytes)))

            val result = Streamx.readText(URL("http://pv.sohu.com/cityjson"), Charx.UTF_8)
            Assert.assertTrue(Regexx.find(Regexx.IPV4, result))

            val result2 = Streamx.readText(URL("http://pv.sohu.com/cityjson"))
            Assert.assertTrue(Regexx.find(Regexx.IPV4, result2))

            Assert.assertEquals(StringBuilder().apply {
                Streamx.readLines(Filex.reader(file)).forEach { lineString ->
                    if (length > 0) append("\n")
                    append(lineString)
                }
            }.toString(), content)
        } finally {
            Filex.deleteRecursively(file)
        }
    }

    @Test
    fun testLines() {
        val file = File("/tmp/testIOLines.txt")
        val content = "abcdefg\nhijklmn\nopqrst\nuvwxyz"
        Filex.writeText(file, content)
        try {
            Assert.assertEquals(StringBuilder().apply {
                Sequencex.forEach(Streamx.lineSequence(Filex.bufferedReader(file)), Action{ lineString ->
                    if (length > 0) append("\n")
                    append(lineString)
                })
            }.toString(), content)

            Assert.assertEquals(StringBuilder().apply {
                Streamx.useLines(Filex.reader(file)) { sequence ->
                    Sequencex.forEach(sequence, Action { lineString ->
                        if (length > 0) append("\n")
                        append(lineString)
                    })
                }
            }.toString(), content)

            Assert.assertEquals(StringBuilder().apply {
                Streamx.forEachLine(Filex.reader(file)) { lineString ->
                    if (length > 0) append("\n")
                    append(lineString)
                }
            }.toString(), content)
        } finally {
            Filex.deleteRecursively(file)
        }
    }

    @Test
    fun testOutputStream() {
        Streamx.closeQuietly(Streamx.writer(ByteArrayOutputStream(), Charx.UTF_8))
        Streamx.closeQuietly(Streamx.writer(ByteArrayOutputStream()))

        Streamx.closeQuietly(Streamx.buffered(ByteArrayOutputStream(), 1024 * 4))
        Streamx.closeQuietly(Streamx.buffered(ByteArrayOutputStream()))

        Streamx.closeQuietly(Streamx.buffered(Streamx.writer(ByteArrayOutputStream()), 1024 * 4))
        Streamx.closeQuietly(Streamx.buffered(Streamx.writer(ByteArrayOutputStream())))

        Streamx.closeQuietly(Streamx.bufferedWriter(ByteArrayOutputStream(), Charx.UTF_8, 1024 * 4))
        Streamx.closeQuietly(Streamx.bufferedWriter(ByteArrayOutputStream(), Charx.UTF_8))
        Streamx.closeQuietly(Streamx.bufferedWriter(ByteArrayOutputStream(), 1024 * 4))
        Streamx.closeQuietly(Streamx.bufferedWriter(ByteArrayOutputStream()))
    }

    @Test
    fun testCopyTo() {
        var inputStream = Streamx.byteInputStream("1234567890")
        var outputStream = ByteArrayOutputStream()
        try {
            Streamx.copyTo(inputStream, outputStream, 1024 * 4) {}
        } finally {
            Streamx.closeQuietly(inputStream)
            Streamx.closeQuietly(outputStream)
        }

        inputStream = Streamx.byteInputStream("1234567890")
        outputStream = ByteArrayOutputStream()
        try {
            Streamx.copyTo(inputStream, outputStream, 1024 * 4)
        } finally {
            Streamx.closeQuietly(inputStream)
            Streamx.closeQuietly(outputStream)
        }

        inputStream = Streamx.byteInputStream("1234567890")
        outputStream = ByteArrayOutputStream()
        try {
            Streamx.copyTo(inputStream, outputStream) {}
        } finally {
            Streamx.closeQuietly(inputStream)
            Streamx.closeQuietly(outputStream)
        }

        inputStream = Streamx.byteInputStream("1234567890")
        outputStream = ByteArrayOutputStream()
        try {
            Streamx.copyTo(inputStream, outputStream)
        } finally {
            Streamx.closeQuietly(inputStream)
            Streamx.closeQuietly(outputStream)
        }

        inputStream = Streamx.byteInputStream("1234567890")
        outputStream = ByteArrayOutputStream()
        try {
            Streamx.copyTo(Streamx.reader(inputStream), Streamx.writer(outputStream), 1024 * 4) {}
        } finally {
            Streamx.closeQuietly(inputStream)
            Streamx.closeQuietly(outputStream)
        }

        inputStream = Streamx.byteInputStream("1234567890")
        outputStream = ByteArrayOutputStream()
        try {
            Streamx.copyTo(Streamx.reader(inputStream), Streamx.writer(outputStream), 1024 * 4)
        } finally {
            Streamx.closeQuietly(inputStream)
            Streamx.closeQuietly(outputStream)
        }

        inputStream = Streamx.byteInputStream("1234567890")
        outputStream = ByteArrayOutputStream()
        try {
            Streamx.copyTo(Streamx.reader(inputStream), Streamx.writer(outputStream)) {}
        } finally {
            Streamx.closeQuietly(inputStream)
            Streamx.closeQuietly(outputStream)
        }

        inputStream = Streamx.byteInputStream("1234567890")
        outputStream = ByteArrayOutputStream()
        try {
            Streamx.copyTo(Streamx.reader(inputStream), Streamx.writer(outputStream))
        } finally {
            Streamx.closeQuietly(inputStream)
            Streamx.closeQuietly(outputStream)
        }
    }
}
