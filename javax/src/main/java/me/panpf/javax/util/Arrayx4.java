//package me.panpf.javax.util;
//
//public class Arrayx4 {
//    //    /**
////     * Returns `true` if all elements match the given [predicate].
////     */
////    public inline fun <T> Array<out T>.all(predicate: (T) -> Boolean): Boolean {
////        for (element in this) if (!predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if all elements match the given [predicate].
////     */
////    public inline fun ByteArray.all(predicate: (Byte) -> Boolean): Boolean {
////        for (element in this) if (!predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if all elements match the given [predicate].
////     */
////    public inline fun ShortArray.all(predicate: (Short) -> Boolean): Boolean {
////        for (element in this) if (!predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if all elements match the given [predicate].
////     */
////    public inline fun IntArray.all(predicate: (Int) -> Boolean): Boolean {
////        for (element in this) if (!predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if all elements match the given [predicate].
////     */
////    public inline fun LongArray.all(predicate: (Long) -> Boolean): Boolean {
////        for (element in this) if (!predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if all elements match the given [predicate].
////     */
////    public inline fun FloatArray.all(predicate: (Float) -> Boolean): Boolean {
////        for (element in this) if (!predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if all elements match the given [predicate].
////     */
////    public inline fun DoubleArray.all(predicate: (Double) -> Boolean): Boolean {
////        for (element in this) if (!predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if all elements match the given [predicate].
////     */
////    public inline fun BooleanArray.all(predicate: (Boolean) -> Boolean): Boolean {
////        for (element in this) if (!predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Returns `true` if all elements match the given [predicate].
////     */
////    public inline fun CharArray.all(predicate: (Char) -> Boolean): Boolean {
////        for (element in this) if (!predicate(element)) return false
////        return true
////    }
////
////    /**
////     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
////     *
////     * @sample samples.collections.Sequences.Building.sequenceFromArray
////     */
////    public fun <T> Array<out T>.asSequence(): Sequence<T> {
////        if (isEmpty()) return emptySequence()
////        return Sequence { this.iterator() }
////    }
////
////    /**
////     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
////     *
////     * @sample samples.collections.Sequences.Building.sequenceFromArray
////     */
////    public fun ByteArray.asSequence(): Sequence<Byte> {
////        if (isEmpty()) return emptySequence()
////        return Sequence { this.iterator() }
////    }
////
////    /**
////     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
////     *
////     * @sample samples.collections.Sequences.Building.sequenceFromArray
////     */
////    public fun ShortArray.asSequence(): Sequence<Short> {
////        if (isEmpty()) return emptySequence()
////        return Sequence { this.iterator() }
////    }
////
////    /**
////     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
////     *
////     * @sample samples.collections.Sequences.Building.sequenceFromArray
////     */
////    public fun IntArray.asSequence(): Sequence<Int> {
////        if (isEmpty()) return emptySequence()
////        return Sequence { this.iterator() }
////    }
////
////    /**
////     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
////     *
////     * @sample samples.collections.Sequences.Building.sequenceFromArray
////     */
////    public fun LongArray.asSequence(): Sequence<Long> {
////        if (isEmpty()) return emptySequence()
////        return Sequence { this.iterator() }
////    }
////
////    /**
////     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
////     *
////     * @sample samples.collections.Sequences.Building.sequenceFromArray
////     */
////    public fun FloatArray.asSequence(): Sequence<Float> {
////        if (isEmpty()) return emptySequence()
////        return Sequence { this.iterator() }
////    }
////
////    /**
////     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
////     *
////     * @sample samples.collections.Sequences.Building.sequenceFromArray
////     */
////    public fun DoubleArray.asSequence(): Sequence<Double> {
////        if (isEmpty()) return emptySequence()
////        return Sequence { this.iterator() }
////    }
////
////    /**
////     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
////     *
////     * @sample samples.collections.Sequences.Building.sequenceFromArray
////     */
////    public fun BooleanArray.asSequence(): Sequence<Boolean> {
////        if (isEmpty()) return emptySequence()
////        return Sequence { this.iterator() }
////    }
////
////    /**
////     * Creates a [Sequence] instance that wraps the original array returning its elements when being iterated.
////     *
////     * @sample samples.collections.Sequences.Building.sequenceFromArray
////     */
////    public fun CharArray.asSequence(): Sequence<Char> {
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
////    public fun ByteArray.average(): Double {
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
////    public fun ShortArray.average(): Double {
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
////    public fun IntArray.average(): Double {
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
////    public fun LongArray.average(): Double {
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
////    public fun FloatArray.average(): Double {
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
////    public fun DoubleArray.average(): Double {
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
////    /**
////     * Returns the sum of all elements in the array.
////     */
////    @kotlin.jvm.JvmName("sumOfByte")
////    public fun Array<out Byte>.sum(): Int {
////        var sum: Int = 0
////        for (element in this) {
////            sum += element
////        }
////        return sum
////    }
////
/////**
//// * Returns the sum of all elements in the array.
//// */
////    @kotlin.jvm.JvmName("sumOfShort")
////    public fun Array<out Short>.sum(): Int {
////        var sum: Int = 0
////        for (element in this) {
////            sum += element
////        }
////        return sum
////    }
////
/////**
//// * Returns the sum of all elements in the array.
//// */
////    @kotlin.jvm.JvmName("sumOfInt")
////    public fun Array<out Int>.sum(): Int {
////        var sum: Int = 0
////        for (element in this) {
////            sum += element
////        }
////        return sum
////    }
////
/////**
//// * Returns the sum of all elements in the array.
//// */
////    @kotlin.jvm.JvmName("sumOfLong")
////    public fun Array<out Long>.sum(): Long {
////        var sum: Long = 0L
////        for (element in this) {
////            sum += element
////        }
////        return sum
////    }
////
/////**
//// * Returns the sum of all elements in the array.
//// */
////    @kotlin.jvm.JvmName("sumOfFloat")
////    public fun Array<out Float>.sum(): Float {
////        var sum: Float = 0.0f
////        for (element in this) {
////            sum += element
////        }
////        return sum
////    }
////
/////**
//// * Returns the sum of all elements in the array.
//// */
////    @kotlin.jvm.JvmName("sumOfDouble")
////    public fun Array<out Double>.sum(): Double {
////        var sum: Double = 0.0
////        for (element in this) {
////            sum += element
////        }
////        return sum
////    }
////
////    /**
////     * Returns the sum of all elements in the array.
////     */
////    public fun ByteArray.sum(): Int {
////        var sum: Int = 0
////        for (element in this) {
////            sum += element
////        }
////        return sum
////    }
////
////    /**
////     * Returns the sum of all elements in the array.
////     */
////    public fun ShortArray.sum(): Int {
////        var sum: Int = 0
////        for (element in this) {
////            sum += element
////        }
////        return sum
////    }
////
////    /**
////     * Returns the sum of all elements in the array.
////     */
////    public fun IntArray.sum(): Int {
////        var sum: Int = 0
////        for (element in this) {
////            sum += element
////        }
////        return sum
////    }
////
////    /**
////     * Returns the sum of all elements in the array.
////     */
////    public fun LongArray.sum(): Long {
////        var sum: Long = 0L
////        for (element in this) {
////            sum += element
////        }
////        return sum
////    }
////
////    /**
////     * Returns the sum of all elements in the array.
////     */
////    public fun FloatArray.sum(): Float {
////        var sum: Float = 0.0f
////        for (element in this) {
////            sum += element
////        }
////        return sum
////    }
////
////    /**
////     * Returns the sum of all elements in the array.
////     */
////    public fun DoubleArray.sum(): Double {
////        var sum: Double = 0.0
////        for (element in this) {
////            sum += element
////        }
////        return sum
////    }
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
////    public inline fun <T, K, V> Array<out T>.associate(transform: (T) -> Pair<K, V>): Map<K, V> {
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
////    public inline fun <K, V> ByteArray.associate(transform: (Byte) -> Pair<K, V>): Map<K, V> {
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
////    public inline fun <K, V> ShortArray.associate(transform: (Short) -> Pair<K, V>): Map<K, V> {
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
////    public inline fun <K, V> IntArray.associate(transform: (Int) -> Pair<K, V>): Map<K, V> {
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
////    public inline fun <K, V> LongArray.associate(transform: (Long) -> Pair<K, V>): Map<K, V> {
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
////    public inline fun <K, V> FloatArray.associate(transform: (Float) -> Pair<K, V>): Map<K, V> {
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
////    public inline fun <K, V> DoubleArray.associate(transform: (Double) -> Pair<K, V>): Map<K, V> {
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
////    public inline fun <K, V> BooleanArray.associate(transform: (Boolean) -> Pair<K, V>): Map<K, V> {
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
////    public inline fun <K, V> CharArray.associate(transform: (Char) -> Pair<K, V>): Map<K, V> {
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
////    public inline fun <T, K> Array<out T>.associateBy(keySelector: (T) -> K): Map<K, T> {
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
////    public inline fun <K> ByteArray.associateBy(keySelector: (Byte) -> K): Map<K, Byte> {
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
////    public inline fun <K> ShortArray.associateBy(keySelector: (Short) -> K): Map<K, Short> {
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
////    public inline fun <K> IntArray.associateBy(keySelector: (Int) -> K): Map<K, Int> {
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
////    public inline fun <K> LongArray.associateBy(keySelector: (Long) -> K): Map<K, Long> {
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
////    public inline fun <K> FloatArray.associateBy(keySelector: (Float) -> K): Map<K, Float> {
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
////    public inline fun <K> DoubleArray.associateBy(keySelector: (Double) -> K): Map<K, Double> {
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
////    public inline fun <K> BooleanArray.associateBy(keySelector: (Boolean) -> K): Map<K, Boolean> {
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
////    public inline fun <K> CharArray.associateBy(keySelector: (Char) -> K): Map<K, Char> {
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
////    public inline fun <T, K, V> Array<out T>.associateBy(keySelector: (T) -> K, valueTransform: (T) -> V): Map<K, V> {
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
////    public inline fun <K, V> ByteArray.associateBy(keySelector: (Byte) -> K, valueTransform: (Byte) -> V): Map<K, V> {
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
////    public inline fun <K, V> ShortArray.associateBy(keySelector: (Short) -> K, valueTransform: (Short) -> V): Map<K, V> {
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
////    public inline fun <K, V> IntArray.associateBy(keySelector: (Int) -> K, valueTransform: (Int) -> V): Map<K, V> {
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
////    public inline fun <K, V> LongArray.associateBy(keySelector: (Long) -> K, valueTransform: (Long) -> V): Map<K, V> {
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
////    public inline fun <K, V> FloatArray.associateBy(keySelector: (Float) -> K, valueTransform: (Float) -> V): Map<K, V> {
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
////    public inline fun <K, V> DoubleArray.associateBy(keySelector: (Double) -> K, valueTransform: (Double) -> V): Map<K, V> {
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
////    public inline fun <K, V> BooleanArray.associateBy(keySelector: (Boolean) -> K, valueTransform: (Boolean) -> V): Map<K, V> {
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
////    public inline fun <K, V> CharArray.associateBy(keySelector: (Char) -> K, valueTransform: (Char) -> V): Map<K, V> {
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
////    public inline fun <T, K, M : MutableMap<in K, in T>> Array<out T>.associateByTo(destination: M, keySelector: (T) -> K): M {
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
////    public inline fun <K, M : MutableMap<in K, in Byte>> ByteArray.associateByTo(destination: M, keySelector: (Byte) -> K): M {
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
////    public inline fun <K, M : MutableMap<in K, in Short>> ShortArray.associateByTo(destination: M, keySelector: (Short) -> K): M {
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
////    public inline fun <K, M : MutableMap<in K, in Int>> IntArray.associateByTo(destination: M, keySelector: (Int) -> K): M {
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
////    public inline fun <K, M : MutableMap<in K, in Long>> LongArray.associateByTo(destination: M, keySelector: (Long) -> K): M {
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
////    public inline fun <K, M : MutableMap<in K, in Float>> FloatArray.associateByTo(destination: M, keySelector: (Float) -> K): M {
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
////    public inline fun <K, M : MutableMap<in K, in Double>> DoubleArray.associateByTo(destination: M, keySelector: (Double) -> K): M {
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
////    public inline fun <K, M : MutableMap<in K, in Boolean>> BooleanArray.associateByTo(destination: M, keySelector: (Boolean) -> K): M {
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
////    public inline fun <K, M : MutableMap<in K, in Char>> CharArray.associateByTo(destination: M, keySelector: (Char) -> K): M {
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
////    public inline fun <T, K, V, M : MutableMap<in K, in V>> Array<out T>.associateByTo(destination: M, keySelector: (T) -> K, valueTransform: (T) -> V): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> ByteArray.associateByTo(destination: M, keySelector: (Byte) -> K, valueTransform: (Byte) -> V): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> ShortArray.associateByTo(destination: M, keySelector: (Short) -> K, valueTransform: (Short) -> V): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> IntArray.associateByTo(destination: M, keySelector: (Int) -> K, valueTransform: (Int) -> V): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> LongArray.associateByTo(destination: M, keySelector: (Long) -> K, valueTransform: (Long) -> V): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> FloatArray.associateByTo(destination: M, keySelector: (Float) -> K, valueTransform: (Float) -> V): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> DoubleArray.associateByTo(destination: M, keySelector: (Double) -> K, valueTransform: (Double) -> V): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> BooleanArray.associateByTo(destination: M, keySelector: (Boolean) -> K, valueTransform: (Boolean) -> V): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> CharArray.associateByTo(destination: M, keySelector: (Char) -> K, valueTransform: (Char) -> V): M {
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
////    public inline fun <T, K, V, M : MutableMap<in K, in V>> Array<out T>.associateTo(destination: M, transform: (T) -> Pair<K, V>): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> ByteArray.associateTo(destination: M, transform: (Byte) -> Pair<K, V>): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> ShortArray.associateTo(destination: M, transform: (Short) -> Pair<K, V>): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> IntArray.associateTo(destination: M, transform: (Int) -> Pair<K, V>): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> LongArray.associateTo(destination: M, transform: (Long) -> Pair<K, V>): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> FloatArray.associateTo(destination: M, transform: (Float) -> Pair<K, V>): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> DoubleArray.associateTo(destination: M, transform: (Double) -> Pair<K, V>): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> BooleanArray.associateTo(destination: M, transform: (Boolean) -> Pair<K, V>): M {
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
////    public inline fun <K, V, M : MutableMap<in K, in V>> CharArray.associateTo(destination: M, transform: (Char) -> Pair<K, V>): M {
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
////    public fun <T> Array<out T>.binarySearch(element: T, comparator: Comparator<in T>, fromIndex: Int = 0, toIndex: Int = size): Int {
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
////    public fun <T> Array<out T>.binarySearch(element: T, fromIndex: Int = 0, toIndex: Int = size): Int {
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
////    public fun ByteArray.binarySearch(element: Byte, fromIndex: Int = 0, toIndex: Int = size): Int {
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
////    public fun ShortArray.binarySearch(element: Short, fromIndex: Int = 0, toIndex: Int = size): Int {
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
////    public fun IntArray.binarySearch(element: Int, fromIndex: Int = 0, toIndex: Int = size): Int {
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
////    public fun LongArray.binarySearch(element: Long, fromIndex: Int = 0, toIndex: Int = size): Int {
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
////    public fun FloatArray.binarySearch(element: Float, fromIndex: Int = 0, toIndex: Int = size): Int {
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
////    public fun DoubleArray.binarySearch(element: Double, fromIndex: Int = 0, toIndex: Int = size): Int {
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
////    public fun CharArray.binarySearch(element: Char, fromIndex: Int = 0, toIndex: Int = size): Int {
////        return java.util.Arrays.binarySearch(this, fromIndex, toIndex, element)
////    }
////
////
////    /**
////     * Returns a [List] that wraps the original array.
////     */
////    public fun <T> Array<out T>.asList(): List<T> {
////        return ArraysUtilJVM.asList(this)
////    }
////
////    /**
////     * Returns a [List] that wraps the original array.
////     */
////    public fun ByteArray.asList(): List<Byte> {
////        return object : AbstractList<Byte>(), RandomAccess {
////            override val size: Int get() = this@asList.size
////            override fun isEmpty(): Boolean = this@asList.isEmpty()
////            override fun contains(element: Byte): Boolean = this@asList.contains(element)
////            override fun get(index: Int): Byte = this@asList[index]
////            override fun indexOf(element: Byte): Int = this@asList.indexOf(element)
////            override fun lastIndexOf(element: Byte): Int = this@asList.lastIndexOf(element)
////        }
////    }
////
////    /**
////     * Returns a [List] that wraps the original array.
////     */
////    public fun ShortArray.asList(): List<Short> {
////        return object : AbstractList<Short>(), RandomAccess {
////            override val size: Int get() = this@asList.size
////            override fun isEmpty(): Boolean = this@asList.isEmpty()
////            override fun contains(element: Short): Boolean = this@asList.contains(element)
////            override fun get(index: Int): Short = this@asList[index]
////            override fun indexOf(element: Short): Int = this@asList.indexOf(element)
////            override fun lastIndexOf(element: Short): Int = this@asList.lastIndexOf(element)
////        }
////    }
////
////    /**
////     * Returns a [List] that wraps the original array.
////     */
////    public fun IntArray.asList(): List<Int> {
////        return object : AbstractList<Int>(), RandomAccess {
////            override val size: Int get() = this@asList.size
////            override fun isEmpty(): Boolean = this@asList.isEmpty()
////            override fun contains(element: Int): Boolean = this@asList.contains(element)
////            override fun get(index: Int): Int = this@asList[index]
////            override fun indexOf(element: Int): Int = this@asList.indexOf(element)
////            override fun lastIndexOf(element: Int): Int = this@asList.lastIndexOf(element)
////        }
////    }
////
////    /**
////     * Returns a [List] that wraps the original array.
////     */
////    public fun LongArray.asList(): List<Long> {
////        return object : AbstractList<Long>(), RandomAccess {
////            override val size: Int get() = this@asList.size
////            override fun isEmpty(): Boolean = this@asList.isEmpty()
////            override fun contains(element: Long): Boolean = this@asList.contains(element)
////            override fun get(index: Int): Long = this@asList[index]
////            override fun indexOf(element: Long): Int = this@asList.indexOf(element)
////            override fun lastIndexOf(element: Long): Int = this@asList.lastIndexOf(element)
////        }
////    }
////
////    /**
////     * Returns a [List] that wraps the original array.
////     */
////    public fun FloatArray.asList(): List<Float> {
////        return object : AbstractList<Float>(), RandomAccess {
////            override val size: Int get() = this@asList.size
////            override fun isEmpty(): Boolean = this@asList.isEmpty()
////            override fun contains(element: Float): Boolean = this@asList.contains(element)
////            override fun get(index: Int): Float = this@asList[index]
////            override fun indexOf(element: Float): Int = this@asList.indexOf(element)
////            override fun lastIndexOf(element: Float): Int = this@asList.lastIndexOf(element)
////        }
////    }
////
////    /**
////     * Returns a [List] that wraps the original array.
////     */
////    public fun DoubleArray.asList(): List<Double> {
////        return object : AbstractList<Double>(), RandomAccess {
////            override val size: Int get() = this@asList.size
////            override fun isEmpty(): Boolean = this@asList.isEmpty()
////            override fun contains(element: Double): Boolean = this@asList.contains(element)
////            override fun get(index: Int): Double = this@asList[index]
////            override fun indexOf(element: Double): Int = this@asList.indexOf(element)
////            override fun lastIndexOf(element: Double): Int = this@asList.lastIndexOf(element)
////        }
////    }
////
////    /**
////     * Returns a [List] that wraps the original array.
////     */
////    public fun BooleanArray.asList(): List<Boolean> {
////        return object : AbstractList<Boolean>(), RandomAccess {
////            override val size: Int get() = this@asList.size
////            override fun isEmpty(): Boolean = this@asList.isEmpty()
////            override fun contains(element: Boolean): Boolean = this@asList.contains(element)
////            override fun get(index: Int): Boolean = this@asList[index]
////            override fun indexOf(element: Boolean): Int = this@asList.indexOf(element)
////            override fun lastIndexOf(element: Boolean): Int = this@asList.lastIndexOf(element)
////        }
////    }
////
////    /**
////     * Returns a [List] that wraps the original array.
////     */
////    public fun CharArray.asList(): List<Char> {
////        return object : AbstractList<Char>(), RandomAccess {
////            override val size: Int get() = this@asList.size
////            override fun isEmpty(): Boolean = this@asList.isEmpty()
////            override fun contains(element: Char): Boolean = this@asList.contains(element)
////            override fun get(index: Int): Char = this@asList[index]
////            override fun indexOf(element: Char): Int = this@asList.indexOf(element)
////            override fun lastIndexOf(element: Char): Int = this@asList.lastIndexOf(element)
////        }
////    }
////
////
////    /**
////     * Returns `true` if [element] is found in the array.
////     */
////    public operator fun <@kotlin.internal.OnlyInputTypes T> Array<out T>.contains(element: T): Boolean {
////        return indexOf(element) >= 0
////    }
////
////    /**
////     * Returns `true` if [element] is found in the array.
////     */
////    public operator fun ByteArray.contains(element: Byte): Boolean {
////        return indexOf(element) >= 0
////    }
////
////    /**
////     * Returns `true` if [element] is found in the array.
////     */
////    public operator fun ShortArray.contains(element: Short): Boolean {
////        return indexOf(element) >= 0
////    }
////
////    /**
////     * Returns `true` if [element] is found in the array.
////     */
////    public operator fun IntArray.contains(element: Int): Boolean {
////        return indexOf(element) >= 0
////    }
////
////    /**
////     * Returns `true` if [element] is found in the array.
////     */
////    public operator fun LongArray.contains(element: Long): Boolean {
////        return indexOf(element) >= 0
////    }
////
////    /**
////     * Returns `true` if [element] is found in the array.
////     */
////    public operator fun FloatArray.contains(element: Float): Boolean {
////        return indexOf(element) >= 0
////    }
////
////    /**
////     * Returns `true` if [element] is found in the array.
////     */
////    public operator fun DoubleArray.contains(element: Double): Boolean {
////        return indexOf(element) >= 0
////    }
////
////    /**
////     * Returns `true` if [element] is found in the array.
////     */
////    public operator fun BooleanArray.contains(element: Boolean): Boolean {
////        return indexOf(element) >= 0
////    }
////
////    /**
////     * Returns `true` if [element] is found in the array.
////     */
////    public operator fun CharArray.contains(element: Char): Boolean {
////        return indexOf(element) >= 0
////    }
////
////
////
////    /**
////     * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
////     */
////    @kotlin.internal.InlineOnly
////    public inline fun <T> Array<out T>.elementAt(index: Int): T {
////        return get(index)
////    }
////
/////**
//// * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun ByteArray.elementAt(index: Int): Byte {
////        return get(index)
////    }
////
/////**
//// * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun ShortArray.elementAt(index: Int): Short {
////        return get(index)
////    }
////
/////**
//// * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun IntArray.elementAt(index: Int): Int {
////        return get(index)
////    }
////
/////**
//// * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun LongArray.elementAt(index: Int): Long {
////        return get(index)
////    }
////
/////**
//// * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun FloatArray.elementAt(index: Int): Float {
////        return get(index)
////    }
////
/////**
//// * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun DoubleArray.elementAt(index: Int): Double {
////        return get(index)
////    }
////
/////**
//// * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun BooleanArray.elementAt(index: Int): Boolean {
////        return get(index)
////    }
////
/////**
//// * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun CharArray.elementAt(index: Int): Char {
////        return get(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun <T> Array<out T>.elementAtOrElse(index: Int, defaultValue: (Int) -> T): T {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun ByteArray.elementAtOrElse(index: Int, defaultValue: (Int) -> Byte): Byte {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun ShortArray.elementAtOrElse(index: Int, defaultValue: (Int) -> Short): Short {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun IntArray.elementAtOrElse(index: Int, defaultValue: (Int) -> Int): Int {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun LongArray.elementAtOrElse(index: Int, defaultValue: (Int) -> Long): Long {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun FloatArray.elementAtOrElse(index: Int, defaultValue: (Int) -> Float): Float {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun DoubleArray.elementAtOrElse(index: Int, defaultValue: (Int) -> Double): Double {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun BooleanArray.elementAtOrElse(index: Int, defaultValue: (Int) -> Boolean): Boolean {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun CharArray.elementAtOrElse(index: Int, defaultValue: (Int) -> Char): Char {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun <T> Array<out T>.elementAtOrNull(index: Int): T? {
////        return this.getOrNull(index)
////    }
////
/////**
//// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun ByteArray.elementAtOrNull(index: Int): Byte? {
////        return this.getOrNull(index)
////    }
////
/////**
//// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun ShortArray.elementAtOrNull(index: Int): Short? {
////        return this.getOrNull(index)
////    }
////
/////**
//// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun IntArray.elementAtOrNull(index: Int): Int? {
////        return this.getOrNull(index)
////    }
////
/////**
//// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun LongArray.elementAtOrNull(index: Int): Long? {
////        return this.getOrNull(index)
////    }
////
/////**
//// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun FloatArray.elementAtOrNull(index: Int): Float? {
////        return this.getOrNull(index)
////    }
////
/////**
//// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun DoubleArray.elementAtOrNull(index: Int): Double? {
////        return this.getOrNull(index)
////    }
////
/////**
//// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun BooleanArray.elementAtOrNull(index: Int): Boolean? {
////        return this.getOrNull(index)
////    }
////
/////**
//// * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun CharArray.elementAtOrNull(index: Int): Char? {
////        return this.getOrNull(index)
////    }
////
////
////
////    /**
////     * Returns the first element matching the given [predicate], or `null` if no such element was found.
////     */
////    @kotlin.internal.InlineOnly
////    public inline fun <T> Array<out T>.find(predicate: (T) -> Boolean): T? {
////        return firstOrNull(predicate)
////    }
////
/////**
//// * Returns the first element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun ByteArray.find(predicate: (Byte) -> Boolean): Byte? {
////        return firstOrNull(predicate)
////    }
////
/////**
//// * Returns the first element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun ShortArray.find(predicate: (Short) -> Boolean): Short? {
////        return firstOrNull(predicate)
////    }
////
/////**
//// * Returns the first element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun IntArray.find(predicate: (Int) -> Boolean): Int? {
////        return firstOrNull(predicate)
////    }
////
/////**
//// * Returns the first element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun LongArray.find(predicate: (Long) -> Boolean): Long? {
////        return firstOrNull(predicate)
////    }
////
/////**
//// * Returns the first element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun FloatArray.find(predicate: (Float) -> Boolean): Float? {
////        return firstOrNull(predicate)
////    }
////
/////**
//// * Returns the first element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun DoubleArray.find(predicate: (Double) -> Boolean): Double? {
////        return firstOrNull(predicate)
////    }
////
/////**
//// * Returns the first element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun BooleanArray.find(predicate: (Boolean) -> Boolean): Boolean? {
////        return firstOrNull(predicate)
////    }
////
/////**
//// * Returns the first element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun CharArray.find(predicate: (Char) -> Boolean): Char? {
////        return firstOrNull(predicate)
////    }
////
/////**
//// * Returns the last element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun <T> Array<out T>.findLast(predicate: (T) -> Boolean): T? {
////        return lastOrNull(predicate)
////    }
////
/////**
//// * Returns the last element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun ByteArray.findLast(predicate: (Byte) -> Boolean): Byte? {
////        return lastOrNull(predicate)
////    }
////
/////**
//// * Returns the last element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun ShortArray.findLast(predicate: (Short) -> Boolean): Short? {
////        return lastOrNull(predicate)
////    }
////
/////**
//// * Returns the last element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun IntArray.findLast(predicate: (Int) -> Boolean): Int? {
////        return lastOrNull(predicate)
////    }
////
/////**
//// * Returns the last element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun LongArray.findLast(predicate: (Long) -> Boolean): Long? {
////        return lastOrNull(predicate)
////    }
////
/////**
//// * Returns the last element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun FloatArray.findLast(predicate: (Float) -> Boolean): Float? {
////        return lastOrNull(predicate)
////    }
////
/////**
//// * Returns the last element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun DoubleArray.findLast(predicate: (Double) -> Boolean): Double? {
////        return lastOrNull(predicate)
////    }
////
/////**
//// * Returns the last element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun BooleanArray.findLast(predicate: (Boolean) -> Boolean): Boolean? {
////        return lastOrNull(predicate)
////    }
////
/////**
//// * Returns the last element matching the given [predicate], or `null` if no such element was found.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun CharArray.findLast(predicate: (Char) -> Boolean): Char? {
////        return lastOrNull(predicate)
////    }
////
////    /**
////     * Returns first element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public fun <T> Array<out T>.first(): T {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[0]
////    }
////
////    /**
////     * Returns first element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public fun ByteArray.first(): Byte {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[0]
////    }
////
////    /**
////     * Returns first element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public fun ShortArray.first(): Short {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[0]
////    }
////
////    /**
////     * Returns first element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public fun IntArray.first(): Int {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[0]
////    }
////
////    /**
////     * Returns first element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public fun LongArray.first(): Long {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[0]
////    }
////
////    /**
////     * Returns first element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public fun FloatArray.first(): Float {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[0]
////    }
////
////    /**
////     * Returns first element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public fun DoubleArray.first(): Double {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[0]
////    }
////
////    /**
////     * Returns first element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public fun BooleanArray.first(): Boolean {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[0]
////    }
////
////    /**
////     * Returns first element.
////     * @throws [NoSuchElementException] if the array is empty.
////     */
////    public fun CharArray.first(): Char {
////        if (isEmpty())
////            throw NoSuchElementException("Array is empty.")
////        return this[0]
////    }
////
////    /**
////     * Returns the first element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public inline fun <T> Array<out T>.first(predicate: (T) -> Boolean): T {
////        for (element in this) if (predicate(element)) return element
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns the first element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public inline fun ByteArray.first(predicate: (Byte) -> Boolean): Byte {
////        for (element in this) if (predicate(element)) return element
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns the first element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public inline fun ShortArray.first(predicate: (Short) -> Boolean): Short {
////        for (element in this) if (predicate(element)) return element
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns the first element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public inline fun IntArray.first(predicate: (Int) -> Boolean): Int {
////        for (element in this) if (predicate(element)) return element
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns the first element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public inline fun LongArray.first(predicate: (Long) -> Boolean): Long {
////        for (element in this) if (predicate(element)) return element
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns the first element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public inline fun FloatArray.first(predicate: (Float) -> Boolean): Float {
////        for (element in this) if (predicate(element)) return element
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns the first element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public inline fun DoubleArray.first(predicate: (Double) -> Boolean): Double {
////        for (element in this) if (predicate(element)) return element
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns the first element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public inline fun BooleanArray.first(predicate: (Boolean) -> Boolean): Boolean {
////        for (element in this) if (predicate(element)) return element
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns the first element matching the given [predicate].
////     * @throws [NoSuchElementException] if no such element is found.
////     */
////    public inline fun CharArray.first(predicate: (Char) -> Boolean): Char {
////        for (element in this) if (predicate(element)) return element
////        throw NoSuchElementException("Array contains no element matching the predicate.")
////    }
////
////    /**
////     * Returns the first element, or `null` if the array is empty.
////     */
////    public fun <T> Array<out T>.firstOrNull(): T? {
////        return if (isEmpty()) null else this[0]
////    }
////
////    /**
////     * Returns the first element, or `null` if the array is empty.
////     */
////    public fun ByteArray.firstOrNull(): Byte? {
////        return if (isEmpty()) null else this[0]
////    }
////
////    /**
////     * Returns the first element, or `null` if the array is empty.
////     */
////    public fun ShortArray.firstOrNull(): Short? {
////        return if (isEmpty()) null else this[0]
////    }
////
////    /**
////     * Returns the first element, or `null` if the array is empty.
////     */
////    public fun IntArray.firstOrNull(): Int? {
////        return if (isEmpty()) null else this[0]
////    }
////
////    /**
////     * Returns the first element, or `null` if the array is empty.
////     */
////    public fun LongArray.firstOrNull(): Long? {
////        return if (isEmpty()) null else this[0]
////    }
////
////    /**
////     * Returns the first element, or `null` if the array is empty.
////     */
////    public fun FloatArray.firstOrNull(): Float? {
////        return if (isEmpty()) null else this[0]
////    }
////
////    /**
////     * Returns the first element, or `null` if the array is empty.
////     */
////    public fun DoubleArray.firstOrNull(): Double? {
////        return if (isEmpty()) null else this[0]
////    }
////
////    /**
////     * Returns the first element, or `null` if the array is empty.
////     */
////    public fun BooleanArray.firstOrNull(): Boolean? {
////        return if (isEmpty()) null else this[0]
////    }
////
////    /**
////     * Returns the first element, or `null` if the array is empty.
////     */
////    public fun CharArray.firstOrNull(): Char? {
////        return if (isEmpty()) null else this[0]
////    }
////
////    /**
////     * Returns the first element matching the given [predicate], or `null` if element was not found.
////     */
////    public inline fun <T> Array<out T>.firstOrNull(predicate: (T) -> Boolean): T? {
////        for (element in this) if (predicate(element)) return element
////        return null
////    }
////
////    /**
////     * Returns the first element matching the given [predicate], or `null` if element was not found.
////     */
////    public inline fun ByteArray.firstOrNull(predicate: (Byte) -> Boolean): Byte? {
////        for (element in this) if (predicate(element)) return element
////        return null
////    }
////
////    /**
////     * Returns the first element matching the given [predicate], or `null` if element was not found.
////     */
////    public inline fun ShortArray.firstOrNull(predicate: (Short) -> Boolean): Short? {
////        for (element in this) if (predicate(element)) return element
////        return null
////    }
////
////    /**
////     * Returns the first element matching the given [predicate], or `null` if element was not found.
////     */
////    public inline fun IntArray.firstOrNull(predicate: (Int) -> Boolean): Int? {
////        for (element in this) if (predicate(element)) return element
////        return null
////    }
////
////    /**
////     * Returns the first element matching the given [predicate], or `null` if element was not found.
////     */
////    public inline fun LongArray.firstOrNull(predicate: (Long) -> Boolean): Long? {
////        for (element in this) if (predicate(element)) return element
////        return null
////    }
////
////    /**
////     * Returns the first element matching the given [predicate], or `null` if element was not found.
////     */
////    public inline fun FloatArray.firstOrNull(predicate: (Float) -> Boolean): Float? {
////        for (element in this) if (predicate(element)) return element
////        return null
////    }
////
////    /**
////     * Returns the first element matching the given [predicate], or `null` if element was not found.
////     */
////    public inline fun DoubleArray.firstOrNull(predicate: (Double) -> Boolean): Double? {
////        for (element in this) if (predicate(element)) return element
////        return null
////    }
////
////    /**
////     * Returns the first element matching the given [predicate], or `null` if element was not found.
////     */
////    public inline fun BooleanArray.firstOrNull(predicate: (Boolean) -> Boolean): Boolean? {
////        for (element in this) if (predicate(element)) return element
////        return null
////    }
////
////    /**
////     * Returns the first element matching the given [predicate], or `null` if element was not found.
////     */
////    public inline fun CharArray.firstOrNull(predicate: (Char) -> Boolean): Char? {
////        for (element in this) if (predicate(element)) return element
////        return null
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun <T> Array<out T>.getOrElse(index: Int, defaultValue: (Int) -> T): T {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun ByteArray.getOrElse(index: Int, defaultValue: (Int) -> Byte): Byte {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun ShortArray.getOrElse(index: Int, defaultValue: (Int) -> Short): Short {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun IntArray.getOrElse(index: Int, defaultValue: (Int) -> Int): Int {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun LongArray.getOrElse(index: Int, defaultValue: (Int) -> Long): Long {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun FloatArray.getOrElse(index: Int, defaultValue: (Int) -> Float): Float {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun DoubleArray.getOrElse(index: Int, defaultValue: (Int) -> Double): Double {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun BooleanArray.getOrElse(index: Int, defaultValue: (Int) -> Boolean): Boolean {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
/////**
//// * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this array.
//// */
////    @kotlin.internal.InlineOnly
////    public inline fun CharArray.getOrElse(index: Int, defaultValue: (Int) -> Char): Char {
////        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
////    }
////
////    /**
////     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
////     */
////    public fun <T> Array<out T>.getOrNull(index: Int): T? {
////        return if (index >= 0 && index <= lastIndex) get(index) else null
////    }
////
////    /**
////     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
////     */
////    public fun ByteArray.getOrNull(index: Int): Byte? {
////        return if (index >= 0 && index <= lastIndex) get(index) else null
////    }
////
////    /**
////     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
////     */
////    public fun ShortArray.getOrNull(index: Int): Short? {
////        return if (index >= 0 && index <= lastIndex) get(index) else null
////    }
////
////    /**
////     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
////     */
////    public fun IntArray.getOrNull(index: Int): Int? {
////        return if (index >= 0 && index <= lastIndex) get(index) else null
////    }
////
////    /**
////     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
////     */
////    public fun LongArray.getOrNull(index: Int): Long? {
////        return if (index >= 0 && index <= lastIndex) get(index) else null
////    }
////
////    /**
////     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
////     */
////    public fun FloatArray.getOrNull(index: Int): Float? {
////        return if (index >= 0 && index <= lastIndex) get(index) else null
////    }
////
////    /**
////     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
////     */
////    public fun DoubleArray.getOrNull(index: Int): Double? {
////        return if (index >= 0 && index <= lastIndex) get(index) else null
////    }
////
////    /**
////     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
////     */
////    public fun BooleanArray.getOrNull(index: Int): Boolean? {
////        return if (index >= 0 && index <= lastIndex) get(index) else null
////    }
////
////    /**
////     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this array.
////     */
////    public fun CharArray.getOrNull(index: Int): Char? {
////        return if (index >= 0 && index <= lastIndex) get(index) else null
////    }
////
////    /**
////     * Returns first index of [element], or -1 if the array does not contain element.
////     */
////    public fun <@kotlin.internal.OnlyInputTypes T> Array<out T>.indexOf(element: T): Int {
////        if (element == null) {
////            for (index in indices) {
////                if (this[index] == null) {
////                    return index
////                }
////            }
////        } else {
////            for (index in indices) {
////                if (element == this[index]) {
////                    return index
////                }
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns first index of [element], or -1 if the array does not contain element.
////     */
////    public fun ByteArray.indexOf(element: Byte): Int {
////        for (index in indices) {
////            if (element == this[index]) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns first index of [element], or -1 if the array does not contain element.
////     */
////    public fun ShortArray.indexOf(element: Short): Int {
////        for (index in indices) {
////            if (element == this[index]) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns first index of [element], or -1 if the array does not contain element.
////     */
////    public fun IntArray.indexOf(element: Int): Int {
////        for (index in indices) {
////            if (element == this[index]) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns first index of [element], or -1 if the array does not contain element.
////     */
////    public fun LongArray.indexOf(element: Long): Int {
////        for (index in indices) {
////            if (element == this[index]) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns first index of [element], or -1 if the array does not contain element.
////     */
////    public fun FloatArray.indexOf(element: Float): Int {
////        for (index in indices) {
////            if (element == this[index]) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns first index of [element], or -1 if the array does not contain element.
////     */
////    public fun DoubleArray.indexOf(element: Double): Int {
////        for (index in indices) {
////            if (element == this[index]) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns first index of [element], or -1 if the array does not contain element.
////     */
////    public fun BooleanArray.indexOf(element: Boolean): Int {
////        for (index in indices) {
////            if (element == this[index]) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns first index of [element], or -1 if the array does not contain element.
////     */
////    public fun CharArray.indexOf(element: Char): Int {
////        for (index in indices) {
////            if (element == this[index]) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
////     */
////    public inline fun <T> Array<out T>.indexOfFirst(predicate: (T) -> Boolean): Int {
////        for (index in indices) {
////            if (predicate(this[index])) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
////     */
////    public inline fun ByteArray.indexOfFirst(predicate: (Byte) -> Boolean): Int {
////        for (index in indices) {
////            if (predicate(this[index])) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
////     */
////    public inline fun ShortArray.indexOfFirst(predicate: (Short) -> Boolean): Int {
////        for (index in indices) {
////            if (predicate(this[index])) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
////     */
////    public inline fun IntArray.indexOfFirst(predicate: (Int) -> Boolean): Int {
////        for (index in indices) {
////            if (predicate(this[index])) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
////     */
////    public inline fun LongArray.indexOfFirst(predicate: (Long) -> Boolean): Int {
////        for (index in indices) {
////            if (predicate(this[index])) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
////     */
////    public inline fun FloatArray.indexOfFirst(predicate: (Float) -> Boolean): Int {
////        for (index in indices) {
////            if (predicate(this[index])) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
////     */
////    public inline fun DoubleArray.indexOfFirst(predicate: (Double) -> Boolean): Int {
////        for (index in indices) {
////            if (predicate(this[index])) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
////     */
////    public inline fun BooleanArray.indexOfFirst(predicate: (Boolean) -> Boolean): Int {
////        for (index in indices) {
////            if (predicate(this[index])) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns index of the first element matching the given [predicate], or -1 if the array does not contain such element.
////     */
////    public inline fun CharArray.indexOfFirst(predicate: (Char) -> Boolean): Int {
////        for (index in indices) {
////            if (predicate(this[index])) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
////     */
////    public inline fun <T> Array<out T>.indexOfLast(predicate: (T) -> Boolean): Int {
////        for (index in indices.reversed()) {
////            if (predicate(this[index])) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
////     */
////    public inline fun ByteArray.indexOfLast(predicate: (Byte) -> Boolean): Int {
////        for (index in indices.reversed()) {
////            if (predicate(this[index])) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
////     */
////    public inline fun ShortArray.indexOfLast(predicate: (Short) -> Boolean): Int {
////        for (index in indices.reversed()) {
////            if (predicate(this[index])) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
////     */
////    public inline fun IntArray.indexOfLast(predicate: (Int) -> Boolean): Int {
////        for (index in indices.reversed()) {
////            if (predicate(this[index])) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
////     */
////    public inline fun LongArray.indexOfLast(predicate: (Long) -> Boolean): Int {
////        for (index in indices.reversed()) {
////            if (predicate(this[index])) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
////     */
////    public inline fun FloatArray.indexOfLast(predicate: (Float) -> Boolean): Int {
////        for (index in indices.reversed()) {
////            if (predicate(this[index])) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
////     */
////    public inline fun DoubleArray.indexOfLast(predicate: (Double) -> Boolean): Int {
////        for (index in indices.reversed()) {
////            if (predicate(this[index])) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
////     */
////    public inline fun BooleanArray.indexOfLast(predicate: (Boolean) -> Boolean): Int {
////        for (index in indices.reversed()) {
////            if (predicate(this[index])) {
////                return index
////            }
////        }
////        return -1
////    }
////
////    /**
////     * Returns index of the last element matching the given [predicate], or -1 if the array does not contain such element.
////     */
////    public inline fun CharArray.indexOfLast(predicate: (Char) -> Boolean): Int {
////        for (index in indices.reversed()) {
////            if (predicate(this[index])) {
////                return index
////            }
////        }
////        return -1
////    }
//}
