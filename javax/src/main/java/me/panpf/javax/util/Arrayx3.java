//package me.panpf.javax.util;
//
//public class Arrayx3 {
//
//
//    /**
//     * Returns the last element.
//     * @throws [NoSuchElementException] if the array is empty.
//     */
//    public fun <T> Array<out T>.last(): T {
//        if (isEmpty())
//            throw NoSuchElementException("Array is empty.")
//        return this[lastIndex]
//    }
//
//    /**
//     * Returns the last element.
//     * @throws [NoSuchElementException] if the array is empty.
//     */
//    public fun ByteArray.last(): Byte {
//        if (isEmpty())
//            throw NoSuchElementException("Array is empty.")
//        return this[lastIndex]
//    }
//
//    /**
//     * Returns the last element.
//     * @throws [NoSuchElementException] if the array is empty.
//     */
//    public fun ShortArray.last(): Short {
//        if (isEmpty())
//            throw NoSuchElementException("Array is empty.")
//        return this[lastIndex]
//    }
//
//    /**
//     * Returns the last element.
//     * @throws [NoSuchElementException] if the array is empty.
//     */
//    public fun IntArray.last(): Int {
//        if (isEmpty())
//            throw NoSuchElementException("Array is empty.")
//        return this[lastIndex]
//    }
//
//    /**
//     * Returns the last element.
//     * @throws [NoSuchElementException] if the array is empty.
//     */
//    public fun LongArray.last(): Long {
//        if (isEmpty())
//            throw NoSuchElementException("Array is empty.")
//        return this[lastIndex]
//    }
//
//    /**
//     * Returns the last element.
//     * @throws [NoSuchElementException] if the array is empty.
//     */
//    public fun FloatArray.last(): Float {
//        if (isEmpty())
//            throw NoSuchElementException("Array is empty.")
//        return this[lastIndex]
//    }
//
//    /**
//     * Returns the last element.
//     * @throws [NoSuchElementException] if the array is empty.
//     */
//    public fun DoubleArray.last(): Double {
//        if (isEmpty())
//            throw NoSuchElementException("Array is empty.")
//        return this[lastIndex]
//    }
//
//    /**
//     * Returns the last element.
//     * @throws [NoSuchElementException] if the array is empty.
//     */
//    public fun BooleanArray.last(): Boolean {
//        if (isEmpty())
//            throw NoSuchElementException("Array is empty.")
//        return this[lastIndex]
//    }
//
//    /**
//     * Returns the last element.
//     * @throws [NoSuchElementException] if the array is empty.
//     */
//    public fun CharArray.last(): Char {
//        if (isEmpty())
//            throw NoSuchElementException("Array is empty.")
//        return this[lastIndex]
//    }
//
//    /**
//     * Returns the last element matching the given [predicate].
//     * @throws [NoSuchElementException] if no such element is found.
//     */
//    public inline fun <T> Array<out T>.last(predicate: (T) -> Boolean): T {
//        for (index in this.indices.reversed()) {
//            val element = this[index]
//            if (predicate(element)) return element
//        }
//        throw NoSuchElementException("Array contains no element matching the predicate.")
//    }
//
//    /**
//     * Returns the last element matching the given [predicate].
//     * @throws [NoSuchElementException] if no such element is found.
//     */
//    public inline fun ByteArray.last(predicate: (Byte) -> Boolean): Byte {
//        for (index in this.indices.reversed()) {
//            val element = this[index]
//            if (predicate(element)) return element
//        }
//        throw NoSuchElementException("Array contains no element matching the predicate.")
//    }
//
//    /**
//     * Returns the last element matching the given [predicate].
//     * @throws [NoSuchElementException] if no such element is found.
//     */
//    public inline fun ShortArray.last(predicate: (Short) -> Boolean): Short {
//        for (index in this.indices.reversed()) {
//            val element = this[index]
//            if (predicate(element)) return element
//        }
//        throw NoSuchElementException("Array contains no element matching the predicate.")
//    }
//
//    /**
//     * Returns the last element matching the given [predicate].
//     * @throws [NoSuchElementException] if no such element is found.
//     */
//    public inline fun IntArray.last(predicate: (Int) -> Boolean): Int {
//        for (index in this.indices.reversed()) {
//            val element = this[index]
//            if (predicate(element)) return element
//        }
//        throw NoSuchElementException("Array contains no element matching the predicate.")
//    }
//
//    /**
//     * Returns the last element matching the given [predicate].
//     * @throws [NoSuchElementException] if no such element is found.
//     */
//    public inline fun LongArray.last(predicate: (Long) -> Boolean): Long {
//        for (index in this.indices.reversed()) {
//            val element = this[index]
//            if (predicate(element)) return element
//        }
//        throw NoSuchElementException("Array contains no element matching the predicate.")
//    }
//
//    /**
//     * Returns the last element matching the given [predicate].
//     * @throws [NoSuchElementException] if no such element is found.
//     */
//    public inline fun FloatArray.last(predicate: (Float) -> Boolean): Float {
//        for (index in this.indices.reversed()) {
//            val element = this[index]
//            if (predicate(element)) return element
//        }
//        throw NoSuchElementException("Array contains no element matching the predicate.")
//    }
//
//    /**
//     * Returns the last element matching the given [predicate].
//     * @throws [NoSuchElementException] if no such element is found.
//     */
//    public inline fun DoubleArray.last(predicate: (Double) -> Boolean): Double {
//        for (index in this.indices.reversed()) {
//            val element = this[index]
//            if (predicate(element)) return element
//        }
//        throw NoSuchElementException("Array contains no element matching the predicate.")
//    }
//
//    /**
//     * Returns the last element matching the given [predicate].
//     * @throws [NoSuchElementException] if no such element is found.
//     */
//    public inline fun BooleanArray.last(predicate: (Boolean) -> Boolean): Boolean {
//        for (index in this.indices.reversed()) {
//            val element = this[index]
//            if (predicate(element)) return element
//        }
//        throw NoSuchElementException("Array contains no element matching the predicate.")
//    }
//
//    /**
//     * Returns the last element matching the given [predicate].
//     * @throws [NoSuchElementException] if no such element is found.
//     */
//    public inline fun CharArray.last(predicate: (Char) -> Boolean): Char {
//        for (index in this.indices.reversed()) {
//            val element = this[index]
//            if (predicate(element)) return element
//        }
//        throw NoSuchElementException("Array contains no element matching the predicate.")
//    }
//
//    /**
//     * Returns last index of [element], or -1 if the array does not contain element.
//     */
//    public fun <@kotlin.internal.OnlyInputTypes T> Array<out T>.lastIndexOf(element: T): Int {
//        if (element == null) {
//            for (index in indices.reversed()) {
//                if (this[index] == null) {
//                    return index
//                }
//            }
//        } else {
//            for (index in indices.reversed()) {
//                if (element == this[index]) {
//                    return index
//                }
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns last index of [element], or -1 if the array does not contain element.
//     */
//    public fun ByteArray.lastIndexOf(element: Byte): Int {
//        for (index in indices.reversed()) {
//            if (element == this[index]) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns last index of [element], or -1 if the array does not contain element.
//     */
//    public fun ShortArray.lastIndexOf(element: Short): Int {
//        for (index in indices.reversed()) {
//            if (element == this[index]) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns last index of [element], or -1 if the array does not contain element.
//     */
//    public fun IntArray.lastIndexOf(element: Int): Int {
//        for (index in indices.reversed()) {
//            if (element == this[index]) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns last index of [element], or -1 if the array does not contain element.
//     */
//    public fun LongArray.lastIndexOf(element: Long): Int {
//        for (index in indices.reversed()) {
//            if (element == this[index]) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns last index of [element], or -1 if the array does not contain element.
//     */
//    public fun FloatArray.lastIndexOf(element: Float): Int {
//        for (index in indices.reversed()) {
//            if (element == this[index]) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns last index of [element], or -1 if the array does not contain element.
//     */
//    public fun DoubleArray.lastIndexOf(element: Double): Int {
//        for (index in indices.reversed()) {
//            if (element == this[index]) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns last index of [element], or -1 if the array does not contain element.
//     */
//    public fun BooleanArray.lastIndexOf(element: Boolean): Int {
//        for (index in indices.reversed()) {
//            if (element == this[index]) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns last index of [element], or -1 if the array does not contain element.
//     */
//    public fun CharArray.lastIndexOf(element: Char): Int {
//        for (index in indices.reversed()) {
//            if (element == this[index]) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns the last element, or `null` if the array is empty.
//     */
//    public fun <T> Array<out T>.lastOrNull(): T? {
//        return if (isEmpty()) null else this[size - 1]
//    }
//
//    /**
//     * Returns the last element, or `null` if the array is empty.
//     */
//    public fun ByteArray.lastOrNull(): Byte? {
//        return if (isEmpty()) null else this[size - 1]
//    }
//
//    /**
//     * Returns the last element, or `null` if the array is empty.
//     */
//    public fun ShortArray.lastOrNull(): Short? {
//        return if (isEmpty()) null else this[size - 1]
//    }
//
//    /**
//     * Returns the last element, or `null` if the array is empty.
//     */
//    public fun IntArray.lastOrNull(): Int? {
//        return if (isEmpty()) null else this[size - 1]
//    }
//
//    /**
//     * Returns the last element, or `null` if the array is empty.
//     */
//    public fun LongArray.lastOrNull(): Long? {
//        return if (isEmpty()) null else this[size - 1]
//    }
//
//    /**
//     * Returns the last element, or `null` if the array is empty.
//     */
//    public fun FloatArray.lastOrNull(): Float? {
//        return if (isEmpty()) null else this[size - 1]
//    }
//
//    /**
//     * Returns the last element, or `null` if the array is empty.
//     */
//    public fun DoubleArray.lastOrNull(): Double? {
//        return if (isEmpty()) null else this[size - 1]
//    }
//
//    /**
//     * Returns the last element, or `null` if the array is empty.
//     */
//    public fun BooleanArray.lastOrNull(): Boolean? {
//        return if (isEmpty()) null else this[size - 1]
//    }
//
//    /**
//     * Returns the last element, or `null` if the array is empty.
//     */
//    public fun CharArray.lastOrNull(): Char? {
//        return if (isEmpty()) null else this[size - 1]
//    }
//
//    /**
//     * Returns the last element matching the given [predicate], or `null` if no such element was found.
//     */
//    public inline fun <T> Array<out T>.lastOrNull(predicate: (T) -> Boolean): T? {
//        for (index in this.indices.reversed()) {
//            val element = this[index]
//            if (predicate(element)) return element
//        }
//        return null
//    }
//
//    /**
//     * Returns the last element matching the given [predicate], or `null` if no such element was found.
//     */
//    public inline fun ByteArray.lastOrNull(predicate: (Byte) -> Boolean): Byte? {
//        for (index in this.indices.reversed()) {
//            val element = this[index]
//            if (predicate(element)) return element
//        }
//        return null
//    }
//
//    /**
//     * Returns the last element matching the given [predicate], or `null` if no such element was found.
//     */
//    public inline fun ShortArray.lastOrNull(predicate: (Short) -> Boolean): Short? {
//        for (index in this.indices.reversed()) {
//            val element = this[index]
//            if (predicate(element)) return element
//        }
//        return null
//    }
//
//    /**
//     * Returns the last element matching the given [predicate], or `null` if no such element was found.
//     */
//    public inline fun IntArray.lastOrNull(predicate: (Int) -> Boolean): Int? {
//        for (index in this.indices.reversed()) {
//            val element = this[index]
//            if (predicate(element)) return element
//        }
//        return null
//    }
//
//    /**
//     * Returns the last element matching the given [predicate], or `null` if no such element was found.
//     */
//    public inline fun LongArray.lastOrNull(predicate: (Long) -> Boolean): Long? {
//        for (index in this.indices.reversed()) {
//            val element = this[index]
//            if (predicate(element)) return element
//        }
//        return null
//    }
//
//    /**
//     * Returns the last element matching the given [predicate], or `null` if no such element was found.
//     */
//    public inline fun FloatArray.lastOrNull(predicate: (Float) -> Boolean): Float? {
//        for (index in this.indices.reversed()) {
//            val element = this[index]
//            if (predicate(element)) return element
//        }
//        return null
//    }
//
//    /**
//     * Returns the last element matching the given [predicate], or `null` if no such element was found.
//     */
//    public inline fun DoubleArray.lastOrNull(predicate: (Double) -> Boolean): Double? {
//        for (index in this.indices.reversed()) {
//            val element = this[index]
//            if (predicate(element)) return element
//        }
//        return null
//    }
//
//    /**
//     * Returns the last element matching the given [predicate], or `null` if no such element was found.
//     */
//    public inline fun BooleanArray.lastOrNull(predicate: (Boolean) -> Boolean): Boolean? {
//        for (index in this.indices.reversed()) {
//            val element = this[index]
//            if (predicate(element)) return element
//        }
//        return null
//    }
//
//    /**
//     * Returns the last element matching the given [predicate], or `null` if no such element was found.
//     */
//    public inline fun CharArray.lastOrNull(predicate: (Char) -> Boolean): Char? {
//        for (index in this.indices.reversed()) {
//            val element = this[index]
//            if (predicate(element)) return element
//        }
//        return null
//    }
//
//
//
//    /**
//     * Returns a list containing all elements except first [n] elements.
//     */
//    public fun <T> Array<out T>.drop(n: Int): List<T> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        return takeLast((size - n).coerceAtLeast(0))
//    }
//
//    /**
//     * Returns a list containing all elements except first [n] elements.
//     */
//    public fun ByteArray.drop(n: Int): List<Byte> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        return takeLast((size - n).coerceAtLeast(0))
//    }
//
//    /**
//     * Returns a list containing all elements except first [n] elements.
//     */
//    public fun ShortArray.drop(n: Int): List<Short> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        return takeLast((size - n).coerceAtLeast(0))
//    }
//
//    /**
//     * Returns a list containing all elements except first [n] elements.
//     */
//    public fun IntArray.drop(n: Int): List<Int> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        return takeLast((size - n).coerceAtLeast(0))
//    }
//
//    /**
//     * Returns a list containing all elements except first [n] elements.
//     */
//    public fun LongArray.drop(n: Int): List<Long> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        return takeLast((size - n).coerceAtLeast(0))
//    }
//
//    /**
//     * Returns a list containing all elements except first [n] elements.
//     */
//    public fun FloatArray.drop(n: Int): List<Float> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        return takeLast((size - n).coerceAtLeast(0))
//    }
//
//    /**
//     * Returns a list containing all elements except first [n] elements.
//     */
//    public fun DoubleArray.drop(n: Int): List<Double> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        return takeLast((size - n).coerceAtLeast(0))
//    }
//
//    /**
//     * Returns a list containing all elements except first [n] elements.
//     */
//    public fun BooleanArray.drop(n: Int): List<Boolean> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        return takeLast((size - n).coerceAtLeast(0))
//    }
//
//    /**
//     * Returns a list containing all elements except first [n] elements.
//     */
//    public fun CharArray.drop(n: Int): List<Char> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        return takeLast((size - n).coerceAtLeast(0))
//    }
//
//    /**
//     * Returns a list containing all elements except last [n] elements.
//     */
//    public fun <T> Array<out T>.dropLast(n: Int): List<T> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        return take((size - n).coerceAtLeast(0))
//    }
//
//    /**
//     * Returns a list containing all elements except last [n] elements.
//     */
//    public fun ByteArray.dropLast(n: Int): List<Byte> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        return take((size - n).coerceAtLeast(0))
//    }
//
//    /**
//     * Returns a list containing all elements except last [n] elements.
//     */
//    public fun ShortArray.dropLast(n: Int): List<Short> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        return take((size - n).coerceAtLeast(0))
//    }
//
//    /**
//     * Returns a list containing all elements except last [n] elements.
//     */
//    public fun IntArray.dropLast(n: Int): List<Int> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        return take((size - n).coerceAtLeast(0))
//    }
//
//    /**
//     * Returns a list containing all elements except last [n] elements.
//     */
//    public fun LongArray.dropLast(n: Int): List<Long> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        return take((size - n).coerceAtLeast(0))
//    }
//
//    /**
//     * Returns a list containing all elements except last [n] elements.
//     */
//    public fun FloatArray.dropLast(n: Int): List<Float> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        return take((size - n).coerceAtLeast(0))
//    }
//
//    /**
//     * Returns a list containing all elements except last [n] elements.
//     */
//    public fun DoubleArray.dropLast(n: Int): List<Double> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        return take((size - n).coerceAtLeast(0))
//    }
//
//    /**
//     * Returns a list containing all elements except last [n] elements.
//     */
//    public fun BooleanArray.dropLast(n: Int): List<Boolean> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        return take((size - n).coerceAtLeast(0))
//    }
//
//    /**
//     * Returns a list containing all elements except last [n] elements.
//     */
//    public fun CharArray.dropLast(n: Int): List<Char> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        return take((size - n).coerceAtLeast(0))
//    }
//
//    /**
//     * Returns a list containing all elements except last elements that satisfy the given [predicate].
//     */
//    public inline fun <T> Array<out T>.dropLastWhile(predicate: (T) -> Boolean): List<T> {
//        for (index in lastIndex downTo 0) {
//            if (!predicate(this[index])) {
//                return take(index + 1)
//            }
//        }
//        return emptyList()
//    }
//
//    /**
//     * Returns a list containing all elements except last elements that satisfy the given [predicate].
//     */
//    public inline fun ByteArray.dropLastWhile(predicate: (Byte) -> Boolean): List<Byte> {
//        for (index in lastIndex downTo 0) {
//            if (!predicate(this[index])) {
//                return take(index + 1)
//            }
//        }
//        return emptyList()
//    }
//
//    /**
//     * Returns a list containing all elements except last elements that satisfy the given [predicate].
//     */
//    public inline fun ShortArray.dropLastWhile(predicate: (Short) -> Boolean): List<Short> {
//        for (index in lastIndex downTo 0) {
//            if (!predicate(this[index])) {
//                return take(index + 1)
//            }
//        }
//        return emptyList()
//    }
//
//    /**
//     * Returns a list containing all elements except last elements that satisfy the given [predicate].
//     */
//    public inline fun IntArray.dropLastWhile(predicate: (Int) -> Boolean): List<Int> {
//        for (index in lastIndex downTo 0) {
//            if (!predicate(this[index])) {
//                return take(index + 1)
//            }
//        }
//        return emptyList()
//    }
//
//    /**
//     * Returns a list containing all elements except last elements that satisfy the given [predicate].
//     */
//    public inline fun LongArray.dropLastWhile(predicate: (Long) -> Boolean): List<Long> {
//        for (index in lastIndex downTo 0) {
//            if (!predicate(this[index])) {
//                return take(index + 1)
//            }
//        }
//        return emptyList()
//    }
//
//    /**
//     * Returns a list containing all elements except last elements that satisfy the given [predicate].
//     */
//    public inline fun FloatArray.dropLastWhile(predicate: (Float) -> Boolean): List<Float> {
//        for (index in lastIndex downTo 0) {
//            if (!predicate(this[index])) {
//                return take(index + 1)
//            }
//        }
//        return emptyList()
//    }
//
//    /**
//     * Returns a list containing all elements except last elements that satisfy the given [predicate].
//     */
//    public inline fun DoubleArray.dropLastWhile(predicate: (Double) -> Boolean): List<Double> {
//        for (index in lastIndex downTo 0) {
//            if (!predicate(this[index])) {
//                return take(index + 1)
//            }
//        }
//        return emptyList()
//    }
//
//    /**
//     * Returns a list containing all elements except last elements that satisfy the given [predicate].
//     */
//    public inline fun BooleanArray.dropLastWhile(predicate: (Boolean) -> Boolean): List<Boolean> {
//        for (index in lastIndex downTo 0) {
//            if (!predicate(this[index])) {
//                return take(index + 1)
//            }
//        }
//        return emptyList()
//    }
//
//    /**
//     * Returns a list containing all elements except last elements that satisfy the given [predicate].
//     */
//    public inline fun CharArray.dropLastWhile(predicate: (Char) -> Boolean): List<Char> {
//        for (index in lastIndex downTo 0) {
//            if (!predicate(this[index])) {
//                return take(index + 1)
//            }
//        }
//        return emptyList()
//    }
//
//    /**
//     * Returns a list containing all elements except first elements that satisfy the given [predicate].
//     */
//    public inline fun <T> Array<out T>.dropWhile(predicate: (T) -> Boolean): List<T> {
//        var yielding = false
//        val list = ArrayList<T>()
//        for (item in this)
//            if (yielding)
//                list.add(item)
//            else if (!predicate(item)) {
//                list.add(item)
//                yielding = true
//            }
//        return list
//    }
//
//    /**
//     * Returns a list containing all elements except first elements that satisfy the given [predicate].
//     */
//    public inline fun ByteArray.dropWhile(predicate: (Byte) -> Boolean): List<Byte> {
//        var yielding = false
//        val list = ArrayList<Byte>()
//        for (item in this)
//            if (yielding)
//                list.add(item)
//            else if (!predicate(item)) {
//                list.add(item)
//                yielding = true
//            }
//        return list
//    }
//
//    /**
//     * Returns a list containing all elements except first elements that satisfy the given [predicate].
//     */
//    public inline fun ShortArray.dropWhile(predicate: (Short) -> Boolean): List<Short> {
//        var yielding = false
//        val list = ArrayList<Short>()
//        for (item in this)
//            if (yielding)
//                list.add(item)
//            else if (!predicate(item)) {
//                list.add(item)
//                yielding = true
//            }
//        return list
//    }
//
//    /**
//     * Returns a list containing all elements except first elements that satisfy the given [predicate].
//     */
//    public inline fun IntArray.dropWhile(predicate: (Int) -> Boolean): List<Int> {
//        var yielding = false
//        val list = ArrayList<Int>()
//        for (item in this)
//            if (yielding)
//                list.add(item)
//            else if (!predicate(item)) {
//                list.add(item)
//                yielding = true
//            }
//        return list
//    }
//
//    /**
//     * Returns a list containing all elements except first elements that satisfy the given [predicate].
//     */
//    public inline fun LongArray.dropWhile(predicate: (Long) -> Boolean): List<Long> {
//        var yielding = false
//        val list = ArrayList<Long>()
//        for (item in this)
//            if (yielding)
//                list.add(item)
//            else if (!predicate(item)) {
//                list.add(item)
//                yielding = true
//            }
//        return list
//    }
//
//    /**
//     * Returns a list containing all elements except first elements that satisfy the given [predicate].
//     */
//    public inline fun FloatArray.dropWhile(predicate: (Float) -> Boolean): List<Float> {
//        var yielding = false
//        val list = ArrayList<Float>()
//        for (item in this)
//            if (yielding)
//                list.add(item)
//            else if (!predicate(item)) {
//                list.add(item)
//                yielding = true
//            }
//        return list
//    }
//
//    /**
//     * Returns a list containing all elements except first elements that satisfy the given [predicate].
//     */
//    public inline fun DoubleArray.dropWhile(predicate: (Double) -> Boolean): List<Double> {
//        var yielding = false
//        val list = ArrayList<Double>()
//        for (item in this)
//            if (yielding)
//                list.add(item)
//            else if (!predicate(item)) {
//                list.add(item)
//                yielding = true
//            }
//        return list
//    }
//
//    /**
//     * Returns a list containing all elements except first elements that satisfy the given [predicate].
//     */
//    public inline fun BooleanArray.dropWhile(predicate: (Boolean) -> Boolean): List<Boolean> {
//        var yielding = false
//        val list = ArrayList<Boolean>()
//        for (item in this)
//            if (yielding)
//                list.add(item)
//            else if (!predicate(item)) {
//                list.add(item)
//                yielding = true
//            }
//        return list
//    }
//
//    /**
//     * Returns a list containing all elements except first elements that satisfy the given [predicate].
//     */
//    public inline fun CharArray.dropWhile(predicate: (Char) -> Boolean): List<Char> {
//        var yielding = false
//        val list = ArrayList<Char>()
//        for (item in this)
//            if (yielding)
//                list.add(item)
//            else if (!predicate(item)) {
//                list.add(item)
//                yielding = true
//            }
//        return list
//    }
//
//    /**
//     * Returns a list containing only elements matching the given [predicate].
//     */
//    public inline fun <T> Array<out T>.filter(predicate: (T) -> Boolean): List<T> {
//        return filterTo(ArrayList<T>(), predicate)
//    }
//
//    /**
//     * Returns a list containing only elements matching the given [predicate].
//     */
//    public inline fun ByteArray.filter(predicate: (Byte) -> Boolean): List<Byte> {
//        return filterTo(ArrayList<Byte>(), predicate)
//    }
//
//    /**
//     * Returns a list containing only elements matching the given [predicate].
//     */
//    public inline fun ShortArray.filter(predicate: (Short) -> Boolean): List<Short> {
//        return filterTo(ArrayList<Short>(), predicate)
//    }
//
//    /**
//     * Returns a list containing only elements matching the given [predicate].
//     */
//    public inline fun IntArray.filter(predicate: (Int) -> Boolean): List<Int> {
//        return filterTo(ArrayList<Int>(), predicate)
//    }
//
//    /**
//     * Returns a list containing only elements matching the given [predicate].
//     */
//    public inline fun LongArray.filter(predicate: (Long) -> Boolean): List<Long> {
//        return filterTo(ArrayList<Long>(), predicate)
//    }
//
//    /**
//     * Returns a list containing only elements matching the given [predicate].
//     */
//    public inline fun FloatArray.filter(predicate: (Float) -> Boolean): List<Float> {
//        return filterTo(ArrayList<Float>(), predicate)
//    }
//
//    /**
//     * Returns a list containing only elements matching the given [predicate].
//     */
//    public inline fun DoubleArray.filter(predicate: (Double) -> Boolean): List<Double> {
//        return filterTo(ArrayList<Double>(), predicate)
//    }
//
//    /**
//     * Returns a list containing only elements matching the given [predicate].
//     */
//    public inline fun BooleanArray.filter(predicate: (Boolean) -> Boolean): List<Boolean> {
//        return filterTo(ArrayList<Boolean>(), predicate)
//    }
//
//    /**
//     * Returns a list containing only elements matching the given [predicate].
//     */
//    public inline fun CharArray.filter(predicate: (Char) -> Boolean): List<Char> {
//        return filterTo(ArrayList<Char>(), predicate)
//    }
//
//    /**
//     * Returns a list containing only elements matching the given [predicate].
//     * @param [predicate] function that takes the index of an element and the element itself
//     * and returns the result of predicate evaluation on the element.
//     */
//    public inline fun <T> Array<out T>.filterIndexed(predicate: (index: Int, T) -> Boolean): List<T> {
//        return filterIndexedTo(ArrayList<T>(), predicate)
//    }
//
//    /**
//     * Returns a list containing only elements matching the given [predicate].
//     * @param [predicate] function that takes the index of an element and the element itself
//     * and returns the result of predicate evaluation on the element.
//     */
//    public inline fun ByteArray.filterIndexed(predicate: (index: Int, Byte) -> Boolean): List<Byte> {
//        return filterIndexedTo(ArrayList<Byte>(), predicate)
//    }
//
//    /**
//     * Returns a list containing only elements matching the given [predicate].
//     * @param [predicate] function that takes the index of an element and the element itself
//     * and returns the result of predicate evaluation on the element.
//     */
//    public inline fun ShortArray.filterIndexed(predicate: (index: Int, Short) -> Boolean): List<Short> {
//        return filterIndexedTo(ArrayList<Short>(), predicate)
//    }
//
//    /**
//     * Returns a list containing only elements matching the given [predicate].
//     * @param [predicate] function that takes the index of an element and the element itself
//     * and returns the result of predicate evaluation on the element.
//     */
//    public inline fun IntArray.filterIndexed(predicate: (index: Int, Int) -> Boolean): List<Int> {
//        return filterIndexedTo(ArrayList<Int>(), predicate)
//    }
//
//    /**
//     * Returns a list containing only elements matching the given [predicate].
//     * @param [predicate] function that takes the index of an element and the element itself
//     * and returns the result of predicate evaluation on the element.
//     */
//    public inline fun LongArray.filterIndexed(predicate: (index: Int, Long) -> Boolean): List<Long> {
//        return filterIndexedTo(ArrayList<Long>(), predicate)
//    }
//
//    /**
//     * Returns a list containing only elements matching the given [predicate].
//     * @param [predicate] function that takes the index of an element and the element itself
//     * and returns the result of predicate evaluation on the element.
//     */
//    public inline fun FloatArray.filterIndexed(predicate: (index: Int, Float) -> Boolean): List<Float> {
//        return filterIndexedTo(ArrayList<Float>(), predicate)
//    }
//
//    /**
//     * Returns a list containing only elements matching the given [predicate].
//     * @param [predicate] function that takes the index of an element and the element itself
//     * and returns the result of predicate evaluation on the element.
//     */
//    public inline fun DoubleArray.filterIndexed(predicate: (index: Int, Double) -> Boolean): List<Double> {
//        return filterIndexedTo(ArrayList<Double>(), predicate)
//    }
//
//    /**
//     * Returns a list containing only elements matching the given [predicate].
//     * @param [predicate] function that takes the index of an element and the element itself
//     * and returns the result of predicate evaluation on the element.
//     */
//    public inline fun BooleanArray.filterIndexed(predicate: (index: Int, Boolean) -> Boolean): List<Boolean> {
//        return filterIndexedTo(ArrayList<Boolean>(), predicate)
//    }
//
//    /**
//     * Returns a list containing only elements matching the given [predicate].
//     * @param [predicate] function that takes the index of an element and the element itself
//     * and returns the result of predicate evaluation on the element.
//     */
//    public inline fun CharArray.filterIndexed(predicate: (index: Int, Char) -> Boolean): List<Char> {
//        return filterIndexedTo(ArrayList<Char>(), predicate)
//    }
//
//    /**
//     * Appends all elements matching the given [predicate] to the given [destination].
//     * @param [predicate] function that takes the index of an element and the element itself
//     * and returns the result of predicate evaluation on the element.
//     */
//    public inline fun <T, C : MutableCollection<in T>> Array<out T>.filterIndexedTo(destination: C, predicate: (index: Int, T) -> Boolean): C {
//        forEachIndexed { index, element ->
//            if (predicate(index, element)) destination.add(element)
//        }
//        return destination
//    }
//
//    /**
//     * Appends all elements matching the given [predicate] to the given [destination].
//     * @param [predicate] function that takes the index of an element and the element itself
//     * and returns the result of predicate evaluation on the element.
//     */
//    public inline fun <C : MutableCollection<in Byte>> ByteArray.filterIndexedTo(destination: C, predicate: (index: Int, Byte) -> Boolean): C {
//        forEachIndexed { index, element ->
//            if (predicate(index, element)) destination.add(element)
//        }
//        return destination
//    }
//
//    /**
//     * Appends all elements matching the given [predicate] to the given [destination].
//     * @param [predicate] function that takes the index of an element and the element itself
//     * and returns the result of predicate evaluation on the element.
//     */
//    public inline fun <C : MutableCollection<in Short>> ShortArray.filterIndexedTo(destination: C, predicate: (index: Int, Short) -> Boolean): C {
//        forEachIndexed { index, element ->
//            if (predicate(index, element)) destination.add(element)
//        }
//        return destination
//    }
//
//    /**
//     * Appends all elements matching the given [predicate] to the given [destination].
//     * @param [predicate] function that takes the index of an element and the element itself
//     * and returns the result of predicate evaluation on the element.
//     */
//    public inline fun <C : MutableCollection<in Int>> IntArray.filterIndexedTo(destination: C, predicate: (index: Int, Int) -> Boolean): C {
//        forEachIndexed { index, element ->
//            if (predicate(index, element)) destination.add(element)
//        }
//        return destination
//    }
//
//    /**
//     * Appends all elements matching the given [predicate] to the given [destination].
//     * @param [predicate] function that takes the index of an element and the element itself
//     * and returns the result of predicate evaluation on the element.
//     */
//    public inline fun <C : MutableCollection<in Long>> LongArray.filterIndexedTo(destination: C, predicate: (index: Int, Long) -> Boolean): C {
//        forEachIndexed { index, element ->
//            if (predicate(index, element)) destination.add(element)
//        }
//        return destination
//    }
//
//    /**
//     * Appends all elements matching the given [predicate] to the given [destination].
//     * @param [predicate] function that takes the index of an element and the element itself
//     * and returns the result of predicate evaluation on the element.
//     */
//    public inline fun <C : MutableCollection<in Float>> FloatArray.filterIndexedTo(destination: C, predicate: (index: Int, Float) -> Boolean): C {
//        forEachIndexed { index, element ->
//            if (predicate(index, element)) destination.add(element)
//        }
//        return destination
//    }
//
//    /**
//     * Appends all elements matching the given [predicate] to the given [destination].
//     * @param [predicate] function that takes the index of an element and the element itself
//     * and returns the result of predicate evaluation on the element.
//     */
//    public inline fun <C : MutableCollection<in Double>> DoubleArray.filterIndexedTo(destination: C, predicate: (index: Int, Double) -> Boolean): C {
//        forEachIndexed { index, element ->
//            if (predicate(index, element)) destination.add(element)
//        }
//        return destination
//    }
//
//    /**
//     * Appends all elements matching the given [predicate] to the given [destination].
//     * @param [predicate] function that takes the index of an element and the element itself
//     * and returns the result of predicate evaluation on the element.
//     */
//    public inline fun <C : MutableCollection<in Boolean>> BooleanArray.filterIndexedTo(destination: C, predicate: (index: Int, Boolean) -> Boolean): C {
//        forEachIndexed { index, element ->
//            if (predicate(index, element)) destination.add(element)
//        }
//        return destination
//    }
//
//    /**
//     * Appends all elements matching the given [predicate] to the given [destination].
//     * @param [predicate] function that takes the index of an element and the element itself
//     * and returns the result of predicate evaluation on the element.
//     */
//    public inline fun <C : MutableCollection<in Char>> CharArray.filterIndexedTo(destination: C, predicate: (index: Int, Char) -> Boolean): C {
//        forEachIndexed { index, element ->
//            if (predicate(index, element)) destination.add(element)
//        }
//        return destination
//    }
//
//    /**
//     * Returns a list containing all elements that are instances of specified type parameter R.
//     */
//    public inline fun <reified R> Array<*>.filterIsInstance(): List<@kotlin.internal.NoInfer R> {
//        return filterIsInstanceTo(ArrayList<R>())
//    }
//
//    /**
//     * Returns a list containing all elements that are instances of specified class.
//     */
//    public fun <R> Array<*>.filterIsInstance(klass: Class<R>): List<R> {
//        return filterIsInstanceTo(ArrayList<R>(), klass)
//    }
//
//    /**
//     * Appends all elements that are instances of specified type parameter R to the given [destination].
//     */
//    public inline fun <reified R, C : MutableCollection<in R>> Array<*>.filterIsInstanceTo(destination: C): C {
//        for (element in this) if (element is R) destination.add(element)
//        return destination
//    }
//
///**
// * Appends all elements that are instances of specified class to the given [destination].
// */
//    public fun <C : MutableCollection<in R>, R> Array<*>.filterIsInstanceTo(destination: C, klass: Class<R>): C {
//        @Suppress("UNCHECKED_CAST")
//        for (element in this) if (klass.isInstance(element)) destination.add(element as R)
//        return destination
//    }
//
//    /**
//     * Returns a list containing all elements not matching the given [predicate].
//     */
//    public inline fun <T> Array<out T>.filterNot(predicate: (T) -> Boolean): List<T> {
//        return filterNotTo(ArrayList<T>(), predicate)
//    }
//
//    /**
//     * Returns a list containing all elements not matching the given [predicate].
//     */
//    public inline fun ByteArray.filterNot(predicate: (Byte) -> Boolean): List<Byte> {
//        return filterNotTo(ArrayList<Byte>(), predicate)
//    }
//
//    /**
//     * Returns a list containing all elements not matching the given [predicate].
//     */
//    public inline fun ShortArray.filterNot(predicate: (Short) -> Boolean): List<Short> {
//        return filterNotTo(ArrayList<Short>(), predicate)
//    }
//
//    /**
//     * Returns a list containing all elements not matching the given [predicate].
//     */
//    public inline fun IntArray.filterNot(predicate: (Int) -> Boolean): List<Int> {
//        return filterNotTo(ArrayList<Int>(), predicate)
//    }
//
//    /**
//     * Returns a list containing all elements not matching the given [predicate].
//     */
//    public inline fun LongArray.filterNot(predicate: (Long) -> Boolean): List<Long> {
//        return filterNotTo(ArrayList<Long>(), predicate)
//    }
//
//    /**
//     * Returns a list containing all elements not matching the given [predicate].
//     */
//    public inline fun FloatArray.filterNot(predicate: (Float) -> Boolean): List<Float> {
//        return filterNotTo(ArrayList<Float>(), predicate)
//    }
//
//    /**
//     * Returns a list containing all elements not matching the given [predicate].
//     */
//    public inline fun DoubleArray.filterNot(predicate: (Double) -> Boolean): List<Double> {
//        return filterNotTo(ArrayList<Double>(), predicate)
//    }
//
//    /**
//     * Returns a list containing all elements not matching the given [predicate].
//     */
//    public inline fun BooleanArray.filterNot(predicate: (Boolean) -> Boolean): List<Boolean> {
//        return filterNotTo(ArrayList<Boolean>(), predicate)
//    }
//
//    /**
//     * Returns a list containing all elements not matching the given [predicate].
//     */
//    public inline fun CharArray.filterNot(predicate: (Char) -> Boolean): List<Char> {
//        return filterNotTo(ArrayList<Char>(), predicate)
//    }
//
///**
// * Returns a list containing all elements that are not `null`.
// */
//    public fun <T : Any> Array<out T?>.filterNotNull(): List<T> {
//        return filterNotNullTo(ArrayList<T>())
//    }
//
///**
// * Appends all elements that are not `null` to the given [destination].
// */
//    public fun <C : MutableCollection<in T>, T : Any> Array<out T?>.filterNotNullTo(destination: C): C {
//        for (element in this) if (element != null) destination.add(element)
//        return destination
//    }
//
//    /**
//     * Appends all elements not matching the given [predicate] to the given [destination].
//     */
//    public inline fun <T, C : MutableCollection<in T>> Array<out T>.filterNotTo(destination: C, predicate: (T) -> Boolean): C {
//        for (element in this) if (!predicate(element)) destination.add(element)
//        return destination
//    }
//
//    /**
//     * Appends all elements not matching the given [predicate] to the given [destination].
//     */
//    public inline fun <C : MutableCollection<in Byte>> ByteArray.filterNotTo(destination: C, predicate: (Byte) -> Boolean): C {
//        for (element in this) if (!predicate(element)) destination.add(element)
//        return destination
//    }
//
//    /**
//     * Appends all elements not matching the given [predicate] to the given [destination].
//     */
//    public inline fun <C : MutableCollection<in Short>> ShortArray.filterNotTo(destination: C, predicate: (Short) -> Boolean): C {
//        for (element in this) if (!predicate(element)) destination.add(element)
//        return destination
//    }
//
//    /**
//     * Appends all elements not matching the given [predicate] to the given [destination].
//     */
//    public inline fun <C : MutableCollection<in Int>> IntArray.filterNotTo(destination: C, predicate: (Int) -> Boolean): C {
//        for (element in this) if (!predicate(element)) destination.add(element)
//        return destination
//    }
//
//    /**
//     * Appends all elements not matching the given [predicate] to the given [destination].
//     */
//    public inline fun <C : MutableCollection<in Long>> LongArray.filterNotTo(destination: C, predicate: (Long) -> Boolean): C {
//        for (element in this) if (!predicate(element)) destination.add(element)
//        return destination
//    }
//
//    /**
//     * Appends all elements not matching the given [predicate] to the given [destination].
//     */
//    public inline fun <C : MutableCollection<in Float>> FloatArray.filterNotTo(destination: C, predicate: (Float) -> Boolean): C {
//        for (element in this) if (!predicate(element)) destination.add(element)
//        return destination
//    }
//
//    /**
//     * Appends all elements not matching the given [predicate] to the given [destination].
//     */
//    public inline fun <C : MutableCollection<in Double>> DoubleArray.filterNotTo(destination: C, predicate: (Double) -> Boolean): C {
//        for (element in this) if (!predicate(element)) destination.add(element)
//        return destination
//    }
//
//    /**
//     * Appends all elements not matching the given [predicate] to the given [destination].
//     */
//    public inline fun <C : MutableCollection<in Boolean>> BooleanArray.filterNotTo(destination: C, predicate: (Boolean) -> Boolean): C {
//        for (element in this) if (!predicate(element)) destination.add(element)
//        return destination
//    }
//
//    /**
//     * Appends all elements not matching the given [predicate] to the given [destination].
//     */
//    public inline fun <C : MutableCollection<in Char>> CharArray.filterNotTo(destination: C, predicate: (Char) -> Boolean): C {
//        for (element in this) if (!predicate(element)) destination.add(element)
//        return destination
//    }
//
//    /**
//     * Appends all elements matching the given [predicate] to the given [destination].
//     */
//    public inline fun <T, C : MutableCollection<in T>> Array<out T>.filterTo(destination: C, predicate: (T) -> Boolean): C {
//        for (element in this) if (predicate(element)) destination.add(element)
//        return destination
//    }
//
//    /**
//     * Appends all elements matching the given [predicate] to the given [destination].
//     */
//    public inline fun <C : MutableCollection<in Byte>> ByteArray.filterTo(destination: C, predicate: (Byte) -> Boolean): C {
//        for (element in this) if (predicate(element)) destination.add(element)
//        return destination
//    }
//
//    /**
//     * Appends all elements matching the given [predicate] to the given [destination].
//     */
//    public inline fun <C : MutableCollection<in Short>> ShortArray.filterTo(destination: C, predicate: (Short) -> Boolean): C {
//        for (element in this) if (predicate(element)) destination.add(element)
//        return destination
//    }
//
//    /**
//     * Appends all elements matching the given [predicate] to the given [destination].
//     */
//    public inline fun <C : MutableCollection<in Int>> IntArray.filterTo(destination: C, predicate: (Int) -> Boolean): C {
//        for (element in this) if (predicate(element)) destination.add(element)
//        return destination
//    }
//
//    /**
//     * Appends all elements matching the given [predicate] to the given [destination].
//     */
//    public inline fun <C : MutableCollection<in Long>> LongArray.filterTo(destination: C, predicate: (Long) -> Boolean): C {
//        for (element in this) if (predicate(element)) destination.add(element)
//        return destination
//    }
//
//    /**
//     * Appends all elements matching the given [predicate] to the given [destination].
//     */
//    public inline fun <C : MutableCollection<in Float>> FloatArray.filterTo(destination: C, predicate: (Float) -> Boolean): C {
//        for (element in this) if (predicate(element)) destination.add(element)
//        return destination
//    }
//
//    /**
//     * Appends all elements matching the given [predicate] to the given [destination].
//     */
//    public inline fun <C : MutableCollection<in Double>> DoubleArray.filterTo(destination: C, predicate: (Double) -> Boolean): C {
//        for (element in this) if (predicate(element)) destination.add(element)
//        return destination
//    }
//
//    /**
//     * Appends all elements matching the given [predicate] to the given [destination].
//     */
//    public inline fun <C : MutableCollection<in Boolean>> BooleanArray.filterTo(destination: C, predicate: (Boolean) -> Boolean): C {
//        for (element in this) if (predicate(element)) destination.add(element)
//        return destination
//    }
//
//    /**
//     * Appends all elements matching the given [predicate] to the given [destination].
//     */
//    public inline fun <C : MutableCollection<in Char>> CharArray.filterTo(destination: C, predicate: (Char) -> Boolean): C {
//        for (element in this) if (predicate(element)) destination.add(element)
//        return destination
//    }
//
//    /**
//     * Returns a list containing elements at indices in the specified [indices] range.
//     */
//    public fun <T> Array<out T>.slice(indices: IntRange): List<T> {
//        if (indices.isEmpty()) return listOf()
//        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
//    }
//
//    /**
//     * Returns a list containing elements at indices in the specified [indices] range.
//     */
//    public fun ByteArray.slice(indices: IntRange): List<Byte> {
//        if (indices.isEmpty()) return listOf()
//        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
//    }
//
//    /**
//     * Returns a list containing elements at indices in the specified [indices] range.
//     */
//    public fun ShortArray.slice(indices: IntRange): List<Short> {
//        if (indices.isEmpty()) return listOf()
//        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
//    }
//
//    /**
//     * Returns a list containing elements at indices in the specified [indices] range.
//     */
//    public fun IntArray.slice(indices: IntRange): List<Int> {
//        if (indices.isEmpty()) return listOf()
//        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
//    }
//
//    /**
//     * Returns a list containing elements at indices in the specified [indices] range.
//     */
//    public fun LongArray.slice(indices: IntRange): List<Long> {
//        if (indices.isEmpty()) return listOf()
//        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
//    }
//
//    /**
//     * Returns a list containing elements at indices in the specified [indices] range.
//     */
//    public fun FloatArray.slice(indices: IntRange): List<Float> {
//        if (indices.isEmpty()) return listOf()
//        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
//    }
//
//    /**
//     * Returns a list containing elements at indices in the specified [indices] range.
//     */
//    public fun DoubleArray.slice(indices: IntRange): List<Double> {
//        if (indices.isEmpty()) return listOf()
//        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
//    }
//
//    /**
//     * Returns a list containing elements at indices in the specified [indices] range.
//     */
//    public fun BooleanArray.slice(indices: IntRange): List<Boolean> {
//        if (indices.isEmpty()) return listOf()
//        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
//    }
//
//    /**
//     * Returns a list containing elements at indices in the specified [indices] range.
//     */
//    public fun CharArray.slice(indices: IntRange): List<Char> {
//        if (indices.isEmpty()) return listOf()
//        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
//    }
//
//    /**
//     * Returns a list containing elements at specified [indices].
//     */
//    public fun <T> Array<out T>.slice(indices: Iterable<Int>): List<T> {
//        val size = indices.collectionSizeOrDefault(10)
//        if (size == 0) return emptyList()
//        val list = ArrayList<T>(size)
//        for (index in indices) {
//            list.add(get(index))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing elements at specified [indices].
//     */
//    public fun ByteArray.slice(indices: Iterable<Int>): List<Byte> {
//        val size = indices.collectionSizeOrDefault(10)
//        if (size == 0) return emptyList()
//        val list = ArrayList<Byte>(size)
//        for (index in indices) {
//            list.add(get(index))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing elements at specified [indices].
//     */
//    public fun ShortArray.slice(indices: Iterable<Int>): List<Short> {
//        val size = indices.collectionSizeOrDefault(10)
//        if (size == 0) return emptyList()
//        val list = ArrayList<Short>(size)
//        for (index in indices) {
//            list.add(get(index))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing elements at specified [indices].
//     */
//    public fun IntArray.slice(indices: Iterable<Int>): List<Int> {
//        val size = indices.collectionSizeOrDefault(10)
//        if (size == 0) return emptyList()
//        val list = ArrayList<Int>(size)
//        for (index in indices) {
//            list.add(get(index))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing elements at specified [indices].
//     */
//    public fun LongArray.slice(indices: Iterable<Int>): List<Long> {
//        val size = indices.collectionSizeOrDefault(10)
//        if (size == 0) return emptyList()
//        val list = ArrayList<Long>(size)
//        for (index in indices) {
//            list.add(get(index))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing elements at specified [indices].
//     */
//    public fun FloatArray.slice(indices: Iterable<Int>): List<Float> {
//        val size = indices.collectionSizeOrDefault(10)
//        if (size == 0) return emptyList()
//        val list = ArrayList<Float>(size)
//        for (index in indices) {
//            list.add(get(index))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing elements at specified [indices].
//     */
//    public fun DoubleArray.slice(indices: Iterable<Int>): List<Double> {
//        val size = indices.collectionSizeOrDefault(10)
//        if (size == 0) return emptyList()
//        val list = ArrayList<Double>(size)
//        for (index in indices) {
//            list.add(get(index))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing elements at specified [indices].
//     */
//    public fun BooleanArray.slice(indices: Iterable<Int>): List<Boolean> {
//        val size = indices.collectionSizeOrDefault(10)
//        if (size == 0) return emptyList()
//        val list = ArrayList<Boolean>(size)
//        for (index in indices) {
//            list.add(get(index))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing elements at specified [indices].
//     */
//    public fun CharArray.slice(indices: Iterable<Int>): List<Char> {
//        val size = indices.collectionSizeOrDefault(10)
//        if (size == 0) return emptyList()
//        val list = ArrayList<Char>(size)
//        for (index in indices) {
//            list.add(get(index))
//        }
//        return list
//    }
//
//    /**
//     * Returns an array containing elements of this array at specified [indices].
//     */
//    public fun <T> Array<T>.sliceArray(indices: Collection<Int>): Array<T> {
//        val result = arrayOfNulls(this, indices.size)
//        var targetIndex = 0
//        for (sourceIndex in indices) {
//            result[targetIndex++] = this[sourceIndex]
//        }
//        return result
//    }
//
//    /**
//     * Returns an array containing elements of this array at specified [indices].
//     */
//    public fun ByteArray.sliceArray(indices: Collection<Int>): ByteArray {
//        val result = ByteArray(indices.size)
//        var targetIndex = 0
//        for (sourceIndex in indices) {
//            result[targetIndex++] = this[sourceIndex]
//        }
//        return result
//    }
//
//    /**
//     * Returns an array containing elements of this array at specified [indices].
//     */
//    public fun ShortArray.sliceArray(indices: Collection<Int>): ShortArray {
//        val result = ShortArray(indices.size)
//        var targetIndex = 0
//        for (sourceIndex in indices) {
//            result[targetIndex++] = this[sourceIndex]
//        }
//        return result
//    }
//
//    /**
//     * Returns an array containing elements of this array at specified [indices].
//     */
//    public fun IntArray.sliceArray(indices: Collection<Int>): IntArray {
//        val result = IntArray(indices.size)
//        var targetIndex = 0
//        for (sourceIndex in indices) {
//            result[targetIndex++] = this[sourceIndex]
//        }
//        return result
//    }
//
//    /**
//     * Returns an array containing elements of this array at specified [indices].
//     */
//    public fun LongArray.sliceArray(indices: Collection<Int>): LongArray {
//        val result = LongArray(indices.size)
//        var targetIndex = 0
//        for (sourceIndex in indices) {
//            result[targetIndex++] = this[sourceIndex]
//        }
//        return result
//    }
//
//    /**
//     * Returns an array containing elements of this array at specified [indices].
//     */
//    public fun FloatArray.sliceArray(indices: Collection<Int>): FloatArray {
//        val result = FloatArray(indices.size)
//        var targetIndex = 0
//        for (sourceIndex in indices) {
//            result[targetIndex++] = this[sourceIndex]
//        }
//        return result
//    }
//
//    /**
//     * Returns an array containing elements of this array at specified [indices].
//     */
//    public fun DoubleArray.sliceArray(indices: Collection<Int>): DoubleArray {
//        val result = DoubleArray(indices.size)
//        var targetIndex = 0
//        for (sourceIndex in indices) {
//            result[targetIndex++] = this[sourceIndex]
//        }
//        return result
//    }
//
//    /**
//     * Returns an array containing elements of this array at specified [indices].
//     */
//    public fun BooleanArray.sliceArray(indices: Collection<Int>): BooleanArray {
//        val result = BooleanArray(indices.size)
//        var targetIndex = 0
//        for (sourceIndex in indices) {
//            result[targetIndex++] = this[sourceIndex]
//        }
//        return result
//    }
//
//    /**
//     * Returns an array containing elements of this array at specified [indices].
//     */
//    public fun CharArray.sliceArray(indices: Collection<Int>): CharArray {
//        val result = CharArray(indices.size)
//        var targetIndex = 0
//        for (sourceIndex in indices) {
//            result[targetIndex++] = this[sourceIndex]
//        }
//        return result
//    }
//
//    /**
//     * Returns a list containing elements at indices in the specified [indices] range.
//     */
//    public fun <T> Array<T>.sliceArray(indices: IntRange): Array<T> {
//        if (indices.isEmpty()) return copyOfRange(0, 0)
//        return copyOfRange(indices.start, indices.endInclusive + 1)
//    }
//
//    /**
//     * Returns a list containing elements at indices in the specified [indices] range.
//     */
//    public fun ByteArray.sliceArray(indices: IntRange): ByteArray {
//        if (indices.isEmpty()) return ByteArray(0)
//        return copyOfRange(indices.start, indices.endInclusive + 1)
//    }
//
//    /**
//     * Returns a list containing elements at indices in the specified [indices] range.
//     */
//    public fun ShortArray.sliceArray(indices: IntRange): ShortArray {
//        if (indices.isEmpty()) return ShortArray(0)
//        return copyOfRange(indices.start, indices.endInclusive + 1)
//    }
//
//    /**
//     * Returns a list containing elements at indices in the specified [indices] range.
//     */
//    public fun IntArray.sliceArray(indices: IntRange): IntArray {
//        if (indices.isEmpty()) return IntArray(0)
//        return copyOfRange(indices.start, indices.endInclusive + 1)
//    }
//
//    /**
//     * Returns a list containing elements at indices in the specified [indices] range.
//     */
//    public fun LongArray.sliceArray(indices: IntRange): LongArray {
//        if (indices.isEmpty()) return LongArray(0)
//        return copyOfRange(indices.start, indices.endInclusive + 1)
//    }
//
//    /**
//     * Returns a list containing elements at indices in the specified [indices] range.
//     */
//    public fun FloatArray.sliceArray(indices: IntRange): FloatArray {
//        if (indices.isEmpty()) return FloatArray(0)
//        return copyOfRange(indices.start, indices.endInclusive + 1)
//    }
//
//    /**
//     * Returns a list containing elements at indices in the specified [indices] range.
//     */
//    public fun DoubleArray.sliceArray(indices: IntRange): DoubleArray {
//        if (indices.isEmpty()) return DoubleArray(0)
//        return copyOfRange(indices.start, indices.endInclusive + 1)
//    }
//
//    /**
//     * Returns a list containing elements at indices in the specified [indices] range.
//     */
//    public fun BooleanArray.sliceArray(indices: IntRange): BooleanArray {
//        if (indices.isEmpty()) return BooleanArray(0)
//        return copyOfRange(indices.start, indices.endInclusive + 1)
//    }
//
//    /**
//     * Returns a list containing elements at indices in the specified [indices] range.
//     */
//    public fun CharArray.sliceArray(indices: IntRange): CharArray {
//        if (indices.isEmpty()) return CharArray(0)
//        return copyOfRange(indices.start, indices.endInclusive + 1)
//    }
//
//    /**
//     * Returns a list containing first [n] elements.
//     */
//    public fun <T> Array<out T>.take(n: Int): List<T> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        if (n == 0) return emptyList()
//        if (n >= size) return toList()
//        if (n == 1) return listOf(this[0])
//        var count = 0
//        val list = ArrayList<T>(n)
//        for (item in this) {
//            if (count++ == n)
//                break
//                list.add(item)
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing first [n] elements.
//     */
//    public fun ByteArray.take(n: Int): List<Byte> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        if (n == 0) return emptyList()
//        if (n >= size) return toList()
//        if (n == 1) return listOf(this[0])
//        var count = 0
//        val list = ArrayList<Byte>(n)
//        for (item in this) {
//            if (count++ == n)
//                break
//                list.add(item)
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing first [n] elements.
//     */
//    public fun ShortArray.take(n: Int): List<Short> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        if (n == 0) return emptyList()
//        if (n >= size) return toList()
//        if (n == 1) return listOf(this[0])
//        var count = 0
//        val list = ArrayList<Short>(n)
//        for (item in this) {
//            if (count++ == n)
//                break
//                list.add(item)
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing first [n] elements.
//     */
//    public fun IntArray.take(n: Int): List<Int> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        if (n == 0) return emptyList()
//        if (n >= size) return toList()
//        if (n == 1) return listOf(this[0])
//        var count = 0
//        val list = ArrayList<Int>(n)
//        for (item in this) {
//            if (count++ == n)
//                break
//                list.add(item)
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing first [n] elements.
//     */
//    public fun LongArray.take(n: Int): List<Long> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        if (n == 0) return emptyList()
//        if (n >= size) return toList()
//        if (n == 1) return listOf(this[0])
//        var count = 0
//        val list = ArrayList<Long>(n)
//        for (item in this) {
//            if (count++ == n)
//                break
//                list.add(item)
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing first [n] elements.
//     */
//    public fun FloatArray.take(n: Int): List<Float> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        if (n == 0) return emptyList()
//        if (n >= size) return toList()
//        if (n == 1) return listOf(this[0])
//        var count = 0
//        val list = ArrayList<Float>(n)
//        for (item in this) {
//            if (count++ == n)
//                break
//                list.add(item)
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing first [n] elements.
//     */
//    public fun DoubleArray.take(n: Int): List<Double> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        if (n == 0) return emptyList()
//        if (n >= size) return toList()
//        if (n == 1) return listOf(this[0])
//        var count = 0
//        val list = ArrayList<Double>(n)
//        for (item in this) {
//            if (count++ == n)
//                break
//                list.add(item)
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing first [n] elements.
//     */
//    public fun BooleanArray.take(n: Int): List<Boolean> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        if (n == 0) return emptyList()
//        if (n >= size) return toList()
//        if (n == 1) return listOf(this[0])
//        var count = 0
//        val list = ArrayList<Boolean>(n)
//        for (item in this) {
//            if (count++ == n)
//                break
//                list.add(item)
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing first [n] elements.
//     */
//    public fun CharArray.take(n: Int): List<Char> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        if (n == 0) return emptyList()
//        if (n >= size) return toList()
//        if (n == 1) return listOf(this[0])
//        var count = 0
//        val list = ArrayList<Char>(n)
//        for (item in this) {
//            if (count++ == n)
//                break
//                list.add(item)
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing last [n] elements.
//     */
//    public fun <T> Array<out T>.takeLast(n: Int): List<T> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        if (n == 0) return emptyList()
//        val size = size
//        if (n >= size) return toList()
//        if (n == 1) return listOf(this[size - 1])
//        val list = ArrayList<T>(n)
//        for (index in size - n until size)
//        list.add(this[index])
//        return list
//    }
//
//    /**
//     * Returns a list containing last [n] elements.
//     */
//    public fun ByteArray.takeLast(n: Int): List<Byte> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        if (n == 0) return emptyList()
//        val size = size
//        if (n >= size) return toList()
//        if (n == 1) return listOf(this[size - 1])
//        val list = ArrayList<Byte>(n)
//        for (index in size - n until size)
//        list.add(this[index])
//        return list
//    }
//
//    /**
//     * Returns a list containing last [n] elements.
//     */
//    public fun ShortArray.takeLast(n: Int): List<Short> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        if (n == 0) return emptyList()
//        val size = size
//        if (n >= size) return toList()
//        if (n == 1) return listOf(this[size - 1])
//        val list = ArrayList<Short>(n)
//        for (index in size - n until size)
//        list.add(this[index])
//        return list
//    }
//
//    /**
//     * Returns a list containing last [n] elements.
//     */
//    public fun IntArray.takeLast(n: Int): List<Int> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        if (n == 0) return emptyList()
//        val size = size
//        if (n >= size) return toList()
//        if (n == 1) return listOf(this[size - 1])
//        val list = ArrayList<Int>(n)
//        for (index in size - n until size)
//        list.add(this[index])
//        return list
//    }
//
//    /**
//     * Returns a list containing last [n] elements.
//     */
//    public fun LongArray.takeLast(n: Int): List<Long> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        if (n == 0) return emptyList()
//        val size = size
//        if (n >= size) return toList()
//        if (n == 1) return listOf(this[size - 1])
//        val list = ArrayList<Long>(n)
//        for (index in size - n until size)
//        list.add(this[index])
//        return list
//    }
//
//    /**
//     * Returns a list containing last [n] elements.
//     */
//    public fun FloatArray.takeLast(n: Int): List<Float> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        if (n == 0) return emptyList()
//        val size = size
//        if (n >= size) return toList()
//        if (n == 1) return listOf(this[size - 1])
//        val list = ArrayList<Float>(n)
//        for (index in size - n until size)
//        list.add(this[index])
//        return list
//    }
//
//    /**
//     * Returns a list containing last [n] elements.
//     */
//    public fun DoubleArray.takeLast(n: Int): List<Double> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        if (n == 0) return emptyList()
//        val size = size
//        if (n >= size) return toList()
//        if (n == 1) return listOf(this[size - 1])
//        val list = ArrayList<Double>(n)
//        for (index in size - n until size)
//        list.add(this[index])
//        return list
//    }
//
//    /**
//     * Returns a list containing last [n] elements.
//     */
//    public fun BooleanArray.takeLast(n: Int): List<Boolean> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        if (n == 0) return emptyList()
//        val size = size
//        if (n >= size) return toList()
//        if (n == 1) return listOf(this[size - 1])
//        val list = ArrayList<Boolean>(n)
//        for (index in size - n until size)
//        list.add(this[index])
//        return list
//    }
//
//    /**
//     * Returns a list containing last [n] elements.
//     */
//    public fun CharArray.takeLast(n: Int): List<Char> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        if (n == 0) return emptyList()
//        val size = size
//        if (n >= size) return toList()
//        if (n == 1) return listOf(this[size - 1])
//        val list = ArrayList<Char>(n)
//        for (index in size - n until size)
//        list.add(this[index])
//        return list
//    }
//
//    /**
//     * Returns a list containing last elements satisfying the given [predicate].
//     */
//    public inline fun <T> Array<out T>.takeLastWhile(predicate: (T) -> Boolean): List<T> {
//        for (index in lastIndex downTo 0) {
//            if (!predicate(this[index])) {
//                return drop(index + 1)
//            }
//        }
//        return toList()
//    }
//
//    /**
//     * Returns a list containing last elements satisfying the given [predicate].
//     */
//    public inline fun ByteArray.takeLastWhile(predicate: (Byte) -> Boolean): List<Byte> {
//        for (index in lastIndex downTo 0) {
//            if (!predicate(this[index])) {
//                return drop(index + 1)
//            }
//        }
//        return toList()
//    }
//
//    /**
//     * Returns a list containing last elements satisfying the given [predicate].
//     */
//    public inline fun ShortArray.takeLastWhile(predicate: (Short) -> Boolean): List<Short> {
//        for (index in lastIndex downTo 0) {
//            if (!predicate(this[index])) {
//                return drop(index + 1)
//            }
//        }
//        return toList()
//    }
//
//    /**
//     * Returns a list containing last elements satisfying the given [predicate].
//     */
//    public inline fun IntArray.takeLastWhile(predicate: (Int) -> Boolean): List<Int> {
//        for (index in lastIndex downTo 0) {
//            if (!predicate(this[index])) {
//                return drop(index + 1)
//            }
//        }
//        return toList()
//    }
//
//    /**
//     * Returns a list containing last elements satisfying the given [predicate].
//     */
//    public inline fun LongArray.takeLastWhile(predicate: (Long) -> Boolean): List<Long> {
//        for (index in lastIndex downTo 0) {
//            if (!predicate(this[index])) {
//                return drop(index + 1)
//            }
//        }
//        return toList()
//    }
//
//    /**
//     * Returns a list containing last elements satisfying the given [predicate].
//     */
//    public inline fun FloatArray.takeLastWhile(predicate: (Float) -> Boolean): List<Float> {
//        for (index in lastIndex downTo 0) {
//            if (!predicate(this[index])) {
//                return drop(index + 1)
//            }
//        }
//        return toList()
//    }
//
//    /**
//     * Returns a list containing last elements satisfying the given [predicate].
//     */
//    public inline fun DoubleArray.takeLastWhile(predicate: (Double) -> Boolean): List<Double> {
//        for (index in lastIndex downTo 0) {
//            if (!predicate(this[index])) {
//                return drop(index + 1)
//            }
//        }
//        return toList()
//    }
//
//    /**
//     * Returns a list containing last elements satisfying the given [predicate].
//     */
//    public inline fun BooleanArray.takeLastWhile(predicate: (Boolean) -> Boolean): List<Boolean> {
//        for (index in lastIndex downTo 0) {
//            if (!predicate(this[index])) {
//                return drop(index + 1)
//            }
//        }
//        return toList()
//    }
//
//    /**
//     * Returns a list containing last elements satisfying the given [predicate].
//     */
//    public inline fun CharArray.takeLastWhile(predicate: (Char) -> Boolean): List<Char> {
//        for (index in lastIndex downTo 0) {
//            if (!predicate(this[index])) {
//                return drop(index + 1)
//            }
//        }
//        return toList()
//    }
//
//    /**
//     * Returns a list containing first elements satisfying the given [predicate].
//     */
//    public inline fun <T> Array<out T>.takeWhile(predicate: (T) -> Boolean): List<T> {
//        val list = ArrayList<T>()
//        for (item in this) {
//            if (!predicate(item))
//                break
//                list.add(item)
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing first elements satisfying the given [predicate].
//     */
//    public inline fun ByteArray.takeWhile(predicate: (Byte) -> Boolean): List<Byte> {
//        val list = ArrayList<Byte>()
//        for (item in this) {
//            if (!predicate(item))
//                break
//                list.add(item)
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing first elements satisfying the given [predicate].
//     */
//    public inline fun ShortArray.takeWhile(predicate: (Short) -> Boolean): List<Short> {
//        val list = ArrayList<Short>()
//        for (item in this) {
//            if (!predicate(item))
//                break
//                list.add(item)
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing first elements satisfying the given [predicate].
//     */
//    public inline fun IntArray.takeWhile(predicate: (Int) -> Boolean): List<Int> {
//        val list = ArrayList<Int>()
//        for (item in this) {
//            if (!predicate(item))
//                break
//                list.add(item)
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing first elements satisfying the given [predicate].
//     */
//    public inline fun LongArray.takeWhile(predicate: (Long) -> Boolean): List<Long> {
//        val list = ArrayList<Long>()
//        for (item in this) {
//            if (!predicate(item))
//                break
//                list.add(item)
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing first elements satisfying the given [predicate].
//     */
//    public inline fun FloatArray.takeWhile(predicate: (Float) -> Boolean): List<Float> {
//        val list = ArrayList<Float>()
//        for (item in this) {
//            if (!predicate(item))
//                break
//                list.add(item)
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing first elements satisfying the given [predicate].
//     */
//    public inline fun DoubleArray.takeWhile(predicate: (Double) -> Boolean): List<Double> {
//        val list = ArrayList<Double>()
//        for (item in this) {
//            if (!predicate(item))
//                break
//                list.add(item)
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing first elements satisfying the given [predicate].
//     */
//    public inline fun BooleanArray.takeWhile(predicate: (Boolean) -> Boolean): List<Boolean> {
//        val list = ArrayList<Boolean>()
//        for (item in this) {
//            if (!predicate(item))
//                break
//                list.add(item)
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing first elements satisfying the given [predicate].
//     */
//    public inline fun CharArray.takeWhile(predicate: (Char) -> Boolean): List<Char> {
//        val list = ArrayList<Char>()
//        for (item in this) {
//            if (!predicate(item))
//                break
//                list.add(item)
//        }
//        return list
//    }
//
//    /**
//     * Reverses elements in the array in-place.
//     */
//    public fun <T> Array<T>.reverse(): Unit {
//        val midPoint = (size / 2) - 1
//        if (midPoint < 0) return
//                var reverseIndex = lastIndex
//        for (index in 0..midPoint) {
//            val tmp = this[index]
//            this[index] = this[reverseIndex]
//            this[reverseIndex] = tmp
//            reverseIndex--
//        }
//    }
//
//    /**
//     * Reverses elements in the array in-place.
//     */
//    public fun ByteArray.reverse(): Unit {
//        val midPoint = (size / 2) - 1
//        if (midPoint < 0) return
//                var reverseIndex = lastIndex
//        for (index in 0..midPoint) {
//            val tmp = this[index]
//            this[index] = this[reverseIndex]
//            this[reverseIndex] = tmp
//            reverseIndex--
//        }
//    }
//
//    /**
//     * Reverses elements in the array in-place.
//     */
//    public fun ShortArray.reverse(): Unit {
//        val midPoint = (size / 2) - 1
//        if (midPoint < 0) return
//                var reverseIndex = lastIndex
//        for (index in 0..midPoint) {
//            val tmp = this[index]
//            this[index] = this[reverseIndex]
//            this[reverseIndex] = tmp
//            reverseIndex--
//        }
//    }
//
//    /**
//     * Reverses elements in the array in-place.
//     */
//    public fun IntArray.reverse(): Unit {
//        val midPoint = (size / 2) - 1
//        if (midPoint < 0) return
//                var reverseIndex = lastIndex
//        for (index in 0..midPoint) {
//            val tmp = this[index]
//            this[index] = this[reverseIndex]
//            this[reverseIndex] = tmp
//            reverseIndex--
//        }
//    }
//
//    /**
//     * Reverses elements in the array in-place.
//     */
//    public fun LongArray.reverse(): Unit {
//        val midPoint = (size / 2) - 1
//        if (midPoint < 0) return
//                var reverseIndex = lastIndex
//        for (index in 0..midPoint) {
//            val tmp = this[index]
//            this[index] = this[reverseIndex]
//            this[reverseIndex] = tmp
//            reverseIndex--
//        }
//    }
//
//    /**
//     * Reverses elements in the array in-place.
//     */
//    public fun FloatArray.reverse(): Unit {
//        val midPoint = (size / 2) - 1
//        if (midPoint < 0) return
//                var reverseIndex = lastIndex
//        for (index in 0..midPoint) {
//            val tmp = this[index]
//            this[index] = this[reverseIndex]
//            this[reverseIndex] = tmp
//            reverseIndex--
//        }
//    }
//
//    /**
//     * Reverses elements in the array in-place.
//     */
//    public fun DoubleArray.reverse(): Unit {
//        val midPoint = (size / 2) - 1
//        if (midPoint < 0) return
//                var reverseIndex = lastIndex
//        for (index in 0..midPoint) {
//            val tmp = this[index]
//            this[index] = this[reverseIndex]
//            this[reverseIndex] = tmp
//            reverseIndex--
//        }
//    }
//
//    /**
//     * Reverses elements in the array in-place.
//     */
//    public fun BooleanArray.reverse(): Unit {
//        val midPoint = (size / 2) - 1
//        if (midPoint < 0) return
//                var reverseIndex = lastIndex
//        for (index in 0..midPoint) {
//            val tmp = this[index]
//            this[index] = this[reverseIndex]
//            this[reverseIndex] = tmp
//            reverseIndex--
//        }
//    }
//
//    /**
//     * Reverses elements in the array in-place.
//     */
//    public fun CharArray.reverse(): Unit {
//        val midPoint = (size / 2) - 1
//        if (midPoint < 0) return
//                var reverseIndex = lastIndex
//        for (index in 0..midPoint) {
//            val tmp = this[index]
//            this[index] = this[reverseIndex]
//            this[reverseIndex] = tmp
//            reverseIndex--
//        }
//    }
//
//    /**
//     * Returns a list with elements in reversed order.
//     */
//    public fun <T> Array<out T>.reversed(): List<T> {
//        if (isEmpty()) return emptyList()
//        val list = toMutableList()
//        list.reverse()
//        return list
//    }
//
//    /**
//     * Returns a list with elements in reversed order.
//     */
//    public fun ByteArray.reversed(): List<Byte> {
//        if (isEmpty()) return emptyList()
//        val list = toMutableList()
//        list.reverse()
//        return list
//    }
//
//    /**
//     * Returns a list with elements in reversed order.
//     */
//    public fun ShortArray.reversed(): List<Short> {
//        if (isEmpty()) return emptyList()
//        val list = toMutableList()
//        list.reverse()
//        return list
//    }
//
//    /**
//     * Returns a list with elements in reversed order.
//     */
//    public fun IntArray.reversed(): List<Int> {
//        if (isEmpty()) return emptyList()
//        val list = toMutableList()
//        list.reverse()
//        return list
//    }
//
//    /**
//     * Returns a list with elements in reversed order.
//     */
//    public fun LongArray.reversed(): List<Long> {
//        if (isEmpty()) return emptyList()
//        val list = toMutableList()
//        list.reverse()
//        return list
//    }
//
//    /**
//     * Returns a list with elements in reversed order.
//     */
//    public fun FloatArray.reversed(): List<Float> {
//        if (isEmpty()) return emptyList()
//        val list = toMutableList()
//        list.reverse()
//        return list
//    }
//
//    /**
//     * Returns a list with elements in reversed order.
//     */
//    public fun DoubleArray.reversed(): List<Double> {
//        if (isEmpty()) return emptyList()
//        val list = toMutableList()
//        list.reverse()
//        return list
//    }
//
//    /**
//     * Returns a list with elements in reversed order.
//     */
//    public fun BooleanArray.reversed(): List<Boolean> {
//        if (isEmpty()) return emptyList()
//        val list = toMutableList()
//        list.reverse()
//        return list
//    }
//
//    /**
//     * Returns a list with elements in reversed order.
//     */
//    public fun CharArray.reversed(): List<Char> {
//        if (isEmpty()) return emptyList()
//        val list = toMutableList()
//        list.reverse()
//        return list
//    }
//
//    /**
//     * Returns an array with elements of this array in reversed order.
//     */
//    public fun <T> Array<T>.reversedArray(): Array<T> {
//        if (isEmpty()) return this
//        val result = arrayOfNulls(this, size)
//        val lastIndex = lastIndex
//        for (i in 0..lastIndex)
//            result[lastIndex - i] = this[i]
//        return result
//    }
//
//    /**
//     * Returns an array with elements of this array in reversed order.
//     */
//    public fun ByteArray.reversedArray(): ByteArray {
//        if (isEmpty()) return this
//        val result = ByteArray(size)
//        val lastIndex = lastIndex
//        for (i in 0..lastIndex)
//            result[lastIndex - i] = this[i]
//        return result
//    }
//
//    /**
//     * Returns an array with elements of this array in reversed order.
//     */
//    public fun ShortArray.reversedArray(): ShortArray {
//        if (isEmpty()) return this
//        val result = ShortArray(size)
//        val lastIndex = lastIndex
//        for (i in 0..lastIndex)
//            result[lastIndex - i] = this[i]
//        return result
//    }
//
//    /**
//     * Returns an array with elements of this array in reversed order.
//     */
//    public fun IntArray.reversedArray(): IntArray {
//        if (isEmpty()) return this
//        val result = IntArray(size)
//        val lastIndex = lastIndex
//        for (i in 0..lastIndex)
//            result[lastIndex - i] = this[i]
//        return result
//    }
//
//    /**
//     * Returns an array with elements of this array in reversed order.
//     */
//    public fun LongArray.reversedArray(): LongArray {
//        if (isEmpty()) return this
//        val result = LongArray(size)
//        val lastIndex = lastIndex
//        for (i in 0..lastIndex)
//            result[lastIndex - i] = this[i]
//        return result
//    }
//
//    /**
//     * Returns an array with elements of this array in reversed order.
//     */
//    public fun FloatArray.reversedArray(): FloatArray {
//        if (isEmpty()) return this
//        val result = FloatArray(size)
//        val lastIndex = lastIndex
//        for (i in 0..lastIndex)
//            result[lastIndex - i] = this[i]
//        return result
//    }
//
//    /**
//     * Returns an array with elements of this array in reversed order.
//     */
//    public fun DoubleArray.reversedArray(): DoubleArray {
//        if (isEmpty()) return this
//        val result = DoubleArray(size)
//        val lastIndex = lastIndex
//        for (i in 0..lastIndex)
//            result[lastIndex - i] = this[i]
//        return result
//    }
//
//    /**
//     * Returns an array with elements of this array in reversed order.
//     */
//    public fun BooleanArray.reversedArray(): BooleanArray {
//        if (isEmpty()) return this
//        val result = BooleanArray(size)
//        val lastIndex = lastIndex
//        for (i in 0..lastIndex)
//            result[lastIndex - i] = this[i]
//        return result
//    }
//
//    /**
//     * Returns an array with elements of this array in reversed order.
//     */
//    public fun CharArray.reversedArray(): CharArray {
//        if (isEmpty()) return this
//        val result = CharArray(size)
//        val lastIndex = lastIndex
//        for (i in 0..lastIndex)
//            result[lastIndex - i] = this[i]
//        return result
//    }
//
//
//    /**
//     * Returns `true` if the two specified arrays are *deeply* equal to one another,
//     * i.e. contain the same number of the same elements in the same order.
//     *
//     * If two corresponding elements are nested arrays, they are also compared deeply.
//     * If any of arrays contains itself on any nesting level the behavior is undefined.
//     */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline infix fun <T> Array<out T>.contentDeepEquals(other: Array<out T>): Boolean {
//        return java.util.Arrays.deepEquals(this, other)
//    }
//
///**
// * Returns a hash code based on the contents of this array as if it is [List].
// * Nested arrays are treated as lists too.
// *
// * If any of arrays contains itself on any nesting level the behavior is undefined.
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline fun <T> Array<out T>.contentDeepHashCode(): Int {
//        return java.util.Arrays.deepHashCode(this)
//    }
//
///**
// * Returns a string representation of the contents of this array as if it is a [List].
// * Nested arrays are treated as lists too.
// *
// * If any of arrays contains itself on any nesting level that reference
// * is rendered as `"[...]"` to prevent recursion.
// *
// * @sample samples.collections.Arrays.ContentOperations.contentDeepToString
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline fun <T> Array<out T>.contentDeepToString(): String {
//        return java.util.Arrays.deepToString(this)
//    }
//
///**
// * Returns `true` if the two specified arrays are *structurally* equal to one another,
// * i.e. contain the same number of the same elements in the same order.
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline infix fun <T> Array<out T>.contentEquals(other: Array<out T>): Boolean {
//        return java.util.Arrays.equals(this, other)
//    }
//
///**
// * Returns `true` if the two specified arrays are *structurally* equal to one another,
// * i.e. contain the same number of the same elements in the same order.
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline infix fun ByteArray.contentEquals(other: ByteArray): Boolean {
//        return java.util.Arrays.equals(this, other)
//    }
//
///**
// * Returns `true` if the two specified arrays are *structurally* equal to one another,
// * i.e. contain the same number of the same elements in the same order.
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline infix fun ShortArray.contentEquals(other: ShortArray): Boolean {
//        return java.util.Arrays.equals(this, other)
//    }
//
///**
// * Returns `true` if the two specified arrays are *structurally* equal to one another,
// * i.e. contain the same number of the same elements in the same order.
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline infix fun IntArray.contentEquals(other: IntArray): Boolean {
//        return java.util.Arrays.equals(this, other)
//    }
//
///**
// * Returns `true` if the two specified arrays are *structurally* equal to one another,
// * i.e. contain the same number of the same elements in the same order.
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline infix fun LongArray.contentEquals(other: LongArray): Boolean {
//        return java.util.Arrays.equals(this, other)
//    }
//
///**
// * Returns `true` if the two specified arrays are *structurally* equal to one another,
// * i.e. contain the same number of the same elements in the same order.
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline infix fun FloatArray.contentEquals(other: FloatArray): Boolean {
//        return java.util.Arrays.equals(this, other)
//    }
//
///**
// * Returns `true` if the two specified arrays are *structurally* equal to one another,
// * i.e. contain the same number of the same elements in the same order.
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline infix fun DoubleArray.contentEquals(other: DoubleArray): Boolean {
//        return java.util.Arrays.equals(this, other)
//    }
//
///**
// * Returns `true` if the two specified arrays are *structurally* equal to one another,
// * i.e. contain the same number of the same elements in the same order.
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline infix fun BooleanArray.contentEquals(other: BooleanArray): Boolean {
//        return java.util.Arrays.equals(this, other)
//    }
//
///**
// * Returns `true` if the two specified arrays are *structurally* equal to one another,
// * i.e. contain the same number of the same elements in the same order.
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline infix fun CharArray.contentEquals(other: CharArray): Boolean {
//        return java.util.Arrays.equals(this, other)
//    }
//
///**
// * Returns a hash code based on the contents of this array as if it is [List].
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline fun <T> Array<out T>.contentHashCode(): Int {
//        return java.util.Arrays.hashCode(this)
//    }
//
///**
// * Returns a hash code based on the contents of this array as if it is [List].
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline fun ByteArray.contentHashCode(): Int {
//        return java.util.Arrays.hashCode(this)
//    }
//
///**
// * Returns a hash code based on the contents of this array as if it is [List].
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline fun ShortArray.contentHashCode(): Int {
//        return java.util.Arrays.hashCode(this)
//    }
//
///**
// * Returns a hash code based on the contents of this array as if it is [List].
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline fun IntArray.contentHashCode(): Int {
//        return java.util.Arrays.hashCode(this)
//    }
//
///**
// * Returns a hash code based on the contents of this array as if it is [List].
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline fun LongArray.contentHashCode(): Int {
//        return java.util.Arrays.hashCode(this)
//    }
//
///**
// * Returns a hash code based on the contents of this array as if it is [List].
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline fun FloatArray.contentHashCode(): Int {
//        return java.util.Arrays.hashCode(this)
//    }
//
///**
// * Returns a hash code based on the contents of this array as if it is [List].
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline fun DoubleArray.contentHashCode(): Int {
//        return java.util.Arrays.hashCode(this)
//    }
//
///**
// * Returns a hash code based on the contents of this array as if it is [List].
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline fun BooleanArray.contentHashCode(): Int {
//        return java.util.Arrays.hashCode(this)
//    }
//
///**
// * Returns a hash code based on the contents of this array as if it is [List].
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline fun CharArray.contentHashCode(): Int {
//        return java.util.Arrays.hashCode(this)
//    }
//
///**
// * Returns a string representation of the contents of the specified array as if it is [List].
// *
// * @sample samples.collections.Arrays.ContentOperations.contentToString
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline fun <T> Array<out T>.contentToString(): String {
//        return java.util.Arrays.toString(this)
//    }
//
///**
// * Returns a string representation of the contents of the specified array as if it is [List].
// *
// * @sample samples.collections.Arrays.ContentOperations.contentToString
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline fun ByteArray.contentToString(): String {
//        return java.util.Arrays.toString(this)
//    }
//
///**
// * Returns a string representation of the contents of the specified array as if it is [List].
// *
// * @sample samples.collections.Arrays.ContentOperations.contentToString
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline fun ShortArray.contentToString(): String {
//        return java.util.Arrays.toString(this)
//    }
//
///**
// * Returns a string representation of the contents of the specified array as if it is [List].
// *
// * @sample samples.collections.Arrays.ContentOperations.contentToString
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline fun IntArray.contentToString(): String {
//        return java.util.Arrays.toString(this)
//    }
//
///**
// * Returns a string representation of the contents of the specified array as if it is [List].
// *
// * @sample samples.collections.Arrays.ContentOperations.contentToString
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline fun LongArray.contentToString(): String {
//        return java.util.Arrays.toString(this)
//    }
//
///**
// * Returns a string representation of the contents of the specified array as if it is [List].
// *
// * @sample samples.collections.Arrays.ContentOperations.contentToString
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline fun FloatArray.contentToString(): String {
//        return java.util.Arrays.toString(this)
//    }
//
///**
// * Returns a string representation of the contents of the specified array as if it is [List].
// *
// * @sample samples.collections.Arrays.ContentOperations.contentToString
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline fun DoubleArray.contentToString(): String {
//        return java.util.Arrays.toString(this)
//    }
//
///**
// * Returns a string representation of the contents of the specified array as if it is [List].
// *
// * @sample samples.collections.Arrays.ContentOperations.contentToString
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline fun BooleanArray.contentToString(): String {
//        return java.util.Arrays.toString(this)
//    }
//
///**
// * Returns a string representation of the contents of the specified array as if it is [List].
// *
// * @sample samples.collections.Arrays.ContentOperations.contentToString
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline fun CharArray.contentToString(): String {
//        return java.util.Arrays.toString(this)
//    }
//
//
//    /**
//     * Returns an array containing all elements of the original array and then the given [element].
//     */
//    public operator fun <T> Array<T>.plus(element: T): Array<T> {
//        val index = size
//        val result = java.util.Arrays.copyOf(this, index + 1)
//        result[index] = element
//        return result
//    }
//
//    /**
//     * Returns an array containing all elements of the original array and then the given [element].
//     */
//    public operator fun ByteArray.plus(element: Byte): ByteArray {
//        val index = size
//        val result = java.util.Arrays.copyOf(this, index + 1)
//        result[index] = element
//        return result
//    }
//
//    /**
//     * Returns an array containing all elements of the original array and then the given [element].
//     */
//    public operator fun ShortArray.plus(element: Short): ShortArray {
//        val index = size
//        val result = java.util.Arrays.copyOf(this, index + 1)
//        result[index] = element
//        return result
//    }
//
//    /**
//     * Returns an array containing all elements of the original array and then the given [element].
//     */
//    public operator fun IntArray.plus(element: Int): IntArray {
//        val index = size
//        val result = java.util.Arrays.copyOf(this, index + 1)
//        result[index] = element
//        return result
//    }
//
//    /**
//     * Returns an array containing all elements of the original array and then the given [element].
//     */
//    public operator fun LongArray.plus(element: Long): LongArray {
//        val index = size
//        val result = java.util.Arrays.copyOf(this, index + 1)
//        result[index] = element
//        return result
//    }
//
//    /**
//     * Returns an array containing all elements of the original array and then the given [element].
//     */
//    public operator fun FloatArray.plus(element: Float): FloatArray {
//        val index = size
//        val result = java.util.Arrays.copyOf(this, index + 1)
//        result[index] = element
//        return result
//    }
//
//    /**
//     * Returns an array containing all elements of the original array and then the given [element].
//     */
//    public operator fun DoubleArray.plus(element: Double): DoubleArray {
//        val index = size
//        val result = java.util.Arrays.copyOf(this, index + 1)
//        result[index] = element
//        return result
//    }
//
//    /**
//     * Returns an array containing all elements of the original array and then the given [element].
//     */
//    public operator fun BooleanArray.plus(element: Boolean): BooleanArray {
//        val index = size
//        val result = java.util.Arrays.copyOf(this, index + 1)
//        result[index] = element
//        return result
//    }
//
//    /**
//     * Returns an array containing all elements of the original array and then the given [element].
//     */
//    public operator fun CharArray.plus(element: Char): CharArray {
//        val index = size
//        val result = java.util.Arrays.copyOf(this, index + 1)
//        result[index] = element
//        return result
//    }
//
//    /**
//     * Returns an array containing all elements of the original array and then all elements of the given [elements] collection.
//     */
//    public operator fun <T> Array<T>.plus(elements: Collection<T>): Array<T> {
//        var index = size
//        val result = java.util.Arrays.copyOf(this, index + elements.size)
//        for (element in elements) result[index++] = element
//        return result
//    }
//
//    /**
//     * Returns an array containing all elements of the original array and then all elements of the given [elements] collection.
//     */
//    public operator fun ByteArray.plus(elements: Collection<Byte>): ByteArray {
//        var index = size
//        val result = java.util.Arrays.copyOf(this, index + elements.size)
//        for (element in elements) result[index++] = element
//        return result
//    }
//
//    /**
//     * Returns an array containing all elements of the original array and then all elements of the given [elements] collection.
//     */
//    public operator fun ShortArray.plus(elements: Collection<Short>): ShortArray {
//        var index = size
//        val result = java.util.Arrays.copyOf(this, index + elements.size)
//        for (element in elements) result[index++] = element
//        return result
//    }
//
//    /**
//     * Returns an array containing all elements of the original array and then all elements of the given [elements] collection.
//     */
//    public operator fun IntArray.plus(elements: Collection<Int>): IntArray {
//        var index = size
//        val result = java.util.Arrays.copyOf(this, index + elements.size)
//        for (element in elements) result[index++] = element
//        return result
//    }
//
//    /**
//     * Returns an array containing all elements of the original array and then all elements of the given [elements] collection.
//     */
//    public operator fun LongArray.plus(elements: Collection<Long>): LongArray {
//        var index = size
//        val result = java.util.Arrays.copyOf(this, index + elements.size)
//        for (element in elements) result[index++] = element
//        return result
//    }
//
//    /**
//     * Returns an array containing all elements of the original array and then all elements of the given [elements] collection.
//     */
//    public operator fun FloatArray.plus(elements: Collection<Float>): FloatArray {
//        var index = size
//        val result = java.util.Arrays.copyOf(this, index + elements.size)
//        for (element in elements) result[index++] = element
//        return result
//    }
//
//    /**
//     * Returns an array containing all elements of the original array and then all elements of the given [elements] collection.
//     */
//    public operator fun DoubleArray.plus(elements: Collection<Double>): DoubleArray {
//        var index = size
//        val result = java.util.Arrays.copyOf(this, index + elements.size)
//        for (element in elements) result[index++] = element
//        return result
//    }
//
//    /**
//     * Returns an array containing all elements of the original array and then all elements of the given [elements] collection.
//     */
//    public operator fun BooleanArray.plus(elements: Collection<Boolean>): BooleanArray {
//        var index = size
//        val result = java.util.Arrays.copyOf(this, index + elements.size)
//        for (element in elements) result[index++] = element
//        return result
//    }
//
//    /**
//     * Returns an array containing all elements of the original array and then all elements of the given [elements] collection.
//     */
//    public operator fun CharArray.plus(elements: Collection<Char>): CharArray {
//        var index = size
//        val result = java.util.Arrays.copyOf(this, index + elements.size)
//        for (element in elements) result[index++] = element
//        return result
//    }
//
//    /**
//     * Returns an array containing all elements of the original array and then all elements of the given [elements] array.
//     */
//    public operator fun <T> Array<T>.plus(elements: Array<out T>): Array<T> {
//        val thisSize = size
//        val arraySize = elements.size
//        val result = java.util.Arrays.copyOf(this, thisSize + arraySize)
//        System.arraycopy(elements, 0, result, thisSize, arraySize)
//        return result
//    }
//
//    /**
//     * Returns an array containing all elements of the original array and then all elements of the given [elements] array.
//     */
//    public operator fun ByteArray.plus(elements: ByteArray): ByteArray {
//        val thisSize = size
//        val arraySize = elements.size
//        val result = java.util.Arrays.copyOf(this, thisSize + arraySize)
//        System.arraycopy(elements, 0, result, thisSize, arraySize)
//        return result
//    }
//
//    /**
//     * Returns an array containing all elements of the original array and then all elements of the given [elements] array.
//     */
//    public operator fun ShortArray.plus(elements: ShortArray): ShortArray {
//        val thisSize = size
//        val arraySize = elements.size
//        val result = java.util.Arrays.copyOf(this, thisSize + arraySize)
//        System.arraycopy(elements, 0, result, thisSize, arraySize)
//        return result
//    }
//
//    /**
//     * Returns an array containing all elements of the original array and then all elements of the given [elements] array.
//     */
//    public operator fun IntArray.plus(elements: IntArray): IntArray {
//        val thisSize = size
//        val arraySize = elements.size
//        val result = java.util.Arrays.copyOf(this, thisSize + arraySize)
//        System.arraycopy(elements, 0, result, thisSize, arraySize)
//        return result
//    }
//
//    /**
//     * Returns an array containing all elements of the original array and then all elements of the given [elements] array.
//     */
//    public operator fun LongArray.plus(elements: LongArray): LongArray {
//        val thisSize = size
//        val arraySize = elements.size
//        val result = java.util.Arrays.copyOf(this, thisSize + arraySize)
//        System.arraycopy(elements, 0, result, thisSize, arraySize)
//        return result
//    }
//
//    /**
//     * Returns an array containing all elements of the original array and then all elements of the given [elements] array.
//     */
//    public operator fun FloatArray.plus(elements: FloatArray): FloatArray {
//        val thisSize = size
//        val arraySize = elements.size
//        val result = java.util.Arrays.copyOf(this, thisSize + arraySize)
//        System.arraycopy(elements, 0, result, thisSize, arraySize)
//        return result
//    }
//
//    /**
//     * Returns an array containing all elements of the original array and then all elements of the given [elements] array.
//     */
//    public operator fun DoubleArray.plus(elements: DoubleArray): DoubleArray {
//        val thisSize = size
//        val arraySize = elements.size
//        val result = java.util.Arrays.copyOf(this, thisSize + arraySize)
//        System.arraycopy(elements, 0, result, thisSize, arraySize)
//        return result
//    }
//
//    /**
//     * Returns an array containing all elements of the original array and then all elements of the given [elements] array.
//     */
//    public operator fun BooleanArray.plus(elements: BooleanArray): BooleanArray {
//        val thisSize = size
//        val arraySize = elements.size
//        val result = java.util.Arrays.copyOf(this, thisSize + arraySize)
//        System.arraycopy(elements, 0, result, thisSize, arraySize)
//        return result
//    }
//
//    /**
//     * Returns an array containing all elements of the original array and then all elements of the given [elements] array.
//     */
//    public operator fun CharArray.plus(elements: CharArray): CharArray {
//        val thisSize = size
//        val arraySize = elements.size
//        val result = java.util.Arrays.copyOf(this, thisSize + arraySize)
//        System.arraycopy(elements, 0, result, thisSize, arraySize)
//        return result
//    }
//
///**
// * Returns an array containing all elements of the original array and then the given [element].
// */
//    @kotlin.internal.InlineOnly
//    public inline fun <T> Array<T>.plusElement(element: T): Array<T> {
//        return plus(element)
//    }
//
//    /**
//     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
//     */
//    public inline fun <T, R> Array<out T>.flatMap(transform: (T) -> Iterable<R>): List<R> {
//        return flatMapTo(ArrayList<R>(), transform)
//    }
//
//    /**
//     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
//     */
//    public inline fun <R> ByteArray.flatMap(transform: (Byte) -> Iterable<R>): List<R> {
//        return flatMapTo(ArrayList<R>(), transform)
//    }
//
//    /**
//     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
//     */
//    public inline fun <R> ShortArray.flatMap(transform: (Short) -> Iterable<R>): List<R> {
//        return flatMapTo(ArrayList<R>(), transform)
//    }
//
//    /**
//     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
//     */
//    public inline fun <R> IntArray.flatMap(transform: (Int) -> Iterable<R>): List<R> {
//        return flatMapTo(ArrayList<R>(), transform)
//    }
//
//    /**
//     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
//     */
//    public inline fun <R> LongArray.flatMap(transform: (Long) -> Iterable<R>): List<R> {
//        return flatMapTo(ArrayList<R>(), transform)
//    }
//
//    /**
//     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
//     */
//    public inline fun <R> FloatArray.flatMap(transform: (Float) -> Iterable<R>): List<R> {
//        return flatMapTo(ArrayList<R>(), transform)
//    }
//
//    /**
//     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
//     */
//    public inline fun <R> DoubleArray.flatMap(transform: (Double) -> Iterable<R>): List<R> {
//        return flatMapTo(ArrayList<R>(), transform)
//    }
//
//    /**
//     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
//     */
//    public inline fun <R> BooleanArray.flatMap(transform: (Boolean) -> Iterable<R>): List<R> {
//        return flatMapTo(ArrayList<R>(), transform)
//    }
//
//    /**
//     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
//     */
//    public inline fun <R> CharArray.flatMap(transform: (Char) -> Iterable<R>): List<R> {
//        return flatMapTo(ArrayList<R>(), transform)
//    }
//
//    /**
//     * Appends all elements yielded from results of [transform] function being invoked on each element of original array, to the given [destination].
//     */
//    public inline fun <T, R, C : MutableCollection<in R>> Array<out T>.flatMapTo(destination: C, transform: (T) -> Iterable<R>): C {
//        for (element in this) {
//            val list = transform(element)
//            destination.addAll(list)
//        }
//        return destination
//    }
//
//    /**
//     * Appends all elements yielded from results of [transform] function being invoked on each element of original array, to the given [destination].
//     */
//    public inline fun <R, C : MutableCollection<in R>> ByteArray.flatMapTo(destination: C, transform: (Byte) -> Iterable<R>): C {
//        for (element in this) {
//            val list = transform(element)
//            destination.addAll(list)
//        }
//        return destination
//    }
//
//    /**
//     * Appends all elements yielded from results of [transform] function being invoked on each element of original array, to the given [destination].
//     */
//    public inline fun <R, C : MutableCollection<in R>> ShortArray.flatMapTo(destination: C, transform: (Short) -> Iterable<R>): C {
//        for (element in this) {
//            val list = transform(element)
//            destination.addAll(list)
//        }
//        return destination
//    }
//
//    /**
//     * Appends all elements yielded from results of [transform] function being invoked on each element of original array, to the given [destination].
//     */
//    public inline fun <R, C : MutableCollection<in R>> IntArray.flatMapTo(destination: C, transform: (Int) -> Iterable<R>): C {
//        for (element in this) {
//            val list = transform(element)
//            destination.addAll(list)
//        }
//        return destination
//    }
//
//    /**
//     * Appends all elements yielded from results of [transform] function being invoked on each element of original array, to the given [destination].
//     */
//    public inline fun <R, C : MutableCollection<in R>> LongArray.flatMapTo(destination: C, transform: (Long) -> Iterable<R>): C {
//        for (element in this) {
//            val list = transform(element)
//            destination.addAll(list)
//        }
//        return destination
//    }
//
//    /**
//     * Appends all elements yielded from results of [transform] function being invoked on each element of original array, to the given [destination].
//     */
//    public inline fun <R, C : MutableCollection<in R>> FloatArray.flatMapTo(destination: C, transform: (Float) -> Iterable<R>): C {
//        for (element in this) {
//            val list = transform(element)
//            destination.addAll(list)
//        }
//        return destination
//    }
//
//    /**
//     * Appends all elements yielded from results of [transform] function being invoked on each element of original array, to the given [destination].
//     */
//    public inline fun <R, C : MutableCollection<in R>> DoubleArray.flatMapTo(destination: C, transform: (Double) -> Iterable<R>): C {
//        for (element in this) {
//            val list = transform(element)
//            destination.addAll(list)
//        }
//        return destination
//    }
//
//    /**
//     * Appends all elements yielded from results of [transform] function being invoked on each element of original array, to the given [destination].
//     */
//    public inline fun <R, C : MutableCollection<in R>> BooleanArray.flatMapTo(destination: C, transform: (Boolean) -> Iterable<R>): C {
//        for (element in this) {
//            val list = transform(element)
//            destination.addAll(list)
//        }
//        return destination
//    }
//
//    /**
//     * Appends all elements yielded from results of [transform] function being invoked on each element of original array, to the given [destination].
//     */
//    public inline fun <R, C : MutableCollection<in R>> CharArray.flatMapTo(destination: C, transform: (Char) -> Iterable<R>): C {
//        for (element in this) {
//            val list = transform(element)
//            destination.addAll(list)
//        }
//        return destination
//    }
//}
