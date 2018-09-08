package me.panpf.javaxkt.util

import java.io.File
import java.io.FileNotFoundException


@Throws(FileNotFoundException::class)
fun File.requireExist() {
    if (!this.exists()) {
        throw FileNotFoundException(this.path)
    }
}

fun File.requireIsDir() {
    if (!this.isDirectory) {
        throw IllegalArgumentException("Must be a directory： " + this.path)
    }
}

fun File.requireIsFile() {
    if (!this.isFile) {
        throw IllegalArgumentException("Must be a file： " + this.path)
    }
}


fun Byte.checkInRange(minValue: Byte, maxValue: Byte) {
    if (this < minValue || this > maxValue) {
        val message = String.format("value %d must be >= %d && <= %d", this, minValue, maxValue)
        throw IllegalArgumentException(message)
    }
}

fun Short.checkInRange(minValue: Short, maxValue: Short) {
    if (this < minValue || this > maxValue) {
        val message = String.format("value %d must be >= %d && <= %d", this, minValue, maxValue)
        throw IllegalArgumentException(message)
    }
}

fun Int.checkInRange(minValue: Int, maxValue: Int) {
    if (this < minValue || this > maxValue) {
        val message = String.format("value %d must be >= %d && <= %d", this, minValue, maxValue)
        throw IllegalArgumentException(message)
    }
}

fun Long.checkInRange(minValue: Long, maxValue: Long) {
    if (this < minValue || this > maxValue) {
        val message = String.format("value %d must be >= %d && <= %d", this, minValue, maxValue)
        throw IllegalArgumentException(message)
    }
}

fun Float.checkInRange(minValue: Float, maxValue: Float) {
    if (this < minValue || this > maxValue) {
        val message = String.format("value %s must be >= %s && <= %s", this, minValue, maxValue)
        throw IllegalArgumentException(message)
    }
}

fun Double.checkInRange(minValue: Double, maxValue: Double) {
    if (this < minValue || this > maxValue) {
        val message = String.format("value %s must be >= %s && <= %s", this, minValue, maxValue)
        throw IllegalArgumentException(message)
    }
}

fun Byte.checkNotInRange(minValue: Byte, maxValue: Byte) {
    if (this in minValue..maxValue) {
        val message = String.format("value %d must be < %d || > %d", this, minValue, maxValue)
        throw IllegalArgumentException(message)
    }
}

fun Short.checkNotInRange(minValue: Short, maxValue: Short) {
    if (this in minValue..maxValue) {
        val message = String.format("value %d must be < %d || > %d", this, minValue, maxValue)
        throw IllegalArgumentException(message)
    }
}

fun Int.checkNotInRange(minValue: Int, maxValue: Int) {
    if (this in minValue..maxValue) {
        val message = String.format("value %d must be < %d || > %d", this, minValue, maxValue)
        throw IllegalArgumentException(message)
    }
}

fun Long.checkNotInRange(minValue: Long, maxValue: Long) {
    if (this in minValue..maxValue) {
        val message = String.format("value %d must be < %d || > %d", this, minValue, maxValue)
        throw IllegalArgumentException(message)
    }
}

fun Float.checkNotInRange(minValue: Float, maxValue: Float) {
    if (this in minValue..maxValue) {
        val message = String.format("value %s must be < %s || > %s", this, minValue, maxValue)
        throw IllegalArgumentException(message)
    }
}

fun Double.checkNotInRange(minValue: Double, maxValue: Double) {
    if (this in minValue..maxValue) {
        val message = String.format("value %s must be < %s || > %s", this, minValue, maxValue)
        throw IllegalArgumentException(message)
    }
}