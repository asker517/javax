package me.panpf.javax.util;

import me.panpf.javax.lang.IntRange;
import me.panpf.javax.lang.Numberx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class Arrayx3 {


    /*
     * slice
     */


    /**
     * Returns a list containing elements at indices in the specified [indices] range.
     */
    @NotNull
    public static <T> List<T> slice(@NotNull T[] elements, @NotNull IntRange indices) {
        if (indices.isEmpty()) return Collectionx.emptyList();
        return Arrayx.asList(Arrayx.copyOfRange(elements, indices.getStart(), indices.getEndInclusive() + 1));
    }

    /**
     * Returns a list containing elements at indices in the specified [indices] range.
     */
    @NotNull
    public static List<Byte> slice(@NotNull byte[] elements, @NotNull IntRange indices) {
        if (indices.isEmpty()) return Collectionx.emptyList();
        return Arrayx.asList(Arrayx.copyOfRange(elements, indices.getStart(), indices.getEndInclusive() + 1));
    }

    /**
     * Returns a list containing elements at indices in the specified [indices] range.
     */
    @NotNull
    public static List<Short> slice(@NotNull short[] elements, @NotNull IntRange indices) {
        if (indices.isEmpty()) return Collectionx.emptyList();
        return Arrayx.asList(Arrayx.copyOfRange(elements, indices.getStart(), indices.getEndInclusive() + 1));
    }

    /**
     * Returns a list containing elements at indices in the specified [indices] range.
     */
    @NotNull
    public static List<Integer> slice(@NotNull int[] elements, @NotNull IntRange indices) {
        if (indices.isEmpty()) return Collectionx.emptyList();
        return Arrayx.asList(Arrayx.copyOfRange(elements, indices.getStart(), indices.getEndInclusive() + 1));
    }

    /**
     * Returns a list containing elements at indices in the specified [indices] range.
     */
    @NotNull
    public static List<Long> slice(@NotNull long[] elements, @NotNull IntRange indices) {
        if (indices.isEmpty()) return Collectionx.emptyList();
        return Arrayx.asList(Arrayx.copyOfRange(elements, indices.getStart(), indices.getEndInclusive() + 1));
    }

    /**
     * Returns a list containing elements at indices in the specified [indices] range.
     */
    @NotNull
    public static List<Float> slice(@NotNull float[] elements, @NotNull IntRange indices) {
        if (indices.isEmpty()) return Collectionx.emptyList();
        return Arrayx.asList(Arrayx.copyOfRange(elements, indices.getStart(), indices.getEndInclusive() + 1));
    }

    /**
     * Returns a list containing elements at indices in the specified [indices] range.
     */
    @NotNull
    public static List<Double> slice(@NotNull double[] elements, @NotNull IntRange indices) {
        if (indices.isEmpty()) return Collectionx.emptyList();
        return Arrayx.asList(Arrayx.copyOfRange(elements, indices.getStart(), indices.getEndInclusive() + 1));
    }

    /**
     * Returns a list containing elements at indices in the specified [indices] range.
     */
    @NotNull
    public static List<Boolean> slice(@NotNull boolean[] elements, @NotNull IntRange indices) {
        if (indices.isEmpty()) return Collectionx.emptyList();
        return Arrayx.asList(Arrayx.copyOfRange(elements, indices.getStart(), indices.getEndInclusive() + 1));
    }

    /**
     * Returns a list containing elements at indices in the specified [indices] range.
     */
    @NotNull
    public static List<Character> slice(@NotNull char[] elements, @NotNull IntRange indices) {
        if (indices.isEmpty()) return Collectionx.emptyList();
        return Arrayx.asList(Arrayx.copyOfRange(elements, indices.getStart(), indices.getEndInclusive() + 1));
    }

    /**
     * Returns a list containing elements at specified [indices].
     */
    @NotNull
    public static <T> List<T> slice(@NotNull T[] elements, @NotNull Iterable<Integer> indices) {
        int size = Collectionx.collectionSizeOrDefault(indices, 10);
        if (size == 0) return Collectionx.emptyList();
        List<T> list = new ArrayList<>(size);
        for (int index : indices) {
            list.add(elements[index]);
        }
        return list;
    }

    /**
     * Returns a list containing elements at specified [indices].
     */
    @NotNull
    public static List<Byte> slice(@NotNull byte[] elements, @NotNull Iterable<Integer> indices) {
        int size = Collectionx.collectionSizeOrDefault(indices, 10);
        if (size == 0) return Collectionx.emptyList();
        List<Byte> list = new ArrayList<>(size);
        for (int index : indices) {
            list.add(elements[index]);
        }
        return list;
    }

    /**
     * Returns a list containing elements at specified [indices].
     */
    @NotNull
    public static List<Short> slice(@NotNull short[] elements, @NotNull Iterable<Integer> indices) {
        int size = Collectionx.collectionSizeOrDefault(indices, 10);
        if (size == 0) return Collectionx.emptyList();
        List<Short> list = new ArrayList<>(size);
        for (int index : indices) {
            list.add(elements[index]);
        }
        return list;
    }

    /**
     * Returns a list containing elements at specified [indices].
     */
    @NotNull
    public static List<Integer> slice(@NotNull int[] elements, @NotNull Iterable<Integer> indices) {
        int size = Collectionx.collectionSizeOrDefault(indices, 10);
        if (size == 0) return Collectionx.emptyList();
        List<Integer> list = new ArrayList<>(size);
        for (int index : indices) {
            list.add(elements[index]);
        }
        return list;
    }

    /**
     * Returns a list containing elements at specified [indices].
     */
    @NotNull
    public static List<Long> slice(@NotNull long[] elements, @NotNull Iterable<Integer> indices) {
        int size = Collectionx.collectionSizeOrDefault(indices, 10);
        if (size == 0) return Collectionx.emptyList();
        List<Long> list = new ArrayList<>(size);
        for (int index : indices) {
            list.add(elements[index]);
        }
        return list;
    }

    /**
     * Returns a list containing elements at specified [indices].
     */
    @NotNull
    public static List<Float> slice(@NotNull float[] elements, @NotNull Iterable<Integer> indices) {
        int size = Collectionx.collectionSizeOrDefault(indices, 10);
        if (size == 0) return Collectionx.emptyList();
        List<Float> list = new ArrayList<>(size);
        for (int index : indices) {
            list.add(elements[index]);
        }
        return list;
    }

    /**
     * Returns a list containing elements at specified [indices].
     */
    @NotNull
    public static List<Double> slice(@NotNull double[] elements, @NotNull Iterable<Integer> indices) {
        int size = Collectionx.collectionSizeOrDefault(indices, 10);
        if (size == 0) return Collectionx.emptyList();
        List<Double> list = new ArrayList<>(size);
        for (int index : indices) {
            list.add(elements[index]);
        }
        return list;
    }

    /**
     * Returns a list containing elements at specified [indices].
     */
    @NotNull
    public static List<Boolean> slice(@NotNull boolean[] elements, @NotNull Iterable<Integer> indices) {
        int size = Collectionx.collectionSizeOrDefault(indices, 10);
        if (size == 0) return Collectionx.emptyList();
        List<Boolean> list = new ArrayList<>(size);
        for (int index : indices) {
            list.add(elements[index]);
        }
        return list;
    }

    /**
     * Returns a list containing elements at specified [indices].
     */
    @NotNull
    public static List<Character> slice(@NotNull char[] elements, @NotNull Iterable<Integer> indices) {
        int size = Collectionx.collectionSizeOrDefault(indices, 10);
        if (size == 0) return Collectionx.emptyList();
        List<Character> list = new ArrayList<>(size);
        for (int index : indices) {
            list.add(elements[index]);
        }
        return list;
    }

    /**
     * Returns an array containing elements of this array at specified [indices].
     */
    @NotNull
    public static <T> T[] sliceArray(@NotNull T[] elements, @NotNull Collection<Integer> indices) {
        ArrayList<T> result = new ArrayList<>(indices.size());
        int targetIndex = 0;
        for (int sourceIndex : indices) {
            result.add(targetIndex++, elements[sourceIndex]);
        }
        //noinspection unchecked
        return (T[]) result.toArray();
    }

    /**
     * Returns an array containing elements of this array at specified [indices].
     */
    @NotNull
    public static byte[] sliceArray(@NotNull byte[] elements, @NotNull Collection<Integer> indices) {
        byte[] result = new byte[indices.size()];
        int targetIndex = 0;
        for (int sourceIndex : indices) {
            result[targetIndex++] = elements[sourceIndex];
        }
        return result;
    }

    /**
     * Returns an array containing elements of this array at specified [indices].
     */
    @NotNull
    public static short[] sliceArray(@NotNull short[] elements, @NotNull Collection<Integer> indices) {
        short[] result = new short[indices.size()];
        int targetIndex = 0;
        for (int sourceIndex : indices) {
            result[targetIndex++] = elements[sourceIndex];
        }
        return result;
    }

    /**
     * Returns an array containing elements of this array at specified [indices].
     */
    @NotNull
    public static int[] sliceArray(@NotNull int[] elements, @NotNull Collection<Integer> indices) {
        int[] result = new int[indices.size()];
        int targetIndex = 0;
        for (int sourceIndex : indices) {
            result[targetIndex++] = elements[sourceIndex];
        }
        return result;
    }

    /**
     * Returns an array containing elements of this array at specified [indices].
     */
    @NotNull
    public static long[] sliceArray(@NotNull long[] elements, @NotNull Collection<Integer> indices) {
        long[] result = new long[indices.size()];
        int targetIndex = 0;
        for (int sourceIndex : indices) {
            result[targetIndex++] = elements[sourceIndex];
        }
        return result;
    }

    /**
     * Returns an array containing elements of this array at specified [indices].
     */
    @NotNull
    public static float[] sliceArray(@NotNull float[] elements, @NotNull Collection<Integer> indices) {
        float[] result = new float[indices.size()];
        int targetIndex = 0;
        for (int sourceIndex : indices) {
            result[targetIndex++] = elements[sourceIndex];
        }
        return result;
    }

    /**
     * Returns an array containing elements of this array at specified [indices].
     */
    @NotNull
    public static double[] sliceArray(@NotNull double[] elements, @NotNull Collection<Integer> indices) {
        double[] result = new double[indices.size()];
        int targetIndex = 0;
        for (int sourceIndex : indices) {
            result[targetIndex++] = elements[sourceIndex];
        }
        return result;
    }

    /**
     * Returns an array containing elements of this array at specified [indices].
     */
    @NotNull
    public static boolean[] sliceArray(@NotNull boolean[] elements, @NotNull Collection<Integer> indices) {
        boolean[] result = new boolean[indices.size()];
        int targetIndex = 0;
        for (int sourceIndex : indices) {
            result[targetIndex++] = elements[sourceIndex];
        }
        return result;
    }

    /**
     * Returns an array containing elements of this array at specified [indices].
     */
    @NotNull
    public static char[] sliceArray(@NotNull char[] elements, @NotNull Collection<Integer> indices) {
        char[] result = new char[indices.size()];
        int targetIndex = 0;
        for (int sourceIndex : indices) {
            result[targetIndex++] = elements[sourceIndex];
        }
        return result;
    }

    /**
     * Returns a list containing elements at indices in the specified [indices] range.
     */
    @NotNull
    public static <T> T[] sliceArray(@NotNull T[] elements, @NotNull IntRange indices) {
        if (indices.isEmpty()) return Arrayx.copyOfRange(elements, 0, 0);
        return Arrayx.copyOfRange(elements, indices.getStart(), indices.getEndInclusive() + 1);
    }

    /**
     * Returns a list containing elements at indices in the specified [indices] range.
     */
    @NotNull
    public static byte[] sliceArray(@NotNull byte[] elements, @NotNull IntRange indices) {
        if (indices.isEmpty()) return new byte[0];
        return Arrayx.copyOfRange(elements, indices.getStart(), indices.getEndInclusive() + 1);
    }

    /**
     * Returns a list containing elements at indices in the specified [indices] range.
     */
    @NotNull
    public static short[] sliceArray(@NotNull short[] elements, @NotNull IntRange indices) {
        if (indices.isEmpty()) return new short[0];
        return Arrayx.copyOfRange(elements, indices.getStart(), indices.getEndInclusive() + 1);
    }

    /**
     * Returns a list containing elements at indices in the specified [indices] range.
     */
    @NotNull
    public static int[] sliceArray(@NotNull int[] elements, @NotNull IntRange indices) {
        if (indices.isEmpty()) return new int[0];
        return Arrayx.copyOfRange(elements, indices.getStart(), indices.getEndInclusive() + 1);
    }

    /**
     * Returns a list containing elements at indices in the specified [indices] range.
     */
    @NotNull
    public static long[] sliceArray(@NotNull long[] elements, @NotNull IntRange indices) {
        if (indices.isEmpty()) return new long[0];
        return Arrayx.copyOfRange(elements, indices.getStart(), indices.getEndInclusive() + 1);
    }

    /**
     * Returns a list containing elements at indices in the specified [indices] range.
     */
    @NotNull
    public static float[] sliceArray(@NotNull float[] elements, @NotNull IntRange indices) {
        if (indices.isEmpty()) return new float[0];
        return Arrayx.copyOfRange(elements, indices.getStart(), indices.getEndInclusive() + 1);
    }

    /**
     * Returns a list containing elements at indices in the specified [indices] range.
     */
    @NotNull
    public static double[] sliceArray(@NotNull double[] elements, @NotNull IntRange indices) {
        if (indices.isEmpty()) return new double[0];
        return Arrayx.copyOfRange(elements, indices.getStart(), indices.getEndInclusive() + 1);
    }

    /**
     * Returns a list containing elements at indices in the specified [indices] range.
     */
    @NotNull
    public static boolean[] sliceArray(@NotNull boolean[] elements, @NotNull IntRange indices) {
        if (indices.isEmpty()) return new boolean[0];
        return Arrayx.copyOfRange(elements, indices.getStart(), indices.getEndInclusive() + 1);
    }

    /**
     * Returns a list containing elements at indices in the specified [indices] range.
     */
    @NotNull
    public static char[] sliceArray(@NotNull char[] elements, @NotNull IntRange indices) {
        if (indices.isEmpty()) return new char[0];
        return Arrayx.copyOfRange(elements, indices.getStart(), indices.getEndInclusive() + 1);
    }
//
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
}