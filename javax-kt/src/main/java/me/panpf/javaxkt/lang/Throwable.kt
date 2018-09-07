package me.panpf.javaxkt.lang

import java.io.ByteArrayOutputStream
import java.io.PrintStream


fun Throwable.stackTraceToString(): String {
    val arrayOutputStream = ByteArrayOutputStream()
    val printWriter = PrintStream(arrayOutputStream)
    this.printStackTrace(printWriter)
    return String(arrayOutputStream.toByteArray())
}
