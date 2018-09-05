//package me.panpf.javax.util;
//
//import me.panpf.javax.lang.Intx;
//import org.jetbrains.annotations.NotNull;
//import org.jetbrains.annotations.Nullable;
//
//import java.io.IOException;
//import java.util.*;
//
//@SuppressWarnings({"WeakerAccess"})
//public class Arrayx2 {
//
//
////
////
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
////    public static withIndex(int[] elements): Iterable<IndexedValue<Int>> {
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
////    public static distinct(int[] elements): List<Int> {
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
////    public static <K> distinctBy(int[] elements, selector: (Int) -> K): List<Int> {
////        val set = HashSet<K>()
////        val list = ArrayList<Int>()
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
////    public infix static intersect(int[] elements, other: Iterable<Int>): Set<Int> {
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
////    public infix static subtract(int[] elements, other: Iterable<Int>): Set<Int> {
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
////    /**
////     * Performs the given [action] on each element.
////     */
////    public static <T> forEach(@NotNull T[] elements, action: (T) -> Unit): Unit {
////        for (element in this) action(element)
////    }
////
////    /**
////     * Performs the given [action] on each element.
////     */
////    public static forEach(byte[] elements, action: (Byte) -> Unit): Unit {
////        for (element in this) action(element)
////    }
////
////    /**
////     * Performs the given [action] on each element.
////     */
////    public static forEach(short[] elements, action: (Short) -> Unit): Unit {
////        for (element in this) action(element)
////    }
////
////    /**
////     * Performs the given [action] on each element.
////     */
////    public static forEach(int[] elements, action: (Int) -> Unit): Unit {
////        for (element in this) action(element)
////    }
////
////    /**
////     * Performs the given [action] on each element.
////     */
////    public static forEach(long[] elements, action: (Long) -> Unit): Unit {
////        for (element in this) action(element)
////    }
////
////    /**
////     * Performs the given [action] on each element.
////     */
////    public static forEach(float[] elements, action: (Float) -> Unit): Unit {
////        for (element in this) action(element)
////    }
////
////    /**
////     * Performs the given [action] on each element.
////     */
////    public static forEach(double[] elements, action: (Double) -> Unit): Unit {
////        for (element in this) action(element)
////    }
////
////    /**
////     * Performs the given [action] on each element.
////     */
////    public static forEach(boolean[] elements, action: (Boolean) -> Unit): Unit {
////        for (element in this) action(element)
////    }
////
////    /**
////     * Performs the given [action] on each element.
////     */
////    public static forEach(char[] elements, action: (Character) -> Unit): Unit {
////        for (element in this) action(element)
////    }
////
////    /**
////     * Performs the given [action] on each element, providing sequential index with the element.
////     * @param [action] function that takes the index of an element and the element itself
////     * and performs the desired action on the element.
////     */
////    public static <T> forEachIndexed(@NotNull T[] elements, action: (index: Int, T) -> Unit): Unit {
////        var index = 0
////        for (item in this) action(index++, item)
////    }
////
////    /**
////     * Performs the given [action] on each element, providing sequential index with the element.
////     * @param [action] function that takes the index of an element and the element itself
////     * and performs the desired action on the element.
////     */
////    public static forEachIndexed(byte[] elements, action: (index: Int, Byte) -> Unit): Unit {
////        var index = 0
////        for (item in this) action(index++, item)
////    }
////
////    /**
////     * Performs the given [action] on each element, providing sequential index with the element.
////     * @param [action] function that takes the index of an element and the element itself
////     * and performs the desired action on the element.
////     */
////    public static forEachIndexed(short[] elements, action: (index: Int, Short) -> Unit): Unit {
////        var index = 0
////        for (item in this) action(index++, item)
////    }
////
////    /**
////     * Performs the given [action] on each element, providing sequential index with the element.
////     * @param [action] function that takes the index of an element and the element itself
////     * and performs the desired action on the element.
////     */
////    public static forEachIndexed(int[] elements, action: (index: Int, Int) -> Unit): Unit {
////        var index = 0
////        for (item in this) action(index++, item)
////    }
////
////    /**
////     * Performs the given [action] on each element, providing sequential index with the element.
////     * @param [action] function that takes the index of an element and the element itself
////     * and performs the desired action on the element.
////     */
////    public static forEachIndexed(long[] elements, action: (index: Int, Long) -> Unit): Unit {
////        var index = 0
////        for (item in this) action(index++, item)
////    }
////
////    /**
////     * Performs the given [action] on each element, providing sequential index with the element.
////     * @param [action] function that takes the index of an element and the element itself
////     * and performs the desired action on the element.
////     */
////    public static forEachIndexed(float[] elements, action: (index: Int, Float) -> Unit): Unit {
////        var index = 0
////        for (item in this) action(index++, item)
////    }
////
////    /**
////     * Performs the given [action] on each element, providing sequential index with the element.
////     * @param [action] function that takes the index of an element and the element itself
////     * and performs the desired action on the element.
////     */
////    public static forEachIndexed(double[] elements, action: (index: Int, Double) -> Unit): Unit {
////        var index = 0
////        for (item in this) action(index++, item)
////    }
////
////    /**
////     * Performs the given [action] on each element, providing sequential index with the element.
////     * @param [action] function that takes the index of an element and the element itself
////     * and performs the desired action on the element.
////     */
////    public static forEachIndexed(boolean[] elements, action: (index: Int, Boolean) -> Unit): Unit {
////        var index = 0
////        for (item in this) action(index++, item)
////    }
////
////    /**
////     * Performs the given [action] on each element, providing sequential index with the element.
////     * @param [action] function that takes the index of an element and the element itself
////     * and performs the desired action on the element.
////     */
////    public static forEachIndexed(char[] elements, action: (index: Int, Character) -> Unit): Unit {
////        var index = 0
////        for (item in this) action(index++, item)
////    }
////
//
//
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
////    public static <T> none(@NotNull T[] elements, predicate: (T) -> Boolean): Boolean {
////        for (element in this) if (predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if no elements match the given [predicate].
////     */
////    public static none(byte[] elements, predicate: (Byte) -> Boolean): Boolean {
////        for (element in this) if (predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if no elements match the given [predicate].
////     */
////    public static none(short[] elements, predicate: (Short) -> Boolean): Boolean {
////        for (element in this) if (predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if no elements match the given [predicate].
////     */
////    public static none(int[] elements, predicate: (Integer) -> Boolean): Boolean {
////        for (element in this) if (predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if no elements match the given [predicate].
////     */
////    public static none(long[] elements, predicate: (Long) -> Boolean): Boolean {
////        for (element in this) if (predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if no elements match the given [predicate].
////     */
////    public static none(float[] elements, predicate: (Float) -> Boolean): Boolean {
////        for (element in this) if (predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if no elements match the given [predicate].
////     */
////    public static none(double[] elements, predicate: (Double) -> Boolean): Boolean {
////        for (element in this) if (predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if no elements match the given [predicate].
////     */
////    public static none(boolean[] elements, predicate: (Boolean) -> Boolean): Boolean {
////        for (element in this) if (predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if no elements match the given [predicate].
////     */
////    public static none(char[] elements, predicate: (Character) -> Boolean): Boolean {
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
////    /**
////     * Splits the original array into pair of lists,
////     * where *first* list contains elements for which [predicate] yielded `true`,
////     * while *second* list contains elements for which [predicate] yielded `false`.
////     */
////    public static <T> partition(@NotNull T[] elements, predicate: (T) -> Boolean): Pair<List<T>, List<T>> {
////        val first = ArrayList<T>()
////        val second = ArrayList<T>()
////        for (element in this) {
////            if (predicate(element)) {
////                first.add(element)
////            } else {
////                second.add(element)
////            }
////        }
////        return Pair(first, second)
////    }
////
////    /**
////     * Splits the original array into pair of lists,
////     * where *first* list contains elements for which [predicate] yielded `true`,
////     * while *second* list contains elements for which [predicate] yielded `false`.
////     */
////    public static partition(byte[] elements, predicate: (Byte) -> Boolean): Pair<List<Byte>, List<Byte>> {
////        val first = ArrayList<Byte>()
////        val second = ArrayList<Byte>()
////        for (element in this) {
////            if (predicate(element)) {
////                first.add(element)
////            } else {
////                second.add(element)
////            }
////        }
////        return Pair(first, second)
////    }
////
////    /**
////     * Splits the original array into pair of lists,
////     * where *first* list contains elements for which [predicate] yielded `true`,
////     * while *second* list contains elements for which [predicate] yielded `false`.
////     */
////    public static partition(short[] elements, predicate: (Short) -> Boolean): Pair<List<Short>, List<Short>> {
////        val first = ArrayList<Short>()
////        val second = ArrayList<Short>()
////        for (element in this) {
////            if (predicate(element)) {
////                first.add(element)
////            } else {
////                second.add(element)
////            }
////        }
////        return Pair(first, second)
////    }
////
////    /**
////     * Splits the original array into pair of lists,
////     * where *first* list contains elements for which [predicate] yielded `true`,
////     * while *second* list contains elements for which [predicate] yielded `false`.
////     */
////    public static partition(int[] elements, predicate: (Integer) -> Boolean): Pair<List<Integer>, List<Integer>> {
////        val first = ArrayList<Integer>()
////        val second = ArrayList<Integer>()
////        for (element in this) {
////            if (predicate(element)) {
////                first.add(element)
////            } else {
////                second.add(element)
////            }
////        }
////        return Pair(first, second)
////    }
////
////    /**
////     * Splits the original array into pair of lists,
////     * where *first* list contains elements for which [predicate] yielded `true`,
////     * while *second* list contains elements for which [predicate] yielded `false`.
////     */
////    public static partition(long[] elements, predicate: (Long) -> Boolean): Pair<List<Long>, List<Long>> {
////        val first = ArrayList<Long>()
////        val second = ArrayList<Long>()
////        for (element in this) {
////            if (predicate(element)) {
////                first.add(element)
////            } else {
////                second.add(element)
////            }
////        }
////        return Pair(first, second)
////    }
////
////    /**
////     * Splits the original array into pair of lists,
////     * where *first* list contains elements for which [predicate] yielded `true`,
////     * while *second* list contains elements for which [predicate] yielded `false`.
////     */
////    public static partition(float[] elements, predicate: (Float) -> Boolean): Pair<List<Float>, List<Float>> {
////        val first = ArrayList<Float>()
////        val second = ArrayList<Float>()
////        for (element in this) {
////            if (predicate(element)) {
////                first.add(element)
////            } else {
////                second.add(element)
////            }
////        }
////        return Pair(first, second)
////    }
////
////    /**
////     * Splits the original array into pair of lists,
////     * where *first* list contains elements for which [predicate] yielded `true`,
////     * while *second* list contains elements for which [predicate] yielded `false`.
////     */
////    public static partition(double[] elements, predicate: (Double) -> Boolean): Pair<List<Double>, List<Double>> {
////        val first = ArrayList<Double>()
////        val second = ArrayList<Double>()
////        for (element in this) {
////            if (predicate(element)) {
////                first.add(element)
////            } else {
////                second.add(element)
////            }
////        }
////        return Pair(first, second)
////    }
////
////    /**
////     * Splits the original array into pair of lists,
////     * where *first* list contains elements for which [predicate] yielded `true`,
////     * while *second* list contains elements for which [predicate] yielded `false`.
////     */
////    public static partition(boolean[] elements, predicate: (Boolean) -> Boolean): Pair<List<Boolean>, List<Boolean>> {
////        val first = ArrayList<Boolean>()
////        val second = ArrayList<Boolean>()
////        for (element in this) {
////            if (predicate(element)) {
////                first.add(element)
////            } else {
////                second.add(element)
////            }
////        }
////        return Pair(first, second)
////    }
////
////    /**
////     * Splits the original array into pair of lists,
////     * where *first* list contains elements for which [predicate] yielded `true`,
////     * while *second* list contains elements for which [predicate] yielded `false`.
////     */
////    public static partition(char[] elements, predicate: (Character) -> Boolean): Pair<List<Character>, List<Character>> {
////        val first = ArrayList<Character>()
////        val second = ArrayList<Character>()
////        for (element in this) {
////            if (predicate(element)) {
////                first.add(element)
////            } else {
////                second.add(element)
////            }
////        }
////        return Pair(first, second)
////    }
////
////    /**
////     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
////     */
////    public infix static <T, R> zip(@NotNull T[] elements, other: Array<out R>): List<Pair<T, R>> {
////        return zip(other) { t1, t2 -> t1 to t2 }
////    }
////
////    /**
////     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
////     */
////    public infix static <R> zip(byte[] elements, other: Array<out R>): List<Pair<Byte, R>> {
////        return zip(other) { t1, t2 -> t1 to t2 }
////    }
////
////    /**
////     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
////     */
////    public infix static <R> zip(short[] elements, other: Array<out R>): List<Pair<Short, R>> {
////        return zip(other) { t1, t2 -> t1 to t2 }
////    }
////
////    /**
////     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
////     */
////    public infix static <R> zip(int[] elements, other: Array<out R>): List<Pair<Integer, R>> {
////        return zip(other) { t1, t2 -> t1 to t2 }
////    }
////
////    /**
////     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
////     */
////    public infix static <R> zip(long[] elements, other: Array<out R>): List<Pair<Long, R>> {
////        return zip(other) { t1, t2 -> t1 to t2 }
////    }
////
////    /**
////     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
////     */
////    public infix static <R> zip(float[] elements, other: Array<out R>): List<Pair<Float, R>> {
////        return zip(other) { t1, t2 -> t1 to t2 }
////    }
////
////    /**
////     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
////     */
////    public infix static <R> zip(double[] elements, other: Array<out R>): List<Pair<Double, R>> {
////        return zip(other) { t1, t2 -> t1 to t2 }
////    }
////
////    /**
////     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
////     */
////    public infix static <R> zip(boolean[] elements, other: Array<out R>): List<Pair<Boolean, R>> {
////        return zip(other) { t1, t2 -> t1 to t2 }
////    }
////
////    /**
////     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
////     */
////    public infix static <R> zip(char[] elements, other: Array<out R>): List<Pair<Character, R>> {
////        return zip(other) { t1, t2 -> t1 to t2 }
////    }
////
////    /**
////     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
////     */
////    public static <T, R, V> zip(@NotNull T[] elements, other: Array<out R>, transform: (a: T, b: R) -> V): List<V> {
////        val size = minOf(size, other.size)
////        val list = ArrayList<V>(size)
////        for (i in 0 until size) {
////            list.add(transform(this[i], other[i]))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
////     */
////    public static <R, V> zip(byte[] elements, other: Array<out R>, transform: (a: Byte, b: R) -> V): List<V> {
////        val size = minOf(size, other.size)
////        val list = ArrayList<V>(size)
////        for (i in 0 until size) {
////            list.add(transform(this[i], other[i]))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
////     */
////    public static <R, V> zip(short[] elements, other: Array<out R>, transform: (a: Short, b: R) -> V): List<V> {
////        val size = minOf(size, other.size)
////        val list = ArrayList<V>(size)
////        for (i in 0 until size) {
////            list.add(transform(this[i], other[i]))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
////     */
////    public static <R, V> zip(int[] elements, other: Array<out R>, transform: (a: Integer, b: R) -> V): List<V> {
////        val size = minOf(size, other.size)
////        val list = ArrayList<V>(size)
////        for (i in 0 until size) {
////            list.add(transform(this[i], other[i]))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
////     */
////    public static <R, V> zip(long[] elements, other: Array<out R>, transform: (a: Long, b: R) -> V): List<V> {
////        val size = minOf(size, other.size)
////        val list = ArrayList<V>(size)
////        for (i in 0 until size) {
////            list.add(transform(this[i], other[i]))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
////     */
////    public static <R, V> zip(float[] elements, other: Array<out R>, transform: (a: Float, b: R) -> V): List<V> {
////        val size = minOf(size, other.size)
////        val list = ArrayList<V>(size)
////        for (i in 0 until size) {
////            list.add(transform(this[i], other[i]))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
////     */
////    public static <R, V> zip(double[] elements, other: Array<out R>, transform: (a: Double, b: R) -> V): List<V> {
////        val size = minOf(size, other.size)
////        val list = ArrayList<V>(size)
////        for (i in 0 until size) {
////            list.add(transform(this[i], other[i]))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
////     */
////    public static <R, V> zip(boolean[] elements, other: Array<out R>, transform: (a: Boolean, b: R) -> V): List<V> {
////        val size = minOf(size, other.size)
////        val list = ArrayList<V>(size)
////        for (i in 0 until size) {
////            list.add(transform(this[i], other[i]))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
////     */
////    public static <R, V> zip(char[] elements, other: Array<out R>, transform: (a: Character, b: R) -> V): List<V> {
////        val size = minOf(size, other.size)
////        val list = ArrayList<V>(size)
////        for (i in 0 until size) {
////            list.add(transform(this[i], other[i]))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
////     */
////    public infix static <T, R> zip(@NotNull T[] elements, other: Iterable<R>): List<Pair<T, R>> {
////        return zip(other) { t1, t2 -> t1 to t2 }
////    }
////
////    /**
////     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
////     */
////    public infix static <R> zip(byte[] elements, other: Iterable<R>): List<Pair<Byte, R>> {
////        return zip(other) { t1, t2 -> t1 to t2 }
////    }
////
////    /**
////     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
////     */
////    public infix static <R> zip(short[] elements, other: Iterable<R>): List<Pair<Short, R>> {
////        return zip(other) { t1, t2 -> t1 to t2 }
////    }
////
////    /**
////     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
////     */
////    public infix static <R> zip(int[] elements, other: Iterable<R>): List<Pair<Integer, R>> {
////        return zip(other) { t1, t2 -> t1 to t2 }
////    }
////
////    /**
////     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
////     */
////    public infix static <R> zip(long[] elements, other: Iterable<R>): List<Pair<Long, R>> {
////        return zip(other) { t1, t2 -> t1 to t2 }
////    }
////
////    /**
////     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
////     */
////    public infix static <R> zip(float[] elements, other: Iterable<R>): List<Pair<Float, R>> {
////        return zip(other) { t1, t2 -> t1 to t2 }
////    }
////
////    /**
////     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
////     */
////    public infix static <R> zip(double[] elements, other: Iterable<R>): List<Pair<Double, R>> {
////        return zip(other) { t1, t2 -> t1 to t2 }
////    }
////
////    /**
////     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
////     */
////    public infix static <R> zip(boolean[] elements, other: Iterable<R>): List<Pair<Boolean, R>> {
////        return zip(other) { t1, t2 -> t1 to t2 }
////    }
////
////    /**
////     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
////     */
////    public infix static <R> zip(char[] elements, other: Iterable<R>): List<Pair<Character, R>> {
////        return zip(other) { t1, t2 -> t1 to t2 }
////    }
////
////    /**
////     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
////     */
////    public static <T, R, V> zip(@NotNull T[] elements, other: Iterable<R>, transform: (a: T, b: R) -> V): List<V> {
////        val arraySize = size
////        val list = ArrayList<V>(minOf(other.collectionSizeOrDefault(10), arraySize))
////        var i = 0
////        for (element in other) {
////            if (i >= arraySize) break
////            list.add(transform(this[i++], element))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
////     */
////    public static <R, V> zip(byte[] elements, other: Iterable<R>, transform: (a: Byte, b: R) -> V): List<V> {
////        val arraySize = size
////        val list = ArrayList<V>(minOf(other.collectionSizeOrDefault(10), arraySize))
////        var i = 0
////        for (element in other) {
////            if (i >= arraySize) break
////            list.add(transform(this[i++], element))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
////     */
////    public static <R, V> zip(short[] elements, other: Iterable<R>, transform: (a: Short, b: R) -> V): List<V> {
////        val arraySize = size
////        val list = ArrayList<V>(minOf(other.collectionSizeOrDefault(10), arraySize))
////        var i = 0
////        for (element in other) {
////            if (i >= arraySize) break
////            list.add(transform(this[i++], element))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
////     */
////    public static <R, V> zip(int[] elements, other: Iterable<R>, transform: (a: Integer, b: R) -> V): List<V> {
////        val arraySize = size
////        val list = ArrayList<V>(minOf(other.collectionSizeOrDefault(10), arraySize))
////        var i = 0
////        for (element in other) {
////            if (i >= arraySize) break
////            list.add(transform(this[i++], element))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
////     */
////    public static <R, V> zip(long[] elements, other: Iterable<R>, transform: (a: Long, b: R) -> V): List<V> {
////        val arraySize = size
////        val list = ArrayList<V>(minOf(other.collectionSizeOrDefault(10), arraySize))
////        var i = 0
////        for (element in other) {
////            if (i >= arraySize) break
////            list.add(transform(this[i++], element))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
////     */
////    public static <R, V> zip(float[] elements, other: Iterable<R>, transform: (a: Float, b: R) -> V): List<V> {
////        val arraySize = size
////        val list = ArrayList<V>(minOf(other.collectionSizeOrDefault(10), arraySize))
////        var i = 0
////        for (element in other) {
////            if (i >= arraySize) break
////            list.add(transform(this[i++], element))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
////     */
////    public static <R, V> zip(double[] elements, other: Iterable<R>, transform: (a: Double, b: R) -> V): List<V> {
////        val arraySize = size
////        val list = ArrayList<V>(minOf(other.collectionSizeOrDefault(10), arraySize))
////        var i = 0
////        for (element in other) {
////            if (i >= arraySize) break
////            list.add(transform(this[i++], element))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
////     */
////    public static <R, V> zip(boolean[] elements, other: Iterable<R>, transform: (a: Boolean, b: R) -> V): List<V> {
////        val arraySize = size
////        val list = ArrayList<V>(minOf(other.collectionSizeOrDefault(10), arraySize))
////        var i = 0
////        for (element in other) {
////            if (i >= arraySize) break
////            list.add(transform(this[i++], element))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
////     */
////    public static <R, V> zip(char[] elements, other: Iterable<R>, transform: (a: Character, b: R) -> V): List<V> {
////        val arraySize = size
////        val list = ArrayList<V>(minOf(other.collectionSizeOrDefault(10), arraySize))
////        var i = 0
////        for (element in other) {
////            if (i >= arraySize) break
////            list.add(transform(this[i++], element))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
////     */
////    public infix static zip(byte[] elements, other: ByteArray): List<Pair<Byte, Byte>> {
////        return zip(other) { t1, t2 -> t1 to t2 }
////    }
////
////    /**
////     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
////     */
////    public infix static zip(short[] elements, other: short[]): List<Pair<Short, Short>> {
////        return zip(other) { t1, t2 -> t1 to t2 }
////    }
////
////    /**
////     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
////     */
////    public infix static zip(int[] elements, other: IntArray): List<Pair<Integer, Integer>> {
////        return zip(other) { t1, t2 -> t1 to t2 }
////    }
////
////    /**
////     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
////     */
////    public infix static zip(long[] elements, other: long[]): List<Pair<Long, Long>> {
////        return zip(other) { t1, t2 -> t1 to t2 }
////    }
////
////    /**
////     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
////     */
////    public infix static zip(float[] elements, other: float[]): List<Pair<Float, Float>> {
////        return zip(other) { t1, t2 -> t1 to t2 }
////    }
////
////    /**
////     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
////     */
////    public infix static zip(double[] elements, other: double[]): List<Pair<Double, Double>> {
////        return zip(other) { t1, t2 -> t1 to t2 }
////    }
////
////    /**
////     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
////     */
////    public infix static zip(boolean[] elements, other: boolean[]): List<Pair<Boolean, Boolean>> {
////        return zip(other) { t1, t2 -> t1 to t2 }
////    }
////
////    /**
////     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
////     */
////    public infix static zip(char[] elements, other: char[]): List<Pair<Character, Character>> {
////        return zip(other) { t1, t2 -> t1 to t2 }
////    }
////
////    /**
////     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
////     */
////    public static <V> zip(byte[] elements, other: ByteArray, transform: (a: Byte, b: Byte) -> V): List<V> {
////        val size = minOf(size, other.size)
////        val list = ArrayList<V>(size)
////        for (i in 0 until size) {
////            list.add(transform(this[i], other[i]))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
////     */
////    public static <V> zip(short[] elements, other: short[], transform: (a: Short, b: Short) -> V): List<V> {
////        val size = minOf(size, other.size)
////        val list = ArrayList<V>(size)
////        for (i in 0 until size) {
////            list.add(transform(this[i], other[i]))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
////     */
////    public static <V> zip(int[] elements, other: IntArray, transform: (a: Integer, b: Integer) -> V): List<V> {
////        val size = minOf(size, other.size)
////        val list = ArrayList<V>(size)
////        for (i in 0 until size) {
////            list.add(transform(this[i], other[i]))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
////     */
////    public static <V> zip(long[] elements, other: long[], transform: (a: Long, b: Long) -> V): List<V> {
////        val size = minOf(size, other.size)
////        val list = ArrayList<V>(size)
////        for (i in 0 until size) {
////            list.add(transform(this[i], other[i]))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
////     */
////    public static <V> zip(float[] elements, other: float[], transform: (a: Float, b: Float) -> V): List<V> {
////        val size = minOf(size, other.size)
////        val list = ArrayList<V>(size)
////        for (i in 0 until size) {
////            list.add(transform(this[i], other[i]))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
////     */
////    public static <V> zip(double[] elements, other: double[], transform: (a: Double, b: Double) -> V): List<V> {
////        val size = minOf(size, other.size)
////        val list = ArrayList<V>(size)
////        for (i in 0 until size) {
////            list.add(transform(this[i], other[i]))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
////     */
////    public static <V> zip(boolean[] elements, other: boolean[], transform: (a: Boolean, b: Boolean) -> V): List<V> {
////        val size = minOf(size, other.size)
////        val list = ArrayList<V>(size)
////        for (i in 0 until size) {
////            list.add(transform(this[i], other[i]))
////        }
////        return list
////    }
////
////    /**
////     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
////     */
////    public static <V> zip(char[] elements, other: char[], transform: (a: Character, b: Character) -> V): List<V> {
////        val size = minOf(size, other.size)
////        val list = ArrayList<V>(size)
////        for (i in 0 until size) {
////            list.add(transform(this[i], other[i]))
////        }
////        return list
////    }
////
//
//
//}
