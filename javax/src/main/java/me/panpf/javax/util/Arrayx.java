/*
 * Copyright (C) 2018 Peng fei Pan <panpfpanpf@outlook.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.panpf.javax.util;

import me.panpf.javax.lang.Charx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.nio.charset.Charset;
import java.util.*;

/**
 * Array tool class
 */
@SuppressWarnings("WeakerAccess")
public class Arrayx {

    /* ******************************************* From Kotlin Standard library ********************************************************* */

    /**
     * Returns an array containing the specified elements.
     */
    @NotNull
    public static <T> T[] arrayOf(T... elements) {
        return elements;
    }

    /**
     * Returns an array containing the specified [Double] numbers.
     */
    @NotNull
    public static double[] doubleArrayOf(double... elements) {
        return elements;
    }

    /**
     * Returns an array containing the specified [Float] numbers.
     */
    @NotNull
    public static float[] floatArrayOf(float... elements) {
        return elements;
    }

    /**
     * Returns an array containing the specified [Long] numbers.
     */
    @NotNull
    public static long[] longArrayOf(long... elements) {
        return elements;
    }

    /**
     * Returns an array containing the specified [Int] numbers.
     */
    @NotNull
    public static int[] intArrayOf(int... elements) {
        return elements;
    }

    /**
     * Returns an array containing the specified characters.
     */
    @NotNull
    public static char[] charArrayOf(char... elements) {
        return elements;
    }

    /**
     * Returns an array containing the specified [Short] numbers.
     */
    @NotNull
    public static short[] shortArrayOf(short... elements) {
        return elements;
    }

    /**
     * Returns an array containing the specified [Byte] numbers.
     */
    @NotNull
    public static byte[] byteArrayOf(byte... elements) {
        return elements;
    }

    /**
     * Returns an array containing the specified boolean values.
     */
    @NotNull
    public static boolean[] booleanArrayOf(boolean... elements) {
        return elements;
    }


    /**
     * Returns `true` if the array is empty.
     */
    public static <T> boolean isEmpty(@NotNull T[] elements) {
        return elements.length == 0;
    }

    /**
     * Returns `true` if the array is empty.
     */
    public static boolean isEmpty(@NotNull char[] elements) {
        return elements.length == 0;
    }

    /**
     * Returns `true` if the array is empty.
     */
    public static boolean isEmpty(@NotNull byte[] elements) {
        return elements.length == 0;
    }

    /**
     * Returns `true` if the array is empty.
     */
    public static boolean isEmpty(@NotNull short[] elements) {
        return elements.length == 0;
    }

    /**
     * Returns `true` if the array is empty.
     */
    public static boolean isEmpty(@NotNull int[] elements) {
        return elements.length == 0;
    }

    /**
     * Returns `true` if the array is empty.
     */
    public static boolean isEmpty(@NotNull long[] elements) {
        return elements.length == 0;
    }

    /**
     * Returns `true` if the array is empty.
     */
    public static boolean isEmpty(@NotNull float[] elements) {
        return elements.length == 0;
    }

    /**
     * Returns `true` if the array is empty.
     */
    public static boolean isEmpty(@NotNull double[] elements) {
        return elements.length == 0;
    }

    /**
     * Returns `true` if the array is empty.
     */
    public static boolean isEmpty(@NotNull boolean[] elements) {
        return elements.length == 0;
    }

    /**
     * Returns `true` if the array is not empty.
     */
    public static <T> boolean isNotEmpty(T[] elements) {
        return elements.length > 0;
    }

    /**
     * Returns `true` if the array is not empty.
     */
    public static boolean isNotEmpty(char[] elements) {
        return elements.length > 0;
    }

    /**
     * Returns `true` if the array is not empty.
     */
    public static boolean isNotEmpty(byte[] elements) {
        return elements.length > 0;
    }

    /**
     * Returns `true` if the array is not empty.
     */
    public static boolean isNotEmpty(short[] elements) {
        return elements.length > 0;
    }

    /**
     * Returns `true` if the array is not empty.
     */
    public static boolean isNotEmpty(int[] elements) {
        return elements.length > 0;
    }

    /**
     * Returns `true` if the array is not empty.
     */
    public static boolean isNotEmpty(long[] elements) {
        return elements.length > 0;
    }

    /**
     * Returns `true` if the array is not empty.
     */
    public static boolean isNotEmpty(float[] elements) {
        return elements.length > 0;
    }

    /**
     * Returns `true` if the array is not empty.
     */
    public static boolean isNotEmpty(double[] elements) {
        return elements.length > 0;
    }

    /**
     * Returns `true` if the array is not empty.
     */
    public static boolean isNotEmpty(boolean[] elements) {
        return elements.length > 0;
    }

    @NotNull
    public static <T> List<T> asList(@NotNull T[] array) {
        return Arrays.asList(array);
    }

    /**
     * Applies the given [transform] function to each element of the original array
     * and appends the results to the given [destination].
     */
    @NotNull
    public static <T, R> List<R> mapTo(@NotNull T[] source, @NotNull List<R> destination, @NotNull Transformer<T, R> transform) {
        for (T t : source) {
            destination.add(transform.transform(t));
        }
        return destination;
    }

    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each element in the original array.
     */
    @NotNull
    public static <T, R> List<R> map(@NotNull T[] ts, @NotNull Transformer<T, R> transformer) {
        return mapTo(ts, new ArrayList<R>(ts.length), transformer);
    }


    /**
     * Appends all elements to the given [destination] collection.
     */
    @NotNull
    public static <T, C extends Collection<T>> C toCollection(@NotNull T[] elements, @NotNull C destination) {
        Collections.addAll(destination, elements);
        return destination;
    }

    /**
     * Returns a [List] all elements.
     */
    @NotNull
    public static <T> List<T> toList(@NotNull T[] elements) {
        return toCollection(elements, new ArrayList<T>(elements.length));
    }

    /**
     * Returns a [Set] all elements.
     * The returned set preserves the element iteration order of the original collection.
     */
    @NotNull
    public static <T> Set<T> toSet(@NotNull T[] elements) {
        return toCollection(elements, new LinkedHashSet<T>(Mapx.mapCapacity(elements.length)));
    }

    /**
     * Returns a [HashSet] of all elements.
     */
    @NotNull
    public static <T> HashSet<T> toHashSet(@NotNull T[] elements) {
        return toCollection(elements, new HashSet<T>(Mapx.mapCapacity(elements.length)));
    }


    /**
     * Converts the contents of this byte array to a string using the specified [charset].
     */
    @NotNull
    public static String toString(@NotNull byte[] bytes, @NotNull Charset charset) {
        return new String(bytes, charset);
    }

    /**
     * Converts the contents of this byte array to a string using the specified [charset].
     */
    @NotNull
    public static String toString(@NotNull byte[] bytes) {
        return toString(bytes, Charx.UTF_8);
    }


    /**
     * Sorts the array in-place.
     */
    public static void sort(@NotNull int[] elements) {
        if (elements.length > 1) java.util.Arrays.sort(elements);
    }

    /**
     * Sorts the array in-place.
     */
    public static void sort(@NotNull long[] elements) {
        if (elements.length > 1) java.util.Arrays.sort(elements);
    }

    /**
     * Sorts the array in-place.
     */
    public static void sort(@NotNull byte[] elements) {
        if (elements.length > 1) java.util.Arrays.sort(elements);
    }

    /**
     * Sorts the array in-place.
     */
    public static void sort(@NotNull short[] elements) {
        if (elements.length > 1) java.util.Arrays.sort(elements);
    }

    /**
     * Sorts the array in-place.
     */
    public static void sort(@NotNull double[] elements) {
        if (elements.length > 1) java.util.Arrays.sort(elements);
    }

    /**
     * Sorts the array in-place.
     */
    public static void sort(@NotNull float[] elements) {
        if (elements.length > 1) java.util.Arrays.sort(elements);
    }

    /**
     * Sorts the array in-place.
     */
    public static void sort(@NotNull char[] elements) {
        if (elements.length > 1) java.util.Arrays.sort(elements);
    }

    /**
     * Sorts the array in-place according to the natural order of its elements.
     */
    public static <T extends Comparable<T>> void sort(@NotNull T[] elements) {
        sortWith(elements, new Comparisonx.NaturalOrderComparator<T>());
    }

    /**
     * Sorts the array in-place according to the natural order of its elements.
     *
     * @throws ClassCastException if any element of the array is not [Comparable].
     */
    public static <T> void sort(@NotNull T[] elements) {
        if (elements.length > 1) java.util.Arrays.sort(elements);
    }

    /**
     * Sorts a range in the array in-place.
     */
    public static <T> void sort(@NotNull T[] elements, int fromIndex, int toIndex) {
        java.util.Arrays.sort(elements, fromIndex, toIndex);
    }

    /**
     * Sorts a range in the array in-place.
     */
    public static void sort(@NotNull byte[] elements, int fromIndex, int toIndex) {
        java.util.Arrays.sort(elements, fromIndex, toIndex);
    }

    /**
     * Sorts a range in the array in-place.
     */
    public static void sort(@NotNull short[] elements, int fromIndex, int toIndex) {
        java.util.Arrays.sort(elements, fromIndex, toIndex);
    }

    /**
     * Sorts a range in the array in-place.
     */
    public static void sort(@NotNull int[] elements, int fromIndex, int toIndex) {
        java.util.Arrays.sort(elements, fromIndex, toIndex);
    }

    /**
     * Sorts a range in the array in-place.
     */
    public static void sort(@NotNull long[] elements, int fromIndex, int toIndex) {
        java.util.Arrays.sort(elements, fromIndex, toIndex);
    }

    /**
     * Sorts a range in the array in-place.
     */
    public static void sort(@NotNull float[] elements, int fromIndex, int toIndex) {
        java.util.Arrays.sort(elements, fromIndex, toIndex);
    }

    /**
     * Sorts a range in the array in-place.
     */
    public static void sort(@NotNull double[] elements, int fromIndex, int toIndex) {
        java.util.Arrays.sort(elements, fromIndex, toIndex);
    }

