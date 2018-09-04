package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

import java.util.*;

@SuppressWarnings({"WeakerAccess"})
public class Arrayx2 {



//
//
//
//    /**
//     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
//     */
//    public fun <T> withIndex(@NotNull T[] elements, ): Iterable<IndexedValue<T>> {
//        return IndexingIterable { iterator() }
//    }
//
//    /**
//     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
//     */
//    public fun withIndex(byte[] elements): Iterable<IndexedValue<Byte>> {
//        return IndexingIterable { iterator() }
//    }
//
//    /**
//     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
//     */
//    public fun withIndex(short[] elements): Iterable<IndexedValue<Short>> {
//        return IndexingIterable { iterator() }
//    }
//
//    /**
//     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
//     */
//    public fun withIndex(int[] elements): Iterable<IndexedValue<Int>> {
//        return IndexingIterable { iterator() }
//    }
//
//    /**
//     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
//     */
//    public fun withIndex(long[] elements): Iterable<IndexedValue<Long>> {
//        return IndexingIterable { iterator() }
//    }
//
//    /**
//     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
//     */
//    public fun withIndex(float[] elements): Iterable<IndexedValue<Float>> {
//        return IndexingIterable { iterator() }
//    }
//
//    /**
//     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
//     */
//    public fun withIndex(double[] elements): Iterable<IndexedValue<Double>> {
//        return IndexingIterable { iterator() }
//    }
//
//    /**
//     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
//     */
//    public funwithIndex(boolean[] elements): Iterable<IndexedValue<Boolean>> {
//        return IndexingIterable { iterator() }
//    }
//
//    /**
//     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
//     */
//    public fun withIndex(char[] elements): Iterable<IndexedValue<Char>> {
//        return IndexingIterable { iterator() }
//    }
//
//    /**
//     * Returns a list containing only distinct elements from the given array.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public fun <T> distinct(@NotNull T[] elements, ): List<T> {
//        return this.toMutableSet().toList()
//    }
//
//    /**
//     * Returns a list containing only distinct elements from the given array.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public fun distinct(byte[] elements): List<Byte> {
//        return this.toMutableSet().toList()
//    }
//
//    /**
//     * Returns a list containing only distinct elements from the given array.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public fun distinct(short[] elements): List<Short> {
//        return this.toMutableSet().toList()
//    }
//
//    /**
//     * Returns a list containing only distinct elements from the given array.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public fun distinct(int[] elements): List<Int> {
//        return this.toMutableSet().toList()
//    }
//
//    /**
//     * Returns a list containing only distinct elements from the given array.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public fun distinct(long[] elements): List<Long> {
//        return this.toMutableSet().toList()
//    }
//
//    /**
//     * Returns a list containing only distinct elements from the given array.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public fun distinct(float[] elements): List<Float> {
//        return this.toMutableSet().toList()
//    }
//
//    /**
//     * Returns a list containing only distinct elements from the given array.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public fun distinct(double[] elements): List<Double> {
//        return this.toMutableSet().toList()
//    }
//
//    /**
//     * Returns a list containing only distinct elements from the given array.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public fundistinct(boolean[] elements): List<Boolean> {
//        return this.toMutableSet().toList()
//    }
//
//    /**
//     * Returns a list containing only distinct elements from the given array.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public fun distinct(char[] elements): List<Character> {
//        return this.toMutableSet().toList()
//    }
//
//    /**
//     * Returns a list containing only elements from the given array
//     * having distinct keys returned by the given [selector] function.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public static <T, K> distinctBy(@NotNull T[] elements, selector: (T) -> K): List<T> {
//        val set = HashSet<K>()
//        val list = ArrayList<T>()
//        for (e in this) {
//            val key = selector(e)
//            if (set.add(key))
//                list.add(e)
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing only elements from the given array
//     * having distinct keys returned by the given [selector] function.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public static <K> distinctBy(byte[] elements, selector: (Byte) -> K): List<Byte> {
//        val set = HashSet<K>()
//        val list = ArrayList<Byte>()
//        for (e in this) {
//            val key = selector(e)
//            if (set.add(key))
//                list.add(e)
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing only elements from the given array
//     * having distinct keys returned by the given [selector] function.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public static <K> distinctBy(short[] elements, selector: (Short) -> K): List<Short> {
//        val set = HashSet<K>()
//        val list = ArrayList<Short>()
//        for (e in this) {
//            val key = selector(e)
//            if (set.add(key))
//                list.add(e)
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing only elements from the given array
//     * having distinct keys returned by the given [selector] function.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public static <K> distinctBy(int[] elements, selector: (Int) -> K): List<Int> {
//        val set = HashSet<K>()
//        val list = ArrayList<Int>()
//        for (e in this) {
//            val key = selector(e)
//            if (set.add(key))
//                list.add(e)
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing only elements from the given array
//     * having distinct keys returned by the given [selector] function.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public static <K> distinctBy(long[] elements, selector: (Long) -> K): List<Long> {
//        val set = HashSet<K>()
//        val list = ArrayList<Long>()
//        for (e in this) {
//            val key = selector(e)
//            if (set.add(key))
//                list.add(e)
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing only elements from the given array
//     * having distinct keys returned by the given [selector] function.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public static <K> distinctBy(float[] elements, selector: (Float) -> K): List<Float> {
//        val set = HashSet<K>()
//        val list = ArrayList<Float>()
//        for (e in this) {
//            val key = selector(e)
//            if (set.add(key))
//                list.add(e)
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing only elements from the given array
//     * having distinct keys returned by the given [selector] function.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public static <K> distinctBy(double[] elements, selector: (Double) -> K): List<Double> {
//        val set = HashSet<K>()
//        val list = ArrayList<Double>()
//        for (e in this) {
//            val key = selector(e)
//            if (set.add(key))
//                list.add(e)
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing only elements from the given array
//     * having distinct keys returned by the given [selector] function.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public static <K>distinctBy(boolean[] elements, selector: (Boolean) -> K): List<Boolean> {
//        val set = HashSet<K>()
//        val list = ArrayList<Boolean>()
//        for (e in this) {
//            val key = selector(e)
//            if (set.add(key))
//                list.add(e)
//        }
//        return list
//    }
//
//    /**
//     * Returns a list containing only elements from the given array
//     * having distinct keys returned by the given [selector] function.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public static <K> distinctBy(char[] elements, selector: (Char) -> K): List<Character> {
//        val set = HashSet<K>()
//        val list = ArrayList<Character>()
//        for (e in this) {
//            val key = selector(e)
//            if (set.add(key))
//                list.add(e)
//        }
//        return list
//    }
//
//    /**
//     * Returns a set containing all elements that are contained by both this set and the specified collection.
//     *
//     * The returned set preserves the element iteration order of the original array.
//     */
//    public infix fun <T> intersect(@NotNull T[] elements, other: Iterable<T>): Set<T> {
//        val set = this.toMutableSet()
//        set.retainAll(other)
//        return set
//    }
//
//    /**
//     * Returns a set containing all elements that are contained by both this set and the specified collection.
//     *
//     * The returned set preserves the element iteration order of the original array.
//     */
//    public infix fun intersect(byte[] elements, other: Iterable<Byte>): Set<Byte> {
//        val set = this.toMutableSet()
//        set.retainAll(other)
//        return set
//    }
//
//    /**
//     * Returns a set containing all elements that are contained by both this set and the specified collection.
//     *
//     * The returned set preserves the element iteration order of the original array.
//     */
//    public infix fun intersect(short[] elements, other: Iterable<Short>): Set<Short> {
//        val set = this.toMutableSet()
//        set.retainAll(other)
//        return set
//    }
//
//    /**
//     * Returns a set containing all elements that are contained by both this set and the specified collection.
//     *
//     * The returned set preserves the element iteration order of the original array.
//     */
//    public infix fun intersect(int[] elements, other: Iterable<Int>): Set<Int> {
//        val set = this.toMutableSet()
//        set.retainAll(other)
//        return set
//    }
//
//    /**
//     * Returns a set containing all elements that are contained by both this set and the specified collection.
//     *
//     * The returned set preserves the element iteration order of the original array.
//     */
//    public infix fun intersect(long[] elements, other: Iterable<Long>): Set<Long> {
//        val set = this.toMutableSet()
//        set.retainAll(other)
//        return set
//    }
//
//    /**
//     * Returns a set containing all elements that are contained by both this set and the specified collection.
//     *
//     * The returned set preserves the element iteration order of the original array.
//     */
//    public infix fun intersect(float[] elements, other: Iterable<Float>): Set<Float> {
//        val set = this.toMutableSet()
//        set.retainAll(other)
//        return set
//    }
//
//    /**
//     * Returns a set containing all elements that are contained by both this set and the specified collection.
//     *
//     * The returned set preserves the element iteration order of the original array.
//     */
//    public infix fun intersect(double[] elements, other: Iterable<Double>): Set<Double> {
//        val set = this.toMutableSet()
//        set.retainAll(other)
//        return set
//    }
//
//    /**
//     * Returns a set containing all elements that are contained by both this set and the specified collection.
//     *
//     * The returned set preserves the element iteration order of the original array.
//     */
//    public infix fun intersect(boolean[] elements, other: Iterable<Boolean>): Set<Boolean> {
//        val set = this.toMutableSet()
//        set.retainAll(other)
//        return set
//    }
//
//    /**
//     * Returns a set containing all elements that are contained by both this set and the specified collection.
//     *
//     * The returned set preserves the element iteration order of the original array.
//     */
//    public infix fun intersect(char[] elements, other: Iterable<Char>): Set<Char> {
//        val set = this.toMutableSet()
//        set.retainAll(other)
//        return set
//    }
//
//    /**
//     * Returns a set containing all elements that are contained by this array and not contained by the specified collection.
//     *
//     * The returned set preserves the element iteration order of the original array.
//     */
//    public infix fun <T> subtract(@NotNull T[] elements, other: Iterable<T>): Set<T> {
//        val set = this.toMutableSet()
//        set.removeAll(other)
//        return set
//    }
//
//    /**
//     * Returns a set containing all elements that are contained by this array and not contained by the specified collection.
//     *
//     * The returned set preserves the element iteration order of the original array.
//     */
//    public infix fun subtract(byte[] elements, other: Iterable<Byte>): Set<Byte> {
//        val set = this.toMutableSet()
//        set.removeAll(other)
//        return set
//    }
//
//    /**
//     * Returns a set containing all elements that are contained by this array and not contained by the specified collection.
//     *
//     * The returned set preserves the element iteration order of the original array.
//     */
//    public infix fun subtract(short[] elements, other: Iterable<Short>): Set<Short> {
//        val set = this.toMutableSet()
//        set.removeAll(other)
//        return set
//    }
//
//    /**
//     * Returns a set containing all elements that are contained by this array and not contained by the specified collection.
//     *
//     * The returned set preserves the element iteration order of the original array.
//     */
//    public infix fun subtract(int[] elements, other: Iterable<Int>): Set<Int> {
//        val set = this.toMutableSet()
//        set.removeAll(other)
//        return set
//    }
//
//    /**
//     * Returns a set containing all elements that are contained by this array and not contained by the specified collection.
//     *
//     * The returned set preserves the element iteration order of the original array.
//     */
//    public infix fun subtract(long[] elements, other: Iterable<Long>): Set<Long> {
//        val set = this.toMutableSet()
//        set.removeAll(other)
//        return set
//    }
//
//    /**
//     * Returns a set containing all elements that are contained by this array and not contained by the specified collection.
//     *
//     * The returned set preserves the element iteration order of the original array.
//     */
//    public infix fun subtract(float[] elements, other: Iterable<Float>): Set<Float> {
//        val set = this.toMutableSet()
//        set.removeAll(other)
//        return set
//    }
//
//    /**
//     * Returns a set containing all elements that are contained by this array and not contained by the specified collection.
//     *
//     * The returned set preserves the element iteration order of the original array.
//     */
//    public infix fun subtract(double[] elements, other: Iterable<Double>): Set<Double> {
//        val set = this.toMutableSet()
//        set.removeAll(other)
//        return set
//    }
//
//    /**
//     * Returns a set containing all elements that are contained by this array and not contained by the specified collection.
//     *
//     * The returned set preserves the element iteration order of the original array.
//     */
//    public infix fun subtract(boolean[] elements, other: Iterable<Boolean>): Set<Boolean> {
//        val set = this.toMutableSet()
//        set.removeAll(other)
//        return set
//    }
//
//    /**
//     * Returns a set containing all elements that are contained by this array and not contained by the specified collection.
//     *
//     * The returned set preserves the element iteration order of the original array.
//     */
//    public infix fun subtract(char[] elements, other: Iterable<Char>): Set<Char> {
//        val set = this.toMutableSet()
//        set.removeAll(other)
//        return set
//    }
//
//
//    /**
//     * Returns the number of elements in this array.
//     */
//    @kotlin.internal.InlineOnly
//    public static <T> count(@NotNull T[] elements, ): Int {
//        return size
//    }
//
///**
// * Returns the number of elements in this array.
// */
//    @kotlin.internal.InlineOnly
//    public static count(byte[] elements): Int {
//        return size
//    }
//
///**
// * Returns the number of elements in this array.
// */
//    @kotlin.internal.InlineOnly
//    public static count(short[] elements): Int {
//        return size
//    }
//
///**
// * Returns the number of elements in this array.
// */
//    @kotlin.internal.InlineOnly
//    public static count(int[] elements): Int {
//        return size
//    }
//
///**
// * Returns the number of elements in this array.
// */
//    @kotlin.internal.InlineOnly
//    public static count(long[] elements): Int {
//        return size
//    }
//
///**
// * Returns the number of elements in this array.
// */
//    @kotlin.internal.InlineOnly
//    public static count(float[] elements): Int {
//        return size
//    }
//
///**
// * Returns the number of elements in this array.
// */
//    @kotlin.internal.InlineOnly
//    public static count(double[] elements): Int {
//        return size
//    }
//
///**
// * Returns the number of elements in this array.
// */
//    @kotlin.internal.InlineOnly
//    public static count(boolean[] elements): Int {
//        return size
//    }
//
///**
// * Returns the number of elements in this array.
// */
//    @kotlin.internal.InlineOnly
//    public static count(char[] elements): Int {
//        return size
//    }
//
//    /**
//     * Returns the number of elements matching the given [predicate].
//     */
//    public static <T> count(@NotNull T[] elements, predicate: (T) -> Boolean): Int {
//        var count = 0
//        for (element in this) if (predicate(element)) count++
//        return count
//    }
//
//    /**
//     * Returns the number of elements matching the given [predicate].
//     */
//    public static count(byte[] elements, predicate: (Byte) -> Boolean): Int {
//        var count = 0
//        for (element in this) if (predicate(element)) count++
//        return count
//    }
//
//    /**
//     * Returns the number of elements matching the given [predicate].
//     */
//    public static count(short[] elements, predicate: (Short) -> Boolean): Int {
//        var count = 0
//        for (element in this) if (predicate(element)) count++
//        return count
//    }
//
//    /**
//     * Returns the number of elements matching the given [predicate].
//     */
//    public static count(int[] elements, predicate: (Int) -> Boolean): Int {
//        var count = 0
//        for (element in this) if (predicate(element)) count++
//        return count
//    }
//
//    /**
//     * Returns the number of elements matching the given [predicate].
//     */
//    public static count(long[] elements, predicate: (Long) -> Boolean): Int {
//        var count = 0
//        for (element in this) if (predicate(element)) count++
//        return count
//    }
//
//    /**
//     * Returns the number of elements matching the given [predicate].
//     */
//    public static count(float[] elements, predicate: (Float) -> Boolean): Int {
//        var count = 0
//        for (element in this) if (predicate(element)) count++
//        return count
//    }
//
//    /**
//     * Returns the number of elements matching the given [predicate].
//     */
//    public static count(double[] elements, predicate: (Double) -> Boolean): Int {
//        var count = 0
//        for (element in this) if (predicate(element)) count++
//        return count
//    }
//
//    /**
//     * Returns the number of elements matching the given [predicate].
//     */
//    public static count(boolean[] elements, predicate: (Boolean) -> Boolean): Int {
//        var count = 0
//        for (element in this) if (predicate(element)) count++
//        return count
//    }
//
//    /**
//     * Returns the number of elements matching the given [predicate].
//     */
//    public static count(char[] elements, predicate: (Char) -> Boolean): Int {
//        var count = 0
//        for (element in this) if (predicate(element)) count++
//        return count
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public static <T, R> fold(@NotNull T[] elements, initial: R, operation: (acc: R, T) -> R): R {
//        var accumulator = initial
//        for (element in this) accumulator = operation(accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public static <R> fold(byte[] elements, initial: R, operation: (acc: R, Byte) -> R): R {
//        var accumulator = initial
//        for (element in this) accumulator = operation(accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public static <R> fold(short[] elements, initial: R, operation: (acc: R, Short) -> R): R {
//        var accumulator = initial
//        for (element in this) accumulator = operation(accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public static <R> fold(int[] elements, initial: R, operation: (acc: R, Int) -> R): R {
//        var accumulator = initial
//        for (element in this) accumulator = operation(accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public static <R> fold(long[] elements, initial: R, operation: (acc: R, Long) -> R): R {
//        var accumulator = initial
//        for (element in this) accumulator = operation(accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public static <R> fold(float[] elements, initial: R, operation: (acc: R, Float) -> R): R {
//        var accumulator = initial
//        for (element in this) accumulator = operation(accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public static <R> fold(double[] elements, initial: R, operation: (acc: R, Double) -> R): R {
//        var accumulator = initial
//        for (element in this) accumulator = operation(accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public static <R> fold(boolean[] elements, initial: R, operation: (acc: R, Boolean) -> R): R {
//        var accumulator = initial
//        for (element in this) accumulator = operation(accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public static <R> fold(char[] elements, initial: R, operation: (acc: R, Char) -> R): R {
//        var accumulator = initial
//        for (element in this) accumulator = operation(accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right
//     * to current accumulator value and each element with its index in the original array.
//     * @param [operation] function that takes the index of an element, current accumulator value
//     * and the element itself, and calculates the next accumulator value.
//     */
//    public static <T, R> foldIndexed(@NotNull T[] elements, initial: R, operation: (index: Int, acc: R, T) -> R): R {
//        var index = 0
//        var accumulator = initial
//        for (element in this) accumulator = operation(index++, accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right
//     * to current accumulator value and each element with its index in the original array.
//     * @param [operation] function that takes the index of an element, current accumulator value
//     * and the element itself, and calculates the next accumulator value.
//     */
//    public static <R> foldIndexed(byte[] elements, initial: R, operation: (index: Int, acc: R, Byte) -> R): R {
//        var index = 0
//        var accumulator = initial
//        for (element in this) accumulator = operation(index++, accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right
//     * to current accumulator value and each element with its index in the original array.
//     * @param [operation] function that takes the index of an element, current accumulator value
//     * and the element itself, and calculates the next accumulator value.
//     */
//    public static <R> foldIndexed(short[] elements, initial: R, operation: (index: Int, acc: R, Short) -> R): R {
//        var index = 0
//        var accumulator = initial
//        for (element in this) accumulator = operation(index++, accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right
//     * to current accumulator value and each element with its index in the original array.
//     * @param [operation] function that takes the index of an element, current accumulator value
//     * and the element itself, and calculates the next accumulator value.
//     */
//    public static <R> foldIndexed(int[] elements, initial: R, operation: (index: Int, acc: R, Int) -> R): R {
//        var index = 0
//        var accumulator = initial
//        for (element in this) accumulator = operation(index++, accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right
//     * to current accumulator value and each element with its index in the original array.
//     * @param [operation] function that takes the index of an element, current accumulator value
//     * and the element itself, and calculates the next accumulator value.
//     */
//    public static <R> foldIndexed(long[] elements, initial: R, operation: (index: Int, acc: R, Long) -> R): R {
//        var index = 0
//        var accumulator = initial
//        for (element in this) accumulator = operation(index++, accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right
//     * to current accumulator value and each element with its index in the original array.
//     * @param [operation] function that takes the index of an element, current accumulator value
//     * and the element itself, and calculates the next accumulator value.
//     */
//    public static <R> foldIndexed(float[] elements, initial: R, operation: (index: Int, acc: R, Float) -> R): R {
//        var index = 0
//        var accumulator = initial
//        for (element in this) accumulator = operation(index++, accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right
//     * to current accumulator value and each element with its index in the original array.
//     * @param [operation] function that takes the index of an element, current accumulator value
//     * and the element itself, and calculates the next accumulator value.
//     */
//    public static <R> foldIndexed(double[] elements, initial: R, operation: (index: Int, acc: R, Double) -> R): R {
//        var index = 0
//        var accumulator = initial
//        for (element in this) accumulator = operation(index++, accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right
//     * to current accumulator value and each element with its index in the original array.
//     * @param [operation] function that takes the index of an element, current accumulator value
//     * and the element itself, and calculates the next accumulator value.
//     */
//    public static <R> foldIndexed(boolean[] elements, initial: R, operation: (index: Int, acc: R, Boolean) -> R): R {
//        var index = 0
//        var accumulator = initial
//        for (element in this) accumulator = operation(index++, accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right
//     * to current accumulator value and each element with its index in the original array.
//     * @param [operation] function that takes the index of an element, current accumulator value
//     * and the element itself, and calculates the next accumulator value.
//     */
//    public static <R> foldIndexed(char[] elements, initial: R, operation: (index: Int, acc: R, Char) -> R): R {
//        var index = 0
//        var accumulator = initial
//        for (element in this) accumulator = operation(index++, accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from right to left to each element and current accumulator value.
//     */
//    public static <T, R> foldRight(@NotNull T[] elements, initial: R, operation: (T, acc: R) -> R): R {
//        var index = lastIndex
//        var accumulator = initial
//        while (index >= 0) {
//            accumulator = operation(get(index--), accumulator)
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from right to left to each element and current accumulator value.
//     */
//    public static <R> foldRight(byte[] elements, initial: R, operation: (Byte, acc: R) -> R): R {
//        var index = lastIndex
//        var accumulator = initial
//        while (index >= 0) {
//            accumulator = operation(get(index--), accumulator)
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from right to left to each element and current accumulator value.
//     */
//    public static <R> foldRight(short[] elements, initial: R, operation: (Short, acc: R) -> R): R {
//        var index = lastIndex
//        var accumulator = initial
//        while (index >= 0) {
//            accumulator = operation(get(index--), accumulator)
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from right to left to each element and current accumulator value.
//     */
//    public static <R> foldRight(int[] elements, initial: R, operation: (Int, acc: R) -> R): R {
//        var index = lastIndex
//        var accumulator = initial
//        while (index >= 0) {
//            accumulator = operation(get(index--), accumulator)
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from right to left to each element and current accumulator value.
//     */
//    public static <R> foldRight(long[] elements, initial: R, operation: (Long, acc: R) -> R): R {
//        var index = lastIndex
//        var accumulator = initial
//        while (index >= 0) {
//            accumulator = operation(get(index--), accumulator)
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from right to left to each element and current accumulator value.
//     */
//    public static <R> foldRight(float[] elements, initial: R, operation: (Float, acc: R) -> R): R {
//        var index = lastIndex
//        var accumulator = initial
//        while (index >= 0) {
//            accumulator = operation(get(index--), accumulator)
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from right to left to each element and current accumulator value.
//     */
//    public static <R> foldRight(double[] elements, initial: R, operation: (Double, acc: R) -> R): R {
//        var index = lastIndex
//        var accumulator = initial
//        while (index >= 0) {
//            accumulator = operation(get(index--), accumulator)
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from right to left to each element and current accumulator value.
//     */
//    public static <R> foldRight(boolean[] elements, initial: R, operation: (Boolean, acc: R) -> R): R {
//        var index = lastIndex
//        var accumulator = initial
//        while (index >= 0) {
//            accumulator = operation(get(index--), accumulator)
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from right to left to each element and current accumulator value.
//     */
//    public static <R> foldRight(char[] elements, initial: R, operation: (Char, acc: R) -> R): R {
//        var index = lastIndex
//        var accumulator = initial
//        while (index >= 0) {
//            accumulator = operation(get(index--), accumulator)
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from right to left
//     * to each element with its index in the original array and current accumulator value.
//     * @param [operation] function that takes the index of an element, the element itself
//     * and current accumulator value, and calculates the next accumulator value.
//     */
//    public static <T, R> foldRightIndexed(@NotNull T[] elements, initial: R, operation: (index: Int, T, acc: R) -> R): R {
//        var index = lastIndex
//        var accumulator = initial
//        while (index >= 0) {
//            accumulator = operation(index, get(index), accumulator)
//                    --index
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from right to left
//     * to each element with its index in the original array and current accumulator value.
//     * @param [operation] function that takes the index of an element, the element itself
//     * and current accumulator value, and calculates the next accumulator value.
//     */
//    public static <R> foldRightIndexed(byte[] elements, initial: R, operation: (index: Int, Byte, acc: R) -> R): R {
//        var index = lastIndex
//        var accumulator = initial
//        while (index >= 0) {
//            accumulator = operation(index, get(index), accumulator)
//                    --index
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from right to left
//     * to each element with its index in the original array and current accumulator value.
//     * @param [operation] function that takes the index of an element, the element itself
//     * and current accumulator value, and calculates the next accumulator value.
//     */
//    public static <R> foldRightIndexed(short[] elements, initial: R, operation: (index: Int, Short, acc: R) -> R): R {
//        var index = lastIndex
//        var accumulator = initial
//        while (index >= 0) {
//            accumulator = operation(index, get(index), accumulator)
//                    --index
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from right to left
//     * to each element with its index in the original array and current accumulator value.
//     * @param [operation] function that takes the index of an element, the element itself
//     * and current accumulator value, and calculates the next accumulator value.
//     */
//    public static <R> foldRightIndexed(int[] elements, initial: R, operation: (index: Int, Int, acc: R) -> R): R {
//        var index = lastIndex
//        var accumulator = initial
//        while (index >= 0) {
//            accumulator = operation(index, get(index), accumulator)
//                    --index
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from right to left
//     * to each element with its index in the original array and current accumulator value.
//     * @param [operation] function that takes the index of an element, the element itself
//     * and current accumulator value, and calculates the next accumulator value.
//     */
//    public static <R> foldRightIndexed(long[] elements, initial: R, operation: (index: Int, Long, acc: R) -> R): R {
//        var index = lastIndex
//        var accumulator = initial
//        while (index >= 0) {
//            accumulator = operation(index, get(index), accumulator)
//                    --index
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from right to left
//     * to each element with its index in the original array and current accumulator value.
//     * @param [operation] function that takes the index of an element, the element itself
//     * and current accumulator value, and calculates the next accumulator value.
//     */
//    public static <R> foldRightIndexed(float[] elements, initial: R, operation: (index: Int, Float, acc: R) -> R): R {
//        var index = lastIndex
//        var accumulator = initial
//        while (index >= 0) {
//            accumulator = operation(index, get(index), accumulator)
//                    --index
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from right to left
//     * to each element with its index in the original array and current accumulator value.
//     * @param [operation] function that takes the index of an element, the element itself
//     * and current accumulator value, and calculates the next accumulator value.
//     */
//    public static <R> foldRightIndexed(double[] elements, initial: R, operation: (index: Int, Double, acc: R) -> R): R {
//        var index = lastIndex
//        var accumulator = initial
//        while (index >= 0) {
//            accumulator = operation(index, get(index), accumulator)
//                    --index
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from right to left
//     * to each element with its index in the original array and current accumulator value.
//     * @param [operation] function that takes the index of an element, the element itself
//     * and current accumulator value, and calculates the next accumulator value.
//     */
//    public static <R> foldRightIndexed(boolean[] elements, initial: R, operation: (index: Int, Boolean, acc: R) -> R): R {
//        var index = lastIndex
//        var accumulator = initial
//        while (index >= 0) {
//            accumulator = operation(index, get(index), accumulator)
//                    --index
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from right to left
//     * to each element with its index in the original array and current accumulator value.
//     * @param [operation] function that takes the index of an element, the element itself
//     * and current accumulator value, and calculates the next accumulator value.
//     */
//    public static <R> foldRightIndexed(char[] elements, initial: R, operation: (index: Int, Char, acc: R) -> R): R {
//        var index = lastIndex
//        var accumulator = initial
//        while (index >= 0) {
//            accumulator = operation(index, get(index), accumulator)
//                    --index
//        }
//        return accumulator
//    }
//
//    /**
//     * Performs the given [action] on each element.
//     */
//    public static <T> forEach(@NotNull T[] elements, action: (T) -> Unit): Unit {
//        for (element in this) action(element)
//    }
//
//    /**
//     * Performs the given [action] on each element.
//     */
//    public static forEach(byte[] elements, action: (Byte) -> Unit): Unit {
//        for (element in this) action(element)
//    }
//
//    /**
//     * Performs the given [action] on each element.
//     */
//    public static forEach(short[] elements, action: (Short) -> Unit): Unit {
//        for (element in this) action(element)
//    }
//
//    /**
//     * Performs the given [action] on each element.
//     */
//    public static forEach(int[] elements, action: (Int) -> Unit): Unit {
//        for (element in this) action(element)
//    }
//
//    /**
//     * Performs the given [action] on each element.
//     */
//    public static forEach(long[] elements, action: (Long) -> Unit): Unit {
//        for (element in this) action(element)
//    }
//
//    /**
//     * Performs the given [action] on each element.
//     */
//    public static forEach(float[] elements, action: (Float) -> Unit): Unit {
//        for (element in this) action(element)
//    }
//
//    /**
//     * Performs the given [action] on each element.
//     */
//    public static forEach(double[] elements, action: (Double) -> Unit): Unit {
//        for (element in this) action(element)
//    }
//
//    /**
//     * Performs the given [action] on each element.
//     */
//    public static forEach(boolean[] elements, action: (Boolean) -> Unit): Unit {
//        for (element in this) action(element)
//    }
//
//    /**
//     * Performs the given [action] on each element.
//     */
//    public static forEach(char[] elements, action: (Char) -> Unit): Unit {
//        for (element in this) action(element)
//    }
//
//    /**
//     * Performs the given [action] on each element, providing sequential index with the element.
//     * @param [action] function that takes the index of an element and the element itself
//     * and performs the desired action on the element.
//     */
//    public static <T> forEachIndexed(@NotNull T[] elements, action: (index: Int, T) -> Unit): Unit {
//        var index = 0
//        for (item in this) action(index++, item)
//    }
//
//    /**
//     * Performs the given [action] on each element, providing sequential index with the element.
//     * @param [action] function that takes the index of an element and the element itself
//     * and performs the desired action on the element.
//     */
//    public static forEachIndexed(byte[] elements, action: (index: Int, Byte) -> Unit): Unit {
//        var index = 0
//        for (item in this) action(index++, item)
//    }
//
//    /**
//     * Performs the given [action] on each element, providing sequential index with the element.
//     * @param [action] function that takes the index of an element and the element itself
//     * and performs the desired action on the element.
//     */
//    public static forEachIndexed(short[] elements, action: (index: Int, Short) -> Unit): Unit {
//        var index = 0
//        for (item in this) action(index++, item)
//    }
//
//    /**
//     * Performs the given [action] on each element, providing sequential index with the element.
//     * @param [action] function that takes the index of an element and the element itself
//     * and performs the desired action on the element.
//     */
//    public static forEachIndexed(int[] elements, action: (index: Int, Int) -> Unit): Unit {
//        var index = 0
//        for (item in this) action(index++, item)
//    }
//
//    /**
//     * Performs the given [action] on each element, providing sequential index with the element.
//     * @param [action] function that takes the index of an element and the element itself
//     * and performs the desired action on the element.
//     */
//    public static forEachIndexed(long[] elements, action: (index: Int, Long) -> Unit): Unit {
//        var index = 0
//        for (item in this) action(index++, item)
//    }
//
//    /**
//     * Performs the given [action] on each element, providing sequential index with the element.
//     * @param [action] function that takes the index of an element and the element itself
//     * and performs the desired action on the element.
//     */
//    public static forEachIndexed(float[] elements, action: (index: Int, Float) -> Unit): Unit {
//        var index = 0
//        for (item in this) action(index++, item)
//    }
//
//    /**
//     * Performs the given [action] on each element, providing sequential index with the element.
//     * @param [action] function that takes the index of an element and the element itself
//     * and performs the desired action on the element.
//     */
//    public static forEachIndexed(double[] elements, action: (index: Int, Double) -> Unit): Unit {
//        var index = 0
//        for (item in this) action(index++, item)
//    }
//
//    /**
//     * Performs the given [action] on each element, providing sequential index with the element.
//     * @param [action] function that takes the index of an element and the element itself
//     * and performs the desired action on the element.
//     */
//    public static forEachIndexed(boolean[] elements, action: (index: Int, Boolean) -> Unit): Unit {
//        var index = 0
//        for (item in this) action(index++, item)
//    }
//
//    /**
//     * Performs the given [action] on each element, providing sequential index with the element.
//     * @param [action] function that takes the index of an element and the element itself
//     * and performs the desired action on the element.
//     */
//    public static forEachIndexed(char[] elements, action: (index: Int, Char) -> Unit): Unit {
//        var index = 0
//        for (item in this) action(index++, item)
//    }
//
///**
// * Returns the largest element or `null` if there are no elements.
// *
// * If any of elements is `NaN` returns `NaN`.
// */
//    @SinceKotlin("1.1")
//    public fun Array<out Double>.max(): Double? {
//        if (isEmpty()) return null
//        var max = this[0]
//        if (max.isNaN()) return max
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (e.isNaN()) return e
//            if (max < e) max = e
//        }
//        return max
//    }
//
///**
// * Returns the largest element or `null` if there are no elements.
// *
// * If any of elements is `NaN` returns `NaN`.
// */
//    @SinceKotlin("1.1")
//    public fun Array<out Float>.max(): Float? {
//        if (isEmpty()) return null
//        var max = this[0]
//        if (max.isNaN()) return max
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (e.isNaN()) return e
//            if (max < e) max = e
//        }
//        return max
//    }
//
///**
// * Returns the largest element or `null` if there are no elements.
// */
//    public fun <T : Comparable<T>> max(@NotNull T[] elements, ): T? {
//        if (isEmpty()) return null
//        var max = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (max < e) max = e
//        }
//        return max
//    }
//
//    /**
//     * Returns the largest element or `null` if there are no elements.
//     */
//    public fun max(byte[] elements): Byte? {
//        if (isEmpty()) return null
//        var max = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (max < e) max = e
//        }
//        return max
//    }
//
//    /**
//     * Returns the largest element or `null` if there are no elements.
//     */
//    public fun max(short[] elements): Short? {
//        if (isEmpty()) return null
//        var max = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (max < e) max = e
//        }
//        return max
//    }
//
//    /**
//     * Returns the largest element or `null` if there are no elements.
//     */
//    public fun max(int[] elements): Int? {
//        if (isEmpty()) return null
//        var max = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (max < e) max = e
//        }
//        return max
//    }
//
//    /**
//     * Returns the largest element or `null` if there are no elements.
//     */
//    public fun max(long[] elements): Long? {
//        if (isEmpty()) return null
//        var max = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (max < e) max = e
//        }
//        return max
//    }
//
//    /**
//     * Returns the largest element or `null` if there are no elements.
//     *
//     * If any of elements is `NaN` returns `NaN`.
//     */
//    public fun max(float[] elements): Float? {
//        if (isEmpty()) return null
//        var max = this[0]
//        if (max.isNaN()) return max
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (e.isNaN()) return e
//            if (max < e) max = e
//        }
//        return max
//    }
//
//    /**
//     * Returns the largest element or `null` if there are no elements.
//     *
//     * If any of elements is `NaN` returns `NaN`.
//     */
//    public fun max(double[] elements): Double? {
//        if (isEmpty()) return null
//        var max = this[0]
//        if (max.isNaN()) return max
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (e.isNaN()) return e
//            if (max < e) max = e
//        }
//        return max
//    }
//
//    /**
//     * Returns the largest element or `null` if there are no elements.
//     */
//    public fun max(char[] elements): Char? {
//        if (isEmpty()) return null
//        var max = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (max < e) max = e
//        }
//        return max
//    }
//
//    /**
//     * Returns the first element yielding the largest value of the given function or `null` if there are no elements.
//     */
//    public static <T, R extends Comparable<R>> maxBy(@NotNull T[] elements, selector: (T) -> R): T? {
//        if (isEmpty()) return null
//        var maxElem = this[0]
//        var maxValue = selector(maxElem)
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            val v = selector(e)
//            if (maxValue < v) {
//                maxElem = e
//                maxValue = v
//            }
//        }
//        return maxElem
//    }
//
//    /**
//     * Returns the first element yielding the largest value of the given function or `null` if there are no elements.
//     */
//    public static <R extends Comparable<R>> maxBy(byte[] elements, selector: (Byte) -> R): Byte? {
//        if (isEmpty()) return null
//        var maxElem = this[0]
//        var maxValue = selector(maxElem)
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            val v = selector(e)
//            if (maxValue < v) {
//                maxElem = e
//                maxValue = v
//            }
//        }
//        return maxElem
//    }
//
//    /**
//     * Returns the first element yielding the largest value of the given function or `null` if there are no elements.
//     */
//    public static <R extends Comparable<R>> maxBy(short[] elements, selector: (Short) -> R): Short? {
//        if (isEmpty()) return null
//        var maxElem = this[0]
//        var maxValue = selector(maxElem)
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            val v = selector(e)
//            if (maxValue < v) {
//                maxElem = e
//                maxValue = v
//            }
//        }
//        return maxElem
//    }
//
//    /**
//     * Returns the first element yielding the largest value of the given function or `null` if there are no elements.
//     */
//    public static <R extends Comparable<R>> maxBy(int[] elements, selector: (Int) -> R): Int? {
//        if (isEmpty()) return null
//        var maxElem = this[0]
//        var maxValue = selector(maxElem)
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            val v = selector(e)
//            if (maxValue < v) {
//                maxElem = e
//                maxValue = v
//            }
//        }
//        return maxElem
//    }
//
//    /**
//     * Returns the first element yielding the largest value of the given function or `null` if there are no elements.
//     */
//    public static <R extends Comparable<R>> maxBy(long[] elements, selector: (Long) -> R): Long? {
//        if (isEmpty()) return null
//        var maxElem = this[0]
//        var maxValue = selector(maxElem)
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            val v = selector(e)
//            if (maxValue < v) {
//                maxElem = e
//                maxValue = v
//            }
//        }
//        return maxElem
//    }
//
//    /**
//     * Returns the first element yielding the largest value of the given function or `null` if there are no elements.
//     */
//    public static <R extends Comparable<R>> maxBy(float[] elements, selector: (Float) -> R): Float? {
//        if (isEmpty()) return null
//        var maxElem = this[0]
//        var maxValue = selector(maxElem)
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            val v = selector(e)
//            if (maxValue < v) {
//                maxElem = e
//                maxValue = v
//            }
//        }
//        return maxElem
//    }
//
//    /**
//     * Returns the first element yielding the largest value of the given function or `null` if there are no elements.
//     */
//    public static <R extends Comparable<R>> maxBy(double[] elements, selector: (Double) -> R): Double? {
//        if (isEmpty()) return null
//        var maxElem = this[0]
//        var maxValue = selector(maxElem)
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            val v = selector(e)
//            if (maxValue < v) {
//                maxElem = e
//                maxValue = v
//            }
//        }
//        return maxElem
//    }
//
//    /**
//     * Returns the first element yielding the largest value of the given function or `null` if there are no elements.
//     */
//    public static <R extends Comparable<R>> maxBy(boolean[] elements, selector: (Boolean) -> R): Boolean? {
//        if (isEmpty()) return null
//        var maxElem = this[0]
//        var maxValue = selector(maxElem)
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            val v = selector(e)
//            if (maxValue < v) {
//                maxElem = e
//                maxValue = v
//            }
//        }
//        return maxElem
//    }
//
//    /**
//     * Returns the first element yielding the largest value of the given function or `null` if there are no elements.
//     */
//    public static <R extends Comparable<R>> maxBy(char[] elements, selector: (Char) -> R): Char? {
//        if (isEmpty()) return null
//        var maxElem = this[0]
//        var maxValue = selector(maxElem)
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            val v = selector(e)
//            if (maxValue < v) {
//                maxElem = e
//                maxValue = v
//            }
//        }
//        return maxElem
//    }
//
//    /**
//     * Returns the first element having the largest value according to the provided [comparator] or `null` if there are no elements.
//     */
//    public fun <T> maxWith(@NotNull T[] elements, comparator: Comparator<in T>): T? {
//        if (isEmpty()) return null
//        var max = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (comparator.compare(max, e) < 0) max = e
//        }
//        return max
//    }
//
//    /**
//     * Returns the first element having the largest value according to the provided [comparator] or `null` if there are no elements.
//     */
//    public fun maxWith(byte[] elements, comparator: Comparator<in Byte>): Byte? {
//        if (isEmpty()) return null
//        var max = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (comparator.compare(max, e) < 0) max = e
//        }
//        return max
//    }
//
//    /**
//     * Returns the first element having the largest value according to the provided [comparator] or `null` if there are no elements.
//     */
//    public fun maxWith(short[] elements, comparator: Comparator<in Short>): Short? {
//        if (isEmpty()) return null
//        var max = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (comparator.compare(max, e) < 0) max = e
//        }
//        return max
//    }
//
//    /**
//     * Returns the first element having the largest value according to the provided [comparator] or `null` if there are no elements.
//     */
//    public fun maxWith(int[] elements, comparator: Comparator<in Int>): Int? {
//        if (isEmpty()) return null
//        var max = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (comparator.compare(max, e) < 0) max = e
//        }
//        return max
//    }
//
//    /**
//     * Returns the first element having the largest value according to the provided [comparator] or `null` if there are no elements.
//     */
//    public fun maxWith(long[] elements, comparator: Comparator<in Long>): Long? {
//        if (isEmpty()) return null
//        var max = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (comparator.compare(max, e) < 0) max = e
//        }
//        return max
//    }
//
//    /**
//     * Returns the first element having the largest value according to the provided [comparator] or `null` if there are no elements.
//     */
//    public fun maxWith(float[] elements, comparator: Comparator<in Float>): Float? {
//        if (isEmpty()) return null
//        var max = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (comparator.compare(max, e) < 0) max = e
//        }
//        return max
//    }
//
//    /**
//     * Returns the first element having the largest value according to the provided [comparator] or `null` if there are no elements.
//     */
//    public fun maxWith(double[] elements, comparator: Comparator<in Double>): Double? {
//        if (isEmpty()) return null
//        var max = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (comparator.compare(max, e) < 0) max = e
//        }
//        return max
//    }
//
//    /**
//     * Returns the first element having the largest value according to the provided [comparator] or `null` if there are no elements.
//     */
//    public fun maxWith(boolean[] elements, comparator: Comparator<in Boolean>): Boolean? {
//        if (isEmpty()) return null
//        var max = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (comparator.compare(max, e) < 0) max = e
//        }
//        return max
//    }
//
//    /**
//     * Returns the first element having the largest value according to the provided [comparator] or `null` if there are no elements.
//     */
//    public fun maxWith(char[] elements, comparator: Comparator<in Char>): Char? {
//        if (isEmpty()) return null
//        var max = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (comparator.compare(max, e) < 0) max = e
//        }
//        return max
//    }
//
///**
// * Returns the smallest element or `null` if there are no elements.
// *
// * If any of elements is `NaN` returns `NaN`.
// */
//    @SinceKotlin("1.1")
//    public fun Array<out Double>.min(): Double? {
//        if (isEmpty()) return null
//        var min = this[0]
//        if (min.isNaN()) return min
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (e.isNaN()) return e
//            if (min > e) min = e
//        }
//        return min
//    }
//
///**
// * Returns the smallest element or `null` if there are no elements.
// *
// * If any of elements is `NaN` returns `NaN`.
// */
//    @SinceKotlin("1.1")
//    public fun Array<out Float>.min(): Float? {
//        if (isEmpty()) return null
//        var min = this[0]
//        if (min.isNaN()) return min
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (e.isNaN()) return e
//            if (min > e) min = e
//        }
//        return min
//    }
//
///**
// * Returns the smallest element or `null` if there are no elements.
// */
//    public fun <T : Comparable<T>> min(@NotNull T[] elements, ): T? {
//        if (isEmpty()) return null
//        var min = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (min > e) min = e
//        }
//        return min
//    }
//
//    /**
//     * Returns the smallest element or `null` if there are no elements.
//     */
//    public fun min(byte[] elements): Byte? {
//        if (isEmpty()) return null
//        var min = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (min > e) min = e
//        }
//        return min
//    }
//
//    /**
//     * Returns the smallest element or `null` if there are no elements.
//     */
//    public fun min(short[] elements): Short? {
//        if (isEmpty()) return null
//        var min = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (min > e) min = e
//        }
//        return min
//    }
//
//    /**
//     * Returns the smallest element or `null` if there are no elements.
//     */
//    public fun min(int[] elements): Int? {
//        if (isEmpty()) return null
//        var min = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (min > e) min = e
//        }
//        return min
//    }
//
//    /**
//     * Returns the smallest element or `null` if there are no elements.
//     */
//    public fun min(long[] elements): Long? {
//        if (isEmpty()) return null
//        var min = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (min > e) min = e
//        }
//        return min
//    }
//
//    /**
//     * Returns the smallest element or `null` if there are no elements.
//     *
//     * If any of elements is `NaN` returns `NaN`.
//     */
//    public fun min(float[] elements): Float? {
//        if (isEmpty()) return null
//        var min = this[0]
//        if (min.isNaN()) return min
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (e.isNaN()) return e
//            if (min > e) min = e
//        }
//        return min
//    }
//
//    /**
//     * Returns the smallest element or `null` if there are no elements.
//     *
//     * If any of elements is `NaN` returns `NaN`.
//     */
//    public fun min(double[] elements): Double? {
//        if (isEmpty()) return null
//        var min = this[0]
//        if (min.isNaN()) return min
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (e.isNaN()) return e
//            if (min > e) min = e
//        }
//        return min
//    }
//
//    /**
//     * Returns the smallest element or `null` if there are no elements.
//     */
//    public fun min(char[] elements): Char? {
//        if (isEmpty()) return null
//        var min = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (min > e) min = e
//        }
//        return min
//    }
//
//    /**
//     * Returns the first element yielding the smallest value of the given function or `null` if there are no elements.
//     */
//    public static <T, R extends Comparable<R>> minBy(@NotNull T[] elements, selector: (T) -> R): T? {
//        if (isEmpty()) return null
//        var minElem = this[0]
//        var minValue = selector(minElem)
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            val v = selector(e)
//            if (minValue > v) {
//                minElem = e
//                minValue = v
//            }
//        }
//        return minElem
//    }
//
//    /**
//     * Returns the first element yielding the smallest value of the given function or `null` if there are no elements.
//     */
//    public static <R extends Comparable<R>> minBy(byte[] elements, selector: (Byte) -> R): Byte? {
//        if (isEmpty()) return null
//        var minElem = this[0]
//        var minValue = selector(minElem)
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            val v = selector(e)
//            if (minValue > v) {
//                minElem = e
//                minValue = v
//            }
//        }
//        return minElem
//    }
//
//    /**
//     * Returns the first element yielding the smallest value of the given function or `null` if there are no elements.
//     */
//    public static <R extends Comparable<R>> minBy(short[] elements, selector: (Short) -> R): Short? {
//        if (isEmpty()) return null
//        var minElem = this[0]
//        var minValue = selector(minElem)
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            val v = selector(e)
//            if (minValue > v) {
//                minElem = e
//                minValue = v
//            }
//        }
//        return minElem
//    }
//
//    /**
//     * Returns the first element yielding the smallest value of the given function or `null` if there are no elements.
//     */
//    public static <R extends Comparable<R>> minBy(int[] elements, selector: (Int) -> R): Int? {
//        if (isEmpty()) return null
//        var minElem = this[0]
//        var minValue = selector(minElem)
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            val v = selector(e)
//            if (minValue > v) {
//                minElem = e
//                minValue = v
//            }
//        }
//        return minElem
//    }
//
//    /**
//     * Returns the first element yielding the smallest value of the given function or `null` if there are no elements.
//     */
//    public static <R extends Comparable<R>> minBy(long[] elements, selector: (Long) -> R): Long? {
//        if (isEmpty()) return null
//        var minElem = this[0]
//        var minValue = selector(minElem)
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            val v = selector(e)
//            if (minValue > v) {
//                minElem = e
//                minValue = v
//            }
//        }
//        return minElem
//    }
//
//    /**
//     * Returns the first element yielding the smallest value of the given function or `null` if there are no elements.
//     */
//    public static <R extends Comparable<R>> minBy(float[] elements, selector: (Float) -> R): Float? {
//        if (isEmpty()) return null
//        var minElem = this[0]
//        var minValue = selector(minElem)
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            val v = selector(e)
//            if (minValue > v) {
//                minElem = e
//                minValue = v
//            }
//        }
//        return minElem
//    }
//
//    /**
//     * Returns the first element yielding the smallest value of the given function or `null` if there are no elements.
//     */
//    public static <R extends Comparable<R>> minBy(double[] elements, selector: (Double) -> R): Double? {
//        if (isEmpty()) return null
//        var minElem = this[0]
//        var minValue = selector(minElem)
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            val v = selector(e)
//            if (minValue > v) {
//                minElem = e
//                minValue = v
//            }
//        }
//        return minElem
//    }
//
//    /**
//     * Returns the first element yielding the smallest value of the given function or `null` if there are no elements.
//     */
//    public static <R extends Comparable<R>> minBy(boolean[] elements, selector: (Boolean) -> R): Boolean? {
//        if (isEmpty()) return null
//        var minElem = this[0]
//        var minValue = selector(minElem)
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            val v = selector(e)
//            if (minValue > v) {
//                minElem = e
//                minValue = v
//            }
//        }
//        return minElem
//    }
//
//    /**
//     * Returns the first element yielding the smallest value of the given function or `null` if there are no elements.
//     */
//    public static <R extends Comparable<R>> minBy(char[] elements, selector: (Char) -> R): Char? {
//        if (isEmpty()) return null
//        var minElem = this[0]
//        var minValue = selector(minElem)
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            val v = selector(e)
//            if (minValue > v) {
//                minElem = e
//                minValue = v
//            }
//        }
//        return minElem
//    }
//
//    /**
//     * Returns the first element having the smallest value according to the provided [comparator] or `null` if there are no elements.
//     */
//    public fun <T> minWith(@NotNull T[] elements, comparator: Comparator<in T>): T? {
//        if (isEmpty()) return null
//        var min = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (comparator.compare(min, e) > 0) min = e
//        }
//        return min
//    }
//
//    /**
//     * Returns the first element having the smallest value according to the provided [comparator] or `null` if there are no elements.
//     */
//    public fun minWith(byte[] elements, comparator: Comparator<in Byte>): Byte? {
//        if (isEmpty()) return null
//        var min = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (comparator.compare(min, e) > 0) min = e
//        }
//        return min
//    }
//
//    /**
//     * Returns the first element having the smallest value according to the provided [comparator] or `null` if there are no elements.
//     */
//    public fun minWith(short[] elements, comparator: Comparator<in Short>): Short? {
//        if (isEmpty()) return null
//        var min = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (comparator.compare(min, e) > 0) min = e
//        }
//        return min
//    }
//
//    /**
//     * Returns the first element having the smallest value according to the provided [comparator] or `null` if there are no elements.
//     */
//    public fun minWith(int[] elements, comparator: Comparator<in Int>): Int? {
//        if (isEmpty()) return null
//        var min = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (comparator.compare(min, e) > 0) min = e
//        }
//        return min
//    }
//
//    /**
//     * Returns the first element having the smallest value according to the provided [comparator] or `null` if there are no elements.
//     */
//    public fun minWith(long[] elements, comparator: Comparator<in Long>): Long? {
//        if (isEmpty()) return null
//        var min = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (comparator.compare(min, e) > 0) min = e
//        }
//        return min
//    }
//
//    /**
//     * Returns the first element having the smallest value according to the provided [comparator] or `null` if there are no elements.
//     */
//    public fun minWith(float[] elements, comparator: Comparator<in Float>): Float? {
//        if (isEmpty()) return null
//        var min = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (comparator.compare(min, e) > 0) min = e
//        }
//        return min
//    }
//
//    /**
//     * Returns the first element having the smallest value according to the provided [comparator] or `null` if there are no elements.
//     */
//    public fun minWith(double[] elements, comparator: Comparator<in Double>): Double? {
//        if (isEmpty()) return null
//        var min = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (comparator.compare(min, e) > 0) min = e
//        }
//        return min
//    }
//
//    /**
//     * Returns the first element having the smallest value according to the provided [comparator] or `null` if there are no elements.
//     */
//    public fun minWith(boolean[] elements, comparator: Comparator<in Boolean>): Boolean? {
//        if (isEmpty()) return null
//        var min = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (comparator.compare(min, e) > 0) min = e
//        }
//        return min
//    }
//
//    /**
//     * Returns the first element having the smallest value according to the provided [comparator] or `null` if there are no elements.
//     */
//    public fun minWith(char[] elements, comparator: Comparator<in Char>): Char? {
//        if (isEmpty()) return null
//        var min = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (comparator.compare(min, e) > 0) min = e
//        }
//        return min
//    }
//
//    /**
//     * Returns `true` if the array has no elements.
//     */
//    public fun <T> none(@NotNull T[] elements, ): Boolean {
//        return isEmpty()
//    }
//
//    /**
//     * Returns `true` if the array has no elements.
//     */
//    public fun none(byte[] elements): Boolean {
//        return isEmpty()
//    }
//
//    /**
//     * Returns `true` if the array has no elements.
//     */
//    public fun none(short[] elements): Boolean {
//        return isEmpty()
//    }
//
//    /**
//     * Returns `true` if the array has no elements.
//     */
//    public fun none(int[] elements): Boolean {
//        return isEmpty()
//    }
//
//    /**
//     * Returns `true` if the array has no elements.
//     */
//    public fun none(long[] elements): Boolean {
//        return isEmpty()
//    }
//
//    /**
//     * Returns `true` if the array has no elements.
//     */
//    public fun none(float[] elements): Boolean {
//        return isEmpty()
//    }
//
//    /**
//     * Returns `true` if the array has no elements.
//     */
//    public fun none(double[] elements): Boolean {
//        return isEmpty()
//    }
//
//    /**
//     * Returns `true` if the array has no elements.
//     */
//    public fun none(boolean[] elements): Boolean {
//        return isEmpty()
//    }
//
//    /**
//     * Returns `true` if the array has no elements.
//     */
//    public fun none(char[] elements): Boolean {
//        return isEmpty()
//    }
//
//    /**
//     * Returns `true` if no elements match the given [predicate].
//     */
//    public static <T> none(@NotNull T[] elements, predicate: (T) -> Boolean): Boolean {
//        for (element in this) if (predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if no elements match the given [predicate].
//     */
//    public static none(byte[] elements, predicate: (Byte) -> Boolean): Boolean {
//        for (element in this) if (predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if no elements match the given [predicate].
//     */
//    public static none(short[] elements, predicate: (Short) -> Boolean): Boolean {
//        for (element in this) if (predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if no elements match the given [predicate].
//     */
//    public static none(int[] elements, predicate: (Int) -> Boolean): Boolean {
//        for (element in this) if (predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if no elements match the given [predicate].
//     */
//    public static none(long[] elements, predicate: (Long) -> Boolean): Boolean {
//        for (element in this) if (predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if no elements match the given [predicate].
//     */
//    public static none(float[] elements, predicate: (Float) -> Boolean): Boolean {
//        for (element in this) if (predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if no elements match the given [predicate].
//     */
//    public static none(double[] elements, predicate: (Double) -> Boolean): Boolean {
//        for (element in this) if (predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if no elements match the given [predicate].
//     */
//    public static none(boolean[] elements, predicate: (Boolean) -> Boolean): Boolean {
//        for (element in this) if (predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if no elements match the given [predicate].
//     */
//    public static none(char[] elements, predicate: (Char) -> Boolean): Boolean {
//        for (element in this) if (predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Accumulates value starting with the first element and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public static <S, T: S> reduce(@NotNull T[] elements, operation: (acc: S, T) -> S): S {
//        if (isEmpty())
//            throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator: S = this[0]
//        for (index in 1..lastIndex) {
//            accumulator = operation(accumulator, this[index])
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with the first element and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public static reduce(byte[] elements, operation: (acc: Byte, Byte) -> Byte): Byte {
//        if (isEmpty())
//            throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = this[0]
//        for (index in 1..lastIndex) {
//            accumulator = operation(accumulator, this[index])
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with the first element and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public static reduce(short[] elements, operation: (acc: Short, Short) -> Short): Short {
//        if (isEmpty())
//            throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = this[0]
//        for (index in 1..lastIndex) {
//            accumulator = operation(accumulator, this[index])
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with the first element and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public static reduce(int[] elements, operation: (acc: Int, Int) -> Int): Int {
//        if (isEmpty())
//            throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = this[0]
//        for (index in 1..lastIndex) {
//            accumulator = operation(accumulator, this[index])
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with the first element and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public static reduce(long[] elements, operation: (acc: Long, Long) -> Long): Long {
//        if (isEmpty())
//            throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = this[0]
//        for (index in 1..lastIndex) {
//            accumulator = operation(accumulator, this[index])
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with the first element and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public static reduce(float[] elements, operation: (acc: Float, Float) -> Float): Float {
//        if (isEmpty())
//            throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = this[0]
//        for (index in 1..lastIndex) {
//            accumulator = operation(accumulator, this[index])
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with the first element and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public static reduce(double[] elements, operation: (acc: Double, Double) -> Double): Double {
//        if (isEmpty())
//            throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = this[0]
//        for (index in 1..lastIndex) {
//            accumulator = operation(accumulator, this[index])
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with the first element and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public static reduce(boolean[] elements, operation: (acc: Boolean, Boolean) -> Boolean): Boolean {
//        if (isEmpty())
//            throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = this[0]
//        for (index in 1..lastIndex) {
//            accumulator = operation(accumulator, this[index])
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with the first element and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public static reduce(char[] elements, operation: (acc: Char, Char) -> Char): Char {
//        if (isEmpty())
//            throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = this[0]
//        for (index in 1..lastIndex) {
//            accumulator = operation(accumulator, this[index])
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with the first element and applying [operation] from left to right
//     * to current accumulator value and each element with its index in the original array.
//     * @param [operation] function that takes the index of an element, current accumulator value
//     * and the element itself and calculates the next accumulator value.
//     */
//    public static <S, T: S> reduceIndexed(@NotNull T[] elements, operation: (index: Int, acc: S, T) -> S): S {
//        if (isEmpty())
//            throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator: S = this[0]
//        for (index in 1..lastIndex) {
//            accumulator = operation(index, accumulator, this[index])
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with the first element and applying [operation] from left to right
//     * to current accumulator value and each element with its index in the original array.
//     * @param [operation] function that takes the index of an element, current accumulator value
//     * and the element itself and calculates the next accumulator value.
//     */
//    public static reduceIndexed(byte[] elements, operation: (index: Int, acc: Byte, Byte) -> Byte): Byte {
//        if (isEmpty())
//            throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = this[0]
//        for (index in 1..lastIndex) {
//            accumulator = operation(index, accumulator, this[index])
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with the first element and applying [operation] from left to right
//     * to current accumulator value and each element with its index in the original array.
//     * @param [operation] function that takes the index of an element, current accumulator value
//     * and the element itself and calculates the next accumulator value.
//     */
//    public static reduceIndexed(short[] elements, operation: (index: Int, acc: Short, Short) -> Short): Short {
//        if (isEmpty())
//            throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = this[0]
//        for (index in 1..lastIndex) {
//            accumulator = operation(index, accumulator, this[index])
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with the first element and applying [operation] from left to right
//     * to current accumulator value and each element with its index in the original array.
//     * @param [operation] function that takes the index of an element, current accumulator value
//     * and the element itself and calculates the next accumulator value.
//     */
//    public static reduceIndexed(int[] elements, operation: (index: Int, acc: Int, Int) -> Int): Int {
//        if (isEmpty())
//            throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = this[0]
//        for (index in 1..lastIndex) {
//            accumulator = operation(index, accumulator, this[index])
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with the first element and applying [operation] from left to right
//     * to current accumulator value and each element with its index in the original array.
//     * @param [operation] function that takes the index of an element, current accumulator value
//     * and the element itself and calculates the next accumulator value.
//     */
//    public static reduceIndexed(long[] elements, operation: (index: Int, acc: Long, Long) -> Long): Long {
//        if (isEmpty())
//            throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = this[0]
//        for (index in 1..lastIndex) {
//            accumulator = operation(index, accumulator, this[index])
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with the first element and applying [operation] from left to right
//     * to current accumulator value and each element with its index in the original array.
//     * @param [operation] function that takes the index of an element, current accumulator value
//     * and the element itself and calculates the next accumulator value.
//     */
//    public static reduceIndexed(float[] elements, operation: (index: Int, acc: Float, Float) -> Float): Float {
//        if (isEmpty())
//            throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = this[0]
//        for (index in 1..lastIndex) {
//            accumulator = operation(index, accumulator, this[index])
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with the first element and applying [operation] from left to right
//     * to current accumulator value and each element with its index in the original array.
//     * @param [operation] function that takes the index of an element, current accumulator value
//     * and the element itself and calculates the next accumulator value.
//     */
//    public static reduceIndexed(double[] elements, operation: (index: Int, acc: Double, Double) -> Double): Double {
//        if (isEmpty())
//            throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = this[0]
//        for (index in 1..lastIndex) {
//            accumulator = operation(index, accumulator, this[index])
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with the first element and applying [operation] from left to right
//     * to current accumulator value and each element with its index in the original array.
//     * @param [operation] function that takes the index of an element, current accumulator value
//     * and the element itself and calculates the next accumulator value.
//     */
//    public static reduceIndexed(boolean[] elements, operation: (index: Int, acc: Boolean, Boolean) -> Boolean): Boolean {
//        if (isEmpty())
//            throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = this[0]
//        for (index in 1..lastIndex) {
//            accumulator = operation(index, accumulator, this[index])
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with the first element and applying [operation] from left to right
//     * to current accumulator value and each element with its index in the original array.
//     * @param [operation] function that takes the index of an element, current accumulator value
//     * and the element itself and calculates the next accumulator value.
//     */
//    public static reduceIndexed(char[] elements, operation: (index: Int, acc: Char, Char) -> Char): Char {
//        if (isEmpty())
//            throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = this[0]
//        for (index in 1..lastIndex) {
//            accumulator = operation(index, accumulator, this[index])
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with last element and applying [operation] from right to left to each element and current accumulator value.
//     */
//    public static <S, T: S> reduceRight(@NotNull T[] elements, operation: (T, acc: S) -> S): S {
//        var index = lastIndex
//        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator: S = get(index--)
//        while (index >= 0) {
//            accumulator = operation(get(index--), accumulator)
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with last element and applying [operation] from right to left to each element and current accumulator value.
//     */
//    public static reduceRight(byte[] elements, operation: (Byte, acc: Byte) -> Byte): Byte {
//        var index = lastIndex
//        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = get(index--)
//        while (index >= 0) {
//            accumulator = operation(get(index--), accumulator)
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with last element and applying [operation] from right to left to each element and current accumulator value.
//     */
//    public static reduceRight(short[] elements, operation: (Short, acc: Short) -> Short): Short {
//        var index = lastIndex
//        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = get(index--)
//        while (index >= 0) {
//            accumulator = operation(get(index--), accumulator)
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with last element and applying [operation] from right to left to each element and current accumulator value.
//     */
//    public static reduceRight(int[] elements, operation: (Int, acc: Int) -> Int): Int {
//        var index = lastIndex
//        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = get(index--)
//        while (index >= 0) {
//            accumulator = operation(get(index--), accumulator)
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with last element and applying [operation] from right to left to each element and current accumulator value.
//     */
//    public static reduceRight(long[] elements, operation: (Long, acc: Long) -> Long): Long {
//        var index = lastIndex
//        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = get(index--)
//        while (index >= 0) {
//            accumulator = operation(get(index--), accumulator)
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with last element and applying [operation] from right to left to each element and current accumulator value.
//     */
//    public static reduceRight(float[] elements, operation: (Float, acc: Float) -> Float): Float {
//        var index = lastIndex
//        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = get(index--)
//        while (index >= 0) {
//            accumulator = operation(get(index--), accumulator)
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with last element and applying [operation] from right to left to each element and current accumulator value.
//     */
//    public static reduceRight(double[] elements, operation: (Double, acc: Double) -> Double): Double {
//        var index = lastIndex
//        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = get(index--)
//        while (index >= 0) {
//            accumulator = operation(get(index--), accumulator)
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with last element and applying [operation] from right to left to each element and current accumulator value.
//     */
//    public static reduceRight(boolean[] elements, operation: (Boolean, acc: Boolean) -> Boolean): Boolean {
//        var index = lastIndex
//        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = get(index--)
//        while (index >= 0) {
//            accumulator = operation(get(index--), accumulator)
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with last element and applying [operation] from right to left to each element and current accumulator value.
//     */
//    public static reduceRight(char[] elements, operation: (Char, acc: Char) -> Char): Char {
//        var index = lastIndex
//        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = get(index--)
//        while (index >= 0) {
//            accumulator = operation(get(index--), accumulator)
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with last element and applying [operation] from right to left
//     * to each element with its index in the original array and current accumulator value.
//     * @param [operation] function that takes the index of an element, the element itself
//     * and current accumulator value, and calculates the next accumulator value.
//     */
//    public static <S, T: S> reduceRightIndexed(@NotNull T[] elements, operation: (index: Int, T, acc: S) -> S): S {
//        var index = lastIndex
//        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator: S = get(index--)
//        while (index >= 0) {
//            accumulator = operation(index, get(index), accumulator)
//                    --index
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with last element and applying [operation] from right to left
//     * to each element with its index in the original array and current accumulator value.
//     * @param [operation] function that takes the index of an element, the element itself
//     * and current accumulator value, and calculates the next accumulator value.
//     */
//    public static reduceRightIndexed(byte[] elements, operation: (index: Int, Byte, acc: Byte) -> Byte): Byte {
//        var index = lastIndex
//        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = get(index--)
//        while (index >= 0) {
//            accumulator = operation(index, get(index), accumulator)
//                    --index
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with last element and applying [operation] from right to left
//     * to each element with its index in the original array and current accumulator value.
//     * @param [operation] function that takes the index of an element, the element itself
//     * and current accumulator value, and calculates the next accumulator value.
//     */
//    public static reduceRightIndexed(short[] elements, operation: (index: Int, Short, acc: Short) -> Short): Short {
//        var index = lastIndex
//        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = get(index--)
//        while (index >= 0) {
//            accumulator = operation(index, get(index), accumulator)
//                    --index
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with last element and applying [operation] from right to left
//     * to each element with its index in the original array and current accumulator value.
//     * @param [operation] function that takes the index of an element, the element itself
//     * and current accumulator value, and calculates the next accumulator value.
//     */
//    public static reduceRightIndexed(int[] elements, operation: (index: Int, Int, acc: Int) -> Int): Int {
//        var index = lastIndex
//        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = get(index--)
//        while (index >= 0) {
//            accumulator = operation(index, get(index), accumulator)
//                    --index
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with last element and applying [operation] from right to left
//     * to each element with its index in the original array and current accumulator value.
//     * @param [operation] function that takes the index of an element, the element itself
//     * and current accumulator value, and calculates the next accumulator value.
//     */
//    public static reduceRightIndexed(long[] elements, operation: (index: Int, Long, acc: Long) -> Long): Long {
//        var index = lastIndex
//        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = get(index--)
//        while (index >= 0) {
//            accumulator = operation(index, get(index), accumulator)
//                    --index
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with last element and applying [operation] from right to left
//     * to each element with its index in the original array and current accumulator value.
//     * @param [operation] function that takes the index of an element, the element itself
//     * and current accumulator value, and calculates the next accumulator value.
//     */
//    public static reduceRightIndexed(float[] elements, operation: (index: Int, Float, acc: Float) -> Float): Float {
//        var index = lastIndex
//        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = get(index--)
//        while (index >= 0) {
//            accumulator = operation(index, get(index), accumulator)
//                    --index
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with last element and applying [operation] from right to left
//     * to each element with its index in the original array and current accumulator value.
//     * @param [operation] function that takes the index of an element, the element itself
//     * and current accumulator value, and calculates the next accumulator value.
//     */
//    public static reduceRightIndexed(double[] elements, operation: (index: Int, Double, acc: Double) -> Double): Double {
//        var index = lastIndex
//        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = get(index--)
//        while (index >= 0) {
//            accumulator = operation(index, get(index), accumulator)
//                    --index
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with last element and applying [operation] from right to left
//     * to each element with its index in the original array and current accumulator value.
//     * @param [operation] function that takes the index of an element, the element itself
//     * and current accumulator value, and calculates the next accumulator value.
//     */
//    public static reduceRightIndexed(boolean[] elements, operation: (index: Int, Boolean, acc: Boolean) -> Boolean): Boolean {
//        var index = lastIndex
//        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = get(index--)
//        while (index >= 0) {
//            accumulator = operation(index, get(index), accumulator)
//                    --index
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with last element and applying [operation] from right to left
//     * to each element with its index in the original array and current accumulator value.
//     * @param [operation] function that takes the index of an element, the element itself
//     * and current accumulator value, and calculates the next accumulator value.
//     */
//    public static reduceRightIndexed(char[] elements, operation: (index: Int, Char, acc: Char) -> Char): Char {
//        var index = lastIndex
//        if (index < 0) throw UnsupportedOperationException("Empty array can't be reduced.")
//        var accumulator = get(index--)
//        while (index >= 0) {
//            accumulator = operation(index, get(index), accumulator)
//                    --index
//        }
//        return accumulator
//    }
//
//
//    /**
//     * Returns the sum of all values produced by [selector] function applied to each element in the array.
//     */
//    public static <T> sumBy(@NotNull T[] elements, selector: (T) -> Int): Int {
//        var sum: Int = 0
//        for (element in this) {
//            sum += selector(element)
//        }
//        return sum
//    }
//
//    /**
//     * Returns the sum of all values produced by [selector] function applied to each element in the array.
//     */
//    public static sumBy(byte[] elements, selector: (Byte) -> Int): Int {
//        var sum: Int = 0
//        for (element in this) {
//            sum += selector(element)
//        }
//        return sum
//    }
//
//    /**
//     * Returns the sum of all values produced by [selector] function applied to each element in the array.
//     */
//    public static sumBy(short[] elements, selector: (Short) -> Int): Int {
//        var sum: Int = 0
//        for (element in this) {
//            sum += selector(element)
//        }
//        return sum
//    }
//
//    /**
//     * Returns the sum of all values produced by [selector] function applied to each element in the array.
//     */
//    public static sumBy(int[] elements, selector: (Int) -> Int): Int {
//        var sum: Int = 0
//        for (element in this) {
//            sum += selector(element)
//        }
//        return sum
//    }
//
//    /**
//     * Returns the sum of all values produced by [selector] function applied to each element in the array.
//     */
//    public static sumBy(long[] elements, selector: (Long) -> Int): Int {
//        var sum: Int = 0
//        for (element in this) {
//            sum += selector(element)
//        }
//        return sum
//    }
//
//    /**
//     * Returns the sum of all values produced by [selector] function applied to each element in the array.
//     */
//    public static sumBy(float[] elements, selector: (Float) -> Int): Int {
//        var sum: Int = 0
//        for (element in this) {
//            sum += selector(element)
//        }
//        return sum
//    }
//
//    /**
//     * Returns the sum of all values produced by [selector] function applied to each element in the array.
//     */
//    public static sumBy(double[] elements, selector: (Double) -> Int): Int {
//        var sum: Int = 0
//        for (element in this) {
//            sum += selector(element)
//        }
//        return sum
//    }
//
//    /**
//     * Returns the sum of all values produced by [selector] function applied to each element in the array.
//     */
//    public static sumBy(boolean[] elements, selector: (Boolean) -> Int): Int {
//        var sum: Int = 0
//        for (element in this) {
//            sum += selector(element)
//        }
//        return sum
//    }
//
//    /**
//     * Returns the sum of all values produced by [selector] function applied to each element in the array.
//     */
//    public static sumBy(char[] elements, selector: (Char) -> Int): Int {
//        var sum: Int = 0
//        for (element in this) {
//            sum += selector(element)
//        }
//        return sum
//    }
//
//    /**
//     * Returns the sum of all values produced by [selector] function applied to each element in the array.
//     */
//    public static <T> sumByDouble(@NotNull T[] elements, selector: (T) -> Double): Double {
//        var sum: Double = 0.0
//        for (element in this) {
//            sum += selector(element)
//        }
//        return sum
//    }
//
//    /**
//     * Returns the sum of all values produced by [selector] function applied to each element in the array.
//     */
//    public static sumByDouble(byte[] elements, selector: (Byte) -> Double): Double {
//        var sum: Double = 0.0
//        for (element in this) {
//            sum += selector(element)
//        }
//        return sum
//    }
//
//    /**
//     * Returns the sum of all values produced by [selector] function applied to each element in the array.
//     */
//    public static sumByDouble(short[] elements, selector: (Short) -> Double): Double {
//        var sum: Double = 0.0
//        for (element in this) {
//            sum += selector(element)
//        }
//        return sum
//    }
//
//    /**
//     * Returns the sum of all values produced by [selector] function applied to each element in the array.
//     */
//    public static sumByDouble(int[] elements, selector: (Int) -> Double): Double {
//        var sum: Double = 0.0
//        for (element in this) {
//            sum += selector(element)
//        }
//        return sum
//    }
//
//    /**
//     * Returns the sum of all values produced by [selector] function applied to each element in the array.
//     */
//    public static sumByDouble(long[] elements, selector: (Long) -> Double): Double {
//        var sum: Double = 0.0
//        for (element in this) {
//            sum += selector(element)
//        }
//        return sum
//    }
//
//    /**
//     * Returns the sum of all values produced by [selector] function applied to each element in the array.
//     */
//    public static sumByDouble(float[] elements, selector: (Float) -> Double): Double {
//        var sum: Double = 0.0
//        for (element in this) {
//            sum += selector(element)
//        }
//        return sum
//    }
//
//    /**
//     * Returns the sum of all values produced by [selector] function applied to each element in the array.
//     */
//    public static sumByDouble(double[] elements, selector: (Double) -> Double): Double {
//        var sum: Double = 0.0
//        for (element in this) {
//            sum += selector(element)
//        }
//        return sum
//    }
//
//    /**
//     * Returns the sum of all values produced by [selector] function applied to each element in the array.
//     */
//    public static sumByDouble(boolean[] elements, selector: (Boolean) -> Double): Double {
//        var sum: Double = 0.0
//        for (element in this) {
//            sum += selector(element)
//        }
//        return sum
//    }
//
//    /**
//     * Returns the sum of all values produced by [selector] function applied to each element in the array.
//     */
//    public static sumByDouble(char[] elements, selector: (Char) -> Double): Double {
//        var sum: Double = 0.0
//        for (element in this) {
//            sum += selector(element)
//        }
//        return sum
//    }
//
///**
// * Returns an original collection containing all the non-`null` elements, throwing an [IllegalArgumentException] if there are any `null` elements.
// */
//    public fun <T : Object> Array<T?>.requireNoNulls(): Array<T> {
//        for (element in this) {
//            if (element == null) {
//                throw IllegalArgumentException("null element found in $this.")
//            }
//        }
//        @Suppress("UNCHECKED_CAST")
//        return this as Array<T>
//    }
//
//    /**
//     * Splits the original array into pair of lists,
//     * where *first* list contains elements for which [predicate] yielded `true`,
//     * while *second* list contains elements for which [predicate] yielded `false`.
//     */
//    public static <T> partition(@NotNull T[] elements, predicate: (T) -> Boolean): Pair<List<T>, List<T>> {
//        val first = ArrayList<T>()
//        val second = ArrayList<T>()
//        for (element in this) {
//            if (predicate(element)) {
//                first.add(element)
//            } else {
//                second.add(element)
//            }
//        }
//        return Pair(first, second)
//    }
//
//    /**
//     * Splits the original array into pair of lists,
//     * where *first* list contains elements for which [predicate] yielded `true`,
//     * while *second* list contains elements for which [predicate] yielded `false`.
//     */
//    public static partition(byte[] elements, predicate: (Byte) -> Boolean): Pair<List<Byte>, List<Byte>> {
//        val first = ArrayList<Byte>()
//        val second = ArrayList<Byte>()
//        for (element in this) {
//            if (predicate(element)) {
//                first.add(element)
//            } else {
//                second.add(element)
//            }
//        }
//        return Pair(first, second)
//    }
//
//    /**
//     * Splits the original array into pair of lists,
//     * where *first* list contains elements for which [predicate] yielded `true`,
//     * while *second* list contains elements for which [predicate] yielded `false`.
//     */
//    public static partition(short[] elements, predicate: (Short) -> Boolean): Pair<List<Short>, List<Short>> {
//        val first = ArrayList<Short>()
//        val second = ArrayList<Short>()
//        for (element in this) {
//            if (predicate(element)) {
//                first.add(element)
//            } else {
//                second.add(element)
//            }
//        }
//        return Pair(first, second)
//    }
//
//    /**
//     * Splits the original array into pair of lists,
//     * where *first* list contains elements for which [predicate] yielded `true`,
//     * while *second* list contains elements for which [predicate] yielded `false`.
//     */
//    public static partition(int[] elements, predicate: (Int) -> Boolean): Pair<List<Int>, List<Int>> {
//        val first = ArrayList<Int>()
//        val second = ArrayList<Int>()
//        for (element in this) {
//            if (predicate(element)) {
//                first.add(element)
//            } else {
//                second.add(element)
//            }
//        }
//        return Pair(first, second)
//    }
//
//    /**
//     * Splits the original array into pair of lists,
//     * where *first* list contains elements for which [predicate] yielded `true`,
//     * while *second* list contains elements for which [predicate] yielded `false`.
//     */
//    public static partition(long[] elements, predicate: (Long) -> Boolean): Pair<List<Long>, List<Long>> {
//        val first = ArrayList<Long>()
//        val second = ArrayList<Long>()
//        for (element in this) {
//            if (predicate(element)) {
//                first.add(element)
//            } else {
//                second.add(element)
//            }
//        }
//        return Pair(first, second)
//    }
//
//    /**
//     * Splits the original array into pair of lists,
//     * where *first* list contains elements for which [predicate] yielded `true`,
//     * while *second* list contains elements for which [predicate] yielded `false`.
//     */
//    public static partition(float[] elements, predicate: (Float) -> Boolean): Pair<List<Float>, List<Float>> {
//        val first = ArrayList<Float>()
//        val second = ArrayList<Float>()
//        for (element in this) {
//            if (predicate(element)) {
//                first.add(element)
//            } else {
//                second.add(element)
//            }
//        }
//        return Pair(first, second)
//    }
//
//    /**
//     * Splits the original array into pair of lists,
//     * where *first* list contains elements for which [predicate] yielded `true`,
//     * while *second* list contains elements for which [predicate] yielded `false`.
//     */
//    public static partition(double[] elements, predicate: (Double) -> Boolean): Pair<List<Double>, List<Double>> {
//        val first = ArrayList<Double>()
//        val second = ArrayList<Double>()
//        for (element in this) {
//            if (predicate(element)) {
//                first.add(element)
//            } else {
//                second.add(element)
//            }
//        }
//        return Pair(first, second)
//    }
//
//    /**
//     * Splits the original array into pair of lists,
//     * where *first* list contains elements for which [predicate] yielded `true`,
//     * while *second* list contains elements for which [predicate] yielded `false`.
//     */
//    public static partition(boolean[] elements, predicate: (Boolean) -> Boolean): Pair<List<Boolean>, List<Boolean>> {
//        val first = ArrayList<Boolean>()
//        val second = ArrayList<Boolean>()
//        for (element in this) {
//            if (predicate(element)) {
//                first.add(element)
//            } else {
//                second.add(element)
//            }
//        }
//        return Pair(first, second)
//    }
//
//    /**
//     * Splits the original array into pair of lists,
//     * where *first* list contains elements for which [predicate] yielded `true`,
//     * while *second* list contains elements for which [predicate] yielded `false`.
//     */
//    public static partition(char[] elements, predicate: (Char) -> Boolean): Pair<List<Character>, List<Character>> {
//        val first = ArrayList<Character>()
//        val second = ArrayList<Character>()
//        for (element in this) {
//            if (predicate(element)) {
//                first.add(element)
//            } else {
//                second.add(element)
//            }
//        }
//        return Pair(first, second)
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <T, R> zip(@NotNull T[] elements, other: Array<out R>): List<Pair<T, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> zip(byte[] elements, other: Array<out R>): List<Pair<Byte, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> zip(short[] elements, other: Array<out R>): List<Pair<Short, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> zip(int[] elements, other: Array<out R>): List<Pair<Int, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> zip(long[] elements, other: Array<out R>): List<Pair<Long, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> zip(float[] elements, other: Array<out R>): List<Pair<Float, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> zip(double[] elements, other: Array<out R>): List<Pair<Double, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> zip(boolean[] elements, other: Array<out R>): List<Pair<Boolean, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> zip(char[] elements, other: Array<out R>): List<Pair<Char, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public static <T, R, V> zip(@NotNull T[] elements, other: Array<out R>, transform: (a: T, b: R) -> V): List<V> {
//        val size = minOf(size, other.size)
//        val list = ArrayList<V>(size)
//        for (i in 0 until size) {
//            list.add(transform(this[i], other[i]))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public static <R, V> zip(byte[] elements, other: Array<out R>, transform: (a: Byte, b: R) -> V): List<V> {
//        val size = minOf(size, other.size)
//        val list = ArrayList<V>(size)
//        for (i in 0 until size) {
//            list.add(transform(this[i], other[i]))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public static <R, V> zip(short[] elements, other: Array<out R>, transform: (a: Short, b: R) -> V): List<V> {
//        val size = minOf(size, other.size)
//        val list = ArrayList<V>(size)
//        for (i in 0 until size) {
//            list.add(transform(this[i], other[i]))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public static <R, V> zip(int[] elements, other: Array<out R>, transform: (a: Int, b: R) -> V): List<V> {
//        val size = minOf(size, other.size)
//        val list = ArrayList<V>(size)
//        for (i in 0 until size) {
//            list.add(transform(this[i], other[i]))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public static <R, V> zip(long[] elements, other: Array<out R>, transform: (a: Long, b: R) -> V): List<V> {
//        val size = minOf(size, other.size)
//        val list = ArrayList<V>(size)
//        for (i in 0 until size) {
//            list.add(transform(this[i], other[i]))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public static <R, V> zip(float[] elements, other: Array<out R>, transform: (a: Float, b: R) -> V): List<V> {
//        val size = minOf(size, other.size)
//        val list = ArrayList<V>(size)
//        for (i in 0 until size) {
//            list.add(transform(this[i], other[i]))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public static <R, V> zip(double[] elements, other: Array<out R>, transform: (a: Double, b: R) -> V): List<V> {
//        val size = minOf(size, other.size)
//        val list = ArrayList<V>(size)
//        for (i in 0 until size) {
//            list.add(transform(this[i], other[i]))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public static <R, V> zip(boolean[] elements, other: Array<out R>, transform: (a: Boolean, b: R) -> V): List<V> {
//        val size = minOf(size, other.size)
//        val list = ArrayList<V>(size)
//        for (i in 0 until size) {
//            list.add(transform(this[i], other[i]))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public static <R, V> zip(char[] elements, other: Array<out R>, transform: (a: Char, b: R) -> V): List<V> {
//        val size = minOf(size, other.size)
//        val list = ArrayList<V>(size)
//        for (i in 0 until size) {
//            list.add(transform(this[i], other[i]))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <T, R> zip(@NotNull T[] elements, other: Iterable<R>): List<Pair<T, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> zip(byte[] elements, other: Iterable<R>): List<Pair<Byte, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> zip(short[] elements, other: Iterable<R>): List<Pair<Short, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> zip(int[] elements, other: Iterable<R>): List<Pair<Int, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> zip(long[] elements, other: Iterable<R>): List<Pair<Long, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> zip(float[] elements, other: Iterable<R>): List<Pair<Float, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> zip(double[] elements, other: Iterable<R>): List<Pair<Double, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> zip(boolean[] elements, other: Iterable<R>): List<Pair<Boolean, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> zip(char[] elements, other: Iterable<R>): List<Pair<Char, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public static <T, R, V> zip(@NotNull T[] elements, other: Iterable<R>, transform: (a: T, b: R) -> V): List<V> {
//        val arraySize = size
//        val list = ArrayList<V>(minOf(other.collectionSizeOrDefault(10), arraySize))
//        var i = 0
//        for (element in other) {
//            if (i >= arraySize) break
//            list.add(transform(this[i++], element))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public static <R, V> zip(byte[] elements, other: Iterable<R>, transform: (a: Byte, b: R) -> V): List<V> {
//        val arraySize = size
//        val list = ArrayList<V>(minOf(other.collectionSizeOrDefault(10), arraySize))
//        var i = 0
//        for (element in other) {
//            if (i >= arraySize) break
//            list.add(transform(this[i++], element))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public static <R, V> zip(short[] elements, other: Iterable<R>, transform: (a: Short, b: R) -> V): List<V> {
//        val arraySize = size
//        val list = ArrayList<V>(minOf(other.collectionSizeOrDefault(10), arraySize))
//        var i = 0
//        for (element in other) {
//            if (i >= arraySize) break
//            list.add(transform(this[i++], element))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public static <R, V> zip(int[] elements, other: Iterable<R>, transform: (a: Int, b: R) -> V): List<V> {
//        val arraySize = size
//        val list = ArrayList<V>(minOf(other.collectionSizeOrDefault(10), arraySize))
//        var i = 0
//        for (element in other) {
//            if (i >= arraySize) break
//            list.add(transform(this[i++], element))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public static <R, V> zip(long[] elements, other: Iterable<R>, transform: (a: Long, b: R) -> V): List<V> {
//        val arraySize = size
//        val list = ArrayList<V>(minOf(other.collectionSizeOrDefault(10), arraySize))
//        var i = 0
//        for (element in other) {
//            if (i >= arraySize) break
//            list.add(transform(this[i++], element))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public static <R, V> zip(float[] elements, other: Iterable<R>, transform: (a: Float, b: R) -> V): List<V> {
//        val arraySize = size
//        val list = ArrayList<V>(minOf(other.collectionSizeOrDefault(10), arraySize))
//        var i = 0
//        for (element in other) {
//            if (i >= arraySize) break
//            list.add(transform(this[i++], element))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public static <R, V> zip(double[] elements, other: Iterable<R>, transform: (a: Double, b: R) -> V): List<V> {
//        val arraySize = size
//        val list = ArrayList<V>(minOf(other.collectionSizeOrDefault(10), arraySize))
//        var i = 0
//        for (element in other) {
//            if (i >= arraySize) break
//            list.add(transform(this[i++], element))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public static <R, V> zip(boolean[] elements, other: Iterable<R>, transform: (a: Boolean, b: R) -> V): List<V> {
//        val arraySize = size
//        val list = ArrayList<V>(minOf(other.collectionSizeOrDefault(10), arraySize))
//        var i = 0
//        for (element in other) {
//            if (i >= arraySize) break
//            list.add(transform(this[i++], element))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public static <R, V> zip(char[] elements, other: Iterable<R>, transform: (a: Char, b: R) -> V): List<V> {
//        val arraySize = size
//        val list = ArrayList<V>(minOf(other.collectionSizeOrDefault(10), arraySize))
//        var i = 0
//        for (element in other) {
//            if (i >= arraySize) break
//            list.add(transform(this[i++], element))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun zip(byte[] elements, other: ByteArray): List<Pair<Byte, Byte>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun zip(short[] elements, other: short[]): List<Pair<Short, Short>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun zip(int[] elements, other: IntArray): List<Pair<Int, Int>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun zip(long[] elements, other: long[]): List<Pair<Long, Long>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun zip(float[] elements, other: float[]): List<Pair<Float, Float>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun zip(double[] elements, other: double[]): List<Pair<Double, Double>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun zip(boolean[] elements, other: boolean[]): List<Pair<Boolean, Boolean>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun zip(char[] elements, other: char[]): List<Pair<Char, Char>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public static <V> zip(byte[] elements, other: ByteArray, transform: (a: Byte, b: Byte) -> V): List<V> {
//        val size = minOf(size, other.size)
//        val list = ArrayList<V>(size)
//        for (i in 0 until size) {
//            list.add(transform(this[i], other[i]))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public static <V> zip(short[] elements, other: short[], transform: (a: Short, b: Short) -> V): List<V> {
//        val size = minOf(size, other.size)
//        val list = ArrayList<V>(size)
//        for (i in 0 until size) {
//            list.add(transform(this[i], other[i]))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public static <V> zip(int[] elements, other: IntArray, transform: (a: Int, b: Int) -> V): List<V> {
//        val size = minOf(size, other.size)
//        val list = ArrayList<V>(size)
//        for (i in 0 until size) {
//            list.add(transform(this[i], other[i]))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public static <V> zip(long[] elements, other: long[], transform: (a: Long, b: Long) -> V): List<V> {
//        val size = minOf(size, other.size)
//        val list = ArrayList<V>(size)
//        for (i in 0 until size) {
//            list.add(transform(this[i], other[i]))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public static <V> zip(float[] elements, other: float[], transform: (a: Float, b: Float) -> V): List<V> {
//        val size = minOf(size, other.size)
//        val list = ArrayList<V>(size)
//        for (i in 0 until size) {
//            list.add(transform(this[i], other[i]))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public static <V> zip(double[] elements, other: double[], transform: (a: Double, b: Double) -> V): List<V> {
//        val size = minOf(size, other.size)
//        val list = ArrayList<V>(size)
//        for (i in 0 until size) {
//            list.add(transform(this[i], other[i]))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public static <V> zip(boolean[] elements, other: boolean[], transform: (a: Boolean, b: Boolean) -> V): List<V> {
//        val size = minOf(size, other.size)
//        val list = ArrayList<V>(size)
//        for (i in 0 until size) {
//            list.add(transform(this[i], other[i]))
//        }
//        return list
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public static <V> zip(char[] elements, other: char[], transform: (a: Char, b: Char) -> V): List<V> {
//        val size = minOf(size, other.size)
//        val list = ArrayList<V>(size)
//        for (i in 0 until size) {
//            list.add(transform(this[i], other[i]))
//        }
//        return list
//    }
//
///**
// * Appends the string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
// *
// * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
// * elements will be appended, followed by the [truncated] string (which defaults to "...").
// */
//    public fun <T, A : Appendable> joinTo(@NotNull T[] elements, buffer: A, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((T) -> CharSequence)? = null): A {
//        buffer.append(prefix)
//        var count = 0
//        for (element in this) {
//            if (++count > 1) buffer.append(separator)
//            if (limit < 0 || count <= limit) {
//                buffer.appendElement(element, transform)
//            } else break
//        }
//        if (limit >= 0 && count > limit) buffer.append(truncated)
//        buffer.append(postfix)
//        return buffer
//    }
//
///**
// * Appends the string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
// *
// * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
// * elements will be appended, followed by the [truncated] string (which defaults to "...").
// */
//    public fun <A : Appendable> joinTo(byte[] elements, buffer: A, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Byte) -> CharSequence)? = null): A {
//        buffer.append(prefix)
//        var count = 0
//        for (element in this) {
//            if (++count > 1) buffer.append(separator)
//            if (limit < 0 || count <= limit) {
//                if (transform != null)
//                    buffer.append(transform(element))
//                else
//                    buffer.append(element.toString())
//            } else break
//        }
//        if (limit >= 0 && count > limit) buffer.append(truncated)
//        buffer.append(postfix)
//        return buffer
//    }
//
///**
// * Appends the string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
// *
// * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
// * elements will be appended, followed by the [truncated] string (which defaults to "...").
// */
//    public fun <A : Appendable> joinTo(short[] elements, buffer: A, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Short) -> CharSequence)? = null): A {
//        buffer.append(prefix)
//        var count = 0
//        for (element in this) {
//            if (++count > 1) buffer.append(separator)
//            if (limit < 0 || count <= limit) {
//                if (transform != null)
//                    buffer.append(transform(element))
//                else
//                    buffer.append(element.toString())
//            } else break
//        }
//        if (limit >= 0 && count > limit) buffer.append(truncated)
//        buffer.append(postfix)
//        return buffer
//    }
//
///**
// * Appends the string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
// *
// * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
// * elements will be appended, followed by the [truncated] string (which defaults to "...").
// */
//    public fun <A : Appendable> joinTo(int[] elements, buffer: A, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Int) -> CharSequence)? = null): A {
//        buffer.append(prefix)
//        var count = 0
//        for (element in this) {
//            if (++count > 1) buffer.append(separator)
//            if (limit < 0 || count <= limit) {
//                if (transform != null)
//                    buffer.append(transform(element))
//                else
//                    buffer.append(element.toString())
//            } else break
//        }
//        if (limit >= 0 && count > limit) buffer.append(truncated)
//        buffer.append(postfix)
//        return buffer
//    }
//
///**
// * Appends the string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
// *
// * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
// * elements will be appended, followed by the [truncated] string (which defaults to "...").
// */
//    public fun <A : Appendable> joinTo(long[] elements, buffer: A, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Long) -> CharSequence)? = null): A {
//        buffer.append(prefix)
//        var count = 0
//        for (element in this) {
//            if (++count > 1) buffer.append(separator)
//            if (limit < 0 || count <= limit) {
//                if (transform != null)
//                    buffer.append(transform(element))
//                else
//                    buffer.append(element.toString())
//            } else break
//        }
//        if (limit >= 0 && count > limit) buffer.append(truncated)
//        buffer.append(postfix)
//        return buffer
//    }
//
///**
// * Appends the string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
// *
// * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
// * elements will be appended, followed by the [truncated] string (which defaults to "...").
// */
//    public fun <A : Appendable> joinTo(float[] elements, buffer: A, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Float) -> CharSequence)? = null): A {
//        buffer.append(prefix)
//        var count = 0
//        for (element in this) {
//            if (++count > 1) buffer.append(separator)
//            if (limit < 0 || count <= limit) {
//                if (transform != null)
//                    buffer.append(transform(element))
//                else
//                    buffer.append(element.toString())
//            } else break
//        }
//        if (limit >= 0 && count > limit) buffer.append(truncated)
//        buffer.append(postfix)
//        return buffer
//    }
//
///**
// * Appends the string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
// *
// * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
// * elements will be appended, followed by the [truncated] string (which defaults to "...").
// */
//    public fun <A : Appendable> joinTo(double[] elements, buffer: A, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Double) -> CharSequence)? = null): A {
//        buffer.append(prefix)
//        var count = 0
//        for (element in this) {
//            if (++count > 1) buffer.append(separator)
//            if (limit < 0 || count <= limit) {
//                if (transform != null)
//                    buffer.append(transform(element))
//                else
//                    buffer.append(element.toString())
//            } else break
//        }
//        if (limit >= 0 && count > limit) buffer.append(truncated)
//        buffer.append(postfix)
//        return buffer
//    }
//
///**
// * Appends the string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
// *
// * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
// * elements will be appended, followed by the [truncated] string (which defaults to "...").
// */
//    public fun <A : Appendable> joinTo(boolean[] elements, buffer: A, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Boolean) -> CharSequence)? = null): A {
//        buffer.append(prefix)
//        var count = 0
//        for (element in this) {
//            if (++count > 1) buffer.append(separator)
//            if (limit < 0 || count <= limit) {
//                if (transform != null)
//                    buffer.append(transform(element))
//                else
//                    buffer.append(element.toString())
//            } else break
//        }
//        if (limit >= 0 && count > limit) buffer.append(truncated)
//        buffer.append(postfix)
//        return buffer
//    }
//
///**
// * Appends the string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
// *
// * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
// * elements will be appended, followed by the [truncated] string (which defaults to "...").
// */
//    public fun <A : Appendable> joinTo(char[] elements, buffer: A, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Char) -> CharSequence)? = null): A {
//        buffer.append(prefix)
//        var count = 0
//        for (element in this) {
//            if (++count > 1) buffer.append(separator)
//            if (limit < 0 || count <= limit) {
//                if (transform != null)
//                    buffer.append(transform(element))
//                else
//                    buffer.append(element)
//            } else break
//        }
//        if (limit >= 0 && count > limit) buffer.append(truncated)
//        buffer.append(postfix)
//        return buffer
//    }
//
//    /**
//     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
//     *
//     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
//     * elements will be appended, followed by the [truncated] string (which defaults to "...").
//     */
//    public fun <T> joinToString(@NotNull T[] elements, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((T) -> CharSequence)? = null): String {
//        return joinTo(StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString()
//    }
//
//    /**
//     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
//     *
//     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
//     * elements will be appended, followed by the [truncated] string (which defaults to "...").
//     */
//    public fun joinToString(byte[] elements, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Byte) -> CharSequence)? = null): String {
//        return joinTo(StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString()
//    }
//
//    /**
//     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
//     *
//     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
//     * elements will be appended, followed by the [truncated] string (which defaults to "...").
//     */
//    public fun joinToString(short[] elements, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Short) -> CharSequence)? = null): String {
//        return joinTo(StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString()
//    }
//
//    /**
//     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
//     *
//     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
//     * elements will be appended, followed by the [truncated] string (which defaults to "...").
//     */
//    public fun joinToString(int[] elements, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Int) -> CharSequence)? = null): String {
//        return joinTo(StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString()
//    }
//
//    /**
//     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
//     *
//     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
//     * elements will be appended, followed by the [truncated] string (which defaults to "...").
//     */
//    public fun joinToString(long[] elements, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Long) -> CharSequence)? = null): String {
//        return joinTo(StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString()
//    }
//
//    /**
//     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
//     *
//     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
//     * elements will be appended, followed by the [truncated] string (which defaults to "...").
//     */
//    public fun joinToString(float[] elements, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Float) -> CharSequence)? = null): String {
//        return joinTo(StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString()
//    }
//
//    /**
//     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
//     *
//     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
//     * elements will be appended, followed by the [truncated] string (which defaults to "...").
//     */
//    public fun joinToString(double[] elements, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Double) -> CharSequence)? = null): String {
//        return joinTo(StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString()
//    }
//
//    /**
//     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
//     *
//     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
//     * elements will be appended, followed by the [truncated] string (which defaults to "...").
//     */
//    public fun joinToString(boolean[] elements, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Boolean) -> CharSequence)? = null): String {
//        return joinTo(StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString()
//    }
//
//    /**
//     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
//     *
//     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
//     * elements will be appended, followed by the [truncated] string (which defaults to "...").
//     */
//    public fun joinToString(char[] elements, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Char) -> CharSequence)? = null): String {
//        return joinTo(StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString()
//    }
}
