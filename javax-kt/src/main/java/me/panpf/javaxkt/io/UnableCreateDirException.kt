package me.panpf.javaxkt.io

import java.io.File

class UnableCreateDirException : Exception {
    @Suppress("MemberVisibilityCanBePrivate")
    val file: File

    constructor(file: File) : super(file.path) {
        this.file = file
    }

    @Suppress("unused")
    constructor(file: File, cause: Throwable) : super(file.path, cause) {
        this.file = file
    }
}