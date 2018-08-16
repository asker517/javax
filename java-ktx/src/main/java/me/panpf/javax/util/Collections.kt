package me.panpf.javax.util

/*
 * Collections related extension methods or properties
 */

fun <T> Iterable<T>.groupPair(predicate: (T) -> Boolean): Pair<List<T>?, List<T>?> {
    val map = groupBy(keySelector = { if (predicate(it)) "yes" else "no" })
    return Pair(map["yes"], map["no"])
}