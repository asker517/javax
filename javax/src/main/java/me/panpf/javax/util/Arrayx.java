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

import me.panpf.javax.lang.Intx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

/**
 * Array tool class
 */
@SuppressWarnings("WeakerAccess")
public class Arrayx {

    /* ******************************************* From Kotlin Standard library ********************************************************* */


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
        for (int index : Intx.rangeTo(0, midPoint)) {
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
        for (int index : Intx.rangeTo(0, midPoint)) {
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
        for (int index : Intx.rangeTo(0, midPoint)) {
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
        for (int index : Intx.rangeTo(0, midPoint)) {
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
        for (int index : Intx.rangeTo(0, midPoint)) {
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
        for (int index : Intx.rangeTo(0, midPoint)) {
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
        for (int index : Intx.rangeTo(0, midPoint)) {
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
        for (int index : Intx.rangeTo(0, midPoint)) {
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
        for (int index : Intx.rangeTo(0, midPoint)) {
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
        for (int i : Intx.rangeTo(0, lastIndex)) {
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
        for (int i : Intx.rangeTo(0, lastIndex)) {
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
        for (int i : Intx.rangeTo(0, lastIndex)) {
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
        for (int i : Intx.rangeTo(0, lastIndex)) {
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
        for (int i : Intx.rangeTo(0, lastIndex)) {
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
        for (int i : Intx.rangeTo(0, lastIndex)) {
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
        for (int i : Intx.rangeTo(0, lastIndex)) {
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
        for (int i : Intx.rangeTo(0, lastIndex)) {
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
}