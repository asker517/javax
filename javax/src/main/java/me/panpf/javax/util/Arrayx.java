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

import me.panpf.javax.lang.IntRange;
import me.panpf.javax.lang.Numberx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.*;

/**
 * Array tool class
 */
@SuppressWarnings("WeakerAccess")
public class Arrayx {

    /* ******************************************* From Kotlin Standard library ********************************************************* */

    /**
     * Returns an original collection containing all the non-`null` elements, throwing an [IllegalArgumentException] if there are any `null` elements.
     */
    @NotNull
    public static <T> T[] requireNoNulls(@NotNull T[] elements) {
        for (T element : elements) {
            if (element == null) {
                throw new IllegalArgumentException("null element found in " + Arrays.toString(elements) + ".");
            }
        }
        return elements;
    }


    /* **************************************************** array of **************************************************** */


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


    /* **************************************************** empty **************************************************** */


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


    /* **************************************************** to array, list, set **************************************************** */


    /**
     * Returns a *typed* object array containing all of the elements of this primitive array.
     */
    public static Byte[] toTypedArray(@NotNull byte[] elements) {
        Byte[] result = new Byte[elements.length];
        int index = 0;
        while (index++ < elements.length) {
            result[index] = elements[index];
        }
        return result;
    }

    /**
     * Returns a *typed* object array containing all of the elements of this primitive array.
     */
    public static Short[] toTypedArray(@NotNull short[] elements) {
        Short[] result = new Short[elements.length];
        int index = 0;
        while (index++ < elements.length) {
            result[index] = elements[index];
        }
        return result;
    }

    /**
     * Returns a *typed* object array containing all of the elements of this primitive array.
     */
    public static Integer[] toTypedArray(@NotNull int[] elements) {
        Integer[] result = new Integer[elements.length];
        int index = 0;
        while (index++ < elements.length) {
            result[index] = elements[index];
        }
        return result;
    }

    /**
     * Returns a *typed* object array containing all of the elements of this primitive array.
     */
    public static Long[] toTypedArray(@NotNull long[] elements) {
        Long[] result = new Long[elements.length];
        int index = 0;
        while (index++ < elements.length) {
            result[index] = elements[index];
        }
        return result;
    }

    /**
     * Returns a *typed* object array containing all of the elements of this primitive array.
     */
    public static Float[] toTypedArray(@NotNull float[] elements) {
        Float[] result = new Float[elements.length];
        int index = 0;
        while (index++ < elements.length) {
            result[index] = elements[index];
        }
        return result;
    }

    /**
     * Returns a *typed* object array containing all of the elements of this primitive array.
     */
    public static Double[] toTypedArray(@NotNull double[] elements) {
        Double[] result = new Double[elements.length];
        int index = 0;
        while (index++ < elements.length) {
            result[index] = elements[index];
        }
        return result;
    }

    /**
     * Returns a *typed* object array containing all of the elements of this primitive array.
     */
    public static Boolean[] toTypedArray(@NotNull boolean[] elements) {
        Boolean[] result = new Boolean[elements.length];
        int index = 0;
        while (index++ < elements.length) {
            result[index] = elements[index];
        }
        return result;
    }

