//package me.panpf.javax.util;
//
//public class Arrayx3 {
////
////
////    /**
////     * Returns the last element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public static <T> T[].last(): T {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[lastIndex]
////    }
////
////    /**
////     * Returns the last element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public static byte[].last(): Byte {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[lastIndex]
////    }
////
////    /**
////     * Returns the last element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public static short[].last(): Short {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[lastIndex]
////    }
////
////    /**
////     * Returns the last element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public static int[].last(): Int {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[lastIndex]
////    }
////
////    /**
////     * Returns the last element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public static long[].last(): Long {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[lastIndex]
////    }
////
////    /**
////     * Returns the last element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public static float[].last(): Float {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[lastIndex]
////    }
////
////    /**
////     * Returns the last element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public static double[].last(): Double {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[lastIndex]
////    }
////
////    /**
////     * Returns the last element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public static boolean[].last(): Boolean {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[lastIndex]
////    }
////
////    /**
////     * Returns the last element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public static char[].last(): Char {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[lastIndex]
////    }
////
////    /**
////     * Returns the last element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public static <T> T[].last(predicate: (T) -> Boolean): T {
////        for (index in this.indices.reversed()) {
////            val element = this[index]
////            if (predicate(element)) return element
////        }
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns the last element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public static byte[].last(predicate: (Byte) -> Boolean): Byte {
////        for (index in this.indices.reversed()) {
////            val element = this[index]
////            if (predicate(element)) return element
////        }
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns the last element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public static short[].last(predicate: (Short) -> Boolean): Short {
////        for (index in this.indices.reversed()) {
////            val element = this[index]
////            if (predicate(element)) return element
////        }
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns the last element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public static int[].last(predicate: (Int) -> Boolean): Int {
////        for (index in this.indices.reversed()) {
////            val element = this[index]
////            if (predicate(element)) return element
////        }
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns the last element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public static long[].last(predicate: (Long) -> Boolean): Long {
////        for (index in this.indices.reversed()) {
////            val element = this[index]
////            if (predicate(element)) return element
////        }
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns the last element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public static float[].last(predicate: (Float) -> Boolean): Float {
////        for (index in this.indices.reversed()) {
////            val element = this[index]
////            if (predicate(element)) return element
////        }
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns the last element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public static double[].last(predicate: (Double) -> Boolean): Double {
////        for (index in this.indices.reversed()) {
////            val element = this[index]
////            if (predicate(element)) return element
////        }
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns the last element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public static boolean[].last(predicate: (Boolean) -> Boolean): Boolean {
////        for (index in this.indices.reversed()) {
////            val element = this[index]
////            if (predicate(element)) return element
////        }
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns the last element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public static char[].last(predicate: (Char) -> Boolean): Char {
////        for (index in this.indices.reversed()) {
////            val element = this[index]
////            if (predicate(element)) return element
////        }
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns last index of [element], or -1 if the array does not contain element.
////     */
////    public static <@kotlin.internal.OnlyInputTypes T> T[].lastIndexOf(element: T): Int {
////        if (element == null) {
////            for (index in indices.reversed()) {
////                if (this[index] == null) {
////                    return index
////                }
////            }
////        } else {
////            for (index in indices.reversed()) {
////                if (element == this[index]) {
////                    return index
////                }
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns last index of [element], or -1 if the array does not contain element.
////     */
////    public static byte[].lastIndexOf(element: Byte): Int {
////        for (index in indices.reversed()) {
////            if (element == this[index]) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns last index of [element], or -1 if the array does not contain element.
////     */
////    public static short[].lastIndexOf(element: Short): Int {
////        for (index in indices.reversed()) {
////            if (element == this[index]) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns last index of [element], or -1 if the array does not contain element.
////     */
////    public static int[].lastIndexOf(element: Int): Int {
////        for (index in indices.reversed()) {
////            if (element == this[index]) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns last index of [element], or -1 if the array does not contain element.
////     */
////    public static long[].lastIndexOf(element: Long): Int {
////        for (index in indices.reversed()) {
////            if (element == this[index]) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns last index of [element], or -1 if the array does not contain element.
////     */
////    public static float[].lastIndexOf(element: Float): Int {
////        for (index in indices.reversed()) {
////            if (element == this[index]) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns last index of [element], or -1 if the array does not contain element.
////     */
////    public static double[].lastIndexOf(element: Double): Int {
////        for (index in indices.reversed()) {
////            if (element == this[index]) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns last index of [element], or -1 if the array does not contain element.
////     */
////    public static boolean[].lastIndexOf(element: Boolean): Int {
////        for (index in indices.reversed()) {
////            if (element == this[index]) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns last index of [element], or -1 if the array does not contain element.
////     */
////    public static char[].lastIndexOf(element: Char): Int {
////        for (index in indices.reversed()) {
////            if (element == this[index]) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns the last element, or `null` if the array is empty.
////     */
////    public static <T> T[].lastOrNull(): T? {
////        return if (isEmpty()) null else this[size - 1]
////    }
////
////    /**
////     * Returns the last element, or `null` if the array is empty.
////     */
////    public static byte[].lastOrNull(): Byte? {
////        return if (isEmpty()) null else this[size - 1]
////    }
////
////    /**
////     * Returns the last element, or `null` if the array is empty.
////     */
////    public static short[].lastOrNull(): Short? {
////        return if (isEmpty()) null else this[size - 1]
////    }
////
////    /**
////     * Returns the last element, or `null` if the array is empty.
////     */
////    public static int[].lastOrNull(): Int? {
////        return if (isEmpty()) null else this[size - 1]
////    }
////
////    /**
////     * Returns the last element, or `null` if the array is empty.
////     */
////    public static long[].lastOrNull(): Long? {
////        return if (isEmpty()) null else this[size - 1]
////    }
////
////    /**
////     * Returns the last element, or `null` if the array is empty.
////     */
////    public static float[].lastOrNull(): Float? {
////        return if (isEmpty()) null else this[size - 1]
////    }
////
////    /**
////     * Returns the last element, or `null` if the array is empty.
////     */
////    public static double[].lastOrNull(): Double? {
////        return if (isEmpty()) null else this[size - 1]
////    }
////
////    /**
////     * Returns the last element, or `null` if the array is empty.
////     */
////    public static boolean[].lastOrNull(): Boolean? {
////        return if (isEmpty()) null else this[size - 1]
////    }
////
////    /**
////     * Returns the last element, or `null` if the array is empty.
////     */
////    public static char[].lastOrNull(): Char? {
////        return if (isEmpty()) null else this[size - 1]
////    }
////
////    /**
////     * Returns the last element matching the given [predicate], or `null` if no such element was found.
////     */
////    public static <T> T[].lastOrNull(predicate: (T) -> Boolean): T? {
////        for (index in this.indices.reversed()) {
////            val element = this[index]
////            if (predicate(element)) return element
////        }
////        return null
////    }
////
////    /**
////     * Returns the last element matching the given [predicate], or `null` if no such element was found.
////     */
////    public static byte[].lastOrNull(predicate: (Byte) -> Boolean): Byte? {
////        for (index in this.indices.reversed()) {
////            val element = this[index]
////            if (predicate(element)) return element
////        }
////        return null
////    }
////
////    /**
////     * Returns the last element matching the given [predicate], or `null` if no such element was found.
////     */
////    public static short[].lastOrNull(predicate: (Short) -> Boolean): Short? {
////        for (index in this.indices.reversed()) {
////            val element = this[index]
////            if (predicate(element)) return element
////        }
////        return null
////    }
////
////    /**
////     * Returns the last element matching the given [predicate], or `null` if no such element was found.
////     */
////    public static int[].lastOrNull(predicate: (Int) -> Boolean): Int? {
////        for (index in this.indices.reversed()) {
////            val element = this[index]
////            if (predicate(element)) return element
////        }
////        return null
////    }
////
////    /**
////     * Returns the last element matching the given [predicate], or `null` if no such element was found.
////     */
////    public static long[].lastOrNull(predicate: (Long) -> Boolean): Long? {
////        for (index in this.indices.reversed()) {
////            val element = this[index]
////            if (predicate(element)) return element
////        }
////        return null
////    }
////
////    /**
////     * Returns the last element matching the given [predicate], or `null` if no such element was found.
////     */
////    public static float[].lastOrNull(predicate: (Float) -> Boolean): Float? {
////        for (index in this.indices.reversed()) {
////            val element = this[index]
////            if (predicate(element)) return element
////        }
////        return null
////    }
////
////    /**
////     * Returns the last element matching the given [predicate], or `null` if no such element was found.
////     */
////    public static double[].lastOrNull(predicate: (Double) -> Boolean): Double? {
////        for (index in this.indices.reversed()) {
////            val element = this[index]
////            if (predicate(element)) return element
////        }
////        return null
////    }
////
////    /**
////     * Returns the last element matching the given [predicate], or `null` if no such element was found.
////     */
////    public static boolean[].lastOrNull(predicate: (Boolean) -> Boolean): Boolean? {
////        for (index in this.indices.reversed()) {
////            val element = this[index]
////            if (predicate(element)) return element
////        }
////        return null
////    }
////
////    /**
////     * Returns the last element matching the given [predicate], or `null` if no such element was found.
////     */
////    public static char[].lastOrNull(predicate: (Char) -> Boolean): Char? {
////        for (index in this.indices.reversed()) {
////            val element = this[index]
////            if (predicate(element)) return element
////        }
////        return null
////    }
////
////
////
////    /**
////     * Returns a list containing all elements except first [n] elements.
////     */
////    public static <T> T[].drop(n: Int): List<T> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except first [n] elements.
////     */
////    public static byte[].drop(n: Int): List<Byte> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except first [n] elements.
////     */
////    public static short[].drop(n: Int): List<Short> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except first [n] elements.
////     */
////    public static int[].drop(n: Int): List<Int> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except first [n] elements.
////     */
////    public static long[].drop(n: Int): List<Long> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except first [n] elements.
////     */
////    public static float[].drop(n: Int): List<Float> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except first [n] elements.
////     */
////    public static double[].drop(n: Int): List<Double> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except first [n] elements.
////     */
////    public static boolean[].drop(n: Int): List<Boolean> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except first [n] elements.
////     */
////    public static char[].drop(n: Int): List<Char> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static <T> T[].dropLast(n: Int): List<T> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return take((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static byte[].dropLast(n: Int): List<Byte> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return take((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static short[].dropLast(n: Int): List<Short> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return take((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static int[].dropLast(n: Int): List<Int> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return take((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static long[].dropLast(n: Int): List<Long> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return take((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static float[].dropLast(n: Int): List<Float> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return take((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static double[].dropLast(n: Int): List<Double> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return take((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static boolean[].dropLast(n: Int): List<Boolean> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return take((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static char[].dropLast(n: Int): List<Char> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return take((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last elements that satisfy the given [predicate].
////     */
////    public static <T> T[].dropLastWhile(predicate: (T) -> Boolean): List<T> {
////        for (index in lastIndex downTo 0) {
////            if (!predicate(this[index])) {
////                return take(index + 1)
////            }
////        }
////        return emptyList()
////    }
////
////    /**
////     * Returns a list containing all elements except last elements that satisfy the given [predicate].
////     */
////    public static byte[].dropLastWhile(predicate: (Byte) -> Boolean): List<Byte> {
////        for (index in lastIndex downTo 0) {
////            if (!predicate(this[index])) {
////                return take(index + 1)
////            }
////        }
////        return emptyList()
////    }
////
////    /**
////     * Returns a list containing all elements except last elements that satisfy the given [predicate].
////     */
////    public static short[].dropLastWhile(predicate: (Short) -> Boolean): List<Short> {
////        for (index in lastIndex downTo 0) {
////            if (!predicate(this[index])) {
////                return take(index + 1)
////            }
////        }
////        return emptyList()
////    }
////
////    /**
////     * Returns a list containing all elements except last elements that satisfy the given [predicate].
////     */
////    public static int[].dropLastWhile(predicate: (Int) -> Boolean): List<Int> {
////        for (index in lastIndex downTo 0) {
////            if (!predicate(this[index])) {
////                return take(index + 1)
////            }
////        }
////        return emptyList()
////    }
////
////    /**
////     * Returns a list containing all elements except last elements that satisfy the given [predicate].
////     */
////    public static long[].dropLastWhile(predicate: (Long) -> Boolean): List<Long> {
////        for (index in lastIndex downTo 0) {
////            if (!predicate(this[index])) {
////                return take(index + 1)
////            }
////        }
////        return emptyList()
////    }
////
////    /**
////     * Returns a list containing all elements except last elements that satisfy the given [predicate].
////     */
////    public static float[].dropLastWhile(predicate: (Float) -> Boolean): List<Float> {
////        for (index in lastIndex downTo 0) {
////            if (!predicate(this[index])) {
////                return take(index + 1)
////            }
////        }
////        return emptyList()
////    }
////
////    /**
////     * Returns a list containing all elements except last elements that satisfy the given [predicate].
////     */
////    public static double[].dropLastWhile(predicate: (Double) -> Boolean): List<Double> {
////        for (index in lastIndex downTo 0) {
////            if (!predicate(this[index])) {
////                return take(index + 1)
////            }
////        }
////        return emptyList()
////    }
////
////    /**
////     * Returns a list containing all elements except last elements that satisfy the given [predicate].
////     */
////    public static boolean[].dropLastWhile(predicate: (Boolean) -> Boolean): List<Boolean> {
////        for (index in lastIndex downTo 0) {
////            if (!predicate(this[index])) {
////                return take(index + 1)
////            }
////        }
////        return emptyList()
////    }
////
////    /**
////     * Returns a list containing all elements except last elements that satisfy the given [predicate].
////     */
////    public static char[].dropLastWhile(predicate: (Char) -> Boolean): List<Char> {
////        for (index in lastIndex downTo 0) {
////            if (!predicate(this[index])) {
////                return take(index + 1)
////            }
////        }
////        return emptyList()
////    }
////
////    /**
////     * Returns a list containing all elements except first elements that satisfy the given [predicate].
////     */
////    public static <T> T[].dropWhile(predicate: (T) -> Boolean): List<T> {
////        var yielding = false
////        val list = ArrayList<T>()
////        for (item in this)
////            if (yielding)
////                list.add(item)
////            else if (!predicate(item)) {
////                list.add(item)
////                yielding = true
////            }
////        return list
////    }
////
////    /**
////     * Returns a list containing all elements except first elements that satisfy the given [predicate].
////     */
////    public static byte[].dropWhile(predicate: (Byte) -> Boolean): List<Byte> {
////        var yielding = false
////        val list = ArrayList<Byte>()
////        for (item in this)
////            if (yielding)
////                list.add(item)
////            else if (!predicate(item)) {
////                list.add(item)
////                yielding = true
////            }
////        return list
////    }
////
////    /**
////     * Returns a list containing all elements except first elements that satisfy the given [predicate].
////     */
////    public static short[].dropWhile(predicate: (Short) -> Boolean): List<Short> {
////        var yielding = false
////        val list = ArrayList<Short>()
////        for (item in this)
////            if (yielding)
////                list.add(item)
////            else if (!predicate(item)) {
////                list.add(item)
////                yielding = true
////            }
////        return list
////    }
////
////    /**
////     * Returns a list containing all elements except first elements that satisfy the given [predicate].
////     */
////    public static int[].dropWhile(predicate: (Int) -> Boolean): List<Int> {
////        var yielding = false
////        val list = ArrayList<Int>()
////        for (item in this)
////            if (yielding)
////                list.add(item)
////            else if (!predicate(item)) {
////                list.add(item)
////                yielding = true
////            }
////        return list
////    }
////
////    /**
////     * Returns a list containing all elements except first elements that satisfy the given [predicate].
////     */
////    public static long[].dropWhile(predicate: (Long) -> Boolean): List<Long> {
////        var yielding = false
////        val list = ArrayList<Long>()
////        for (item in this)
////            if (yielding)
////                list.add(item)
////            else if (!predicate(item)) {
////                list.add(item)
////                yielding = true
////            }
////        return list
////    }
////
////    /**
////     * Returns a list containing all elements except first elements that satisfy the given [predicate].
////     */
////    public static float[].dropWhile(predicate: (Float) -> Boolean): List<Float> {
////        var yielding = false
////        val list = ArrayList<Float>()
////        for (item in this)
////            if (yielding)
////                list.add(item)
////            else if (!predicate(item)) {
////                list.add(item)
////                yielding = true
////            }
////        return list
////    }
////
////    /**
////     * Returns a list containing all elements except first elements that satisfy the given [predicate].
////     */
////    public static double[].dropWhile(predicate: (Double) -> Boolean): List<Double> {
////        var yielding = false
////        val list = ArrayList<Double>()
////        for (item in this)
////            if (yielding)
////                list.add(item)
////            else if (!predicate(item)) {
////                list.add(item)
////                yielding = true
////            }
////        return list
////    }
////
////    /**
////     * Returns a list containing all elements except first elements that satisfy the given [predicate].
////     */
////    public static boolean[].dropWhile(predicate: (Boolean) -> Boolean): List<Boolean> {
////        var yielding = false
////        val list = ArrayList<Boolean>()
////        for (item in this)
////            if (yielding)
////                list.add(item)
////            else if (!predicate(item)) {
////                list.add(item)
////                yielding = true
////            }
////        return list
////    }
////
////    /**
////     * Returns a list containing all elements except first elements that satisfy the given [predicate].
////     */
////    public static char[].dropWhile(predicate: (Char) -> Boolean): List<Char> {
////        var yielding = false
////        val list = ArrayList<Char>()
////        for (item in this)
////            if (yielding)
////                list.add(item)
////            else if (!predicate(item)) {
////                list.add(item)
////                yielding = true
////            }
////        return list
////    }
////
////    /**
////     * Returns a list containing only elements matching the given [predicate].
////     */
////    public static <T> T[].filter(predicate: (T) -> Boolean): List<T> {
////        return filterTo(ArrayList<T>(), predicate)
////    }
////
////    /**
////     * Returns a list containing only elements matching the given [predicate].
////     */
////    public static byte[].filter(predicate: (Byte) -> Boolean): List<Byte> {
////        return filterTo(ArrayList<Byte>(), predicate)
////    }
////
////    /**
////     * Returns a list containing only elements matching the given [predicate].
////     */
////    public static short[].filter(predicate: (Short) -> Boolean): List<Short> {
////        return filterTo(ArrayList<Short>(), predicate)
////    }
////
////    /**
////     * Returns a list containing only elements matching the given [predicate].
////     */
////    public static int[].filter(predicate: (Int) -> Boolean): List<Int> {
////        return filterTo(ArrayList<Int>(), predicate)
////    }
////
////    /**
////     * Returns a list containing only elements matching the given [predicate].
////     */
////    public static long[].filter(predicate: (Long) -> Boolean): List<Long> {
////        return filterTo(ArrayList<Long>(), predicate)
////    }
////
////    /**
////     * Returns a list containing only elements matching the given [predicate].
////     */
////    public static float[].filter(predicate: (Float) -> Boolean): List<Float> {
////        return filterTo(ArrayList<Float>(), predicate)
////    }
////
////    /**
////     * Returns a list containing only elements matching the given [predicate].
////     */
////    public static double[].filter(predicate: (Double) -> Boolean): List<Double> {
////        return filterTo(ArrayList<Double>(), predicate)
////    }
////
////    /**
////     * Returns a list containing only elements matching the given [predicate].
////     */
////    public static boolean[].filter(predicate: (Boolean) -> Boolean): List<Boolean> {
////        return filterTo(ArrayList<Boolean>(), predicate)
////    }
////
////    /**
////     * Returns a list containing only elements matching the given [predicate].
////     */
////    public static char[].filter(predicate: (Char) -> Boolean): List<Char> {
////        return filterTo(ArrayList<Char>(), predicate)
////    }
////
////    /**
////     * Returns a list containing only elements matching the given [predicate].
////     * @param [predicate] function that takes the index of an element and the element itself
////     * and returns the result of predicate evaluation on the element.
////     */
////    public static <T> T[].filterIndexed(predicate: (index: Int, T) -> Boolean): List<T> {
////        return filterIndexedTo(ArrayList<T>(), predicate)
////    }
////
////    /**
////     * Returns a list containing only elements matching the given [predicate].
////     * @param [predicate] function that takes the index of an element and the element itself
////     * and returns the result of predicate evaluation on the element.
////     */
////    public static byte[].filterIndexed(predicate: (index: Int, Byte) -> Boolean): List<Byte> {
////        return filterIndexedTo(ArrayList<Byte>(), predicate)
////    }
////
////    /**
////     * Returns a list containing only elements matching the given [predicate].
////     * @param [predicate] function that takes the index of an element and the element itself
////     * and returns the result of predicate evaluation on the element.
////     */
////    public static short[].filterIndexed(predicate: (index: Int, Short) -> Boolean): List<Short> {
////        return filterIndexedTo(ArrayList<Short>(), predicate)
////    }
////
////    /**
////     * Returns a list containing only elements matching the given [predicate].
////     * @param [predicate] function that takes the index of an element and the element itself
////     * and returns the result of predicate evaluation on the element.
////     */
////    public static int[].filterIndexed(predicate: (index: Int, Int) -> Boolean): List<Int> {
////        return filterIndexedTo(ArrayList<Int>(), predicate)
////    }
////
////    /**
////     * Returns a list containing only elements matching the given [predicate].
////     * @param [predicate] function that takes the index of an element and the element itself
////     * and returns the result of predicate evaluation on the element.
////     */
////    public static long[].filterIndexed(predicate: (index: Int, Long) -> Boolean): List<Long> {
////        return filterIndexedTo(ArrayList<Long>(), predicate)
////    }
////
////    /**
////     * Returns a list containing only elements matching the given [predicate].
////     * @param [predicate] function that takes the index of an element and the element itself
////     * and returns the result of predicate evaluation on the element.
////     */
////    public static float[].filterIndexed(predicate: (index: Int, Float) -> Boolean): List<Float> {
////        return filterIndexedTo(ArrayList<Float>(), predicate)
////    }
////
////    /**
////     * Returns a list containing only elements matching the given [predicate].
////     * @param [predicate] function that takes the index of an element and the element itself
////     * and returns the result of predicate evaluation on the element.
////     */
////    public static double[].filterIndexed(predicate: (index: Int, Double) -> Boolean): List<Double> {
////        return filterIndexedTo(ArrayList<Double>(), predicate)
////    }
////
////    /**
////     * Returns a list containing only elements matching the given [predicate].
////     * @param [predicate] function that takes the index of an element and the element itself
////     * and returns the result of predicate evaluation on the element.
////     */
////    public static boolean[].filterIndexed(predicate: (index: Int, Boolean) -> Boolean): List<Boolean> {
////        return filterIndexedTo(ArrayList<Boolean>(), predicate)
////    }
////
////    /**
////     * Returns a list containing only elements matching the given [predicate].
////     * @param [predicate] function that takes the index of an element and the element itself
////     * and returns the result of predicate evaluation on the element.
////     */
////    public static char[].filterIndexed(predicate: (index: Int, Char) -> Boolean): List<Char> {
////        return filterIndexedTo(ArrayList<Char>(), predicate)
////    }
////
////    /**
////     * Appends all elements matching the given [predicate] to the given [destination].
////     * @param [predicate] function that takes the index of an element and the element itself
////     * and returns the result of predicate evaluation on the element.
////     */
////    public static <T, C : MutableCollection<in T>> T[].filterIndexedTo(destination: C, predicate: (index: Int, T) -> Boolean): C {
////        forEachIndexed { index, element ->
////            if (predicate(index, element)) destination.add(element)
////        }
////        return destination
////    }
////
////    /**
////     * Appends all elements matching the given [predicate] to the given [destination].
////     * @param [predicate] function that takes the index of an element and the element itself
////     * and returns the result of predicate evaluation on the element.
////     */
////    public static <C : MutableCollection<in Byte>> byte[].filterIndexedTo(destination: C, predicate: (index: Int, Byte) -> Boolean): C {
////        forEachIndexed { index, element ->
////            if (predicate(index, element)) destination.add(element)
////        }
////        return destination
////    }
////
////    /**
////     * Appends all elements matching the given [predicate] to the given [destination].
////     * @param [predicate] function that takes the index of an element and the element itself
////     * and returns the result of predicate evaluation on the element.
////     */
////    public static <C : MutableCollection<in Short>> short[].filterIndexedTo(destination: C, predicate: (index: Int, Short) -> Boolean): C {
////        forEachIndexed { index, element ->
////            if (predicate(index, element)) destination.add(element)
////        }
////        return destination
////    }
////
////    /**
////     * Appends all elements matching the given [predicate] to the given [destination].
////     * @param [predicate] function that takes the index of an element and the element itself
////     * and returns the result of predicate evaluation on the element.
////     */
////    public static <C : MutableCollection<in Int>> int[].filterIndexedTo(destination: C, predicate: (index: Int, Int) -> Boolean): C {
////        forEachIndexed { index, element ->
////            if (predicate(index, element)) destination.add(element)
////        }
////        return destination
////    }
////
////    /**
////     * Appends all elements matching the given [predicate] to the given [destination].
////     * @param [predicate] function that takes the index of an element and the element itself
////     * and returns the result of predicate evaluation on the element.
////     */
////    public static <C : MutableCollection<in Long>> long[].filterIndexedTo(destination: C, predicate: (index: Int, Long) -> Boolean): C {
////        forEachIndexed { index, element ->
////            if (predicate(index, element)) destination.add(element)
////        }
////        return destination
////    }
////
////    /**
////     * Appends all elements matching the given [predicate] to the given [destination].
////     * @param [predicate] function that takes the index of an element and the element itself
////     * and returns the result of predicate evaluation on the element.
////     */
////    public static <C : MutableCollection<in Float>> float[].filterIndexedTo(destination: C, predicate: (index: Int, Float) -> Boolean): C {
////        forEachIndexed { index, element ->
////            if (predicate(index, element)) destination.add(element)
////        }
////        return destination
////    }
////
////    /**
////     * Appends all elements matching the given [predicate] to the given [destination].
////     * @param [predicate] function that takes the index of an element and the element itself
////     * and returns the result of predicate evaluation on the element.
////     */
////    public static <C : MutableCollection<in Double>> double[].filterIndexedTo(destination: C, predicate: (index: Int, Double) -> Boolean): C {
////        forEachIndexed { index, element ->
////            if (predicate(index, element)) destination.add(element)
////        }
////        return destination
////    }
////
////    /**
////     * Appends all elements matching the given [predicate] to the given [destination].
////     * @param [predicate] function that takes the index of an element and the element itself
////     * and returns the result of predicate evaluation on the element.
////     */
////    public static <C : MutableCollection<in Boolean>> boolean[].filterIndexedTo(destination: C, predicate: (index: Int, Boolean) -> Boolean): C {
////        forEachIndexed { index, element ->
////            if (predicate(index, element)) destination.add(element)
////        }
////        return destination
////    }
////
////    /**
////     * Appends all elements matching the given [predicate] to the given [destination].
////     * @param [predicate] function that takes the index of an element and the element itself
////     * and returns the result of predicate evaluation on the element.
////     */
////    public static <C : MutableCollection<in Char>> char[].filterIndexedTo(destination: C, predicate: (index: Int, Char) -> Boolean): C {
////        forEachIndexed { index, element ->
////            if (predicate(index, element)) destination.add(element)
////        }
////        return destination
////    }
////
////    /**
////     * Returns a list containing all elements that are instances of specified type parameter R.
////     */
////    public static <reified R> Array<*>.filterIsInstance(): List<@kotlin.internal.NoInfer R> {
////        return filterIsInstanceTo(ArrayList<R>())
////    }
////
////    /**
////     * Returns a list containing all elements that are instances of specified class.
////     */
////    public static <R> Array<*>.filterIsInstance(klass: Class<R>): List<R> {
////        return filterIsInstanceTo(ArrayList<R>(), klass)
////    }
////
////    /**
////     * Appends all elements that are instances of specified type parameter R to the given [destination].
////     */
////    public static <reified R, C : MutableCollection<in R>> Array<*>.filterIsInstanceTo(destination: C): C {
////        for (element in this) if (element is R) destination.add(element)
////        return destination
////    }
////
/////**
//// * Appends all elements that are instances of specified class to the given [destination].
//// */
////    public static <C : MutableCollection<in R>, R> Array<*>.filterIsInstanceTo(destination: C, klass: Class<R>): C {
////        @Suppress("UNCHECKED_CAST")
////        for (element in this) if (klass.isInstance(element)) destination.add(element as R)
////        return destination
////    }
////
////    /**
////     * Returns a list containing all elements not matching the given [predicate].
////     */
////    public static <T> T[].filterNot(predicate: (T) -> Boolean): List<T> {
////        return filterNotTo(ArrayList<T>(), predicate)
////    }
////
////    /**
////     * Returns a list containing all elements not matching the given [predicate].
////     */
////    public static byte[].filterNot(predicate: (Byte) -> Boolean): List<Byte> {
////        return filterNotTo(ArrayList<Byte>(), predicate)
////    }
////
////    /**
////     * Returns a list containing all elements not matching the given [predicate].
////     */
////    public static short[].filterNot(predicate: (Short) -> Boolean): List<Short> {
////        return filterNotTo(ArrayList<Short>(), predicate)
////    }
////
////    /**
////     * Returns a list containing all elements not matching the given [predicate].
////     */
////    public static int[].filterNot(predicate: (Int) -> Boolean): List<Int> {
////        return filterNotTo(ArrayList<Int>(), predicate)
////    }
////
////    /**
////     * Returns a list containing all elements not matching the given [predicate].
////     */
////    public static long[].filterNot(predicate: (Long) -> Boolean): List<Long> {
////        return filterNotTo(ArrayList<Long>(), predicate)
////    }
////
////    /**
////     * Returns a list containing all elements not matching the given [predicate].
////     */
////    public static float[].filterNot(predicate: (Float) -> Boolean): List<Float> {
////        return filterNotTo(ArrayList<Float>(), predicate)
////    }
////
////    /**
////     * Returns a list containing all elements not matching the given [predicate].
////     */
////    public static double[].filterNot(predicate: (Double) -> Boolean): List<Double> {
////        return filterNotTo(ArrayList<Double>(), predicate)
////    }
////
////    /**
////     * Returns a list containing all elements not matching the given [predicate].
////     */
////    public static boolean[].filterNot(predicate: (Boolean) -> Boolean): List<Boolean> {
////        return filterNotTo(ArrayList<Boolean>(), predicate)
////    }
////
////    /**
////     * Returns a list containing all elements not matching the given [predicate].
////     */
////    public static char[].filterNot(predicate: (Char) -> Boolean): List<Char> {
////        return filterNotTo(ArrayList<Char>(), predicate)
////    }
////
/////**
//// * Returns a list containing all elements that are not `null`.
//// */
////    public static <T : Any> Array<out T?>.filterNotNull(): List<T> {
////        return filterNotNullTo(ArrayList<T>())
////    }
////
/////**
//// * Appends all elements that are not `null` to the given [destination].
//// */
////    public static <C : MutableCollection<in T>, T : Any> Array<out T?>.filterNotNullTo(destination: C): C {
////        for (element in this) if (element != null) destination.add(element)
////        return destination
////    }
////
////    /**
////     * Appends all elements not matching the given [predicate] to the given [destination].
////     */
////    public static <T, C : MutableCollection<in T>> T[].filterNotTo(destination: C, predicate: (T) -> Boolean): C {
////        for (element in this) if (!predicate(element)) destination.add(element)
////        return destination
////    }
////
////    /**
////     * Appends all elements not matching the given [predicate] to the given [destination].
////     */
////    public static <C : MutableCollection<in Byte>> byte[].filterNotTo(destination: C, predicate: (Byte) -> Boolean): C {
////        for (element in this) if (!predicate(element)) destination.add(element)
////        return destination
////    }
////
////    /**
////     * Appends all elements not matching the given [predicate] to the given [destination].
////     */
////    public static <C : MutableCollection<in Short>> short[].filterNotTo(destination: C, predicate: (Short) -> Boolean): C {
////        for (element in this) if (!predicate(element)) destination.add(element)
////        return destination
////    }
////
////    /**
////     * Appends all elements not matching the given [predicate] to the given [destination].
////     */
////    public static <C : MutableCollection<in Int>> int[].filterNotTo(destination: C, predicate: (Int) -> Boolean): C {
////        for (element in this) if (!predicate(element)) destination.add(element)
////        return destination
////    }
////
////    /**
////     * Appends all elements not matching the given [predicate] to the given [destination].
////     */
////    public static <C : MutableCollection<in Long>> long[].filterNotTo(destination: C, predicate: (Long) -> Boolean): C {
////        for (element in this) if (!predicate(element)) destination.add(element)
////        return destination
////    }
////
////    /**
////     * Appends all elements not matching the given [predicate] to the given [destination].
////     */
////    public static <C : MutableCollection<in Float>> float[].filterNotTo(destination: C, predicate: (Float) -> Boolean): C {
////        for (element in this) if (!predicate(element)) destination.add(element)
////        return destination
////    }
////
////    /**
////     * Appends all elements not matching the given [predicate] to the given [destination].
////     */
////    public static <C : MutableCollection<in Double>> double[].filterNotTo(destination: C, predicate: (Double) -> Boolean): C {
////        for (element in this) if (!predicate(element)) destination.add(element)
////        return destination
////    }
////
////    /**
////     * Appends all elements not matching the given [predicate] to the given [destination].
////     */
////    public static <C : MutableCollection<in Boolean>> boolean[].filterNotTo(destination: C, predicate: (Boolean) -> Boolean): C {
////        for (element in this) if (!predicate(element)) destination.add(element)
////        return destination
////    }
////
////    /**
////     * Appends all elements not matching the given [predicate] to the given [destination].
////     */
////    public static <C : MutableCollection<in Char>> char[].filterNotTo(destination: C, predicate: (Char) -> Boolean): C {
////        for (element in this) if (!predicate(element)) destination.add(element)
////        return destination
////    }
////
////    /**
////     * Appends all elements matching the given [predicate] to the given [destination].
////     */
////    public static <T, C : MutableCollection<in T>> T[].filterTo(destination: C, predicate: (T) -> Boolean): C {
////        for (element in this) if (predicate(element)) destination.add(element)
////        return destination
////    }
////
////    /**
////     * Appends all elements matching the given [predicate] to the given [destination].
////     */
////    public static <C : MutableCollection<in Byte>> byte[].filterTo(destination: C, predicate: (Byte) -> Boolean): C {
////        for (element in this) if (predicate(element)) destination.add(element)
////        return destination
////    }
////
////    /**
////     * Appends all elements matching the given [predicate] to the given [destination].
////     */
////    public static <C : MutableCollection<in Short>> short[].filterTo(destination: C, predicate: (Short) -> Boolean): C {
////        for (element in this) if (predicate(element)) destination.add(element)
////        return destination
////    }
////
////    /**
////     * Appends all elements matching the given [predicate] to the given [destination].
////     */
////    public static <C : MutableCollection<in Int>> int[].filterTo(destination: C, predicate: (Int) -> Boolean): C {
////        for (element in this) if (predicate(element)) destination.add(element)
////        return destination
////    }
////
////    /**
////     * Appends all elements matching the given [predicate] to the given [destination].
////     */
////    public static <C : MutableCollection<in Long>> long[].filterTo(destination: C, predicate: (Long) -> Boolean): C {
////        for (element in this) if (predicate(element)) destination.add(element)
////        return destination
////    }
////
////    /**
////     * Appends all elements matching the given [predicate] to the given [destination].
////     */
////    public static <C : MutableCollection<in Float>> float[].filterTo(destination: C, predicate: (Float) -> Boolean): C {
////        for (element in this) if (predicate(element)) destination.add(element)
////        return destination
////    }
////
////    /**
////     * Appends all elements matching the given [predicate] to the given [destination].
////     */
////    public static <C : MutableCollection<in Double>> double[].filterTo(destination: C, predicate: (Double) -> Boolean): C {
////        for (element in this) if (predicate(element)) destination.add(element)
////        return destination
////    }
////
////    /**
////     * Appends all elements matching the given [predicate] to the given [destination].
////     */
////    public static <C : MutableCollection<in Boolean>> boolean[].filterTo(destination: C, predicate: (Boolean) -> Boolean): C {
////        for (element in this) if (predicate(element)) destination.add(element)
////        return destination
////    }
////
////    /**
////     * Appends all elements matching the given [predicate] to the given [destination].
////     */
////    public static <C : MutableCollection<in Char>> char[].filterTo(destination: C, predicate: (Char) -> Boolean): C {
////        for (element in this) if (predicate(element)) destination.add(element)
////        return destination
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static <T> T[].slice(indices: IntRange): List<T> {
////        if (indices.isEmpty()) return listOf()
////        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static byte[].slice(indices: IntRange): List<Byte> {
////        if (indices.isEmpty()) return listOf()
////        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static short[].slice(indices: IntRange): List<Short> {
////        if (indices.isEmpty()) return listOf()
////        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static int[].slice(indices: IntRange): List<Int> {
////        if (indices.isEmpty()) return listOf()
////        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static long[].slice(indices: IntRange): List<Long> {
////        if (indices.isEmpty()) return listOf()
////        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static float[].slice(indices: IntRange): List<Float> {
////        if (indices.isEmpty()) return listOf()
////        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static double[].slice(indices: IntRange): List<Double> {
////        if (indices.isEmpty()) return listOf()
////        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static boolean[].slice(indices: IntRange): List<Boolean> {
////        if (indices.isEmpty()) return listOf()
////        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static char[].slice(indices: IntRange): List<Char> {
////        if (indices.isEmpty()) return listOf()
////        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
////    }
////
////    /**
////     * Returns a list containing elements at specified [indices].
////     */
////    public static <T> T[].slice(indices: Iterable<Int>): List<T> {
////        val size = indices.collectionSizeOrDefault(10)
////        if (size == 0) return emptyList()
////        val list = ArrayList<T>(size)
////        for (index in indices) {
////            list.add(get(index))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing elements at specified [indices].
////     */
////    public static byte[].slice(indices: Iterable<Int>): List<Byte> {
////        val size = indices.collectionSizeOrDefault(10)
////        if (size == 0) return emptyList()
////        val list = ArrayList<Byte>(size)
////        for (index in indices) {
////            list.add(get(index))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing elements at specified [indices].
////     */
////    public static short[].slice(indices: Iterable<Int>): List<Short> {
////        val size = indices.collectionSizeOrDefault(10)
////        if (size == 0) return emptyList()
////        val list = ArrayList<Short>(size)
////        for (index in indices) {
////            list.add(get(index))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing elements at specified [indices].
////     */
////    public static int[].slice(indices: Iterable<Int>): List<Int> {
////        val size = indices.collectionSizeOrDefault(10)
////        if (size == 0) return emptyList()
////        val list = ArrayList<Int>(size)
////        for (index in indices) {
////            list.add(get(index))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing elements at specified [indices].
////     */
////    public static long[].slice(indices: Iterable<Int>): List<Long> {
////        val size = indices.collectionSizeOrDefault(10)
////        if (size == 0) return emptyList()
////        val list = ArrayList<Long>(size)
////        for (index in indices) {
////            list.add(get(index))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing elements at specified [indices].
////     */
////    public static float[].slice(indices: Iterable<Int>): List<Float> {
////        val size = indices.collectionSizeOrDefault(10)
////        if (size == 0) return emptyList()
////        val list = ArrayList<Float>(size)
////        for (index in indices) {
////            list.add(get(index))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing elements at specified [indices].
////     */
////    public static double[].slice(indices: Iterable<Int>): List<Double> {
////        val size = indices.collectionSizeOrDefault(10)
////        if (size == 0) return emptyList()
////        val list = ArrayList<Double>(size)
////        for (index in indices) {
////            list.add(get(index))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing elements at specified [indices].
////     */
////    public static boolean[].slice(indices: Iterable<Int>): List<Boolean> {
////        val size = indices.collectionSizeOrDefault(10)
////        if (size == 0) return emptyList()
////        val list = ArrayList<Boolean>(size)
////        for (index in indices) {
////            list.add(get(index))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing elements at specified [indices].
////     */
////    public static char[].slice(indices: Iterable<Int>): List<Char> {
////        val size = indices.collectionSizeOrDefault(10)
////        if (size == 0) return emptyList()
////        val list = ArrayList<Char>(size)
////        for (index in indices) {
////            list.add(get(index))
////        }
////        return list
////    }
////
////    /**
////     * Returns an array containing elements of this array at specified [indices].
////     */
////    public static <T> Array<T>.sliceArray(indices: Collection<Int>): Array<T> {
////        val result = arrayOfNulls(this, indices.size)
////        var targetIndex = 0
////        for (sourceIndex in indices) {
////            result[targetIndex++] = this[sourceIndex]
////        }
////        return result
////    }
////
////    /**
////     * Returns an array containing elements of this array at specified [indices].
////     */
////    public static byte[].sliceArray(indices: Collection<Int>): byte[] {
////        val result = byte[](indices.size)
////        var targetIndex = 0
////        for (sourceIndex in indices) {
////            result[targetIndex++] = this[sourceIndex]
////        }
////        return result
////    }
////
////    /**
////     * Returns an array containing elements of this array at specified [indices].
////     */
////    public static short[].sliceArray(indices: Collection<Int>): short[] {
////        val result = short[](indices.size)
////        var targetIndex = 0
////        for (sourceIndex in indices) {
////            result[targetIndex++] = this[sourceIndex]
////        }
////        return result
////    }
////
////    /**
////     * Returns an array containing elements of this array at specified [indices].
////     */
////    public static int[].sliceArray(indices: Collection<Int>): int[] {
////        val result = int[](indices.size)
////        var targetIndex = 0
////        for (sourceIndex in indices) {
////            result[targetIndex++] = this[sourceIndex]
////        }
////        return result
////    }
////
////    /**
////     * Returns an array containing elements of this array at specified [indices].
////     */
////    public static long[].sliceArray(indices: Collection<Int>): long[] {
////        val result = long[](indices.size)
////        var targetIndex = 0
////        for (sourceIndex in indices) {
////            result[targetIndex++] = this[sourceIndex]
////        }
////        return result
////    }
////
////    /**
////     * Returns an array containing elements of this array at specified [indices].
////     */
////    public static float[].sliceArray(indices: Collection<Int>): float[] {
////        val result = float[](indices.size)
////        var targetIndex = 0
////        for (sourceIndex in indices) {
////            result[targetIndex++] = this[sourceIndex]
////        }
////        return result
////    }
////
////    /**
////     * Returns an array containing elements of this array at specified [indices].
////     */
////    public static double[].sliceArray(indices: Collection<Int>): double[] {
////        val result = double[](indices.size)
////        var targetIndex = 0
////        for (sourceIndex in indices) {
////            result[targetIndex++] = this[sourceIndex]
////        }
////        return result
////    }
////
////    /**
////     * Returns an array containing elements of this array at specified [indices].
////     */
////    public static boolean[].sliceArray(indices: Collection<Int>): boolean[] {
////        val result = boolean[](indices.size)
////        var targetIndex = 0
////        for (sourceIndex in indices) {
////            result[targetIndex++] = this[sourceIndex]
////        }
////        return result
////    }
////
////    /**
////     * Returns an array containing elements of this array at specified [indices].
////     */
////    public static char[].sliceArray(indices: Collection<Int>): char[] {
////        val result = char[](indices.size)
////        var targetIndex = 0
////        for (sourceIndex in indices) {
////            result[targetIndex++] = this[sourceIndex]
////        }
////        return result
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static <T> Array<T>.sliceArray(indices: IntRange): Array<T> {
////        if (indices.isEmpty()) return copyOfRange(0, 0)
////        return copyOfRange(indices.start, indices.endInclusive + 1)
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static byte[].sliceArray(indices: IntRange): byte[] {
////        if (indices.isEmpty()) return byte[](0)
////        return copyOfRange(indices.start, indices.endInclusive + 1)
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static short[].sliceArray(indices: IntRange): short[] {
////        if (indices.isEmpty()) return short[](0)
////        return copyOfRange(indices.start, indices.endInclusive + 1)
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static int[].sliceArray(indices: IntRange): int[] {
////        if (indices.isEmpty()) return int[](0)
////        return copyOfRange(indices.start, indices.endInclusive + 1)
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static long[].sliceArray(indices: IntRange): long[] {
////        if (indices.isEmpty()) return long[](0)
////        return copyOfRange(indices.start, indices.endInclusive + 1)
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static float[].sliceArray(indices: IntRange): float[] {
////        if (indices.isEmpty()) return float[](0)
////        return copyOfRange(indices.start, indices.endInclusive + 1)
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static double[].sliceArray(indices: IntRange): double[] {
////        if (indices.isEmpty()) return double[](0)
////        return copyOfRange(indices.start, indices.endInclusive + 1)
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static boolean[].sliceArray(indices: IntRange): boolean[] {
////        if (indices.isEmpty()) return boolean[](0)
////        return copyOfRange(indices.start, indices.endInclusive + 1)
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static char[].sliceArray(indices: IntRange): char[] {
////        if (indices.isEmpty()) return char[](0)
////        return copyOfRange(indices.start, indices.endInclusive + 1)
////    }
////
////    /**
////     * Returns a list containing first [n] elements.
////     */
////    public static <T> T[].take(n: Int): List<T> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        if (n == 0) return emptyList()
////        if (n >= size) return toList()
////        if (n == 1) return listOf(this[0])
////        var count = 0
////        val list = ArrayList<T>(n)
////        for (item in this) {
////            if (count++ == n)
////                break
////                list.add(item)
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing first [n] elements.
////     */
////    public static byte[].take(n: Int): List<Byte> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        if (n == 0) return emptyList()
////        if (n >= size) return toList()
////        if (n == 1) return listOf(this[0])
////        var count = 0
////        val list = ArrayList<Byte>(n)
////        for (item in this) {
////            if (count++ == n)
////                break
////                list.add(item)
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing first [n] elements.
////     */
////    public static short[].take(n: Int): List<Short> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        if (n == 0) return emptyList()
////        if (n >= size) return toList()
////        if (n == 1) return listOf(this[0])
////        var count = 0
////        val list = ArrayList<Short>(n)
////        for (item in this) {
////            if (count++ == n)
////                break
////                list.add(item)
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing first [n] elements.
////     */
////    public static int[].take(n: Int): List<Int> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        if (n == 0) return emptyList()
////        if (n >= size) return toList()
////        if (n == 1) return listOf(this[0])
////        var count = 0
////        val list = ArrayList<Int>(n)
////        for (item in this) {
////            if (count++ == n)
////                break
////                list.add(item)
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing first [n] elements.
////     */
////    public static long[].take(n: Int): List<Long> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        if (n == 0) return emptyList()
////        if (n >= size) return toList()
////        if (n == 1) return listOf(this[0])
////        var count = 0
////        val list = ArrayList<Long>(n)
////        for (item in this) {
////            if (count++ == n)
////                break
////                list.add(item)
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing first [n] elements.
////     */
////    public static float[].take(n: Int): List<Float> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        if (n == 0) return emptyList()
////        if (n >= size) return toList()
////        if (n == 1) return listOf(this[0])
////        var count = 0
////        val list = ArrayList<Float>(n)
////        for (item in this) {
////            if (count++ == n)
////                break
////                list.add(item)
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing first [n] elements.
////     */
////    public static double[].take(n: Int): List<Double> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        if (n == 0) return emptyList()
////        if (n >= size) return toList()
////        if (n == 1) return listOf(this[0])
////        var count = 0
////        val list = ArrayList<Double>(n)
////        for (item in this) {
////            if (count++ == n)
////                break
////                list.add(item)
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing first [n] elements.
////     */
////    public static boolean[].take(n: Int): List<Boolean> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        if (n == 0) return emptyList()
////        if (n >= size) return toList()
////        if (n == 1) return listOf(this[0])
////        var count = 0
////        val list = ArrayList<Boolean>(n)
////        for (item in this) {
////            if (count++ == n)
////                break
////                list.add(item)
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing first [n] elements.
////     */
////    public static char[].take(n: Int): List<Char> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        if (n == 0) return emptyList()
////        if (n >= size) return toList()
////        if (n == 1) return listOf(this[0])
////        var count = 0
////        val list = ArrayList<Char>(n)
////        for (item in this) {
////            if (count++ == n)
////                break
////                list.add(item)
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing last [n] elements.
////     */
////    public static <T> T[].takeLast(n: Int): List<T> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        if (n == 0) return emptyList()
////        val size = size
////        if (n >= size) return toList()
////        if (n == 1) return listOf(this[size - 1])
////        val list = ArrayList<T>(n)
////        for (index in size - n until size)
////        list.add(this[index])
////        return list
////    }
////
////    /**
////     * Returns a list containing last [n] elements.
////     */
////    public static byte[].takeLast(n: Int): List<Byte> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        if (n == 0) return emptyList()
////        val size = size
////        if (n >= size) return toList()
////        if (n == 1) return listOf(this[size - 1])
////        val list = ArrayList<Byte>(n)
////        for (index in size - n until size)
////        list.add(this[index])
////        return list
////    }
////
////    /**
////     * Returns a list containing last [n] elements.
////     */
////    public static short[].takeLast(n: Int): List<Short> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        if (n == 0) return emptyList()
////        val size = size
////        if (n >= size) return toList()
////        if (n == 1) return listOf(this[size - 1])
////        val list = ArrayList<Short>(n)
////        for (index in size - n until size)
////        list.add(this[index])
////        return list
////    }
////
////    /**
////     * Returns a list containing last [n] elements.
////     */
////    public static int[].takeLast(n: Int): List<Int> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        if (n == 0) return emptyList()
////        val size = size
////        if (n >= size) return toList()
////        if (n == 1) return listOf(this[size - 1])
////        val list = ArrayList<Int>(n)
////        for (index in size - n until size)
////        list.add(this[index])
////        return list
////    }
////
////    /**
////     * Returns a list containing last [n] elements.
////     */
////    public static long[].takeLast(n: Int): List<Long> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        if (n == 0) return emptyList()
////        val size = size
////        if (n >= size) return toList()
////        if (n == 1) return listOf(this[size - 1])
////        val list = ArrayList<Long>(n)
////        for (index in size - n until size)
////        list.add(this[index])
////        return list
////    }
////
////    /**
////     * Returns a list containing last [n] elements.
////     */
////    public static float[].takeLast(n: Int): List<Float> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        if (n == 0) return emptyList()
////        val size = size
////        if (n >= size) return toList()
////        if (n == 1) return listOf(this[size - 1])
////        val list = ArrayList<Float>(n)
////        for (index in size - n until size)
////        list.add(this[index])
////        return list
////    }
////
////    /**
////     * Returns a list containing last [n] elements.
////     */
////    public static double[].takeLast(n: Int): List<Double> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        if (n == 0) return emptyList()
////        val size = size
////        if (n >= size) return toList()
////        if (n == 1) return listOf(this[size - 1])
////        val list = ArrayList<Double>(n)
////        for (index in size - n until size)
////        list.add(this[index])
////        return list
////    }
////
////    /**
////     * Returns a list containing last [n] elements.
////     */
////    public static boolean[].takeLast(n: Int): List<Boolean> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        if (n == 0) return emptyList()
////        val size = size
////        if (n >= size) return toList()
////        if (n == 1) return listOf(this[size - 1])
////        val list = ArrayList<Boolean>(n)
////        for (index in size - n until size)
////        list.add(this[index])
////        return list
////    }
////
////    /**
////     * Returns a list containing last [n] elements.
////     */
////    public static char[].takeLast(n: Int): List<Char> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        if (n == 0) return emptyList()
////        val size = size
////        if (n >= size) return toList()
////        if (n == 1) return listOf(this[size - 1])
////        val list = ArrayList<Char>(n)
////        for (index in size - n until size)
////        list.add(this[index])
////        return list
////    }
////
////    /**
////     * Returns a list containing last elements satisfying the given [predicate].
////     */
////    public static <T> T[].takeLastWhile(predicate: (T) -> Boolean): List<T> {
////        for (index in lastIndex downTo 0) {
////            if (!predicate(this[index])) {
////                return drop(index + 1)
////            }
////        }
////        return toList()
////    }
////
////    /**
////     * Returns a list containing last elements satisfying the given [predicate].
////     */
////    public static byte[].takeLastWhile(predicate: (Byte) -> Boolean): List<Byte> {
////        for (index in lastIndex downTo 0) {
////            if (!predicate(this[index])) {
////                return drop(index + 1)
////            }
////        }
////        return toList()
////    }
////
////    /**
////     * Returns a list containing last elements satisfying the given [predicate].
////     */
////    public static short[].takeLastWhile(predicate: (Short) -> Boolean): List<Short> {
////        for (index in lastIndex downTo 0) {
////            if (!predicate(this[index])) {
////                return drop(index + 1)
////            }
////        }
////        return toList()
////    }
////
////    /**
////     * Returns a list containing last elements satisfying the given [predicate].
////     */
////    public static int[].takeLastWhile(predicate: (Int) -> Boolean): List<Int> {
////        for (index in lastIndex downTo 0) {
////            if (!predicate(this[index])) {
////                return drop(index + 1)
////            }
////        }
////        return toList()
////    }
////
////    /**
////     * Returns a list containing last elements satisfying the given [predicate].
////     */
////    public static long[].takeLastWhile(predicate: (Long) -> Boolean): List<Long> {
////        for (index in lastIndex downTo 0) {
////            if (!predicate(this[index])) {
////                return drop(index + 1)
////            }
////        }
////        return toList()
////    }
////
////    /**
////     * Returns a list containing last elements satisfying the given [predicate].
////     */
////    public static float[].takeLastWhile(predicate: (Float) -> Boolean): List<Float> {
////        for (index in lastIndex downTo 0) {
////            if (!predicate(this[index])) {
////                return drop(index + 1)
////            }
////        }
////        return toList()
////    }
////
////    /**
////     * Returns a list containing last elements satisfying the given [predicate].
////     */
////    public static double[].takeLastWhile(predicate: (Double) -> Boolean): List<Double> {
////        for (index in lastIndex downTo 0) {
////            if (!predicate(this[index])) {
////                return drop(index + 1)
////            }
////        }
////        return toList()
////    }
////
////    /**
////     * Returns a list containing last elements satisfying the given [predicate].
////     */
////    public static boolean[].takeLastWhile(predicate: (Boolean) -> Boolean): List<Boolean> {
////        for (index in lastIndex downTo 0) {
////            if (!predicate(this[index])) {
////                return drop(index + 1)
////            }
////        }
////        return toList()
////    }
////
////    /**
////     * Returns a list containing last elements satisfying the given [predicate].
////     */
////    public static char[].takeLastWhile(predicate: (Char) -> Boolean): List<Char> {
////        for (index in lastIndex downTo 0) {
////            if (!predicate(this[index])) {
////                return drop(index + 1)
////            }
////        }
////        return toList()
////    }
////
////    /**
////     * Returns a list containing first elements satisfying the given [predicate].
////     */
////    public static <T> T[].takeWhile(predicate: (T) -> Boolean): List<T> {
////        val list = ArrayList<T>()
////        for (item in this) {
////            if (!predicate(item))
////                break
////                list.add(item)
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing first elements satisfying the given [predicate].
////     */
////    public static byte[].takeWhile(predicate: (Byte) -> Boolean): List<Byte> {
////        val list = ArrayList<Byte>()
////        for (item in this) {
////            if (!predicate(item))
////                break
////                list.add(item)
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing first elements satisfying the given [predicate].
////     */
////    public static short[].takeWhile(predicate: (Short) -> Boolean): List<Short> {
////        val list = ArrayList<Short>()
////        for (item in this) {
////            if (!predicate(item))
////                break
////                list.add(item)
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing first elements satisfying the given [predicate].
////     */
////    public static int[].takeWhile(predicate: (Int) -> Boolean): List<Int> {
////        val list = ArrayList<Int>()
////        for (item in this) {
////            if (!predicate(item))
////                break
////                list.add(item)
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing first elements satisfying the given [predicate].
////     */
////    public static long[].takeWhile(predicate: (Long) -> Boolean): List<Long> {
////        val list = ArrayList<Long>()
////        for (item in this) {
////            if (!predicate(item))
////                break
////                list.add(item)
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing first elements satisfying the given [predicate].
////     */
////    public static float[].takeWhile(predicate: (Float) -> Boolean): List<Float> {
////        val list = ArrayList<Float>()
////        for (item in this) {
////            if (!predicate(item))
////                break
////                list.add(item)
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing first elements satisfying the given [predicate].
////     */
////    public static double[].takeWhile(predicate: (Double) -> Boolean): List<Double> {
////        val list = ArrayList<Double>()
////        for (item in this) {
////            if (!predicate(item))
////                break
////                list.add(item)
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing first elements satisfying the given [predicate].
////     */
////    public static boolean[].takeWhile(predicate: (Boolean) -> Boolean): List<Boolean> {
////        val list = ArrayList<Boolean>()
////        for (item in this) {
////            if (!predicate(item))
////                break
////                list.add(item)
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing first elements satisfying the given [predicate].
////     */
////    public static char[].takeWhile(predicate: (Char) -> Boolean): List<Char> {
////        val list = ArrayList<Char>()
////        for (item in this) {
////            if (!predicate(item))
////                break
////                list.add(item)
////        }
////        return list
////    }
////
////
////
////    /**
////     * Returns `true` if the two specified arrays are *deeply* equal to one another,
////     * i.e. contain the same number of the same elements in the same order.
////     *
////     * If two corresponding elements are nested arrays, they are also compared deeply.
////     * If any of arrays contains itself on any nesting level the behavior is undefined.
////     */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public infix static <T> T[].contentDeepEquals(other: T[]): Boolean {
////        return java.util.Arrays.deepEquals(this, other)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// * Nested arrays are treated as lists too.
//// *
//// * If any of arrays contains itself on any nesting level the behavior is undefined.
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static <T> T[].contentDeepHashCode(): Int {
////        return java.util.Arrays.deepHashCode(this)
////    }
////
/////**
//// * Returns a string representation of the contents of this array as if it is a [List].
//// * Nested arrays are treated as lists too.
//// *
//// * If any of arrays contains itself on any nesting level that reference
//// * is rendered as `"[...]"` to prevent recursion.
//// *
//// * @sample samples.collections.Arrays.ContentOperations.contentDeepToString
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static <T> T[].contentDeepToString(): String {
////        return java.util.Arrays.deepToString(this)
////    }
////
/////**
//// * Returns `true` if the two specified arrays are *structurally* equal to one another,
//// * i.e. contain the same number of the same elements in the same order.
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public infix static <T> T[].contentEquals(other: T[]): Boolean {
////        return java.util.Arrays.equals(this, other)
////    }
////
/////**
//// * Returns `true` if the two specified arrays are *structurally* equal to one another,
//// * i.e. contain the same number of the same elements in the same order.
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public infix static byte[].contentEquals(other: byte[]): Boolean {
////        return java.util.Arrays.equals(this, other)
////    }
////
/////**
//// * Returns `true` if the two specified arrays are *structurally* equal to one another,
//// * i.e. contain the same number of the same elements in the same order.
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public infix static short[].contentEquals(other: short[]): Boolean {
////        return java.util.Arrays.equals(this, other)
////    }
////
/////**
//// * Returns `true` if the two specified arrays are *structurally* equal to one another,
//// * i.e. contain the same number of the same elements in the same order.
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public infix static int[].contentEquals(other: int[]): Boolean {
////        return java.util.Arrays.equals(this, other)
////    }
////
/////**
//// * Returns `true` if the two specified arrays are *structurally* equal to one another,
//// * i.e. contain the same number of the same elements in the same order.
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public infix static long[].contentEquals(other: long[]): Boolean {
////        return java.util.Arrays.equals(this, other)
////    }
////
/////**
//// * Returns `true` if the two specified arrays are *structurally* equal to one another,
//// * i.e. contain the same number of the same elements in the same order.
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public infix static float[].contentEquals(other: float[]): Boolean {
////        return java.util.Arrays.equals(this, other)
////    }
////
/////**
//// * Returns `true` if the two specified arrays are *structurally* equal to one another,
//// * i.e. contain the same number of the same elements in the same order.
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public infix static double[].contentEquals(other: double[]): Boolean {
////        return java.util.Arrays.equals(this, other)
////    }
////
/////**
//// * Returns `true` if the two specified arrays are *structurally* equal to one another,
//// * i.e. contain the same number of the same elements in the same order.
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public infix static boolean[].contentEquals(other: boolean[]): Boolean {
////        return java.util.Arrays.equals(this, other)
////    }
////
/////**
//// * Returns `true` if the two specified arrays are *structurally* equal to one another,
//// * i.e. contain the same number of the same elements in the same order.
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public infix static char[].contentEquals(other: char[]): Boolean {
////        return java.util.Arrays.equals(this, other)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static <T> T[].contentHashCode(): Int {
////        return java.util.Arrays.hashCode(this)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static byte[].contentHashCode(): Int {
////        return java.util.Arrays.hashCode(this)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static short[].contentHashCode(): Int {
////        return java.util.Arrays.hashCode(this)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static int[].contentHashCode(): Int {
////        return java.util.Arrays.hashCode(this)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static long[].contentHashCode(): Int {
////        return java.util.Arrays.hashCode(this)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static float[].contentHashCode(): Int {
////        return java.util.Arrays.hashCode(this)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static double[].contentHashCode(): Int {
////        return java.util.Arrays.hashCode(this)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static boolean[].contentHashCode(): Int {
////        return java.util.Arrays.hashCode(this)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static char[].contentHashCode(): Int {
////        return java.util.Arrays.hashCode(this)
////    }
////
////
////    /**
////     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
////     */
////    public static <T, R> T[].flatMap(transform: (T) -> Iterable<R>): List<R> {
////        return flatMapTo(ArrayList<R>(), transform)
////    }
////
////    /**
////     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
////     */
////    public static <R> byte[].flatMap(transform: (Byte) -> Iterable<R>): List<R> {
////        return flatMapTo(ArrayList<R>(), transform)
////    }
////
////    /**
////     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
////     */
////    public static <R> short[].flatMap(transform: (Short) -> Iterable<R>): List<R> {
////        return flatMapTo(ArrayList<R>(), transform)
////    }
////
////    /**
////     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
////     */
////    public static <R> int[].flatMap(transform: (Int) -> Iterable<R>): List<R> {
////        return flatMapTo(ArrayList<R>(), transform)
////    }
////
////    /**
////     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
////     */
////    public static <R> long[].flatMap(transform: (Long) -> Iterable<R>): List<R> {
////        return flatMapTo(ArrayList<R>(), transform)
////    }
////
////    /**
////     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
////     */
////    public static <R> float[].flatMap(transform: (Float) -> Iterable<R>): List<R> {
////        return flatMapTo(ArrayList<R>(), transform)
////    }
////
////    /**
////     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
////     */
////    public static <R> double[].flatMap(transform: (Double) -> Iterable<R>): List<R> {
////        return flatMapTo(ArrayList<R>(), transform)
////    }
////
////    /**
////     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
////     */
////    public static <R> boolean[].flatMap(transform: (Boolean) -> Iterable<R>): List<R> {
////        return flatMapTo(ArrayList<R>(), transform)
////    }
////
////    /**
////     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
////     */
////    public static <R> char[].flatMap(transform: (Char) -> Iterable<R>): List<R> {
////        return flatMapTo(ArrayList<R>(), transform)
////    }
////
////    /**
////     * Appends all elements yielded from results of [transform] function being invoked on each element of original array, to the given [destination].
////     */
////    public static <T, R, C : MutableCollection<in R>> T[].flatMapTo(destination: C, transform: (T) -> Iterable<R>): C {
////        for (element in this) {
////            val list = transform(element)
////            destination.addAll(list)
////        }
////        return destination
////    }
////
////    /**
////     * Appends all elements yielded from results of [transform] function being invoked on each element of original array, to the given [destination].
////     */
////    public static <R, C : MutableCollection<in R>> byte[].flatMapTo(destination: C, transform: (Byte) -> Iterable<R>): C {
////        for (element in this) {
////            val list = transform(element)
////            destination.addAll(list)
////        }
////        return destination
////    }
////
////    /**
////     * Appends all elements yielded from results of [transform] function being invoked on each element of original array, to the given [destination].
////     */
////    public static <R, C : MutableCollection<in R>> short[].flatMapTo(destination: C, transform: (Short) -> Iterable<R>): C {
////        for (element in this) {
////            val list = transform(element)
////            destination.addAll(list)
////        }
////        return destination
////    }
////
////    /**
////     * Appends all elements yielded from results of [transform] function being invoked on each element of original array, to the given [destination].
////     */
////    public static <R, C : MutableCollection<in R>> int[].flatMapTo(destination: C, transform: (Int) -> Iterable<R>): C {
////        for (element in this) {
////            val list = transform(element)
////            destination.addAll(list)
////        }
////        return destination
////    }
////
////    /**
////     * Appends all elements yielded from results of [transform] function being invoked on each element of original array, to the given [destination].
////     */
////    public static <R, C : MutableCollection<in R>> long[].flatMapTo(destination: C, transform: (Long) -> Iterable<R>): C {
////        for (element in this) {
////            val list = transform(element)
////            destination.addAll(list)
////        }
////        return destination
////    }
////
////    /**
////     * Appends all elements yielded from results of [transform] function being invoked on each element of original array, to the given [destination].
////     */
////    public static <R, C : MutableCollection<in R>> float[].flatMapTo(destination: C, transform: (Float) -> Iterable<R>): C {
////        for (element in this) {
////            val list = transform(element)
////            destination.addAll(list)
////        }
////        return destination
////    }
////
////    /**
////     * Appends all elements yielded from results of [transform] function being invoked on each element of original array, to the given [destination].
////     */
////    public static <R, C : MutableCollection<in R>> double[].flatMapTo(destination: C, transform: (Double) -> Iterable<R>): C {
////        for (element in this) {
////            val list = transform(element)
////            destination.addAll(list)
////        }
////        return destination
////    }
////
////    /**
////     * Appends all elements yielded from results of [transform] function being invoked on each element of original array, to the given [destination].
////     */
////    public static <R, C : MutableCollection<in R>> boolean[].flatMapTo(destination: C, transform: (Boolean) -> Iterable<R>): C {
////        for (element in this) {
////            val list = transform(element)
////            destination.addAll(list)
////        }
////        return destination
////    }
////
////    /**
////     * Appends all elements yielded from results of [transform] function being invoked on each element of original array, to the given [destination].
////     */
////    public static <R, C : MutableCollection<in R>> char[].flatMapTo(destination: C, transform: (Char) -> Iterable<R>): C {
////        for (element in this) {
////            val list = transform(element)
////            destination.addAll(list)
////        }
////        return destination
////    }
//}