    /**
     * Sorts a range in the array in-place.
     */
    public static void sort(@NotNull char[] elements, int fromIndex, int toIndex) {
        java.util.Arrays.sort(elements, fromIndex, toIndex);
    }

//    /**
//     * Sorts elements in the array in-place according to natural sort order of the value returned by specified [selector] function.
//     */
//    public inline fun <T, R : Comparable<R>> Array<out T>.sortBy(crossinline selector: (T) -> R?): Unit {
//        if (size > 1) sortWith(compareBy(selector))
//    }
//
//    /**
//     * Sorts elements in the array in-place descending according to natural sort order of the value returned by specified [selector] function.
//     */
//    public inline fun <T, R : Comparable<R>> Array<out T>.sortByDescending(crossinline selector: (T) -> R?): Unit {
//        if (size > 1) sortWith(compareByDescending(selector))
//    }
//
///**
// * Sorts elements in the array in-place descending according to their natural sort order.
// */
//    public fun <T : Comparable<T>> Array<out T>.sortDescending(): Unit {
//        sortWith(reverseOrder())
//    }
//
//    /**
//     * Sorts elements in the array in-place descending according to their natural sort order.
//     */
//    public fun ByteArray.sortDescending(): Unit {
//        if (size > 1) {
//            sort()
//            reverse()
//        }
//    }
//
//    /**
//     * Sorts elements in the array in-place descending according to their natural sort order.
//     */
//    public fun ShortArray.sortDescending(): Unit {
//        if (size > 1) {
//            sort()
//            reverse()
//        }
//    }
//
//    /**
//     * Sorts elements in the array in-place descending according to their natural sort order.
//     */
//    public fun IntArray.sortDescending(): Unit {
//        if (size > 1) {
//            sort()
//            reverse()
//        }
//    }
//
//    /**
//     * Sorts elements in the array in-place descending according to their natural sort order.
//     */
//    public fun LongArray.sortDescending(): Unit {
//        if (size > 1) {
//            sort()
//            reverse()
//        }
//    }
//
//    /**
//     * Sorts elements in the array in-place descending according to their natural sort order.
//     */
//    public fun FloatArray.sortDescending(): Unit {
//        if (size > 1) {
//            sort()
//            reverse()
//        }
//    }
//
//    /**
//     * Sorts elements in the array in-place descending according to their natural sort order.
//     */
//    public fun DoubleArray.sortDescending(): Unit {
//        if (size > 1) {
//            sort()
//            reverse()
//        }
//    }
//
//    /**
//     * Sorts elements in the array in-place descending according to their natural sort order.
//     */
//    public fun CharArray.sortDescending(): Unit {
//        if (size > 1) {
//            sort()
//            reverse()
//        }
//    }
//
///**
// * Returns a list of all elements sorted according to their natural sort order.
// */
//    public fun <T : Comparable<T>> Array<out T>.sorted(): List<T> {
//        return sortedArray().asList()
//    }
//
//    /**
//     * Returns a list of all elements sorted according to their natural sort order.
//     */
//    public fun ByteArray.sorted(): List<Byte> {
//        return toTypedArray().apply { sort() }.asList()
//    }
//
//    /**
//     * Returns a list of all elements sorted according to their natural sort order.
//     */
//    public fun ShortArray.sorted(): List<Short> {
//        return toTypedArray().apply { sort() }.asList()
//    }
//
//    /**
//     * Returns a list of all elements sorted according to their natural sort order.
//     */
//    public fun IntArray.sorted(): List<Int> {
//        return toTypedArray().apply { sort() }.asList()
//    }
//
//    /**
//     * Returns a list of all elements sorted according to their natural sort order.
//     */
//    public fun LongArray.sorted(): List<Long> {
//        return toTypedArray().apply { sort() }.asList()
//    }
//
//    /**
//     * Returns a list of all elements sorted according to their natural sort order.
//     */
//    public fun FloatArray.sorted(): List<Float> {
//        return toTypedArray().apply { sort() }.asList()
//    }
//
//    /**
//     * Returns a list of all elements sorted according to their natural sort order.
//     */
//    public fun DoubleArray.sorted(): List<Double> {
//        return toTypedArray().apply { sort() }.asList()
//    }
//
//    /**
//     * Returns a list of all elements sorted according to their natural sort order.
//     */
//    public fun CharArray.sorted(): List<Char> {
//        return toTypedArray().apply { sort() }.asList()
//    }
//
///**
// * Returns an array with all elements of this array sorted according to their natural sort order.
// */
//    public fun <T : Comparable<T>> Array<T>.sortedArray(): Array<T> {
//        if (isEmpty()) return this
//        return this.copyOf().apply { sort() }
//    }
//
//    /**
//     * Returns an array with all elements of this array sorted according to their natural sort order.
//     */
//    public fun ByteArray.sortedArray(): ByteArray {
//        if (isEmpty()) return this
//        return this.copyOf().apply { sort() }
//    }
//
//    /**
//     * Returns an array with all elements of this array sorted according to their natural sort order.
//     */
//    public fun ShortArray.sortedArray(): ShortArray {
//        if (isEmpty()) return this
//        return this.copyOf().apply { sort() }
//    }
//
//    /**
//     * Returns an array with all elements of this array sorted according to their natural sort order.
//     */
//    public fun IntArray.sortedArray(): IntArray {
//        if (isEmpty()) return this
//        return this.copyOf().apply { sort() }
//    }
//
//    /**
//     * Returns an array with all elements of this array sorted according to their natural sort order.
//     */
//    public fun LongArray.sortedArray(): LongArray {
//        if (isEmpty()) return this
//        return this.copyOf().apply { sort() }
//    }
//
//    /**
//     * Returns an array with all elements of this array sorted according to their natural sort order.
//     */
//    public fun FloatArray.sortedArray(): FloatArray {
//        if (isEmpty()) return this
//        return this.copyOf().apply { sort() }
//    }
//
//    /**
//     * Returns an array with all elements of this array sorted according to their natural sort order.
//     */
//    public fun DoubleArray.sortedArray(): DoubleArray {
//        if (isEmpty()) return this
//        return this.copyOf().apply { sort() }
//    }
//
//    /**
//     * Returns an array with all elements of this array sorted according to their natural sort order.
//     */
//    public fun CharArray.sortedArray(): CharArray {
//        if (isEmpty()) return this
//        return this.copyOf().apply { sort() }
//    }
//
///**
// * Returns an array with all elements of this array sorted descending according to their natural sort order.
// */
//    public fun <T : Comparable<T>> Array<T>.sortedArrayDescending(): Array<T> {
//        if (isEmpty()) return this
//        return this.copyOf().apply { sortWith(reverseOrder()) }
//    }
//
//    /**
//     * Returns an array with all elements of this array sorted descending according to their natural sort order.
//     */
//    public fun ByteArray.sortedArrayDescending(): ByteArray {
//        if (isEmpty()) return this
//        return this.copyOf().apply { sortDescending() }
//    }
//
//    /**
//     * Returns an array with all elements of this array sorted descending according to their natural sort order.
//     */
//    public fun ShortArray.sortedArrayDescending(): ShortArray {
//        if (isEmpty()) return this
//        return this.copyOf().apply { sortDescending() }
//    }
//
//    /**
//     * Returns an array with all elements of this array sorted descending according to their natural sort order.
//     */
//    public fun IntArray.sortedArrayDescending(): IntArray {
//        if (isEmpty()) return this
//        return this.copyOf().apply { sortDescending() }
//    }
//
//    /**
//     * Returns an array with all elements of this array sorted descending according to their natural sort order.
//     */
//    public fun LongArray.sortedArrayDescending(): LongArray {
//        if (isEmpty()) return this
//        return this.copyOf().apply { sortDescending() }
//    }
//
//    /**
//     * Returns an array with all elements of this array sorted descending according to their natural sort order.
//     */
//    public fun FloatArray.sortedArrayDescending(): FloatArray {
//        if (isEmpty()) return this
//        return this.copyOf().apply { sortDescending() }
//    }
//
//    /**
//     * Returns an array with all elements of this array sorted descending according to their natural sort order.
//     */
//    public fun DoubleArray.sortedArrayDescending(): DoubleArray {
//        if (isEmpty()) return this
//        return this.copyOf().apply { sortDescending() }
//    }
//
//    /**
//     * Returns an array with all elements of this array sorted descending according to their natural sort order.
//     */
//    public fun CharArray.sortedArrayDescending(): CharArray {
//        if (isEmpty()) return this
//        return this.copyOf().apply { sortDescending() }
//    }
//
//    /**
//     * Returns an array with all elements of this array sorted according the specified [comparator].
//     */
//    public fun <T> Array<out T>.sortedArrayWith(comparator: Comparator<in T>): Array<out T> {
//        if (isEmpty()) return this
//        return this.copyOf().apply { sortWith(comparator) }
//    }
//
//    /**
//     * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
//     */
//    public inline fun <T, R : Comparable<R>> Array<out T>.sortedBy(crossinline selector: (T) -> R?): List<T> {
//        return sortedWith(compareBy(selector))
//    }
//
//    /**
//     * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
//     */
//    public inline fun <R : Comparable<R>> ByteArray.sortedBy(crossinline selector: (Byte) -> R?): List<Byte> {
//        return sortedWith(compareBy(selector))
//    }
//
//    /**
//     * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
//     */
//    public inline fun <R : Comparable<R>> ShortArray.sortedBy(crossinline selector: (Short) -> R?): List<Short> {
//        return sortedWith(compareBy(selector))
//    }
//
//    /**
//     * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
//     */
//    public inline fun <R : Comparable<R>> IntArray.sortedBy(crossinline selector: (Int) -> R?): List<Int> {
//        return sortedWith(compareBy(selector))
//    }
//
//    /**
//     * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
//     */
//    public inline fun <R : Comparable<R>> LongArray.sortedBy(crossinline selector: (Long) -> R?): List<Long> {
//        return sortedWith(compareBy(selector))
//    }
//
//    /**
//     * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
//     */
//    public inline fun <R : Comparable<R>> FloatArray.sortedBy(crossinline selector: (Float) -> R?): List<Float> {
//        return sortedWith(compareBy(selector))
//    }
//
//    /**
//     * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
//     */
//    public inline fun <R : Comparable<R>> DoubleArray.sortedBy(crossinline selector: (Double) -> R?): List<Double> {
//        return sortedWith(compareBy(selector))
//    }
//
//    /**
//     * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
//     */
//    public inline fun <R : Comparable<R>> BooleanArray.sortedBy(crossinline selector: (Boolean) -> R?): List<Boolean> {
//        return sortedWith(compareBy(selector))
//    }
//
//    /**
//     * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
//     */
//    public inline fun <R : Comparable<R>> CharArray.sortedBy(crossinline selector: (Char) -> R?): List<Char> {
//        return sortedWith(compareBy(selector))
//    }
//
//    /**
//     * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
//     */
//    public inline fun <T, R : Comparable<R>> Array<out T>.sortedByDescending(crossinline selector: (T) -> R?): List<T> {
//        return sortedWith(compareByDescending(selector))
//    }
//
//    /**
//     * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
//     */
//    public inline fun <R : Comparable<R>> ByteArray.sortedByDescending(crossinline selector: (Byte) -> R?): List<Byte> {
//        return sortedWith(compareByDescending(selector))
//    }
//
//    /**
//     * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
//     */
//    public inline fun <R : Comparable<R>> ShortArray.sortedByDescending(crossinline selector: (Short) -> R?): List<Short> {
//        return sortedWith(compareByDescending(selector))
//    }
//
//    /**
//     * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
//     */
//    public inline fun <R : Comparable<R>> IntArray.sortedByDescending(crossinline selector: (Int) -> R?): List<Int> {
//        return sortedWith(compareByDescending(selector))
//    }
//
//    /**
//     * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
//     */
//    public inline fun <R : Comparable<R>> LongArray.sortedByDescending(crossinline selector: (Long) -> R?): List<Long> {
//        return sortedWith(compareByDescending(selector))
//    }
//
//    /**
//     * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
//     */
//    public inline fun <R : Comparable<R>> FloatArray.sortedByDescending(crossinline selector: (Float) -> R?): List<Float> {
//        return sortedWith(compareByDescending(selector))
//    }
//
//    /**
//     * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
//     */
//    public inline fun <R : Comparable<R>> DoubleArray.sortedByDescending(crossinline selector: (Double) -> R?): List<Double> {
//        return sortedWith(compareByDescending(selector))
//    }
//
//    /**
//     * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
//     */
//    public inline fun <R : Comparable<R>> BooleanArray.sortedByDescending(crossinline selector: (Boolean) -> R?): List<Boolean> {
//        return sortedWith(compareByDescending(selector))
//    }
//
//    /**
//     * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
//     */
//    public inline fun <R : Comparable<R>> CharArray.sortedByDescending(crossinline selector: (Char) -> R?): List<Char> {
//        return sortedWith(compareByDescending(selector))
//    }
//
///**
// * Returns a list of all elements sorted descending according to their natural sort order.
// */
//    public fun <T : Comparable<T>> Array<out T>.sortedDescending(): List<T> {
//        return sortedWith(reverseOrder())
//    }
//
//    /**
//     * Returns a list of all elements sorted descending according to their natural sort order.
//     */
//    public fun ByteArray.sortedDescending(): List<Byte> {
//        return copyOf().apply { sort() }.reversed()
//    }
//
//    /**
//     * Returns a list of all elements sorted descending according to their natural sort order.
//     */
//    public fun ShortArray.sortedDescending(): List<Short> {
//        return copyOf().apply { sort() }.reversed()
//    }
//
//    /**
//     * Returns a list of all elements sorted descending according to their natural sort order.
//     */
//    public fun IntArray.sortedDescending(): List<Int> {
//        return copyOf().apply { sort() }.reversed()
//    }
//
//    /**
//     * Returns a list of all elements sorted descending according to their natural sort order.
//     */
//    public fun LongArray.sortedDescending(): List<Long> {
//        return copyOf().apply { sort() }.reversed()
//    }
//
//    /**
//     * Returns a list of all elements sorted descending according to their natural sort order.
//     */
//    public fun FloatArray.sortedDescending(): List<Float> {
//        return copyOf().apply { sort() }.reversed()
//    }
//
//    /**
//     * Returns a list of all elements sorted descending according to their natural sort order.
//     */
//    public fun DoubleArray.sortedDescending(): List<Double> {
//        return copyOf().apply { sort() }.reversed()
//    }
//
//    /**
//     * Returns a list of all elements sorted descending according to their natural sort order.
//     */
//    public fun CharArray.sortedDescending(): List<Char> {
//        return copyOf().apply { sort() }.reversed()
//    }
//
//    /**
//     * Returns a list of all elements sorted according to the specified [comparator].
//     */
//    public fun <T> Array<out T>.sortedWith(comparator: Comparator<in T>): List<T> {
//        return sortedArrayWith(comparator).asList()
//    }
//
//    /**
//     * Returns a list of all elements sorted according to the specified [comparator].
//     */
//    public fun ByteArray.sortedWith(comparator: Comparator<in Byte>): List<Byte> {
//        return toTypedArray().apply { sortWith(comparator) }.asList()
//    }
//
//    /**
//     * Returns a list of all elements sorted according to the specified [comparator].
//     */
//    public fun ShortArray.sortedWith(comparator: Comparator<in Short>): List<Short> {
//        return toTypedArray().apply { sortWith(comparator) }.asList()
//    }
//
//    /**
//     * Returns a list of all elements sorted according to the specified [comparator].
//     */
//    public fun IntArray.sortedWith(comparator: Comparator<in Int>): List<Int> {
//        return toTypedArray().apply { sortWith(comparator) }.asList()
//    }
//
//    /**
//     * Returns a list of all elements sorted according to the specified [comparator].
//     */
//    public fun LongArray.sortedWith(comparator: Comparator<in Long>): List<Long> {
//        return toTypedArray().apply { sortWith(comparator) }.asList()
//    }
//
//    /**
//     * Returns a list of all elements sorted according to the specified [comparator].
//     */
//    public fun FloatArray.sortedWith(comparator: Comparator<in Float>): List<Float> {
//        return toTypedArray().apply { sortWith(comparator) }.asList()
//    }
//
//    /**
//     * Returns a list of all elements sorted according to the specified [comparator].
//     */
//    public fun DoubleArray.sortedWith(comparator: Comparator<in Double>): List<Double> {
//        return toTypedArray().apply { sortWith(comparator) }.asList()
//    }
//
//    /**
//     * Returns a list of all elements sorted according to the specified [comparator].
//     */
//    public fun BooleanArray.sortedWith(comparator: Comparator<in Boolean>): List<Boolean> {
//        return toTypedArray().apply { sortWith(comparator) }.asList()
//    }
//
//    /**
//     * Returns a list of all elements sorted according to the specified [comparator].
//     */
//    public fun CharArray.sortedWith(comparator: Comparator<in Char>): List<Char> {
//        return toTypedArray().apply { sortWith(comparator) }.asList()
//    }

    /**
     * Sorts the array in-place according to the order specified by the given [comparator].
     */
    public static <T> void sortWith(@NotNull T[] elements, @NotNull Comparator<T> comparator) {
        if (elements.length > 1) java.util.Arrays.sort(elements, comparator);
    }

    /**
     * Sorts a range in the array in-place with the given [comparator].
     */
    public static <T> void sortWith(@NotNull T[] elements, @NotNull Comparator<T> comparator, int fromIndex, int toIndex) {
        java.util.Arrays.sort(elements, fromIndex, toIndex, comparator);
    }