    /**
     * Returns a *typed* object array containing all of the elements of this primitive array.
     */
    public static Character[] toTypedArray(@NotNull char[] elements) {
        Character[] result = new Character[elements.length];
        int index = 0;
        while (index++ < elements.length) {
            result[index] = elements[index];
        }
        return result;
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
     * Returns a [List] all elements.
     */
    @NotNull
    public static List<Byte> toList(@NotNull byte[] elements) {
        ArrayList<Byte> list = new ArrayList<>(elements.length);
        for (byte element : elements) {
            list.add(element);
        }
        return list;
    }

    /**
     * Returns a [List] all elements.
     */
    @NotNull
    public static List<Character> toList(@NotNull char[] elements) {
        ArrayList<Character> list = new ArrayList<>(elements.length);
        for (char element : elements) {
            list.add(element);
        }
        return list;
    }

    /**
     * Returns a [List] all elements.
     */
    @NotNull
    public static List<Short> toList(@NotNull short[] elements) {
        ArrayList<Short> list = new ArrayList<>(elements.length);
        for (short element : elements) {
            list.add(element);
        }
        return list;
    }

    /**
     * Returns a [List] all elements.
     */
    @NotNull
    public static List<Integer> toList(@NotNull int[] elements) {
        ArrayList<Integer> list = new ArrayList<>(elements.length);
        for (int element : elements) {
            list.add(element);
        }
        return list;
    }

    /**
     * Returns a [List] all elements.
     */
    @NotNull
    public static List<Long> toList(@NotNull long[] elements) {
        ArrayList<Long> list = new ArrayList<>(elements.length);
        for (long element : elements) {
            list.add(element);
        }
        return list;
    }

    /**
     * Returns a [List] all elements.
     */
    @NotNull
    public static List<Float> toList(@NotNull float[] elements) {
        ArrayList<Float> list = new ArrayList<>(elements.length);
        for (float element : elements) {
            list.add(element);
        }
        return list;
    }

    /**
     * Returns a [List] all elements.
     */
    @NotNull
    public static List<Double> toList(@NotNull double[] elements) {
        ArrayList<Double> list = new ArrayList<>(elements.length);
        for (double element : elements) {
            list.add(element);
        }
        return list;
    }

    /**
     * Returns a [List] all elements.
     */
    @NotNull
    public static List<Boolean> toList(@NotNull boolean[] elements) {
        ArrayList<Boolean> list = new ArrayList<>(elements.length);
        for (boolean element : elements) {
            list.add(element);
        }
        return list;
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


    /* **************************************************** as list **************************************************** */


    /**
     * Returns a [List] that wraps the original array.
     */
    @NotNull
    public static <T> List<T> asList(@NotNull T[] array) {
        return Arrays.asList(array);
    }


    /**
     * Returns a [List] that wraps the original array.
     */
    @NotNull
    public static List<Byte> asList(@NotNull final byte[] elements) {
        return new AbstractList<Byte>() {

            @Override
            public int size() {
                return elements.length;
            }

            @Override
            public Byte get(int index) {
                return elements[index];
            }
        };
    }


    /**
     * Returns a [List] that wraps the original array.
     */
    @NotNull
    public static List<Short> asList(@NotNull final short[] elements) {
        return new AbstractList<Short>() {

            @Override
            public int size() {
                return elements.length;
            }

            @Override
            public Short get(int index) {
                return elements[index];
            }
        };
    }


    /**
     * Returns a [List] that wraps the original array.
     */
    @NotNull
    public static List<Integer> asList(@NotNull final int[] elements) {
        return new AbstractList<Integer>() {

            @Override
            public int size() {
                return elements.length;
            }

            @Override
            public Integer get(int index) {
                return elements[index];
            }
        };
    }


    /**
     * Returns a [List] that wraps the original array.
     */
    @NotNull
    public static List<Long> asList(@NotNull final long[] elements) {
        return new AbstractList<Long>() {

            @Override
            public int size() {
                return elements.length;
            }

            @Override
            public Long get(int index) {
                return elements[index];
            }
        };
    }


    /**
     * Returns a [List] that wraps the original array.
     */
    @NotNull
    public static List<Float> asList(@NotNull final float[] elements) {
        return new AbstractList<Float>() {

            @Override
            public int size() {
                return elements.length;
            }

            @Override
            public Float get(int index) {
                return elements[index];
            }
        };
    }


    /**
     * Returns a [List] that wraps the original array.
     */
    @NotNull
    public static List<Double> asList(@NotNull final double[] elements) {
        return new AbstractList<Double>() {

            @Override
            public int size() {
                return elements.length;
            }

            @Override
            public Double get(int index) {
                return elements[index];
            }
        };
    }


    /**
     * Returns a [List] that wraps the original array.
     */
    @NotNull
    public static List<Boolean> asList(@NotNull final boolean[] elements) {
        return new AbstractList<Boolean>() {

            @Override
            public int size() {
                return elements.length;
            }

            @Override
            public Boolean get(int index) {
                return elements[index];
            }
        };
    }


    /**
     * Returns a [List] that wraps the original array.
     */
    @NotNull
    public static List<Character> asList(@NotNull final char[] elements) {
        return new AbstractList<Character>() {

            @Override
            public int size() {
                return elements.length;
            }

            @Override
            public Character get(int index) {
                return elements[index];
            }
        };
    }


    /* **************************************************** map **************************************************** */


    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each element in the original array.
     */
    public static <T, R> List<R> map(@NotNull T[] elements, @NotNull Transformer<T, R> transform) {
        return mapTo(elements, new ArrayList<R>(elements.length), transform);
    }

    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each element in the original array.
     */
    public static <R> List<R> map(byte[] elements, @NotNull Transformer<Byte, R> transform) {
        return mapTo(elements, new ArrayList<R>(elements.length), transform);
    }

    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each element in the original array.
     */
    public static <R> List<R> map(short[] elements, @NotNull Transformer<Short, R> transform) {
        return mapTo(elements, new ArrayList<R>(elements.length), transform);
    }

    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each element in the original array.
     */
    public static <R> List<R> map(int[] elements, @NotNull Transformer<Integer, R> transform) {
        return mapTo(elements, new ArrayList<R>(elements.length), transform);
    }

    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each element in the original array.
     */
    public static <R> List<R> map(long[] elements, @NotNull Transformer<Long, R> transform) {
        return mapTo(elements, new ArrayList<R>(elements.length), transform);
    }

    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each element in the original array.
     */
    public static <R> List<R> map(float[] elements, @NotNull Transformer<Float, R> transform) {
        return mapTo(elements, new ArrayList<R>(elements.length), transform);
    }

    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each element in the original array.
     */
    public static <R> List<R> map(double[] elements, @NotNull Transformer<Double, R> transform) {
        return mapTo(elements, new ArrayList<R>(elements.length), transform);
    }

    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each element in the original array.
     */
    public static <R> List<R> map(boolean[] elements, @NotNull Transformer<Boolean, R> transform) {
        return mapTo(elements, new ArrayList<R>(elements.length), transform);
    }

    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each element in the original array.
     */
    public static <R> List<R> map(char[] elements, @NotNull Transformer<Character, R> transform) {
        return mapTo(elements, new ArrayList<R>(elements.length), transform);
    }


    /**
     * Applies the given [transform] function to each element of the original array
     * and appends the results to the given [destination].
     */
    public static <T, R, C extends Collection<R>> C mapTo(@NotNull T[] elements, C destination, Transformer<T, R> transform) {
        for (T item : elements) {
            destination.add(transform.transform(item));
        }
        return destination;
    }

    /**
     * Applies the given [transform] function to each element of the original array
     * and appends the results to the given [destination].
     */
    public static <R, C extends Collection<R>> C mapTo(byte[] elements, C destination, @NotNull Transformer<Byte, R> transform) {
        for (byte item : elements) {
            destination.add(transform.transform(item));
        }
        return destination;
    }

    /**
     * Applies the given [transform] function to each element of the original array
     * and appends the results to the given [destination].
     */
    public static <R, C extends Collection<R>> C mapTo(short[] elements, C destination, @NotNull Transformer<Short, R> transform) {
        for (short item : elements) {
            destination.add(transform.transform(item));
        }
        return destination;
    }

    /**
     * Applies the given [transform] function to each element of the original array
     * and appends the results to the given [destination].
     */
    public static <R, C extends Collection<R>> C mapTo(int[] elements, C destination, @NotNull Transformer<Integer, R> transform) {
        for (int item : elements) {
            destination.add(transform.transform(item));
        }
        return destination;
    }

    /**
     * Applies the given [transform] function to each element of the original array
     * and appends the results to the given [destination].
     */
    public static <R, C extends Collection<R>> C mapTo(long[] elements, C destination, @NotNull Transformer<Long, R> transform) {
        for (long item : elements) {
            destination.add(transform.transform(item));
        }
        return destination;
    }

    /**
     * Applies the given [transform] function to each element of the original array
     * and appends the results to the given [destination].
     */
    public static <R, C extends Collection<R>> C mapTo(float[] elements, C destination, @NotNull Transformer<Float, R> transform) {
        for (float item : elements) {
            destination.add(transform.transform(item));
        }
        return destination;
    }

    /**
     * Applies the given [transform] function to each element of the original array
     * and appends the results to the given [destination].
     */
    public static <R, C extends Collection<R>> C mapTo(double[] elements, C destination, @NotNull Transformer<Double, R> transform) {
        for (double item : elements) {
            destination.add(transform.transform(item));
        }
        return destination;
    }

    /**
     * Applies the given [transform] function to each element of the original array
     * and appends the results to the given [destination].
     */
    public static <R, C extends Collection<R>> C mapTo(boolean[] elements, C destination, @NotNull Transformer<Boolean, R> transform) {
        for (boolean item : elements) {
            destination.add(transform.transform(item));
        }
        return destination;
    }

    /**
     * Applies the given [transform] function to each element of the original array
     * and appends the results to the given [destination].
     */
    public static <R, C extends Collection<R>> C mapTo(char[] elements, C destination, @NotNull Transformer<Character, R> transform) {
        for (char item : elements) {
            destination.add(transform.transform(item));
        }
        return destination;
    }


    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each element and its index in the original array.
     *
     * @param transform function that takes the index of an element and the element itself
     *                  and returns the result of the transform applied to the element.
     */
    public static <T, R> List<R> mapIndexed(@NotNull T[] elements, IndexedTransformer<T, R> transform) {
        return mapIndexedTo(elements, new ArrayList<R>(elements.length), transform);
    }

    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each element and its index in the original array.
     *
     * @param transform function that takes the index of an element and the element itself
     *                  and returns the result of the transform applied to the element.
     */
    public static <R> List<R> mapIndexed(byte[] elements, IndexedTransformer<Byte, R> transform) {
        return mapIndexedTo(elements, new ArrayList<R>(elements.length), transform);
    }

    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each element and its index in the original array.
     *
     * @param transform function that takes the index of an element and the element itself
     *                  and returns the result of the transform applied to the element.
     */
    public static <R> List<R> mapIndexed(short[] elements, IndexedTransformer<Short, R> transform) {
        return mapIndexedTo(elements, new ArrayList<R>(elements.length), transform);
    }

    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each element and its index in the original array.
     *
     * @param transform function that takes the index of an element and the element itself
     *                  and returns the result of the transform applied to the element.
     */
    public static <R> List<R> mapIndexed(int[] elements, IndexedTransformer<Integer, R> transform) {
        return mapIndexedTo(elements, new ArrayList<R>(elements.length), transform);
    }

    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each element and its index in the original array.
     *
     * @param transform function that takes the index of an element and the element itself
     *                  and returns the result of the transform applied to the element.
     */
    public static <R> List<R> mapIndexed(long[] elements, IndexedTransformer<Long, R> transform) {
        return mapIndexedTo(elements, new ArrayList<R>(elements.length), transform);
    }

    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each element and its index in the original array.
     *
     * @param transform function that takes the index of an element and the element itself
     *                  and returns the result of the transform applied to the element.
     */
    public static <R> List<R> mapIndexed(float[] elements, IndexedTransformer<Float, R> transform) {
        return mapIndexedTo(elements, new ArrayList<R>(elements.length), transform);
    }

    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each element and its index in the original array.
     *
     * @param transform function that takes the index of an element and the element itself
     *                  and returns the result of the transform applied to the element.
     */
    public static <R> List<R> mapIndexed(double[] elements, IndexedTransformer<Double, R> transform) {
        return mapIndexedTo(elements, new ArrayList<R>(elements.length), transform);
    }

    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each element and its index in the original array.
     *
     * @param transform function that takes the index of an element and the element itself
     *                  and returns the result of the transform applied to the element.
     */
    public static <R> List<R> mapIndexed(boolean[] elements, IndexedTransformer<Boolean, R> transform) {
        return mapIndexedTo(elements, new ArrayList<R>(elements.length), transform);
    }

    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each element and its index in the original array.
     *
     * @param transform function that takes the index of an element and the element itself
     *                  and returns the result of the transform applied to the element.
     */
    public static <R> List<R> mapIndexed(char[] elements, IndexedTransformer<Character, R> transform) {
        return mapIndexedTo(elements, new ArrayList<R>(elements.length), transform);
    }


    /**
     * Applies the given [transform] function to each element and its index in the original array
     * and appends the results to the given [destination].
     *
     * @param transform function that takes the index of an element and the element itself
     *                  and returns the result of the transform applied to the element.
     */
    public static <T, R, C extends Collection<R>> C mapIndexedTo(@NotNull T[] elements, C destination, IndexedTransformer<T, R> transform) {
        int index = 0;
        for (T item : elements) {
            destination.add(transform.transform(index++, item));
        }
        return destination;
    }

    /**
     * Applies the given [transform] function to each element and its index in the original array
     * and appends the results to the given [destination].
     *
     * @param transform function that takes the index of an element and the element itself
     *                  and returns the result of the transform applied to the element.
     */
    public static <R, C extends Collection<R>> C mapIndexedTo(byte[] elements, C destination, IndexedTransformer<Byte, R> transform) {
        int index = 0;
        for (byte item : elements) {
            destination.add(transform.transform(index++, item));
        }
        return destination;
    }

    /**
     * Applies the given [transform] function to each element and its index in the original array
     * and appends the results to the given [destination].
     *
     * @param transform function that takes the index of an element and the element itself
     *                  and returns the result of the transform applied to the element.
     */
    public static <R, C extends Collection<R>> C mapIndexedTo(short[] elements, C destination, IndexedTransformer<Short, R> transform) {
        int index = 0;
        for (short item : elements) {
            destination.add(transform.transform(index++, item));
        }
        return destination;
    }

    /**
     * Applies the given [transform] function to each element and its index in the original array
     * and appends the results to the given [destination].
     *
     * @param transform function that takes the index of an element and the element itself
     *                  and returns the result of the transform applied to the element.
     */
    public static <R, C extends Collection<R>> C mapIndexedTo(int[] elements, C destination, IndexedTransformer<Integer, R> transform) {
        int index = 0;
        for (int item : elements) {
            destination.add(transform.transform(index++, item));
        }
        return destination;
    }

    /**
     * Applies the given [transform] function to each element and its index in the original array
     * and appends the results to the given [destination].
     *
     * @param transform function that takes the index of an element and the element itself
     *                  and returns the result of the transform applied to the element.
     */
    public static <R, C extends Collection<R>> C mapIndexedTo(long[] elements, C destination, IndexedTransformer<Long, R> transform) {
        int index = 0;
        for (long item : elements) {
            destination.add(transform.transform(index++, item));
        }
        return destination;
    }

    /**
     * Applies the given [transform] function to each element and its index in the original array
     * and appends the results to the given [destination].
     *
     * @param transform function that takes the index of an element and the element itself
     *                  and returns the result of the transform applied to the element.
     */
    public static <R, C extends Collection<R>> C mapIndexedTo(float[] elements, C destination, IndexedTransformer<Float, R> transform) {
        int index = 0;
        for (float item : elements) {
            destination.add(transform.transform(index++, item));
        }
        return destination;
    }

    /**
     * Applies the given [transform] function to each element and its index in the original array
     * and appends the results to the given [destination].
     *
     * @param transform function that takes the index of an element and the element itself
     *                  and returns the result of the transform applied to the element.
     */
    public static <R, C extends Collection<R>> C mapIndexedTo(double[] elements, C destination, IndexedTransformer<Double, R> transform) {
        int index = 0;
        for (double item : elements) {
            destination.add(transform.transform(index++, item));
        }
        return destination;
    }

    /**
     * Applies the given [transform] function to each element and its index in the original array
     * and appends the results to the given [destination].
     *
     * @param transform function that takes the index of an element and the element itself
     *                  and returns the result of the transform applied to the element.
     */
    public static <R, C extends Collection<R>> C mapIndexedTo(boolean[] elements, C destination, IndexedTransformer<Boolean, R> transform) {
        int index = 0;
        for (boolean item : elements) {
            destination.add(transform.transform(index++, item));
        }
        return destination;
    }

    /**
     * Applies the given [transform] function to each element and its index in the original array
     * and appends the results to the given [destination].
     *
     * @param transform function that takes the index of an element and the element itself
     *                  and returns the result of the transform applied to the element.
     */
    public static <R, C extends Collection<R>> C mapIndexedTo(char[] elements, C destination, IndexedTransformer<Character, R> transform) {
        int index = 0;
        for (char item : elements) {
            destination.add(transform.transform(index++, item));
        }
        return destination;
    }


    /**
     * Returns a list containing only the non-null results of applying the given [transform] function
     * to each element in the original array.
     */
    public static <T, R> List<R> mapNotNull(@NotNull T[] elements, NullableTransformer<T, R> transform) {
        return mapNotNullTo(elements, new ArrayList<R>(), transform);
    }

    /**
     * Applies the given [transform] function to each element in the original array
     * and appends only the non-null results to the given [destination].
     */
    public static <T, R, C extends Collection<R>> C mapNotNullTo(@NotNull T[] elements, C destination, NullableTransformer<T, R> transform) {
        for (T item : elements) {
            R r = transform.transform(item);
            if (r != null) {
                destination.add(r);
            }
        }
        return destination;
    }

    /**
     * Returns a list containing only the non-null results of applying the given [transform] function
     * to each element and its index in the original array.
     *
     * @param transform function that takes the index of an element and the element itself
     *                  and returns the result of the transform applied to the element.
     */
    public static <T, R> List<R> mapIndexedNotNull(@NotNull T[] elements, NullableIndexedTransformer<T, R> transform) {
        return mapIndexedNotNullTo(elements, new ArrayList<R>(), transform);
    }

    /**
     * Applies the given [transform] function to each element and its index in the original array
     * and appends only the non-null results to the given [destination].
     *
     * @param transform function that takes the index of an element and the element itself
     *                  and returns the result of the transform applied to the element.
     */
    public static <T, R, C extends Collection<R>> C mapIndexedNotNullTo(@NotNull T[] elements, C destination, NullableIndexedTransformer<T, R> transform) {
        int index = 0;
        for (T item : elements) {
            R r = transform.transform(index++, item);
            if (r != null) {
                destination.add(r);
            }
        }
        return destination;
    }


    /* **************************************************** reverse **************************************************** */


    /**
     * Reverses elements in the array in-place.
     */
    public static <T> void reverse(@NotNull T[] elements) {
        int midPoint = (elements.length / 2) - 1;
        if (midPoint < 0) return;
        int reverseIndex = elements.length - 1;
        for (int index : Numberx.rangeTo(0, midPoint)) {
            T tmp = elements[index];
            elements[index] = elements[reverseIndex];
            elements[reverseIndex] = tmp;
            reverseIndex--;
        }
    }

    /**
     * Reverses elements in the array in-place.
     */
    public static void reverse(@NotNull byte[] elements) {
        int midPoint = (elements.length / 2) - 1;
        if (midPoint < 0) return;
        int reverseIndex = elements.length - 1;
        for (int index : Numberx.rangeTo(0, midPoint)) {
            byte tmp = elements[index];
            elements[index] = elements[reverseIndex];
            elements[reverseIndex] = tmp;
            reverseIndex--;
        }
    }

    /**
     * Reverses elements in the array in-place.
     */
    public static void reverse(@NotNull short[] elements) {
        int midPoint = (elements.length / 2) - 1;
        if (midPoint < 0) return;
        int reverseIndex = elements.length - 1;
        for (int index : Numberx.rangeTo(0, midPoint)) {
            short tmp = elements[index];
            elements[index] = elements[reverseIndex];
            elements[reverseIndex] = tmp;
            reverseIndex--;
        }
    }

    /**
     * Reverses elements in the array in-place.
     */
    public static void reverse(@NotNull int[] elements) {
        int midPoint = (elements.length / 2) - 1;
        if (midPoint < 0) return;
        int reverseIndex = elements.length - 1;
        for (int index : Numberx.rangeTo(0, midPoint)) {
            int tmp = elements[index];
            elements[index] = elements[reverseIndex];
            elements[reverseIndex] = tmp;
            reverseIndex--;
        }
    }

    /**
     * Reverses elements in the array in-place.
     */
    public static void reverse(@NotNull long[] elements) {
        int midPoint = (elements.length / 2) - 1;
        if (midPoint < 0) return;
        int reverseIndex = elements.length - 1;
        for (int index : Numberx.rangeTo(0, midPoint)) {
            long tmp = elements[index];
            elements[index] = elements[reverseIndex];
            elements[reverseIndex] = tmp;
            reverseIndex--;
        }
    }

    /**
     * Reverses elements in the array in-place.
     */
    public static void reverse(@NotNull float[] elements) {
        int midPoint = (elements.length / 2) - 1;
        if (midPoint < 0) return;
        int reverseIndex = elements.length - 1;
        for (int index : Numberx.rangeTo(0, midPoint)) {
            float tmp = elements[index];
            elements[index] = elements[reverseIndex];
            elements[reverseIndex] = tmp;
            reverseIndex--;
        }
    }

    /**
     * Reverses elements in the array in-place.
     */
    public static void reverse(@NotNull double[] elements) {
        int midPoint = (elements.length / 2) - 1;
        if (midPoint < 0) return;
        int reverseIndex = elements.length - 1;
        for (int index : Numberx.rangeTo(0, midPoint)) {
            double tmp = elements[index];
            elements[index] = elements[reverseIndex];
            elements[reverseIndex] = tmp;
            reverseIndex--;
        }
    }

    /**
     * Reverses elements in the array in-place.
     */
    public static void reverse(@NotNull boolean[] elements) {
        int midPoint = (elements.length / 2) - 1;
        if (midPoint < 0) return;
        int reverseIndex = elements.length - 1;
        for (int index : Numberx.rangeTo(0, midPoint)) {
            boolean tmp = elements[index];
            elements[index] = elements[reverseIndex];
            elements[reverseIndex] = tmp;
            reverseIndex--;
        }
    }

    /**
     * Reverses elements in the array in-place.
     */
    public static void reverse(@NotNull char[] elements) {
        int midPoint = (elements.length / 2) - 1;
        if (midPoint < 0) return;
        int reverseIndex = elements.length - 1;
        for (int index : Numberx.rangeTo(0, midPoint)) {
            char tmp = elements[index];
            elements[index] = elements[reverseIndex];
            elements[reverseIndex] = tmp;
            reverseIndex--;
        }
    }

    /**
     * Returns a list with elements in reversed order.
     */
    @NotNull
    public static <T> List<T> reversed(@NotNull T[] elements) {
        if (Arrayx.isEmpty(elements)) return Collectionx.emptyList();
        List<T> list = Arrayx.toList(elements);
        Collectionx.reverse(list);
        return list;
    }

    /**
     * Returns a list with elements in reversed order.
     */
    @NotNull
    public static List<Byte> reversed(@NotNull byte[] elements) {
        if (Arrayx.isEmpty(elements)) return Collectionx.emptyList();
        List<Byte> list = Arrayx.toList(elements);
        Collectionx.reverse(list);
        return list;
    }

    /**
     * Returns a list with elements in reversed order.
     */
    @NotNull
    public static List<Short> reversed(@NotNull short[] elements) {
        if (Arrayx.isEmpty(elements)) return Collectionx.emptyList();
        List<Short> list = Arrayx.toList(elements);
        Collectionx.reverse(list);
        return list;
    }

    /**
     * Returns a list with elements in reversed order.
     */
    @NotNull
    public static List<Integer> reversed(@NotNull int[] elements) {
        if (Arrayx.isEmpty(elements)) return Collectionx.emptyList();
        List<Integer> list = Arrayx.toList(elements);
        Collectionx.reverse(list);
        return list;
    }

    /**
     * Returns a list with elements in reversed order.
     */
    @NotNull
    public static List<Long> reversed(@NotNull long[] elements) {
        if (Arrayx.isEmpty(elements)) return Collectionx.emptyList();
        List<Long> list = Arrayx.toList(elements);
        Collectionx.reverse(list);
        return list;
    }

    /**
     * Returns a list with elements in reversed order.
     */
    @NotNull
    public static List<Float> reversed(@NotNull float[] elements) {
        if (Arrayx.isEmpty(elements)) return Collectionx.emptyList();
        List<Float> list = Arrayx.toList(elements);
        Collectionx.reverse(list);
        return list;
    }

    /**
     * Returns a list with elements in reversed order.
     */
    @NotNull
    public static List<Double> reversed(@NotNull double[] elements) {
        if (Arrayx.isEmpty(elements)) return Collectionx.emptyList();
        List<Double> list = Arrayx.toList(elements);
        Collectionx.reverse(list);
        return list;
    }

    /**
     * Returns a list with elements in reversed order.
     */
    @NotNull
    public static List<Boolean> reversed(@NotNull boolean[] elements) {
        if (Arrayx.isEmpty(elements)) return Collectionx.emptyList();
        List<Boolean> list = Arrayx.toList(elements);
        Collectionx.reverse(list);
        return list;
    }

    /**
     * Returns a list with elements in reversed order.
     */
    @NotNull
    public static List<Character> reversed(@NotNull char[] elements) {
        if (Arrayx.isEmpty(elements)) return Collectionx.emptyList();
        List<Character> list = Arrayx.toList(elements);
        Collectionx.reverse(list);
        return list;
    }

    /**
     * Returns an array with elements of this array in reversed order.
     */
    @NotNull
    public static <T> T[] reversedArray(@NotNull T[] elements) {
        return (T[]) reversed(elements).toArray();
    }

    /**
     * Returns an array with elements of this array in reversed order.
     */
    @NotNull
    public static byte[] reversedArray(@NotNull byte[] elements) {
        if (Arrayx.isEmpty(elements)) return elements;
        byte[] result = new byte[elements.length];
        int lastIndex = elements.length - 1;
        for (int i : Numberx.rangeTo(0, lastIndex)) {
            result[lastIndex - i] = elements[i];
        }
        return result;
    }

    /**
     * Returns an array with elements of this array in reversed order.
     */
    @NotNull
    public static short[] reversedArray(@NotNull short[] elements) {
        if (Arrayx.isEmpty(elements)) return elements;
        short[] result = new short[elements.length];
        int lastIndex = elements.length - 1;
        for (int i : Numberx.rangeTo(0, lastIndex)) {
            result[lastIndex - i] = elements[i];
        }
        return result;
    }

    /**
     * Returns an array with elements of this array in reversed order.
     */
    @NotNull
    public static int[] reversedArray(@NotNull int[] elements) {
        if (Arrayx.isEmpty(elements)) return elements;
        int[] result = new int[elements.length];
        int lastIndex = elements.length - 1;
        for (int i : Numberx.rangeTo(0, lastIndex)) {
            result[lastIndex - i] = elements[i];
        }
        return result;
    }

    /**
     * Returns an array with elements of this array in reversed order.
     */
    @NotNull
    public static long[] reversedArray(@NotNull long[] elements) {
        if (Arrayx.isEmpty(elements)) return elements;
        long[] result = new long[elements.length];
        int lastIndex = elements.length - 1;
        for (int i : Numberx.rangeTo(0, lastIndex)) {
            result[lastIndex - i] = elements[i];
        }
        return result;
    }

    /**
     * Returns an array with elements of this array in reversed order.
     */
    @NotNull
    public static float[] reversedArray(@NotNull float[] elements) {
        if (Arrayx.isEmpty(elements)) return elements;
        float[] result = new float[elements.length];
        int lastIndex = elements.length - 1;
        for (int i : Numberx.rangeTo(0, lastIndex)) {
            result[lastIndex - i] = elements[i];
        }
        return result;
    }

    /**
     * Returns an array with elements of this array in reversed order.
     */
    @NotNull
    public static double[] reversedArray(@NotNull double[] elements) {
        if (Arrayx.isEmpty(elements)) return elements;
        double[] result = new double[elements.length];
        int lastIndex = elements.length - 1;
        for (int i : Numberx.rangeTo(0, lastIndex)) {
            result[lastIndex - i] = elements[i];
        }
        return result;
    }

    /**
     * Returns an array with elements of this array in reversed order.
     */
    @NotNull
    public static boolean[] reversedArray(@NotNull boolean[] elements) {
        if (Arrayx.isEmpty(elements)) return elements;
        boolean[] result = new boolean[elements.length];
        int lastIndex = elements.length - 1;
        for (int i : Numberx.rangeTo(0, lastIndex)) {
            result[lastIndex - i] = elements[i];
        }
        return result;
    }

    /**
     * Returns an array with elements of this array in reversed order.
     */
    @NotNull
    public static char[] reversedArray(@NotNull char[] elements) {
        if (Arrayx.isEmpty(elements)) return elements;
        char[] result = new char[elements.length];
        int lastIndex = elements.length - 1;
        for (int i : Numberx.rangeTo(0, lastIndex)) {
            result[lastIndex - i] = elements[i];
        }
        return result;
    }


    /* **************************************************** sort **************************************************** */


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


    /**
     * Sorts elements in the array in-place descending according to their natural sort order.
     */
    public static <T extends Comparable<T>> void sortDescending(@NotNull T[] elements) {
        sortWith(elements, new Comparisonx.ReverseOrderComparator());
    }

    /**
     * Sorts elements in the array in-place descending according to their natural sort order.
     */
    public static void sortDescending(@NotNull byte[] elements) {
        if (elements.length > 1) {
            sort(elements);
            reverse(elements);
        }
    }

    /**
     * Sorts elements in the array in-place descending according to their natural sort order.
     */
    public static void sortDescending(@NotNull short[] elements) {
        if (elements.length > 1) {
            sort(elements);
            reverse(elements);
        }
    }

    /**
     * Sorts elements in the array in-place descending according to their natural sort order.
     */
    public static void sortDescending(@NotNull int[] elements) {
        if (elements.length > 1) {
            sort(elements);
            reverse(elements);
        }
    }

    /**
     * Sorts elements in the array in-place descending according to their natural sort order.
     */
    public static void sortDescending(@NotNull long[] elements) {
        if (elements.length > 1) {
            sort(elements);
            reverse(elements);
        }
    }

    /**
     * Sorts elements in the array in-place descending according to their natural sort order.
     */
    public static void sortDescending(@NotNull float[] elements) {
        if (elements.length > 1) {
            sort(elements);
            reverse(elements);
        }
    }

    /**
     * Sorts elements in the array in-place descending according to their natural sort order.
     */
    public static void sortDescending(@NotNull double[] elements) {
        if (elements.length > 1) {
            sort(elements);
            reverse(elements);
        }
    }

    /**
     * Sorts elements in the array in-place descending according to their natural sort order.
     */
    public static void sortDescending(@NotNull char[] elements) {
        if (elements.length > 1) {
            sort(elements);
            reverse(elements);
        }
    }


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
     * Sorts elements in the array in-place according to natural sort order of the value returned by specified [selector] function.
     */
    public static <T, R extends Comparable<R>> void sortBy(@NotNull T[] elements, @NotNull NullableTransformer<T, R> selector) {
        if (elements.length > 1) sortWith(elements, Comparisonx.compareBy(selector));
    }


    /**
     * Sorts elements in the array in-place descending according to natural sort order of the value returned by specified [selector] function.
     */
    public static <T, R extends Comparable<R>> void sortByDescending(@NotNull T[] elements, @NotNull NullableTransformer<T, R> selector) {
        if (elements.length > 1) sortWith(elements, Comparisonx.compareByDescending(selector));
    }


    /**
     * Returns a list of all elements sorted according to their natural sort order.
     */
    @NotNull
    public static <T extends Comparable<T>> List<T> sorted(@NotNull T[] elements) {
        return asList(sortedArray(elements));
    }

    /**
     * Returns a list of all elements sorted according to their natural sort order.
     */
    @NotNull
    public static List<Byte> sorted(@NotNull byte[] elements) {
        Byte[] result = toTypedArray(elements);
        sort(result);
        return asList(result);
    }

    /**
     * Returns a list of all elements sorted according to their natural sort order.
     */
    @NotNull
    public static List<Short> sorted(@NotNull short[] elements) {
        Short[] result = toTypedArray(elements);
        sort(result);
        return asList(result);
    }

    /**
     * Returns a list of all elements sorted according to their natural sort order.
     */
    @NotNull
    public static List<Integer> sorted(@NotNull int[] elements) {
        Integer[] result = toTypedArray(elements);
        sort(result);
        return asList(result);
    }

    /**
     * Returns a list of all elements sorted according to their natural sort order.
     */
    @NotNull
    public static List<Long> sorted(@NotNull long[] elements) {
        Long[] result = toTypedArray(elements);
        sort(result);
        return asList(result);
    }

    /**
     * Returns a list of all elements sorted according to their natural sort order.
     */
    @NotNull
    public static List<Float> sorted(@NotNull float[] elements) {
        Float[] result = toTypedArray(elements);
        sort(result);
        return asList(result);
    }

    /**
     * Returns a list of all elements sorted according to their natural sort order.
     */
    @NotNull
    public static List<Double> sorted(@NotNull double[] elements) {
        Double[] result = toTypedArray(elements);
        sort(result);
        return asList(result);
    }

    /**
     * Returns a list of all elements sorted according to their natural sort order.
     */
    @NotNull
    public static List<Character> sorted(@NotNull char[] elements) {
        Character[] result = toTypedArray(elements);
        sort(result);
        return asList(result);
    }


    /**
     * Returns a list of all elements sorted descending according to their natural sort order.
     */
    @NotNull
    public static <T extends Comparable<T>> List<T> sortedDescending(@NotNull T[] elements) {
        return Arrayx.sortedWith(elements, new Comparisonx.ReverseOrderComparator<T>());
    }

    /**
     * Returns a list of all elements sorted descending according to their natural sort order.
     */
    @NotNull
    public static List<Byte> sortedDescending(@NotNull byte[] elements) {
        byte[] result = Arrayx.copyOf(elements);
        Arrayx.sort(result);
        return Arrayx.reversed(result);
    }

    /**
     * Returns a list of all elements sorted descending according to their natural sort order.
     */
    @NotNull
    public static List<Short> sortedDescending(@NotNull short[] elements) {
        short[] result = Arrayx.copyOf(elements);
        Arrayx.sort(result);
        return Arrayx.reversed(result);
    }

    /**
     * Returns a list of all elements sorted descending according to their natural sort order.
     */
    @NotNull
    public static List<Integer> sortedDescending(@NotNull int[] elements) {
        int[] result = Arrayx.copyOf(elements);
        Arrayx.sort(result);
        return Arrayx.reversed(result);
    }

    /**
     * Returns a list of all elements sorted descending according to their natural sort order.
     */
    @NotNull
    public static List<Long> sortedDescending(@NotNull long[] elements) {
        long[] result = Arrayx.copyOf(elements);
        Arrayx.sort(result);
        return Arrayx.reversed(result);
    }

    /**
     * Returns a list of all elements sorted descending according to their natural sort order.
     */
    @NotNull
    public static List<Float> sortedDescending(@NotNull float[] elements) {
        float[] result = Arrayx.copyOf(elements);
        Arrayx.sort(result);
        return Arrayx.reversed(result);
    }

    /**
     * Returns a list of all elements sorted descending according to their natural sort order.
     */
    @NotNull
    public static List<Double> sortedDescending(@NotNull double[] elements) {
        double[] result = Arrayx.copyOf(elements);
        Arrayx.sort(result);
        return Arrayx.reversed(result);
    }

    /**
     * Returns a list of all elements sorted descending according to their natural sort order.
     */
    @NotNull
    public static List<Character> sortedDescending(@NotNull char[] elements) {
        char[] result = Arrayx.copyOf(elements);
        Arrayx.sort(result);
        return Arrayx.reversed(result);
    }


    /**
     * Returns a list of all elements sorted according to the specified [comparator].
     */
    @NotNull
    public static <T> List<T> sortedWith(@NotNull T[] elements, @NotNull Comparator<T> comparator) {
        return Arrayx.asList(Arrayx.sortedArrayWith(elements, comparator));
    }

    /**
     * Returns a list of all elements sorted according to the specified [comparator].
     */
    @NotNull
    public static List<Byte> sortedWith(@NotNull byte[] elements, @NotNull Comparator<Byte> comparator) {
        Byte[] result = Arrayx.toTypedArray(elements);
        Arrayx.sortWith(result, comparator);
        return Arrayx.asList(result);
    }

    /**
     * Returns a list of all elements sorted according to the specified [comparator].
     */
    @NotNull
    public static List<Short> sortedWith(@NotNull short[] elements, @NotNull Comparator<Short> comparator) {
        Short[] result = Arrayx.toTypedArray(elements);
        Arrayx.sortWith(result, comparator);
        return Arrayx.asList(result);
    }

    /**
     * Returns a list of all elements sorted according to the specified [comparator].
     */
    @NotNull
    public static List<Integer> sortedWith(@NotNull int[] elements, @NotNull Comparator<Integer> comparator) {
        Integer[] result = Arrayx.toTypedArray(elements);
        Arrayx.sortWith(result, comparator);
        return Arrayx.asList(result);
    }

    /**
     * Returns a list of all elements sorted according to the specified [comparator].
     */
    @NotNull
    public static List<Long> sortedWith(@NotNull long[] elements, @NotNull Comparator<Long> comparator) {
        Long[] result = Arrayx.toTypedArray(elements);
        Arrayx.sortWith(result, comparator);
        return Arrayx.asList(result);
    }

    /**
     * Returns a list of all elements sorted according to the specified [comparator].
     */
    @NotNull
    public static List<Float> sortedWith(@NotNull float[] elements, @NotNull Comparator<Float> comparator) {
        Float[] result = Arrayx.toTypedArray(elements);
        Arrayx.sortWith(result, comparator);
        return Arrayx.asList(result);
    }

    /**
     * Returns a list of all elements sorted according to the specified [comparator].
     */
    @NotNull
    public static List<Double> sortedWith(@NotNull double[] elements, @NotNull Comparator<Double> comparator) {
        Double[] result = Arrayx.toTypedArray(elements);
        Arrayx.sortWith(result, comparator);
        return Arrayx.asList(result);
    }

    /**
     * Returns a list of all elements sorted according to the specified [comparator].
     */
    @NotNull
    public static List<Boolean> sortedWith(@NotNull boolean[] elements, @NotNull Comparator<Boolean> comparator) {
        Boolean[] result = Arrayx.toTypedArray(elements);
        Arrayx.sortWith(result, comparator);
        return Arrayx.asList(result);
    }

    /**
     * Returns a list of all elements sorted according to the specified [comparator].
     */
    @NotNull
    public static List<Character> sortedWith(@NotNull char[] elements, @NotNull Comparator<Character> comparator) {
        Character[] result = Arrayx.toTypedArray(elements);
        Arrayx.sortWith(result, comparator);
        return Arrayx.asList(result);
    }


    /**
     * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
     */
    @NotNull
    public static <T, R extends Comparable<R>> List<T> sortedBy(@NotNull T[] elements, @NotNull NullableTransformer<T, R> selector) {
        return sortedWith(elements, Comparisonx.compareBy(selector));
    }

    /**
     * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
     */
    @NotNull
    public static <R extends Comparable<R>> List<Byte> sortedBy(@NotNull byte[] elements, @NotNull NullableTransformer<Byte, R> selector) {
        return sortedWith(elements, Comparisonx.compareBy(selector));
    }

    /**
     * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
     */
    @NotNull
    public static <R extends Comparable<R>> List<Short> sortedBy(@NotNull short[] elements, @NotNull NullableTransformer<Short, R> selector) {
        return sortedWith(elements, Comparisonx.compareBy(selector));
    }

    /**
     * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
     */
    @NotNull
    public static <R extends Comparable<R>> List<Integer> sortedBy(@NotNull int[] elements, @NotNull NullableTransformer<Integer, R> selector) {
        return sortedWith(elements, Comparisonx.compareBy(selector));
    }

    /**
     * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
     */
    @NotNull
    public static <R extends Comparable<R>> List<Long> sortedBy(@NotNull long[] elements, @NotNull NullableTransformer<Long, R> selector) {
        return sortedWith(elements, Comparisonx.compareBy(selector));
    }

    /**
     * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
     */
    @NotNull
    public static <R extends Comparable<R>> List<Float> sortedBy(@NotNull float[] elements, @NotNull NullableTransformer<Float, R> selector) {
        return sortedWith(elements, Comparisonx.compareBy(selector));
    }

    /**
     * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
     */
    @NotNull
    public static <R extends Comparable<R>> List<Double> sortedBy(@NotNull double[] elements, @NotNull NullableTransformer<Double, R> selector) {
        return sortedWith(elements, Comparisonx.compareBy(selector));
    }

    /**
     * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
     */
    @NotNull
    public static <R extends Comparable<R>> List<Boolean> sortedBy(@NotNull boolean[] elements, @NotNull NullableTransformer<Boolean, R> selector) {
        return sortedWith(elements, Comparisonx.compareBy(selector));
    }

    /**
     * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
     */
    @NotNull
    public static <R extends Comparable<R>> List<Character> sortedBy(@NotNull char[] elements, @NotNull NullableTransformer<Character, R> selector) {
        return sortedWith(elements, Comparisonx.compareBy(selector));
    }


    /**
     * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
     */
    public static <T, R extends Comparable<R>> List<T> sortedByDescending(@NotNull T[] elements, NullableTransformer<T, R> selector) {
        return sortedWith(elements, Comparisonx.compareByDescending(selector));
    }

    /**
     * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
     */
    public static <R extends Comparable<R>> List<Byte> sortedByDescending(@NotNull byte[] elements, NullableTransformer<Byte, R> selector) {
        return sortedWith(elements, Comparisonx.compareByDescending(selector));
    }

    /**
     * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
     */
    public static <R extends Comparable<R>> List<Short> sortedByDescending(@NotNull short[] elements, NullableTransformer<Short, R> selector) {
        return sortedWith(elements, Comparisonx.compareByDescending(selector));
    }

    /**
     * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
     */
    public static <R extends Comparable<R>> List<Integer> sortedByDescending(@NotNull int[] elements, NullableTransformer<Integer, R> selector) {
        return sortedWith(elements, Comparisonx.compareByDescending(selector));
    }

    /**
     * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
     */
    public static <R extends Comparable<R>> List<Long> sortedByDescending(@NotNull long[] elements, NullableTransformer<Long, R> selector) {
        return sortedWith(elements, Comparisonx.compareByDescending(selector));
    }

    /**
     * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
     */
    public static <R extends Comparable<R>> List<Float> sortedByDescending(@NotNull float[] elements, NullableTransformer<Float, R> selector) {
        return sortedWith(elements, Comparisonx.compareByDescending(selector));
    }

    /**
     * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
     */
    public static <R extends Comparable<R>> List<Double> sortedByDescending(@NotNull double[] elements, NullableTransformer<Double, R> selector) {
        return sortedWith(elements, Comparisonx.compareByDescending(selector));
    }

    /**
     * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
     */
    public static <R extends Comparable<R>> List<Boolean> sortedByDescending(@NotNull boolean[] elements, NullableTransformer<Boolean, R> selector) {
        return sortedWith(elements, Comparisonx.compareByDescending(selector));
    }

    /**
     * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
     */
    public static <R extends Comparable<R>> List<Character> sortedByDescending(@NotNull char[] elements, NullableTransformer<Character, R> selector) {
        return sortedWith(elements, Comparisonx.compareByDescending(selector));
    }


    /**
     * Returns an array with all elements of this array sorted according to their natural sort order.
     */
    @NotNull
    public static <T extends Comparable<T>> T[] sortedArray(@NotNull T[] elements) {
        if (Arrayx.isEmpty(elements)) return elements;
        T[] result = copyOf(elements);
        sort(result);
        return result;
    }

    /**
     * Returns an array with all elements of this array sorted according to their natural sort order.
     */
    @NotNull
    public static byte[] sortedArray(@NotNull byte[] elements) {
        if (Arrayx.isEmpty(elements)) return elements;
        byte[] result = copyOf(elements);
        sort(result);
        return result;
    }

    /**
     * Returns an array with all elements of this array sorted according to their natural sort order.
     */
    @NotNull
    public static short[] sortedArray(@NotNull short[] elements) {
        if (Arrayx.isEmpty(elements)) return elements;
        short[] result = copyOf(elements);
        sort(result);
        return result;
    }

    /**
     * Returns an array with all elements of this array sorted according to their natural sort order.
     */
    @NotNull
    public static int[] sortedArray(@NotNull int[] elements) {
        if (Arrayx.isEmpty(elements)) return elements;
        int[] result = copyOf(elements);
        sort(result);
        return result;
    }

    /**
     * Returns an array with all elements of this array sorted according to their natural sort order.
     */
    @NotNull
    public static long[] sortedArray(@NotNull long[] elements) {
        if (Arrayx.isEmpty(elements)) return elements;
        long[] result = copyOf(elements);
        sort(result);
        return result;
    }

    /**
     * Returns an array with all elements of this array sorted according to their natural sort order.
     */
    @NotNull
    public static float[] sortedArray(@NotNull float[] elements) {
        if (Arrayx.isEmpty(elements)) return elements;
        float[] result = copyOf(elements);
        sort(result);
        return result;
    }

    /**
     * Returns an array with all elements of this array sorted according to their natural sort order.
     */
    @NotNull
    public static double[] sortedArray(@NotNull double[] elements) {
        if (Arrayx.isEmpty(elements)) return elements;
        double[] result = copyOf(elements);
        sort(result);
        return result;
    }

    /**
     * Returns an array with all elements of this array sorted according to their natural sort order.
     */
    @NotNull
    public static char[] sortedArray(@NotNull char[] elements) {
        if (Arrayx.isEmpty(elements)) return elements;
        char[] result = copyOf(elements);
        sort(result);
        return result;
    }


    /**
     * Returns an array with all elements of this array sorted descending according to their natural sort order.
     */
    @NotNull
    public static <T extends Comparable<T>> T[] sortedArrayDescending(@NotNull T[] elements) {
        if (Arrayx.isEmpty(elements)) return elements;
        T[] result = Arrayx.copyOf(elements);
        Arrayx.sortWith(elements, new Comparisonx.ReverseOrderComparator<T>());
        return result;
    }

    /**
     * Returns an array with all elements of this array sorted descending according to their natural sort order.
     */
    @NotNull
    public static byte[] sortedArrayDescending(@NotNull byte[] elements) {
        if (Arrayx.isEmpty(elements)) return elements;
        byte[] result = Arrayx.copyOf(elements);
        Arrayx.sortDescending(elements);
        return result;
    }

    /**
     * Returns an array with all elements of this array sorted descending according to their natural sort order.
     */
    @NotNull
    public static short[] sortedArrayDescending(@NotNull short[] elements) {
        if (Arrayx.isEmpty(elements)) return elements;
        short[] result = Arrayx.copyOf(elements);
        Arrayx.sortDescending(elements);
        return result;
    }

    /**
     * Returns an array with all elements of this array sorted descending according to their natural sort order.
     */
    @NotNull
    public static int[] sortedArrayDescending(@NotNull int[] elements) {
        if (Arrayx.isEmpty(elements)) return elements;
        int[] result = Arrayx.copyOf(elements);
        Arrayx.sortDescending(elements);
        return result;
    }

    /**
     * Returns an array with all elements of this array sorted descending according to their natural sort order.
     */
    @NotNull
    public static long[] sortedArrayDescending(@NotNull long[] elements) {
        if (Arrayx.isEmpty(elements)) return elements;
        long[] result = Arrayx.copyOf(elements);
        Arrayx.sortDescending(elements);
        return result;
    }

    /**
     * Returns an array with all elements of this array sorted descending according to their natural sort order.
     */
    @NotNull
    public static float[] sortedArrayDescending(@NotNull float[] elements) {
        if (Arrayx.isEmpty(elements)) return elements;
        float[] result = Arrayx.copyOf(elements);
        Arrayx.sortDescending(elements);
        return result;
    }

    /**
     * Returns an array with all elements of this array sorted descending according to their natural sort order.
     */
    @NotNull
    public static double[] sortedArrayDescending(@NotNull double[] elements) {
        if (Arrayx.isEmpty(elements)) return elements;
        double[] result = Arrayx.copyOf(elements);
        Arrayx.sortDescending(elements);
        return result;
    }

    /**
     * Returns an array with all elements of this array sorted descending according to their natural sort order.
     */
    @NotNull
    public static char[] sortedArrayDescending(@NotNull char[] elements) {
        if (Arrayx.isEmpty(elements)) return elements;
        char[] result = Arrayx.copyOf(elements);
        Arrayx.sortDescending(elements);
        return result;
    }


    /**
     * Returns an array with all elements of this array sorted according the specified [comparator].
     */
    public static <T> T[] sortedArrayWith(@NotNull T[] elements, @NotNull Comparator<T> comparator) {
        if (Arrayx.isEmpty(elements)) return elements;
        T[] result = Arrayx.copyOf(elements);
        Arrayx.sortWith(elements, comparator);
        return result;
    }


    /* **************************************************** single **************************************************** */


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


    /* **************************************************** any **************************************************** */


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


    /* **************************************************** copy **************************************************** */

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


    /* **************************************************** iterator **************************************************** */


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


    /* **************************************************** group **************************************************** */


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


    /* **************************************************** count **************************************************** */


    /**
     * Returns the number of elements in this array.
     */
    public static <T> int count(@NotNull T[] elements) {
        return elements.length;
    }

    /**
     * Returns the number of elements in this array.
     */
    public static int count(@NotNull byte[] elements) {
        return elements.length;
    }

    /**
     * Returns the number of elements in this array.
     */
    public static int count(@NotNull short[] elements) {
        return elements.length;
    }

    /**
     * Returns the number of elements in this array.
     */
    public static int count(@NotNull int[] elements) {
        return elements.length;
    }

    /**
     * Returns the number of elements in this array.
     */
    public static int count(@NotNull long[] elements) {
        return elements.length;
    }

    /**
     * Returns the number of elements in this array.
     */
    public static int count(@NotNull float[] elements) {
        return elements.length;
    }

    /**
     * Returns the number of elements in this array.
     */
    public static int count(@NotNull double[] elements) {
        return elements.length;
    }

    /**
     * Returns the number of elements in this array.
     */
    public static int count(@NotNull boolean[] elements) {
        return elements.length;
    }

    /**
     * Returns the number of elements in this array.
     */
    public static int count(@NotNull char[] elements) {
        return elements.length;
    }

    /**
     * Returns the number of elements matching the given [predicate].
     */
    public static <T> int count(@NotNull T[] elements, @NotNull Predicate<T> predicate) {
        int count = 0;
        for (T element : elements) {
            if (predicate.predicate(element)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns the number of elements matching the given [predicate].
     */
    public static int count(@NotNull byte[] elements, @NotNull Predicate<Byte> predicate) {
        int count = 0;
        for (byte element : elements) {
            if (predicate.predicate(element)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns the number of elements matching the given [predicate].
     */
    public static int count(@NotNull short[] elements, @NotNull Predicate<Short> predicate) {
        int count = 0;
        for (short element : elements) {
            if (predicate.predicate(element)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns the number of elements matching the given [predicate].
     */
    public static int count(@NotNull int[] elements, @NotNull Predicate<Integer> predicate) {
        int count = 0;
        for (int element : elements) {
            if (predicate.predicate(element)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns the number of elements matching the given [predicate].
     */
    public static int count(@NotNull long[] elements, @NotNull Predicate<Long> predicate) {
        int count = 0;
        for (long element : elements) {
            if (predicate.predicate(element)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns the number of elements matching the given [predicate].
     */
    public static int count(@NotNull float[] elements, @NotNull Predicate<Float> predicate) {
        int count = 0;
        for (float element : elements) {
            if (predicate.predicate(element)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns the number of elements matching the given [predicate].
     */
    public static int count(@NotNull double[] elements, @NotNull Predicate<Double> predicate) {
        int count = 0;
        for (double element : elements) {
            if (predicate.predicate(element)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns the number of elements matching the given [predicate].
     */
    public static int count(@NotNull boolean[] elements, @NotNull Predicate<Boolean> predicate) {
        int count = 0;
        for (boolean element : elements) {
            if (predicate.predicate(element)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns the number of elements matching the given [predicate].
     */
    public static int count(@NotNull char[] elements, @NotNull Predicate<Character> predicate) {
        int count = 0;
        for (char element : elements) {
            if (predicate.predicate(element)) {
                count++;
            }
        }
        return count;
    }


    /* **************************************************** max **************************************************** */


    /**
     * Returns the largest element or `null` if there are no elements.
     * <p>
     * If any of elements is `NaN` returns `NaN`.
     */
    @Nullable
    public static Double max(@NotNull Double[] elements) {
        if (Arrayx.isEmpty(elements)) return null;
        Double max = elements[0];
        if (max.isNaN()) return max;
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            Double e = elements[i];
            if (e.isNaN()) return e;
            if (max < e) max = e;
        }
        return max;
    }

    /**
     * Returns the largest element or `null` if there are no elements.
     * <p>
     * If any of elements is `NaN` returns `NaN`.
     */
    @Nullable
    public static Float max(@NotNull Float[] elements) {
        if (Arrayx.isEmpty(elements)) return null;
        Float max = elements[0];
        if (max.isNaN()) return max;
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            Float e = elements[i];
            if (e.isNaN()) return e;
            if (max < e) max = e;
        }
        return max;
    }

    /**
     * Returns the largest element or `null` if there are no elements.
     */
    @Nullable
    public static <T extends Comparable<T>> T max(@NotNull T[] elements) {
        if (Arrayx.isEmpty(elements)) return null;
        T max = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            T e = elements[i];
            if (max.compareTo(e) < 0) max = e;
        }
        return max;
    }

    /**
     * Returns the largest element or `null` if there are no elements.
     */
    @Nullable
    public static Byte max(@NotNull byte[] elements) {
        if (Arrayx.isEmpty(elements)) return null;
        byte max = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            byte e = elements[i];
            if (max < e) max = e;
        }
        return max;
    }

    /**
     * Returns the largest element or `null` if there are no elements.
     */
    @Nullable
    public static Short max(@NotNull short[] elements) {
        if (Arrayx.isEmpty(elements)) return null;
        short max = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            short e = elements[i];
            if (max < e) max = e;
        }
        return max;
    }

    /**
     * Returns the largest element or `null` if there are no elements.
     */
    @Nullable
    public static Integer max(@NotNull int[] elements) {
        if (Arrayx.isEmpty(elements)) return null;
        int max = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            int e = elements[i];
            if (max < e) max = e;
        }
        return max;
    }

    /**
     * Returns the largest element or `null` if there are no elements.
     */
    @Nullable
    public static Long max(@NotNull long[] elements) {
        if (Arrayx.isEmpty(elements)) return null;
        long max = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            long e = elements[i];
            if (max < e) max = e;
        }
        return max;
    }

    /**
     * Returns the largest element or `null` if there are no elements.
     * <p>
     * If any of elements is `NaN` returns `NaN`.
     */
    @Nullable
    public static Float max(@NotNull float[] elements) {
        if (Arrayx.isEmpty(elements)) return null;
        Float max = elements[0];
        if (max.isNaN()) return max;
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            Float e = elements[i];
            if (e.isNaN()) return e;
            if (max < e) max = e;
        }
        return max;
    }

    /**
     * Returns the largest element or `null` if there are no elements.
     * <p>
     * If any of elements is `NaN` returns `NaN`.
     */
    @Nullable
    public static Double max(@NotNull double[] elements) {
        if (Arrayx.isEmpty(elements)) return null;
        Double max = elements[0];
        if (max.isNaN()) return max;
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            Double e = elements[i];
            if (e.isNaN()) return e;
            if (max < e) max = e;
        }
        return max;
    }

    /**
     * Returns the largest element or `null` if there are no elements.
     */
    @Nullable
    public static Character max(@NotNull char[] elements) {
        if (Arrayx.isEmpty(elements)) return null;
        char max = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            char e = elements[i];
            if (max < e) max = e;
        }
        return max;
    }

    /**
     * Returns the first element yielding the largest value of the given function or `null` if there are no elements.
     */
    @Nullable
    public static <T, R extends Comparable<R>> T maxBy(@NotNull T[] elements, @NotNull Transformer<T, R> selector) {
        if (Arrayx.isEmpty(elements)) return null;
        T maxElem = elements[0];
        R maxValue = selector.transform(maxElem);
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            T e = elements[i];
            R v = selector.transform(e);
            if (maxValue.compareTo(v) < 0) {
                maxElem = e;
                maxValue = v;
            }
        }
        return maxElem;
    }

    /**
     * Returns the first element yielding the largest value of the given function or `null` if there are no elements.
     */
    @Nullable
    public static <R extends Comparable<R>> Byte maxBy(@NotNull byte[] elements, @NotNull Transformer<Byte, R> selector) {
        if (Arrayx.isEmpty(elements)) return null;
        byte maxElem = elements[0];
        R maxValue = selector.transform(maxElem);
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            byte e = elements[i];
            R v = selector.transform(e);
            if (maxValue.compareTo(v) < 0) {
                maxElem = e;
                maxValue = v;
            }
        }
        return maxElem;
    }

    /**
     * Returns the first element yielding the largest value of the given function or `null` if there are no elements.
     */
    @Nullable
    public static <R extends Comparable<R>> Short maxBy(@NotNull short[] elements, @NotNull Transformer<Short, R> selector) {
        if (Arrayx.isEmpty(elements)) return null;
        short maxElem = elements[0];
        R maxValue = selector.transform(maxElem);
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            short e = elements[i];
            R v = selector.transform(e);
            if (maxValue.compareTo(v) < 0) {
                maxElem = e;
                maxValue = v;
            }
        }
        return maxElem;
    }

    /**
     * Returns the first element yielding the largest value of the given function or `null` if there are no elements.
     */
    @Nullable
    public static <R extends Comparable<R>> Integer maxBy(@NotNull int[] elements, @NotNull Transformer<Integer, R> selector) {
        if (Arrayx.isEmpty(elements)) return null;
        int maxElem = elements[0];
        R maxValue = selector.transform(maxElem);
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            int e = elements[i];
            R v = selector.transform(e);
            if (maxValue.compareTo(v) < 0) {
                maxElem = e;
                maxValue = v;
            }
        }
        return maxElem;
    }

    /**
     * Returns the first element yielding the largest value of the given function or `null` if there are no elements.
     */
    @Nullable
    public static <R extends Comparable<R>> Long maxBy(@NotNull long[] elements, @NotNull Transformer<Long, R> selector) {
        if (Arrayx.isEmpty(elements)) return null;
        long maxElem = elements[0];
        R maxValue = selector.transform(maxElem);
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            long e = elements[i];
            R v = selector.transform(e);
            if (maxValue.compareTo(v) < 0) {
                maxElem = e;
                maxValue = v;
            }
        }
        return maxElem;
    }

    /**
     * Returns the first element yielding the largest value of the given function or `null` if there are no elements.
     */
    @Nullable
    public static <R extends Comparable<R>> Float maxBy(@NotNull float[] elements, @NotNull Transformer<Float, R> selector) {
        if (Arrayx.isEmpty(elements)) return null;
        float maxElem = elements[0];
        R maxValue = selector.transform(maxElem);
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            float e = elements[i];
            R v = selector.transform(e);
            if (maxValue.compareTo(v) < 0) {
                maxElem = e;
                maxValue = v;
            }
        }
        return maxElem;
    }

    /**
     * Returns the first element yielding the largest value of the given function or `null` if there are no elements.
     */
    @Nullable
    public static <R extends Comparable<R>> Double maxBy(@NotNull double[] elements, @NotNull Transformer<Double, R> selector) {
        if (Arrayx.isEmpty(elements)) return null;
        double maxElem = elements[0];
        R maxValue = selector.transform(maxElem);
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            double e = elements[i];
            R v = selector.transform(e);
            if (maxValue.compareTo(v) < 0) {
                maxElem = e;
                maxValue = v;
            }
        }
        return maxElem;
    }

    /**
     * Returns the first element yielding the largest value of the given function or `null` if there are no elements.
     */
    @Nullable
    public static <R extends Comparable<R>> Boolean maxBy(@NotNull boolean[] elements, @NotNull Transformer<Boolean, R> selector) {
        if (Arrayx.isEmpty(elements)) return null;
        boolean maxElem = elements[0];
        R maxValue = selector.transform(maxElem);
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            boolean e = elements[i];
            R v = selector.transform(e);
            if (maxValue.compareTo(v) < 0) {
                maxElem = e;
                maxValue = v;
            }
        }
        return maxElem;
    }

    /**
     * Returns the first element yielding the largest value of the given function or `null` if there are no elements.
     */
    @Nullable
    public static <R extends Comparable<R>> Character maxBy(@NotNull char[] elements, @NotNull Transformer<Character, R> selector) {
        if (Arrayx.isEmpty(elements)) return null;
        char maxElem = elements[0];
        R maxValue = selector.transform(maxElem);
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            char e = elements[i];
            R v = selector.transform(e);
            if (maxValue.compareTo(v) < 0) {
                maxElem = e;
                maxValue = v;
            }
        }
        return maxElem;
    }

    /**
     * Returns the first element having the largest value according to the provided [comparator] or `null` if there are no elements.
     */
    @Nullable
    public static <T> T maxWith(@NotNull T[] elements, @NotNull Comparator<T> comparator) {
        if (Arrayx.isEmpty(elements)) return null;
        T max = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            T e = elements[i];
            if (comparator.compare(max, e) < 0) max = e;
        }
        return max;
    }

    /**
     * Returns the first element having the largest value according to the provided [comparator] or `null` if there are no elements.
     */
    @Nullable
    public static Byte maxWith(@NotNull byte[] elements, @NotNull Comparator<Byte> comparator) {
        if (Arrayx.isEmpty(elements)) return null;
        byte max = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            byte e = elements[i];
            if (comparator.compare(max, e) < 0) max = e;
        }
        return max;
    }

    /**
     * Returns the first element having the largest value according to the provided [comparator] or `null` if there are no elements.
     */
    @Nullable
    public static Short maxWith(@NotNull short[] elements, @NotNull Comparator<Short> comparator) {
        if (Arrayx.isEmpty(elements)) return null;
        short max = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            short e = elements[i];
            if (comparator.compare(max, e) < 0) max = e;
        }
        return max;
    }

    /**
     * Returns the first element having the largest value according to the provided [comparator] or `null` if there are no elements.
     */
    @Nullable
    public static Integer maxWith(@NotNull int[] elements, @NotNull Comparator<Integer> comparator) {
        if (Arrayx.isEmpty(elements)) return null;
        int max = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            int e = elements[i];
            if (comparator.compare(max, e) < 0) max = e;
        }
        return max;
    }

    /**
     * Returns the first element having the largest value according to the provided [comparator] or `null` if there are no elements.
     */
    @Nullable
    public static Long maxWith(@NotNull long[] elements, @NotNull Comparator<Long> comparator) {
        if (Arrayx.isEmpty(elements)) return null;
        long max = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            long e = elements[i];
            if (comparator.compare(max, e) < 0) max = e;
        }
        return max;
    }

    /**
     * Returns the first element having the largest value according to the provided [comparator] or `null` if there are no elements.
     */
    @Nullable
    public static Float maxWith(@NotNull float[] elements, @NotNull Comparator<Float> comparator) {
        if (Arrayx.isEmpty(elements)) return null;
        float max = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            float e = elements[i];
            if (comparator.compare(max, e) < 0) max = e;
        }
        return max;
    }

    /**
     * Returns the first element having the largest value according to the provided [comparator] or `null` if there are no elements.
     */
    @Nullable
    public static Double maxWith(@NotNull double[] elements, @NotNull Comparator<Double> comparator) {
        if (Arrayx.isEmpty(elements)) return null;
        double max = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            double e = elements[i];
            if (comparator.compare(max, e) < 0) max = e;
        }
        return max;
    }

