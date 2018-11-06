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
import me.panpf.javax.io.IOStreamx
import me.panpf.javax.lang.Charx
import me.panpf.javax.util.Regexx
import org.junit.Assert
import org.junit.Test

import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.File
import java.net.URL

class IOStreamxTest {

    @Test
    fun testSafeClose() {
        IOStreamx.safeClose(ByteArrayInputStream("1234567890".toByteArray()))
        IOStreamx.safeClose(object : ByteArrayInputStream("1234567890".toByteArray()) {
            override fun close() {
                throw RuntimeException("test")
            }
        })

        IOStreamx.safeClose(ByteArrayOutputStream())
        IOStreamx.safeClose(object : ByteArrayOutputStream() {
            override fun close() {
                throw RuntimeException("test")
            }
        })

        IOStreamx.safeClose(null)
    }

    @Test
    fun testInputStream() {
        IOStreamx.safeClose(IOStreamx.inputStream("1234567890".toByteArray()))
        IOStreamx.safeClose(IOStreamx.inputStream("1234567890".toByteArray(), 0, 5))

        IOStreamx.safeClose(IOStreamx.byteInputStream("1234567890", Charx.UTF_8))
        IOStreamx.safeClose(IOStreamx.byteInputStream("1234567890"))

        IOStreamx.safeClose(IOStreamx.reader(IOStreamx.byteInputStream("1234567890"), Charx.UTF_8))
        IOStreamx.safeClose(IOStreamx.reader(IOStreamx.byteInputStream("1234567890")))
        IOStreamx.safeClose(IOStreamx.reader("1234567890"))

        IOStreamx.safeClose(IOStreamx.buffered(IOStreamx.byteInputStream("1234567890"), IOStreamx.DEFAULT_BUFFER_SIZE))
        IOStreamx.safeClose(IOStreamx.buffered(IOStreamx.byteInputStream("1234567890")))
        IOStreamx.safeClose(IOStreamx.buffered(IOStreamx.reader("1234567890"), IOStreamx.DEFAULT_BUFFER_SIZE))
        IOStreamx.safeClose(IOStreamx.buffered(IOStreamx.reader("1234567890")))

        IOStreamx.safeClose(IOStreamx.bufferedReader(IOStreamx.byteInputStream("1234567890"), Charx.UTF_8, IOStreamx.DEFAULT_BUFFER_SIZE))
        IOStreamx.safeClose(IOStreamx.bufferedReader(IOStreamx.byteInputStream("1234567890"), IOStreamx.DEFAULT_BUFFER_SIZE))
        IOStreamx.safeClose(IOStreamx.bufferedReader(IOStreamx.byteInputStream("1234567890"), Charx.UTF_8))
        IOStreamx.safeClose(IOStreamx.bufferedReader(IOStreamx.byteInputStream("1234567890")))
    }

