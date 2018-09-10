package me.panpf.javax.util;

import me.panpf.javax.lang.IntRange;
import me.panpf.javax.lang.Numberx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class Arrayx2 {


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


    /*
     * associate
     */


    /**
     * Returns a [Map] containing key-value pairs provided by [transform] function
     * applied to elements of the given array.
     * <p>
     * If any of two pairs would have the same key the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <T, K, V> Map<K, V> associate(@NotNull T[] elements, @NotNull Transformer<T, Pair<K, V>> transform) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateTo(elements, new LinkedHashMap<K, V>(capacity), transform);
    }

    /**
     * Returns a [Map] containing key-value pairs provided by [transform] function
     * applied to elements of the given array.
     * <p>
     * If any of two pairs would have the same key the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <K, V> Map<K, V> associate(@NotNull byte[] elements, @NotNull Transformer<Byte, Pair<K, V>> transform) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateTo(elements, new LinkedHashMap<K, V>(capacity), transform);
    }

    /**
     * Returns a [Map] containing key-value pairs provided by [transform] function
     * applied to elements of the given array.
     * <p>
     * If any of two pairs would have the same key the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <K, V> Map<K, V> associate(@NotNull short[] elements, @NotNull Transformer<Short, Pair<K, V>> transform) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateTo(elements, new LinkedHashMap<K, V>(capacity), transform);
    }

    /**
     * Returns a [Map] containing key-value pairs provided by [transform] function
     * applied to elements of the given array.
     * <p>
     * If any of two pairs would have the same key the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <K, V> Map<K, V> associate(@NotNull int[] elements, @NotNull Transformer<Integer, Pair<K, V>> transform) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateTo(elements, new LinkedHashMap<K, V>(capacity), transform);
    }

    /**
     * Returns a [Map] containing key-value pairs provided by [transform] function
     * applied to elements of the given array.
     * <p>
     * If any of two pairs would have the same key the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <K, V> Map<K, V> associate(@NotNull long[] elements, @NotNull Transformer<Long, Pair<K, V>> transform) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateTo(elements, new LinkedHashMap<K, V>(capacity), transform);
    }

    /**
     * Returns a [Map] containing key-value pairs provided by [transform] function
     * applied to elements of the given array.
     * <p>
     * If any of two pairs would have the same key the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <K, V> Map<K, V> associate(@NotNull float[] elements, @NotNull Transformer<Float, Pair<K, V>> transform) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateTo(elements, new LinkedHashMap<K, V>(capacity), transform);
    }

    /**
     * Returns a [Map] containing key-value pairs provided by [transform] function
     * applied to elements of the given array.
     * <p>
     * If any of two pairs would have the same key the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <K, V> Map<K, V> associate(@NotNull double[] elements, @NotNull Transformer<Double, Pair<K, V>> transform) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateTo(elements, new LinkedHashMap<K, V>(capacity), transform);
    }

    /**
     * Returns a [Map] containing key-value pairs provided by [transform] function
     * applied to elements of the given array.
     * <p>
     * If any of two pairs would have the same key the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <K, V> Map<K, V> associate(@NotNull boolean[] elements, @NotNull Transformer<Boolean, Pair<K, V>> transform) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateTo(elements, new LinkedHashMap<K, V>(capacity), transform);
    }

    /**
     * Returns a [Map] containing key-value pairs provided by [transform] function
     * applied to elements of the given array.
     * <p>
     * If any of two pairs would have the same key the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <K, V> Map<K, V> associate(@NotNull char[] elements, @NotNull Transformer<Character, Pair<K, V>> transform) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateTo(elements, new LinkedHashMap<K, V>(capacity), transform);
    }

    /**
     * Returns a [Map] containing the elements from the given array indexed by the key
     * returned from [keySelector] function applied to each element.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <T, K> Map<K, T> associateBy(@NotNull T[] elements, @NotNull Transformer<T, K> keySelector) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateByTo(elements, new LinkedHashMap<K, T>(capacity), keySelector);
    }

    /**
     * Returns a [Map] containing the elements from the given array indexed by the key
     * returned from [keySelector] function applied to each element.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <K> Map<K, Byte> associateBy(@NotNull byte[] elements, @NotNull Transformer<Byte, K> keySelector) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateByTo(elements, new LinkedHashMap<K, Byte>(capacity), keySelector);
    }

    /**
     * Returns a [Map] containing the elements from the given array indexed by the key
     * returned from [keySelector] function applied to each element.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <K> Map<K, Short> associateBy(@NotNull short[] elements, @NotNull Transformer<Short, K> keySelector) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateByTo(elements, new LinkedHashMap<K, Short>(capacity), keySelector);
    }

    /**
     * Returns a [Map] containing the elements from the given array indexed by the key
     * returned from [keySelector] function applied to each element.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <K> Map<K, Integer> associateBy(@NotNull int[] elements, @NotNull Transformer<Integer, K> keySelector) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateByTo(elements, new LinkedHashMap<K, Integer>(capacity), keySelector);
    }

    /**
     * Returns a [Map] containing the elements from the given array indexed by the key
     * returned from [keySelector] function applied to each element.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <K> Map<K, Long> associateBy(@NotNull long[] elements, @NotNull Transformer<Long, K> keySelector) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateByTo(elements, new LinkedHashMap<K, Long>(capacity), keySelector);
    }

    /**
     * Returns a [Map] containing the elements from the given array indexed by the key
     * returned from [keySelector] function applied to each element.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <K> Map<K, Float> associateBy(@NotNull float[] elements, @NotNull Transformer<Float, K> keySelector) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateByTo(elements, new LinkedHashMap<K, Float>(capacity), keySelector);
    }

    /**
     * Returns a [Map] containing the elements from the given array indexed by the key
     * returned from [keySelector] function applied to each element.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <K> Map<K, Double> associateBy(@NotNull double[] elements, @NotNull Transformer<Double, K> keySelector) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateByTo(elements, new LinkedHashMap<K, Double>(capacity), keySelector);
    }

    /**
     * Returns a [Map] containing the elements from the given array indexed by the key
     * returned from [keySelector] function applied to each element.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <K> Map<K, Boolean> associateBy(@NotNull boolean[] elements, @NotNull Transformer<Boolean, K> keySelector) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateByTo(elements, new LinkedHashMap<K, Boolean>(capacity), keySelector);
    }

    /**
     * Returns a [Map] containing the elements from the given array indexed by the key
     * returned from [keySelector] function applied to each element.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <K> Map<K, Character> associateBy(@NotNull char[] elements, @NotNull Transformer<Character, K> keySelector) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateByTo(elements, new LinkedHashMap<K, Character>(capacity), keySelector);
    }

    /**
     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <T, K, V> Map<K, V> associateBy(@NotNull T[] elements, @NotNull Transformer<T, K> keySelector, @NotNull Transformer<T, V> valueTransform) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateByTo(elements, new LinkedHashMap<K, V>(capacity), keySelector, valueTransform);
    }

    /**
     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <K, V> Map<K, V> associateBy(@NotNull byte[] elements, @NotNull Transformer<Byte, K> keySelector, @NotNull Transformer<Byte, V> valueTransform) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateByTo(elements, new LinkedHashMap<K, V>(capacity), keySelector, valueTransform);
    }

    /**
     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <K, V> Map<K, V> associateBy(@NotNull short[] elements, @NotNull Transformer<Short, K> keySelector, @NotNull Transformer<Short, V> valueTransform) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateByTo(elements, new LinkedHashMap<K, V>(capacity), keySelector, valueTransform);
    }

    /**
     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <K, V> Map<K, V> associateBy(@NotNull int[] elements, @NotNull Transformer<Integer, K> keySelector, @NotNull Transformer<Integer, V> valueTransform) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateByTo(elements, new LinkedHashMap<K, V>(capacity), keySelector, valueTransform);
    }

    /**
     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <K, V> Map<K, V> associateBy(@NotNull long[] elements, @NotNull Transformer<Long, K> keySelector, @NotNull Transformer<Long, V> valueTransform) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateByTo(elements, new LinkedHashMap<K, V>(capacity), keySelector, valueTransform);
    }

    /**
     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <K, V> Map<K, V> associateBy(@NotNull float[] elements, @NotNull Transformer<Float, K> keySelector, @NotNull Transformer<Float, V> valueTransform) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateByTo(elements, new LinkedHashMap<K, V>(capacity), keySelector, valueTransform);
    }

    /**
     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <K, V> Map<K, V> associateBy(@NotNull double[] elements, @NotNull Transformer<Double, K> keySelector, @NotNull Transformer<Double, V> valueTransform) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateByTo(elements, new LinkedHashMap<K, V>(capacity), keySelector, valueTransform);
    }

    /**
     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <K, V> Map<K, V> associateBy(@NotNull boolean[] elements, @NotNull Transformer<Boolean, K> keySelector, @NotNull Transformer<Boolean, V> valueTransform) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateByTo(elements, new LinkedHashMap<K, V>(capacity), keySelector, valueTransform);
    }

    /**
     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given array.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    @NotNull
    public static <K, V> Map<K, V> associateBy(@NotNull char[] elements, @NotNull Transformer<Character, K> keySelector, @NotNull Transformer<Character, V> valueTransform) {
        int capacity = Numberx.coerceAtLeast(Mapx.mapCapacity(elements.length), 16);
        return associateByTo(elements, new LinkedHashMap<K, V>(capacity), keySelector, valueTransform);
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs,
     * where key is provided by the [keySelector] function applied to each element of the given array
     * and value is the element itself.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     */
    @NotNull
    public static <T, K, M extends Map<K, T>> M associateByTo(@NotNull T[] elements, @NotNull M destination, @NotNull Transformer<T, K> keySelector) {
        for (T element : elements) destination.put(keySelector.transform(element), element);
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs,
     * where key is provided by the [keySelector] function applied to each element of the given array
     * and value is the element itself.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     */
    @NotNull
    public static <K, M extends Map<K, Byte>> M associateByTo(@NotNull byte[] elements, @NotNull M destination, @NotNull Transformer<Byte, K> keySelector) {
        for (byte element : elements) destination.put(keySelector.transform(element), element);
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs,
     * where key is provided by the [keySelector] function applied to each element of the given array
     * and value is the element itself.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     */
    @NotNull
    public static <K, M extends Map<K, Short>> M associateByTo(@NotNull short[] elements, @NotNull M destination, @NotNull Transformer<Short, K> keySelector) {
        for (short element : elements) destination.put(keySelector.transform(element), element);
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs,
     * where key is provided by the [keySelector] function applied to each element of the given array
     * and value is the element itself.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     */
    @NotNull
    public static <K, M extends Map<K, Integer>> M associateByTo(@NotNull int[] elements, @NotNull M destination, @NotNull Transformer<Integer, K> keySelector) {
        for (int element : elements) destination.put(keySelector.transform(element), element);
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs,
     * where key is provided by the [keySelector] function applied to each element of the given array
     * and value is the element itself.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     */
    @NotNull
    public static <K, M extends Map<K, Long>> M associateByTo(@NotNull long[] elements, @NotNull M destination, @NotNull Transformer<Long, K> keySelector) {
        for (long element : elements) destination.put(keySelector.transform(element), element);
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs,
     * where key is provided by the [keySelector] function applied to each element of the given array
     * and value is the element itself.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     */
    @NotNull
    public static <K, M extends Map<K, Float>> M associateByTo(@NotNull float[] elements, @NotNull M destination, @NotNull Transformer<Float, K> keySelector) {
        for (float element : elements) destination.put(keySelector.transform(element), element);
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs,
     * where key is provided by the [keySelector] function applied to each element of the given array
     * and value is the element itself.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     */
    @NotNull
    public static <K, M extends Map<K, Double>> M associateByTo(@NotNull double[] elements, @NotNull M destination, @NotNull Transformer<Double, K> keySelector) {
        for (double element : elements) destination.put(keySelector.transform(element), element);
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs,
     * where key is provided by the [keySelector] function applied to each element of the given array
     * and value is the element itself.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     */
    @NotNull
    public static <K, M extends Map<K, Boolean>> M associateByTo(@NotNull boolean[] elements, @NotNull M destination, @NotNull Transformer<Boolean, K> keySelector) {
        for (boolean element : elements) destination.put(keySelector.transform(element), element);
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs,
     * where key is provided by the [keySelector] function applied to each element of the given array
     * and value is the element itself.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     */
    @NotNull
    public static <K, M extends Map<K, Character>> M associateByTo(@NotNull char[] elements, @NotNull M destination, @NotNull Transformer<Character, K> keySelector) {
        for (char element : elements) destination.put(keySelector.transform(element), element);
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs,
     * where key is provided by the [keySelector] function and
     * and value is provided by the [valueTransform] function applied to elements of the given array.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     */
    @NotNull
    public static <T, K, V, M extends Map<K, V>> M associateByTo(@NotNull T[] elements, @NotNull M destination, @NotNull Transformer<T, K> keySelector, @NotNull Transformer<T, V> valueTransform) {
        for (T element : elements) destination.put(keySelector.transform(element), valueTransform.transform(element));
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs,
     * where key is provided by the [keySelector] function and
     * and value is provided by the [valueTransform] function applied to elements of the given array.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     */
    @NotNull
    public static <K, V, M extends Map<K, V>> M associateByTo(@NotNull byte[] elements, @NotNull M destination, @NotNull Transformer<Byte, K> keySelector, @NotNull Transformer<Byte, V> valueTransform) {
        for (byte element : elements)
            destination.put(keySelector.transform(element), valueTransform.transform(element));
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs,
     * where key is provided by the [keySelector] function and
     * and value is provided by the [valueTransform] function applied to elements of the given array.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     */
    @NotNull
    public static <K, V, M extends Map<K, V>> M associateByTo(@NotNull short[] elements, @NotNull M destination, @NotNull Transformer<Short, K> keySelector, @NotNull Transformer<Short, V> valueTransform) {
        for (short element : elements)
            destination.put(keySelector.transform(element), valueTransform.transform(element));
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs,
     * where key is provided by the [keySelector] function and
     * and value is provided by the [valueTransform] function applied to elements of the given array.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     */
    @NotNull
    public static <K, V, M extends Map<K, V>> M associateByTo(@NotNull int[] elements, @NotNull M destination, @NotNull Transformer<Integer, K> keySelector, @NotNull Transformer<Integer, V> valueTransform) {
        for (int element : elements) destination.put(keySelector.transform(element), valueTransform.transform(element));
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs,
     * where key is provided by the [keySelector] function and
     * and value is provided by the [valueTransform] function applied to elements of the given array.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     */
    @NotNull
    public static <K, V, M extends Map<K, V>> M associateByTo(@NotNull long[] elements, @NotNull M destination, @NotNull Transformer<Long, K> keySelector, @NotNull Transformer<Long, V> valueTransform) {
        for (long element : elements)
            destination.put(keySelector.transform(element), valueTransform.transform(element));
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs,
     * where key is provided by the [keySelector] function and
     * and value is provided by the [valueTransform] function applied to elements of the given array.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     */
    @NotNull
    public static <K, V, M extends Map<K, V>> M associateByTo(@NotNull float[] elements, @NotNull M destination, @NotNull Transformer<Float, K> keySelector, @NotNull Transformer<Float, V> valueTransform) {
        for (float element : elements)
            destination.put(keySelector.transform(element), valueTransform.transform(element));
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs,
     * where key is provided by the [keySelector] function and
     * and value is provided by the [valueTransform] function applied to elements of the given array.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     */
    @NotNull
    public static <K, V, M extends Map<K, V>> M associateByTo(@NotNull double[] elements, @NotNull M destination, @NotNull Transformer<Double, K> keySelector, @NotNull Transformer<Double, V> valueTransform) {
        for (double element : elements)
            destination.put(keySelector.transform(element), valueTransform.transform(element));
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs,
     * where key is provided by the [keySelector] function and
     * and value is provided by the [valueTransform] function applied to elements of the given array.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     */
    @NotNull
    public static <K, V, M extends Map<K, V>> M associateByTo(@NotNull boolean[] elements, @NotNull M destination, @NotNull Transformer<Boolean, K> keySelector, @NotNull Transformer<Boolean, V> valueTransform) {
        for (boolean element : elements)
            destination.put(keySelector.transform(element), valueTransform.transform(element));
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs,
     * where key is provided by the [keySelector] function and
     * and value is provided by the [valueTransform] function applied to elements of the given array.
     * <p>
     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
     */
    @NotNull
    public static <K, V, M extends Map<K, V>> M associateByTo(@NotNull char[] elements, @NotNull M destination, @NotNull Transformer<Character, K> keySelector, @NotNull Transformer<Character, V> valueTransform) {
        for (char element : elements)
            destination.put(keySelector.transform(element), valueTransform.transform(element));
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs
     * provided by [transform] function applied to each element of the given array.
     * <p>
     * If any of two pairs would have the same key the last one gets added to the map.
     */
    @NotNull
    public static <T, K, V, M extends Map<K, V>> M associateTo(@NotNull T[] elements, @NotNull M destination, @NotNull Transformer<T, Pair<K, V>> transform) {
        for (T element : elements) Mapx.put(destination, transform.transform(element));
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs
     * provided by [transform] function applied to each element of the given array.
     * <p>
     * If any of two pairs would have the same key the last one gets added to the map.
     */
    @NotNull
    public static <K, V, M extends Map<K, V>> M associateTo(@NotNull byte[] elements, @NotNull M destination, @NotNull Transformer<Byte, Pair<K, V>> transform) {
        for (byte element : elements) Mapx.put(destination, transform.transform(element));
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs
     * provided by [transform] function applied to each element of the given array.
     * <p>
     * If any of two pairs would have the same key the last one gets added to the map.
     */
    @NotNull
    public static <K, V, M extends Map<K, V>> M associateTo(@NotNull short[] elements, @NotNull M destination, @NotNull Transformer<Short, Pair<K, V>> transform) {
        for (short element : elements) Mapx.put(destination, transform.transform(element));
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs
     * provided by [transform] function applied to each element of the given array.
     * <p>
     * If any of two pairs would have the same key the last one gets added to the map.
     */
    @NotNull
    public static <K, V, M extends Map<K, V>> M associateTo(@NotNull int[] elements, @NotNull M destination, @NotNull Transformer<Integer, Pair<K, V>> transform) {
        for (int element : elements) Mapx.put(destination, transform.transform(element));
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs
     * provided by [transform] function applied to each element of the given array.
     * <p>
     * If any of two pairs would have the same key the last one gets added to the map.
     */
    @NotNull
    public static <K, V, M extends Map<K, V>> M associateTo(@NotNull long[] elements, @NotNull M destination, @NotNull Transformer<Long, Pair<K, V>> transform) {
        for (long element : elements) Mapx.put(destination, transform.transform(element));
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs
     * provided by [transform] function applied to each element of the given array.
     * <p>
     * If any of two pairs would have the same key the last one gets added to the map.
     */
    @NotNull
    public static <K, V, M extends Map<K, V>> M associateTo(@NotNull float[] elements, @NotNull M destination, @NotNull Transformer<Float, Pair<K, V>> transform) {
        for (float element : elements) Mapx.put(destination, transform.transform(element));
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs
     * provided by [transform] function applied to each element of the given array.
     * <p>
     * If any of two pairs would have the same key the last one gets added to the map.
     */
    @NotNull
    public static <K, V, M extends Map<K, V>> M associateTo(@NotNull double[] elements, @NotNull M destination, @NotNull Transformer<Double, Pair<K, V>> transform) {
        for (double element : elements) Mapx.put(destination, transform.transform(element));
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs
     * provided by [transform] function applied to each element of the given array.
     * <p>
     * If any of two pairs would have the same key the last one gets added to the map.
     */
    @NotNull
    public static <K, V, M extends Map<K, V>> M associateTo(@NotNull boolean[] elements, @NotNull M destination, @NotNull Transformer<Boolean, Pair<K, V>> transform) {
        for (boolean element : elements) Mapx.put(destination, transform.transform(element));
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs
     * provided by [transform] function applied to each element of the given array.
     * <p>
     * If any of two pairs would have the same key the last one gets added to the map.
     */
    @NotNull
    public static <K, V, M extends Map<K, V>> M associateTo(@NotNull char[] elements, @NotNull M destination, @NotNull Transformer<Character, Pair<K, V>> transform) {
        for (char element : elements) Mapx.put(destination, transform.transform(element));
        return destination;
    }


    /*
     * withIndex
     */


    /**
     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
     */
    public static <T> Iterable<IndexedValue<T>> withIndex(@NotNull final T[] elements) {
        return new IndexingIterable<>(new DefaultValue<Iterator<T>>() {
            @NotNull
            @Override
            public Iterator<T> get() {
                return Arrayx.iterator(elements);
            }
        });
    }

    /**
     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
     */
    @NotNull
    public static Iterable<IndexedValue<Byte>> withIndex(@NotNull final byte[] elements) {
        return new IndexingIterable<>(new DefaultValue<Iterator<Byte>>() {
            @NotNull
            @Override
            public Iterator<Byte> get() {
                return Arrayx.iterator(elements);
            }
        });
    }

    /**
     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
     */
    @NotNull
    public static Iterable<IndexedValue<Short>> withIndex(@NotNull final short[] elements) {
        return new IndexingIterable<>(new DefaultValue<Iterator<Short>>() {
            @NotNull
            @Override
            public Iterator<Short> get() {
                return Arrayx.iterator(elements);
            }
        });
    }

    /**
     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
     */
    @NotNull
    public static Iterable<IndexedValue<Integer>> withIndex(@NotNull final int[] elements) {
        return new IndexingIterable<>(new DefaultValue<Iterator<Integer>>() {
            @NotNull
            @Override
            public Iterator<Integer> get() {
                return Arrayx.iterator(elements);
            }
        });
    }

    /**
     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
     */
    @NotNull
    public static Iterable<IndexedValue<Long>> withIndex(@NotNull final long[] elements) {
        return new IndexingIterable<>(new DefaultValue<Iterator<Long>>() {
            @NotNull
            @Override
            public Iterator<Long> get() {
                return Arrayx.iterator(elements);
            }
        });
    }

    /**
     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
     */
    @NotNull
    public static Iterable<IndexedValue<Float>> withIndex(@NotNull final float[] elements) {
        return new IndexingIterable<>(new DefaultValue<Iterator<Float>>() {
            @NotNull
            @Override
            public Iterator<Float> get() {
                return Arrayx.iterator(elements);
            }
        });
    }

    /**
     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
     */
    @NotNull
    public static Iterable<IndexedValue<Double>> withIndex(@NotNull final double[] elements) {
        return new IndexingIterable<>(new DefaultValue<Iterator<Double>>() {
            @NotNull
            @Override
            public Iterator<Double> get() {
                return Arrayx.iterator(elements);
            }
        });
    }

    /**
     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
     */
    @NotNull
    public static Iterable<IndexedValue<Boolean>> withIndex(@NotNull final boolean[] elements) {
        return new IndexingIterable<>(new DefaultValue<Iterator<Boolean>>() {
            @NotNull
            @Override
            public Iterator<Boolean> get() {
                return Arrayx.iterator(elements);
            }
        });
    }

    /**
     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
     */
    @NotNull
    public static Iterable<IndexedValue<Character>> withIndex(@NotNull final char[] elements) {
        return new IndexingIterable<>(new DefaultValue<Iterator<Character>>() {
            @NotNull
            @Override
            public Iterator<Character> get() {
                return Arrayx.iterator(elements);
            }
        });
    }

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
//    public static asSequence(@NotNull byte[] elements): Sequence<Byte> {
//        if (isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromArray
//     */
//    public static asSequence(@NotNull short[] elements): Sequence<Short> {
//        if (isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromArray
//     */
//    public static asSequence(@NotNull int[] elements): Sequence<Integer> {
//        if (isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromArray
//     */
//    public static asSequence(@NotNull long[] elements): Sequence<Long> {
//        if (isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromArray
//     */
//    public static asSequence(@NotNull long[] elements): Sequence<Float> {
//        if (isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromArray
//     */
//    public static asSequence(@NotNull double[] elements): Sequence<Double> {
//        if (isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromArray
//     */
//    public static asSequence(@NotNull boolean[] elements): Sequence<Boolean> {
//        if (isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromArray
//     */
//    public static asSequence(@NotNull char[] elements): Sequence<Character> {
//        if (isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
}