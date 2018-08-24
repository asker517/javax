package me.panpf.javax.util

import java.io.File
import java.io.FileNotFoundException


@Throws(FileNotFoundException::class)
fun requireFileExist(file: File) {
    if (!file.exists()) {
        throw FileNotFoundException(file.path)
    }
}