    /**
     * Returns the single element, or throws an exception if the array is empty or has more than one element.
     */
    @NotNull
    public static <T> T single(@NotNull T[] elements) {
        if (elements.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (elements.length == 1) {
            return elements[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /**
     * Returns the single element, or throws an exception if the array is empty or has more than one element.
     */
    public static char single(@NotNull char[] elements) {
        if (elements.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (elements.length == 1) {
            return elements[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /**
     * Returns the single element, or throws an exception if the array is empty or has more than one element.
     */
    public static byte single(@NotNull byte[] elements) {
        if (elements.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (elements.length == 1) {
            return elements[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /**
     * Returns the single element, or throws an exception if the array is empty or has more than one element.
     */
    public static short single(@NotNull short[] elements) {
        if (elements.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (elements.length == 1) {
            return elements[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /**
     * Returns the single element, or throws an exception if the array is empty or has more than one element.
     */
    public static int single(@NotNull int[] elements) {
        if (elements.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (elements.length == 1) {
            return elements[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /**
     * Returns the single element, or throws an exception if the array is empty or has more than one element.
     */
    public static long single(@NotNull long[] elements) {
        if (elements.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (elements.length == 1) {
            return elements[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /**
     * Returns the single element, or throws an exception if the array is empty or has more than one element.
     */
    public static float single(@NotNull float[] elements) {
        if (elements.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (elements.length == 1) {
            return elements[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /**
     * Returns the single element, or throws an exception if the array is empty or has more than one element.
     */
    public static double single(@NotNull double[] elements) {
        if (elements.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (elements.length == 1) {
            return elements[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /**
     * Returns the single element, or throws an exception if the array is empty or has more than one element.
     */
    public static boolean single(@NotNull boolean[] elements) {
        if (elements.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (elements.length == 1) {
            return elements[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /**
     * Returns single element, or `null` if the array is empty or has more than one element.
     */
    @Nullable
    public static <T> T singleOrNull(@NotNull T[] elements) {
        return elements.length == 1 ? elements[0] : null;
    }

    /**
     * Returns single element, or `null` if the array is empty or has more than one element.
     */
    @Nullable
    public static Character singleOrNull(@NotNull char[] elements) {
        return elements.length == 1 ? elements[0] : null;
    }

    /**
     * Returns single element, or `null` if the array is empty or has more than one element.
     */
    @Nullable
    public static Byte singleOrNull(@NotNull byte[] elements) {
        return elements.length == 1 ? elements[0] : null;
    }

    /**
     * Returns single element, or `null` if the array is empty or has more than one element.
     */
    @Nullable
    public static Short singleOrNull(@NotNull short[] elements) {
        return elements.length == 1 ? elements[0] : null;
    }

    /**
     * Returns single element, or `null` if the array is empty or has more than one element.
     */
    @Nullable
    public static Integer singleOrNull(@NotNull int[] elements) {
        return elements.length == 1 ? elements[0] : null;
    }

    /**
     * Returns single element, or `null` if the array is empty or has more than one element.
     */
    @Nullable
    public static Long singleOrNull(@NotNull long[] elements) {
        return elements.length == 1 ? elements[0] : null;
    }

    /**
     * Returns single element, or `null` if the array is empty or has more than one element.
     */
    @Nullable
    public static Float singleOrNull(@NotNull float[] elements) {
        return elements.length == 1 ? elements[0] : null;
    }

    /**
     * Returns single element, or `null` if the array is empty or has more than one element.
     */
    @Nullable
    public static Double singleOrNull(@NotNull double[] elements) {
        return elements.length == 1 ? elements[0] : null;
    }

    /**
     * Returns single element, or `null` if the array is empty or has more than one element.
     */
    @Nullable
    public static Boolean singleOrNull(@NotNull boolean[] elements) {
        return elements.length == 1 ? elements[0] : null;
    }

    /**
     * Returns the single element matching the given [predicate], or throws exception if there is no or more than one matching element.
     */
    @NotNull
    public static <T> T single(@NotNull T[] elements, @NotNull Predicate<T> predicate) {
        T single = null;
        boolean found = false;
        for (T element : elements) {
            if (predicate.predicate(element)) {
                if (found) throw new IllegalArgumentException("Array contains more than one matching element.");
                single = element;
                found = true;
            }
        }
        if (!found) throw new NoSuchElementException("Array contains no element matching the predicate.");
        return single;
    }

    /**
     * Returns the single element matching the given [predicate], or throws exception if there is no or more than one matching element.
     */
    public static char single(@NotNull char[] elements, @NotNull Predicate<Character> predicate) {
        char single = 0;
        boolean found = false;
        for (char element : elements) {
            if (predicate.predicate(element)) {
                if (found) throw new IllegalArgumentException("Array contains more than one matching element.");
                single = element;
                found = true;
            }
        }
        if (!found) throw new NoSuchElementException("Array contains no element matching the predicate.");
        return single;
    }

    /**
     * Returns the single element matching the given [predicate], or throws exception if there is no or more than one matching element.
     */
    public static byte single(@NotNull byte[] elements, @NotNull Predicate<Byte> predicate) {
        byte single = 0;
        boolean found = false;
        for (byte element : elements) {
            if (predicate.predicate(element)) {
                if (found) throw new IllegalArgumentException("Array contains more than one matching element.");
                single = element;
                found = true;
            }
        }
        if (!found) throw new NoSuchElementException("Array contains no element matching the predicate.");
        return single;
    }

    /**
     * Returns the single element matching the given [predicate], or throws exception if there is no or more than one matching element.
     */
    public static short single(@NotNull short[] elements, @NotNull Predicate<Short> predicate) {
        short single = 0;
        boolean found = false;
        for (short element : elements) {
            if (predicate.predicate(element)) {
                if (found) throw new IllegalArgumentException("Array contains more than one matching element.");
                single = element;
                found = true;
            }
        }
        if (!found) throw new NoSuchElementException("Array contains no element matching the predicate.");
        return single;
    }

    /**
     * Returns the single element matching the given [predicate], or throws exception if there is no or more than one matching element.
     */
    public static int single(@NotNull int[] elements, @NotNull Predicate<Integer> predicate) {
        int single = 0;
        boolean found = false;
        for (int element : elements) {
            if (predicate.predicate(element)) {
                if (found) throw new IllegalArgumentException("Array contains more than one matching element.");
                single = element;
                found = true;
            }
        }
        if (!found) throw new NoSuchElementException("Array contains no element matching the predicate.");
        return single;
    }

    /**
     * Returns the single element matching the given [predicate], or throws exception if there is no or more than one matching element.
     */
    public static long single(@NotNull long[] elements, @NotNull Predicate<Long> predicate) {
        long single = 0;
        boolean found = false;
        for (long element : elements) {
            if (predicate.predicate(element)) {
                if (found) throw new IllegalArgumentException("Array contains more than one matching element.");
                single = element;
                found = true;
            }
        }
        if (!found) throw new NoSuchElementException("Array contains no element matching the predicate.");
        return single;
    }

    /**
     * Returns the single element matching the given [predicate], or throws exception if there is no or more than one matching element.
     */
    public static float single(@NotNull float[] elements, @NotNull Predicate<Float> predicate) {
        float single = 0;
        boolean found = false;
        for (float element : elements) {
            if (predicate.predicate(element)) {
                if (found) throw new IllegalArgumentException("Array contains more than one matching element.");
                single = element;
                found = true;
            }
        }
        if (!found) throw new NoSuchElementException("Array contains no element matching the predicate.");
        return single;
    }

    /**
     * Returns the single element matching the given [predicate], or throws exception if there is no or more than one matching element.
     */
    public static double single(@NotNull double[] elements, @NotNull Predicate<Double> predicate) {
        double single = 0;
        boolean found = false;
        for (double element : elements) {
            if (predicate.predicate(element)) {
                if (found) throw new IllegalArgumentException("Array contains more than one matching element.");
                single = element;
                found = true;
            }
        }
        if (!found) throw new NoSuchElementException("Array contains no element matching the predicate.");
        return single;
    }

    /**
     * Returns the single element matching the given [predicate], or throws exception if there is no or more than one matching element.
     */
    public boolean single(@NotNull boolean[] elements, @NotNull Predicate<Boolean> predicate) {
        boolean single = false;
        boolean found = false;
        for (boolean element : elements) {
            if (predicate.predicate(element)) {
                if (found) throw new IllegalArgumentException("Array contains more than one matching element.");
                single = element;
                found = true;
            }
        }
        if (!found) throw new NoSuchElementException("Array contains no element matching the predicate.");
        return single;
    }

    /**
     * Returns the single element matching the given [predicate], or `null` if element was not found or more than one element was found.
     */
    @Nullable
    public static <T> T singleOrNull(@NotNull T[] elements, @NotNull Predicate<T> predicate) {
        T single = null;
        boolean found = false;
        for (T element : elements) {
            if (predicate.predicate(element)) {
                if (found) return null;
                single = element;
                found = true;
            }
        }
        if (!found) return null;
        return single;
    }

    /**
     * Returns the single element matching the given [predicate], or `null` if element was not found or more than one element was found.
     */
    @Nullable
    public static Character singleOrNull(@NotNull char[] elements, @NotNull Predicate<Character> predicate) {
        char single = 0;
        boolean found = false;
        for (char element : elements) {
            if (predicate.predicate(element)) {
                if (found) return null;
                single = element;
                found = true;
            }
        }
        if (!found) return null;
        return single;
    }

    /**
     * Returns the single element matching the given [predicate], or `null` if element was not found or more than one element was found.
     */
    @Nullable
    public static Byte singleOrNull(@NotNull byte[] elements, @NotNull Predicate<Byte> predicate) {
        byte single = 0;
        boolean found = false;
        for (byte element : elements) {
            if (predicate.predicate(element)) {
                if (found) return null;
                single = element;
                found = true;
            }
        }
        if (!found) return null;
        return single;
    }

    /**
     * Returns the single element matching the given [predicate], or `null` if element was not found or more than one element was found.
     */
    @Nullable
    public static Short singleOrNull(@NotNull short[] elements, @NotNull Predicate<Short> predicate) {
        short single = 0;
        boolean found = false;
        for (short element : elements) {
            if (predicate.predicate(element)) {
                if (found) return null;
                single = element;
                found = true;
            }
        }
        if (!found) return null;
        return single;
    }

    /**
     * Returns the single element matching the given [predicate], or `null` if element was not found or more than one element was found.
     */
    @Nullable
    public static Integer singleOrNull(@NotNull int[] elements, @NotNull Predicate<Integer> predicate) {
        int single = 0;
        boolean found = false;
        for (int element : elements) {
            if (predicate.predicate(element)) {
                if (found) return null;
                single = element;
                found = true;
            }
        }
        if (!found) return null;
        return single;
    }

    /**
     * Returns the single element matching the given [predicate], or `null` if element was not found or more than one element was found.
     */
    @Nullable
    public static Long singleOrNull(@NotNull long[] elements, @NotNull Predicate<Long> predicate) {
        long single = 0;
        boolean found = false;
        for (long element : elements) {
            if (predicate.predicate(element)) {
                if (found) return null;
                single = element;
                found = true;
            }
        }
        if (!found) return null;
        return single;
    }

    /**
     * Returns the single element matching the given [predicate], or `null` if element was not found or more than one element was found.
     */
    @Nullable
    public static Float singleOrNull(@NotNull float[] elements, @NotNull Predicate<Float> predicate) {
        float single = 0;
        boolean found = false;
        for (float element : elements) {
            if (predicate.predicate(element)) {
                if (found) return null;
                single = element;
                found = true;
            }
        }
        if (!found) return null;
        return single;
    }

    /**
     * Returns the single element matching the given [predicate], or `null` if element was not found or more than one element was found.
     */
    @Nullable
    public static Double singleOrNull(@NotNull double[] elements, @NotNull Predicate<Double> predicate) {
        double single = 0;
        boolean found = false;
        for (double element : elements) {
            if (predicate.predicate(element)) {
                if (found) return null;
                single = element;
                found = true;
            }
        }
        if (!found) return null;
        return single;
    }

    /**
     * Returns the single element matching the given [predicate], or `null` if element was not found or more than one element was found.
     */
    @Nullable
    public static Boolean singleOrNull(@NotNull boolean[] elements, @NotNull Predicate<Boolean> predicate) {
        boolean single = false;
        boolean found = false;
        for (boolean element : elements) {
            if (predicate.predicate(element)) {
                if (found) return null;
                single = element;
                found = true;
            }
        }
        if (!found) return null;
        return single;
    }

    /**
     * Returns `true` if array has at least one element.
     */
    public static <T> boolean any(T[] elements) {
        return !isEmpty(elements);
    }

    /**
     * Returns `true` if array has at least one element.
     */
    public static boolean any(@NotNull byte[] elements) {
        return !isEmpty(elements);
    }

    /**
     * Returns `true` if array has at least one element.
     */
    public static boolean any(@NotNull short[] elements) {
        return !isEmpty(elements);
    }

    /**
     * Returns `true` if array has at least one element.
     */
    public static boolean any(@NotNull int[] elements) {
        return !isEmpty(elements);
    }

    /**
     * Returns `true` if array has at least one element.
     */
    public static boolean any(@NotNull long[] elements) {
        return !isEmpty(elements);
    }

    /**
     * Returns `true` if array has at least one element.
     */
    public static boolean any(@NotNull float[] elements) {
        return !isEmpty(elements);
    }

    /**
     * Returns `true` if array has at least one element.
     */
    public static boolean any(@NotNull double[] elements) {
        return !isEmpty(elements);
    }

    /**
     * Returns `true` if array has at least one element.
     */
    public static boolean any(@NotNull boolean[] elements) {
        return !isEmpty(elements);
    }

    /**
     * Returns `true` if array has at least one element.
     */
    public static boolean any(@NotNull char[] elements) {
        return !isEmpty(elements);
    }

    /**
     * Returns `true` if at least one element matches the given [predicate].
     */
    public static <T> boolean any(@NotNull T[] elements, @NotNull Predicate<T> predicate) {
        for (T element : elements) if (predicate.predicate(element)) return true;
        return false;
    }

    /**
     * Returns `true` if at least one element matches the given [predicate].
     */
    public static boolean any(@NotNull byte[] elements, @NotNull Predicate<Byte> predicate) {
        for (byte element : elements) if (predicate.predicate(element)) return true;
        return false;
    }

    /**
     * Returns `true` if at least one element matches the given [predicate].
     */
    public static boolean any(@NotNull short[] elements, @NotNull Predicate<Short> predicate) {
        for (short element : elements) if (predicate.predicate(element)) return true;
        return false;
    }

    /**
     * Returns `true` if at least one element matches the given [predicate].
     */
    public static boolean any(@NotNull int[] elements, @NotNull Predicate<Integer> predicate) {
        for (int element : elements) if (predicate.predicate(element)) return true;
        return false;
    }

    /**
     * Returns `true` if at least one element matches the given [predicate].
     */
    public static boolean any(@NotNull long[] elements, @NotNull Predicate<Long> predicate) {
        for (long element : elements) if (predicate.predicate(element)) return true;
        return false;
    }

    /**
     * Returns `true` if at least one element matches the given [predicate].
     */
    public static boolean any(@NotNull float[] elements, @NotNull Predicate<Float> predicate) {
        for (float element : elements) if (predicate.predicate(element)) return true;
        return false;
    }

    /**
     * Returns `true` if at least one element matches the given [predicate].
     */
    public static boolean any(@NotNull double[] elements, @NotNull Predicate<Double> predicate) {
        for (double element : elements) if (predicate.predicate(element)) return true;
        return false;
    }

    /**
     * Returns `true` if at least one element matches the given [predicate].
     */
    public static boolean any(@NotNull boolean[] elements, @NotNull Predicate<Boolean> predicate) {
        for (boolean element : elements) if (predicate.predicate(element)) return true;
        return false;
    }

    /**
     * Returns `true` if at least one element matches the given [predicate].
     */
    public static boolean any(@NotNull char[] elements, @NotNull Predicate<Character> predicate) {
        for (char element : elements) if (predicate.predicate(element)) return true;
        return false;
    }

    /**
     * Returns new array which is a copy of the original array.
     */
    @NotNull
    public static <T> T[] copyOf(@NotNull T[] elements) {
        return java.util.Arrays.copyOf(elements, elements.length);
    }

    /**
     * Returns new array which is a copy of the original array.
     */
    @NotNull
    public static byte[] copyOf(@NotNull byte[] elements) {
        return java.util.Arrays.copyOf(elements, elements.length);
    }

    /**
     * Returns new array which is a copy of the original array.
     */
    @NotNull
    public static short[] copyOf(@NotNull short[] elements) {
        return java.util.Arrays.copyOf(elements, elements.length);
    }

    /**
     * Returns new array which is a copy of the original array.
     */
    @NotNull
    public static int[] copyOf(@NotNull int[] elements) {
        return java.util.Arrays.copyOf(elements, elements.length);
    }

    /**
     * Returns new array which is a copy of the original array.
     */
    @NotNull
    public static long[] copyOf(@NotNull long[] elements) {
        return java.util.Arrays.copyOf(elements, elements.length);
    }

    /**
     * Returns new array which is a copy of the original array.
     */
    @NotNull
    public static float[] copyOf(@NotNull float[] elements) {
        return java.util.Arrays.copyOf(elements, elements.length);
    }

    /**
     * Returns new array which is a copy of the original array.
     */
    @NotNull
    public static double[] copyOf(@NotNull double[] elements) {
        return java.util.Arrays.copyOf(elements, elements.length);
    }

    /**
     * Returns new array which is a copy of the original array.
     */
    @NotNull
    public static boolean[] copyOf(@NotNull boolean[] elements) {
        return java.util.Arrays.copyOf(elements, elements.length);
    }

    /**
     * Returns new array which is a copy of the original array.
     */
    @NotNull
    public static char[] copyOf(@NotNull char[] elements) {
        return java.util.Arrays.copyOf(elements, elements.length);
    }

    /**
     * Returns new array which is a copy of the original array, resized to the given [newSize].
     */
    @NotNull
    public static byte[] copyOf(@NotNull byte[] elements, int newSize) {
        return java.util.Arrays.copyOf(elements, newSize);
    }

    /**
     * Returns new array which is a copy of the original array, resized to the given [newSize].
     */
    @NotNull
    public static short[] copyOf(@NotNull short[] elements, int newSize) {
        return java.util.Arrays.copyOf(elements, newSize);
    }

    /**
     * Returns new array which is a copy of the original array, resized to the given [newSize].
     */
    @NotNull
    public static int[] copyOf(@NotNull int[] elements, int newSize) {
        return java.util.Arrays.copyOf(elements, newSize);
    }

    /**
     * Returns new array which is a copy of the original array, resized to the given [newSize].
     */
    @NotNull
    public static long[] copyOf(@NotNull long[] elements, int newSize) {
        return java.util.Arrays.copyOf(elements, newSize);
    }

    /**
     * Returns new array which is a copy of the original array, resized to the given [newSize].
     */
    @NotNull
    public static float[] copyOf(@NotNull float[] elements, int newSize) {
        return java.util.Arrays.copyOf(elements, newSize);
    }

    /**
     * Returns new array which is a copy of the original array, resized to the given [newSize].
     */
    @NotNull
    public static double[] copyOf(@NotNull double[] elements, int newSize) {
        return java.util.Arrays.copyOf(elements, newSize);
    }

    /**
     * Returns new array which is a copy of the original array, resized to the given [newSize].
     */
    @NotNull
    public static boolean[] copyOf(@NotNull boolean[] elements, int newSize) {
        return java.util.Arrays.copyOf(elements, newSize);
    }

    /**
     * Returns new array which is a copy of the original array, resized to the given [newSize].
     */
    @NotNull
    public static char[] copyOf(@NotNull char[] elements, int newSize) {
        return java.util.Arrays.copyOf(elements, newSize);
    }

    /**
     * Returns new array which is a copy of the original array, resized to the given [newSize].
     */
    @NotNull
    public static <T> T[] copyOf(@NotNull T[] elements, int newSize) {
        return java.util.Arrays.copyOf(elements, newSize);
    }

    /**
     * Returns new array which is a copy of range of original array.
     */
    @NotNull
    public static <T> T[] copyOfRange(@NotNull T[] elements, int fromIndex, int toIndex) {
        return java.util.Arrays.copyOfRange(elements, fromIndex, toIndex);
    }

    /**
     * Returns new array which is a copy of range of original array.
     */
    @NotNull
    public static byte[] copyOfRange(@NotNull byte[] elements, int fromIndex, int toIndex) {
        return java.util.Arrays.copyOfRange(elements, fromIndex, toIndex);
    }

    /**
     * Returns new array which is a copy of range of original array.
     */
    @NotNull
    public static short[] copyOfRange(@NotNull short[] elements, int fromIndex, int toIndex) {
        return java.util.Arrays.copyOfRange(elements, fromIndex, toIndex);
    }

    /**
     * Returns new array which is a copy of range of original array.
     */
    @NotNull
    public static int[] copyOfRange(@NotNull int[] elements, int fromIndex, int toIndex) {
        return java.util.Arrays.copyOfRange(elements, fromIndex, toIndex);
    }

    /**
     * Returns new array which is a copy of range of original array.
     */
    @NotNull
    public static long[] copyOfRange(@NotNull long[] elements, int fromIndex, int toIndex) {
        return java.util.Arrays.copyOfRange(elements, fromIndex, toIndex);
    }

    /**
     * Returns new array which is a copy of range of original array.
     */
    @NotNull
    public static float[] copyOfRange(@NotNull float[] elements, int fromIndex, int toIndex) {
        return java.util.Arrays.copyOfRange(elements, fromIndex, toIndex);
    }

    /**
     * Returns new array which is a copy of range of original array.
     */
    @NotNull
    public static double[] copyOfRange(@NotNull double[] elements, int fromIndex, int toIndex) {
        return java.util.Arrays.copyOfRange(elements, fromIndex, toIndex);
    }

    /**
     * Returns new array which is a copy of range of original array.
     */
    @NotNull
    public static boolean[] copyOfRange(@NotNull boolean[] elements, int fromIndex, int toIndex) {
        return java.util.Arrays.copyOfRange(elements, fromIndex, toIndex);
    }

    /**
     * Returns new array which is a copy of range of original array.
     */
    @NotNull
    public static char[] copyOfRange(@NotNull char[] elements, int fromIndex, int toIndex) {
        return java.util.Arrays.copyOfRange(elements, fromIndex, toIndex);
    }

    /**
     * Return a array iterator of original array.
     */
    @NotNull
    public static <T> Iterator<T> iterator(@NotNull T[] elements) {
        return new ArrayIterator<>(elements);
    }

    /**
     * Return a array iterator of original array.
     */
    @NotNull
    public static Iterator<Byte> iterator(@NotNull byte[] elements) {
        return new ArrayByteIterator(elements);
    }

    /**
     * Return a array iterator of original array.
     */
    @NotNull
    public static Iterator<Character> iterator(@NotNull char[] elements) {
        return new ArrayCharIterator(elements);
    }

    /**
     * Return a array iterator of original array.
     */
    @NotNull
    public static Iterator<Short> iterator(@NotNull short[] elements) {
        return new ArrayShortIterator(elements);
    }

    /**
     * Return a array iterator of original array.
     */
    @NotNull
    public static Iterator<Float> iterator(@NotNull float[] elements) {
        return new ArrayFloatIterator(elements);
    }

    /**
     * Return a array iterator of original array.
     */
    @NotNull
    public static Iterator<Integer> iterator(@NotNull int[] elements) {
        return new ArrayIntIterator(elements);
    }

    /**
     * Return a array iterator of original array.
     */
    @NotNull
    public static Iterator<Double> iterator(@NotNull double[] elements) {
        return new ArrayDoubleIterator(elements);
    }

    /**
     * Return a array iterator of original array.
     */
    @NotNull
    public static Iterator<Long> iterator(@NotNull long[] elements) {
        return new ArrayLongIterator(elements);
    }

    /**
     * Return a array iterator of original array.
     */
    @NotNull
    public static Iterator<Boolean> iterator(@NotNull boolean[] elements) {
        return new ArrayBooleanIterator(elements);
    }

    /**
     * Creates an [Iterable] instance that wraps the original array returning its elements when being iterated.
     */
    @NotNull
    public static <T> Iterable<T> asIterable(@NotNull final T[] elements) {
        if (isEmpty(elements)) return Collectionx.emptyList();
        return new Iterable<T>() {
            @NotNull
            @Override
            public Iterator<T> iterator() {
                return Arrayx.iterator(elements);
            }
        };
    }

    /**
     * Creates an [Iterable] instance that wraps the original array returning its elements when being iterated.
     */
    @NotNull
    public static Iterable<Byte> asIterable(@NotNull final byte[] elements) {
        if (isEmpty(elements)) return Collectionx.emptyList();
        return new Iterable<Byte>() {
            @NotNull
            @Override
            public Iterator<Byte> iterator() {
                return Arrayx.iterator(elements);
            }
        };
    }

    /**
     * Creates an [Iterable] instance that wraps the original array returning its elements when being iterated.
     */
    @NotNull
    public static Iterable<Short> asIterable(@NotNull final short[] elements) {
        if (isEmpty(elements)) return Collectionx.emptyList();
        return new Iterable<Short>() {
            @NotNull
            @Override
            public Iterator<Short> iterator() {
                return Arrayx.iterator(elements);
            }
        };
    }

    /**
     * Creates an [Iterable] instance that wraps the original array returning its elements when being iterated.
     */
    @NotNull
    public static Iterable<Integer> asIterable(@NotNull final int[] elements) {
        if (isEmpty(elements)) return Collectionx.emptyList();
        return new Iterable<Integer>() {
            @NotNull
            @Override
            public Iterator<Integer> iterator() {
                return Arrayx.iterator(elements);
            }
        };
    }

    /**
     * Creates an [Iterable] instance that wraps the original array returning its elements when being iterated.
     */
    @NotNull
    public static Iterable<Long> asIterable(@NotNull final long[] elements) {
        if (isEmpty(elements)) return Collectionx.emptyList();
        return new Iterable<Long>() {
            @NotNull
            @Override
            public Iterator<Long> iterator() {
                return Arrayx.iterator(elements);
            }
        };
    }

    /**
     * Creates an [Iterable] instance that wraps the original array returning its elements when being iterated.
     */
    @NotNull
    public static Iterable<Float> asIterable(@NotNull final float[] elements) {
        if (isEmpty(elements)) return Collectionx.emptyList();
        return new Iterable<Float>() {
            @NotNull
            @Override
            public Iterator<Float> iterator() {
                return Arrayx.iterator(elements);
            }
        };
    }

    /**
     * Creates an [Iterable] instance that wraps the original array returning its elements when being iterated.
     */
    @NotNull
    public static Iterable<Double> asIterable(@NotNull final double[] elements) {
        if (isEmpty(elements)) return Collectionx.emptyList();
        return new Iterable<Double>() {
            @NotNull
            @Override
            public Iterator<Double> iterator() {
                return Arrayx.iterator(elements);
            }
        };
    }

    /**
     * Creates an [Iterable] instance that wraps the original array returning its elements when being iterated.
     */
    @NotNull
    public static Iterable<Boolean> asIterable(@NotNull final boolean[] elements) {
        if (isEmpty(elements)) return Collectionx.emptyList();
        return new Iterable<Boolean>() {
            @NotNull
            @Override
            public Iterator<Boolean> iterator() {
                return Arrayx.iterator(elements);
            }
        };
    }

    /**
     * Creates an [Iterable] instance that wraps the original array returning its elements when being iterated.
     */
    @NotNull
    public static Iterable<Character> asIterable(@NotNull final char[] elements) {
        if (isEmpty(elements)) return Collectionx.emptyList();
        return new Iterable<Character>() {
            @NotNull
            @Override
            public Iterator<Character> iterator() {
                return Arrayx.iterator(elements);
            }
        };
    }

    /**
     * Groups elements of the original array by the key returned by the given [keySelector] function
     * applied to each element and returns a map where each group key is associated with a list of corresponding elements.
     * <p>
     * The returned map preserves the entry iteration order of the keys produced from the original array.
     */
    @NotNull
    public static <T, K> Map<K, List<T>> groupBy(@NotNull T[] elements, @NotNull Transformer<T, K> keySelector) {
        return groupByTo(elements, new LinkedHashMap<K, List<T>>(), keySelector);
    }

    /**
     * Groups elements of the original array by the key returned by the given [keySelector] function
     * applied to each element and returns a map where each group key is associated with a list of corresponding elements.
     * <p>
     * The returned map preserves the entry iteration order of the keys produced from the original array.
     */
    @NotNull
    public static <K> Map<K, List<Byte>> groupBy(@NotNull byte[] elements, @NotNull Transformer<Byte, K> keySelector) {
        return groupByTo(elements, new LinkedHashMap<K, List<Byte>>(), keySelector);
    }

    /**
     * Groups elements of the original array by the key returned by the given [keySelector] function
     * applied to each element and returns a map where each group key is associated with a list of corresponding elements.
     * <p>
     * The returned map preserves the entry iteration order of the keys produced from the original array.
     */
    @NotNull
    public static <K> Map<K, List<Short>> groupBy(@NotNull short[] elements, @NotNull Transformer<Short, K> keySelector) {
        return groupByTo(elements, new LinkedHashMap<K, List<Short>>(), keySelector);
    }

    /**
     * Groups elements of the original array by the key returned by the given [keySelector] function
     * applied to each element and returns a map where each group key is associated with a list of corresponding elements.
     * <p>
     * The returned map preserves the entry iteration order of the keys produced from the original array.
     */
    @NotNull
    public static <K> Map<K, List<Integer>> groupBy(@NotNull int[] elements, @NotNull Transformer<Integer, K> keySelector) {
        return groupByTo(elements, new LinkedHashMap<K, List<Integer>>(), keySelector);
    }

    /**
     * Groups elements of the original array by the key returned by the given [keySelector] function
     * applied to each element and returns a map where each group key is associated with a list of corresponding elements.
     * <p>
     * The returned map preserves the entry iteration order of the keys produced from the original array.
     */
    @NotNull
    public static <K> Map<K, List<Long>> groupBy(@NotNull long[] elements, @NotNull Transformer<Long, K> keySelector) {
        return groupByTo(elements, new LinkedHashMap<K, List<Long>>(), keySelector);
    }

    /**
     * Groups elements of the original array by the key returned by the given [keySelector] function
     * applied to each element and returns a map where each group key is associated with a list of corresponding elements.
     * <p>
     * The returned map preserves the entry iteration order of the keys produced from the original array.
     */
    @NotNull
    public static <K> Map<K, List<Float>> groupBy(@NotNull float[] elements, @NotNull Transformer<Float, K> keySelector) {
        return groupByTo(elements, new LinkedHashMap<K, List<Float>>(), keySelector);
    }

    /**
     * Groups elements of the original array by the key returned by the given [keySelector] function
     * applied to each element and returns a map where each group key is associated with a list of corresponding elements.
     * <p>
     * The returned map preserves the entry iteration order of the keys produced from the original array.
     */
    @NotNull
    public static <K> Map<K, List<Double>> groupBy(@NotNull double[] elements, @NotNull Transformer<Double, K> keySelector) {
        return groupByTo(elements, new LinkedHashMap<K, List<Double>>(), keySelector);
    }

    /**
     * Groups elements of the original array by the key returned by the given [keySelector] function
     * applied to each element and returns a map where each group key is associated with a list of corresponding elements.
     * <p>
     * The returned map preserves the entry iteration order of the keys produced from the original array.
     */
    @NotNull
    public static <K> Map<K, List<Boolean>> groupBy(@NotNull boolean[] elements, @NotNull Transformer<Boolean, K> keySelector) {
        return groupByTo(elements, new LinkedHashMap<K, List<Boolean>>(), keySelector);
    }

    /**
     * Groups elements of the original array by the key returned by the given [keySelector] function
     * applied to each element and returns a map where each group key is associated with a list of corresponding elements.
     * <p>
     * The returned map preserves the entry iteration order of the keys produced from the original array.
     */
    @NotNull
    public static <K> Map<K, List<Character>> groupBy(@NotNull char[] elements, @NotNull Transformer<Character, K> keySelector) {
        return groupByTo(elements, new LinkedHashMap<K, List<Character>>(), keySelector);
    }

    /**
     * Groups values returned by the [valueTransform] function applied to each element of the original array
     * by the key returned by the given [keySelector] function applied to the element
     * and returns a map where each group key is associated with a list of corresponding values.
     * <p>
     * The returned map preserves the entry iteration order of the keys produced from the original array.
     */
    @NotNull
    public static <T, K, V> Map<K, List<V>> groupBy(@NotNull T[] elements, @NotNull Transformer<T, K> keySelector, @NotNull Transformer<T, V> valueTransform) {
        return groupByTo(elements, new LinkedHashMap<K, List<V>>(), keySelector, valueTransform);
    }

    /**
     * Groups values returned by the [valueTransform] function applied to each element of the original array
     * by the key returned by the given [keySelector] function applied to the element
     * and returns a map where each group key is associated with a list of corresponding values.
     * <p>
     * The returned map preserves the entry iteration order of the keys produced from the original array.
     */
    @NotNull
    public static <K, V> Map<K, List<V>> groupBy(@NotNull byte[] elements, @NotNull Transformer<Byte, K> keySelector, @NotNull Transformer<Byte, V> valueTransform) {
        return groupByTo(elements, new LinkedHashMap<K, List<V>>(), keySelector, valueTransform);
    }

    /**
     * Groups values returned by the [valueTransform] function applied to each element of the original array
     * by the key returned by the given [keySelector] function applied to the element
     * and returns a map where each group key is associated with a list of corresponding values.
     * <p>
     * The returned map preserves the entry iteration order of the keys produced from the original array.
     */
    @NotNull
    public static <K, V> Map<K, List<V>> groupBy(@NotNull short[] elements, @NotNull Transformer<Short, K> keySelector, @NotNull Transformer<Short, V> valueTransform) {
        return groupByTo(elements, new LinkedHashMap<K, List<V>>(), keySelector, valueTransform);
    }

    /**
     * Groups values returned by the [valueTransform] function applied to each element of the original array
     * by the key returned by the given [keySelector] function applied to the element
     * and returns a map where each group key is associated with a list of corresponding values.
     * <p>
     * The returned map preserves the entry iteration order of the keys produced from the original array.
     */
    @NotNull
    public static <K, V> Map<K, List<V>> groupBy(@NotNull int[] elements, @NotNull Transformer<Integer, K> keySelector, @NotNull Transformer<Integer, V> valueTransform) {
        return groupByTo(elements, new LinkedHashMap<K, List<V>>(), keySelector, valueTransform);
    }

    /**
     * Groups values returned by the [valueTransform] function applied to each element of the original array
     * by the key returned by the given [keySelector] function applied to the element
     * and returns a map where each group key is associated with a list of corresponding values.
     * <p>
     * The returned map preserves the entry iteration order of the keys produced from the original array.
     */
    @NotNull
    public static <K, V> Map<K, List<V>> groupBy(@NotNull long[] elements, @NotNull Transformer<Long, K> keySelector, @NotNull Transformer<Long, V> valueTransform) {
        return groupByTo(elements, new LinkedHashMap<K, List<V>>(), keySelector, valueTransform);
    }

    /**
     * Groups values returned by the [valueTransform] function applied to each element of the original array
     * by the key returned by the given [keySelector] function applied to the element
     * and returns a map where each group key is associated with a list of corresponding values.
     * <p>
     * The returned map preserves the entry iteration order of the keys produced from the original array.
     */
    @NotNull
    public static <K, V> Map<K, List<V>> groupBy(@NotNull float[] elements, @NotNull Transformer<Float, K> keySelector, @NotNull Transformer<Float, V> valueTransform) {
        return groupByTo(elements, new LinkedHashMap<K, List<V>>(), keySelector, valueTransform);
    }

    /**
     * Groups values returned by the [valueTransform] function applied to each element of the original array
     * by the key returned by the given [keySelector] function applied to the element
     * and returns a map where each group key is associated with a list of corresponding values.
     * <p>
     * The returned map preserves the entry iteration order of the keys produced from the original array.
     */
    @NotNull
    public static <K, V> Map<K, List<V>> groupBy(@NotNull double[] elements, @NotNull Transformer<Double, K> keySelector, @NotNull Transformer<Double, V> valueTransform) {
        return groupByTo(elements, new LinkedHashMap<K, List<V>>(), keySelector, valueTransform);
    }

    /**
     * Groups values returned by the [valueTransform] function applied to each element of the original array
     * by the key returned by the given [keySelector] function applied to the element
     * and returns a map where each group key is associated with a list of corresponding values.
     * <p>
     * The returned map preserves the entry iteration order of the keys produced from the original array.
     */
    @NotNull
    public static <K, V> Map<K, List<V>> groupBy(@NotNull boolean[] elements, @NotNull Transformer<Boolean, K> keySelector, @NotNull Transformer<Boolean, V> valueTransform) {
        return groupByTo(elements, new LinkedHashMap<K, List<V>>(), keySelector, valueTransform);
    }

    /**
     * Groups values returned by the [valueTransform] function applied to each element of the original array
     * by the key returned by the given [keySelector] function applied to the element
     * and returns a map where each group key is associated with a list of corresponding values.
     * <p>
     * The returned map preserves the entry iteration order of the keys produced from the original array.
     */
    @NotNull
    public static <K, V> Map<K, List<V>> groupBy(@NotNull char[] elements, @NotNull Transformer<Character, K> keySelector, @NotNull Transformer<Character, V> valueTransform) {
        return groupByTo(elements, new LinkedHashMap<K, List<V>>(), keySelector, valueTransform);
    }

    /**
     * Groups elements of the original array by the key returned by the given [keySelector] function
     * applied to each element and puts to the [destination] map each group key associated with a list of corresponding elements.
     *
     * @return The [destination] map.
     */
    @NotNull
    public static <T, K, M extends Map<K, List<T>>> M groupByTo(@NotNull T[] elements, @NotNull M destination, @NotNull Transformer<T, K> keySelector) {
        DefaultValue<List<T>> defaultValue = new DefaultValue<List<T>>() {
            @NotNull
            @Override
            public List<T> get() {
                return new ArrayList<>();
            }
        };
        for (T element : elements) {
            K key = keySelector.transform(element);
            List<T> list = Mapx.getOrPut(destination, key, defaultValue);
            list.add(element);
        }
        return destination;
    }

    /**
     * Groups elements of the original array by the key returned by the given [keySelector] function
     * applied to each element and puts to the [destination] map each group key associated with a list of corresponding elements.
     *
     * @return The [destination] map.
     */
    @NotNull
    public static <K, M extends Map<K, List<Byte>>> M groupByTo(@NotNull byte[] elements, @NotNull M destination, @NotNull Transformer<Byte, K> keySelector) {
        DefaultValue<List<Byte>> defaultValue = new DefaultValue<List<Byte>>() {
            @NotNull
            @Override
            public List<Byte> get() {
                return new ArrayList<>();
            }
        };
        for (byte element : elements) {
            K key = keySelector.transform(element);
            List<Byte> list = Mapx.getOrPut(destination, key, defaultValue);
            list.add(element);
        }
        return destination;
    }

    /**
     * Groups elements of the original array by the key returned by the given [keySelector] function
     * applied to each element and puts to the [destination] map each group key associated with a list of corresponding elements.
     *
     * @return The [destination] map.
     */
    @NotNull
    public static <K, M extends Map<K, List<Short>>> M groupByTo(@NotNull short[] elements, @NotNull M destination, @NotNull Transformer<Short, K> keySelector) {
        DefaultValue<List<Short>> defaultValue = new DefaultValue<List<Short>>() {
            @NotNull
            @Override
            public List<Short> get() {
                return new ArrayList<>();
            }
        };
        for (short element : elements) {
            K key = keySelector.transform(element);
            List<Short> list = Mapx.getOrPut(destination, key, defaultValue);
            list.add(element);
        }
        return destination;
    }

    /**
     * Groups elements of the original array by the key returned by the given [keySelector] function
     * applied to each element and puts to the [destination] map each group key associated with a list of corresponding elements.
     *
     * @return The [destination] map.
     */
    @NotNull
    public static <K, M extends Map<K, List<Integer>>> M groupByTo(@NotNull int[] elements, @NotNull M destination, @NotNull Transformer<Integer, K> keySelector) {
        DefaultValue<List<Integer>> defaultValue = new DefaultValue<List<Integer>>() {
            @NotNull
            @Override
            public List<Integer> get() {
                return new ArrayList<>();
            }
        };
        for (int element : elements) {
            K key = keySelector.transform(element);
            List<Integer> list = Mapx.getOrPut(destination, key, defaultValue);
            list.add(element);
        }
        return destination;
    }

    /**
     * Groups elements of the original array by the key returned by the given [keySelector] function
     * applied to each element and puts to the [destination] map each group key associated with a list of corresponding elements.
     *
     * @return The [destination] map.
     */
    @NotNull
    public static <K, M extends Map<K, List<Long>>> M groupByTo(@NotNull long[] elements, @NotNull M destination, @NotNull Transformer<Long, K> keySelector) {
        DefaultValue<List<Long>> defaultValue = new DefaultValue<List<Long>>() {
            @NotNull
            @Override
            public List<Long> get() {
                return new ArrayList<>();
            }
        };
        for (long element : elements) {
            K key = keySelector.transform(element);
            List<Long> list = Mapx.getOrPut(destination, key, defaultValue);
            list.add(element);
        }
        return destination;
    }

    /**
     * Groups elements of the original array by the key returned by the given [keySelector] function
     * applied to each element and puts to the [destination] map each group key associated with a list of corresponding elements.
     *
     * @return The [destination] map.
     */
    @NotNull
    public static <K, M extends Map<K, List<Float>>> M groupByTo(@NotNull float[] elements, @NotNull M destination, @NotNull Transformer<Float, K> keySelector) {
        DefaultValue<List<Float>> defaultValue = new DefaultValue<List<Float>>() {
            @NotNull
            @Override
            public List<Float> get() {
                return new ArrayList<>();
            }
        };
        for (float element : elements) {
            K key = keySelector.transform(element);
            List<Float> list = Mapx.getOrPut(destination, key, defaultValue);
            list.add(element);
        }
        return destination;
    }

    /**
     * Groups elements of the original array by the key returned by the given [keySelector] function
     * applied to each element and puts to the [destination] map each group key associated with a list of corresponding elements.
     *
     * @return The [destination] map.
     */
    @NotNull
    public static <K, M extends Map<K, List<Double>>> M groupByTo(@NotNull double[] elements, @NotNull M destination, @NotNull Transformer<Double, K> keySelector) {
        DefaultValue<List<Double>> defaultValue = new DefaultValue<List<Double>>() {
            @NotNull
            @Override
            public List<Double> get() {
                return new ArrayList<>();
            }
        };
        for (double element : elements) {
            K key = keySelector.transform(element);
            List<Double> list = Mapx.getOrPut(destination, key, defaultValue);
            list.add(element);
        }
        return destination;
    }

    /**
     * Groups elements of the original array by the key returned by the given [keySelector] function
     * applied to each element and puts to the [destination] map each group key associated with a list of corresponding elements.
     *
     * @return The [destination] map.
     */
    @NotNull
    public static <K, M extends Map<K, List<Boolean>>> M groupByTo(@NotNull boolean[] elements, @NotNull M destination, @NotNull Transformer<Boolean, K> keySelector) {
        DefaultValue<List<Boolean>> defaultValue = new DefaultValue<List<Boolean>>() {
            @NotNull
            @Override
            public List<Boolean> get() {
                return new ArrayList<>();
            }
        };
        for (boolean element : elements) {
            K key = keySelector.transform(element);
            List<Boolean> list = Mapx.getOrPut(destination, key, defaultValue);
            list.add(element);
        }
        return destination;
    }

    /**
     * Groups elements of the original array by the key returned by the given [keySelector] function
     * applied to each element and puts to the [destination] map each group key associated with a list of corresponding elements.
     *
     * @return The [destination] map.
     */
    @NotNull
    public static <K, M extends Map<K, List<Character>>> M groupByTo(@NotNull char[] elements, @NotNull M destination, @NotNull Transformer<Character, K> keySelector) {
        DefaultValue<List<Character>> defaultValue = new DefaultValue<List<Character>>() {
            @NotNull
            @Override
            public List<Character> get() {
                return new ArrayList<>();
            }
        };
        for (char element : elements) {
            K key = keySelector.transform(element);
            List<Character> list = Mapx.getOrPut(destination, key, defaultValue);
            list.add(element);
        }
        return destination;
    }

    /**
     * Groups values returned by the [valueTransform] function applied to each element of the original array
     * by the key returned by the given [keySelector] function applied to the element
     * and puts to the [destination] map each group key associated with a list of corresponding values.
     *
     * @return The [destination] map.
     */
    @NotNull
    public static <T, K, V, M extends Map<K, List<V>>> M groupByTo(@NotNull T[] elements, @NotNull M destination, @NotNull Transformer<T, K> keySelector, @NotNull Transformer<T, V> valueTransform) {
        DefaultValue<List<V>> defaultValue = new DefaultValue<List<V>>() {
            @NotNull
            @Override
            public List<V> get() {
                return new ArrayList<>();
            }
        };
        for (T element : elements) {
            K key = keySelector.transform(element);
            List<V> list = Mapx.getOrPut(destination, key, defaultValue);
            list.add(valueTransform.transform(element));
        }
        return destination;
    }

    /**
     * Groups values returned by the [valueTransform] function applied to each element of the original array
     * by the key returned by the given [keySelector] function applied to the element
     * and puts to the [destination] map each group key associated with a list of corresponding values.
     *
     * @return The [destination] map.
     */
    @NotNull
    public static <K, V, M extends Map<K, List<V>>> M groupByTo(@NotNull byte[] elements, @NotNull M destination, @NotNull Transformer<Byte, K> keySelector, @NotNull Transformer<Byte, V> valueTransform) {
        DefaultValue<List<V>> defaultValue = new DefaultValue<List<V>>() {
            @NotNull
            @Override
            public List<V> get() {
                return new ArrayList<>();
            }
        };
        for (byte element : elements) {
            K key = keySelector.transform(element);
            List<V> list = Mapx.getOrPut(destination, key, defaultValue);
            list.add(valueTransform.transform(element));
        }
        return destination;
    }

    /**
     * Groups values returned by the [valueTransform] function applied to each element of the original array
     * by the key returned by the given [keySelector] function applied to the element
     * and puts to the [destination] map each group key associated with a list of corresponding values.
     *
     * @return The [destination] map.
     */
    @NotNull
    public static <K, V, M extends Map<K, List<V>>> M groupByTo(@NotNull short[] elements, @NotNull M destination, @NotNull Transformer<Short, K> keySelector, @NotNull Transformer<Short, V> valueTransform) {
        DefaultValue<List<V>> defaultValue = new DefaultValue<List<V>>() {
            @NotNull
            @Override
            public List<V> get() {
                return new ArrayList<>();
            }
        };
        for (short element : elements) {
            K key = keySelector.transform(element);
            List<V> list = Mapx.getOrPut(destination, key, defaultValue);
            list.add(valueTransform.transform(element));
        }
        return destination;
    }

    /**
     * Groups values returned by the [valueTransform] function applied to each element of the original array
     * by the key returned by the given [keySelector] function applied to the element
     * and puts to the [destination] map each group key associated with a list of corresponding values.
     *
     * @return The [destination] map.
     */
    @NotNull
    public static <K, V, M extends Map<K, List<V>>> M groupByTo(@NotNull int[] elements, @NotNull M destination, @NotNull Transformer<Integer, K> keySelector, @NotNull Transformer<Integer, V> valueTransform) {
        DefaultValue<List<V>> defaultValue = new DefaultValue<List<V>>() {
            @NotNull
            @Override
            public List<V> get() {
                return new ArrayList<>();
            }
        };
        for (int element : elements) {
            K key = keySelector.transform(element);
            List<V> list = Mapx.getOrPut(destination, key, defaultValue);
            list.add(valueTransform.transform(element));
        }
        return destination;
    }

    /**
     * Groups values returned by the [valueTransform] function applied to each element of the original array
     * by the key returned by the given [keySelector] function applied to the element
     * and puts to the [destination] map each group key associated with a list of corresponding values.
     *
     * @return The [destination] map.
     */
    @NotNull
    public static <K, V, M extends Map<K, List<V>>> M groupByTo(@NotNull long[] elements, @NotNull M destination, @NotNull Transformer<Long, K> keySelector, @NotNull Transformer<Long, V> valueTransform) {
        DefaultValue<List<V>> defaultValue = new DefaultValue<List<V>>() {
            @NotNull
            @Override
            public List<V> get() {
                return new ArrayList<>();
            }
        };
        for (long element : elements) {
            K key = keySelector.transform(element);
            List<V> list = Mapx.getOrPut(destination, key, defaultValue);
            list.add(valueTransform.transform(element));
        }
        return destination;
    }

    /**
     * Groups values returned by the [valueTransform] function applied to each element of the original array
     * by the key returned by the given [keySelector] function applied to the element
     * and puts to the [destination] map each group key associated with a list of corresponding values.
     *
     * @return The [destination] map.
     */
    @NotNull
    public static <K, V, M extends Map<K, List<V>>> M groupByTo(@NotNull float[] elements, @NotNull M destination, @NotNull Transformer<Float, K> keySelector, @NotNull Transformer<Float, V> valueTransform) {
        DefaultValue<List<V>> defaultValue = new DefaultValue<List<V>>() {
            @NotNull
            @Override
            public List<V> get() {
                return new ArrayList<>();
            }
        };
        for (float element : elements) {
            K key = keySelector.transform(element);
            List<V> list = Mapx.getOrPut(destination, key, defaultValue);
            list.add(valueTransform.transform(element));
        }
        return destination;
    }

    /**
     * Groups values returned by the [valueTransform] function applied to each element of the original array
     * by the key returned by the given [keySelector] function applied to the element
     * and puts to the [destination] map each group key associated with a list of corresponding values.
     *
     * @return The [destination] map.
     */
    @NotNull
    public static <K, V, M extends Map<K, List<V>>> M groupByTo(@NotNull double[] elements, @NotNull M destination, @NotNull Transformer<Double, K> keySelector, @NotNull Transformer<Double, V> valueTransform) {
        DefaultValue<List<V>> defaultValue = new DefaultValue<List<V>>() {
            @NotNull
            @Override
            public List<V> get() {
                return new ArrayList<>();
            }
        };
        for (double element : elements) {
            K key = keySelector.transform(element);
            List<V> list = Mapx.getOrPut(destination, key, defaultValue);
            list.add(valueTransform.transform(element));
        }
        return destination;
    }

    /**
     * Groups values returned by the [valueTransform] function applied to each element of the original array
     * by the key returned by the given [keySelector] function applied to the element
     * and puts to the [destination] map each group key associated with a list of corresponding values.
     *
     * @return The [destination] map.
     */
    @NotNull
    public static <K, V, M extends Map<K, List<V>>> M groupByTo(@NotNull boolean[] elements, @NotNull M destination, @NotNull Transformer<Boolean, K> keySelector, @NotNull Transformer<Boolean, V> valueTransform) {
        DefaultValue<List<V>> defaultValue = new DefaultValue<List<V>>() {
            @NotNull
            @Override
            public List<V> get() {
                return new ArrayList<>();
            }
        };
        for (boolean element : elements) {
            K key = keySelector.transform(element);
            List<V> list = Mapx.getOrPut(destination, key, defaultValue);
            list.add(valueTransform.transform(element));
        }
        return destination;
    }

    /**
     * Groups values returned by the [valueTransform] function applied to each element of the original array
     * by the key returned by the given [keySelector] function applied to the element
     * and puts to the [destination] map each group key associated with a list of corresponding values.
     *
     * @return The [destination] map.
     */
    @NotNull
    public static <K, V, M extends Map<K, List<V>>> M groupByTo(@NotNull char[] elements, @NotNull M destination, @NotNull Transformer<Character, K> keySelector, @NotNull Transformer<Character, V> valueTransform) {
        DefaultValue<List<V>> defaultValue = new DefaultValue<List<V>>() {
            @NotNull
            @Override
            public List<V> get() {
                return new ArrayList<>();
            }
        };
        for (char element : elements) {
            K key = keySelector.transform(element);
            List<V> list = Mapx.getOrPut(destination, key, defaultValue);
            list.add(valueTransform.transform(element));
        }
        return destination;
    }

    /**
     * Creates a [Grouping] source from an array to be used later with one of group-and-fold operations
     * using the specified [keySelector] function to extract a key from each element.
     */
    @NotNull
    public static <T, K> Grouping<T, K> groupingBy(@NotNull final T[] elements, @NotNull final Transformer<T, K> keySelector) {
        return new Grouping<T, K>() {
            @Override
            public Iterator<T> sourceIterator() {
                return Arrayx.iterator(elements);
            }

            @Override
            public K keyOf(T element) {
                return keySelector.transform(element);
            }
        };
    }

//    /**
//     * Returns `true` if all elements match the given [predicate].
//     */
//    public inline fun <T> Array<out T>.all(predicate: (T) -> Boolean): Boolean {
//        for (element in this) if (!predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if all elements match the given [predicate].
//     */
//    public inline fun ByteArray.all(predicate: (Byte) -> Boolean): Boolean {
//        for (element in this) if (!predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if all elements match the given [predicate].
//     */
//    public inline fun ShortArray.all(predicate: (Short) -> Boolean): Boolean {
//        for (element in this) if (!predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if all elements match the given [predicate].
//     */
//    public inline fun IntArray.all(predicate: (Int) -> Boolean): Boolean {
//        for (element in this) if (!predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if all elements match the given [predicate].
//     */
//    public inline fun LongArray.all(predicate: (Long) -> Boolean): Boolean {
//        for (element in this) if (!predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if all elements match the given [predicate].
//     */
//    public inline fun FloatArray.all(predicate: (Float) -> Boolean): Boolean {
//        for (element in this) if (!predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if all elements match the given [predicate].
//     */
//    public inline fun DoubleArray.all(predicate: (Double) -> Boolean): Boolean {
//        for (element in this) if (!predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if all elements match the given [predicate].
//     */
//    public inline fun BooleanArray.all(predicate: (Boolean) -> Boolean): Boolean {
//        for (element in this) if (!predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if all elements match the given [predicate].
//     */
//    public inline fun CharArray.all(predicate: (Char) -> Boolean): Boolean {
//        for (element in this) if (!predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromArray
//     */
//    public fun <T> Array<out T>.asSequence(): Sequence<T> {
//        if (isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromArray
//     */
//    public fun ByteArray.asSequence(): Sequence<Byte> {
//        if (isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromArray
//     */
//    public fun ShortArray.asSequence(): Sequence<Short> {
//        if (isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromArray
//     */
//    public fun IntArray.asSequence(): Sequence<Int> {
//        if (isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromArray
//     */
//    public fun LongArray.asSequence(): Sequence<Long> {
//        if (isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromArray
//     */
//    public fun FloatArray.asSequence(): Sequence<Float> {
//        if (isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromArray
//     */
//    public fun DoubleArray.asSequence(): Sequence<Double> {
//        if (isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromArray
//     */
//    public fun BooleanArray.asSequence(): Sequence<Boolean> {
//        if (isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromArray
//     */
//    public fun CharArray.asSequence(): Sequence<Char> {
//        if (isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
//
//
//    /**
//     * Returns an average value of elements in the array.
//     */
//    @kotlin.jvm.JvmName("averageOfByte")
//    public fun Array<out Byte>.average(): Double {
//        var sum: Double = 0.0
//        var count: Int = 0
//        for (element in this) {
//            sum += element
//            count += 1
//        }
//        return if (count == 0) Double.NaN else sum / count
//    }
//
///**
// * Returns an average value of elements in the array.
// */
//    @kotlin.jvm.JvmName("averageOfShort")
//    public fun Array<out Short>.average(): Double {
//        var sum: Double = 0.0
//        var count: Int = 0
//        for (element in this) {
//            sum += element
//            count += 1
//        }
//        return if (count == 0) Double.NaN else sum / count
//    }
//
///**
// * Returns an average value of elements in the array.
// */
//    @kotlin.jvm.JvmName("averageOfInt")
//    public fun Array<out Int>.average(): Double {
//        var sum: Double = 0.0
//        var count: Int = 0
//        for (element in this) {
//            sum += element
//            count += 1
//        }
//        return if (count == 0) Double.NaN else sum / count
//    }
//
///**
// * Returns an average value of elements in the array.
// */
//    @kotlin.jvm.JvmName("averageOfLong")
//    public fun Array<out Long>.average(): Double {
//        var sum: Double = 0.0
//        var count: Int = 0
//        for (element in this) {
//            sum += element
//            count += 1
//        }
//        return if (count == 0) Double.NaN else sum / count
//    }
//
///**
// * Returns an average value of elements in the array.
// */
//    @kotlin.jvm.JvmName("averageOfFloat")
//    public fun Array<out Float>.average(): Double {
//        var sum: Double = 0.0
//        var count: Int = 0
//        for (element in this) {
//            sum += element
//            count += 1
//        }
//        return if (count == 0) Double.NaN else sum / count
//    }
//
///**
// * Returns an average value of elements in the array.
// */
//    @kotlin.jvm.JvmName("averageOfDouble")
//    public fun Array<out Double>.average(): Double {
//        var sum: Double = 0.0
//        var count: Int = 0
//        for (element in this) {
//            sum += element
//            count += 1
//        }
//        return if (count == 0) Double.NaN else sum / count
//    }
//
//    /**
//     * Returns an average value of elements in the array.
//     */
//    public fun ByteArray.average(): Double {
//        var sum: Double = 0.0
//        var count: Int = 0
//        for (element in this) {
//            sum += element
//            count += 1
//        }
//        return if (count == 0) Double.NaN else sum / count
//    }
//
//    /**
//     * Returns an average value of elements in the array.
//     */
//    public fun ShortArray.average(): Double {
//        var sum: Double = 0.0
//        var count: Int = 0
//        for (element in this) {
//            sum += element
//            count += 1
//        }
//        return if (count == 0) Double.NaN else sum / count
//    }
//
//    /**
//     * Returns an average value of elements in the array.
//     */
//    public fun IntArray.average(): Double {
//        var sum: Double = 0.0
//        var count: Int = 0
//        for (element in this) {
//            sum += element
//            count += 1
//        }
//        return if (count == 0) Double.NaN else sum / count
//    }
//
//    /**
//     * Returns an average value of elements in the array.
//     */
//    public fun LongArray.average(): Double {
//        var sum: Double = 0.0
//        var count: Int = 0
//        for (element in this) {
//            sum += element
//            count += 1
//        }
//        return if (count == 0) Double.NaN else sum / count
//    }
//
//    /**
//     * Returns an average value of elements in the array.
//     */
//    public fun FloatArray.average(): Double {
//        var sum: Double = 0.0
//        var count: Int = 0
//        for (element in this) {
//            sum += element
//            count += 1
//        }
//        return if (count == 0) Double.NaN else sum / count
//    }
//
//    /**
//     * Returns an average value of elements in the array.
//     */
//    public fun DoubleArray.average(): Double {
//        var sum: Double = 0.0
//        var count: Int = 0
//        for (element in this) {
//            sum += element
//            count += 1
//        }
//        return if (count == 0) Double.NaN else sum / count
//    }
//
//
//    /**
//     * Returns the sum of all elements in the array.
//     */
//    @kotlin.jvm.JvmName("sumOfByte")
//    public fun Array<out Byte>.sum(): Int {
//        var sum: Int = 0
//        for (element in this) {
//            sum += element
//        }
//        return sum
//    }
//
///**
// * Returns the sum of all elements in the array.
// */
//    @kotlin.jvm.JvmName("sumOfShort")
//    public fun Array<out Short>.sum(): Int {
//        var sum: Int = 0
//        for (element in this) {
//            sum += element
//        }
//        return sum
//    }
//
///**
// * Returns the sum of all elements in the array.
// */
//    @kotlin.jvm.JvmName("sumOfInt")
//    public fun Array<out Int>.sum(): Int {
//        var sum: Int = 0
//        for (element in this) {
//            sum += element
//        }
//        return sum
//    }
//
///**
// * Returns the sum of all elements in the array.
// */
//    @kotlin.jvm.JvmName("sumOfLong")
//    public fun Array<out Long>.sum(): Long {
//        var sum: Long = 0L
//        for (element in this) {
//            sum += element
//        }
//        return sum
//    }
//
///**
// * Returns the sum of all elements in the array.
// */
//    @kotlin.jvm.JvmName("sumOfFloat")
//    public fun Array<out Float>.sum(): Float {
//        var sum: Float = 0.0f
//        for (element in this) {
//            sum += element
//        }
//        return sum
//    }
//
///**
// * Returns the sum of all elements in the array.
// */
//    @kotlin.jvm.JvmName("sumOfDouble")
//    public fun Array<out Double>.sum(): Double {
//        var sum: Double = 0.0
//        for (element in this) {
//            sum += element
//        }
//        return sum
//    }
//
//    /**
//     * Returns the sum of all elements in the array.
//     */
//    public fun ByteArray.sum(): Int {
//        var sum: Int = 0
//        for (element in this) {
//            sum += element
//        }
//        return sum
//    }
//
//    /**
//     * Returns the sum of all elements in the array.
//     */
//    public fun ShortArray.sum(): Int {
//        var sum: Int = 0
//        for (element in this) {
//            sum += element
//        }
//        return sum
//    }
//
//    /**
//     * Returns the sum of all elements in the array.
//     */
//    public fun IntArray.sum(): Int {
//        var sum: Int = 0
//        for (element in this) {
//            sum += element
//        }
//        return sum
//    }
//
//    /**
//     * Returns the sum of all elements in the array.
//     */
//    public fun LongArray.sum(): Long {
//        var sum: Long = 0L
//        for (element in this) {
//            sum += element
//        }
//        return sum
//    }
//
//    /**
//     * Returns the sum of all elements in the array.
//     */
//    public fun FloatArray.sum(): Float {
//        var sum: Float = 0.0f
//        for (element in this) {
//            sum += element
//        }
//        return sum
//    }
//
//    /**
//     * Returns the sum of all elements in the array.
//     */
//    public fun DoubleArray.sum(): Double {
//        var sum: Double = 0.0
//        for (element in this) {
//            sum += element
//        }
//        return sum
//    }
//
//
//    /**
//     * Returns a [Map] containing key-value pairs provided by [transform] function
//     * applied to elements of the given array.
//     *
//     * If any of two pairs would have the same key the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <T, K, V> Array<out T>.associate(transform: (T) -> Pair<K, V>): Map<K, V> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateTo(LinkedHashMap<K, V>(capacity), transform)
//    }
//
//    /**
//     * Returns a [Map] containing key-value pairs provided by [transform] function
//     * applied to elements of the given array.
//     *
//     * If any of two pairs would have the same key the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <K, V> ByteArray.associate(transform: (Byte) -> Pair<K, V>): Map<K, V> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateTo(LinkedHashMap<K, V>(capacity), transform)
//    }
//
//    /**
//     * Returns a [Map] containing key-value pairs provided by [transform] function
//     * applied to elements of the given array.
//     *
//     * If any of two pairs would have the same key the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <K, V> ShortArray.associate(transform: (Short) -> Pair<K, V>): Map<K, V> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateTo(LinkedHashMap<K, V>(capacity), transform)
//    }
//
//    /**
//     * Returns a [Map] containing key-value pairs provided by [transform] function
//     * applied to elements of the given array.
//     *
//     * If any of two pairs would have the same key the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <K, V> IntArray.associate(transform: (Int) -> Pair<K, V>): Map<K, V> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateTo(LinkedHashMap<K, V>(capacity), transform)
//    }
//
//    /**
//     * Returns a [Map] containing key-value pairs provided by [transform] function
//     * applied to elements of the given array.
//     *
//     * If any of two pairs would have the same key the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <K, V> LongArray.associate(transform: (Long) -> Pair<K, V>): Map<K, V> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateTo(LinkedHashMap<K, V>(capacity), transform)
//    }
//
//    /**
//     * Returns a [Map] containing key-value pairs provided by [transform] function
//     * applied to elements of the given array.
//     *
//     * If any of two pairs would have the same key the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <K, V> FloatArray.associate(transform: (Float) -> Pair<K, V>): Map<K, V> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateTo(LinkedHashMap<K, V>(capacity), transform)
//    }
//
//    /**
//     * Returns a [Map] containing key-value pairs provided by [transform] function
//     * applied to elements of the given array.
//     *
//     * If any of two pairs would have the same key the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <K, V> DoubleArray.associate(transform: (Double) -> Pair<K, V>): Map<K, V> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateTo(LinkedHashMap<K, V>(capacity), transform)
//    }
//
//    /**
//     * Returns a [Map] containing key-value pairs provided by [transform] function
//     * applied to elements of the given array.
//     *
//     * If any of two pairs would have the same key the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <K, V> BooleanArray.associate(transform: (Boolean) -> Pair<K, V>): Map<K, V> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateTo(LinkedHashMap<K, V>(capacity), transform)
//    }
//
//    /**
//     * Returns a [Map] containing key-value pairs provided by [transform] function
//     * applied to elements of the given array.
//     *
//     * If any of two pairs would have the same key the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <K, V> CharArray.associate(transform: (Char) -> Pair<K, V>): Map<K, V> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateTo(LinkedHashMap<K, V>(capacity), transform)
//    }
//
//    /**
//     * Returns a [Map] containing the elements from the given array indexed by the key
//     * returned from [keySelector] function applied to each element.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <T, K> Array<out T>.associateBy(keySelector: (T) -> K): Map<K, T> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateByTo(LinkedHashMap<K, T>(capacity), keySelector)
//    }
//
//    /**
//     * Returns a [Map] containing the elements from the given array indexed by the key
//     * returned from [keySelector] function applied to each element.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <K> ByteArray.associateBy(keySelector: (Byte) -> K): Map<K, Byte> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateByTo(LinkedHashMap<K, Byte>(capacity), keySelector)
//    }
//
//    /**
//     * Returns a [Map] containing the elements from the given array indexed by the key
//     * returned from [keySelector] function applied to each element.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <K> ShortArray.associateBy(keySelector: (Short) -> K): Map<K, Short> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateByTo(LinkedHashMap<K, Short>(capacity), keySelector)
//    }
//
//    /**
//     * Returns a [Map] containing the elements from the given array indexed by the key
//     * returned from [keySelector] function applied to each element.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <K> IntArray.associateBy(keySelector: (Int) -> K): Map<K, Int> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateByTo(LinkedHashMap<K, Int>(capacity), keySelector)
//    }
//
//    /**
//     * Returns a [Map] containing the elements from the given array indexed by the key
//     * returned from [keySelector] function applied to each element.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <K> LongArray.associateBy(keySelector: (Long) -> K): Map<K, Long> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateByTo(LinkedHashMap<K, Long>(capacity), keySelector)
//    }
//
//    /**
//     * Returns a [Map] containing the elements from the given array indexed by the key
//     * returned from [keySelector] function applied to each element.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <K> FloatArray.associateBy(keySelector: (Float) -> K): Map<K, Float> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateByTo(LinkedHashMap<K, Float>(capacity), keySelector)
//    }
//
//    /**
//     * Returns a [Map] containing the elements from the given array indexed by the key
//     * returned from [keySelector] function applied to each element.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <K> DoubleArray.associateBy(keySelector: (Double) -> K): Map<K, Double> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateByTo(LinkedHashMap<K, Double>(capacity), keySelector)
//    }
//
//    /**
//     * Returns a [Map] containing the elements from the given array indexed by the key
//     * returned from [keySelector] function applied to each element.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <K> BooleanArray.associateBy(keySelector: (Boolean) -> K): Map<K, Boolean> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateByTo(LinkedHashMap<K, Boolean>(capacity), keySelector)
//    }
//
//    /**
//     * Returns a [Map] containing the elements from the given array indexed by the key
//     * returned from [keySelector] function applied to each element.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <K> CharArray.associateBy(keySelector: (Char) -> K): Map<K, Char> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateByTo(LinkedHashMap<K, Char>(capacity), keySelector)
//    }
//
//    /**
//     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <T, K, V> Array<out T>.associateBy(keySelector: (T) -> K, valueTransform: (T) -> V): Map<K, V> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateByTo(LinkedHashMap<K, V>(capacity), keySelector, valueTransform)
//    }
//
//    /**
//     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <K, V> ByteArray.associateBy(keySelector: (Byte) -> K, valueTransform: (Byte) -> V): Map<K, V> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateByTo(LinkedHashMap<K, V>(capacity), keySelector, valueTransform)
//    }
//
//    /**
//     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <K, V> ShortArray.associateBy(keySelector: (Short) -> K, valueTransform: (Short) -> V): Map<K, V> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateByTo(LinkedHashMap<K, V>(capacity), keySelector, valueTransform)
//    }
//
//    /**
//     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <K, V> IntArray.associateBy(keySelector: (Int) -> K, valueTransform: (Int) -> V): Map<K, V> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateByTo(LinkedHashMap<K, V>(capacity), keySelector, valueTransform)
//    }
//
//    /**
//     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <K, V> LongArray.associateBy(keySelector: (Long) -> K, valueTransform: (Long) -> V): Map<K, V> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateByTo(LinkedHashMap<K, V>(capacity), keySelector, valueTransform)
//    }
//
//    /**
//     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <K, V> FloatArray.associateBy(keySelector: (Float) -> K, valueTransform: (Float) -> V): Map<K, V> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateByTo(LinkedHashMap<K, V>(capacity), keySelector, valueTransform)
//    }
//
//    /**
//     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <K, V> DoubleArray.associateBy(keySelector: (Double) -> K, valueTransform: (Double) -> V): Map<K, V> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateByTo(LinkedHashMap<K, V>(capacity), keySelector, valueTransform)
//    }
//
//    /**
//     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <K, V> BooleanArray.associateBy(keySelector: (Boolean) -> K, valueTransform: (Boolean) -> V): Map<K, V> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateByTo(LinkedHashMap<K, V>(capacity), keySelector, valueTransform)
//    }
//
//    /**
//     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public inline fun <K, V> CharArray.associateBy(keySelector: (Char) -> K, valueTransform: (Char) -> V): Map<K, V> {
//        val capacity = mapCapacity(size).coerceAtLeast(16)
//        return associateByTo(LinkedHashMap<K, V>(capacity), keySelector, valueTransform)
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs,
//     * where key is provided by the [keySelector] function applied to each element of the given array
//     * and value is the element itself.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     */
//    public inline fun <T, K, M : MutableMap<in K, in T>> Array<out T>.associateByTo(destination: M, keySelector: (T) -> K): M {
//        for (element in this) {
//            destination.put(keySelector(element), element)
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs,
//     * where key is provided by the [keySelector] function applied to each element of the given array
//     * and value is the element itself.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     */
//    public inline fun <K, M : MutableMap<in K, in Byte>> ByteArray.associateByTo(destination: M, keySelector: (Byte) -> K): M {
//        for (element in this) {
//            destination.put(keySelector(element), element)
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs,
//     * where key is provided by the [keySelector] function applied to each element of the given array
//     * and value is the element itself.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     */
//    public inline fun <K, M : MutableMap<in K, in Short>> ShortArray.associateByTo(destination: M, keySelector: (Short) -> K): M {
//        for (element in this) {
//            destination.put(keySelector(element), element)
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs,
//     * where key is provided by the [keySelector] function applied to each element of the given array
//     * and value is the element itself.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     */
//    public inline fun <K, M : MutableMap<in K, in Int>> IntArray.associateByTo(destination: M, keySelector: (Int) -> K): M {
//        for (element in this) {
//            destination.put(keySelector(element), element)
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs,
//     * where key is provided by the [keySelector] function applied to each element of the given array
//     * and value is the element itself.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     */
//    public inline fun <K, M : MutableMap<in K, in Long>> LongArray.associateByTo(destination: M, keySelector: (Long) -> K): M {
//        for (element in this) {
//            destination.put(keySelector(element), element)
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs,
//     * where key is provided by the [keySelector] function applied to each element of the given array
//     * and value is the element itself.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     */
//    public inline fun <K, M : MutableMap<in K, in Float>> FloatArray.associateByTo(destination: M, keySelector: (Float) -> K): M {
//        for (element in this) {
//            destination.put(keySelector(element), element)
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs,
//     * where key is provided by the [keySelector] function applied to each element of the given array
//     * and value is the element itself.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     */
//    public inline fun <K, M : MutableMap<in K, in Double>> DoubleArray.associateByTo(destination: M, keySelector: (Double) -> K): M {
//        for (element in this) {
//            destination.put(keySelector(element), element)
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs,
//     * where key is provided by the [keySelector] function applied to each element of the given array
//     * and value is the element itself.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     */
//    public inline fun <K, M : MutableMap<in K, in Boolean>> BooleanArray.associateByTo(destination: M, keySelector: (Boolean) -> K): M {
//        for (element in this) {
//            destination.put(keySelector(element), element)
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs,
//     * where key is provided by the [keySelector] function applied to each element of the given array
//     * and value is the element itself.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     */
//    public inline fun <K, M : MutableMap<in K, in Char>> CharArray.associateByTo(destination: M, keySelector: (Char) -> K): M {
//        for (element in this) {
//            destination.put(keySelector(element), element)
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs,
//     * where key is provided by the [keySelector] function and
//     * and value is provided by the [valueTransform] function applied to elements of the given array.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     */
//    public inline fun <T, K, V, M : MutableMap<in K, in V>> Array<out T>.associateByTo(destination: M, keySelector: (T) -> K, valueTransform: (T) -> V): M {
//        for (element in this) {
//            destination.put(keySelector(element), valueTransform(element))
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs,
//     * where key is provided by the [keySelector] function and
//     * and value is provided by the [valueTransform] function applied to elements of the given array.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     */
//    public inline fun <K, V, M : MutableMap<in K, in V>> ByteArray.associateByTo(destination: M, keySelector: (Byte) -> K, valueTransform: (Byte) -> V): M {
//        for (element in this) {
//            destination.put(keySelector(element), valueTransform(element))
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs,
//     * where key is provided by the [keySelector] function and
//     * and value is provided by the [valueTransform] function applied to elements of the given array.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     */
//    public inline fun <K, V, M : MutableMap<in K, in V>> ShortArray.associateByTo(destination: M, keySelector: (Short) -> K, valueTransform: (Short) -> V): M {
//        for (element in this) {
//            destination.put(keySelector(element), valueTransform(element))
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs,
//     * where key is provided by the [keySelector] function and
//     * and value is provided by the [valueTransform] function applied to elements of the given array.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     */
//    public inline fun <K, V, M : MutableMap<in K, in V>> IntArray.associateByTo(destination: M, keySelector: (Int) -> K, valueTransform: (Int) -> V): M {
//        for (element in this) {
//            destination.put(keySelector(element), valueTransform(element))
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs,
//     * where key is provided by the [keySelector] function and
//     * and value is provided by the [valueTransform] function applied to elements of the given array.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     */
//    public inline fun <K, V, M : MutableMap<in K, in V>> LongArray.associateByTo(destination: M, keySelector: (Long) -> K, valueTransform: (Long) -> V): M {
//        for (element in this) {
//            destination.put(keySelector(element), valueTransform(element))
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs,
//     * where key is provided by the [keySelector] function and
//     * and value is provided by the [valueTransform] function applied to elements of the given array.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     */
//    public inline fun <K, V, M : MutableMap<in K, in V>> FloatArray.associateByTo(destination: M, keySelector: (Float) -> K, valueTransform: (Float) -> V): M {
//        for (element in this) {
//            destination.put(keySelector(element), valueTransform(element))
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs,
//     * where key is provided by the [keySelector] function and
//     * and value is provided by the [valueTransform] function applied to elements of the given array.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     */
//    public inline fun <K, V, M : MutableMap<in K, in V>> DoubleArray.associateByTo(destination: M, keySelector: (Double) -> K, valueTransform: (Double) -> V): M {
//        for (element in this) {
//            destination.put(keySelector(element), valueTransform(element))
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs,
//     * where key is provided by the [keySelector] function and
//     * and value is provided by the [valueTransform] function applied to elements of the given array.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     */
//    public inline fun <K, V, M : MutableMap<in K, in V>> BooleanArray.associateByTo(destination: M, keySelector: (Boolean) -> K, valueTransform: (Boolean) -> V): M {
//        for (element in this) {
//            destination.put(keySelector(element), valueTransform(element))
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs,
//     * where key is provided by the [keySelector] function and
//     * and value is provided by the [valueTransform] function applied to elements of the given array.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     */
//    public inline fun <K, V, M : MutableMap<in K, in V>> CharArray.associateByTo(destination: M, keySelector: (Char) -> K, valueTransform: (Char) -> V): M {
//        for (element in this) {
//            destination.put(keySelector(element), valueTransform(element))
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs
//     * provided by [transform] function applied to each element of the given array.
//     *
//     * If any of two pairs would have the same key the last one gets added to the map.
//     */
//    public inline fun <T, K, V, M : MutableMap<in K, in V>> Array<out T>.associateTo(destination: M, transform: (T) -> Pair<K, V>): M {
//        for (element in this) {
//            destination += transform(element)
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs
//     * provided by [transform] function applied to each element of the given array.
//     *
//     * If any of two pairs would have the same key the last one gets added to the map.
//     */
//    public inline fun <K, V, M : MutableMap<in K, in V>> ByteArray.associateTo(destination: M, transform: (Byte) -> Pair<K, V>): M {
//        for (element in this) {
//            destination += transform(element)
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs
//     * provided by [transform] function applied to each element of the given array.
//     *
//     * If any of two pairs would have the same key the last one gets added to the map.
//     */
//    public inline fun <K, V, M : MutableMap<in K, in V>> ShortArray.associateTo(destination: M, transform: (Short) -> Pair<K, V>): M {
//        for (element in this) {
//            destination += transform(element)
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs
//     * provided by [transform] function applied to each element of the given array.
//     *
//     * If any of two pairs would have the same key the last one gets added to the map.
//     */
//    public inline fun <K, V, M : MutableMap<in K, in V>> IntArray.associateTo(destination: M, transform: (Int) -> Pair<K, V>): M {
//        for (element in this) {
//            destination += transform(element)
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs
//     * provided by [transform] function applied to each element of the given array.
//     *
//     * If any of two pairs would have the same key the last one gets added to the map.
//     */
//    public inline fun <K, V, M : MutableMap<in K, in V>> LongArray.associateTo(destination: M, transform: (Long) -> Pair<K, V>): M {
//        for (element in this) {
//            destination += transform(element)
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs
//     * provided by [transform] function applied to each element of the given array.
//     *
//     * If any of two pairs would have the same key the last one gets added to the map.
//     */
//    public inline fun <K, V, M : MutableMap<in K, in V>> FloatArray.associateTo(destination: M, transform: (Float) -> Pair<K, V>): M {
//        for (element in this) {
//            destination += transform(element)
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs
//     * provided by [transform] function applied to each element of the given array.
//     *
//     * If any of two pairs would have the same key the last one gets added to the map.
//     */
//    public inline fun <K, V, M : MutableMap<in K, in V>> DoubleArray.associateTo(destination: M, transform: (Double) -> Pair<K, V>): M {
//        for (element in this) {
//            destination += transform(element)
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs
//     * provided by [transform] function applied to each element of the given array.
//     *
//     * If any of two pairs would have the same key the last one gets added to the map.
//     */
//    public inline fun <K, V, M : MutableMap<in K, in V>> BooleanArray.associateTo(destination: M, transform: (Boolean) -> Pair<K, V>): M {
//        for (element in this) {
//            destination += transform(element)
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs
//     * provided by [transform] function applied to each element of the given array.
//     *
//     * If any of two pairs would have the same key the last one gets added to the map.
//     */
//    public inline fun <K, V, M : MutableMap<in K, in V>> CharArray.associateTo(destination: M, transform: (Char) -> Pair<K, V>): M {
//        for (element in this) {
//            destination += transform(element)
//        }
//        return destination
//    }
//
//
//    /**
//     * Searches the array or the range of the array for the provided [element] using the binary search algorithm.
//     * The array is expected to be sorted according to the specified [comparator], otherwise the result is undefined.
//     *
//     * If the array contains multiple elements equal to the specified [element], there is no guarantee which one will be found.
//     *
//     * @return the index of the element, if it is contained in the array within the specified range;
//     * otherwise, the inverted insertion point `(-insertion point - 1)`.
//     * The insertion point is defined as the index at which the element should be inserted,
//     * so that the array (or the specified subrange of array) still remains sorted according to the specified [comparator].
//     */
//    public fun <T> Array<out T>.binarySearch(element: T, comparator: Comparator<in T>, fromIndex: Int = 0, toIndex: Int = size): Int {
//        return java.util.Arrays.binarySearch(this, fromIndex, toIndex, element, comparator)
//    }
//
//    /**
//     * Searches the array or the range of the array for the provided [element] using the binary search algorithm.
//     * The array is expected to be sorted, otherwise the result is undefined.
//     *
//     * If the array contains multiple elements equal to the specified [element], there is no guarantee which one will be found.
//     *
//     * @return the index of the element, if it is contained in the array within the specified range;
//     * otherwise, the inverted insertion point `(-insertion point - 1)`.
//     * The insertion point is defined as the index at which the element should be inserted,
//     * so that the array (or the specified subrange of array) still remains sorted.
//     */
//    public fun <T> Array<out T>.binarySearch(element: T, fromIndex: Int = 0, toIndex: Int = size): Int {
//        return java.util.Arrays.binarySearch(this, fromIndex, toIndex, element)
//    }
//
//    /**
//     * Searches the array or the range of the array for the provided [element] using the binary search algorithm.
//     * The array is expected to be sorted, otherwise the result is undefined.
//     *
//     * If the array contains multiple elements equal to the specified [element], there is no guarantee which one will be found.
//     *
//     * @return the index of the element, if it is contained in the array within the specified range;
//     * otherwise, the inverted insertion point `(-insertion point - 1)`.
//     * The insertion point is defined as the index at which the element should be inserted,
//     * so that the array (or the specified subrange of array) still remains sorted.
//     */
//    public fun ByteArray.binarySearch(element: Byte, fromIndex: Int = 0, toIndex: Int = size): Int {
//        return java.util.Arrays.binarySearch(this, fromIndex, toIndex, element)
//    }
//
//    /**
//     * Searches the array or the range of the array for the provided [element] using the binary search algorithm.
//     * The array is expected to be sorted, otherwise the result is undefined.
//     *
//     * If the array contains multiple elements equal to the specified [element], there is no guarantee which one will be found.
//     *
//     * @return the index of the element, if it is contained in the array within the specified range;
//     * otherwise, the inverted insertion point `(-insertion point - 1)`.
//     * The insertion point is defined as the index at which the element should be inserted,
//     * so that the array (or the specified subrange of array) still remains sorted.
//     */
//    public fun ShortArray.binarySearch(element: Short, fromIndex: Int = 0, toIndex: Int = size): Int {
//        return java.util.Arrays.binarySearch(this, fromIndex, toIndex, element)
//    }
//
//    /**
//     * Searches the array or the range of the array for the provided [element] using the binary search algorithm.
//     * The array is expected to be sorted, otherwise the result is undefined.
//     *
//     * If the array contains multiple elements equal to the specified [element], there is no guarantee which one will be found.
//     *
//     * @return the index of the element, if it is contained in the array within the specified range;
//     * otherwise, the inverted insertion point `(-insertion point - 1)`.
//     * The insertion point is defined as the index at which the element should be inserted,
//     * so that the array (or the specified subrange of array) still remains sorted.
//     */
//    public fun IntArray.binarySearch(element: Int, fromIndex: Int = 0, toIndex: Int = size): Int {
//        return java.util.Arrays.binarySearch(this, fromIndex, toIndex, element)
//    }
//
//    /**
//     * Searches the array or the range of the array for the provided [element] using the binary search algorithm.
//     * The array is expected to be sorted, otherwise the result is undefined.
//     *
//     * If the array contains multiple elements equal to the specified [element], there is no guarantee which one will be found.
//     *
//     * @return the index of the element, if it is contained in the array within the specified range;
//     * otherwise, the inverted insertion point `(-insertion point - 1)`.
//     * The insertion point is defined as the index at which the element should be inserted,
//     * so that the array (or the specified subrange of array) still remains sorted.
//     */
//    public fun LongArray.binarySearch(element: Long, fromIndex: Int = 0, toIndex: Int = size): Int {
//        return java.util.Arrays.binarySearch(this, fromIndex, toIndex, element)
//    }
//
//    /**
//     * Searches the array or the range of the array for the provided [element] using the binary search algorithm.
//     * The array is expected to be sorted, otherwise the result is undefined.
//     *
//     * If the array contains multiple elements equal to the specified [element], there is no guarantee which one will be found.
//     *
//     * @return the index of the element, if it is contained in the array within the specified range;
//     * otherwise, the inverted insertion point `(-insertion point - 1)`.
//     * The insertion point is defined as the index at which the element should be inserted,
//     * so that the array (or the specified subrange of array) still remains sorted.
//     */
//    public fun FloatArray.binarySearch(element: Float, fromIndex: Int = 0, toIndex: Int = size): Int {
//        return java.util.Arrays.binarySearch(this, fromIndex, toIndex, element)
//    }
//
//    /**
//     * Searches the array or the range of the array for the provided [element] using the binary search algorithm.
//     * The array is expected to be sorted, otherwise the result is undefined.
//     *
//     * If the array contains multiple elements equal to the specified [element], there is no guarantee which one will be found.
//     *
//     * @return the index of the element, if it is contained in the array within the specified range;
//     * otherwise, the inverted insertion point `(-insertion point - 1)`.
//     * The insertion point is defined as the index at which the element should be inserted,
//     * so that the array (or the specified subrange of array) still remains sorted.
//     */
//    public fun DoubleArray.binarySearch(element: Double, fromIndex: Int = 0, toIndex: Int = size): Int {
//        return java.util.Arrays.binarySearch(this, fromIndex, toIndex, element)
//    }
//
//    /**
//     * Searches the array or the range of the array for the provided [element] using the binary search algorithm.
//     * The array is expected to be sorted, otherwise the result is undefined.
//     *
//     * If the array contains multiple elements equal to the specified [element], there is no guarantee which one will be found.
//     *
//     * @return the index of the element, if it is contained in the array within the specified range;
//     * otherwise, the inverted insertion point `(-insertion point - 1)`.
//     * The insertion point is defined as the index at which the element should be inserted,
//     * so that the array (or the specified subrange of array) still remains sorted.
//     */
//    public fun CharArray.binarySearch(element: Char, fromIndex: Int = 0, toIndex: Int = size): Int {
//        return java.util.Arrays.binarySearch(this, fromIndex, toIndex, element)
//    }
//
//
//    /**
//     * Returns a [List] that wraps the original array.
//     */
//    public fun <T> Array<out T>.asList(): List<T> {
//        return ArraysUtilJVM.asList(this)
//    }
//
//    /**
//     * Returns a [List] that wraps the original array.
//     */
//    public fun ByteArray.asList(): List<Byte> {
//        return object : AbstractList<Byte>(), RandomAccess {
//            override val size: Int get() = this@asList.size
//            override fun isEmpty(): Boolean = this@asList.isEmpty()
//            override fun contains(element: Byte): Boolean = this@asList.contains(element)
//            override fun get(index: Int): Byte = this@asList[index]
//            override fun indexOf(element: Byte): Int = this@asList.indexOf(element)
//            override fun lastIndexOf(element: Byte): Int = this@asList.lastIndexOf(element)
//        }
//    }
//
//    /**
//     * Returns a [List] that wraps the original array.
//     */
//    public fun ShortArray.asList(): List<Short> {
//        return object : AbstractList<Short>(), RandomAccess {
//            override val size: Int get() = this@asList.size
//            override fun isEmpty(): Boolean = this@asList.isEmpty()
//            override fun contains(element: Short): Boolean = this@asList.contains(element)
//            override fun get(index: Int): Short = this@asList[index]
//            override fun indexOf(element: Short): Int = this@asList.indexOf(element)
//            override fun lastIndexOf(element: Short): Int = this@asList.lastIndexOf(element)
//        }
//    }
//
//    /**
//     * Returns a [List] that wraps the original array.
//     */
//    public fun IntArray.asList(): List<Int> {
//        return object : AbstractList<Int>(), RandomAccess {
//            override val size: Int get() = this@asList.size
//            override fun isEmpty(): Boolean = this@asList.isEmpty()
//            override fun contains(element: Int): Boolean = this@asList.contains(element)
//            override fun get(index: Int): Int = this@asList[index]
//            override fun indexOf(element: Int): Int = this@asList.indexOf(element)
//            override fun lastIndexOf(element: Int): Int = this@asList.lastIndexOf(element)
//        }
//    }
//
//    /**
//     * Returns a [List] that wraps the original array.
//     */
//    public fun LongArray.asList(): List<Long> {
//        return object : AbstractList<Long>(), RandomAccess {
//            override val size: Int get() = this@asList.size
//            override fun isEmpty(): Boolean = this@asList.isEmpty()
//            override fun contains(element: Long): Boolean = this@asList.contains(element)
//            override fun get(index: Int): Long = this@asList[index]
//            override fun indexOf(element: Long): Int = this@asList.indexOf(element)
//            override fun lastIndexOf(element: Long): Int = this@asList.lastIndexOf(element)
//        }
//    }
//
//    /**
//     * Returns a [List] that wraps the original array.
//     */
//    public fun FloatArray.asList(): List<Float> {
//        return object : AbstractList<Float>(), RandomAccess {
//            override val size: Int get() = this@asList.size
//            override fun isEmpty(): Boolean = this@asList.isEmpty()
//            override fun contains(element: Float): Boolean = this@asList.contains(element)
//            override fun get(index: Int): Float = this@asList[index]
//            override fun indexOf(element: Float): Int = this@asList.indexOf(element)
//            override fun lastIndexOf(element: Float): Int = this@asList.lastIndexOf(element)
//        }
//    }
//
//    /**
//     * Returns a [List] that wraps the original array.
//     */
//    public fun DoubleArray.asList(): List<Double> {
//        return object : AbstractList<Double>(), RandomAccess {
//            override val size: Int get() = this@asList.size
//            override fun isEmpty(): Boolean = this@asList.isEmpty()
//            override fun contains(element: Double): Boolean = this@asList.contains(element)
//            override fun get(index: Int): Double = this@asList[index]
//            override fun indexOf(element: Double): Int = this@asList.indexOf(element)
//            override fun lastIndexOf(element: Double): Int = this@asList.lastIndexOf(element)
//        }
//    }
//
//    /**
//     * Returns a [List] that wraps the original array.
//     */
//    public fun BooleanArray.asList(): List<Boolean> {
//        return object : AbstractList<Boolean>(), RandomAccess {
//            override val size: Int get() = this@asList.size
//            override fun isEmpty(): Boolean = this@asList.isEmpty()
//            override fun contains(element: Boolean): Boolean = this@asList.contains(element)
//            override fun get(index: Int): Boolean = this@asList[index]
//            override fun indexOf(element: Boolean): Int = this@asList.indexOf(element)
//            override fun lastIndexOf(element: Boolean): Int = this@asList.lastIndexOf(element)
//        }
//    }
//
//    /**
//     * Returns a [List] that wraps the original array.
//     */
//    public fun CharArray.asList(): List<Char> {
//        return object : AbstractList<Char>(), RandomAccess {
//            override val size: Int get() = this@asList.size
//            override fun isEmpty(): Boolean = this@asList.isEmpty()
//            override fun contains(element: Char): Boolean = this@asList.contains(element)
//            override fun get(index: Int): Char = this@asList[index]
//            override fun indexOf(element: Char): Int = this@asList.indexOf(element)
//            override fun lastIndexOf(element: Char): Int = this@asList.lastIndexOf(element)
//        }
//    }
//
//
//    /**
//     * Returns `true` if [element] is found in the array.
//     */
//    public operator fun <@kotlin.internal.OnlyInputTypes T> Array<out T>.contains(element: T): Boolean {
//        return indexOf(element) >= 0
//    }
//
//    /**
//     * Returns `true` if [element] is found in the array.
//     */
//    public operator fun ByteArray.contains(element: Byte): Boolean {
//        return indexOf(element) >= 0
//    }
//
//    /**
//     * Returns `true` if [element] is found in the array.
//     */
//    public operator fun ShortArray.contains(element: Short): Boolean {
//        return indexOf(element) >= 0
//    }
//
//    /**
//     * Returns `true` if [element] is found in the array.
//     */
//    public operator fun IntArray.contains(element: Int): Boolean {
//        return indexOf(element) >= 0
//    }
//
//    /**
//     * Returns `true` if [element] is found in the array.
//     */
//    public operator fun LongArray.contains(element: Long): Boolean {
//        return indexOf(element) >= 0
//    }
//
//    /**
//     * Returns `true` if [element] is found in the array.
//     */
//    public operator fun FloatArray.contains(element: Float): Boolean {
//        return indexOf(element) >= 0
//    }
//
//    /**
//     * Returns `true` if [element] is found in the array.
//     */
//    public operator fun DoubleArray.contains(element: Double): Boolean {
//        return indexOf(element) >= 0
//    }
//
//    /**
//     * Returns `true` if [element] is found in the array.
//     */
//    public operator fun BooleanArray.contains(element: Boolean): Boolean {
//        return indexOf(element) >= 0
//    }
//
//    /**
//     * Returns `true` if [element] is found in the array.
//     */
//    public operator fun CharArray.contains(element: Char): Boolean {
//        return indexOf(element) >= 0
//    }
//
//
//
//    /**
//     * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
//     */
//    @kotlin.internal.InlineOnly
//    public inline fun <T> Array<out T>.elementAt(index: Int): T {
//        return get(index)
//    }
//
///**
// * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun ByteArray.elementAt(index: Int): Byte {
//        return get(index)
//    }
//
///**
// * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun ShortArray.elementAt(index: Int): Short {
//        return get(index)
//    }
//
///**
// * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun IntArray.elementAt(index: Int): Int {
//        return get(index)
//    }
//
///**
// * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun LongArray.elementAt(index: Int): Long {
//        return get(index)
//    }
//
///**
// * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun FloatArray.elementAt(index: Int): Float {
//        return get(index)
//    }
//
///**
// * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun DoubleArray.elementAt(index: Int): Double {
//        return get(index)
//    }
//
///**
// * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun BooleanArray.elementAt(index: Int): Boolean {
//        return get(index)
//    }
//
///**
// * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun CharArray.elementAt(index: Int): Char {
//        return get(index)
//    }
//
///**
// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun <T> Array<out T>.elementAtOrElse(index: Int, defaultValue: (Int) -> T): T {
//        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
//    }
//
///**
// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun ByteArray.elementAtOrElse(index: Int, defaultValue: (Int) -> Byte): Byte {
//        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
//    }
//
///**
// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun ShortArray.elementAtOrElse(index: Int, defaultValue: (Int) -> Short): Short {
//        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
//    }
//
///**
// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun IntArray.elementAtOrElse(index: Int, defaultValue: (Int) -> Int): Int {
//        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
//    }
//
///**
// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun LongArray.elementAtOrElse(index: Int, defaultValue: (Int) -> Long): Long {
//        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
//    }
//
///**
// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun FloatArray.elementAtOrElse(index: Int, defaultValue: (Int) -> Float): Float {
//        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
//    }
//
///**
// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun DoubleArray.elementAtOrElse(index: Int, defaultValue: (Int) -> Double): Double {
//        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
//    }
//
///**
// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun BooleanArray.elementAtOrElse(index: Int, defaultValue: (Int) -> Boolean): Boolean {
//        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
//    }
//
///**
// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun CharArray.elementAtOrElse(index: Int, defaultValue: (Int) -> Char): Char {
//        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
//    }
//
///**
// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun <T> Array<out T>.elementAtOrNull(index: Int): T? {
//        return this.getOrNull(index)
//    }
//
///**
// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun ByteArray.elementAtOrNull(index: Int): Byte? {
//        return this.getOrNull(index)
//    }
//
///**
// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun ShortArray.elementAtOrNull(index: Int): Short? {
//        return this.getOrNull(index)
//    }
//
///**
// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun IntArray.elementAtOrNull(index: Int): Int? {
//        return this.getOrNull(index)
//    }
//
///**
// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun LongArray.elementAtOrNull(index: Int): Long? {
//        return this.getOrNull(index)
//    }
//
///**
// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun FloatArray.elementAtOrNull(index: Int): Float? {
//        return this.getOrNull(index)
//    }
//
///**
// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun DoubleArray.elementAtOrNull(index: Int): Double? {
//        return this.getOrNull(index)
//    }
//
///**
// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun BooleanArray.elementAtOrNull(index: Int): Boolean? {
//        return this.getOrNull(index)
//    }
//
///**
// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun CharArray.elementAtOrNull(index: Int): Char? {
//        return this.getOrNull(index)
//    }
//
//
//
//    /**
//     * Returns the first element matching the given [predicate], or `null` if no such element was found.
//     */
//    @kotlin.internal.InlineOnly
//    public inline fun <T> Array<out T>.find(predicate: (T) -> Boolean): T? {
//        return firstOrNull(predicate)
//    }
//
///**
// * Returns the first element matching the given [predicate], or `null` if no such element was found.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun ByteArray.find(predicate: (Byte) -> Boolean): Byte? {
//        return firstOrNull(predicate)
//    }
//
///**
// * Returns the first element matching the given [predicate], or `null` if no such element was found.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun ShortArray.find(predicate: (Short) -> Boolean): Short? {
//        return firstOrNull(predicate)
//    }
//
///**
// * Returns the first element matching the given [predicate], or `null` if no such element was found.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun IntArray.find(predicate: (Int) -> Boolean): Int? {
//        return firstOrNull(predicate)
//    }
//
///**
// * Returns the first element matching the given [predicate], or `null` if no such element was found.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun LongArray.find(predicate: (Long) -> Boolean): Long? {
//        return firstOrNull(predicate)
//    }
//
///**
// * Returns the first element matching the given [predicate], or `null` if no such element was found.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun FloatArray.find(predicate: (Float) -> Boolean): Float? {
//        return firstOrNull(predicate)
//    }
//
///**
// * Returns the first element matching the given [predicate], or `null` if no such element was found.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun DoubleArray.find(predicate: (Double) -> Boolean): Double? {
//        return firstOrNull(predicate)
//    }
//
///**
// * Returns the first element matching the given [predicate], or `null` if no such element was found.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun BooleanArray.find(predicate: (Boolean) -> Boolean): Boolean? {
//        return firstOrNull(predicate)
//    }
//
///**
// * Returns the first element matching the given [predicate], or `null` if no such element was found.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun CharArray.find(predicate: (Char) -> Boolean): Char? {
//        return firstOrNull(predicate)
//    }
//
///**
// * Returns the last element matching the given [predicate], or `null` if no such element was found.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun <T> Array<out T>.findLast(predicate: (T) -> Boolean): T? {
//        return lastOrNull(predicate)
//    }
//
///**
// * Returns the last element matching the given [predicate], or `null` if no such element was found.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun ByteArray.findLast(predicate: (Byte) -> Boolean): Byte? {
//        return lastOrNull(predicate)
//    }
//
///**
// * Returns the last element matching the given [predicate], or `null` if no such element was found.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun ShortArray.findLast(predicate: (Short) -> Boolean): Short? {
//        return lastOrNull(predicate)
//    }
//
///**
// * Returns the last element matching the given [predicate], or `null` if no such element was found.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun IntArray.findLast(predicate: (Int) -> Boolean): Int? {
//        return lastOrNull(predicate)
//    }
//
///**
// * Returns the last element matching the given [predicate], or `null` if no such element was found.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun LongArray.findLast(predicate: (Long) -> Boolean): Long? {
//        return lastOrNull(predicate)
//    }
//
///**
// * Returns the last element matching the given [predicate], or `null` if no such element was found.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun FloatArray.findLast(predicate: (Float) -> Boolean): Float? {
//        return lastOrNull(predicate)
//    }
//
///**
// * Returns the last element matching the given [predicate], or `null` if no such element was found.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun DoubleArray.findLast(predicate: (Double) -> Boolean): Double? {
//        return lastOrNull(predicate)
//    }
//
///**
// * Returns the last element matching the given [predicate], or `null` if no such element was found.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun BooleanArray.findLast(predicate: (Boolean) -> Boolean): Boolean? {
//        return lastOrNull(predicate)
//    }
//
///**
// * Returns the last element matching the given [predicate], or `null` if no such element was found.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun CharArray.findLast(predicate: (Char) -> Boolean): Char? {
//        return lastOrNull(predicate)
//    }
//
//    /**
//     * Returns first element.
//     * @throws [NoSuchElementException] if the array is empty.
//     */
//    public fun <T> Array<out T>.first(): T {
//        if (isEmpty())
//            throw NoSuchElementException("Array is empty.")
//        return this[0]
//    }
//
//    /**
//     * Returns first element.
//     * @throws [NoSuchElementException] if the array is empty.
//     */
//    public fun ByteArray.first(): Byte {
//        if (isEmpty())
//            throw NoSuchElementException("Array is empty.")
//        return this[0]
//    }
//
//    /**
//     * Returns first element.
//     * @throws [NoSuchElementException] if the array is empty.
//     */
//    public fun ShortArray.first(): Short {
//        if (isEmpty())
//            throw NoSuchElementException("Array is empty.")
//        return this[0]
//    }
//
//    /**
//     * Returns first element.
//     * @throws [NoSuchElementException] if the array is empty.
//     */
//    public fun IntArray.first(): Int {
//        if (isEmpty())
//            throw NoSuchElementException("Array is empty.")
//        return this[0]
//    }
//
//    /**
//     * Returns first element.
//     * @throws [NoSuchElementException] if the array is empty.
//     */
//    public fun LongArray.first(): Long {
//        if (isEmpty())
//            throw NoSuchElementException("Array is empty.")
//        return this[0]
//    }
//
//    /**
//     * Returns first element.
//     * @throws [NoSuchElementException] if the array is empty.
//     */
//    public fun FloatArray.first(): Float {
//        if (isEmpty())
//            throw NoSuchElementException("Array is empty.")
//        return this[0]
//    }
//
//    /**
//     * Returns first element.
//     * @throws [NoSuchElementException] if the array is empty.
//     */
//    public fun DoubleArray.first(): Double {
//        if (isEmpty())
//            throw NoSuchElementException("Array is empty.")
//        return this[0]
//    }
//
//    /**
//     * Returns first element.
//     * @throws [NoSuchElementException] if the array is empty.
//     */
//    public fun BooleanArray.first(): Boolean {
//        if (isEmpty())
//            throw NoSuchElementException("Array is empty.")
//        return this[0]
//    }
//
//    /**
//     * Returns first element.
//     * @throws [NoSuchElementException] if the array is empty.
//     */
//    public fun CharArray.first(): Char {
//        if (isEmpty())
//            throw NoSuchElementException("Array is empty.")
//        return this[0]
//    }
//
//    /**
//     * Returns the first element matching the given [predicate].
//     * @throws [NoSuchElementException] if no such element is found.
//     */
//    public inline fun <T> Array<out T>.first(predicate: (T) -> Boolean): T {
//        for (element in this) if (predicate(element)) return element
//        throw NoSuchElementException("Array contains no element matching the predicate.")
//    }
//
//    /**
//     * Returns the first element matching the given [predicate].
//     * @throws [NoSuchElementException] if no such element is found.
//     */
//    public inline fun ByteArray.first(predicate: (Byte) -> Boolean): Byte {
//        for (element in this) if (predicate(element)) return element
//        throw NoSuchElementException("Array contains no element matching the predicate.")
//    }
//
//    /**
//     * Returns the first element matching the given [predicate].
//     * @throws [NoSuchElementException] if no such element is found.
//     */
//    public inline fun ShortArray.first(predicate: (Short) -> Boolean): Short {
//        for (element in this) if (predicate(element)) return element
//        throw NoSuchElementException("Array contains no element matching the predicate.")
//    }
//
//    /**
//     * Returns the first element matching the given [predicate].
//     * @throws [NoSuchElementException] if no such element is found.
//     */
//    public inline fun IntArray.first(predicate: (Int) -> Boolean): Int {
//        for (element in this) if (predicate(element)) return element
//        throw NoSuchElementException("Array contains no element matching the predicate.")
//    }
//
//    /**
//     * Returns the first element matching the given [predicate].
//     * @throws [NoSuchElementException] if no such element is found.
//     */
//    public inline fun LongArray.first(predicate: (Long) -> Boolean): Long {
//        for (element in this) if (predicate(element)) return element
//        throw NoSuchElementException("Array contains no element matching the predicate.")
//    }
//
//    /**
//     * Returns the first element matching the given [predicate].
//     * @throws [NoSuchElementException] if no such element is found.
//     */
//    public inline fun FloatArray.first(predicate: (Float) -> Boolean): Float {
//        for (element in this) if (predicate(element)) return element
//        throw NoSuchElementException("Array contains no element matching the predicate.")
//    }
//
//    /**
//     * Returns the first element matching the given [predicate].
//     * @throws [NoSuchElementException] if no such element is found.
//     */
//    public inline fun DoubleArray.first(predicate: (Double) -> Boolean): Double {
//        for (element in this) if (predicate(element)) return element
//        throw NoSuchElementException("Array contains no element matching the predicate.")
//    }
//
//    /**
//     * Returns the first element matching the given [predicate].
//     * @throws [NoSuchElementException] if no such element is found.
//     */
//    public inline fun BooleanArray.first(predicate: (Boolean) -> Boolean): Boolean {
//        for (element in this) if (predicate(element)) return element
//        throw NoSuchElementException("Array contains no element matching the predicate.")
//    }
//
//    /**
//     * Returns the first element matching the given [predicate].
//     * @throws [NoSuchElementException] if no such element is found.
//     */
//    public inline fun CharArray.first(predicate: (Char) -> Boolean): Char {
//        for (element in this) if (predicate(element)) return element
//        throw NoSuchElementException("Array contains no element matching the predicate.")
//    }
//
//    /**
//     * Returns the first element, or `null` if the array is empty.
//     */
//    public fun <T> Array<out T>.firstOrNull(): T? {
//        return if (isEmpty()) null else this[0]
//    }
//
//    /**
//     * Returns the first element, or `null` if the array is empty.
//     */
//    public fun ByteArray.firstOrNull(): Byte? {
//        return if (isEmpty()) null else this[0]
//    }
//
//    /**
//     * Returns the first element, or `null` if the array is empty.
//     */
//    public fun ShortArray.firstOrNull(): Short? {
//        return if (isEmpty()) null else this[0]
//    }
//
//    /**
//     * Returns the first element, or `null` if the array is empty.
//     */
//    public fun IntArray.firstOrNull(): Int? {
//        return if (isEmpty()) null else this[0]
//    }
//
//    /**
//     * Returns the first element, or `null` if the array is empty.
//     */
//    public fun LongArray.firstOrNull(): Long? {
//        return if (isEmpty()) null else this[0]
//    }
//
//    /**
//     * Returns the first element, or `null` if the array is empty.
//     */
//    public fun FloatArray.firstOrNull(): Float? {
//        return if (isEmpty()) null else this[0]
//    }
//
//    /**
//     * Returns the first element, or `null` if the array is empty.
//     */
//    public fun DoubleArray.firstOrNull(): Double? {
//        return if (isEmpty()) null else this[0]
//    }
//
//    /**
//     * Returns the first element, or `null` if the array is empty.
//     */
//    public fun BooleanArray.firstOrNull(): Boolean? {
//        return if (isEmpty()) null else this[0]
//    }
//
//    /**
//     * Returns the first element, or `null` if the array is empty.
//     */
//    public fun CharArray.firstOrNull(): Char? {
//        return if (isEmpty()) null else this[0]
//    }
//
//    /**
//     * Returns the first element matching the given [predicate], or `null` if element was not found.
//     */
//    public inline fun <T> Array<out T>.firstOrNull(predicate: (T) -> Boolean): T? {
//        for (element in this) if (predicate(element)) return element
//        return null
//    }
//
//    /**
//     * Returns the first element matching the given [predicate], or `null` if element was not found.
//     */
//    public inline fun ByteArray.firstOrNull(predicate: (Byte) -> Boolean): Byte? {
//        for (element in this) if (predicate(element)) return element
//        return null
//    }
//
//    /**
//     * Returns the first element matching the given [predicate], or `null` if element was not found.
//     */
//    public inline fun ShortArray.firstOrNull(predicate: (Short) -> Boolean): Short? {
//        for (element in this) if (predicate(element)) return element
//        return null
//    }
//
//    /**
//     * Returns the first element matching the given [predicate], or `null` if element was not found.
//     */
//    public inline fun IntArray.firstOrNull(predicate: (Int) -> Boolean): Int? {
//        for (element in this) if (predicate(element)) return element
//        return null
//    }
//
//    /**
//     * Returns the first element matching the given [predicate], or `null` if element was not found.
//     */
//    public inline fun LongArray.firstOrNull(predicate: (Long) -> Boolean): Long? {
//        for (element in this) if (predicate(element)) return element
//        return null
//    }
//
//    /**
//     * Returns the first element matching the given [predicate], or `null` if element was not found.
//     */
//    public inline fun FloatArray.firstOrNull(predicate: (Float) -> Boolean): Float? {
//        for (element in this) if (predicate(element)) return element
//        return null
//    }
//
//    /**
//     * Returns the first element matching the given [predicate], or `null` if element was not found.
//     */
//    public inline fun DoubleArray.firstOrNull(predicate: (Double) -> Boolean): Double? {
//        for (element in this) if (predicate(element)) return element
//        return null
//    }
//
//    /**
//     * Returns the first element matching the given [predicate], or `null` if element was not found.
//     */
//    public inline fun BooleanArray.firstOrNull(predicate: (Boolean) -> Boolean): Boolean? {
//        for (element in this) if (predicate(element)) return element
//        return null
//    }
//
//    /**
//     * Returns the first element matching the given [predicate], or `null` if element was not found.
//     */
//    public inline fun CharArray.firstOrNull(predicate: (Char) -> Boolean): Char? {
//        for (element in this) if (predicate(element)) return element
//        return null
//    }
//
///**
// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun <T> Array<out T>.getOrElse(index: Int, defaultValue: (Int) -> T): T {
//        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
//    }
//
///**
// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun ByteArray.getOrElse(index: Int, defaultValue: (Int) -> Byte): Byte {
//        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
//    }
//
///**
// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun ShortArray.getOrElse(index: Int, defaultValue: (Int) -> Short): Short {
//        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
//    }
//
///**
// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun IntArray.getOrElse(index: Int, defaultValue: (Int) -> Int): Int {
//        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
//    }
//
///**
// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun LongArray.getOrElse(index: Int, defaultValue: (Int) -> Long): Long {
//        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
//    }
//
///**
// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun FloatArray.getOrElse(index: Int, defaultValue: (Int) -> Float): Float {
//        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
//    }
//
///**
// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun DoubleArray.getOrElse(index: Int, defaultValue: (Int) -> Double): Double {
//        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
//    }
//
///**
// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun BooleanArray.getOrElse(index: Int, defaultValue: (Int) -> Boolean): Boolean {
//        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
//    }
//
///**
// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun CharArray.getOrElse(index: Int, defaultValue: (Int) -> Char): Char {
//        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
//    }
//
//    /**
//     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//     */
//    public fun <T> Array<out T>.getOrNull(index: Int): T? {
//        return if (index >= 0 && index <= lastIndex) get(index) else null
//    }
//
//    /**
//     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//     */
//    public fun ByteArray.getOrNull(index: Int): Byte? {
//        return if (index >= 0 && index <= lastIndex) get(index) else null
//    }
//
//    /**
//     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//     */
//    public fun ShortArray.getOrNull(index: Int): Short? {
//        return if (index >= 0 && index <= lastIndex) get(index) else null
//    }
//
//    /**
//     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//     */
//    public fun IntArray.getOrNull(index: Int): Int? {
//        return if (index >= 0 && index <= lastIndex) get(index) else null
//    }
//
//    /**
//     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//     */
//    public fun LongArray.getOrNull(index: Int): Long? {
//        return if (index >= 0 && index <= lastIndex) get(index) else null
//    }
//
//    /**
//     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//     */
//    public fun FloatArray.getOrNull(index: Int): Float? {
//        return if (index >= 0 && index <= lastIndex) get(index) else null
//    }
//
//    /**
//     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//     */
//    public fun DoubleArray.getOrNull(index: Int): Double? {
//        return if (index >= 0 && index <= lastIndex) get(index) else null
//    }
//
//    /**
//     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//     */
//    public fun BooleanArray.getOrNull(index: Int): Boolean? {
//        return if (index >= 0 && index <= lastIndex) get(index) else null
//    }
//
//    /**
//     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//     */
//    public fun CharArray.getOrNull(index: Int): Char? {
//        return if (index >= 0 && index <= lastIndex) get(index) else null
//    }
//
//    /**
//     * Returns first index of [element], or -1 if the array does not contain element.
//     */
//    public fun <@kotlin.internal.OnlyInputTypes T> Array<out T>.indexOf(element: T): Int {
//        if (element == null) {
//            for (index in indices) {
//                if (this[index] == null) {
//                    return index
//                }
//            }
//        } else {
//            for (index in indices) {
//                if (element == this[index]) {
//                    return index
//                }
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns first index of [element], or -1 if the array does not contain element.
//     */
//    public fun ByteArray.indexOf(element: Byte): Int {
//        for (index in indices) {
//            if (element == this[index]) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns first index of [element], or -1 if the array does not contain element.
//     */
//    public fun ShortArray.indexOf(element: Short): Int {
//        for (index in indices) {
//            if (element == this[index]) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns first index of [element], or -1 if the array does not contain element.
//     */
//    public fun IntArray.indexOf(element: Int): Int {
//        for (index in indices) {
//            if (element == this[index]) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns first index of [element], or -1 if the array does not contain element.
//     */
//    public fun LongArray.indexOf(element: Long): Int {
//        for (index in indices) {
//            if (element == this[index]) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns first index of [element], or -1 if the array does not contain element.
//     */
//    public fun FloatArray.indexOf(element: Float): Int {
//        for (index in indices) {
//            if (element == this[index]) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns first index of [element], or -1 if the array does not contain element.
//     */
//    public fun DoubleArray.indexOf(element: Double): Int {
//        for (index in indices) {
//            if (element == this[index]) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns first index of [element], or -1 if the array does not contain element.
//     */
//    public fun BooleanArray.indexOf(element: Boolean): Int {
//        for (index in indices) {
//            if (element == this[index]) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns first index of [element], or -1 if the array does not contain element.
//     */
//    public fun CharArray.indexOf(element: Char): Int {
//        for (index in indices) {
//            if (element == this[index]) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
//     */
//    public inline fun <T> Array<out T>.indexOfFirst(predicate: (T) -> Boolean): Int {
//        for (index in indices) {
//            if (predicate(this[index])) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
//     */
//    public inline fun ByteArray.indexOfFirst(predicate: (Byte) -> Boolean): Int {
//        for (index in indices) {
//            if (predicate(this[index])) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
//     */
//    public inline fun ShortArray.indexOfFirst(predicate: (Short) -> Boolean): Int {
//        for (index in indices) {
//            if (predicate(this[index])) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
//     */
//    public inline fun IntArray.indexOfFirst(predicate: (Int) -> Boolean): Int {
//        for (index in indices) {
//            if (predicate(this[index])) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
//     */
//    public inline fun LongArray.indexOfFirst(predicate: (Long) -> Boolean): Int {
//        for (index in indices) {
//            if (predicate(this[index])) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
//     */
//    public inline fun FloatArray.indexOfFirst(predicate: (Float) -> Boolean): Int {
//        for (index in indices) {
//            if (predicate(this[index])) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
//     */
//    public inline fun DoubleArray.indexOfFirst(predicate: (Double) -> Boolean): Int {
//        for (index in indices) {
//            if (predicate(this[index])) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
//     */
//    public inline fun BooleanArray.indexOfFirst(predicate: (Boolean) -> Boolean): Int {
//        for (index in indices) {
//            if (predicate(this[index])) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
//     */
//    public inline fun CharArray.indexOfFirst(predicate: (Char) -> Boolean): Int {
//        for (index in indices) {
//            if (predicate(this[index])) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
//     */
//    public inline fun <T> Array<out T>.indexOfLast(predicate: (T) -> Boolean): Int {
//        for (index in indices.reversed()) {
//            if (predicate(this[index])) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
//     */
//    public inline fun ByteArray.indexOfLast(predicate: (Byte) -> Boolean): Int {
//        for (index in indices.reversed()) {
//            if (predicate(this[index])) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
//     */
//    public inline fun ShortArray.indexOfLast(predicate: (Short) -> Boolean): Int {
//        for (index in indices.reversed()) {
//            if (predicate(this[index])) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
//     */
//    public inline fun IntArray.indexOfLast(predicate: (Int) -> Boolean): Int {
//        for (index in indices.reversed()) {
//            if (predicate(this[index])) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
//     */
//    public inline fun LongArray.indexOfLast(predicate: (Long) -> Boolean): Int {
//        for (index in indices.reversed()) {
//            if (predicate(this[index])) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
//     */
//    public inline fun FloatArray.indexOfLast(predicate: (Float) -> Boolean): Int {
//        for (index in indices.reversed()) {
//            if (predicate(this[index])) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
//     */
//    public inline fun DoubleArray.indexOfLast(predicate: (Double) -> Boolean): Int {
//        for (index in indices.reversed()) {
//            if (predicate(this[index])) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
//     */
//    public inline fun BooleanArray.indexOfLast(predicate: (Boolean) -> Boolean): Int {
//        for (index in indices.reversed()) {
//            if (predicate(this[index])) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
//     */
//    public inline fun CharArray.indexOfLast(predicate: (Char) -> Boolean): Int {
//        for (index in indices.reversed()) {
//            if (predicate(this[index])) {
//                return index
//            }
//        }
//        return -1
//    }
}