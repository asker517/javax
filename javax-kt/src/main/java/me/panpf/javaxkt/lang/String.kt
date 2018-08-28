package me.panpf.javaxkt.lang

/*
 * String tool
 */

/**
 * Return true if the specified string contains one of the strings in [params]
 */
fun String.orContains(params: Array<String>): Boolean {
    for (param in params) {
        if (this.contains(param)) {
            return true
        }
    }

    return false
}

/**
 * Return true if the specified string contains all the strings in[params]
 */
fun String.andContains(params: Array<String>): Boolean {
    for (param in params) {
        if (!this.contains(param)) {
            return false
        }
    }

    return true
}