package me.panpf.javax.io

import java.io.Closeable
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream


/**
 * CLose
 */
fun Closeable?.safeClose() {
    this ?: return

    if (this is OutputStream) {
        try {
            this.flush()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    try {
        this.close()
    } catch (e: Exception) {
        e.printStackTrace()
    }
}


/**
 * 从给定的字节输入流中读取字节再通过给定的字节输出流写出
 *
 * @param input  给定的字节输入流
 * @param output 给定的字节输出流
 * @throws IOException
 */
@Throws(IOException::class)
fun OutputStream.writeFromInput(input: InputStream, buffer: Int = 1024 * 8) {
    val bytes = ByteArray(buffer)
    var number: Int
    try {
        while (true) {
            number = input.read(bytes)
            if (number != -1) {
                this.write(bytes, 0, number)
            } else {
                break
            }
        }
    } finally {
        this.flush()
    }
}