package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Arrayx3 {
////    /**
////     * Returns the last element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public static <T> last(@NotNull T[] elements, ): T {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[lastIndex]
////    }
////
////    /**
////     * Returns the last element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public static last(@NotNull byte[] elements, ): Byte {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[lastIndex]
////    }
////
////    /**
////     * Returns the last element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public static last(@NotNull short[] elements, ): Short {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[lastIndex]
////    }
////
////    /**
////     * Returns the last element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public static last(@NotNull int[] elements, ): Int {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[lastIndex]
////    }
////
////    /**
////     * Returns the last element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public static last(@NotNull long[] elements, ): Long {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[lastIndex]
////    }
////
////    /**
////     * Returns the last element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public static last(@NotNull float[] elements, ): Float {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[lastIndex]
////    }
////
////    /**
////     * Returns the last element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public static last(@NotNull double[] elements, ): Double {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[lastIndex]
////    }
////
////    /**
////     * Returns the last element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public static last(@NotNull boolean[] elements, ): Boolean {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[lastIndex]
////    }
////
////    /**
////     * Returns the last element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public static last(@NotNull char[] elements, ): Char {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[lastIndex]
////    }
////
////    /**
////     * Returns the last element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public static <T> last(@NotNull T[] elements, Predicate<T> predicate): T {
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
////    public static last(@NotNull byte[] elements, Predicate<Byte> predicate): Byte {
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
////    public static last(@NotNull short[] elements, Predicate<Short> predicate): Short {
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
////    public static last(@NotNull int[] elements, Predicate<Integer> predicate): Int {
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
////    public static last(@NotNull long[] elements, Predicate<Long> predicate): Long {
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
////    public static last(@NotNull float[] elements, Predicate<Float> predicate): Float {
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
////    public static last(@NotNull double[] elements, Predicate<Double> predicate): Double {
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
////    public static last(@NotNull boolean[] elements, Predicate<Boolean> predicate): Boolean {
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
////    public static last(@NotNull char[] elements, Predicate<Character> predicate): Char {
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
////    public static <@kotlin.internal.OnlyInputTypes T> lastIndexOf(@NotNull T[] elements, element: T): Int {
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
////    public static lastIndexOf(@NotNull byte[] elements, element: Byte): Int {
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
////    public static lastIndexOf(@NotNull short[] elements, element: Short): Int {
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
////    public static lastIndexOf(@NotNull int[] elements, element: Int): Int {
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
////    public static lastIndexOf(@NotNull long[] elements, element: Long): Int {
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
////    public static lastIndexOf(@NotNull float[] elements, element: Float): Int {
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
////    public static lastIndexOf(@NotNull double[] elements, element: Double): Int {
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
////    public static lastIndexOf(@NotNull boolean[] elements, element: Boolean): Int {
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
////    public static lastIndexOf(@NotNull char[] elements, element: Char): Int {
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
////    public static <T> lastOrNull(@NotNull T[] elements, ): T? {
////        return if (isEmpty()) null else this[size - 1]
////    }
////
////    /**
////     * Returns the last element, or `null` if the array is empty.
////     */
////    public static lastOrNull(@NotNull byte[] elements, ): Byte? {
////        return if (isEmpty()) null else this[size - 1]
////    }
////
////    /**
////     * Returns the last element, or `null` if the array is empty.
////     */
////    public static lastOrNull(@NotNull short[] elements, ): Short? {
////        return if (isEmpty()) null else this[size - 1]
////    }
////
////    /**
////     * Returns the last element, or `null` if the array is empty.
////     */
////    public static lastOrNull(@NotNull int[] elements, ): Int? {
////        return if (isEmpty()) null else this[size - 1]
////    }
////
////    /**
////     * Returns the last element, or `null` if the array is empty.
////     */
////    public static lastOrNull(@NotNull long[] elements, ): Long? {
////        return if (isEmpty()) null else this[size - 1]
////    }
////
////    /**
////     * Returns the last element, or `null` if the array is empty.
////     */
////    public static lastOrNull(@NotNull float[] elements, ): Float? {
////        return if (isEmpty()) null else this[size - 1]
////    }
////
////    /**
////     * Returns the last element, or `null` if the array is empty.
////     */
////    public static lastOrNull(@NotNull double[] elements, ): Double? {
////        return if (isEmpty()) null else this[size - 1]
////    }
////
////    /**
////     * Returns the last element, or `null` if the array is empty.
////     */
////    public static lastOrNull(@NotNull boolean[] elements, ): Boolean? {
////        return if (isEmpty()) null else this[size - 1]
////    }
////
////    /**
////     * Returns the last element, or `null` if the array is empty.
////     */
////    public static lastOrNull(@NotNull char[] elements, ): Char? {
////        return if (isEmpty()) null else this[size - 1]
////    }
////
////    /**
////     * Returns the last element matching the given [predicate], or `null` if no such element was found.
////     */
////    public static <T> lastOrNull(@NotNull T[] elements, Predicate<T> predicate): T? {
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
////    public static lastOrNull(@NotNull byte[] elements, Predicate<Byte> predicate): Byte? {
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
////    public static lastOrNull(@NotNull short[] elements, Predicate<Short> predicate): Short? {
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
////    public static lastOrNull(@NotNull int[] elements, Predicate<Integer> predicate): Int? {
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
////    public static lastOrNull(@NotNull long[] elements, Predicate<Long> predicate): Long? {
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
////    public static lastOrNull(@NotNull float[] elements, Predicate<Float> predicate): Float? {
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
////    public static lastOrNull(@NotNull double[] elements, Predicate<Double> predicate): Double? {
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
////    public static lastOrNull(@NotNull boolean[] elements, Predicate<Boolean> predicate): Boolean? {
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
////    public static lastOrNull(@NotNull char[] elements, Predicate<Character> predicate): Char? {
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
////    public static <T> drop(@NotNull T[] elements, n: Int): List<T> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except first [n] elements.
////     */
////    public static drop(@NotNull byte[] elements, n: Int): List<Byte> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except first [n] elements.
////     */
////    public static drop(@NotNull short[] elements, n: Int): List<Short> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except first [n] elements.
////     */
////    public static drop(@NotNull int[] elements, n: Int): List<Integer> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except first [n] elements.
////     */
////    public static drop(@NotNull long[] elements, n: Int): List<Long> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except first [n] elements.
////     */
////    public static drop(@NotNull float[] elements, n: Int): List<Float> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except first [n] elements.
////     */
////    public static drop(@NotNull double[] elements, n: Int): List<Double> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except first [n] elements.
////     */
////    public static drop(@NotNull boolean[] elements, n: Int): List<Boolean> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except first [n] elements.
////     */
////    public static drop(@NotNull char[] elements, n: Int): List<Character> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static <T> dropLast(@NotNull T[] elements, n: Int): List<T> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return take((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static dropLast(@NotNull byte[] elements, n: Int): List<Byte> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return take((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static dropLast(@NotNull short[] elements, n: Int): List<Short> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return take((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static dropLast(@NotNull int[] elements, n: Int): List<Integer> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return take((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static dropLast(@NotNull long[] elements, n: Int): List<Long> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return take((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static dropLast(@NotNull float[] elements, n: Int): List<Float> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return take((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static dropLast(@NotNull double[] elements, n: Int): List<Double> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return take((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static dropLast(@NotNull boolean[] elements, n: Int): List<Boolean> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return take((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static dropLast(@NotNull char[] elements, n: Int): List<Character> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return take((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last elements that satisfy the given [predicate].
////     */
////    public static <T> dropLastWhile(@NotNull T[] elements, Predicate<T> predicate): List<T> {
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
////    public static dropLastWhile(@NotNull byte[] elements, Predicate<Byte> predicate): List<Byte> {
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
////    public static dropLastWhile(@NotNull short[] elements, Predicate<Short> predicate): List<Short> {
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
////    public static dropLastWhile(@NotNull int[] elements, Predicate<Integer> predicate): List<Integer> {
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
////    public static dropLastWhile(@NotNull long[] elements, Predicate<Long> predicate): List<Long> {
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
////    public static dropLastWhile(@NotNull float[] elements, Predicate<Float> predicate): List<Float> {
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
////    public static dropLastWhile(@NotNull double[] elements, Predicate<Double> predicate): List<Double> {
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
////    public static dropLastWhile(@NotNull boolean[] elements, Predicate<Boolean> predicate): List<Boolean> {
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
////    public static dropLastWhile(@NotNull char[] elements, Predicate<Character> predicate): List<Character> {
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
////    public static <T> dropWhile(@NotNull T[] elements, Predicate<T> predicate): List<T> {
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
////    public static dropWhile(@NotNull byte[] elements, Predicate<Byte> predicate): List<Byte> {
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
////    public static dropWhile(@NotNull short[] elements, Predicate<Short> predicate): List<Short> {
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
////    public static dropWhile(@NotNull int[] elements, Predicate<Integer> predicate): List<Integer> {
////        var yielding = false
////        val list = ArrayList<Integer>()
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
////    public static dropWhile(@NotNull long[] elements, Predicate<Long> predicate): List<Long> {
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
////    public static dropWhile(@NotNull float[] elements, Predicate<Float> predicate): List<Float> {
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
////    public static dropWhile(@NotNull double[] elements, Predicate<Double> predicate): List<Double> {
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
////    public static dropWhile(@NotNull boolean[] elements, Predicate<Boolean> predicate): List<Boolean> {
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
////    public static dropWhile(@NotNull char[] elements, Predicate<Character> predicate): List<Character> {
////        var yielding = false
////        val list = ArrayList<Character>()
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
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static <T> slice(@NotNull T[] elements, indices: IntRange): List<T> {
////        if (indices.isEmpty()) return listOf()
////        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static slice(@NotNull byte[] elements, indices: IntRange): List<Byte> {
////        if (indices.isEmpty()) return listOf()
////        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static slice(@NotNull short[] elements, indices: IntRange): List<Short> {
////        if (indices.isEmpty()) return listOf()
////        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static slice(@NotNull int[] elements, indices: IntRange): List<Integer> {
////        if (indices.isEmpty()) return listOf()
////        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static slice(@NotNull long[] elements, indices: IntRange): List<Long> {
////        if (indices.isEmpty()) return listOf()
////        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static slice(@NotNull float[] elements, indices: IntRange): List<Float> {
////        if (indices.isEmpty()) return listOf()
////        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static slice(@NotNull double[] elements, indices: IntRange): List<Double> {
////        if (indices.isEmpty()) return listOf()
////        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static slice(@NotNull boolean[] elements, indices: IntRange): List<Boolean> {
////        if (indices.isEmpty()) return listOf()
////        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static slice(@NotNull char[] elements, indices: IntRange): List<Character> {
////        if (indices.isEmpty()) return listOf()
////        return copyOfRange(indices.start, indices.endInclusive + 1).asList()
////    }
////
////    /**
////     * Returns a list containing elements at specified [indices].
////     */
////    public static <T> slice(@NotNull T[] elements, indices: Iterable<Integer>): List<T> {
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
////    public static slice(@NotNull byte[] elements, indices: Iterable<Integer>): List<Byte> {
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
////    public static slice(@NotNull short[] elements, indices: Iterable<Integer>): List<Short> {
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
////    public static slice(@NotNull int[] elements, indices: Iterable<Integer>): List<Integer> {
////        val size = indices.collectionSizeOrDefault(10)
////        if (size == 0) return emptyList()
////        val list = ArrayList<Integer>(size)
////        for (index in indices) {
////            list.add(get(index))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing elements at specified [indices].
////     */
////    public static slice(@NotNull long[] elements, indices: Iterable<Integer>): List<Long> {
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
////    public static slice(@NotNull float[] elements, indices: Iterable<Integer>): List<Float> {
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
////    public static slice(@NotNull double[] elements, indices: Iterable<Integer>): List<Double> {
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
////    public static slice(@NotNull boolean[] elements, indices: Iterable<Integer>): List<Boolean> {
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
////    public static slice(@NotNull char[] elements, indices: Iterable<Integer>): List<Character> {
////        val size = indices.collectionSizeOrDefault(10)
////        if (size == 0) return emptyList()
////        val list = ArrayList<Character>(size)
////        for (index in indices) {
////            list.add(get(index))
////        }
////        return list
////    }
////
////    /**
////     * Returns an array containing elements of this array at specified [indices].
////     */
////    public static <T> Array<T>.sliceArray(indices: Collection<Integer>): Array<T> {
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
////    public static sliceArray(@NotNull byte[] elements, indices: Collection<Integer>): byte[] {
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
////    public static sliceArray(@NotNull short[] elements, indices: Collection<Integer>): short[] {
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
////    public static sliceArray(@NotNull int[] elements, indices: Collection<Integer>): int[] {
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
////    public static sliceArray(@NotNull long[] elements, indices: Collection<Integer>): long[] {
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
////    public static sliceArray(@NotNull float[] elements, indices: Collection<Integer>): float[] {
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
////    public static sliceArray(@NotNull double[] elements, indices: Collection<Integer>): double[] {
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
////    public static sliceArray(@NotNull boolean[] elements, indices: Collection<Integer>): boolean[] {
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
////    public static sliceArray(@NotNull char[] elements, indices: Collection<Integer>): char[] {
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
////    public static sliceArray(@NotNull byte[] elements, indices: IntRange): byte[] {
////        if (indices.isEmpty()) return byte[](0)
////        return copyOfRange(indices.start, indices.endInclusive + 1)
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static sliceArray(@NotNull short[] elements, indices: IntRange): short[] {
////        if (indices.isEmpty()) return short[](0)
////        return copyOfRange(indices.start, indices.endInclusive + 1)
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static sliceArray(@NotNull int[] elements, indices: IntRange): int[] {
////        if (indices.isEmpty()) return int[](0)
////        return copyOfRange(indices.start, indices.endInclusive + 1)
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static sliceArray(@NotNull long[] elements, indices: IntRange): long[] {
////        if (indices.isEmpty()) return long[](0)
////        return copyOfRange(indices.start, indices.endInclusive + 1)
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static sliceArray(@NotNull float[] elements, indices: IntRange): float[] {
////        if (indices.isEmpty()) return float[](0)
////        return copyOfRange(indices.start, indices.endInclusive + 1)
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static sliceArray(@NotNull double[] elements, indices: IntRange): double[] {
////        if (indices.isEmpty()) return double[](0)
////        return copyOfRange(indices.start, indices.endInclusive + 1)
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static sliceArray(@NotNull boolean[] elements, indices: IntRange): boolean[] {
////        if (indices.isEmpty()) return boolean[](0)
////        return copyOfRange(indices.start, indices.endInclusive + 1)
////    }
////
////    /**
////     * Returns a list containing elements at indices in the specified [indices] range.
////     */
////    public static sliceArray(@NotNull char[] elements, indices: IntRange): char[] {
////        if (indices.isEmpty()) return char[](0)
////        return copyOfRange(indices.start, indices.endInclusive + 1)
////    }
////
////    /**
////     * Returns a list containing first [n] elements.
////     */
////    public static <T> take(@NotNull T[] elements, n: Int): List<T> {
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
////    public static take(@NotNull byte[] elements, n: Int): List<Byte> {
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
////    public static take(@NotNull short[] elements, n: Int): List<Short> {
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
////    public static take(@NotNull int[] elements, n: Int): List<Integer> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        if (n == 0) return emptyList()
////        if (n >= size) return toList()
////        if (n == 1) return listOf(this[0])
////        var count = 0
////        val list = ArrayList<Integer>(n)
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
////    public static take(@NotNull long[] elements, n: Int): List<Long> {
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
////    public static take(@NotNull float[] elements, n: Int): List<Float> {
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
////    public static take(@NotNull double[] elements, n: Int): List<Double> {
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
////    public static take(@NotNull boolean[] elements, n: Int): List<Boolean> {
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
////    public static take(@NotNull char[] elements, n: Int): List<Character> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        if (n == 0) return emptyList()
////        if (n >= size) return toList()
////        if (n == 1) return listOf(this[0])
////        var count = 0
////        val list = ArrayList<Character>(n)
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
////    public static <T> takeLast(@NotNull T[] elements, n: Int): List<T> {
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
////    public static takeLast(@NotNull byte[] elements, n: Int): List<Byte> {
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
////    public static takeLast(@NotNull short[] elements, n: Int): List<Short> {
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
////    public static takeLast(@NotNull int[] elements, n: Int): List<Integer> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        if (n == 0) return emptyList()
////        val size = size
////        if (n >= size) return toList()
////        if (n == 1) return listOf(this[size - 1])
////        val list = ArrayList<Integer>(n)
////        for (index in size - n until size)
////        list.add(this[index])
////        return list
////    }
////
////    /**
////     * Returns a list containing last [n] elements.
////     */
////    public static takeLast(@NotNull long[] elements, n: Int): List<Long> {
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
////    public static takeLast(@NotNull float[] elements, n: Int): List<Float> {
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
////    public static takeLast(@NotNull double[] elements, n: Int): List<Double> {
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
////    public static takeLast(@NotNull boolean[] elements, n: Int): List<Boolean> {
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
////    public static takeLast(@NotNull char[] elements, n: Int): List<Character> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        if (n == 0) return emptyList()
////        val size = size
////        if (n >= size) return toList()
////        if (n == 1) return listOf(this[size - 1])
////        val list = ArrayList<Character>(n)
////        for (index in size - n until size)
////        list.add(this[index])
////        return list
////    }
////
////    /**
////     * Returns a list containing last elements satisfying the given [predicate].
////     */
////    public static <T> takeLastWhile(@NotNull T[] elements, Predicate<T> predicate): List<T> {
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
////    public static takeLastWhile(@NotNull byte[] elements, Predicate<Byte> predicate): List<Byte> {
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
////    public static takeLastWhile(@NotNull short[] elements, Predicate<Short> predicate): List<Short> {
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
////    public static takeLastWhile(@NotNull int[] elements, Predicate<Integer> predicate): List<Integer> {
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
////    public static takeLastWhile(@NotNull long[] elements, Predicate<Long> predicate): List<Long> {
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
////    public static takeLastWhile(@NotNull float[] elements, Predicate<Float> predicate): List<Float> {
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
////    public static takeLastWhile(@NotNull double[] elements, Predicate<Double> predicate): List<Double> {
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
////    public static takeLastWhile(@NotNull boolean[] elements, Predicate<Boolean> predicate): List<Boolean> {
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
////    public static takeLastWhile(@NotNull char[] elements, Predicate<Character> predicate): List<Character> {
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
////    public static <T> takeWhile(@NotNull T[] elements, Predicate<T> predicate): List<T> {
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
////    public static takeWhile(@NotNull byte[] elements, Predicate<Byte> predicate): List<Byte> {
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
////    public static takeWhile(@NotNull short[] elements, Predicate<Short> predicate): List<Short> {
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
////    public static takeWhile(@NotNull int[] elements, Predicate<Integer> predicate): List<Integer> {
////        val list = ArrayList<Integer>()
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
////    public static takeWhile(@NotNull long[] elements, Predicate<Long> predicate): List<Long> {
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
////    public static takeWhile(@NotNull float[] elements, Predicate<Float> predicate): List<Float> {
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
////    public static takeWhile(@NotNull double[] elements, Predicate<Double> predicate): List<Double> {
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
////    public static takeWhile(@NotNull boolean[] elements, Predicate<Boolean> predicate): List<Boolean> {
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
////    public static takeWhile(@NotNull char[] elements, Predicate<Character> predicate): List<Character> {
////        val list = ArrayList<Character>()
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
////    public infix static <T> contentDeepEquals(@NotNull T[] elements, other: T[]): Boolean {
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
////    public static <T> contentDeepHashCode(@NotNull T[] elements, ): Int {
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
////    public static <T> contentDeepToString(@NotNull T[] elements, ): String {
////        return java.util.Arrays.deepToString(this)
////    }
////
/////**
//// * Returns `true` if the two specified arrays are *structurally* equal to one another,
//// * i.e. contain the same number of the same elements in the same order.
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public infix static <T> contentEquals(@NotNull T[] elements, other: T[]): Boolean {
////        return java.util.Arrays.equals(this, other)
////    }
////
/////**
//// * Returns `true` if the two specified arrays are *structurally* equal to one another,
//// * i.e. contain the same number of the same elements in the same order.
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public infix static contentEquals(@NotNull byte[] elements, other: byte[]): Boolean {
////        return java.util.Arrays.equals(this, other)
////    }
////
/////**
//// * Returns `true` if the two specified arrays are *structurally* equal to one another,
//// * i.e. contain the same number of the same elements in the same order.
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public infix static contentEquals(@NotNull short[] elements, short[] other): Boolean {
////        return java.util.Arrays.equals(this, other)
////    }
////
/////**
//// * Returns `true` if the two specified arrays are *structurally* equal to one another,
//// * i.e. contain the same number of the same elements in the same order.
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public infix static contentEquals(@NotNull int[] elements, int[] other): Boolean {
////        return java.util.Arrays.equals(this, other)
////    }
////
/////**
//// * Returns `true` if the two specified arrays are *structurally* equal to one another,
//// * i.e. contain the same number of the same elements in the same order.
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public infix static contentEquals(@NotNull long[] elements, long[] other): Boolean {
////        return java.util.Arrays.equals(this, other)
////    }
////
/////**
//// * Returns `true` if the two specified arrays are *structurally* equal to one another,
//// * i.e. contain the same number of the same elements in the same order.
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public infix static contentEquals(@NotNull float[] elements, float[] other): Boolean {
////        return java.util.Arrays.equals(this, other)
////    }
////
/////**
//// * Returns `true` if the two specified arrays are *structurally* equal to one another,
//// * i.e. contain the same number of the same elements in the same order.
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public infix static contentEquals(@NotNull double[] elements, double[] other): Boolean {
////        return java.util.Arrays.equals(this, other)
////    }
////
/////**
//// * Returns `true` if the two specified arrays are *structurally* equal to one another,
//// * i.e. contain the same number of the same elements in the same order.
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public infix static contentEquals(@NotNull boolean[] elements, other: boolean[]): Boolean {
////        return java.util.Arrays.equals(this, other)
////    }
////
/////**
//// * Returns `true` if the two specified arrays are *structurally* equal to one another,
//// * i.e. contain the same number of the same elements in the same order.
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public infix static contentEquals(@NotNull char[] elements, char[] other): Boolean {
////        return java.util.Arrays.equals(this, other)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static <T> contentHashCode(@NotNull T[] elements, ): Int {
////        return java.util.Arrays.hashCode(this)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static contentHashCode(@NotNull byte[] elements, ): Int {
////        return java.util.Arrays.hashCode(this)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static contentHashCode(@NotNull short[] elements, ): Int {
////        return java.util.Arrays.hashCode(this)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static contentHashCode(@NotNull int[] elements, ): Int {
////        return java.util.Arrays.hashCode(this)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static contentHashCode(@NotNull long[] elements, ): Int {
////        return java.util.Arrays.hashCode(this)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static contentHashCode(@NotNull float[] elements, ): Int {
////        return java.util.Arrays.hashCode(this)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static contentHashCode(@NotNull double[] elements, ): Int {
////        return java.util.Arrays.hashCode(this)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static contentHashCode(@NotNull boolean[] elements, ): Int {
////        return java.util.Arrays.hashCode(this)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static contentHashCode(@NotNull char[] elements, ): Int {
////        return java.util.Arrays.hashCode(this)
////    }
////
////
////    /**
////     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
////     */
////    public static <T, R> flatMap(@NotNull T[] elements, transform: (T) -> Iterable<R>): List<R> {
////        return flatMapTo(ArrayList<R>(), transform)
////    }
////
////    /**
////     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
////     */
////    public static <R> flatMap(@NotNull byte[] elements, transform: (Byte) -> Iterable<R>): List<R> {
////        return flatMapTo(ArrayList<R>(), transform)
////    }
////
////    /**
////     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
////     */
////    public static <R> flatMap(@NotNull short[] elements, transform: (Short) -> Iterable<R>): List<R> {
////        return flatMapTo(ArrayList<R>(), transform)
////    }
////
////    /**
////     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
////     */
////    public static <R> flatMap(@NotNull int[] elements, transform: (Int) -> Iterable<R>): List<R> {
////        return flatMapTo(ArrayList<R>(), transform)
////    }
////
////    /**
////     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
////     */
////    public static <R> flatMap(@NotNull long[] elements, transform: (Long) -> Iterable<R>): List<R> {
////        return flatMapTo(ArrayList<R>(), transform)
////    }
////
////    /**
////     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
////     */
////    public static <R> flatMap(@NotNull float[] elements, transform: (Float) -> Iterable<R>): List<R> {
////        return flatMapTo(ArrayList<R>(), transform)
////    }
////
////    /**
////     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
////     */
////    public static <R> flatMap(@NotNull double[] elements, transform: (Double) -> Iterable<R>): List<R> {
////        return flatMapTo(ArrayList<R>(), transform)
////    }
////
////    /**
////     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
////     */
////    public static <R> flatMap(@NotNull boolean[] elements, transform: (Boolean) -> Iterable<R>): List<R> {
////        return flatMapTo(ArrayList<R>(), transform)
////    }
////
////    /**
////     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original array.
////     */
////    public static <R> flatMap(@NotNull char[] elements, transform: (Char) -> Iterable<R>): List<R> {
////        return flatMapTo(ArrayList<R>(), transform)
////    }
////
////    /**
////     * Appends all elements yielded from results of [transform] function being invoked on each element of original array, to the given [destination].
////     */
////    public static <T, R, C extends Collection<R>> flatMapTo(@NotNull T[] elements, C destination, transform: (T) -> Iterable<R>): C {
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
////    public static <R, C extends Collection<R>> flatMapTo(@NotNull byte[] elements, C destination, transform: (Byte) -> Iterable<R>): C {
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
////    public static <R, C extends Collection<R>> flatMapTo(@NotNull short[] elements, C destination, transform: (Short) -> Iterable<R>) {
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
////    public static <R, C extends Collection<R>> flatMapTo(@NotNull int[] elements, C destination, transform: (Int) -> Iterable<R>): C {
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
////    public static <R, C extends Collection<R>> flatMapTo(@NotNull long[] elements, C destination, transform: (Long) -> Iterable<R>): C {
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
////    public static <R, C extends Collection<R>> flatMapTo(@NotNull float[] elements, C destination, transform: (Float) -> Iterable<R>): C {
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
////    public static <R, C extends Collection<R>> flatMapTo(@NotNull double[] elements, C destination, transform: (Double) -> Iterable<R>): C {
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
////    public static <R, C extends Collection<R>> flatMapTo(@NotNull boolean[] elements, C destination, transform: (Boolean) -> Iterable<R>): C {
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
////    public static <R, C extends Collection<R>> flatMapTo(@NotNull char[] elements, C destination, transform: (Char) -> Iterable<R>): C {
////        for (element in this) {
////            val list = transform(element)
////            destination.addAll(list)
////        }
////        return destination
////    }
////    
////    /**
////     * Returns `true` if all elements match the given [predicate].
////     */
////    public inline fun <T> all(@NotNull T[] elements, Predicate<T> predicate): Boolean {
////        for (element in this) if (!predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if all elements match the given [predicate].
////     */
////    public inline fun all(@NotNull byte[] elements, Predicate<Byte> predicate): Boolean {
////        for (element in this) if (!predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if all elements match the given [predicate].
////     */
////    public inline fun all(@NotNull short[] elements, Predicate<Short> predicate): Boolean {
////        for (element in this) if (!predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if all elements match the given [predicate].
////     */
////    public inline fun all(@NotNull int[] elements, Predicate<Integer> predicate): Boolean {
////        for (element in this) if (!predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if all elements match the given [predicate].
////     */
////    public inline fun all(@NotNull long[] elements, Predicate<Long> predicate): Boolean {
////        for (element in this) if (!predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if all elements match the given [predicate].
////     */
////    public inline fun all(@NotNull long[] elements, Predicate<Float> predicate): Boolean {
////        for (element in this) if (!predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if all elements match the given [predicate].
////     */
////    public inline fun all(@NotNull double[] elements, Predicate<Double> predicate): Boolean {
////        for (element in this) if (!predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if all elements match the given [predicate].
////     */
////    public inline fun all(@NotNull boolean[] elements, Predicate<Boolean> predicate): Boolean {
////        for (element in this) if (!predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if all elements match the given [predicate].
////     */
////    public inline fun all(@NotNull char[] elements, Predicate<Character> predicate): Boolean {
////        for (element in this) if (!predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
////     *
////     * @sample samples.collections.Sequences.Building.sequenceFromArray
////     */
////    public fun <T> asSequence(@NotNull T[] elements, ): Sequence<T> {
////        if (isEmpty()) return emptySequence()
////        return Sequence { this.iterator() }
////    }
////
////    /**
////     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
////     *
////     * @sample samples.collections.Sequences.Building.sequenceFromArray
////     */
////    public fun asSequence(@NotNull byte[] elements, ): Sequence<Byte> {
////        if (isEmpty()) return emptySequence()
////        return Sequence { this.iterator() }
////    }
////
////    /**
////     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
////     *
////     * @sample samples.collections.Sequences.Building.sequenceFromArray
////     */
////    public fun asSequence(@NotNull short[] elements, ): Sequence<Short> {
////        if (isEmpty()) return emptySequence()
////        return Sequence { this.iterator() }
////    }
////
////    /**
////     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
////     *
////     * @sample samples.collections.Sequences.Building.sequenceFromArray
////     */
////    public fun asSequence(@NotNull int[] elements, ): Sequence<Integer> {
////        if (isEmpty()) return emptySequence()
////        return Sequence { this.iterator() }
////    }
////
////    /**
////     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
////     *
////     * @sample samples.collections.Sequences.Building.sequenceFromArray
////     */
////    public fun asSequence(@NotNull long[] elements, ): Sequence<Long> {
////        if (isEmpty()) return emptySequence()
////        return Sequence { this.iterator() }
////    }
////
////    /**
////     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
////     *
////     * @sample samples.collections.Sequences.Building.sequenceFromArray
////     */
////    public fun asSequence(@NotNull long[] elements, ): Sequence<Float> {
////        if (isEmpty()) return emptySequence()
////        return Sequence { this.iterator() }
////    }
////
////    /**
////     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
////     *
////     * @sample samples.collections.Sequences.Building.sequenceFromArray
////     */
////    public fun asSequence(@NotNull double[] elements, ): Sequence<Double> {
////        if (isEmpty()) return emptySequence()
////        return Sequence { this.iterator() }
////    }
////
////    /**
////     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
////     *
////     * @sample samples.collections.Sequences.Building.sequenceFromArray
////     */
////    public fun asSequence(@NotNull boolean[] elements, ): Sequence<Boolean> {
////        if (isEmpty()) return emptySequence()
////        return Sequence { this.iterator() }
////    }
////
////    /**
////     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
////     *
////     * @sample samples.collections.Sequences.Building.sequenceFromArray
////     */
////    public fun asSequence(@NotNull char[] elements, ): Sequence<Character> {
////        if (isEmpty()) return emptySequence()
////        return Sequence { this.iterator() }
////    }
////
////
////    /**
////     * Returns an average value of elements in the array.
////     */
////    @kotlin.jvm.JvmName("averageOfByte")
////    public fun Array<Byte>.average(): Double {
////        var sum: Double = 0.0
////        var count: Int = 0
////        for (element in this) {
////            sum += element
////            count += 1
////        }
////        return if (count == 0) Double.NaN else sum / count
////    }
////
/////**
//// * Returns an average value of elements in the array.
//// */
////    @kotlin.jvm.JvmName("averageOfShort")
////    public fun Array<Short>.average(): Double {
////        var sum: Double = 0.0
////        var count: Int = 0
////        for (element in this) {
////            sum += element
////            count += 1
////        }
////        return if (count == 0) Double.NaN else sum / count
////    }
////
/////**
//// * Returns an average value of elements in the array.
//// */
////    @kotlin.jvm.JvmName("averageOfInt")
////    public fun Array<Integer>.average(): Double {
////        var sum: Double = 0.0
////        var count: Int = 0
////        for (element in this) {
////            sum += element
////            count += 1
////        }
////        return if (count == 0) Double.NaN else sum / count
////    }
////
/////**
//// * Returns an average value of elements in the array.
//// */
////    @kotlin.jvm.JvmName("averageOfLong")
////    public fun Array<Long>.average(): Double {
////        var sum: Double = 0.0
////        var count: Int = 0
////        for (element in this) {
////            sum += element
////            count += 1
////        }
////        return if (count == 0) Double.NaN else sum / count
////    }
////
/////**
//// * Returns an average value of elements in the array.
//// */
////    @kotlin.jvm.JvmName("averageOfFloat")
////    public fun Array<Float>.average(): Double {
////        var sum: Double = 0.0
////        var count: Int = 0
////        for (element in this) {
////            sum += element
////            count += 1
////        }
////        return if (count == 0) Double.NaN else sum / count
////    }
////
/////**
//// * Returns an average value of elements in the array.
//// */
////    @kotlin.jvm.JvmName("averageOfDouble")
////    public fun Array<Double>.average(): Double {
////        var sum: Double = 0.0
////        var count: Int = 0
////        for (element in this) {
////            sum += element
////            count += 1
////        }
////        return if (count == 0) Double.NaN else sum / count
////    }
////
////    /**
////     * Returns an average value of elements in the array.
////     */
////    public fun average(@NotNull byte[] elements, ): Double {
////        var sum: Double = 0.0
////        var count: Int = 0
////        for (element in this) {
////            sum += element
////            count += 1
////        }
////        return if (count == 0) Double.NaN else sum / count
////    }
////
////    /**
////     * Returns an average value of elements in the array.
////     */
////    public fun average(@NotNull short[] elements, ): Double {
////        var sum: Double = 0.0
////        var count: Int = 0
////        for (element in this) {
////            sum += element
////            count += 1
////        }
////        return if (count == 0) Double.NaN else sum / count
////    }
////
////    /**
////     * Returns an average value of elements in the array.
////     */
////    public fun average(@NotNull int[] elements, ): Double {
////        var sum: Double = 0.0
////        var count: Int = 0
////        for (element in this) {
////            sum += element
////            count += 1
////        }
////        return if (count == 0) Double.NaN else sum / count
////    }
////
////    /**
////     * Returns an average value of elements in the array.
////     */
////    public fun average(@NotNull long[] elements, ): Double {
////        var sum: Double = 0.0
////        var count: Int = 0
////        for (element in this) {
////            sum += element
////            count += 1
////        }
////        return if (count == 0) Double.NaN else sum / count
////    }
////
////    /**
////     * Returns an average value of elements in the array.
////     */
////    public fun average(@NotNull long[] elements, ): Double {
////        var sum: Double = 0.0
////        var count: Int = 0
////        for (element in this) {
////            sum += element
////            count += 1
////        }
////        return if (count == 0) Double.NaN else sum / count
////    }
////
////    /**
////     * Returns an average value of elements in the array.
////     */
////    public fun average(@NotNull double[] elements, ): Double {
////        var sum: Double = 0.0
////        var count: Int = 0
////        for (element in this) {
////            sum += element
////            count += 1
////        }
////        return if (count == 0) Double.NaN else sum / count
////    }
////
////
////
////
////    /**
////     * Returns a [Map] containing key-value pairs provided by [transform] function
////     * applied to elements of the given array.
////     *
////     * If any of two pairs would have the same key the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <T, K, V> associate(@NotNull T[] elements, transform: (T) -> Pair<K, V>): Map<K, V> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateTo(LinkedHashMap<K, V>(capacity), transform)
////    }
////
////    /**
////     * Returns a [Map] containing key-value pairs provided by [transform] function
////     * applied to elements of the given array.
////     *
////     * If any of two pairs would have the same key the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <K, V> associate(@NotNull byte[] elements, transform: (Byte) -> Pair<K, V>): Map<K, V> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateTo(LinkedHashMap<K, V>(capacity), transform)
////    }
////
////    /**
////     * Returns a [Map] containing key-value pairs provided by [transform] function
////     * applied to elements of the given array.
////     *
////     * If any of two pairs would have the same key the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <K, V> associate(@NotNull short[] elements, transform: (Short) -> Pair<K, V>): Map<K, V> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateTo(LinkedHashMap<K, V>(capacity), transform)
////    }
////
////    /**
////     * Returns a [Map] containing key-value pairs provided by [transform] function
////     * applied to elements of the given array.
////     *
////     * If any of two pairs would have the same key the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <K, V> associate(@NotNull int[] elements, transform: (Int) -> Pair<K, V>): Map<K, V> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateTo(LinkedHashMap<K, V>(capacity), transform)
////    }
////
////    /**
////     * Returns a [Map] containing key-value pairs provided by [transform] function
////     * applied to elements of the given array.
////     *
////     * If any of two pairs would have the same key the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <K, V> associate(@NotNull long[] elements, transform: (Long) -> Pair<K, V>): Map<K, V> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateTo(LinkedHashMap<K, V>(capacity), transform)
////    }
////
////    /**
////     * Returns a [Map] containing key-value pairs provided by [transform] function
////     * applied to elements of the given array.
////     *
////     * If any of two pairs would have the same key the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <K, V> associate(@NotNull long[] elements, transform: (Float) -> Pair<K, V>): Map<K, V> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateTo(LinkedHashMap<K, V>(capacity), transform)
////    }
////
////    /**
////     * Returns a [Map] containing key-value pairs provided by [transform] function
////     * applied to elements of the given array.
////     *
////     * If any of two pairs would have the same key the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <K, V> associate(@NotNull double[] elements, transform: (Double) -> Pair<K, V>): Map<K, V> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateTo(LinkedHashMap<K, V>(capacity), transform)
////    }
////
////    /**
////     * Returns a [Map] containing key-value pairs provided by [transform] function
////     * applied to elements of the given array.
////     *
////     * If any of two pairs would have the same key the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <K, V> associate(@NotNull boolean[] elements, transform: (Boolean) -> Pair<K, V>): Map<K, V> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateTo(LinkedHashMap<K, V>(capacity), transform)
////    }
////
////    /**
////     * Returns a [Map] containing key-value pairs provided by [transform] function
////     * applied to elements of the given array.
////     *
////     * If any of two pairs would have the same key the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <K, V> associate(@NotNull char[] elements, transform: (Char) -> Pair<K, V>): Map<K, V> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateTo(LinkedHashMap<K, V>(capacity), transform)
////    }
////
////    /**
////     * Returns a [Map] containing the elements from the given array indexed by the key
////     * returned from [keySelector] function applied to each element.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <T, K> associateBy(@NotNull T[] elements, keySelector: (T) -> K): Map<K, T> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateByTo(LinkedHashMap<K, T>(capacity), keySelector)
////    }
////
////    /**
////     * Returns a [Map] containing the elements from the given array indexed by the key
////     * returned from [keySelector] function applied to each element.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <K> associateBy(@NotNull byte[] elements, keySelector: (Byte) -> K): Map<K, Byte> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateByTo(LinkedHashMap<K, Byte>(capacity), keySelector)
////    }
////
////    /**
////     * Returns a [Map] containing the elements from the given array indexed by the key
////     * returned from [keySelector] function applied to each element.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <K> associateBy(@NotNull short[] elements, keySelector: (Short) -> K): Map<K, Short> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateByTo(LinkedHashMap<K, Short>(capacity), keySelector)
////    }
////
////    /**
////     * Returns a [Map] containing the elements from the given array indexed by the key
////     * returned from [keySelector] function applied to each element.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <K> associateBy(@NotNull int[] elements, keySelector: (Int) -> K): Map<K, Int> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateByTo(LinkedHashMap<K, Int>(capacity), keySelector)
////    }
////
////    /**
////     * Returns a [Map] containing the elements from the given array indexed by the key
////     * returned from [keySelector] function applied to each element.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <K> associateBy(@NotNull long[] elements, keySelector: (Long) -> K): Map<K, Long> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateByTo(LinkedHashMap<K, Long>(capacity), keySelector)
////    }
////
////    /**
////     * Returns a [Map] containing the elements from the given array indexed by the key
////     * returned from [keySelector] function applied to each element.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <K> associateBy(@NotNull long[] elements, keySelector: (Float) -> K): Map<K, Float> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateByTo(LinkedHashMap<K, Float>(capacity), keySelector)
////    }
////
////    /**
////     * Returns a [Map] containing the elements from the given array indexed by the key
////     * returned from [keySelector] function applied to each element.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <K> associateBy(@NotNull double[] elements, keySelector: (Double) -> K): Map<K, Double> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateByTo(LinkedHashMap<K, Double>(capacity), keySelector)
////    }
////
////    /**
////     * Returns a [Map] containing the elements from the given array indexed by the key
////     * returned from [keySelector] function applied to each element.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <K> associateBy(@NotNull boolean[] elements, keySelector: (Boolean) -> K): Map<K, Boolean> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateByTo(LinkedHashMap<K, Boolean>(capacity), keySelector)
////    }
////
////    /**
////     * Returns a [Map] containing the elements from the given array indexed by the key
////     * returned from [keySelector] function applied to each element.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <K> associateBy(@NotNull char[] elements, keySelector: (Char) -> K): Map<K, Char> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateByTo(LinkedHashMap<K, Char>(capacity), keySelector)
////    }
////
////    /**
////     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <T, K, V> associateBy(@NotNull T[] elements, keySelector: (T) -> K, valueTransform: (T) -> V): Map<K, V> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateByTo(LinkedHashMap<K, V>(capacity), keySelector, valueTransform)
////    }
////
////    /**
////     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <K, V> associateBy(@NotNull byte[] elements, keySelector: (Byte) -> K, valueTransform: (Byte) -> V): Map<K, V> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateByTo(LinkedHashMap<K, V>(capacity), keySelector, valueTransform)
////    }
////
////    /**
////     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <K, V> associateBy(@NotNull short[] elements, keySelector: (Short) -> K, valueTransform: (Short) -> V): Map<K, V> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateByTo(LinkedHashMap<K, V>(capacity), keySelector, valueTransform)
////    }
////
////    /**
////     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <K, V> associateBy(@NotNull int[] elements, keySelector: (Int) -> K, valueTransform: (Int) -> V): Map<K, V> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateByTo(LinkedHashMap<K, V>(capacity), keySelector, valueTransform)
////    }
////
////    /**
////     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <K, V> associateBy(@NotNull long[] elements, keySelector: (Long) -> K, valueTransform: (Long) -> V): Map<K, V> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateByTo(LinkedHashMap<K, V>(capacity), keySelector, valueTransform)
////    }
////
////    /**
////     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <K, V> associateBy(@NotNull long[] elements, keySelector: (Float) -> K, valueTransform: (Float) -> V): Map<K, V> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateByTo(LinkedHashMap<K, V>(capacity), keySelector, valueTransform)
////    }
////
////    /**
////     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <K, V> associateBy(@NotNull double[] elements, keySelector: (Double) -> K, valueTransform: (Double) -> V): Map<K, V> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateByTo(LinkedHashMap<K, V>(capacity), keySelector, valueTransform)
////    }
////
////    /**
////     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <K, V> associateBy(@NotNull boolean[] elements, keySelector: (Boolean) -> K, valueTransform: (Boolean) -> V): Map<K, V> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateByTo(LinkedHashMap<K, V>(capacity), keySelector, valueTransform)
////    }
////
////    /**
////     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public inline fun <K, V> associateBy(@NotNull char[] elements, keySelector: (Char) -> K, valueTransform: (Char) -> V): Map<K, V> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateByTo(LinkedHashMap<K, V>(capacity), keySelector, valueTransform)
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs,
////     * where key is provided by the [keySelector] function applied to each element of the given array
////     * and value is the element itself.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     */
////    public inline fun <T, K, M : Map<K, in T>> associateByTo(@NotNull T[] elements, destination: M, keySelector: (T) -> K): M {
////        for (element in this) {
////            destination.put(keySelector(element), element)
////        }
////        return destination
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs,
////     * where key is provided by the [keySelector] function applied to each element of the given array
////     * and value is the element itself.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     */
////    public inline fun <K, M : Map<K, in Byte>> associateByTo(@NotNull byte[] elements, destination: M, keySelector: (Byte) -> K): M {
////        for (element in this) {
////            destination.put(keySelector(element), element)
////        }
////        return destination
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs,
////     * where key is provided by the [keySelector] function applied to each element of the given array
////     * and value is the element itself.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     */
////    public inline fun <K, M : Map<K, in Short>> associateByTo(@NotNull short[] elements, destination: M, keySelector: (Short) -> K): M {
////        for (element in this) {
////            destination.put(keySelector(element), element)
////        }
////        return destination
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs,
////     * where key is provided by the [keySelector] function applied to each element of the given array
////     * and value is the element itself.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     */
////    public inline fun <K, M : Map<K, in Int>> associateByTo(@NotNull int[] elements, destination: M, keySelector: (Int) -> K): M {
////        for (element in this) {
////            destination.put(keySelector(element), element)
////        }
////        return destination
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs,
////     * where key is provided by the [keySelector] function applied to each element of the given array
////     * and value is the element itself.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     */
////    public inline fun <K, M : Map<K, in Long>> associateByTo(@NotNull long[] elements, destination: M, keySelector: (Long) -> K): M {
////        for (element in this) {
////            destination.put(keySelector(element), element)
////        }
////        return destination
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs,
////     * where key is provided by the [keySelector] function applied to each element of the given array
////     * and value is the element itself.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     */
////    public inline fun <K, M : Map<K, in Float>> associateByTo(@NotNull long[] elements, destination: M, keySelector: (Float) -> K): M {
////        for (element in this) {
////            destination.put(keySelector(element), element)
////        }
////        return destination
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs,
////     * where key is provided by the [keySelector] function applied to each element of the given array
////     * and value is the element itself.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     */
////    public inline fun <K, M : Map<K, in Double>> associateByTo(@NotNull double[] elements, destination: M, keySelector: (Double) -> K): M {
////        for (element in this) {
////            destination.put(keySelector(element), element)
////        }
////        return destination
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs,
////     * where key is provided by the [keySelector] function applied to each element of the given array
////     * and value is the element itself.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     */
////    public inline fun <K, M : Map<K, in Boolean>> associateByTo(@NotNull boolean[] elements, destination: M, keySelector: (Boolean) -> K): M {
////        for (element in this) {
////            destination.put(keySelector(element), element)
////        }
////        return destination
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs,
////     * where key is provided by the [keySelector] function applied to each element of the given array
////     * and value is the element itself.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     */
////    public inline fun <K, M : Map<K, in Char>> associateByTo(@NotNull char[] elements, destination: M, keySelector: (Char) -> K): M {
////        for (element in this) {
////            destination.put(keySelector(element), element)
////        }
////        return destination
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs,
////     * where key is provided by the [keySelector] function and
////     * and value is provided by the [valueTransform] function applied to elements of the given array.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     */
////    public inline fun <T, K, V, M : Map<K, in V>> associateByTo(@NotNull T[] elements, destination: M, keySelector: (T) -> K, valueTransform: (T) -> V): M {
////        for (element in this) {
////            destination.put(keySelector(element), valueTransform(element))
////        }
////        return destination
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs,
////     * where key is provided by the [keySelector] function and
////     * and value is provided by the [valueTransform] function applied to elements of the given array.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     */
////    public inline fun <K, V, M : Map<K, in V>> associateByTo(@NotNull byte[] elements, destination: M, keySelector: (Byte) -> K, valueTransform: (Byte) -> V): M {
////        for (element in this) {
////            destination.put(keySelector(element), valueTransform(element))
////        }
////        return destination
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs,
////     * where key is provided by the [keySelector] function and
////     * and value is provided by the [valueTransform] function applied to elements of the given array.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     */
////    public inline fun <K, V, M : Map<K, in V>> associateByTo(@NotNull short[] elements, destination: M, keySelector: (Short) -> K, valueTransform: (Short) -> V): M {
////        for (element in this) {
////            destination.put(keySelector(element), valueTransform(element))
////        }
////        return destination
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs,
////     * where key is provided by the [keySelector] function and
////     * and value is provided by the [valueTransform] function applied to elements of the given array.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     */
////    public inline fun <K, V, M : Map<K, in V>> associateByTo(@NotNull int[] elements, destination: M, keySelector: (Int) -> K, valueTransform: (Int) -> V): M {
////        for (element in this) {
////            destination.put(keySelector(element), valueTransform(element))
////        }
////        return destination
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs,
////     * where key is provided by the [keySelector] function and
////     * and value is provided by the [valueTransform] function applied to elements of the given array.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     */
////    public inline fun <K, V, M : Map<K, in V>> associateByTo(@NotNull long[] elements, destination: M, keySelector: (Long) -> K, valueTransform: (Long) -> V): M {
////        for (element in this) {
////            destination.put(keySelector(element), valueTransform(element))
////        }
////        return destination
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs,
////     * where key is provided by the [keySelector] function and
////     * and value is provided by the [valueTransform] function applied to elements of the given array.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     */
////    public inline fun <K, V, M : Map<K, in V>> associateByTo(@NotNull long[] elements, destination: M, keySelector: (Float) -> K, valueTransform: (Float) -> V): M {
////        for (element in this) {
////            destination.put(keySelector(element), valueTransform(element))
////        }
////        return destination
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs,
////     * where key is provided by the [keySelector] function and
////     * and value is provided by the [valueTransform] function applied to elements of the given array.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     */
////    public inline fun <K, V, M : Map<K, in V>> associateByTo(@NotNull double[] elements, destination: M, keySelector: (Double) -> K, valueTransform: (Double) -> V): M {
////        for (element in this) {
////            destination.put(keySelector(element), valueTransform(element))
////        }
////        return destination
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs,
////     * where key is provided by the [keySelector] function and
////     * and value is provided by the [valueTransform] function applied to elements of the given array.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     */
////    public inline fun <K, V, M : Map<K, in V>> associateByTo(@NotNull boolean[] elements, destination: M, keySelector: (Boolean) -> K, valueTransform: (Boolean) -> V): M {
////        for (element in this) {
////            destination.put(keySelector(element), valueTransform(element))
////        }
////        return destination
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs,
////     * where key is provided by the [keySelector] function and
////     * and value is provided by the [valueTransform] function applied to elements of the given array.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     */
////    public inline fun <K, V, M : Map<K, in V>> associateByTo(@NotNull char[] elements, destination: M, keySelector: (Char) -> K, valueTransform: (Char) -> V): M {
////        for (element in this) {
////            destination.put(keySelector(element), valueTransform(element))
////        }
////        return destination
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs
////     * provided by [transform] function applied to each element of the given array.
////     *
////     * If any of two pairs would have the same key the last one gets added to the map.
////     */
////    public inline fun <T, K, V, M : Map<K, in V>> associateTo(@NotNull T[] elements, destination: M, transform: (T) -> Pair<K, V>): M {
////        for (element in this) {
////            destination += transform(element)
////        }
////        return destination
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs
////     * provided by [transform] function applied to each element of the given array.
////     *
////     * If any of two pairs would have the same key the last one gets added to the map.
////     */
////    public inline fun <K, V, M : Map<K, in V>> associateTo(@NotNull byte[] elements, destination: M, transform: (Byte) -> Pair<K, V>): M {
////        for (element in this) {
////            destination += transform(element)
////        }
////        return destination
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs
////     * provided by [transform] function applied to each element of the given array.
////     *
////     * If any of two pairs would have the same key the last one gets added to the map.
////     */
////    public inline fun <K, V, M : Map<K, in V>> associateTo(@NotNull short[] elements, destination: M, transform: (Short) -> Pair<K, V>): M {
////        for (element in this) {
////            destination += transform(element)
////        }
////        return destination
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs
////     * provided by [transform] function applied to each element of the given array.
////     *
////     * If any of two pairs would have the same key the last one gets added to the map.
////     */
////    public inline fun <K, V, M : Map<K, in V>> associateTo(@NotNull int[] elements, destination: M, transform: (Int) -> Pair<K, V>): M {
////        for (element in this) {
////            destination += transform(element)
////        }
////        return destination
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs
////     * provided by [transform] function applied to each element of the given array.
////     *
////     * If any of two pairs would have the same key the last one gets added to the map.
////     */
////    public inline fun <K, V, M : Map<K, in V>> associateTo(@NotNull long[] elements, destination: M, transform: (Long) -> Pair<K, V>): M {
////        for (element in this) {
////            destination += transform(element)
////        }
////        return destination
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs
////     * provided by [transform] function applied to each element of the given array.
////     *
////     * If any of two pairs would have the same key the last one gets added to the map.
////     */
////    public inline fun <K, V, M : Map<K, in V>> associateTo(@NotNull long[] elements, destination: M, transform: (Float) -> Pair<K, V>): M {
////        for (element in this) {
////            destination += transform(element)
////        }
////        return destination
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs
////     * provided by [transform] function applied to each element of the given array.
////     *
////     * If any of two pairs would have the same key the last one gets added to the map.
////     */
////    public inline fun <K, V, M : Map<K, in V>> associateTo(@NotNull double[] elements, destination: M, transform: (Double) -> Pair<K, V>): M {
////        for (element in this) {
////            destination += transform(element)
////        }
////        return destination
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs
////     * provided by [transform] function applied to each element of the given array.
////     *
////     * If any of two pairs would have the same key the last one gets added to the map.
////     */
////    public inline fun <K, V, M : Map<K, in V>> associateTo(@NotNull boolean[] elements, destination: M, transform: (Boolean) -> Pair<K, V>): M {
////        for (element in this) {
////            destination += transform(element)
////        }
////        return destination
////    }
////
////    /**
////     * Populates and returns the [destination] mutable map with key-value pairs
////     * provided by [transform] function applied to each element of the given array.
////     *
////     * If any of two pairs would have the same key the last one gets added to the map.
////     */
////    public inline fun <K, V, M : Map<K, in V>> associateTo(@NotNull char[] elements, destination: M, transform: (Char) -> Pair<K, V>): M {
////        for (element in this) {
////            destination += transform(element)
////        }
////        return destination
////    }
////
////
////    /**
////     * Searches the array or the range of the array for the provided [element] using the binary search algorithm.
////     * The array is expected to be sorted according to the specified [comparator], otherwise the result is undefined.
////     *
////     * If the array contains multiple elements equal to the specified [element], there is no guarantee which one will be found.
////     *
////     * @return the index of the element, if it is contained in the array within the specified range;
////     * otherwise, the inverted insertion point `(-insertion point - 1)`.
////     * The insertion point is defined as the index at which the element should be inserted,
////     * so that the array (or the specified subrange of array) still remains sorted according to the specified [comparator].
////     */
////    public fun <T> binarySearch(@NotNull T[] elements, T element, comparator: Comparator<T>, fromIndex: Int = 0, toIndex: Int = size): Int {
////        return java.util.Arrays.binarySearch(this, fromIndex, toIndex, element, comparator)
////    }
////
////    /**
////     * Searches the array or the range of the array for the provided [element] using the binary search algorithm.
////     * The array is expected to be sorted, otherwise the result is undefined.
////     *
////     * If the array contains multiple elements equal to the specified [element], there is no guarantee which one will be found.
////     *
////     * @return the index of the element, if it is contained in the array within the specified range;
////     * otherwise, the inverted insertion point `(-insertion point - 1)`.
////     * The insertion point is defined as the index at which the element should be inserted,
////     * so that the array (or the specified subrange of array) still remains sorted.
////     */
////    public fun <T> binarySearch(@NotNull T[] elements, T element, fromIndex: Int = 0, toIndex: Int = size): Int {
////        return java.util.Arrays.binarySearch(this, fromIndex, toIndex, element)
////    }
////
////    /**
////     * Searches the array or the range of the array for the provided [element] using the binary search algorithm.
////     * The array is expected to be sorted, otherwise the result is undefined.
////     *
////     * If the array contains multiple elements equal to the specified [element], there is no guarantee which one will be found.
////     *
////     * @return the index of the element, if it is contained in the array within the specified range;
////     * otherwise, the inverted insertion point `(-insertion point - 1)`.
////     * The insertion point is defined as the index at which the element should be inserted,
////     * so that the array (or the specified subrange of array) still remains sorted.
////     */
////    public fun binarySearch(@NotNull byte[] elements, byte element, fromIndex: Int = 0, toIndex: Int = size): Int {
////        return java.util.Arrays.binarySearch(this, fromIndex, toIndex, element)
////    }
////
////    /**
////     * Searches the array or the range of the array for the provided [element] using the binary search algorithm.
////     * The array is expected to be sorted, otherwise the result is undefined.
////     *
////     * If the array contains multiple elements equal to the specified [element], there is no guarantee which one will be found.
////     *
////     * @return the index of the element, if it is contained in the array within the specified range;
////     * otherwise, the inverted insertion point `(-insertion point - 1)`.
////     * The insertion point is defined as the index at which the element should be inserted,
////     * so that the array (or the specified subrange of array) still remains sorted.
////     */
////    public fun binarySearch(@NotNull short[] elements, short element, fromIndex: Int = 0, toIndex: Int = size): Int {
////        return java.util.Arrays.binarySearch(this, fromIndex, toIndex, element)
////    }
////
////    /**
////     * Searches the array or the range of the array for the provided [element] using the binary search algorithm.
////     * The array is expected to be sorted, otherwise the result is undefined.
////     *
////     * If the array contains multiple elements equal to the specified [element], there is no guarantee which one will be found.
////     *
////     * @return the index of the element, if it is contained in the array within the specified range;
////     * otherwise, the inverted insertion point `(-insertion point - 1)`.
////     * The insertion point is defined as the index at which the element should be inserted,
////     * so that the array (or the specified subrange of array) still remains sorted.
////     */
////    public fun binarySearch(@NotNull int[] elements, int element, fromIndex: Int = 0, toIndex: Int = size): Int {
////        return java.util.Arrays.binarySearch(this, fromIndex, toIndex, element)
////    }
////
////    /**
////     * Searches the array or the range of the array for the provided [element] using the binary search algorithm.
////     * The array is expected to be sorted, otherwise the result is undefined.
////     *
////     * If the array contains multiple elements equal to the specified [element], there is no guarantee which one will be found.
////     *
////     * @return the index of the element, if it is contained in the array within the specified range;
////     * otherwise, the inverted insertion point `(-insertion point - 1)`.
////     * The insertion point is defined as the index at which the element should be inserted,
////     * so that the array (or the specified subrange of array) still remains sorted.
////     */
////    public fun binarySearch(@NotNull long[] elements, long element, fromIndex: Int = 0, toIndex: Int = size): Int {
////        return java.util.Arrays.binarySearch(this, fromIndex, toIndex, element)
////    }
////
////    /**
////     * Searches the array or the range of the array for the provided [element] using the binary search algorithm.
////     * The array is expected to be sorted, otherwise the result is undefined.
////     *
////     * If the array contains multiple elements equal to the specified [element], there is no guarantee which one will be found.
////     *
////     * @return the index of the element, if it is contained in the array within the specified range;
////     * otherwise, the inverted insertion point `(-insertion point - 1)`.
////     * The insertion point is defined as the index at which the element should be inserted,
////     * so that the array (or the specified subrange of array) still remains sorted.
////     */
////    public fun binarySearch(@NotNull long[] elements, float element, fromIndex: Int = 0, toIndex: Int = size): Int {
////        return java.util.Arrays.binarySearch(this, fromIndex, toIndex, element)
////    }
////
////    /**
////     * Searches the array or the range of the array for the provided [element] using the binary search algorithm.
////     * The array is expected to be sorted, otherwise the result is undefined.
////     *
////     * If the array contains multiple elements equal to the specified [element], there is no guarantee which one will be found.
////     *
////     * @return the index of the element, if it is contained in the array within the specified range;
////     * otherwise, the inverted insertion point `(-insertion point - 1)`.
////     * The insertion point is defined as the index at which the element should be inserted,
////     * so that the array (or the specified subrange of array) still remains sorted.
////     */
////    public fun binarySearch(@NotNull double[] elements, double element, fromIndex: Int = 0, toIndex: Int = size): Int {
////        return java.util.Arrays.binarySearch(this, fromIndex, toIndex, element)
////    }
////
////    /**
////     * Searches the array or the range of the array for the provided [element] using the binary search algorithm.
////     * The array is expected to be sorted, otherwise the result is undefined.
////     *
////     * If the array contains multiple elements equal to the specified [element], there is no guarantee which one will be found.
////     *
////     * @return the index of the element, if it is contained in the array within the specified range;
////     * otherwise, the inverted insertion point `(-insertion point - 1)`.
////     * The insertion point is defined as the index at which the element should be inserted,
////     * so that the array (or the specified subrange of array) still remains sorted.
////     */
////    public fun binarySearch(@NotNull char[] elements, char element, fromIndex: Int = 0, toIndex: Int = size): Int {
////        return java.util.Arrays.binarySearch(this, fromIndex, toIndex, element)
////    }
////
////
////    /**
////     * Returns a [List] that wraps the original array.
////     */
////    public fun <T> asList(@NotNull T[] elements, ): List<T> {
////        return ArraysUtilJVM.asList(this)
////    }
////
////    /**
////     * Returns a [List] that wraps the original array.
////     */
////    public fun asList(@NotNull byte[] elements, ): List<Byte> {
////        return object : AbstractList<Byte>(), RandomAccess {
////            override val size: Int get() = this@asList.size
////            override fun isEmpty(): Boolean = this@asList.isEmpty()
////            override fun contains(byte element): Boolean = this@asList.contains(element)
////            override fun get(index: Int): Byte = this@asList[index]
////            override fun indexOf(byte element): Int = this@asList.indexOf(element)
////            override fun lastIndexOf(byte element): Int = this@asList.lastIndexOf(element)
////        }
////    }
////
////    /**
////     * Returns a [List] that wraps the original array.
////     */
////    public fun asList(@NotNull short[] elements, ): List<Short> {
////        return object : AbstractList<Short>(), RandomAccess {
////            override val size: Int get() = this@asList.size
////            override fun isEmpty(): Boolean = this@asList.isEmpty()
////            override fun contains(short element): Boolean = this@asList.contains(element)
////            override fun get(index: Int): Short = this@asList[index]
////            override fun indexOf(short element): Int = this@asList.indexOf(element)
////            override fun lastIndexOf(short element): Int = this@asList.lastIndexOf(element)
////        }
////    }
////
////    /**
////     * Returns a [List] that wraps the original array.
////     */
////    public fun asList(@NotNull int[] elements, ): List<Integer> {
////        return object : AbstractList<Integer>(), RandomAccess {
////            override val size: Int get() = this@asList.size
////            override fun isEmpty(): Boolean = this@asList.isEmpty()
////            override fun contains(int element): Boolean = this@asList.contains(element)
////            override fun get(index: Int): Int = this@asList[index]
////            override fun indexOf(int element): Int = this@asList.indexOf(element)
////            override fun lastIndexOf(int element): Int = this@asList.lastIndexOf(element)
////        }
////    }
////
////    /**
////     * Returns a [List] that wraps the original array.
////     */
////    public fun asList(@NotNull long[] elements, ): List<Long> {
////        return object : AbstractList<Long>(), RandomAccess {
////            override val size: Int get() = this@asList.size
////            override fun isEmpty(): Boolean = this@asList.isEmpty()
////            override fun contains(long element): Boolean = this@asList.contains(element)
////            override fun get(index: Int): Long = this@asList[index]
////            override fun indexOf(long element): Int = this@asList.indexOf(element)
////            override fun lastIndexOf(long element): Int = this@asList.lastIndexOf(element)
////        }
////    }
////
////    /**
////     * Returns a [List] that wraps the original array.
////     */
////    public fun asList(@NotNull long[] elements, ): List<Float> {
////        return object : AbstractList<Float>(), RandomAccess {
////            override val size: Int get() = this@asList.size
////            override fun isEmpty(): Boolean = this@asList.isEmpty()
////            override fun contains(float element): Boolean = this@asList.contains(element)
////            override fun get(index: Int): Float = this@asList[index]
////            override fun indexOf(float element): Int = this@asList.indexOf(element)
////            override fun lastIndexOf(float element): Int = this@asList.lastIndexOf(element)
////        }
////    }
////
////    /**
////     * Returns a [List] that wraps the original array.
////     */
////    public fun asList(@NotNull double[] elements, ): List<Double> {
////        return object : AbstractList<Double>(), RandomAccess {
////            override val size: Int get() = this@asList.size
////            override fun isEmpty(): Boolean = this@asList.isEmpty()
////            override fun contains(double element): Boolean = this@asList.contains(element)
////            override fun get(index: Int): Double = this@asList[index]
////            override fun indexOf(double element): Int = this@asList.indexOf(element)
////            override fun lastIndexOf(double element): Int = this@asList.lastIndexOf(element)
////        }
////    }
////
////    /**
////     * Returns a [List] that wraps the original array.
////     */
////    public fun asList(@NotNull boolean[] elements, ): List<Boolean> {
////        return object : AbstractList<Boolean>(), RandomAccess {
////            override val size: Int get() = this@asList.size
////            override fun isEmpty(): Boolean = this@asList.isEmpty()
////            override fun contains(boolean element): Boolean = this@asList.contains(element)
////            override fun get(index: Int): Boolean = this@asList[index]
////            override fun indexOf(boolean element): Int = this@asList.indexOf(element)
////            override fun lastIndexOf(boolean element): Int = this@asList.lastIndexOf(element)
////        }
////    }
////
////    /**
////     * Returns a [List] that wraps the original array.
////     */
////    public fun asList(@NotNull char[] elements, ): List<Character> {
////        return object : AbstractList<Character>(), RandomAccess {
////            override val size: Int get() = this@asList.size
////            override fun isEmpty(): Boolean = this@asList.isEmpty()
////            override fun contains(char element): Boolean = this@asList.contains(element)
////            override fun get(index: Int): Char = this@asList[index]
////            override fun indexOf(char element): Int = this@asList.indexOf(element)
////            override fun lastIndexOf(char element): Int = this@asList.lastIndexOf(element)
////        }
////    }
////
////
////
////
////
////    /**
////     * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
////     */
////    @kotlin.internal.InlineOnly
////    public inline fun <T> elementAt(@NotNull T[] elements, index: Int): T {
////        return get(index)
////    }
////
/////**
//// * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun elementAt(@NotNull byte[] elements, index: Int): Byte {
////        return get(index)
////    }
////
/////**
//// * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun elementAt(@NotNull short[] elements, index: Int): Short {
////        return get(index)
////    }
////
/////**
//// * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun elementAt(@NotNull int[] elements, index: Int): Int {
////        return get(index)
////    }
////
/////**
//// * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun elementAt(@NotNull long[] elements, index: Int): Long {
////        return get(index)
////    }
////
/////**
//// * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun elementAt(@NotNull long[] elements, index: Int): Float {
////        return get(index)
////    }
////
/////**
//// * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun elementAt(@NotNull double[] elements, index: Int): Double {
////        return get(index)
////    }
////
/////**
//// * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun elementAt(@NotNull boolean[] elements, index: Int): Boolean {
////        return get(index)
////    }
////
/////**
//// * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun elementAt(@NotNull char[] elements, index: Int): Char {
////        return get(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun <T> elementAtOrElse(@NotNull T[] elements, index: Int, defaultValue: (Int) -> T): T {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun elementAtOrElse(@NotNull byte[] elements, index: Int, defaultValue: (Int) -> Byte): Byte {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun elementAtOrElse(@NotNull short[] elements, index: Int, defaultValue: (Int) -> Short): Short {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun elementAtOrElse(@NotNull int[] elements, index: Int, defaultValue: (Int) -> Int): Int {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun elementAtOrElse(@NotNull long[] elements, index: Int, defaultValue: (Int) -> Long): Long {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun elementAtOrElse(@NotNull long[] elements, index: Int, defaultValue: (Int) -> Float): Float {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun elementAtOrElse(@NotNull double[] elements, index: Int, defaultValue: (Int) -> Double): Double {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun elementAtOrElse(@NotNull boolean[] elements, index: Int, defaultValue: (Int) -> Boolean): Boolean {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun elementAtOrElse(@NotNull char[] elements, index: Int, defaultValue: (Int) -> Char): Char {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun <T> elementAtOrNull(@NotNull T[] elements, index: Int): T? {
////        return this.getOrNull(index)
////    }
////
/////**
//// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun elementAtOrNull(@NotNull byte[] elements, index: Int): Byte? {
////        return this.getOrNull(index)
////    }
////
/////**
//// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun elementAtOrNull(@NotNull short[] elements, index: Int): Short? {
////        return this.getOrNull(index)
////    }
////
/////**
//// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun elementAtOrNull(@NotNull int[] elements, index: Int): Int? {
////        return this.getOrNull(index)
////    }
////
/////**
//// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun elementAtOrNull(@NotNull long[] elements, index: Int): Long? {
////        return this.getOrNull(index)
////    }
////
/////**
//// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun elementAtOrNull(@NotNull long[] elements, index: Int): Float? {
////        return this.getOrNull(index)
////    }
////
/////**
//// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun elementAtOrNull(@NotNull double[] elements, index: Int): Double? {
////        return this.getOrNull(index)
////    }
////
/////**
//// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun elementAtOrNull(@NotNull boolean[] elements, index: Int): Boolean? {
////        return this.getOrNull(index)
////    }
////
/////**
//// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun elementAtOrNull(@NotNull char[] elements, index: Int): Char? {
////        return this.getOrNull(index)
////    }
////
////
////
////    /**
////     * Returns the first element matching the given [predicate], or `null` if no such element was found.
////     */
////    @kotlin.internal.InlineOnly
////    public inline fun <T> find(@NotNull T[] elements, Predicate<T> predicate): T? {
////        return firstOrNull(predicate)
////    }
////
/////**
//// * Returns the first element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun find(@NotNull byte[] elements, Predicate<Byte> predicate): Byte? {
////        return firstOrNull(predicate)
////    }
////
/////**
//// * Returns the first element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun find(@NotNull short[] elements, Predicate<Short> predicate): Short? {
////        return firstOrNull(predicate)
////    }
////
/////**
//// * Returns the first element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun find(@NotNull int[] elements, Predicate<Integer> predicate): Int? {
////        return firstOrNull(predicate)
////    }
////
/////**
//// * Returns the first element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun find(@NotNull long[] elements, Predicate<Long> predicate): Long? {
////        return firstOrNull(predicate)
////    }
////
/////**
//// * Returns the first element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun find(@NotNull long[] elements, Predicate<Float> predicate): Float? {
////        return firstOrNull(predicate)
////    }
////
/////**
//// * Returns the first element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun find(@NotNull double[] elements, Predicate<Double> predicate): Double? {
////        return firstOrNull(predicate)
////    }
////
/////**
//// * Returns the first element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun find(@NotNull boolean[] elements, Predicate<Boolean> predicate): Boolean? {
////        return firstOrNull(predicate)
////    }
////
/////**
//// * Returns the first element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun find(@NotNull char[] elements, Predicate<Character> predicate): Char? {
////        return firstOrNull(predicate)
////    }
////
/////**
//// * Returns the last element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun <T> findLast(@NotNull T[] elements, Predicate<T> predicate): T? {
////        return lastOrNull(predicate)
////    }
////
/////**
//// * Returns the last element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun findLast(@NotNull byte[] elements, Predicate<Byte> predicate): Byte? {
////        return lastOrNull(predicate)
////    }
////
/////**
//// * Returns the last element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun findLast(@NotNull short[] elements, Predicate<Short> predicate): Short? {
////        return lastOrNull(predicate)
////    }
////
/////**
//// * Returns the last element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun findLast(@NotNull int[] elements, Predicate<Integer> predicate): Int? {
////        return lastOrNull(predicate)
////    }
////
/////**
//// * Returns the last element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun findLast(@NotNull long[] elements, Predicate<Long> predicate): Long? {
////        return lastOrNull(predicate)
////    }
////
/////**
//// * Returns the last element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun findLast(@NotNull long[] elements, Predicate<Float> predicate): Float? {
////        return lastOrNull(predicate)
////    }
////
/////**
//// * Returns the last element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun findLast(@NotNull double[] elements, Predicate<Double> predicate): Double? {
////        return lastOrNull(predicate)
////    }
////
/////**
//// * Returns the last element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun findLast(@NotNull boolean[] elements, Predicate<Boolean> predicate): Boolean? {
////        return lastOrNull(predicate)
////    }
////
/////**
//// * Returns the last element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun findLast(@NotNull char[] elements, Predicate<Character> predicate): Char? {
////        return lastOrNull(predicate)
////    }
////
////    /**
////     * Returns first element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public fun <T> first(@NotNull T[] elements, ): T {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[0]
////    }
////
////    /**
////     * Returns first element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public fun first(@NotNull byte[] elements, ): Byte {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[0]
////    }
////
////    /**
////     * Returns first element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public fun first(@NotNull short[] elements, ): Short {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[0]
////    }
////
////    /**
////     * Returns first element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public fun first(@NotNull int[] elements, ): Int {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[0]
////    }
////
////    /**
////     * Returns first element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public fun first(@NotNull long[] elements, ): Long {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[0]
////    }
////
////    /**
////     * Returns first element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public fun first(@NotNull long[] elements, ): Float {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[0]
////    }
////
////    /**
////     * Returns first element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public fun first(@NotNull double[] elements, ): Double {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[0]
////    }
////
////    /**
////     * Returns first element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public fun first(@NotNull boolean[] elements, ): Boolean {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[0]
////    }
////
////    /**
////     * Returns first element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public fun first(@NotNull char[] elements, ): Char {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[0]
////    }
////
////    /**
////     * Returns the first element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public inline fun <T> first(@NotNull T[] elements, Predicate<T> predicate): T {
////        for (element in this) if (predicate(element)) return element
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns the first element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public inline fun first(@NotNull byte[] elements, Predicate<Byte> predicate): Byte {
////        for (element in this) if (predicate(element)) return element
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns the first element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public inline fun first(@NotNull short[] elements, Predicate<Short> predicate): Short {
////        for (element in this) if (predicate(element)) return element
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns the first element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public inline fun first(@NotNull int[] elements, Predicate<Integer> predicate): Int {
////        for (element in this) if (predicate(element)) return element
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns the first element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public inline fun first(@NotNull long[] elements, Predicate<Long> predicate): Long {
////        for (element in this) if (predicate(element)) return element
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns the first element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public inline fun first(@NotNull long[] elements, Predicate<Float> predicate): Float {
////        for (element in this) if (predicate(element)) return element
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns the first element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public inline fun first(@NotNull double[] elements, Predicate<Double> predicate): Double {
////        for (element in this) if (predicate(element)) return element
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns the first element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public inline fun first(@NotNull boolean[] elements, Predicate<Boolean> predicate): Boolean {
////        for (element in this) if (predicate(element)) return element
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns the first element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public inline fun first(@NotNull char[] elements, Predicate<Character> predicate): Char {
////        for (element in this) if (predicate(element)) return element
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns the first element, or `null` if the array is empty.
////     */
////    public fun <T> firstOrNull(@NotNull T[] elements, ): T? {
////        return if (isEmpty()) null else this[0]
////    }
////
////    /**
////     * Returns the first element, or `null` if the array is empty.
////     */
////    public fun firstOrNull(@NotNull byte[] elements, ): Byte? {
////        return if (isEmpty()) null else this[0]
////    }
////
////    /**
////     * Returns the first element, or `null` if the array is empty.
////     */
////    public fun firstOrNull(@NotNull short[] elements, ): Short? {
////        return if (isEmpty()) null else this[0]
////    }
////
////    /**
////     * Returns the first element, or `null` if the array is empty.
////     */
////    public fun firstOrNull(@NotNull int[] elements, ): Int? {
////        return if (isEmpty()) null else this[0]
////    }
////
////    /**
////     * Returns the first element, or `null` if the array is empty.
////     */
////    public fun firstOrNull(@NotNull long[] elements, ): Long? {
////        return if (isEmpty()) null else this[0]
////    }
////
////    /**
////     * Returns the first element, or `null` if the array is empty.
////     */
////    public fun firstOrNull(@NotNull long[] elements, ): Float? {
////        return if (isEmpty()) null else this[0]
////    }
////
////    /**
////     * Returns the first element, or `null` if the array is empty.
////     */
////    public fun firstOrNull(@NotNull double[] elements, ): Double? {
////        return if (isEmpty()) null else this[0]
////    }
////
////    /**
////     * Returns the first element, or `null` if the array is empty.
////     */
////    public fun firstOrNull(@NotNull boolean[] elements, ): Boolean? {
////        return if (isEmpty()) null else this[0]
////    }
////
////    /**
////     * Returns the first element, or `null` if the array is empty.
////     */
////    public fun firstOrNull(@NotNull char[] elements, ): Char? {
////        return if (isEmpty()) null else this[0]
////    }
////
////    /**
////     * Returns the first element matching the given [predicate], or `null` if element was not found.
////     */
////    public inline fun <T> firstOrNull(@NotNull T[] elements, Predicate<T> predicate): T? {
////        for (element in this) if (predicate(element)) return element
////        return null
////    }
////
////    /**
////     * Returns the first element matching the given [predicate], or `null` if element was not found.
////     */
////    public inline fun firstOrNull(@NotNull byte[] elements, Predicate<Byte> predicate): Byte? {
////        for (element in this) if (predicate(element)) return element
////        return null
////    }
////
////    /**
////     * Returns the first element matching the given [predicate], or `null` if element was not found.
////     */
////    public inline fun firstOrNull(@NotNull short[] elements, Predicate<Short> predicate): Short? {
////        for (element in this) if (predicate(element)) return element
////        return null
////    }
////
////    /**
////     * Returns the first element matching the given [predicate], or `null` if element was not found.
////     */
////    public inline fun firstOrNull(@NotNull int[] elements, Predicate<Integer> predicate): Int? {
////        for (element in this) if (predicate(element)) return element
////        return null
////    }
////
////    /**
////     * Returns the first element matching the given [predicate], or `null` if element was not found.
////     */
////    public inline fun firstOrNull(@NotNull long[] elements, Predicate<Long> predicate): Long? {
////        for (element in this) if (predicate(element)) return element
////        return null
////    }
////
////    /**
////     * Returns the first element matching the given [predicate], or `null` if element was not found.
////     */
////    public inline fun firstOrNull(@NotNull long[] elements, Predicate<Float> predicate): Float? {
////        for (element in this) if (predicate(element)) return element
////        return null
////    }
////
////    /**
////     * Returns the first element matching the given [predicate], or `null` if element was not found.
////     */
////    public inline fun firstOrNull(@NotNull double[] elements, Predicate<Double> predicate): Double? {
////        for (element in this) if (predicate(element)) return element
////        return null
////    }
////
////    /**
////     * Returns the first element matching the given [predicate], or `null` if element was not found.
////     */
////    public inline fun firstOrNull(@NotNull boolean[] elements, Predicate<Boolean> predicate): Boolean? {
////        for (element in this) if (predicate(element)) return element
////        return null
////    }
////
////    /**
////     * Returns the first element matching the given [predicate], or `null` if element was not found.
////     */
////    public inline fun firstOrNull(@NotNull char[] elements, Predicate<Character> predicate): Char? {
////        for (element in this) if (predicate(element)) return element
////        return null
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun <T> getOrElse(@NotNull T[] elements, index: Int, defaultValue: (Int) -> T): T {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun getOrElse(@NotNull byte[] elements, index: Int, defaultValue: (Int) -> Byte): Byte {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun getOrElse(@NotNull short[] elements, index: Int, defaultValue: (Int) -> Short): Short {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun getOrElse(@NotNull int[] elements, index: Int, defaultValue: (Int) -> Int): Int {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun getOrElse(@NotNull long[] elements, index: Int, defaultValue: (Int) -> Long): Long {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun getOrElse(@NotNull long[] elements, index: Int, defaultValue: (Int) -> Float): Float {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun getOrElse(@NotNull double[] elements, index: Int, defaultValue: (Int) -> Double): Double {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun getOrElse(@NotNull boolean[] elements, index: Int, defaultValue: (Int) -> Boolean): Boolean {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun getOrElse(@NotNull char[] elements, index: Int, defaultValue: (Int) -> Char): Char {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
////    /**
////     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
////     */
////    public fun <T> getOrNull(@NotNull T[] elements, index: Int): T? {
////        return if (index >= 0 && index <= lastIndex) get(index) else null
////    }
////
////    /**
////     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
////     */
////    public fun getOrNull(@NotNull byte[] elements, index: Int): Byte? {
////        return if (index >= 0 && index <= lastIndex) get(index) else null
////    }
////
////    /**
////     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
////     */
////    public fun getOrNull(@NotNull short[] elements, index: Int): Short? {
////        return if (index >= 0 && index <= lastIndex) get(index) else null
////    }
////
////    /**
////     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
////     */
////    public fun getOrNull(@NotNull int[] elements, index: Int): Int? {
////        return if (index >= 0 && index <= lastIndex) get(index) else null
////    }
////
////    /**
////     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
////     */
////    public fun getOrNull(@NotNull long[] elements, index: Int): Long? {
////        return if (index >= 0 && index <= lastIndex) get(index) else null
////    }
////
////    /**
////     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
////     */
////    public fun getOrNull(@NotNull long[] elements, index: Int): Float? {
////        return if (index >= 0 && index <= lastIndex) get(index) else null
////    }
////
////    /**
////     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
////     */
////    public fun getOrNull(@NotNull double[] elements, index: Int): Double? {
////        return if (index >= 0 && index <= lastIndex) get(index) else null
////    }
////
////    /**
////     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
////     */
////    public fun getOrNull(@NotNull boolean[] elements, index: Int): Boolean? {
////        return if (index >= 0 && index <= lastIndex) get(index) else null
////    }
////
////    /**
////     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
////     */
////    public fun getOrNull(@NotNull char[] elements, index: Int): Char? {
////        return if (index >= 0 && index <= lastIndex) get(index) else null
////    }
////    /**
////     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
////     */
////    public static <T> withIndex(@NotNull T[] elements, ): Iterable<IndexedValue<T>> {
////        return IndexingIterable { iterator() }
////    }
////
////    /**
////     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
////     */
////    public static withIndex(byte[] elements): Iterable<IndexedValue<Byte>> {
////        return IndexingIterable { iterator() }
////    }
////
////    /**
////     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
////     */
////    public static withIndex(short[] elements): Iterable<IndexedValue<Short>> {
////        return IndexingIterable { iterator() }
////    }
////
////    /**
////     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
////     */
////    public static withIndex(int[] elements): Iterable<IndexedValue<Integer>> {
////        return IndexingIterable { iterator() }
////    }
////
////    /**
////     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
////     */
////    public static withIndex(long[] elements): Iterable<IndexedValue<Long>> {
////        return IndexingIterable { iterator() }
////    }
////
////    /**
////     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
////     */
////    public static withIndex(float[] elements): Iterable<IndexedValue<Float>> {
////        return IndexingIterable { iterator() }
////    }
////
////    /**
////     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
////     */
////    public static withIndex(double[] elements): Iterable<IndexedValue<Double>> {
////        return IndexingIterable { iterator() }
////    }
////
////    /**
////     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
////     */
////    public funwithIndex(boolean[] elements): Iterable<IndexedValue<Boolean>> {
////        return IndexingIterable { iterator() }
////    }
////
////    /**
////     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
////     */
////    public static withIndex(char[] elements): Iterable<IndexedValue<Character>> {
////        return IndexingIterable { iterator() }
////    }
////
////    /**
////     * Returns a list containing only distinct elements from the given array.
////     *
////     * The elements in the resulting list are in the same order as they were in the source array.
////     */
////    public static <T> distinct(@NotNull T[] elements, ): List<T> {
////        return this.toMutableSet().toList()
////    }
////
////    /**
////     * Returns a list containing only distinct elements from the given array.
////     *
////     * The elements in the resulting list are in the same order as they were in the source array.
////     */
////    public static distinct(byte[] elements): List<Byte> {
////        return this.toMutableSet().toList()
////    }
////
////    /**
////     * Returns a list containing only distinct elements from the given array.
////     *
////     * The elements in the resulting list are in the same order as they were in the source array.
////     */
////    public static distinct(short[] elements): List<Short> {
////        return this.toMutableSet().toList()
////    }
////
////    /**
////     * Returns a list containing only distinct elements from the given array.
////     *
////     * The elements in the resulting list are in the same order as they were in the source array.
////     */
////    public static distinct(int[] elements): List<Integer> {
////        return this.toMutableSet().toList()
////    }
////
////    /**
////     * Returns a list containing only distinct elements from the given array.
////     *
////     * The elements in the resulting list are in the same order as they were in the source array.
////     */
////    public static distinct(long[] elements): List<Long> {
////        return this.toMutableSet().toList()
////    }
////
////    /**
////     * Returns a list containing only distinct elements from the given array.
////     *
////     * The elements in the resulting list are in the same order as they were in the source array.
////     */
////    public static distinct(float[] elements): List<Float> {
////        return this.toMutableSet().toList()
////    }
////
////    /**
////     * Returns a list containing only distinct elements from the given array.
////     *
////     * The elements in the resulting list are in the same order as they were in the source array.
////     */
////    public static distinct(double[] elements): List<Double> {
////        return this.toMutableSet().toList()
////    }
////
////    /**
////     * Returns a list containing only distinct elements from the given array.
////     *
////     * The elements in the resulting list are in the same order as they were in the source array.
////     */
////    public fundistinct(boolean[] elements): List<Boolean> {
////        return this.toMutableSet().toList()
////    }
////
////    /**
////     * Returns a list containing only distinct elements from the given array.
////     *
////     * The elements in the resulting list are in the same order as they were in the source array.
////     */
////    public static distinct(char[] elements): List<Character> {
////        return this.toMutableSet().toList()
////    }
////
////    /**
////     * Returns a list containing only elements from the given array
////     * having distinct keys returned by the given [selector] function.
////     *
////     * The elements in the resulting list are in the same order as they were in the source array.
////     */
////    public static <T, K> distinctBy(@NotNull T[] elements, selector: (T) -> K): List<T> {
////        val set = HashSet<K>()
////        val list = ArrayList<T>()
////        for (e in this) {
////            val key = selector(e)
////            if (set.add(key))
////                list.add(e)
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing only elements from the given array
////     * having distinct keys returned by the given [selector] function.
////     *
////     * The elements in the resulting list are in the same order as they were in the source array.
////     */
////    public static <K> distinctBy(byte[] elements, selector: (Byte) -> K): List<Byte> {
////        val set = HashSet<K>()
////        val list = ArrayList<Byte>()
////        for (e in this) {
////            val key = selector(e)
////            if (set.add(key))
////                list.add(e)
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing only elements from the given array
////     * having distinct keys returned by the given [selector] function.
////     *
////     * The elements in the resulting list are in the same order as they were in the source array.
////     */
////    public static <K> distinctBy(short[] elements, selector: (Short) -> K): List<Short> {
////        val set = HashSet<K>()
////        val list = ArrayList<Short>()
////        for (e in this) {
////            val key = selector(e)
////            if (set.add(key))
////                list.add(e)
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing only elements from the given array
////     * having distinct keys returned by the given [selector] function.
////     *
////     * The elements in the resulting list are in the same order as they were in the source array.
////     */
////    public static <K> distinctBy(int[] elements, selector: (Int) -> K): List<Integer> {
////        val set = HashSet<K>()
////        val list = ArrayList<Integer>()
////        for (e in this) {
////            val key = selector(e)
////            if (set.add(key))
////                list.add(e)
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing only elements from the given array
////     * having distinct keys returned by the given [selector] function.
////     *
////     * The elements in the resulting list are in the same order as they were in the source array.
////     */
////    public static <K> distinctBy(long[] elements, selector: (Long) -> K): List<Long> {
////        val set = HashSet<K>()
////        val list = ArrayList<Long>()
////        for (e in this) {
////            val key = selector(e)
////            if (set.add(key))
////                list.add(e)
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing only elements from the given array
////     * having distinct keys returned by the given [selector] function.
////     *
////     * The elements in the resulting list are in the same order as they were in the source array.
////     */
////    public static <K> distinctBy(float[] elements, selector: (Float) -> K): List<Float> {
////        val set = HashSet<K>()
////        val list = ArrayList<Float>()
////        for (e in this) {
////            val key = selector(e)
////            if (set.add(key))
////                list.add(e)
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing only elements from the given array
////     * having distinct keys returned by the given [selector] function.
////     *
////     * The elements in the resulting list are in the same order as they were in the source array.
////     */
////    public static <K> distinctBy(double[] elements, selector: (Double) -> K): List<Double> {
////        val set = HashSet<K>()
////        val list = ArrayList<Double>()
////        for (e in this) {
////            val key = selector(e)
////            if (set.add(key))
////                list.add(e)
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing only elements from the given array
////     * having distinct keys returned by the given [selector] function.
////     *
////     * The elements in the resulting list are in the same order as they were in the source array.
////     */
////    public static <K>distinctBy(boolean[] elements, selector: (Boolean) -> K): List<Boolean> {
////        val set = HashSet<K>()
////        val list = ArrayList<Boolean>()
////        for (e in this) {
////            val key = selector(e)
////            if (set.add(key))
////                list.add(e)
////        }
////        return list
////    }
////
////    /**
////     * Returns a list containing only elements from the given array
////     * having distinct keys returned by the given [selector] function.
////     *
////     * The elements in the resulting list are in the same order as they were in the source array.
////     */
////    public static <K> distinctBy(char[] elements, selector: (Character) -> K): List<Character> {
////        val set = HashSet<K>()
////        val list = ArrayList<Character>()
////        for (e in this) {
////            val key = selector(e)
////            if (set.add(key))
////                list.add(e)
////        }
////        return list
////    }
////
////    /**
////     * Returns a set containing all elements that are contained by both this set and the specified collection.
////     *
////     * The returned set preserves the element iteration order of the original array.
////     */
////    public infix static <T> intersect(@NotNull T[] elements, other: Iterable<T>): Set<T> {
////        val set = this.toMutableSet()
////        set.retainAll(other)
////        return set
////    }
////
////    /**
////     * Returns a set containing all elements that are contained by both this set and the specified collection.
////     *
////     * The returned set preserves the element iteration order of the original array.
////     */
////    public infix static intersect(byte[] elements, other: Iterable<Byte>): Set<Byte> {
////        val set = this.toMutableSet()
////        set.retainAll(other)
////        return set
////    }
////
////    /**
////     * Returns a set containing all elements that are contained by both this set and the specified collection.
////     *
////     * The returned set preserves the element iteration order of the original array.
////     */
////    public infix static intersect(short[] elements, other: Iterable<Short>): Set<Short> {
////        val set = this.toMutableSet()
////        set.retainAll(other)
////        return set
////    }
////
////    /**
////     * Returns a set containing all elements that are contained by both this set and the specified collection.
////     *
////     * The returned set preserves the element iteration order of the original array.
////     */
////    public infix static intersect(int[] elements, other: Iterable<Integer>): Set<Integer> {
////        val set = this.toMutableSet()
////        set.retainAll(other)
////        return set
////    }
////
////    /**
////     * Returns a set containing all elements that are contained by both this set and the specified collection.
////     *
////     * The returned set preserves the element iteration order of the original array.
////     */
////    public infix static intersect(long[] elements, other: Iterable<Long>): Set<Long> {
////        val set = this.toMutableSet()
////        set.retainAll(other)
////        return set
////    }
////
////    /**
////     * Returns a set containing all elements that are contained by both this set and the specified collection.
////     *
////     * The returned set preserves the element iteration order of the original array.
////     */
////    public infix static intersect(float[] elements, other: Iterable<Float>): Set<Float> {
////        val set = this.toMutableSet()
////        set.retainAll(other)
////        return set
////    }
////
////    /**
////     * Returns a set containing all elements that are contained by both this set and the specified collection.
////     *
////     * The returned set preserves the element iteration order of the original array.
////     */
////    public infix static intersect(double[] elements, other: Iterable<Double>): Set<Double> {
////        val set = this.toMutableSet()
////        set.retainAll(other)
////        return set
////    }
////
////    /**
////     * Returns a set containing all elements that are contained by both this set and the specified collection.
////     *
////     * The returned set preserves the element iteration order of the original array.
////     */
////    public infix static intersect(boolean[] elements, other: Iterable<Boolean>): Set<Boolean> {
////        val set = this.toMutableSet()
////        set.retainAll(other)
////        return set
////    }
////
////    /**
////     * Returns a set containing all elements that are contained by both this set and the specified collection.
////     *
////     * The returned set preserves the element iteration order of the original array.
////     */
////    public infix static intersect(char[] elements, other: Iterable<Character>): Set<Character> {
////        val set = this.toMutableSet()
////        set.retainAll(other)
////        return set
////    }
////
////    /**
////     * Returns a set containing all elements that are contained by this array and not contained by the specified collection.
////     *
////     * The returned set preserves the element iteration order of the original array.
////     */
////    public infix static <T> subtract(@NotNull T[] elements, other: Iterable<T>): Set<T> {
////        val set = this.toMutableSet()
////        set.removeAll(other)
////        return set
////    }
////
////    /**
////     * Returns a set containing all elements that are contained by this array and not contained by the specified collection.
////     *
////     * The returned set preserves the element iteration order of the original array.
////     */
////    public infix static subtract(byte[] elements, other: Iterable<Byte>): Set<Byte> {
////        val set = this.toMutableSet()
////        set.removeAll(other)
////        return set
////    }
////
////    /**
////     * Returns a set containing all elements that are contained by this array and not contained by the specified collection.
////     *
////     * The returned set preserves the element iteration order of the original array.
////     */
////    public infix static subtract(short[] elements, other: Iterable<Short>): Set<Short> {
////        val set = this.toMutableSet()
////        set.removeAll(other)
////        return set
////    }
////
////    /**
////     * Returns a set containing all elements that are contained by this array and not contained by the specified collection.
////     *
////     * The returned set preserves the element iteration order of the original array.
////     */
////    public infix static subtract(int[] elements, other: Iterable<Integer>): Set<Integer> {
////        val set = this.toMutableSet()
////        set.removeAll(other)
////        return set
////    }
////
////    /**
////     * Returns a set containing all elements that are contained by this array and not contained by the specified collection.
////     *
////     * The returned set preserves the element iteration order of the original array.
////     */
////    public infix static subtract(long[] elements, other: Iterable<Long>): Set<Long> {
////        val set = this.toMutableSet()
////        set.removeAll(other)
////        return set
////    }
////
////    /**
////     * Returns a set containing all elements that are contained by this array and not contained by the specified collection.
////     *
////     * The returned set preserves the element iteration order of the original array.
////     */
////    public infix static subtract(float[] elements, other: Iterable<Float>): Set<Float> {
////        val set = this.toMutableSet()
////        set.removeAll(other)
////        return set
////    }
////
////    /**
////     * Returns a set containing all elements that are contained by this array and not contained by the specified collection.
////     *
////     * The returned set preserves the element iteration order of the original array.
////     */
////    public infix static subtract(double[] elements, other: Iterable<Double>): Set<Double> {
////        val set = this.toMutableSet()
////        set.removeAll(other)
////        return set
////    }
////
////    /**
////     * Returns a set containing all elements that are contained by this array and not contained by the specified collection.
////     *
////     * The returned set preserves the element iteration order of the original array.
////     */
////    public infix static subtract(boolean[] elements, other: Iterable<Boolean>): Set<Boolean> {
////        val set = this.toMutableSet()
////        set.removeAll(other)
////        return set
////    }
////
////    /**
////     * Returns a set containing all elements that are contained by this array and not contained by the specified collection.
////     *
////     * The returned set preserves the element iteration order of the original array.
////     */
////    public infix static subtract(char[] elements, other: Iterable<Character>): Set<Character> {
////        val set = this.toMutableSet()
////        set.removeAll(other)
////        return set
////    }
////
////
//
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
////     */
////    public static <T, R> fold(@NotNull T[] elements, initial: R, operation: (acc: R, T) -> R): R {
////        var accumulator = initial
////        for (element in this) accumulator = operation(accumulator, element)
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
////     */
////    public static <R> fold(byte[] elements, initial: R, operation: (acc: R, Byte) -> R): R {
////        var accumulator = initial
////        for (element in this) accumulator = operation(accumulator, element)
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
////     */
////    public static <R> fold(short[] elements, initial: R, operation: (acc: R, Short) -> R): R {
////        var accumulator = initial
////        for (element in this) accumulator = operation(accumulator, element)
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
////     */
////    public static <R> fold(int[] elements, initial: R, operation: (acc: R, Int) -> R): R {
////        var accumulator = initial
////        for (element in this) accumulator = operation(accumulator, element)
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
////     */
////    public static <R> fold(long[] elements, initial: R, operation: (acc: R, Long) -> R): R {
////        var accumulator = initial
////        for (element in this) accumulator = operation(accumulator, element)
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
////     */
////    public static <R> fold(float[] elements, initial: R, operation: (acc: R, Float) -> R): R {
////        var accumulator = initial
////        for (element in this) accumulator = operation(accumulator, element)
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
////     */
////    public static <R> fold(double[] elements, initial: R, operation: (acc: R, Double) -> R): R {
////        var accumulator = initial
////        for (element in this) accumulator = operation(accumulator, element)
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
////     */
////    public static <R> fold(boolean[] elements, initial: R, operation: (acc: R, Boolean) -> R): R {
////        var accumulator = initial
////        for (element in this) accumulator = operation(accumulator, element)
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
////     */
////    public static <R> fold(char[] elements, initial: R, operation: (acc: R, Character) -> R): R {
////        var accumulator = initial
////        for (element in this) accumulator = operation(accumulator, element)
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from left to right
////     * to current accumulator value and each element with its index in the original array.
////     * @param [operation] function that takes the index of an element, current accumulator value
////     * and the element itself, and calculates the next accumulator value.
////     */
////    public static <T, R> foldIndexed(@NotNull T[] elements, initial: R, operation: (index: Int, acc: R, T) -> R): R {
////        var index = 0
////        var accumulator = initial
////        for (element in this) accumulator = operation(index++, accumulator, element)
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from left to right
////     * to current accumulator value and each element with its index in the original array.
////     * @param [operation] function that takes the index of an element, current accumulator value
////     * and the element itself, and calculates the next accumulator value.
////     */
////    public static <R> foldIndexed(byte[] elements, initial: R, operation: (index: Int, acc: R, Byte) -> R): R {
////        var index = 0
////        var accumulator = initial
////        for (element in this) accumulator = operation(index++, accumulator, element)
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from left to right
////     * to current accumulator value and each element with its index in the original array.
////     * @param [operation] function that takes the index of an element, current accumulator value
////     * and the element itself, and calculates the next accumulator value.
////     */
////    public static <R> foldIndexed(short[] elements, initial: R, operation: (index: Int, acc: R, Short) -> R): R {
////        var index = 0
////        var accumulator = initial
////        for (element in this) accumulator = operation(index++, accumulator, element)
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from left to right
////     * to current accumulator value and each element with its index in the original array.
////     * @param [operation] function that takes the index of an element, current accumulator value
////     * and the element itself, and calculates the next accumulator value.
////     */
////    public static <R> foldIndexed(int[] elements, initial: R, operation: (index: Int, acc: R, Int) -> R): R {
////        var index = 0
////        var accumulator = initial
////        for (element in this) accumulator = operation(index++, accumulator, element)
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from left to right
////     * to current accumulator value and each element with its index in the original array.
////     * @param [operation] function that takes the index of an element, current accumulator value
////     * and the element itself, and calculates the next accumulator value.
////     */
////    public static <R> foldIndexed(long[] elements, initial: R, operation: (index: Int, acc: R, Long) -> R): R {
////        var index = 0
////        var accumulator = initial
////        for (element in this) accumulator = operation(index++, accumulator, element)
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from left to right
////     * to current accumulator value and each element with its index in the original array.
////     * @param [operation] function that takes the index of an element, current accumulator value
////     * and the element itself, and calculates the next accumulator value.
////     */
////    public static <R> foldIndexed(float[] elements, initial: R, operation: (index: Int, acc: R, Float) -> R): R {
////        var index = 0
////        var accumulator = initial
////        for (element in this) accumulator = operation(index++, accumulator, element)
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from left to right
////     * to current accumulator value and each element with its index in the original array.
////     * @param [operation] function that takes the index of an element, current accumulator value
////     * and the element itself, and calculates the next accumulator value.
////     */
////    public static <R> foldIndexed(double[] elements, initial: R, operation: (index: Int, acc: R, Double) -> R): R {
////        var index = 0
////        var accumulator = initial
////        for (element in this) accumulator = operation(index++, accumulator, element)
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from left to right
////     * to current accumulator value and each element with its index in the original array.
////     * @param [operation] function that takes the index of an element, current accumulator value
////     * and the element itself, and calculates the next accumulator value.
////     */
////    public static <R> foldIndexed(boolean[] elements, initial: R, operation: (index: Int, acc: R, Boolean) -> R): R {
////        var index = 0
////        var accumulator = initial
////        for (element in this) accumulator = operation(index++, accumulator, element)
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from left to right
////     * to current accumulator value and each element with its index in the original array.
////     * @param [operation] function that takes the index of an element, current accumulator value
////     * and the element itself, and calculates the next accumulator value.
////     */
////    public static <R> foldIndexed(char[] elements, initial: R, operation: (index: Int, acc: R, Character) -> R): R {
////        var index = 0
////        var accumulator = initial
////        for (element in this) accumulator = operation(index++, accumulator, element)
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from right to left to each element and current accumulator value.
////     */
////    public static <T, R> foldRight(@NotNull T[] elements, initial: R, operation: (T, acc: R) -> R): R {
////        var index = lastIndex
////        var accumulator = initial
////        while (index >= 0) {
////            accumulator = operation(get(index--), accumulator)
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from right to left to each element and current accumulator value.
////     */
////    public static <R> foldRight(byte[] elements, initial: R, operation: (Byte, acc: R) -> R): R {
////        var index = lastIndex
////        var accumulator = initial
////        while (index >= 0) {
////            accumulator = operation(get(index--), accumulator)
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from right to left to each element and current accumulator value.
////     */
////    public static <R> foldRight(short[] elements, initial: R, operation: (Short, acc: R) -> R): R {
////        var index = lastIndex
////        var accumulator = initial
////        while (index >= 0) {
////            accumulator = operation(get(index--), accumulator)
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from right to left to each element and current accumulator value.
////     */
////    public static <R> foldRight(int[] elements, initial: R, operation: (Int, acc: R) -> R): R {
////        var index = lastIndex
////        var accumulator = initial
////        while (index >= 0) {
////            accumulator = operation(get(index--), accumulator)
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from right to left to each element and current accumulator value.
////     */
////    public static <R> foldRight(long[] elements, initial: R, operation: (Long, acc: R) -> R): R {
////        var index = lastIndex
////        var accumulator = initial
////        while (index >= 0) {
////            accumulator = operation(get(index--), accumulator)
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from right to left to each element and current accumulator value.
////     */
////    public static <R> foldRight(float[] elements, initial: R, operation: (Float, acc: R) -> R): R {
////        var index = lastIndex
////        var accumulator = initial
////        while (index >= 0) {
////            accumulator = operation(get(index--), accumulator)
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from right to left to each element and current accumulator value.
////     */
////    public static <R> foldRight(double[] elements, initial: R, operation: (Double, acc: R) -> R): R {
////        var index = lastIndex
////        var accumulator = initial
////        while (index >= 0) {
////            accumulator = operation(get(index--), accumulator)
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from right to left to each element and current accumulator value.
////     */
////    public static <R> foldRight(boolean[] elements, initial: R, operation: (Boolean, acc: R) -> R): R {
////        var index = lastIndex
////        var accumulator = initial
////        while (index >= 0) {
////            accumulator = operation(get(index--), accumulator)
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from right to left to each element and current accumulator value.
////     */
////    public static <R> foldRight(char[] elements, initial: R, operation: (Character, acc: R) -> R): R {
////        var index = lastIndex
////        var accumulator = initial
////        while (index >= 0) {
////            accumulator = operation(get(index--), accumulator)
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from right to left
////     * to each element with its index in the original array and current accumulator value.
////     * @param [operation] function that takes the index of an element, the element itself
////     * and current accumulator value, and calculates the next accumulator value.
////     */
////    public static <T, R> foldRightIndexed(@NotNull T[] elements, initial: R, operation: (index: Int, T, acc: R) -> R): R {
////        var index = lastIndex
////        var accumulator = initial
////        while (index >= 0) {
////            accumulator = operation(index, get(index), accumulator)
////                    --index
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from right to left
////     * to each element with its index in the original array and current accumulator value.
////     * @param [operation] function that takes the index of an element, the element itself
////     * and current accumulator value, and calculates the next accumulator value.
////     */
////    public static <R> foldRightIndexed(byte[] elements, initial: R, operation: (index: Int, Byte, acc: R) -> R): R {
////        var index = lastIndex
////        var accumulator = initial
////        while (index >= 0) {
////            accumulator = operation(index, get(index), accumulator)
////                    --index
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from right to left
////     * to each element with its index in the original array and current accumulator value.
////     * @param [operation] function that takes the index of an element, the element itself
////     * and current accumulator value, and calculates the next accumulator value.
////     */
////    public static <R> foldRightIndexed(short[] elements, initial: R, operation: (index: Int, Short, acc: R) -> R): R {
////        var index = lastIndex
////        var accumulator = initial
////        while (index >= 0) {
////            accumulator = operation(index, get(index), accumulator)
////                    --index
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from right to left
////     * to each element with its index in the original array and current accumulator value.
////     * @param [operation] function that takes the index of an element, the element itself
////     * and current accumulator value, and calculates the next accumulator value.
////     */
////    public static <R> foldRightIndexed(int[] elements, initial: R, operation: (index: Int, Int, acc: R) -> R): R {
////        var index = lastIndex
////        var accumulator = initial
////        while (index >= 0) {
////            accumulator = operation(index, get(index), accumulator)
////                    --index
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from right to left
////     * to each element with its index in the original array and current accumulator value.
////     * @param [operation] function that takes the index of an element, the element itself
////     * and current accumulator value, and calculates the next accumulator value.
////     */
////    public static <R> foldRightIndexed(long[] elements, initial: R, operation: (index: Int, Long, acc: R) -> R): R {
////        var index = lastIndex
////        var accumulator = initial
////        while (index >= 0) {
////            accumulator = operation(index, get(index), accumulator)
////                    --index
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from right to left
////     * to each element with its index in the original array and current accumulator value.
////     * @param [operation] function that takes the index of an element, the element itself
////     * and current accumulator value, and calculates the next accumulator value.
////     */
////    public static <R> foldRightIndexed(float[] elements, initial: R, operation: (index: Int, Float, acc: R) -> R): R {
////        var index = lastIndex
////        var accumulator = initial
////        while (index >= 0) {
////            accumulator = operation(index, get(index), accumulator)
////                    --index
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from right to left
////     * to each element with its index in the original array and current accumulator value.
////     * @param [operation] function that takes the index of an element, the element itself
////     * and current accumulator value, and calculates the next accumulator value.
////     */
////    public static <R> foldRightIndexed(double[] elements, initial: R, operation: (index: Int, Double, acc: R) -> R): R {
////        var index = lastIndex
////        var accumulator = initial
////        while (index >= 0) {
////            accumulator = operation(index, get(index), accumulator)
////                    --index
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from right to left
////     * to each element with its index in the original array and current accumulator value.
////     * @param [operation] function that takes the index of an element, the element itself
////     * and current accumulator value, and calculates the next accumulator value.
////     */
////    public static <R> foldRightIndexed(boolean[] elements, initial: R, operation: (index: Int, Boolean, acc: R) -> R): R {
////        var index = lastIndex
////        var accumulator = initial
////        while (index >= 0) {
////            accumulator = operation(index, get(index), accumulator)
////                    --index
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with [initial] value and applying [operation] from right to left
////     * to each element with its index in the original array and current accumulator value.
////     * @param [operation] function that takes the index of an element, the element itself
////     * and current accumulator value, and calculates the next accumulator value.
////     */
////    public static <R> foldRightIndexed(char[] elements, initial: R, operation: (index: Int, Character, acc: R) -> R): R {
////        var index = lastIndex
////        var accumulator = initial
////        while (index >= 0) {
////            accumulator = operation(index, get(index), accumulator)
////                    --index
////        }
////        return accumulator
////    }
////
////
////    /**
////     * Returns `true` if the array has no elements.
////     */
////    public static <T> none(@NotNull T[] elements, ): Boolean {
////        return isEmpty()
////    }
////
////    /**
////     * Returns `true` if the array has no elements.
////     */
////    public static none(byte[] elements): Boolean {
////        return isEmpty()
////    }
////
////    /**
////     * Returns `true` if the array has no elements.
////     */
////    public static none(short[] elements): Boolean {
////        return isEmpty()
////    }
////
////    /**
////     * Returns `true` if the array has no elements.
////     */
////    public static none(int[] elements): Boolean {
////        return isEmpty()
////    }
////
////    /**
////     * Returns `true` if the array has no elements.
////     */
////    public static none(long[] elements): Boolean {
////        return isEmpty()
////    }
////
////    /**
////     * Returns `true` if the array has no elements.
////     */
////    public static none(float[] elements): Boolean {
////        return isEmpty()
////    }
////
////    /**
////     * Returns `true` if the array has no elements.
////     */
////    public static none(double[] elements): Boolean {
////        return isEmpty()
////    }
////
////    /**
////     * Returns `true` if the array has no elements.
////     */
////    public static none(boolean[] elements): Boolean {
////        return isEmpty()
////    }
////
////    /**
////     * Returns `true` if the array has no elements.
////     */
////    public static none(char[] elements): Boolean {
////        return isEmpty()
////    }
////
////    /**
////     * Returns `true` if no elements match the given [predicate].
////     */
////    public static <T> none(@NotNull T[] elements, Predicate<T> predicate): Boolean {
////        for (element in this) if (predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if no elements match the given [predicate].
////     */
////    public static none(byte[] elements, Predicate<Byte> predicate): Boolean {
////        for (element in this) if (predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if no elements match the given [predicate].
////     */
////    public static none(short[] elements, Predicate<Short> predicate): Boolean {
////        for (element in this) if (predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if no elements match the given [predicate].
////     */
////    public static none(int[] elements, Predicate<Integer> predicate): Boolean {
////        for (element in this) if (predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if no elements match the given [predicate].
////     */
////    public static none(long[] elements, Predicate<Long> predicate): Boolean {
////        for (element in this) if (predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if no elements match the given [predicate].
////     */
////    public static none(float[] elements, Predicate<Float> predicate): Boolean {
////        for (element in this) if (predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if no elements match the given [predicate].
////     */
////    public static none(double[] elements, Predicate<Double> predicate): Boolean {
////        for (element in this) if (predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if no elements match the given [predicate].
////     */
////    public static none(boolean[] elements, Predicate<Boolean> predicate): Boolean {
////        for (element in this) if (predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if no elements match the given [predicate].
////     */
////    public static none(char[] elements, Predicate<Character> predicate): Boolean {
////        for (element in this) if (predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Accumulates value starting with the first element and applying [operation] from left to right to current accumulator value and each element.
////     */
////    public static <S, T: S> reduce(@NotNull T[] elements, operation: (acc: S, T) -> S): S {
////        if (isEmpty())
////            throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator: S = elements[0];
////        for (index in 1..lastIndex) {
////            accumulator = operation(accumulator, this[index])
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with the first element and applying [operation] from left to right to current accumulator value and each element.
////     */
////    public static reduce(byte[] elements, operation: (acc: Byte, Byte) -> Byte): Byte {
////        if (isEmpty())
////            throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = elements[0];
////        for (index in 1..lastIndex) {
////            accumulator = operation(accumulator, this[index])
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with the first element and applying [operation] from left to right to current accumulator value and each element.
////     */
////    public static reduce(short[] elements, operation: (acc: Short, Short) -> Short): Short {
////        if (isEmpty())
////            throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = elements[0];
////        for (index in 1..lastIndex) {
////            accumulator = operation(accumulator, this[index])
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with the first element and applying [operation] from left to right to current accumulator value and each element.
////     */
////    public static reduce(int[] elements, operation: (acc: Integer, Integer) -> Integer): Integer {
////        if (isEmpty())
////            throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = elements[0];
////        for (index in 1..lastIndex) {
////            accumulator = operation(accumulator, this[index])
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with the first element and applying [operation] from left to right to current accumulator value and each element.
////     */
////    public static reduce(long[] elements, operation: (acc: Long, Long) -> Long): Long {
////        if (isEmpty())
////            throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = elements[0];
////        for (index in 1..lastIndex) {
////            accumulator = operation(accumulator, this[index])
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with the first element and applying [operation] from left to right to current accumulator value and each element.
////     */
////    public static reduce(float[] elements, operation: (acc: Float, Float) -> Float): Float {
////        if (isEmpty())
////            throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = elements[0];
////        for (index in 1..lastIndex) {
////            accumulator = operation(accumulator, this[index])
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with the first element and applying [operation] from left to right to current accumulator value and each element.
////     */
////    public static reduce(double[] elements, operation: (acc: Double, Double) -> Double): Double {
////        if (isEmpty())
////            throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = elements[0];
////        for (index in 1..lastIndex) {
////            accumulator = operation(accumulator, this[index])
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with the first element and applying [operation] from left to right to current accumulator value and each element.
////     */
////    public static reduce(boolean[] elements, operation: (acc: Boolean, Boolean) -> Boolean): Boolean {
////        if (isEmpty())
////            throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = elements[0];
////        for (index in 1..lastIndex) {
////            accumulator = operation(accumulator, this[index])
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with the first element and applying [operation] from left to right to current accumulator value and each element.
////     */
////    public static reduce(char[] elements, operation: (acc: Character, Character) -> Character): Character {
////        if (isEmpty())
////            throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = elements[0];
////        for (index in 1..lastIndex) {
////            accumulator = operation(accumulator, this[index])
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with the first element and applying [operation] from left to right
////     * to current accumulator value and each element with its index in the original array.
////     * @param [operation] function that takes the index of an element, current accumulator value
////     * and the element itself and calculates the next accumulator value.
////     */
////    public static <S, T: S> reduceIndexed(@NotNull T[] elements, operation: (index: Integer, acc: S, T) -> S): S {
////        if (isEmpty())
////            throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator: S = elements[0];
////        for (index in 1..lastIndex) {
////            accumulator = operation(index, accumulator, this[index])
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with the first element and applying [operation] from left to right
////     * to current accumulator value and each element with its index in the original array.
////     * @param [operation] function that takes the index of an element, current accumulator value
////     * and the element itself and calculates the next accumulator value.
////     */
////    public static reduceIndexed(byte[] elements, operation: (index: Integer, acc: Byte, Byte) -> Byte): Byte {
////        if (isEmpty())
////            throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = elements[0];
////        for (index in 1..lastIndex) {
////            accumulator = operation(index, accumulator, this[index])
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with the first element and applying [operation] from left to right
////     * to current accumulator value and each element with its index in the original array.
////     * @param [operation] function that takes the index of an element, current accumulator value
////     * and the element itself and calculates the next accumulator value.
////     */
////    public static reduceIndexed(short[] elements, operation: (index: Integer, acc: Short, Short) -> Short): Short {
////        if (isEmpty())
////            throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = elements[0];
////        for (index in 1..lastIndex) {
////            accumulator = operation(index, accumulator, this[index])
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with the first element and applying [operation] from left to right
////     * to current accumulator value and each element with its index in the original array.
////     * @param [operation] function that takes the index of an element, current accumulator value
////     * and the element itself and calculates the next accumulator value.
////     */
////    public static reduceIndexed(int[] elements, operation: (index: Integer, acc: Integer, Integer) -> Integer): Integer {
////        if (isEmpty())
////            throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = elements[0];
////        for (index in 1..lastIndex) {
////            accumulator = operation(index, accumulator, this[index])
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with the first element and applying [operation] from left to right
////     * to current accumulator value and each element with its index in the original array.
////     * @param [operation] function that takes the index of an element, current accumulator value
////     * and the element itself and calculates the next accumulator value.
////     */
////    public static reduceIndexed(long[] elements, operation: (index: Integer, acc: Long, Long) -> Long): Long {
////        if (isEmpty())
////            throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = elements[0];
////        for (index in 1..lastIndex) {
////            accumulator = operation(index, accumulator, this[index])
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with the first element and applying [operation] from left to right
////     * to current accumulator value and each element with its index in the original array.
////     * @param [operation] function that takes the index of an element, current accumulator value
////     * and the element itself and calculates the next accumulator value.
////     */
////    public static reduceIndexed(float[] elements, operation: (index: Integer, acc: Float, Float) -> Float): Float {
////        if (isEmpty())
////            throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = elements[0];
////        for (index in 1..lastIndex) {
////            accumulator = operation(index, accumulator, this[index])
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with the first element and applying [operation] from left to right
////     * to current accumulator value and each element with its index in the original array.
////     * @param [operation] function that takes the index of an element, current accumulator value
////     * and the element itself and calculates the next accumulator value.
////     */
////    public static reduceIndexed(double[] elements, operation: (index: Integer, acc: Double, Double) -> Double): Double {
////        if (isEmpty())
////            throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = elements[0];
////        for (index in 1..lastIndex) {
////            accumulator = operation(index, accumulator, this[index])
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with the first element and applying [operation] from left to right
////     * to current accumulator value and each element with its index in the original array.
////     * @param [operation] function that takes the index of an element, current accumulator value
////     * and the element itself and calculates the next accumulator value.
////     */
////    public static reduceIndexed(boolean[] elements, operation: (index: Integer, acc: Boolean, Boolean) -> Boolean): Boolean {
////        if (isEmpty())
////            throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = elements[0];
////        for (index in 1..lastIndex) {
////            accumulator = operation(index, accumulator, this[index])
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with the first element and applying [operation] from left to right
////     * to current accumulator value and each element with its index in the original array.
////     * @param [operation] function that takes the index of an element, current accumulator value
////     * and the element itself and calculates the next accumulator value.
////     */
////    public static reduceIndexed(char[] elements, operation: (index: Integer, acc: Character, Character) -> Character): Character {
////        if (isEmpty())
////            throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = elements[0];
////        for (index in 1..lastIndex) {
////            accumulator = operation(index, accumulator, this[index])
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with last element and applying [operation] from right to left to each element and current accumulator value.
////     */
////    public static <S, T: S> reduceRight(@NotNull T[] elements, operation: (T, acc: S) -> S): S {
////        var index = lastIndex
////        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator: S = get(index--)
////        while (index >= 0) {
////            accumulator = operation(get(index--), accumulator)
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with last element and applying [operation] from right to left to each element and current accumulator value.
////     */
////    public static reduceRight(byte[] elements, operation: (Byte, acc: Byte) -> Byte): Byte {
////        var index = lastIndex
////        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = get(index--)
////        while (index >= 0) {
////            accumulator = operation(get(index--), accumulator)
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with last element and applying [operation] from right to left to each element and current accumulator value.
////     */
////    public static reduceRight(short[] elements, operation: (Short, acc: Short) -> Short): Short {
////        var index = lastIndex
////        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = get(index--)
////        while (index >= 0) {
////            accumulator = operation(get(index--), accumulator)
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with last element and applying [operation] from right to left to each element and current accumulator value.
////     */
////    public static reduceRight(int[] elements, operation: (Integer, acc: Integer) -> Integer): Integer {
////        var index = lastIndex
////        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = get(index--)
////        while (index >= 0) {
////            accumulator = operation(get(index--), accumulator)
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with last element and applying [operation] from right to left to each element and current accumulator value.
////     */
////    public static reduceRight(long[] elements, operation: (Long, acc: Long) -> Long): Long {
////        var index = lastIndex
////        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = get(index--)
////        while (index >= 0) {
////            accumulator = operation(get(index--), accumulator)
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with last element and applying [operation] from right to left to each element and current accumulator value.
////     */
////    public static reduceRight(float[] elements, operation: (Float, acc: Float) -> Float): Float {
////        var index = lastIndex
////        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = get(index--)
////        while (index >= 0) {
////            accumulator = operation(get(index--), accumulator)
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with last element and applying [operation] from right to left to each element and current accumulator value.
////     */
////    public static reduceRight(double[] elements, operation: (Double, acc: Double) -> Double): Double {
////        var index = lastIndex
////        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = get(index--)
////        while (index >= 0) {
////            accumulator = operation(get(index--), accumulator)
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with last element and applying [operation] from right to left to each element and current accumulator value.
////     */
////    public static reduceRight(boolean[] elements, operation: (Boolean, acc: Boolean) -> Boolean): Boolean {
////        var index = lastIndex
////        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = get(index--)
////        while (index >= 0) {
////            accumulator = operation(get(index--), accumulator)
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with last element and applying [operation] from right to left to each element and current accumulator value.
////     */
////    public static reduceRight(char[] elements, operation: (Character, acc: Character) -> Character): Character {
////        var index = lastIndex
////        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = get(index--)
////        while (index >= 0) {
////            accumulator = operation(get(index--), accumulator)
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with last element and applying [operation] from right to left
////     * to each element with its index in the original array and current accumulator value.
////     * @param [operation] function that takes the index of an element, the element itself
////     * and current accumulator value, and calculates the next accumulator value.
////     */
////    public static <S, T: S> reduceRightIndexed(@NotNull T[] elements, operation: (index: Integer, T, acc: S) -> S): S {
////        var index = lastIndex
////        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator: S = get(index--)
////        while (index >= 0) {
////            accumulator = operation(index, get(index), accumulator)
////                    --index
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with last element and applying [operation] from right to left
////     * to each element with its index in the original array and current accumulator value.
////     * @param [operation] function that takes the index of an element, the element itself
////     * and current accumulator value, and calculates the next accumulator value.
////     */
////    public static reduceRightIndexed(byte[] elements, operation: (index: Integer, Byte, acc: Byte) -> Byte): Byte {
////        var index = lastIndex
////        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = get(index--)
////        while (index >= 0) {
////            accumulator = operation(index, get(index), accumulator)
////                    --index
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with last element and applying [operation] from right to left
////     * to each element with its index in the original array and current accumulator value.
////     * @param [operation] function that takes the index of an element, the element itself
////     * and current accumulator value, and calculates the next accumulator value.
////     */
////    public static reduceRightIndexed(short[] elements, operation: (index: Integer, Short, acc: Short) -> Short): Short {
////        var index = lastIndex
////        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = get(index--)
////        while (index >= 0) {
////            accumulator = operation(index, get(index), accumulator)
////                    --index
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with last element and applying [operation] from right to left
////     * to each element with its index in the original array and current accumulator value.
////     * @param [operation] function that takes the index of an element, the element itself
////     * and current accumulator value, and calculates the next accumulator value.
////     */
////    public static reduceRightIndexed(int[] elements, operation: (index: Integer, Integer, acc: Integer) -> Integer): Integer {
////        var index = lastIndex
////        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = get(index--)
////        while (index >= 0) {
////            accumulator = operation(index, get(index), accumulator)
////                    --index
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with last element and applying [operation] from right to left
////     * to each element with its index in the original array and current accumulator value.
////     * @param [operation] function that takes the index of an element, the element itself
////     * and current accumulator value, and calculates the next accumulator value.
////     */
////    public static reduceRightIndexed(long[] elements, operation: (index: Integer, Long, acc: Long) -> Long): Long {
////        var index = lastIndex
////        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = get(index--)
////        while (index >= 0) {
////            accumulator = operation(index, get(index), accumulator)
////                    --index
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with last element and applying [operation] from right to left
////     * to each element with its index in the original array and current accumulator value.
////     * @param [operation] function that takes the index of an element, the element itself
////     * and current accumulator value, and calculates the next accumulator value.
////     */
////    public static reduceRightIndexed(float[] elements, operation: (index: Integer, Float, acc: Float) -> Float): Float {
////        var index = lastIndex
////        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = get(index--)
////        while (index >= 0) {
////            accumulator = operation(index, get(index), accumulator)
////                    --index
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with last element and applying [operation] from right to left
////     * to each element with its index in the original array and current accumulator value.
////     * @param [operation] function that takes the index of an element, the element itself
////     * and current accumulator value, and calculates the next accumulator value.
////     */
////    public static reduceRightIndexed(double[] elements, operation: (index: Integer, Double, acc: Double) -> Double): Double {
////        var index = lastIndex
////        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = get(index--)
////        while (index >= 0) {
////            accumulator = operation(index, get(index), accumulator)
////                    --index
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with last element and applying [operation] from right to left
////     * to each element with its index in the original array and current accumulator value.
////     * @param [operation] function that takes the index of an element, the element itself
////     * and current accumulator value, and calculates the next accumulator value.
////     */
////    public static reduceRightIndexed(boolean[] elements, operation: (index: Integer, Boolean, acc: Boolean) -> Boolean): Boolean {
////        var index = lastIndex
////        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = get(index--)
////        while (index >= 0) {
////            accumulator = operation(index, get(index), accumulator)
////                    --index
////        }
////        return accumulator
////    }
////
////    /**
////     * Accumulates value starting with last element and applying [operation] from right to left
////     * to each element with its index in the original array and current accumulator value.
////     * @param [operation] function that takes the index of an element, the element itself
////     * and current accumulator value, and calculates the next accumulator value.
////     */
////    public static reduceRightIndexed(char[] elements, operation: (index: Integer, Character, acc: Character) -> Character): Character {
////        var index = lastIndex
////        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
////        var accumulator = get(index--)
////        while (index >= 0) {
////            accumulator = operation(index, get(index), accumulator)
////                    --index
////        }
////        return accumulator
////    }
////



}
