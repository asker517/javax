/*
 * Copyright (C) 2018 Peng fei Pan <sky@panpf.me>
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

import jdk.nashorn.internal.ir.annotations.Ignore;
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

    public static <T> List<T> asList(T[] array) {
        return Arrays.asList(array);
    }

    @NotNull
    public static <Data, Result> Result[] map(@NotNull Data[] datas, @NotNull Transformer<Data, Result> transformer, Result[] results) {
        int index = 0;
        for (Data data : datas) {
            results[index++] = transformer.transform(data);
        }
        return results;
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
    public static String toString(byte[] bytes, Charset charset) {
        return new String(bytes, charset);
    }

    /**
     * Converts the contents of this byte array to a string using the specified [charset].
     */
    public static String toString(byte[] bytes) {
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
    public static boolean any(byte[] elements) {
        return !isEmpty(elements);
    }

    /**
     * Returns `true` if array has at least one element.
     */
    public static boolean any(short[] elements) {
        return !isEmpty(elements);
    }

    /**
     * Returns `true` if array has at least one element.
     */
    public static boolean any(int[] elements) {
        return !isEmpty(elements);
    }

    /**
     * Returns `true` if array has at least one element.
     */
    public static boolean any(long[] elements) {
        return !isEmpty(elements);
    }

    /**
     * Returns `true` if array has at least one element.
     */
    public static boolean any(float[] elements) {
        return !isEmpty(elements);
    }

    /**
     * Returns `true` if array has at least one element.
     */
    public static boolean any(double[] elements) {
        return !isEmpty(elements);
    }

    /**
     * Returns `true` if array has at least one element.
     */
    public static boolean any(boolean[] elements) {
        return !isEmpty(elements);
    }

    /**
     * Returns `true` if array has at least one element.
     */
    public static boolean any(char[] elements) {
        return !isEmpty(elements);
    }

    /**
     * Returns `true` if at least one element matches the given [predicate].
     */
    public static <T> boolean any(T[] elements, Predicate<T> predicate) {
        for (T element : elements) if (predicate.predicate(element)) return true;
        return false;
    }

    /**
     * Returns `true` if at least one element matches the given [predicate].
     */
    public static boolean any(byte[] elements, Predicate<Byte> predicate) {
        for (byte element : elements) if (predicate.predicate(element)) return true;
        return false;
    }

    /**
     * Returns `true` if at least one element matches the given [predicate].
     */
    public static boolean any(short[] elements, Predicate<Short> predicate) {
        for (short element : elements) if (predicate.predicate(element)) return true;
        return false;
    }

    /**
     * Returns `true` if at least one element matches the given [predicate].
     */
    public static boolean any(int[] elements, Predicate<Integer> predicate) {
        for (int element : elements) if (predicate.predicate(element)) return true;
        return false;
    }

    /**
     * Returns `true` if at least one element matches the given [predicate].
     */
    public static boolean any(long[] elements, Predicate<Long> predicate) {
        for (long element : elements) if (predicate.predicate(element)) return true;
        return false;
    }

    /**
     * Returns `true` if at least one element matches the given [predicate].
     */
    public static boolean any(float[] elements, Predicate<Float> predicate) {
        for (float element : elements) if (predicate.predicate(element)) return true;
        return false;
    }

    /**
     * Returns `true` if at least one element matches the given [predicate].
     */
    public static boolean any(double[] elements, Predicate<Double> predicate) {
        for (double element : elements) if (predicate.predicate(element)) return true;
        return false;
    }

    /**
     * Returns `true` if at least one element matches the given [predicate].
     */
    public static boolean any(boolean[] elements, Predicate<Boolean> predicate) {
        for (boolean element : elements) if (predicate.predicate(element)) return true;
        return false;
    }

    /**
     * Returns `true` if at least one element matches the given [predicate].
     */
    public static boolean any(char[] elements, Predicate<Character> predicate) {
        for (char element : elements) if (predicate.predicate(element)) return true;
        return false;
    }
}