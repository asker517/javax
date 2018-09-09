package me.panpf.javax.util;

import me.panpf.javax.lang.Numberx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class Arrayx3 {
////    /**
////     * Returns a list containing all elements except first [n] elements.
////     */
////    public static <T> drop(@NotNull T[] elements, n: Integer): List<T> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except first [n] elements.
////     */
////    public static drop(@NotNull byte[] elements, n: Integer): List<Byte> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except first [n] elements.
////     */
////    public static drop(@NotNull short[] elements, n: Integer): List<Short> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except first [n] elements.
////     */
////    public static drop(@NotNull int[] elements, n: Integer): List<Integer> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except first [n] elements.
////     */
////    public static drop(@NotNull long[] elements, n: Integer): List<Long> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except first [n] elements.
////     */
////    public static drop(@NotNull float[] elements, n: Integer): List<Float> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except first [n] elements.
////     */
////    public static drop(@NotNull double[] elements, n: Integer): List<Double> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except first [n] elements.
////     */
////    public static drop(@NotNull boolean[] elements, n: Integer): List<Boolean> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except first [n] elements.
////     */
////    public static drop(@NotNull char[] elements, n: Integer): List<Character> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return takeLast((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static <T> dropLast(@NotNull T[] elements, n: Integer): List<T> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return take((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static dropLast(@NotNull byte[] elements, n: Integer): List<Byte> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return take((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static dropLast(@NotNull short[] elements, n: Integer): List<Short> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return take((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static dropLast(@NotNull int[] elements, n: Integer): List<Integer> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return take((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static dropLast(@NotNull long[] elements, n: Integer): List<Long> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return take((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static dropLast(@NotNull float[] elements, n: Integer): List<Float> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return take((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static dropLast(@NotNull double[] elements, n: Integer): List<Double> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return take((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static dropLast(@NotNull boolean[] elements, n: Integer): List<Boolean> {
////        require(n >= 0) { "Requested element count $n is less than zero." }
////        return take((size - n).coerceAtLeast(0))
////    }
////
////    /**
////     * Returns a list containing all elements except last [n] elements.
////     */
////    public static dropLast(@NotNull char[] elements, n: Integer): List<Character> {
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
////    public static <T> take(@NotNull T[] elements, n: Integer): List<T> {
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
////    public static take(@NotNull byte[] elements, n: Integer): List<Byte> {
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
////    public static take(@NotNull short[] elements, n: Integer): List<Short> {
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
////    public static take(@NotNull int[] elements, n: Integer): List<Integer> {
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
////    public static take(@NotNull long[] elements, n: Integer): List<Long> {
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
////    public static take(@NotNull float[] elements, n: Integer): List<Float> {
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
////    public static take(@NotNull double[] elements, n: Integer): List<Double> {
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
////    public static take(@NotNull boolean[] elements, n: Integer): List<Boolean> {
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
////    public static take(@NotNull char[] elements, n: Integer): List<Character> {
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
////    public static <T> takeLast(@NotNull T[] elements, n: Integer): List<T> {
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
////    public static takeLast(@NotNull byte[] elements, n: Integer): List<Byte> {
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
////    public static takeLast(@NotNull short[] elements, n: Integer): List<Short> {
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
////    public static takeLast(@NotNull int[] elements, n: Integer): List<Integer> {
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
////    public static takeLast(@NotNull long[] elements, n: Integer): List<Long> {
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
////    public static takeLast(@NotNull float[] elements, n: Integer): List<Float> {
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
////    public static takeLast(@NotNull double[] elements, n: Integer): List<Double> {
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
////    public static takeLast(@NotNull boolean[] elements, n: Integer): List<Boolean> {
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
////    public static takeLast(@NotNull char[] elements, n: Integer): List<Character> {
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
////    public static <T> contentDeepEquals(@NotNull T[] elements, T[] other): boolean {
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
////    public static <T> contentDeepHashCode(@NotNull T[] elements, ): int {
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
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static <T> contentHashCode(@NotNull T[] elements, ): int {
////        return java.util.Arrays.hashCode(this)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static contentHashCode(@NotNull byte[] elements, ): int {
////        return java.util.Arrays.hashCode(this)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static contentHashCode(@NotNull short[] elements, ): int {
////        return java.util.Arrays.hashCode(this)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static contentHashCode(@NotNull int[] elements, ): int {
////        return java.util.Arrays.hashCode(this)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static contentHashCode(@NotNull long[] elements, ): int {
////        return java.util.Arrays.hashCode(this)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static contentHashCode(@NotNull float[] elements, ): int {
////        return java.util.Arrays.hashCode(this)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static contentHashCode(@NotNull double[] elements, ): int {
////        return java.util.Arrays.hashCode(this)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static contentHashCode(@NotNull boolean[] elements, ): int {
////        return java.util.Arrays.hashCode(this)
////    }
////
/////**
//// * Returns a hash code based on the contents of this array as if it is [List].
//// */
////    @SinceKotlin("1.1")
////    @kotlin.internal.InlineOnly
////    public static contentHashCode(@NotNull char[] elements, ): int {
////        return java.util.Arrays.hashCode(this)
////    }
////
////
////
////
//    /**
//     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromArray
//     */
//    public static <T> Sequence<T> asSequence(@NotNull T[] elements) {
//        if (Arrayx.isEmpty(elements)) return emptySequence();
//        return Sequence { this.iterator() }
//    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromArray
//     */
//    public static asSequence(@NotNull byte[] elements, ): Sequence<Byte> {
//        if (isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromArray
//     */
//    public static asSequence(@NotNull short[] elements, ): Sequence<Short> {
//        if (isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromArray
//     */
//    public static asSequence(@NotNull int[] elements, ): Sequence<Integer> {
//        if (isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromArray
//     */
//    public static asSequence(@NotNull long[] elements, ): Sequence<Long> {
//        if (isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromArray
//     */
//    public static asSequence(@NotNull long[] elements, ): Sequence<Float> {
//        if (isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromArray
//     */
//    public static asSequence(@NotNull double[] elements, ): Sequence<Double> {
//        if (isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromArray
//     */
//    public static asSequence(@NotNull boolean[] elements, ): Sequence<Boolean> {
//        if (isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromArray
//     */
//    public static asSequence(@NotNull char[] elements, ): Sequence<Character> {
//        if (isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
////
////    /**
////     * Returns a [Map] containing key-value pairs provided by [transform] function
////     * applied to elements of the given array.
////     *
////     * If any of two pairs would have the same key the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public static <T, K, V> associate(@NotNull T[] elements, transform: (T) -> Pair<K, V>): Map<K, V> {
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
////    public static <K, V> associate(@NotNull byte[] elements, transform: (Byte) -> Pair<K, V>): Map<K, V> {
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
////    public static <K, V> associate(@NotNull short[] elements, transform: (Short) -> Pair<K, V>): Map<K, V> {
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
////    public static <K, V> associate(@NotNull int[] elements, transform: (Integer) -> Pair<K, V>): Map<K, V> {
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
////    public static <K, V> associate(@NotNull long[] elements, transform: (Long) -> Pair<K, V>): Map<K, V> {
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
////    public static <K, V> associate(@NotNull long[] elements, transform: (Float) -> Pair<K, V>): Map<K, V> {
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
////    public static <K, V> associate(@NotNull double[] elements, transform: (Double) -> Pair<K, V>): Map<K, V> {
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
////    public static <K, V> associate(@NotNull boolean[] elements, transform: (Boolean) -> Pair<K, V>): Map<K, V> {
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
////    public static <K, V> associate(@NotNull char[] elements, transform: (Character) -> Pair<K, V>): Map<K, V> {
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
////    public static <T, K> associateBy(@NotNull T[] elements, keySelector: (T) -> K): Map<K, T> {
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
////    public static <K> associateBy(@NotNull byte[] elements, keySelector: (Byte) -> K): Map<K, Byte> {
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
////    public static <K> associateBy(@NotNull short[] elements, keySelector: (Short) -> K): Map<K, Short> {
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
////    public static <K> associateBy(@NotNull int[] elements, keySelector: (Integer) -> K): Map<K, Integer> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateByTo(LinkedHashMap<K, Integer>(capacity), keySelector)
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
////    public static <K> associateBy(@NotNull long[] elements, keySelector: (Long) -> K): Map<K, Long> {
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
////    public static <K> associateBy(@NotNull long[] elements, keySelector: (Float) -> K): Map<K, Float> {
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
////    public static <K> associateBy(@NotNull double[] elements, keySelector: (Double) -> K): Map<K, Double> {
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
////    public static <K> associateBy(@NotNull boolean[] elements, keySelector: (Boolean) -> K): Map<K, Boolean> {
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
////    public static <K> associateBy(@NotNull char[] elements, keySelector: (Character) -> K): Map<K, Character> {
////        val capacity = mapCapacity(size).coerceAtLeast(16)
////        return associateByTo(LinkedHashMap<K, Character>(capacity), keySelector)
////    }
////
////    /**
////     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
////     *
////     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
////     *
////     * The returned map preserves the entry iteration order of the original array.
////     */
////    public static <T, K, V> associateBy(@NotNull T[] elements, keySelector: (T) -> K, valueTransform: (T) -> V): Map<K, V> {
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
////    public static <K, V> associateBy(@NotNull byte[] elements, keySelector: (Byte) -> K, valueTransform: (Byte) -> V): Map<K, V> {
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
////    public static <K, V> associateBy(@NotNull short[] elements, keySelector: (Short) -> K, valueTransform: (Short) -> V): Map<K, V> {
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
////    public static <K, V> associateBy(@NotNull int[] elements, keySelector: (Integer) -> K, valueTransform: (Integer) -> V): Map<K, V> {
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
////    public static <K, V> associateBy(@NotNull long[] elements, keySelector: (Long) -> K, valueTransform: (Long) -> V): Map<K, V> {
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
////    public static <K, V> associateBy(@NotNull long[] elements, keySelector: (Float) -> K, valueTransform: (Float) -> V): Map<K, V> {
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
////    public static <K, V> associateBy(@NotNull double[] elements, keySelector: (Double) -> K, valueTransform: (Double) -> V): Map<K, V> {
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
////    public static <K, V> associateBy(@NotNull boolean[] elements, keySelector: (Boolean) -> K, valueTransform: (Boolean) -> V): Map<K, V> {
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
////    public static <K, V> associateBy(@NotNull char[] elements, keySelector: (Character) -> K, valueTransform: (Character) -> V): Map<K, V> {
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
////    public static <T, K, M : Map<K, in T>> associateByTo(@NotNull T[] elements, destination: M, keySelector: (T) -> K): M {
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
////    public static <K, M : Map<K, in Byte>> associateByTo(@NotNull byte[] elements, destination: M, keySelector: (Byte) -> K): M {
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
////    public static <K, M : Map<K, in Short>> associateByTo(@NotNull short[] elements, destination: M, keySelector: (Short) -> K): M {
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
////    public static <K, M : Map<K, in Integer>> associateByTo(@NotNull int[] elements, destination: M, keySelector: (Integer) -> K): M {
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
////    public static <K, M : Map<K, in Long>> associateByTo(@NotNull long[] elements, destination: M, keySelector: (Long) -> K): M {
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
////    public static <K, M : Map<K, in Float>> associateByTo(@NotNull long[] elements, destination: M, keySelector: (Float) -> K): M {
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
////    public static <K, M : Map<K, in Double>> associateByTo(@NotNull double[] elements, destination: M, keySelector: (Double) -> K): M {
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
////    public static <K, M : Map<K, in Boolean>> associateByTo(@NotNull boolean[] elements, destination: M, keySelector: (Boolean) -> K): M {
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
////    public static <K, M : Map<K, in Character>> associateByTo(@NotNull char[] elements, destination: M, keySelector: (Character) -> K): M {
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
////    public static <T, K, V, M : Map<K, in V>> associateByTo(@NotNull T[] elements, destination: M, keySelector: (T) -> K, valueTransform: (T) -> V): M {
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
////    public static <K, V, M : Map<K, in V>> associateByTo(@NotNull byte[] elements, destination: M, keySelector: (Byte) -> K, valueTransform: (Byte) -> V): M {
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
////    public static <K, V, M : Map<K, in V>> associateByTo(@NotNull short[] elements, destination: M, keySelector: (Short) -> K, valueTransform: (Short) -> V): M {
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
////    public static <K, V, M : Map<K, in V>> associateByTo(@NotNull int[] elements, destination: M, keySelector: (Integer) -> K, valueTransform: (Integer) -> V): M {
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
////    public static <K, V, M : Map<K, in V>> associateByTo(@NotNull long[] elements, destination: M, keySelector: (Long) -> K, valueTransform: (Long) -> V): M {
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
////    public static <K, V, M : Map<K, in V>> associateByTo(@NotNull long[] elements, destination: M, keySelector: (Float) -> K, valueTransform: (Float) -> V): M {
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
////    public static <K, V, M : Map<K, in V>> associateByTo(@NotNull double[] elements, destination: M, keySelector: (Double) -> K, valueTransform: (Double) -> V): M {
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
////    public static <K, V, M : Map<K, in V>> associateByTo(@NotNull boolean[] elements, destination: M, keySelector: (Boolean) -> K, valueTransform: (Boolean) -> V): M {
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
////    public static <K, V, M : Map<K, in V>> associateByTo(@NotNull char[] elements, destination: M, keySelector: (Character) -> K, valueTransform: (Character) -> V): M {
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
////    public static <T, K, V, M : Map<K, in V>> associateTo(@NotNull T[] elements, destination: M, transform: (T) -> Pair<K, V>): M {
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
////    public static <K, V, M : Map<K, in V>> associateTo(@NotNull byte[] elements, destination: M, transform: (Byte) -> Pair<K, V>): M {
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
////    public static <K, V, M : Map<K, in V>> associateTo(@NotNull short[] elements, destination: M, transform: (Short) -> Pair<K, V>): M {
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
////    public static <K, V, M : Map<K, in V>> associateTo(@NotNull int[] elements, destination: M, transform: (Integer) -> Pair<K, V>): M {
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
////    public static <K, V, M : Map<K, in V>> associateTo(@NotNull long[] elements, destination: M, transform: (Long) -> Pair<K, V>): M {
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
////    public static <K, V, M : Map<K, in V>> associateTo(@NotNull long[] elements, destination: M, transform: (Float) -> Pair<K, V>): M {
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
////    public static <K, V, M : Map<K, in V>> associateTo(@NotNull double[] elements, destination: M, transform: (Double) -> Pair<K, V>): M {
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
////    public static <K, V, M : Map<K, in V>> associateTo(@NotNull boolean[] elements, destination: M, transform: (Boolean) -> Pair<K, V>): M {
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
////    public static <K, V, M : Map<K, in V>> associateTo(@NotNull char[] elements, destination: M, transform: (Character) -> Pair<K, V>): M {
////        for (element in this) {
////            destination += transform(element)
////        }
////        return destination
////    }
////
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
////        return this.toSet().toList()
////    }
////
////    /**
////     * Returns a list containing only distinct elements from the given array.
////     *
////     * The elements in the resulting list are in the same order as they were in the source array.
////     */
////    public static distinct(byte[] elements): List<Byte> {
////        return this.toSet().toList()
////    }
////
////    /**
////     * Returns a list containing only distinct elements from the given array.
////     *
////     * The elements in the resulting list are in the same order as they were in the source array.
////     */
////    public static distinct(short[] elements): List<Short> {
////        return this.toSet().toList()
////    }
////
////    /**
////     * Returns a list containing only distinct elements from the given array.
////     *
////     * The elements in the resulting list are in the same order as they were in the source array.
////     */
////    public static distinct(int[] elements): List<Integer> {
////        return this.toSet().toList()
////    }
////
////    /**
////     * Returns a list containing only distinct elements from the given array.
////     *
////     * The elements in the resulting list are in the same order as they were in the source array.
////     */
////    public static distinct(long[] elements): List<Long> {
////        return this.toSet().toList()
////    }
////
////    /**
////     * Returns a list containing only distinct elements from the given array.
////     *
////     * The elements in the resulting list are in the same order as they were in the source array.
////     */
////    public static distinct(float[] elements): List<Float> {
////        return this.toSet().toList()
////    }
////
////    /**
////     * Returns a list containing only distinct elements from the given array.
////     *
////     * The elements in the resulting list are in the same order as they were in the source array.
////     */
////    public static distinct(double[] elements): List<Double> {
////        return this.toSet().toList()
////    }
////
////    /**
////     * Returns a list containing only distinct elements from the given array.
////     *
////     * The elements in the resulting list are in the same order as they were in the source array.
////     */
////    public fundistinct(boolean[] elements): List<Boolean> {
////        return this.toSet().toList()
////    }
////
////    /**
////     * Returns a list containing only distinct elements from the given array.
////     *
////     * The elements in the resulting list are in the same order as they were in the source array.
////     */
////    public static distinct(char[] elements): List<Character> {
////        return this.toSet().toList()
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
////    public static <K> distinctBy(int[] elements, selector: (Integer) -> K): List<Integer> {
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


}