    @Test
    fun testRead() {
        val file = File("/tmp/testIORead.txt")
        val content = "abcdefg\nhijklmn\nopqrst\nuvwxyz"
        Filex.writeText(file, content)
        try {
            Assert.assertEquals(String(IOStreamx.readBytes(Filex.inputStream(file), IOStreamx.DEFAULT_BUFFER_SIZE)), content)
            Assert.assertEquals(String(IOStreamx.readBytes(Filex.inputStream(file))), content)
            Assert.assertEquals(IOStreamx.readText(Filex.reader(file)), content)

            val resultBytes = IOStreamx.readBytes(URL("http://pv.sohu.com/cityjson"))
            Assert.assertTrue(Regexx.find(Regexx.IPV4, String(resultBytes)))

            val result = IOStreamx.readText(URL("http://pv.sohu.com/cityjson"), Charx.UTF_8)
            Assert.assertTrue(Regexx.find(Regexx.IPV4, result))

            val result2 = IOStreamx.readText(URL("http://pv.sohu.com/cityjson"))
            Assert.assertTrue(Regexx.find(Regexx.IPV4, result2))

            Assert.assertEquals(StringBuilder().apply {
                IOStreamx.readLines(Filex.reader(file)).forEach { lineString ->
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
                IOStreamx.lineSequence(Filex.bufferedReader(file)).forEach { lineString ->
                    if (length > 0) append("\n")
                    append(lineString)
                }
            }.toString(), content)

            Assert.assertEquals(StringBuilder().apply {
                IOStreamx.useLines(Filex.reader(file)) { sequence ->
                    sequence.forEach { lineString ->
                        if (length > 0) append("\n")
                        append(lineString)
                    }
                }
            }.toString(), content)

            Assert.assertEquals(StringBuilder().apply {
                IOStreamx.forEachLine(Filex.reader(file)) { lineString ->
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
        IOStreamx.safeClose(IOStreamx.writer(ByteArrayOutputStream(), Charx.UTF_8))
        IOStreamx.safeClose(IOStreamx.writer(ByteArrayOutputStream()))

        IOStreamx.safeClose(IOStreamx.buffered(ByteArrayOutputStream(), 1024 * 4))
        IOStreamx.safeClose(IOStreamx.buffered(ByteArrayOutputStream()))

        IOStreamx.safeClose(IOStreamx.buffered(IOStreamx.writer(ByteArrayOutputStream()), 1024 * 4))
        IOStreamx.safeClose(IOStreamx.buffered(IOStreamx.writer(ByteArrayOutputStream())))

        IOStreamx.safeClose(IOStreamx.bufferedWriter(ByteArrayOutputStream(), Charx.UTF_8, 1024 * 4))
        IOStreamx.safeClose(IOStreamx.bufferedWriter(ByteArrayOutputStream(), Charx.UTF_8))
        IOStreamx.safeClose(IOStreamx.bufferedWriter(ByteArrayOutputStream(), 1024 * 4))
        IOStreamx.safeClose(IOStreamx.bufferedWriter(ByteArrayOutputStream()))
    }

    @Test
    fun testCopyTo() {
        var inputStream = IOStreamx.byteInputStream("1234567890")
        var outputStream = ByteArrayOutputStream()
        try {
            IOStreamx.copyTo(inputStream, outputStream, 1024 * 4) {}
        } finally {
            IOStreamx.safeClose(inputStream)
            IOStreamx.safeClose(outputStream)
        }

        inputStream = IOStreamx.byteInputStream("1234567890")
        outputStream = ByteArrayOutputStream()
        try {
            IOStreamx.copyTo(inputStream, outputStream, 1024 * 4)
        } finally {
            IOStreamx.safeClose(inputStream)
            IOStreamx.safeClose(outputStream)
        }

        inputStream = IOStreamx.byteInputStream("1234567890")
        outputStream = ByteArrayOutputStream()
        try {
            IOStreamx.copyTo(inputStream, outputStream) {}
        } finally {
            IOStreamx.safeClose(inputStream)
            IOStreamx.safeClose(outputStream)
        }

        inputStream = IOStreamx.byteInputStream("1234567890")
        outputStream = ByteArrayOutputStream()
        try {
            IOStreamx.copyTo(inputStream, outputStream)
        } finally {
            IOStreamx.safeClose(inputStream)
            IOStreamx.safeClose(outputStream)
        }

        inputStream = IOStreamx.byteInputStream("1234567890")
        outputStream = ByteArrayOutputStream()
        try {
            IOStreamx.copyTo(IOStreamx.reader(inputStream), IOStreamx.writer(outputStream), 1024 * 4) {}
        } finally {
            IOStreamx.safeClose(inputStream)
            IOStreamx.safeClose(outputStream)
        }

        inputStream = IOStreamx.byteInputStream("1234567890")
        outputStream = ByteArrayOutputStream()
        try {
            IOStreamx.copyTo(IOStreamx.reader(inputStream), IOStreamx.writer(outputStream), 1024 * 4)
        } finally {
            IOStreamx.safeClose(inputStream)
            IOStreamx.safeClose(outputStream)
        }

        inputStream = IOStreamx.byteInputStream("1234567890")
        outputStream = ByteArrayOutputStream()
        try {
            IOStreamx.copyTo(IOStreamx.reader(inputStream), IOStreamx.writer(outputStream)) {}
        } finally {
            IOStreamx.safeClose(inputStream)
            IOStreamx.safeClose(outputStream)
        }

        inputStream = IOStreamx.byteInputStream("1234567890")
        outputStream = ByteArrayOutputStream()
        try {
            IOStreamx.copyTo(IOStreamx.reader(inputStream), IOStreamx.writer(outputStream))
        } finally {
            IOStreamx.safeClose(inputStream)
            IOStreamx.safeClose(outputStream)
        }
    }
}