    /**
     * Returns the first element having the largest value according to the provided [comparator] or `null` if there are no elements.
     */
    @Nullable
    public static Boolean maxWith(@NotNull boolean[] elements, @NotNull Comparator<Boolean> comparator) {
        if (Arrayx.isEmpty(elements)) return null;
        boolean max = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            boolean e = elements[i];
            if (comparator.compare(max, e) < 0) max = e;
        }
        return max;
    }

    /**
     * Returns the first element having the largest value according to the provided [comparator] or `null` if there are no elements.
     */
    @Nullable
    public static Character maxWith(@NotNull char[] elements, @NotNull Comparator<Character> comparator) {
        if (Arrayx.isEmpty(elements)) return null;
        char max = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            char e = elements[i];
            if (comparator.compare(max, e) < 0) max = e;
        }
        return max;
    }


    /* **************************************************** min **************************************************** */


    /**
     * Returns the smallest element or `null` if there are no elements.
     * <p>
     * If any of elements is `NaN` returns `NaN`.
     */
    @Nullable
    public static Double min(@NotNull Double[] elements) {
        if (Arrayx.isEmpty(elements)) return null;
        Double min = elements[0];
        if (min.isNaN()) return min;
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            Double e = elements[i];
            if (e.isNaN()) return e;
            if (min > e) min = e;
        }
        return min;
    }

    /**
     * Returns the smallest element or `null` if there are no elements.
     * <p>
     * If any of elements is `NaN` returns `NaN`.
     */
    @Nullable
    public static Float min(@NotNull Float[] elements) {
        if (Arrayx.isEmpty(elements)) return null;
        Float min = elements[0];
        if (min.isNaN()) return min;
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            Float e = elements[i];
            if (e.isNaN()) return e;
            if (min > e) min = e;
        }
        return min;
    }

    /**
     * Returns the smallest element or `null` if there are no elements.
     */
    @Nullable
    public static <T extends Comparable<T>> T min(@NotNull T[] elements) {
        if (Arrayx.isEmpty(elements)) return null;
        T min = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            T e = elements[i];
            if (min.compareTo(e) > 0) min = e;
        }
        return min;
    }

    /**
     * Returns the smallest element or `null` if there are no elements.
     */
    @Nullable
    public static Byte min(@NotNull byte[] elements) {
        if (Arrayx.isEmpty(elements)) return null;
        byte min = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            byte e = elements[i];
            if (min > e) min = e;
        }
        return min;
    }

    /**
     * Returns the smallest element or `null` if there are no elements.
     */
    @Nullable
    public static Short min(@NotNull short[] elements) {
        if (Arrayx.isEmpty(elements)) return null;
        short min = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            short e = elements[i];
            if (min > e) min = e;
        }
        return min;
    }

    /**
     * Returns the smallest element or `null` if there are no elements.
     */
    @Nullable
    public static Integer min(@NotNull int[] elements) {
        if (Arrayx.isEmpty(elements)) return null;
        int min = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            int e = elements[i];
            if (min > e) min = e;
        }
        return min;
    }

    /**
     * Returns the smallest element or `null` if there are no elements.
     */
    @Nullable
    public static Long min(@NotNull long[] elements) {
        if (Arrayx.isEmpty(elements)) return null;
        long min = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            long e = elements[i];
            if (min > e) min = e;
        }
        return min;
    }

    /**
     * Returns the smallest element or `null` if there are no elements.
     * <p>
     * If any of elements is `NaN` returns `NaN`.
     */
    @Nullable
    public static Float min(@NotNull float[] elements) {
        if (Arrayx.isEmpty(elements)) return null;
        Float min = elements[0];
        if (min.isNaN()) return min;
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            Float e = elements[i];
            if (e.isNaN()) return e;
            if (min > e) min = e;
        }
        return min;
    }

    /**
     * Returns the smallest element or `null` if there are no elements.
     * <p>
     * If any of elements is `NaN` returns `NaN`.
     */
    @Nullable
    public static Double min(@NotNull double[] elements) {
        if (Arrayx.isEmpty(elements)) return null;
        Double min = elements[0];
        if (min.isNaN()) return min;
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            Double e = elements[i];
            if (e.isNaN()) return e;
            if (min > e) min = e;
        }
        return min;
    }

    /**
     * Returns the smallest element or `null` if there are no elements.
     */
    @Nullable
    public static Character min(@NotNull char[] elements) {
        if (Arrayx.isEmpty(elements)) return null;
        char min = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            char e = elements[i];
            if (min > e) min = e;
        }
        return min;
    }

    /**
     * Returns the first element yielding the smallest value of the given function or `null` if there are no elements.
     */
    @Nullable
    public static <T, R extends Comparable<R>> T minBy(@NotNull T[] elements, @NotNull Transformer<T, R> selector) {
        if (Arrayx.isEmpty(elements)) return null;
        T minElem = elements[0];
        R minValue = selector.transform(minElem);
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            T e = elements[i];
            R v = selector.transform(e);
            if (minValue.compareTo(v) > 0) {
                minElem = e;
                minValue = v;
            }
        }
        return minElem;
    }

    /**
     * Returns the first element yielding the smallest value of the given function or `null` if there are no elements.
     */
    @Nullable
    public static <R extends Comparable<R>> Byte minBy(@NotNull byte[] elements, @NotNull Transformer<Byte, R> selector) {
        if (Arrayx.isEmpty(elements)) return null;
        byte minElem = elements[0];
        R minValue = selector.transform(minElem);
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            byte e = elements[i];
            R v = selector.transform(e);
            if (minValue.compareTo(v) > 0) {
                minElem = e;
                minValue = v;
            }
        }
        return minElem;
    }

    /**
     * Returns the first element yielding the smallest value of the given function or `null` if there are no elements.
     */
    @Nullable
    public static <R extends Comparable<R>> Short minBy(@NotNull short[] elements, @NotNull Transformer<Short, R> selector) {
        if (Arrayx.isEmpty(elements)) return null;
        short minElem = elements[0];
        R minValue = selector.transform(minElem);
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            short e = elements[i];
            R v = selector.transform(e);
            if (minValue.compareTo(v) > 0) {
                minElem = e;
                minValue = v;
            }
        }
        return minElem;
    }

    /**
     * Returns the first element yielding the smallest value of the given function or `null` if there are no elements.
     */
    @Nullable
    public static <R extends Comparable<R>> Integer minBy(@NotNull int[] elements, @NotNull Transformer<Integer, R> selector) {
        if (Arrayx.isEmpty(elements)) return null;
        int minElem = elements[0];
        R minValue = selector.transform(minElem);
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            int e = elements[i];
            R v = selector.transform(e);
            if (minValue.compareTo(v) > 0) {
                minElem = e;
                minValue = v;
            }
        }
        return minElem;
    }

    /**
     * Returns the first element yielding the smallest value of the given function or `null` if there are no elements.
     */
    @Nullable
    public static <R extends Comparable<R>> Long minBy(@NotNull long[] elements, @NotNull Transformer<Long, R> selector) {
        if (Arrayx.isEmpty(elements)) return null;
        long minElem = elements[0];
        R minValue = selector.transform(minElem);
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            long e = elements[i];
            R v = selector.transform(e);
            if (minValue.compareTo(v) > 0) {
                minElem = e;
                minValue = v;
            }
        }
        return minElem;
    }

    /**
     * Returns the first element yielding the smallest value of the given function or `null` if there are no elements.
     */
    @Nullable
    public static <R extends Comparable<R>> Float minBy(@NotNull float[] elements, @NotNull Transformer<Float, R> selector) {
        if (Arrayx.isEmpty(elements)) return null;
        float minElem = elements[0];
        R minValue = selector.transform(minElem);
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            float e = elements[i];
            R v = selector.transform(e);
            if (minValue.compareTo(v) > 0) {
                minElem = e;
                minValue = v;
            }
        }
        return minElem;
    }

    /**
     * Returns the first element yielding the smallest value of the given function or `null` if there are no elements.
     */
    @Nullable
    public static <R extends Comparable<R>> Double minBy(@NotNull double[] elements, @NotNull Transformer<Double, R> selector) {
        if (Arrayx.isEmpty(elements)) return null;
        double minElem = elements[0];
        R minValue = selector.transform(minElem);
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            double e = elements[i];
            R v = selector.transform(e);
            if (minValue.compareTo(v) > 0) {
                minElem = e;
                minValue = v;
            }
        }
        return minElem;
    }

    /**
     * Returns the first element yielding the smallest value of the given function or `null` if there are no elements.
     */
    @Nullable
    public static <R extends Comparable<R>> Boolean minBy(@NotNull boolean[] elements, @NotNull Transformer<Boolean, R> selector) {
        if (Arrayx.isEmpty(elements)) return null;
        boolean minElem = elements[0];
        R minValue = selector.transform(minElem);
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            boolean e = elements[i];
            R v = selector.transform(e);
            if (minValue.compareTo(v) > 0) {
                minElem = e;
                minValue = v;
            }
        }
        return minElem;
    }

    /**
     * Returns the first element yielding the smallest value of the given function or `null` if there are no elements.
     */
    @Nullable
    public static <R extends Comparable<R>> Character minBy(@NotNull char[] elements, @NotNull Transformer<Character, R> selector) {
        if (Arrayx.isEmpty(elements)) return null;
        char minElem = elements[0];
        R minValue = selector.transform(minElem);
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            char e = elements[i];
            R v = selector.transform(e);
            if (minValue.compareTo(v) > 0) {
                minElem = e;
                minValue = v;
            }
        }
        return minElem;
    }

    /**
     * Returns the first element having the smallest value according to the provided [comparator] or `null` if there are no elements.
     */
    @Nullable
    public static <T> T minWith(@NotNull T[] elements, @NotNull Comparator<T> comparator) {
        if (Arrayx.isEmpty(elements)) return null;
        T min = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            T e = elements[i];
            if (comparator.compare(min, e) > 0) min = e;
        }
        return min;
    }

    /**
     * Returns the first element having the smallest value according to the provided [comparator] or `null` if there are no elements.
     */
    @Nullable
    public static Byte minWith(@NotNull byte[] elements, @NotNull Comparator<Byte> comparator) {
        if (Arrayx.isEmpty(elements)) return null;
        byte min = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            byte e = elements[i];
            if (comparator.compare(min, e) > 0) min = e;
        }
        return min;
    }

    /**
     * Returns the first element having the smallest value according to the provided [comparator] or `null` if there are no elements.
     */
    @Nullable
    public static Short minWith(@NotNull short[] elements, @NotNull Comparator<Short> comparator) {
        if (Arrayx.isEmpty(elements)) return null;
        short min = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            short e = elements[i];
            if (comparator.compare(min, e) > 0) min = e;
        }
        return min;
    }

    /**
     * Returns the first element having the smallest value according to the provided [comparator] or `null` if there are no elements.
     */
    @Nullable
    public static Integer minWith(@NotNull int[] elements, @NotNull Comparator<Integer> comparator) {
        if (Arrayx.isEmpty(elements)) return null;
        int min = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            int e = elements[i];
            if (comparator.compare(min, e) > 0) min = e;
        }
        return min;
    }

    /**
     * Returns the first element having the smallest value according to the provided [comparator] or `null` if there are no elements.
     */
    @Nullable
    public static Long minWith(@NotNull long[] elements, @NotNull Comparator<Long> comparator) {
        if (Arrayx.isEmpty(elements)) return null;
        long min = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            long e = elements[i];
            if (comparator.compare(min, e) > 0) min = e;
        }
        return min;
    }

    /**
     * Returns the first element having the smallest value according to the provided [comparator] or `null` if there are no elements.
     */
    @Nullable
    public static Float minWith(@NotNull float[] elements, @NotNull Comparator<Float> comparator) {
        if (Arrayx.isEmpty(elements)) return null;
        float min = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            float e = elements[i];
            if (comparator.compare(min, e) > 0) min = e;
        }
        return min;
    }

    /**
     * Returns the first element having the smallest value according to the provided [comparator] or `null` if there are no elements.
     */
    @Nullable
    public static Double minWith(@NotNull double[] elements, @NotNull Comparator<Double> comparator) {
        if (Arrayx.isEmpty(elements)) return null;
        double min = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            double e = elements[i];
            if (comparator.compare(min, e) > 0) min = e;
        }
        return min;
    }

    /**
     * Returns the first element having the smallest value according to the provided [comparator] or `null` if there are no elements.
     */
    @Nullable
    public static Boolean minWith(@NotNull boolean[] elements, @NotNull Comparator<Boolean> comparator) {
        if (Arrayx.isEmpty(elements)) return null;
        boolean min = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            boolean e = elements[i];
            if (comparator.compare(min, e) > 0) min = e;
        }
        return min;
    }

    /**
     * Returns the first element having the smallest value according to the provided [comparator] or `null` if there are no elements.
     */
    @Nullable
    public static Character minWith(@NotNull char[] elements, @NotNull Comparator<Character> comparator) {
        if (Arrayx.isEmpty(elements)) return null;
        char min = elements[0];
        for (int i : Numberx.rangeTo(1, elements.length - 1)) {
            char e = elements[i];
            if (comparator.compare(min, e) > 0) min = e;
        }
        return min;
    }


    /* **************************************************** join **************************************************** */

    /**
     * Appends the string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static <T, A extends Appendable> A joinTo(@NotNull T[] elements, @NotNull A buffer, @Nullable CharSequence separator,
                                                     @Nullable CharSequence prefix, @Nullable CharSequence postfix, int limit,
                                                     @Nullable CharSequence truncated, @Nullable Transformer<T, CharSequence> transform) throws IOException {
        if (separator == null) separator = ", ";
        if (prefix == null) prefix = "";
        if (postfix == null) postfix = "";
        if (truncated == null) truncated = "";
        buffer.append(prefix);
        int count = 0;
        for (T element : elements) {
            if (++count > 1) buffer.append(separator);
            if (limit < 0 || count <= limit) {
                StringBuilderx.appendElement(buffer, element, transform);
            } else {
                break;
            }
        }
        if (limit >= 0 && count > limit) buffer.append(truncated);
        buffer.append(postfix);
        return buffer;
    }

    /**
     * Appends the string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static <A extends Appendable> A joinTo(@NotNull byte[] elements, @NotNull A buffer, @Nullable CharSequence separator,
                                                  @Nullable CharSequence prefix, @Nullable CharSequence postfix, int limit,
                                                  @Nullable CharSequence truncated, @Nullable Transformer<Byte, CharSequence> transform) throws IOException {
        if (separator == null) separator = ", ";
        if (prefix == null) prefix = "";
        if (postfix == null) postfix = "";
        if (truncated == null) truncated = "";
        buffer.append(prefix);
        int count = 0;
        for (byte element : elements) {
            if (++count > 1) buffer.append(separator);
            if (limit < 0 || count <= limit) {
                if (transform != null)
                    buffer.append(transform.transform(element));
                else
                    buffer.append(String.valueOf(element));
            } else {
                break;
            }
        }
        if (limit >= 0 && count > limit) buffer.append(truncated);
        buffer.append(postfix);
        return buffer;
    }

    /**
     * Appends the string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static <A extends Appendable> A joinTo(@NotNull short[] elements, @NotNull A buffer, @Nullable CharSequence separator,
                                                  @Nullable CharSequence prefix, @Nullable CharSequence postfix, int limit,
                                                  @Nullable CharSequence truncated, @Nullable Transformer<Short, CharSequence> transform) throws IOException {
        if (separator == null) separator = ", ";
        if (prefix == null) prefix = "";
        if (postfix == null) postfix = "";
        if (truncated == null) truncated = "";
        buffer.append(prefix);
        int count = 0;
        for (short element : elements) {
            if (++count > 1) buffer.append(separator);
            if (limit < 0 || count <= limit) {
                if (transform != null)
                    buffer.append(transform.transform(element));
                else
                    buffer.append(String.valueOf(element));
            } else {
                break;
            }
        }
        if (limit >= 0 && count > limit) buffer.append(truncated);
        buffer.append(postfix);
        return buffer;
    }

    /**
     * Appends the string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static <A extends Appendable> A joinTo(@NotNull int[] elements, @NotNull A buffer, @Nullable CharSequence separator,
                                                  @Nullable CharSequence prefix, @Nullable CharSequence postfix, int limit,
                                                  @Nullable CharSequence truncated, @Nullable Transformer<Integer, CharSequence> transform) throws IOException {
        if (separator == null) separator = ", ";
        if (prefix == null) prefix = "";
        if (postfix == null) postfix = "";
        if (truncated == null) truncated = "";
        buffer.append(prefix);
        int count = 0;
        for (int element : elements) {
            if (++count > 1) buffer.append(separator);
            if (limit < 0 || count <= limit) {
                if (transform != null)
                    buffer.append(transform.transform(element));
                else
                    buffer.append(String.valueOf(element));
            } else {
                break;
            }
        }
        if (limit >= 0 && count > limit) buffer.append(truncated);
        buffer.append(postfix);
        return buffer;
    }

    /**
     * Appends the string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static <A extends Appendable> A joinTo(@NotNull long[] elements, @NotNull A buffer, @Nullable CharSequence separator,
                                                  @Nullable CharSequence prefix, @Nullable CharSequence postfix, int limit,
                                                  @Nullable CharSequence truncated, @Nullable Transformer<Long, CharSequence> transform) throws IOException {
        if (separator == null) separator = ", ";
        if (prefix == null) prefix = "";
        if (postfix == null) postfix = "";
        if (truncated == null) truncated = "";
        buffer.append(prefix);
        int count = 0;
        for (long element : elements) {
            if (++count > 1) buffer.append(separator);
            if (limit < 0 || count <= limit) {
                if (transform != null)
                    buffer.append(transform.transform(element));
                else
                    buffer.append(String.valueOf(element));
            } else {
                break;
            }
        }
        if (limit >= 0 && count > limit) buffer.append(truncated);
        buffer.append(postfix);
        return buffer;
    }

    /**
     * Appends the string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static <A extends Appendable> A joinTo(@NotNull float[] elements, @NotNull A buffer, @Nullable CharSequence separator,
                                                  @Nullable CharSequence prefix, @Nullable CharSequence postfix, int limit,
                                                  @Nullable CharSequence truncated, @Nullable Transformer<Float, CharSequence> transform) throws IOException {
        if (separator == null) separator = ", ";
        if (prefix == null) prefix = "";
        if (postfix == null) postfix = "";
        if (truncated == null) truncated = "";
        buffer.append(prefix);
        int count = 0;
        for (float element : elements) {
            if (++count > 1) buffer.append(separator);
            if (limit < 0 || count <= limit) {
                if (transform != null)
                    buffer.append(transform.transform(element));
                else
                    buffer.append(String.valueOf(element));
            } else {
                break;
            }
        }
        if (limit >= 0 && count > limit) buffer.append(truncated);
        buffer.append(postfix);
        return buffer;
    }

    /**
     * Appends the string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static <A extends Appendable> A joinTo(@NotNull double[] elements, @NotNull A buffer, @Nullable CharSequence separator,
                                                  @Nullable CharSequence prefix, @Nullable CharSequence postfix, int limit,
                                                  @Nullable CharSequence truncated, @Nullable Transformer<Double, CharSequence> transform) throws IOException {
        if (separator == null) separator = ", ";
        if (prefix == null) prefix = "";
        if (postfix == null) postfix = "";
        if (truncated == null) truncated = "";
        buffer.append(prefix);
        int count = 0;
        for (double element : elements) {
            if (++count > 1) buffer.append(separator);
            if (limit < 0 || count <= limit) {
                if (transform != null)
                    buffer.append(transform.transform(element));
                else
                    buffer.append(String.valueOf(element));
            } else {
                break;
            }
        }
        if (limit >= 0 && count > limit) buffer.append(truncated);
        buffer.append(postfix);
        return buffer;
    }

    /**
     * Appends the string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static <A extends Appendable> A joinTo(@NotNull boolean[] elements, @NotNull A buffer, @Nullable CharSequence separator,
                                                  @Nullable CharSequence prefix, @Nullable CharSequence postfix, int limit,
                                                  @Nullable CharSequence truncated, @Nullable Transformer<Boolean, CharSequence> transform) throws IOException {
        if (separator == null) separator = ", ";
        if (prefix == null) prefix = "";
        if (postfix == null) postfix = "";
        if (truncated == null) truncated = "";
        buffer.append(prefix);
        int count = 0;
        for (boolean element : elements) {
            if (++count > 1) buffer.append(separator);
            if (limit < 0 || count <= limit) {
                if (transform != null)
                    buffer.append(transform.transform(element));
                else
                    buffer.append(String.valueOf(element));
            } else {
                break;
            }
        }
        if (limit >= 0 && count > limit) buffer.append(truncated);
        buffer.append(postfix);
        return buffer;
    }

    /**
     * Appends the string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static <A extends Appendable> A joinTo(@NotNull char[] elements, @NotNull A buffer, @Nullable CharSequence separator,
                                                  @Nullable CharSequence prefix, @Nullable CharSequence postfix, int limit,
                                                  @Nullable CharSequence truncated, @Nullable Transformer<Character, CharSequence> transform) throws IOException {
        if (separator == null) separator = ", ";
        if (prefix == null) prefix = "";
        if (postfix == null) postfix = "";
        if (truncated == null) truncated = "";
        buffer.append(prefix);
        int count = 0;
        for (char element : elements) {
            if (++count > 1) buffer.append(separator);
            if (limit < 0 || count <= limit) {
                if (transform != null)
                    buffer.append(transform.transform(element));
                else
                    buffer.append(element);
            } else {
                break;
            }
        }
        if (limit >= 0 && count > limit) buffer.append(truncated);
        buffer.append(postfix);
        return buffer;
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static <T> String joinToString(@NotNull T[] elements, @Nullable CharSequence separator,
                                          @Nullable CharSequence prefix, @Nullable CharSequence postfix, int limit,
                                          @Nullable CharSequence truncated, @Nullable Transformer<T, CharSequence> transform) {
        try {
            return joinTo(elements, new StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static <T> String joinToString(@NotNull T[] elements, @Nullable CharSequence separator, @Nullable Transformer<T, CharSequence> transform) {
        return joinToString(elements, separator, null, null, -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static <T> String joinToString(@NotNull T[] elements, @Nullable CharSequence separator) {
        return joinToString(elements, separator, null, null, -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static <T> String joinToString(@NotNull T[] elements, @Nullable Transformer<T, CharSequence> transform) {
        return joinToString(elements, null, null, null, -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static <T> String joinToString(@NotNull T[] elements) {
        return joinToString(elements, null, null, null, -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static <T> String joinToArrayString(@NotNull T[] elements, @Nullable Transformer<T, CharSequence> transform) {
        return joinToString(elements, null, "[", "]", -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static <T> String joinToArrayString(@NotNull T[] elements) {
        return joinToString(elements, null, "[", "]", -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(byte[] elements, @Nullable CharSequence separator,
                                      @Nullable CharSequence prefix, @Nullable CharSequence postfix, int limit,
                                      @Nullable CharSequence truncated, @Nullable Transformer<Byte, CharSequence> transform) {
        try {
            return joinTo(elements, new StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull byte[] elements, @Nullable CharSequence separator, @Nullable Transformer<Byte, CharSequence> transform) {
        return joinToString(elements, separator, null, null, -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull byte[] elements, @Nullable CharSequence separator) {
        return joinToString(elements, separator, null, null, -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull byte[] elements, @Nullable Transformer<Byte, CharSequence> transform) {
        return joinToString(elements, null, null, null, -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull byte[] elements) {
        return joinToString(elements, null, null, null, -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToArrayString(@NotNull byte[] elements, @Nullable Transformer<Byte, CharSequence> transform) {
        return joinToString(elements, null, "[", "]", -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToArrayString(@NotNull byte[] elements) {
        return joinToString(elements, null, "[", "]", -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(short[] elements, @Nullable CharSequence separator,
                                      @Nullable CharSequence prefix, @Nullable CharSequence postfix, int limit,
                                      @Nullable CharSequence truncated, @Nullable Transformer<Short, CharSequence> transform) {
        try {
            return joinTo(elements, new StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull short[] elements, @Nullable CharSequence separator, @Nullable Transformer<Short, CharSequence> transform) {
        return joinToString(elements, separator, null, null, -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull short[] elements, @Nullable CharSequence separator) {
        return joinToString(elements, separator, null, null, -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull short[] elements, @Nullable Transformer<Short, CharSequence> transform) {
        return joinToString(elements, null, null, null, -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull short[] elements) {
        return joinToString(elements, null, null, null, -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToArrayString(@NotNull short[] elements, @Nullable Transformer<Short, CharSequence> transform) {
        return joinToString(elements, null, "[", "]", -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToArrayString(@NotNull short[] elements) {
        return joinToString(elements, null, "[", "]", -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(int[] elements, @Nullable CharSequence separator,
                                      @Nullable CharSequence prefix, @Nullable CharSequence postfix, int limit,
                                      @Nullable CharSequence truncated, @Nullable Transformer<Integer, CharSequence> transform) {
        try {
            return joinTo(elements, new StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull int[] elements, @Nullable CharSequence separator, @Nullable Transformer<Integer, CharSequence> transform) {
        return joinToString(elements, separator, null, null, -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull int[] elements, @Nullable CharSequence separator) {
        return joinToString(elements, separator, null, null, -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull int[] elements, @Nullable Transformer<Integer, CharSequence> transform) {
        return joinToString(elements, null, null, null, -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull int[] elements) {
        return joinToString(elements, null, null, null, -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToArrayString(@NotNull int[] elements, @Nullable Transformer<Integer, CharSequence> transform) {
        return joinToString(elements, null, "[", "]", -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToArrayString(@NotNull int[] elements) {
        return joinToString(elements, null, "[", "]", -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(long[] elements, @Nullable CharSequence separator,
                                      @Nullable CharSequence prefix, @Nullable CharSequence postfix, int limit,
                                      @Nullable CharSequence truncated, @Nullable Transformer<Long, CharSequence> transform) {
        try {
            return joinTo(elements, new StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull long[] elements, @Nullable CharSequence separator, @Nullable Transformer<Long, CharSequence> transform) {
        return joinToString(elements, separator, null, null, -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull long[] elements, @Nullable CharSequence separator) {
        return joinToString(elements, separator, null, null, -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull long[] elements, @Nullable Transformer<Long, CharSequence> transform) {
        return joinToString(elements, null, null, null, -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull long[] elements) {
        return joinToString(elements, null, null, null, -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToArrayString(@NotNull long[] elements, @Nullable Transformer<Long, CharSequence> transform) {
        return joinToString(elements, null, "[", "]", -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToArrayString(@NotNull long[] elements) {
        return joinToString(elements, null, "[", "]", -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(float[] elements, @Nullable CharSequence separator,
                                      @Nullable CharSequence prefix, @Nullable CharSequence postfix, int limit,
                                      @Nullable CharSequence truncated, @Nullable Transformer<Float, CharSequence> transform) {
        try {
            return joinTo(elements, new StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull float[] elements, @Nullable CharSequence separator, @Nullable Transformer<Float, CharSequence> transform) {
        return joinToString(elements, separator, null, null, -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull float[] elements, @Nullable CharSequence separator) {
        return joinToString(elements, separator, null, null, -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull float[] elements, @Nullable Transformer<Float, CharSequence> transform) {
        return joinToString(elements, null, null, null, -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull float[] elements) {
        return joinToString(elements, null, null, null, -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToArrayString(@NotNull float[] elements, @Nullable Transformer<Float, CharSequence> transform) {
        return joinToString(elements, null, "[", "]", -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToArrayString(@NotNull float[] elements) {
        return joinToString(elements, null, "[", "]", -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(double[] elements, @Nullable CharSequence separator,
                                      @Nullable CharSequence prefix, @Nullable CharSequence postfix, int limit,
                                      @Nullable CharSequence truncated, @Nullable Transformer<Double, CharSequence> transform) {
        try {
            return joinTo(elements, new StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull double[] elements, @Nullable CharSequence separator, @Nullable Transformer<Double, CharSequence> transform) {
        return joinToString(elements, separator, null, null, -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull double[] elements, @Nullable CharSequence separator) {
        return joinToString(elements, separator, null, null, -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull double[] elements, @Nullable Transformer<Double, CharSequence> transform) {
        return joinToString(elements, null, null, null, -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull double[] elements) {
        return joinToString(elements, null, null, null, -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToArrayString(@NotNull double[] elements, @Nullable Transformer<Double, CharSequence> transform) {
        return joinToString(elements, null, "[", "]", -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToArrayString(@NotNull double[] elements) {
        return joinToString(elements, null, "[", "]", -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(boolean[] elements, @Nullable CharSequence separator,
                                      @Nullable CharSequence prefix, @Nullable CharSequence postfix, int limit,
                                      @Nullable CharSequence truncated, @Nullable Transformer<Boolean, CharSequence> transform) {
        try {
            return joinTo(elements, new StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull boolean[] elements, @Nullable CharSequence separator, @Nullable Transformer<Boolean, CharSequence> transform) {
        return joinToString(elements, separator, null, null, -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull boolean[] elements, @Nullable CharSequence separator) {
        return joinToString(elements, separator, null, null, -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull boolean[] elements, @Nullable Transformer<Boolean, CharSequence> transform) {
        return joinToString(elements, null, null, null, -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull boolean[] elements) {
        return joinToString(elements, null, null, null, -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToArrayString(@NotNull boolean[] elements, @Nullable Transformer<Boolean, CharSequence> transform) {
        return joinToString(elements, null, "[", "]", -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToArrayString(@NotNull boolean[] elements) {
        return joinToString(elements, null, "[", "]", -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(char[] elements, @Nullable CharSequence separator,
                                      @Nullable CharSequence prefix, @Nullable CharSequence postfix, int limit,
                                      @Nullable CharSequence truncated, @Nullable Transformer<Character, CharSequence> transform) {
        try {
            return joinTo(elements, new StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull char[] elements, @Nullable CharSequence separator, @Nullable Transformer<Character, CharSequence> transform) {
        return joinToString(elements, separator, null, null, -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull char[] elements, @Nullable CharSequence separator) {
        return joinToString(elements, separator, null, null, -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull char[] elements, @Nullable Transformer<Character, CharSequence> transform) {
        return joinToString(elements, null, null, null, -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToString(@NotNull char[] elements) {
        return joinToString(elements, null, null, null, -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToArrayString(@NotNull char[] elements, @Nullable Transformer<Character, CharSequence> transform) {
        return joinToString(elements, null, "[", "]", -1, null, transform);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static String joinToArrayString(@NotNull char[] elements) {
        return joinToString(elements, null, "[", "]", -1, null, null);
    }


    /* **************************************************** contentToString **************************************************** */


    /**
     * Returns a string representation of the contents of the specified array as if it is [List].
     */
    public static <T> String contentToString(@NotNull T[] elements) {
        return java.util.Arrays.toString(elements);
    }

    /**
     * Returns a string representation of the contents of the specified array as if it is [List].
     */
    public static String contentToString(@NotNull byte[] elements) {
        return java.util.Arrays.toString(elements);
    }

    /**
     * Returns a string representation of the contents of the specified array as if it is [List].
     */
    @NotNull
    public static String contentToString(@NotNull short[] elements) {
        return java.util.Arrays.toString(elements);
    }

    /**
     * Returns a string representation of the contents of the specified array as if it is [List].
     */
    @NotNull
    public static String contentToString(@NotNull int[] elements) {
        return java.util.Arrays.toString(elements);
    }

    /**
     * Returns a string representation of the contents of the specified array as if it is [List].
     */
    @NotNull
    public static String contentToString(@NotNull long[] elements) {
        return java.util.Arrays.toString(elements);
    }

    /**
     * Returns a string representation of the contents of the specified array as if it is [List].
     */
    @NotNull
    public static String contentToString(@NotNull float[] elements) {
        return java.util.Arrays.toString(elements);
    }

    /**
     * Returns a string representation of the contents of the specified array as if it is [List].
     */
    @NotNull
    public static String contentToString(@NotNull double[] elements) {
        return java.util.Arrays.toString(elements);
    }

    /**
     * Returns a string representation of the contents of the specified array as if it is [List].
     */
    @NotNull
    public static String contentToString(@NotNull boolean[] elements) {
        return java.util.Arrays.toString(elements);
    }

    /**
     * Returns a string representation of the contents of the specified array as if it is [List].
     */
    @NotNull
    public static String contentToString(@NotNull char[] elements) {
        return java.util.Arrays.toString(elements);
    }


    /* **************************************************** sum **************************************************** */


    /**
     * Returns the sum of all elements in the array.
     */
    public static int sum(@NotNull Byte[] elements) {
        int sum = 0;
        for (byte element : elements) {
            sum += element;
        }
        return sum;
    }

    /**
     * Returns the sum of all elements in the array.
     */
    public static int sum(@NotNull Short[] elements) {
        int sum = 0;
        for (short element : elements) {
            sum += element;
        }
        return sum;
    }

    /**
     * Returns the sum of all elements in the array.
     */
    public static int sum(@NotNull Integer[] elements) {
        int sum = 0;
        for (int element : elements) {
            sum += element;
        }
        return sum;
    }

    /**
     * Returns the sum of all elements in the array.
     */
    public static long sum(@NotNull Long[] elements) {
        long sum = 0;
        for (long element : elements) {
            sum += element;
        }
        return sum;
    }

    /**
     * Returns the sum of all elements in the array.
     */
    public static float sum(@NotNull Float[] elements) {
        float sum = 0;
        for (float element : elements) {
            sum += element;
        }
        return sum;
    }

    /**
     * Returns the sum of all elements in the array.
     */
    public static double sum(@NotNull Double[] elements) {
        double sum = 0;
        for (double element : elements) {
            sum += element;
        }
        return sum;
    }

    /**
     * Returns the sum of all elements in the array.
     */
    public static int sum(@NotNull byte[] elements) {
        int sum = 0;
        for (byte element : elements) {
            sum += element;
        }
        return sum;
    }

    /**
     * Returns the sum of all elements in the array.
     */
    public static int sum(@NotNull short[] elements) {
        int sum = 0;
        for (short element : elements) {
            sum += element;
        }
        return sum;
    }

    /**
     * Returns the sum of all elements in the array.
     */
    public static int sum(@NotNull int[] elements) {
        int sum = 0;
        for (int element : elements) {
            sum += element;
        }
        return sum;
    }

    /**
     * Returns the sum of all elements in the array.
     */
    public static long sum(@NotNull long[] elements) {
        long sum = 0;
        for (long element : elements) {
            sum += element;
        }
        return sum;
    }

    /**
     * Returns the sum of all elements in the array.
     */
    public static float sum(@NotNull float[] elements) {
        float sum = 0;
        for (float element : elements) {
            sum += element;
        }
        return sum;
    }

    /**
     * Returns the sum of all elements in the array.
     */
    public static double sum(@NotNull double[] elements) {
        double sum = 0;
        for (double element : elements) {
            sum += element;
        }
        return sum;
    }

    /**
     * Returns the sum of all values produced by [selector] function applied to each element in the array.
     */
    public static <T> int sumBy(@NotNull T[] elements, @NotNull Transformer<T, Integer> selector) {
        int sum = 0;
        for (T element : elements) {
            sum += selector.transform(element);
        }
        return sum;
    }

    /**
     * Returns the sum of all values produced by [selector] function applied to each element in the array.
     */
    public static int sumBy(@NotNull byte[] elements, @NotNull Transformer<Byte, Integer> selector) {
        int sum = 0;
        for (byte element : elements) {
            sum += selector.transform(element);
        }
        return sum;
    }

    /**
     * Returns the sum of all values produced by [selector] function applied to each element in the array.
     */
    public static int sumBy(@NotNull short[] elements, @NotNull Transformer<Short, Integer> selector) {
        int sum = 0;
        for (short element : elements) {
            sum += selector.transform(element);
        }
        return sum;
    }

    /**
     * Returns the sum of all values produced by [selector] function applied to each element in the array.
     */
    public static int sumBy(@NotNull int[] elements, @NotNull Transformer<Integer, Integer> selector) {
        int sum = 0;
        for (int element : elements) {
            sum += selector.transform(element);
        }
        return sum;
    }

    /**
     * Returns the sum of all values produced by [selector] function applied to each element in the array.
     */
    public static int sumBy(@NotNull long[] elements, @NotNull Transformer<Long, Integer> selector) {
        int sum = 0;
        for (long element : elements) {
            sum += selector.transform(element);
        }
        return sum;
    }

    /**
     * Returns the sum of all values produced by [selector] function applied to each element in the array.
     */
    public static int sumBy(@NotNull float[] elements, @NotNull Transformer<Float, Integer> selector) {
        int sum = 0;
        for (float element : elements) {
            sum += selector.transform(element);
        }
        return sum;
    }

    /**
     * Returns the sum of all values produced by [selector] function applied to each element in the array.
     */
    public static int sumBy(@NotNull double[] elements, @NotNull Transformer<Double, Integer> selector) {
        int sum = 0;
        for (double element : elements) {
            sum += selector.transform(element);
        }
        return sum;
    }

    /**
     * Returns the sum of all values produced by [selector] function applied to each element in the array.
     */
    public static int sumBy(@NotNull boolean[] elements, @NotNull Transformer<Boolean, Integer> selector) {
        int sum = 0;
        for (boolean element : elements) {
            sum += selector.transform(element);
        }
        return sum;
    }

    /**
     * Returns the sum of all values produced by [selector] function applied to each element in the array.
     */
    public static int sumBy(@NotNull char[] elements, @NotNull Transformer<Character, Integer> selector) {
        int sum = 0;
        for (char element : elements) {
            sum += selector.transform(element);
        }
        return sum;
    }

    /**
     * Returns the sum of all values produced by [selector] function applied to each element in the array.
     */
    public static <T> double sumByDouble(@NotNull T[] elements, @NotNull Transformer<T, Double> selector) {
        double sum = 0.0;
        for (T element : elements) {
            sum += selector.transform(element);
        }
        return sum;
    }

    /**
     * Returns the sum of all values produced by [selector] function applied to each element in the array.
     */
    public static double sumByDouble(@NotNull byte[] elements, @NotNull Transformer<Byte, Double> selector) {
        double sum = 0.0;
        for (byte element : elements) {
            sum += selector.transform(element);
        }
        return sum;
    }

    /**
     * Returns the sum of all values produced by [selector] function applied to each element in the array.
     */
    public static double sumByDouble(@NotNull short[] elements, @NotNull Transformer<Short, Double> selector) {
        double sum = 0.0;
        for (short element : elements) {
            sum += selector.transform(element);
        }
        return sum;
    }

    /**
     * Returns the sum of all values produced by [selector] function applied to each element in the array.
     */
    public static double sumByDouble(@NotNull int[] elements, @NotNull Transformer<Integer, Double> selector) {
        double sum = 0.0;
        for (int element : elements) {
            sum += selector.transform(element);
        }
        return sum;
    }

    /**
     * Returns the sum of all values produced by [selector] function applied to each element in the array.
     */
    public static double sumByDouble(@NotNull long[] elements, @NotNull Transformer<Long, Double> selector) {
        double sum = 0.0;
        for (long element : elements) {
            sum += selector.transform(element);
        }
        return sum;
    }

    /**
     * Returns the sum of all values produced by [selector] function applied to each element in the array.
     */
    public static double sumByDouble(@NotNull float[] elements, @NotNull Transformer<Float, Double> selector) {
        double sum = 0.0;
        for (float element : elements) {
            sum += selector.transform(element);
        }
        return sum;
    }

    /**
     * Returns the sum of all values produced by [selector] function applied to each element in the array.
     */
    public static double sumByDouble(@NotNull double[] elements, @NotNull Transformer<Double, Double> selector) {
        double sum = 0.0;
        for (double element : elements) {
            sum += selector.transform(element);
        }
        return sum;
    }

    /**
     * Returns the sum of all values produced by [selector] function applied to each element in the array.
     */
    public static double sumByDouble(@NotNull boolean[] elements, @NotNull Transformer<Boolean, Double> selector) {
        double sum = 0.0;
        for (boolean element : elements) {
            sum += selector.transform(element);
        }
        return sum;
    }

    /**
     * Returns the sum of all values produced by [selector] function applied to each element in the array.
     */
    public static double sumByDouble(@NotNull char[] elements, @NotNull Transformer<Character, Double> selector) {
        double sum = 0.0;
        for (char element : elements) {
            sum += selector.transform(element);
        }
        return sum;
    }


    /* **************************************************** plus **************************************************** */


    /**
     * Returns an array containing all elements of the original array and then the given [element].
     */
    @NotNull
    public static <T> T[] plus(@NotNull T[] elements, @NotNull T element) {
        int index = elements.length;
        T[] result = java.util.Arrays.copyOf(elements, index + 1);
        result[index] = element;
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then the given [element].
     */
    @NotNull
    public static byte[] plus(@NotNull byte[] elements, byte element) {
        int index = elements.length;
        byte[] result = java.util.Arrays.copyOf(elements, index + 1);
        result[index] = element;
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then the given [element].
     */
    @NotNull
    public static short[] plus(@NotNull short[] elements, short element) {
        int index = elements.length;
        short[] result = java.util.Arrays.copyOf(elements, index + 1);
        result[index] = element;
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then the given [element].
     */
    @NotNull
    public static int[] plus(@NotNull int[] elements, int element) {
        int index = elements.length;
        int[] result = java.util.Arrays.copyOf(elements, index + 1);
        result[index] = element;
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then the given [element].
     */
    @NotNull
    public static long[] plus(@NotNull long[] elements, long element) {
        int index = elements.length;
        long[] result = java.util.Arrays.copyOf(elements, index + 1);
        result[index] = element;
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then the given [element].
     */
    @NotNull
    public static float[] plus(@NotNull float[] elements, float element) {
        int index = elements.length;
        float[] result = java.util.Arrays.copyOf(elements, index + 1);
        result[index] = element;
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then the given [element].
     */
    @NotNull
    public static double[] plus(@NotNull double[] elements, double element) {
        int index = elements.length;
        double[] result = java.util.Arrays.copyOf(elements, index + 1);
        result[index] = element;
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then the given [element].
     */
    @NotNull
    public static boolean[] plus(@NotNull boolean[] elements, boolean element) {
        int index = elements.length;
        boolean[] result = java.util.Arrays.copyOf(elements, index + 1);
        result[index] = element;
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then the given [element].
     */
    @NotNull
    public static char[] plus(@NotNull char[] elements, char element) {
        int index = elements.length;
        char[] result = java.util.Arrays.copyOf(elements, index + 1);
        result[index] = element;
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then all elements of the given [elements] collection.
     */
    @NotNull
    public static <T> T[] plus(@NotNull T[] selfElements, @NotNull Collection<T> elements) {
        int index = selfElements.length;
        T[] result = java.util.Arrays.copyOf(selfElements, index + elements.size());
        for (T element : elements) {
            result[index++] = element;
        }
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then all elements of the given [elements] collection.
     */
    @NotNull
    public static byte[] plus(@NotNull byte[] selfElements, @NotNull Collection<Byte> elements) {
        int index = selfElements.length;
        byte[] result = java.util.Arrays.copyOf(selfElements, index + elements.size());
        for (byte element : elements) {
            result[index++] = element;
        }
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then all elements of the given [elements] collection.
     */
    @NotNull
    public static short[] plus(@NotNull short[] selfElements, @NotNull Collection<Short> elements) {
        int index = selfElements.length;
        short[] result = java.util.Arrays.copyOf(selfElements, index + elements.size());
        for (short element : elements) {
            result[index++] = element;
        }
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then all elements of the given [elements] collection.
     */
    @NotNull
    public static int[] plus(@NotNull int[] selfElements, @NotNull Collection<Integer> elements) {
        int index = selfElements.length;
        int[] result = java.util.Arrays.copyOf(selfElements, index + elements.size());
        for (int element : elements) {
            result[index++] = element;
        }
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then all elements of the given [elements] collection.
     */
    @NotNull
    public static long[] plus(@NotNull long[] selfElements, @NotNull Collection<Long> elements) {
        int index = selfElements.length;
        long[] result = java.util.Arrays.copyOf(selfElements, index + elements.size());
        for (long element : elements) {
            result[index++] = element;
        }
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then all elements of the given [elements] collection.
     */
    @NotNull
    public static float[] plus(@NotNull float[] selfElements, @NotNull Collection<Float> elements) {
        int index = selfElements.length;
        float[] result = java.util.Arrays.copyOf(selfElements, index + elements.size());
        for (float element : elements) {
            result[index++] = element;
        }
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then all elements of the given [elements] collection.
     */
    @NotNull
    public static double[] plus(@NotNull double[] selfElements, @NotNull Collection<Double> elements) {
        int index = selfElements.length;
        double[] result = java.util.Arrays.copyOf(selfElements, index + elements.size());
        for (double element : elements) {
            result[index++] = element;
        }
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then all elements of the given [elements] collection.
     */
    @NotNull
    public static boolean[] plus(@NotNull boolean[] selfElements, @NotNull Collection<Boolean> elements) {
        int index = selfElements.length;
        boolean[] result = java.util.Arrays.copyOf(selfElements, index + elements.size());
        for (boolean element : elements) {
            result[index++] = element;
        }
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then all elements of the given [elements] collection.
     */
    @NotNull
    public static char[] plus(@NotNull char[] selfElements, @NotNull Collection<Character> elements) {
        int index = selfElements.length;
        char[] result = java.util.Arrays.copyOf(selfElements, index + elements.size());
        for (char element : elements) {
            result[index++] = element;
        }
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then all elements of the given [elements] array.
     */
    @NotNull
    public static <T> T[] plus(@NotNull T[] selfElements, @NotNull T[] elements) {
        int thisSize = selfElements.length;
        int arraySize = elements.length;
        T[] result = java.util.Arrays.copyOf(selfElements, thisSize + arraySize);
        System.arraycopy(elements, 0, result, thisSize, arraySize);
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then all elements of the given [elements] array.
     */
    @NotNull
    public static byte[] plus(@NotNull byte[] selfElements, @NotNull byte[] elements) {
        int thisSize = selfElements.length;
        int arraySize = elements.length;
        byte[] result = java.util.Arrays.copyOf(selfElements, thisSize + arraySize);
        System.arraycopy(elements, 0, result, thisSize, arraySize);
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then all elements of the given [elements] array.
     */
    @NotNull
    public static short[] plus(@NotNull short[] selfElements, @NotNull short[] elements) {
        int thisSize = selfElements.length;
        int arraySize = elements.length;
        short[] result = java.util.Arrays.copyOf(selfElements, thisSize + arraySize);
        System.arraycopy(elements, 0, result, thisSize, arraySize);
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then all elements of the given [elements] array.
     */
    @NotNull
    public static int[] plus(@NotNull int[] selfElements, @NotNull int[] elements) {
        int thisSize = selfElements.length;
        int arraySize = elements.length;
        int[] result = java.util.Arrays.copyOf(selfElements, thisSize + arraySize);
        System.arraycopy(elements, 0, result, thisSize, arraySize);
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then all elements of the given [elements] array.
     */
    @NotNull
    public static long[] plus(@NotNull long[] selfElements, @NotNull long[] elements) {
        int thisSize = selfElements.length;
        int arraySize = elements.length;
        long[] result = java.util.Arrays.copyOf(selfElements, thisSize + arraySize);
        System.arraycopy(elements, 0, result, thisSize, arraySize);
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then all elements of the given [elements] array.
     */
    @NotNull
    public static float[] plus(@NotNull float[] selfElements, @NotNull float[] elements) {
        int thisSize = selfElements.length;
        int arraySize = elements.length;
        float[] result = java.util.Arrays.copyOf(selfElements, thisSize + arraySize);
        System.arraycopy(elements, 0, result, thisSize, arraySize);
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then all elements of the given [elements] array.
     */
    @NotNull
    public static double[] plus(@NotNull double[] selfElements, @NotNull double[] elements) {
        int thisSize = selfElements.length;
        int arraySize = elements.length;
        double[] result = java.util.Arrays.copyOf(selfElements, thisSize + arraySize);
        System.arraycopy(elements, 0, result, thisSize, arraySize);
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then all elements of the given [elements] array.
     */
    @NotNull
    public static boolean[] plus(@NotNull boolean[] selfElements, @NotNull boolean[] elements) {
        int thisSize = selfElements.length;
        int arraySize = elements.length;
        boolean[] result = java.util.Arrays.copyOf(selfElements, thisSize + arraySize);
        System.arraycopy(elements, 0, result, thisSize, arraySize);
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then all elements of the given [elements] array.
     */
    @NotNull
    public static char[] plus(@NotNull char[] selfElements, @NotNull char[] elements) {
        int thisSize = selfElements.length;
        int arraySize = elements.length;
        char[] result = java.util.Arrays.copyOf(selfElements, thisSize + arraySize);
        System.arraycopy(elements, 0, result, thisSize, arraySize);
        return result;
    }

    /**
     * Returns an array containing all elements of the original array and then the given [element].
     */
    @NotNull
    public static <T> T[] plusElement(@NotNull T[] elements, @NotNull T element) {
        return plus(elements, element);
    }


    /* **************************************************** indices **************************************************** */


    /**
     * Returns the range of valid indices for the array.
     */
    @NotNull
    public static <T> IntRange indices(@NotNull T[] elements) {
        return Numberx.untilTo(0, elements.length);
    }

    /**
     * Returns the range of valid indices for the array.
     */
    @NotNull
    public static IntRange indices(@NotNull byte[] elements) {
        return Numberx.untilTo(0, elements.length);
    }

    /**
     * Returns the range of valid indices for the array.
     */
    @NotNull
    public static IntRange indices(@NotNull short[] elements) {
        return Numberx.untilTo(0, elements.length);
    }

    /**
     * Returns the range of valid indices for the array.
     */
    @NotNull
    public static IntRange indices(@NotNull int[] elements) {
        return Numberx.untilTo(0, elements.length);
    }

    /**
     * Returns the range of valid indices for the array.
     */
    @NotNull
    public static IntRange indices(@NotNull long[] elements) {
        return Numberx.untilTo(0, elements.length);
    }

    /**
     * Returns the range of valid indices for the array.
     */
    @NotNull
    public static IntRange indices(@NotNull float[] elements) {
        return Numberx.untilTo(0, elements.length);
    }

    /**
     * Returns the range of valid indices for the array.
     */
    @NotNull
    public static IntRange indices(@NotNull double[] elements) {
        return Numberx.untilTo(0, elements.length);
    }

    /**
     * Returns the range of valid indices for the array.
     */
    @NotNull
    public static IntRange indices(@NotNull boolean[] elements) {
        return Numberx.untilTo(0, elements.length);
    }

    /**
     * Returns the range of valid indices for the array.
     */
    @NotNull
    public static IntRange indices(@NotNull char[] elements) {
        return Numberx.untilTo(0, elements.length);
    }


    /* **************************************************** indexOf **************************************************** */


    /**
     * Returns first index of [element], or -1 if the array does not contain element.
     */
    public static <T> int indexOf(@NotNull T[] elements, @NotNull T element) {
        if (element == null) {
            for (int index : indices(elements)) {
                if (elements[index] == null) {
                    return index;
                }
            }
        } else {
            for (int index : indices(elements)) {
                if (element == elements[index]) {
                    return index;
                }
            }
        }
        return -1;
    }

    /**
     * Returns first index of [element], or -1 if the array does not contain element.
     */
    public static int indexOf(@NotNull byte[] elements, byte element) {
        for (int index : indices(elements)) {
            if (element == elements[index]) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Returns first index of [element], or -1 if the array does not contain element.
     */
    public static int indexOf(@NotNull short[] elements, short element) {
        for (int index : indices(elements)) {
            if (element == elements[index]) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Returns first index of [element], or -1 if the array does not contain element.
     */
    public static int indexOf(@NotNull int[] elements, int element) {
        for (int index : indices(elements)) {
            if (element == elements[index]) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Returns first index of [element], or -1 if the array does not contain element.
     */
    public static int indexOf(@NotNull long[] elements, long element) {
        for (int index : indices(elements)) {
            if (element == elements[index]) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Returns first index of [element], or -1 if the array does not contain element.
     */
    public static int indexOf(@NotNull float[] elements, float element) {
        for (int index : indices(elements)) {
            if (element == elements[index]) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Returns first index of [element], or -1 if the array does not contain element.
     */
    public static int indexOf(@NotNull double[] elements, double element) {
        for (int index : indices(elements)) {
            if (element == elements[index]) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Returns first index of [element], or -1 if the array does not contain element.
     */
    public static int indexOf(@NotNull boolean[] elements, boolean element) {
        for (int index : indices(elements)) {
            if (element == elements[index]) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Returns first index of [element], or -1 if the array does not contain element.
     */
    public static int indexOf(@NotNull char[] elements, char element) {
        for (int index : indices(elements)) {
            if (element == elements[index]) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
     */
    public static <T> int indexOfFirst(@NotNull T[] elements, @NotNull Predicate<T> predicate) {
        for (int index : indices(elements)) {
            if (predicate.predicate(elements[index])) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
     */
    public static int indexOfFirst(@NotNull byte[] elements, @NotNull Predicate<Byte> predicate) {
        for (int index : indices(elements)) {
            if (predicate.predicate(elements[index])) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
     */
    public static int indexOfFirst(@NotNull short[] elements, @NotNull Predicate<Short> predicate) {
        for (int index : indices(elements)) {
            if (predicate.predicate(elements[index])) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
     */
    public static int indexOfFirst(@NotNull int[] elements, @NotNull Predicate<Integer> predicate) {
        for (int index : indices(elements)) {
            if (predicate.predicate(elements[index])) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
     */
    public static int indexOfFirst(@NotNull long[] elements, @NotNull Predicate<Long> predicate) {
        for (int index : indices(elements)) {
            if (predicate.predicate(elements[index])) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
     */
    public static int indexOfFirst(@NotNull float[] elements, @NotNull Predicate<Float> predicate) {
        for (int index : indices(elements)) {
            if (predicate.predicate(elements[index])) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
     */
    public static int indexOfFirst(@NotNull double[] elements, @NotNull Predicate<Double> predicate) {
        for (int index : indices(elements)) {
            if (predicate.predicate(elements[index])) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
     */
    public static int indexOfFirst(@NotNull boolean[] elements, @NotNull Predicate<Boolean> predicate) {
        for (int index : indices(elements)) {
            if (predicate.predicate(elements[index])) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
     */
    public static int indexOfFirst(@NotNull char[] elements, @NotNull Predicate<Character> predicate) {
        for (int index : indices(elements)) {
            if (predicate.predicate(elements[index])) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
     */
    public static <T> int indexOfLast(@NotNull T[] elements, @NotNull Predicate<T> predicate) {
        for (int index : Collectionx.reversed(indices(elements))) {
            if (predicate.predicate(elements[index])) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
     */
    public static int indexOfLast(@NotNull byte[] elements, @NotNull Predicate<Byte> predicate) {
        for (int index : Collectionx.reversed(indices(elements))) {
            if (predicate.predicate(elements[index])) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
     */
    public static int indexOfLast(@NotNull short[] elements, @NotNull Predicate<Short> predicate) {
        for (int index : Collectionx.reversed(indices(elements))) {
            if (predicate.predicate(elements[index])) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
     */
    public static int indexOfLast(@NotNull int[] elements, @NotNull Predicate<Integer> predicate) {
        for (int index : Collectionx.reversed(indices(elements))) {
            if (predicate.predicate(elements[index])) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
     */
    public static int indexOfLast(@NotNull long[] elements, @NotNull Predicate<Long> predicate) {
        for (int index : Collectionx.reversed(indices(elements))) {
            if (predicate.predicate(elements[index])) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
     */
    public static int indexOfLast(@NotNull float[] elements, @NotNull Predicate<Float> predicate) {
        for (int index : Collectionx.reversed(indices(elements))) {
            if (predicate.predicate(elements[index])) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
     */
    public static int indexOfLast(@NotNull double[] elements, @NotNull Predicate<Double> predicate) {
        for (int index : Collectionx.reversed(indices(elements))) {
            if (predicate.predicate(elements[index])) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
     */
    public static int indexOfLast(@NotNull boolean[] elements, @NotNull Predicate<Boolean> predicate) {
        for (int index : Collectionx.reversed(indices(elements))) {
            if (predicate.predicate(elements[index])) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
     */
    public static int indexOfLast(@NotNull char[] elements, @NotNull Predicate<Character> predicate) {
        for (int index : Collectionx.reversed(indices(elements))) {
            if (predicate.predicate(elements[index])) {
                return index;
            }
        }
        return -1;
    }


    /* **************************************************** contains **************************************************** */


    /**
     * Returns `true` if [element] is found in the array.
     */
    public static <T> boolean contains(@NotNull T[] elements, @NotNull T element) {
        return indexOf(elements, element) >= 0;
    }

    /**
     * Returns `true` if [element] is found in the array.
     */
    public static boolean contains(@NotNull byte[] elements, byte element) {
        return indexOf(elements, element) >= 0;
    }

    /**
     * Returns `true` if [element] is found in the array.
     */
    public static boolean contains(@NotNull short[] elements, short element) {
        return indexOf(elements, element) >= 0;
    }

    /**
     * Returns `true` if [element] is found in the array.
     */
    public static boolean contains(@NotNull int[] elements, int element) {
        return indexOf(elements, element) >= 0;
    }

    /**
     * Returns `true` if [element] is found in the array.
     */
    public static boolean contains(@NotNull long[] elements, long element) {
        return indexOf(elements, element) >= 0;
    }

    /**
     * Returns `true` if [element] is found in the array.
     */
    public static boolean contains(@NotNull float[] elements, float element) {
        return indexOf(elements, element) >= 0;
    }

    /**
     * Returns `true` if [element] is found in the array.
     */
    public static boolean contains(@NotNull double[] elements, double element) {
        return indexOf(elements, element) >= 0;
    }

    /**
     * Returns `true` if [element] is found in the array.
     */
    public static boolean contains(@NotNull boolean[] elements, boolean element) {
        return indexOf(elements, element) >= 0;
    }

    /**
     * Returns `true` if [element] is found in the array.
     */
    public static boolean contains(@NotNull char[] elements, char element) {
        return indexOf(elements, element) >= 0;
    }


    /* **************************************************** forEach **************************************************** */


    /**
     * Performs the given [action] on each element.
     */
    public static <T> void forEach(@NotNull T[] elements, @NotNull Action<T> action) {
        for (T element : elements) action.action(element);
    }

    /**
     * Performs the given [action] on each element.
     */
    public static void forEach(@NotNull byte[] elements, @NotNull Action<Byte> action) {
        for (byte element : elements) action.action(element);
    }

    /**
     * Performs the given [action] on each element.
     */
    public static void forEach(@NotNull short[] elements, @NotNull Action<Short> action) {
        for (short element : elements) action.action(element);
    }

    /**
     * Performs the given [action] on each element.
     */
    public static void forEach(@NotNull int[] elements, @NotNull Action<Integer> action) {
        for (int element : elements) action.action(element);
    }

    /**
     * Performs the given [action] on each element.
     */
    public static void forEach(@NotNull long[] elements, @NotNull Action<Long> action) {
        for (long element : elements) action.action(element);
    }

    /**
     * Performs the given [action] on each element.
     */
    public static void forEach(@NotNull float[] elements, @NotNull Action<Float> action) {
        for (float element : elements) action.action(element);
    }

    /**
     * Performs the given [action] on each element.
     */
    public static void forEach(@NotNull double[] elements, @NotNull Action<Double> action) {
        for (double element : elements) action.action(element);
    }

    /**
     * Performs the given [action] on each element.
     */
    public static void forEach(@NotNull boolean[] elements, @NotNull Action<Boolean> action) {
        for (boolean element : elements) action.action(element);
    }

    /**
     * Performs the given [action] on each element.
     */
    public static void forEach(@NotNull char[] elements, @NotNull Action<Character> action) {
        for (char element : elements) action.action(element);
    }

    /**
     * Performs the given [action] on each element, providing sequential index with the element.
     *
     * @param action function that takes the index of an element and the element itself
     *               and performs the desired action on the element.
     */
    public static <T> void forEachIndexed(@NotNull T[] elements, @NotNull IndexedAction<T> action) {
        int index = 0;
        for (T item : elements) action.action(index++, item);
    }

    /**
     * Performs the given [action] on each element, providing sequential index with the element.
     *
     * @param action function that takes the index of an element and the element itself
     *               and performs the desired action on the element.
     */
    public static void forEachIndexed(@NotNull byte[] elements, @NotNull IndexedAction<Byte> action) {
        int index = 0;
        for (byte item : elements) action.action(index++, item);
    }

    /**
     * Performs the given [action] on each element, providing sequential index with the element.
     *
     * @param action function that takes the index of an element and the element itself
     *               and performs the desired action on the element.
     */
    public static void forEachIndexed(@NotNull short[] elements, @NotNull IndexedAction<Short> action) {
        int index = 0;
        for (short item : elements) action.action(index++, item);
    }

    /**
     * Performs the given [action] on each element, providing sequential index with the element.
     *
     * @param action function that takes the index of an element and the element itself
     *               and performs the desired action on the element.
     */
    public static void forEachIndexed(@NotNull int[] elements, @NotNull IndexedAction<Integer> action) {
        int index = 0;
        for (int item : elements) action.action(index++, item);
    }

    /**
     * Performs the given [action] on each element, providing sequential index with the element.
     *
     * @param action function that takes the index of an element and the element itself
     *               and performs the desired action on the element.
     */
    public static void forEachIndexed(@NotNull long[] elements, @NotNull IndexedAction<Long> action) {
        int index = 0;
        for (long item : elements) action.action(index++, item);
    }

    /**
     * Performs the given [action] on each element, providing sequential index with the element.
     *
     * @param action function that takes the index of an element and the element itself
     *               and performs the desired action on the element.
     */
    public static void forEachIndexed(@NotNull float[] elements, @NotNull IndexedAction<Float> action) {
        int index = 0;
        for (float item : elements) action.action(index++, item);
    }

    /**
     * Performs the given [action] on each element, providing sequential index with the element.
     *
     * @param action function that takes the index of an element and the element itself
     *               and performs the desired action on the element.
     */
    public static void forEachIndexed(@NotNull double[] elements, @NotNull IndexedAction<Double> action) {
        int index = 0;
        for (double item : elements) action.action(index++, item);
    }

    /**
     * Performs the given [action] on each element, providing sequential index with the element.
     *
     * @param action function that takes the index of an element and the element itself
     *               and performs the desired action on the element.
     */
    public static void forEachIndexed(@NotNull boolean[] elements, @NotNull IndexedAction<Boolean> action) {
        int index = 0;
        for (boolean item : elements) action.action(index++, item);
    }

    /**
     * Performs the given [action] on each element, providing sequential index with the element.
     *
     * @param action function that takes the index of an element and the element itself
     *               and performs the desired action on the element.
     */
    public static void forEachIndexed(@NotNull char[] elements, @NotNull IndexedAction<Character> action) {
        int index = 0;
        for (char item : elements) action.action(index++, item);
    }


    /* **************************************************** filter **************************************************** */


    /**
     * Returns a list containing only elements matching the given [predicate].
     */
    @NotNull
    public static <T> List<T> filter(@NotNull T[] elements, @NotNull Predicate<T> predicate) {
        return filterTo(elements, new ArrayList<T>(), predicate);
    }

    /**
     * Returns a list containing only elements matching the given [predicate].
     */
    @NotNull
    public static List<Byte> filter(@NotNull byte[] elements, @NotNull Predicate<Byte> predicate) {
        return filterTo(elements, new ArrayList<Byte>(), predicate);
    }

    /**
     * Returns a list containing only elements matching the given [predicate].
     */
    @NotNull
    public static List<Short> filter(@NotNull short[] elements, @NotNull Predicate<Short> predicate) {
        return filterTo(elements, new ArrayList<Short>(), predicate);
    }

    /**
     * Returns a list containing only elements matching the given [predicate].
     */
    @NotNull
    public static List<Integer> filter(@NotNull int[] elements, @NotNull Predicate<Integer> predicate) {
        return filterTo(elements, new ArrayList<Integer>(), predicate);
    }

    /**
     * Returns a list containing only elements matching the given [predicate].
     */
    @NotNull
    public static List<Long> filter(@NotNull long[] elements, @NotNull Predicate<Long> predicate) {
        return filterTo(elements, new ArrayList<Long>(), predicate);
    }

    /**
     * Returns a list containing only elements matching the given [predicate].
     */
    @NotNull
    public static List<Float> filter(@NotNull float[] elements, @NotNull Predicate<Float> predicate) {
        return filterTo(elements, new ArrayList<Float>(), predicate);
    }

    /**
     * Returns a list containing only elements matching the given [predicate].
     */
    @NotNull
    public static List<Double> filter(@NotNull double[] elements, @NotNull Predicate<Double> predicate) {
        return filterTo(elements, new ArrayList<Double>(), predicate);
    }

    /**
     * Returns a list containing only elements matching the given [predicate].
     */
    @NotNull
    public static List<Boolean> filter(@NotNull boolean[] elements, @NotNull Predicate<Boolean> predicate) {
        return filterTo(elements, new ArrayList<Boolean>(), predicate);
    }

    /**
     * Returns a list containing only elements matching the given [predicate].
     */
    @NotNull
    public static List<Character> filter(@NotNull char[] elements, @NotNull Predicate<Character> predicate) {
        return filterTo(elements, new ArrayList<Character>(), predicate);
    }

    /**
     * Returns a list containing only elements matching the given [predicate].
     *
     * @param predicate function that takes the index of an element and the element itself
     *                  and returns the result of predicate evaluation on the element.
     */
    @NotNull
    public static <T> List<T> filterIndexed(@NotNull T[] elements, @NotNull IndexedPredicate<T> predicate) {
        return filterIndexedTo(elements, new ArrayList<T>(), predicate);
    }

    /**
     * Returns a list containing only elements matching the given [predicate].
     *
     * @param predicate function that takes the index of an element and the element itself
     *                  and returns the result of predicate evaluation on the element.
     */
    @NotNull
    public static List<Byte> filterIndexed(@NotNull byte[] elements, @NotNull IndexedPredicate<Byte> predicate) {
        return filterIndexedTo(elements, new ArrayList<Byte>(), predicate);
    }

    /**
     * Returns a list containing only elements matching the given [predicate].
     *
     * @param predicate function that takes the index of an element and the element itself
     *                  and returns the result of predicate evaluation on the element.
     */
    @NotNull
    public static List<Short> filterIndexed(@NotNull short[] elements, @NotNull IndexedPredicate<Short> predicate) {
        return filterIndexedTo(elements, new ArrayList<Short>(), predicate);
    }

    /**
     * Returns a list containing only elements matching the given [predicate].
     *
     * @param predicate function that takes the index of an element and the element itself
     *                  and returns the result of predicate evaluation on the element.
     */
    @NotNull
    public static List<Integer> filterIndexed(@NotNull int[] elements, @NotNull IndexedPredicate<Integer> predicate) {
        return filterIndexedTo(elements, new ArrayList<Integer>(), predicate);
    }

    /**
     * Returns a list containing only elements matching the given [predicate].
     *
     * @param predicate function that takes the index of an element and the element itself
     *                  and returns the result of predicate evaluation on the element.
     */
    @NotNull
    public static List<Long> filterIndexed(@NotNull long[] elements, @NotNull IndexedPredicate<Long> predicate) {
        return filterIndexedTo(elements, new ArrayList<Long>(), predicate);
    }

    /**
     * Returns a list containing only elements matching the given [predicate].
     *
     * @param predicate function that takes the index of an element and the element itself
     *                  and returns the result of predicate evaluation on the element.
     */
    @NotNull
    public static List<Float> filterIndexed(@NotNull float[] elements, @NotNull IndexedPredicate<Float> predicate) {
        return filterIndexedTo(elements, new ArrayList<Float>(), predicate);
    }

    /**
     * Returns a list containing only elements matching the given [predicate].
     *
     * @param predicate function that takes the index of an element and the element itself
     *                  and returns the result of predicate evaluation on the element.
     */
    @NotNull
    public static List<Double> filterIndexed(@NotNull double[] elements, @NotNull IndexedPredicate<Double> predicate) {
        return filterIndexedTo(elements, new ArrayList<Double>(), predicate);
    }

    /**
     * Returns a list containing only elements matching the given [predicate].
     *
     * @param predicate function that takes the index of an element and the element itself
     *                  and returns the result of predicate evaluation on the element.
     */
    @NotNull
    public static List<Boolean> filterIndexed(@NotNull boolean[] elements, @NotNull IndexedPredicate<Boolean> predicate) {
        return filterIndexedTo(elements, new ArrayList<Boolean>(), predicate);
    }

    /**
     * Returns a list containing only elements matching the given [predicate].
     *
     * @param predicate function that takes the index of an element and the element itself
     *                  and returns the result of predicate evaluation on the element.
     */
    @NotNull
    public static List<Character> filterIndexed(@NotNull char[] elements, @NotNull IndexedPredicate<Character> predicate) {
        return filterIndexedTo(elements, new ArrayList<Character>(), predicate);
    }

    /**
     * Appends all elements matching the given [predicate] to the given [destination].
     *
     * @param predicate function that takes the index of an element and the element itself
     *                  and returns the result of predicate evaluation on the element.
     */
    @NotNull
    public static <T, C extends Collection<T>> C filterIndexedTo(@NotNull T[] elements, @NotNull final C destination, @NotNull final IndexedPredicate<T> predicate) {
        forEachIndexed(elements, new IndexedAction<T>() {
            @Override
            public void action(int index, @NotNull T element) {
                if (predicate.predicate(index, element)) {
                    destination.add(element);
                }
            }
        });
        return destination;
    }

    /**
     * Appends all elements matching the given [predicate] to the given [destination].
     *
     * @param predicate function that takes the index of an element and the element itself
     *                  and returns the result of predicate evaluation on the element.
     */
    @NotNull
    public static <C extends Collection<Byte>> C filterIndexedTo(@NotNull byte[] elements, @NotNull final C destination, @NotNull final IndexedPredicate<Byte> predicate) {
        forEachIndexed(elements, new IndexedAction<Byte>() {
            @Override
            public void action(int index, @NotNull Byte element) {
                if (predicate.predicate(index, element)) {
                    destination.add(element);
                }
            }
        });
        return destination;
    }

    /**
     * Appends all elements matching the given [predicate] to the given [destination].
     *
     * @param predicate function that takes the index of an element and the element itself
     *                  and returns the result of predicate evaluation on the element.
     */
    @NotNull
    public static <C extends Collection<Short>> C filterIndexedTo(@NotNull short[] elements, @NotNull final C destination, @NotNull final IndexedPredicate<Short> predicate) {
        forEachIndexed(elements, new IndexedAction<Short>() {
            @Override
            public void action(int index, @NotNull Short element) {
                if (predicate.predicate(index, element)) {
                    destination.add(element);
                }
            }
        });
        return destination;
    }

    /**
     * Appends all elements matching the given [predicate] to the given [destination].
     *
     * @param predicate function that takes the index of an element and the element itself
     *                  and returns the result of predicate evaluation on the element.
     */
    @NotNull
    public static <C extends Collection<Integer>> C filterIndexedTo(@NotNull int[] elements, @NotNull final C destination, @NotNull final IndexedPredicate<Integer> predicate) {
        forEachIndexed(elements, new IndexedAction<Integer>() {
            @Override
            public void action(int index, @NotNull Integer element) {
                if (predicate.predicate(index, element)) {
                    destination.add(element);
                }
            }
        });
        return destination;
    }

    /**
     * Appends all elements matching the given [predicate] to the given [destination].
     *
     * @param predicate function that takes the index of an element and the element itself
     *                  and returns the result of predicate evaluation on the element.
     */
    @NotNull
    public static <C extends Collection<Long>> C filterIndexedTo(@NotNull long[] elements, @NotNull final C destination, @NotNull final IndexedPredicate<Long> predicate) {
        forEachIndexed(elements, new IndexedAction<Long>() {
            @Override
            public void action(int index, @NotNull Long element) {
                if (predicate.predicate(index, element)) {
                    destination.add(element);
                }
            }
        });
        return destination;
    }

    /**
     * Appends all elements matching the given [predicate] to the given [destination].
     *
     * @param predicate function that takes the index of an element and the element itself
     *                  and returns the result of predicate evaluation on the element.
     */
    @NotNull
    public static <C extends Collection<Float>> C filterIndexedTo(@NotNull float[] elements, @NotNull final C destination, @NotNull final IndexedPredicate<Float> predicate) {
        forEachIndexed(elements, new IndexedAction<Float>() {
            @Override
            public void action(int index, @NotNull Float element) {
                if (predicate.predicate(index, element)) {
                    destination.add(element);
                }
            }
        });
        return destination;
    }

    /**
     * Appends all elements matching the given [predicate] to the given [destination].
     *
     * @param predicate function that takes the index of an element and the element itself
     *                  and returns the result of predicate evaluation on the element.
     */
    @NotNull
    public static <C extends Collection<Double>> C filterIndexedTo(@NotNull double[] elements, @NotNull final C destination, @NotNull final IndexedPredicate<Double> predicate) {
        forEachIndexed(elements, new IndexedAction<Double>() {
            @Override
            public void action(int index, @NotNull Double element) {
                if (predicate.predicate(index, element)) {
                    destination.add(element);
                }
            }
        });
        return destination;
    }

    /**
     * Appends all elements matching the given [predicate] to the given [destination].
     *
     * @param predicate function that takes the index of an element and the element itself
     *                  and returns the result of predicate evaluation on the element.
     */
    @NotNull
    public static <C extends Collection<Boolean>> C filterIndexedTo(@NotNull boolean[] elements, @NotNull final C destination, @NotNull final IndexedPredicate<Boolean> predicate) {
        forEachIndexed(elements, new IndexedAction<Boolean>() {
            @Override
            public void action(int index, @NotNull Boolean element) {
                if (predicate.predicate(index, element)) {
                    destination.add(element);
                }
            }
        });
        return destination;
    }

    /**
     * Appends all elements matching the given [predicate] to the given [destination].
     *
     * @param predicate function that takes the index of an element and the element itself
     *                  and returns the result of predicate evaluation on the element.
     */
    @NotNull
    public static <C extends Collection<Character>> C filterIndexedTo(@NotNull char[] elements, @NotNull final C destination, @NotNull final IndexedPredicate<Character> predicate) {
        forEachIndexed(elements, new IndexedAction<Character>() {
            @Override
            public void action(int index, @NotNull Character element) {
                if (predicate.predicate(index, element)) {
                    destination.add(element);
                }
            }
        });
        return destination;
    }

    /**
     * Returns a list containing all elements that are instances of specified class.
     */
    @NotNull
    public static <R> List<R> filterIsInstance(@NotNull Object[] elements, @NotNull Class<R> klass) {
        return filterIsInstanceTo(elements, new ArrayList<R>(), klass);
    }

    /**
     * Appends all elements that are instances of specified class to the given [destination].
     */
    @NotNull
    public static <C extends Collection<R>, R> C filterIsInstanceTo(@NotNull Object[] elements, @NotNull C destination, @NotNull Class<R> klass) {
        for (Object element : elements) {
            if (klass.isInstance(element)) {
                //noinspection unchecked
                destination.add((R) element);
            }
        }
        return destination;
    }

    /**
     * Returns a list containing all elements not matching the given [predicate].
     */
    @NotNull
    public static <T> List<T> filterNot(@NotNull T[] elements, @NotNull Predicate<T> predicate) {
        return filterNotTo(elements, new ArrayList<T>(), predicate);
    }

    /**
     * Returns a list containing all elements not matching the given [predicate].
     */
    @NotNull
    public static List<Byte> filterNot(@NotNull byte[] elements, @NotNull Predicate<Byte> predicate) {
        return filterNotTo(elements, new ArrayList<Byte>(), predicate);
    }

    /**
     * Returns a list containing all elements not matching the given [predicate].
     */
    @NotNull
    public static List<Short> filterNot(@NotNull short[] elements, @NotNull Predicate<Short> predicate) {
        return filterNotTo(elements, new ArrayList<Short>(), predicate);
    }

    /**
     * Returns a list containing all elements not matching the given [predicate].
     */
    @NotNull
    public static List<Integer> filterNot(@NotNull int[] elements, @NotNull Predicate<Integer> predicate) {
        return filterNotTo(elements, new ArrayList<Integer>(), predicate);
    }

    /**
     * Returns a list containing all elements not matching the given [predicate].
     */
    @NotNull
    public static List<Long> filterNot(@NotNull long[] elements, @NotNull Predicate<Long> predicate) {
        return filterNotTo(elements, new ArrayList<Long>(), predicate);
    }

    /**
     * Returns a list containing all elements not matching the given [predicate].
     */
    @NotNull
    public static List<Float> filterNot(@NotNull float[] elements, @NotNull Predicate<Float> predicate) {
        return filterNotTo(elements, new ArrayList<Float>(), predicate);
    }

    /**
     * Returns a list containing all elements not matching the given [predicate].
     */
    @NotNull
    public static List<Double> filterNot(@NotNull double[] elements, @NotNull Predicate<Double> predicate) {
        return filterNotTo(elements, new ArrayList<Double>(), predicate);
    }

    /**
     * Returns a list containing all elements not matching the given [predicate].
     */
    @NotNull
    public static List<Boolean> filterNot(@NotNull boolean[] elements, @NotNull Predicate<Boolean> predicate) {
        return filterNotTo(elements, new ArrayList<Boolean>(), predicate);
    }

    /**
     * Returns a list containing all elements not matching the given [predicate].
     */
    @NotNull
    public static List<Character> filterNot(@NotNull char[] elements, @NotNull Predicate<Character> predicate) {
        return filterNotTo(elements, new ArrayList<Character>(), predicate);
    }

    /**
     * Returns a list containing all elements that are not `null`.
     */
    @NotNull
    public static <T> List<T> filterNotNull(@NotNull T[] elements) {
        return filterNotNullTo(elements, new ArrayList<T>());
    }

    /**
     * Appends all elements that are not `null` to the given [destination].
     */
    @NotNull
    public static <C extends Collection<T>, T> C filterNotNullTo(@NotNull T[] elements, @NotNull C destination) {
        for (T element : elements) if (element != null) destination.add(element);
        return destination;
    }

    /**
     * Appends all elements not matching the given [predicate] to the given [destination].
     */
    @NotNull
    public static <T, C extends Collection<T>> C filterNotTo(@NotNull T[] elements, @NotNull C destination, @NotNull Predicate<T> predicate) {
        for (T element : elements) if (!predicate.predicate(element)) destination.add(element);
        return destination;
    }

    /**
     * Appends all elements not matching the given [predicate] to the given [destination].
     */
    @NotNull
    public static <C extends Collection<Byte>> C filterNotTo(@NotNull byte[] elements, @NotNull C destination, @NotNull Predicate<Byte> predicate) {
        for (byte element : elements) if (!predicate.predicate(element)) destination.add(element);
        return destination;
    }

    /**
     * Appends all elements not matching the given [predicate] to the given [destination].
     */
    @NotNull
    public static <C extends Collection<Short>> C filterNotTo(@NotNull short[] elements, @NotNull C destination, @NotNull Predicate<Short> predicate) {
        for (short element : elements) if (!predicate.predicate(element)) destination.add(element);
        return destination;
    }

    /**
     * Appends all elements not matching the given [predicate] to the given [destination].
     */
    @NotNull
    public static <C extends Collection<Integer>> C filterNotTo(@NotNull int[] elements, @NotNull C destination, @NotNull Predicate<Integer> predicate) {
        for (int element : elements) if (!predicate.predicate(element)) destination.add(element);
        return destination;
    }

    /**
     * Appends all elements not matching the given [predicate] to the given [destination].
     */
    @NotNull
    public static <C extends Collection<Long>> C filterNotTo(@NotNull long[] elements, @NotNull C destination, @NotNull Predicate<Long> predicate) {
        for (long element : elements) if (!predicate.predicate(element)) destination.add(element);
        return destination;
    }

    /**
     * Appends all elements not matching the given [predicate] to the given [destination].
     */
    @NotNull
    public static <C extends Collection<Float>> C filterNotTo(@NotNull float[] elements, @NotNull C destination, @NotNull Predicate<Float> predicate) {
        for (float element : elements) if (!predicate.predicate(element)) destination.add(element);
        return destination;
    }

    /**
     * Appends all elements not matching the given [predicate] to the given [destination].
     */
    @NotNull
    public static <C extends Collection<Double>> C filterNotTo(@NotNull double[] elements, @NotNull C destination, @NotNull Predicate<Double> predicate) {
        for (double element : elements) if (!predicate.predicate(element)) destination.add(element);
        return destination;
    }

    /**
     * Appends all elements not matching the given [predicate] to the given [destination].
     */
    @NotNull
    public static <C extends Collection<Boolean>> C filterNotTo(@NotNull boolean[] elements, @NotNull C destination, @NotNull Predicate<Boolean> predicate) {
        for (boolean element : elements) if (!predicate.predicate(element)) destination.add(element);
        return destination;
    }

    /**
     * Appends all elements not matching the given [predicate] to the given [destination].
     */
    @NotNull
    public static <C extends Collection<Character>> C filterNotTo(@NotNull char[] elements, @NotNull C destination, @NotNull Predicate<Character> predicate) {
        for (char element : elements) if (!predicate.predicate(element)) destination.add(element);
        return destination;
    }

    /**
     * Appends all elements matching the given [predicate] to the given [destination].
     */
    @NotNull
    public static <T, C extends Collection<T>> C filterTo(@NotNull T[] elements, @NotNull C destination, @NotNull Predicate<T> predicate) {
        for (T element : elements) if (predicate.predicate(element)) destination.add(element);
        return destination;
    }

    /**
     * Appends all elements matching the given [predicate] to the given [destination].
     */
    @NotNull
    public static <C extends Collection<Byte>> C filterTo(@NotNull byte[] elements, @NotNull C destination, @NotNull Predicate<Byte> predicate) {
        for (byte element : elements) if (predicate.predicate(element)) destination.add(element);
        return destination;
    }

    /**
     * Appends all elements matching the given [predicate] to the given [destination].
     */
    @NotNull
    public static <C extends Collection<Short>> C filterTo(@NotNull short[] elements, @NotNull C destination, @NotNull Predicate<Short> predicate) {
        for (short element : elements) if (predicate.predicate(element)) destination.add(element);
        return destination;
    }

    /**
     * Appends all elements matching the given [predicate] to the given [destination].
     */
    @NotNull
    public static <C extends Collection<Integer>> C filterTo(@NotNull int[] elements, @NotNull C destination, @NotNull Predicate<Integer> predicate) {
        for (int element : elements) if (predicate.predicate(element)) destination.add(element);
        return destination;
    }

    /**
     * Appends all elements matching the given [predicate] to the given [destination].
     */
    @NotNull
    public static <C extends Collection<Long>> C filterTo(@NotNull long[] elements, @NotNull C destination, @NotNull Predicate<Long> predicate) {
        for (long element : elements) if (predicate.predicate(element)) destination.add(element);
        return destination;
    }

    /**
     * Appends all elements matching the given [predicate] to the given [destination].
     */
    @NotNull
    public static <C extends Collection<Float>> C filterTo(@NotNull float[] elements, @NotNull C destination, @NotNull Predicate<Float> predicate) {
        for (float element : elements) if (predicate.predicate(element)) destination.add(element);
        return destination;
    }

    /**
     * Appends all elements matching the given [predicate] to the given [destination].
     */
    @NotNull
    public static <C extends Collection<Double>> C filterTo(@NotNull double[] elements, @NotNull C destination, @NotNull Predicate<Double> predicate) {
        for (double element : elements) if (predicate.predicate(element)) destination.add(element);
        return destination;
    }

    /**
     * Appends all elements matching the given [predicate] to the given [destination].
     */
    @NotNull
    public static <C extends Collection<Boolean>> C filterTo(@NotNull boolean[] elements, @NotNull C destination, @NotNull Predicate<Boolean> predicate) {
        for (boolean element : elements) if (predicate.predicate(element)) destination.add(element);
        return destination;
    }

    /**
     * Appends all elements matching the given [predicate] to the given [destination].
     */
    @NotNull
    public static <C extends Collection<Character>> C filterTo(@NotNull char[] elements, @NotNull C destination, @NotNull Predicate<Character> predicate) {
        for (char element : elements) if (predicate.predicate(element)) destination.add(element);
        return destination;
    }
}