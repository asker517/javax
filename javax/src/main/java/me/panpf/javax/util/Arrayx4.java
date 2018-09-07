//package me.panpf.javax.util;
//
//import me.panpf.javax.lang.IntRange;
//import me.panpf.javax.lang.Numberx;
//import org.jetbrains.annotations.NotNull;
//
//public class Arrayx4 {
//    //    /**
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
////    public fun asSequence(@NotNull int[] elements, ): Sequence<Int> {
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
////    public fun asSequence(@NotNull char[] elements, ): Sequence<Char> {
////        if (isEmpty()) return emptySequence()
////        return Sequence { this.iterator() }
////    }
////
////
////    /**
////     * Returns an average value of elements in the array.
////     */
////    @kotlin.jvm.JvmName("averageOfByte")
////    public fun Array<out Byte>.average(): Double {
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
////    public fun Array<out Short>.average(): Double {
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
////    public fun Array<out Int>.average(): Double {
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
////    public fun Array<out Long>.average(): Double {
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
////    public fun Array<out Float>.average(): Double {
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
////    public fun Array<out Double>.average(): Double {
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
////    public inline fun <T, K, M : MutableMap<in K, in T>> associateByTo(@NotNull T[] elements, destination: M, keySelector: (T) -> K): M {
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
////    public inline fun <K, M : MutableMap<in K, in Byte>> associateByTo(@NotNull byte[] elements, destination: M, keySelector: (Byte) -> K): M {
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
////    public inline fun <K, M : MutableMap<in K, in Short>> associateByTo(@NotNull short[] elements, destination: M, keySelector: (Short) -> K): M {
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
////    public inline fun <K, M : MutableMap<in K, in Int>> associateByTo(@NotNull int[] elements, destination: M, keySelector: (Int) -> K): M {
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
////    public inline fun <K, M : MutableMap<in K, in Long>> associateByTo(@NotNull long[] elements, destination: M, keySelector: (Long) -> K): M {
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
////    public inline fun <K, M : MutableMap<in K, in Float>> associateByTo(@NotNull long[] elements, destination: M, keySelector: (Float) -> K): M {
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
////    public inline fun <K, M : MutableMap<in K, in Double>> associateByTo(@NotNull double[] elements, destination: M, keySelector: (Double) -> K): M {
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
////    public inline fun <K, M : MutableMap<in K, in Boolean>> associateByTo(@NotNull boolean[] elements, destination: M, keySelector: (Boolean) -> K): M {
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
////    public inline fun <K, M : MutableMap<in K, in Char>> associateByTo(@NotNull char[] elements, destination: M, keySelector: (Char) -> K): M {
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
////    public inline fun <T, K, V, M : MutableMap<in K, in V>> associateByTo(@NotNull T[] elements, destination: M, keySelector: (T) -> K, valueTransform: (T) -> V): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> associateByTo(@NotNull byte[] elements, destination: M, keySelector: (Byte) -> K, valueTransform: (Byte) -> V): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> associateByTo(@NotNull short[] elements, destination: M, keySelector: (Short) -> K, valueTransform: (Short) -> V): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> associateByTo(@NotNull int[] elements, destination: M, keySelector: (Int) -> K, valueTransform: (Int) -> V): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> associateByTo(@NotNull long[] elements, destination: M, keySelector: (Long) -> K, valueTransform: (Long) -> V): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> associateByTo(@NotNull long[] elements, destination: M, keySelector: (Float) -> K, valueTransform: (Float) -> V): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> associateByTo(@NotNull double[] elements, destination: M, keySelector: (Double) -> K, valueTransform: (Double) -> V): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> associateByTo(@NotNull boolean[] elements, destination: M, keySelector: (Boolean) -> K, valueTransform: (Boolean) -> V): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> associateByTo(@NotNull char[] elements, destination: M, keySelector: (Char) -> K, valueTransform: (Char) -> V): M {
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
////    public inline fun <T, K, V, M : MutableMap<in K, in V>> associateTo(@NotNull T[] elements, destination: M, transform: (T) -> Pair<K, V>): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> associateTo(@NotNull byte[] elements, destination: M, transform: (Byte) -> Pair<K, V>): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> associateTo(@NotNull short[] elements, destination: M, transform: (Short) -> Pair<K, V>): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> associateTo(@NotNull int[] elements, destination: M, transform: (Int) -> Pair<K, V>): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> associateTo(@NotNull long[] elements, destination: M, transform: (Long) -> Pair<K, V>): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> associateTo(@NotNull long[] elements, destination: M, transform: (Float) -> Pair<K, V>): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> associateTo(@NotNull double[] elements, destination: M, transform: (Double) -> Pair<K, V>): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> associateTo(@NotNull boolean[] elements, destination: M, transform: (Boolean) -> Pair<K, V>): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> associateTo(@NotNull char[] elements, destination: M, transform: (Char) -> Pair<K, V>): M {
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
////    public fun <T> binarySearch(@NotNull T[] elements, T element, comparator: Comparator<in T>, fromIndex: Int = 0, toIndex: Int = size): Int {
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
////    public fun asList(@NotNull int[] elements, ): List<Int> {
////        return object : AbstractList<Int>(), RandomAccess {
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
////    public fun asList(@NotNull char[] elements, ): List<Char> {
////        return object : AbstractList<Char>(), RandomAccess {
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
////
//}
