//package me.panpf.javax.util;
//
//public class Arrayx2 {
//
//
//
//    /**
//     * Groups elements of the original array by the key returned by the given [keySelector] function
//     * applied to each element and returns a map where each group key is associated with a list of corresponding elements.
//     *
//     * The returned map preserves the entry iteration order of the keys produced from the original array.
//     *
//     * @sample samples.collections.Collections.Transformations.groupBy
//     */
//    public inline fun <T, K> Array<out T>.groupBy(keySelector: (T) -> K): Map<K, List<T>> {
//        return groupByTo(LinkedHashMap<K, MutableList<T>>(), keySelector)
//    }
//
//    /**
//     * Groups elements of the original array by the key returned by the given [keySelector] function
//     * applied to each element and returns a map where each group key is associated with a list of corresponding elements.
//     *
//     * The returned map preserves the entry iteration order of the keys produced from the original array.
//     *
//     * @sample samples.collections.Collections.Transformations.groupBy
//     */
//    public inline fun <K> ByteArray.groupBy(keySelector: (Byte) -> K): Map<K, List<Byte>> {
//        return groupByTo(LinkedHashMap<K, MutableList<Byte>>(), keySelector)
//    }
//
//    /**
//     * Groups elements of the original array by the key returned by the given [keySelector] function
//     * applied to each element and returns a map where each group key is associated with a list of corresponding elements.
//     *
//     * The returned map preserves the entry iteration order of the keys produced from the original array.
//     *
//     * @sample samples.collections.Collections.Transformations.groupBy
//     */
//    public inline fun <K> ShortArray.groupBy(keySelector: (Short) -> K): Map<K, List<Short>> {
//        return groupByTo(LinkedHashMap<K, MutableList<Short>>(), keySelector)
//    }
//
//    /**
//     * Groups elements of the original array by the key returned by the given [keySelector] function
//     * applied to each element and returns a map where each group key is associated with a list of corresponding elements.
//     *
//     * The returned map preserves the entry iteration order of the keys produced from the original array.
//     *
//     * @sample samples.collections.Collections.Transformations.groupBy
//     */
//    public inline fun <K> IntArray.groupBy(keySelector: (Int) -> K): Map<K, List<Int>> {
//        return groupByTo(LinkedHashMap<K, MutableList<Int>>(), keySelector)
//    }
//
//    /**
//     * Groups elements of the original array by the key returned by the given [keySelector] function
//     * applied to each element and returns a map where each group key is associated with a list of corresponding elements.
//     *
//     * The returned map preserves the entry iteration order of the keys produced from the original array.
//     *
//     * @sample samples.collections.Collections.Transformations.groupBy
//     */
//    public inline fun <K> LongArray.groupBy(keySelector: (Long) -> K): Map<K, List<Long>> {
//        return groupByTo(LinkedHashMap<K, MutableList<Long>>(), keySelector)
//    }
//
//    /**
//     * Groups elements of the original array by the key returned by the given [keySelector] function
//     * applied to each element and returns a map where each group key is associated with a list of corresponding elements.
//     *
//     * The returned map preserves the entry iteration order of the keys produced from the original array.
//     *
//     * @sample samples.collections.Collections.Transformations.groupBy
//     */
//    public inline fun <K> FloatArray.groupBy(keySelector: (Float) -> K): Map<K, List<Float>> {
//        return groupByTo(LinkedHashMap<K, MutableList<Float>>(), keySelector)
//    }
//
//    /**
//     * Groups elements of the original array by the key returned by the given [keySelector] function
//     * applied to each element and returns a map where each group key is associated with a list of corresponding elements.
//     *
//     * The returned map preserves the entry iteration order of the keys produced from the original array.
//     *
//     * @sample samples.collections.Collections.Transformations.groupBy
//     */
//    public inline fun <K> DoubleArray.groupBy(keySelector: (Double) -> K): Map<K, List<Double>> {
//        return groupByTo(LinkedHashMap<K, MutableList<Double>>(), keySelector)
//    }
//
//    /**
//     * Groups elements of the original array by the key returned by the given [keySelector] function
//     * applied to each element and returns a map where each group key is associated with a list of corresponding elements.
//     *
//     * The returned map preserves the entry iteration order of the keys produced from the original array.
//     *
//     * @sample samples.collections.Collections.Transformations.groupBy
//     */
//    public inline fun <K> BooleanArray.groupBy(keySelector: (Boolean) -> K): Map<K, List<Boolean>> {
//        return groupByTo(LinkedHashMap<K, MutableList<Boolean>>(), keySelector)
//    }
//
//    /**
//     * Groups elements of the original array by the key returned by the given [keySelector] function
//     * applied to each element and returns a map where each group key is associated with a list of corresponding elements.
//     *
//     * The returned map preserves the entry iteration order of the keys produced from the original array.
//     *
//     * @sample samples.collections.Collections.Transformations.groupBy
//     */
//    public inline fun <K> CharArray.groupBy(keySelector: (Char) -> K): Map<K, List<Char>> {
//        return groupByTo(LinkedHashMap<K, MutableList<Char>>(), keySelector)
//    }
//
//    /**
//     * Groups values returned by the [valueTransform] function applied to each element of the original array
//     * by the key returned by the given [keySelector] function applied to the element
//     * and returns a map where each group key is associated with a list of corresponding values.
//     *
//     * The returned map preserves the entry iteration order of the keys produced from the original array.
//     *
//     * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
//     */
//    public inline fun <T, K, V> Array<out T>.groupBy(keySelector: (T) -> K, valueTransform: (T) -> V): Map<K, List<V>> {
//        return groupByTo(LinkedHashMap<K, MutableList<V>>(), keySelector, valueTransform)
//    }
//
//    /**
//     * Groups values returned by the [valueTransform] function applied to each element of the original array
//     * by the key returned by the given [keySelector] function applied to the element
//     * and returns a map where each group key is associated with a list of corresponding values.
//     *
//     * The returned map preserves the entry iteration order of the keys produced from the original array.
//     *
//     * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
//     */
//    public inline fun <K, V> ByteArray.groupBy(keySelector: (Byte) -> K, valueTransform: (Byte) -> V): Map<K, List<V>> {
//        return groupByTo(LinkedHashMap<K, MutableList<V>>(), keySelector, valueTransform)
//    }
//
//    /**
//     * Groups values returned by the [valueTransform] function applied to each element of the original array
//     * by the key returned by the given [keySelector] function applied to the element
//     * and returns a map where each group key is associated with a list of corresponding values.
//     *
//     * The returned map preserves the entry iteration order of the keys produced from the original array.
//     *
//     * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
//     */
//    public inline fun <K, V> ShortArray.groupBy(keySelector: (Short) -> K, valueTransform: (Short) -> V): Map<K, List<V>> {
//        return groupByTo(LinkedHashMap<K, MutableList<V>>(), keySelector, valueTransform)
//    }
//
//    /**
//     * Groups values returned by the [valueTransform] function applied to each element of the original array
//     * by the key returned by the given [keySelector] function applied to the element
//     * and returns a map where each group key is associated with a list of corresponding values.
//     *
//     * The returned map preserves the entry iteration order of the keys produced from the original array.
//     *
//     * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
//     */
//    public inline fun <K, V> IntArray.groupBy(keySelector: (Int) -> K, valueTransform: (Int) -> V): Map<K, List<V>> {
//        return groupByTo(LinkedHashMap<K, MutableList<V>>(), keySelector, valueTransform)
//    }
//
//    /**
//     * Groups values returned by the [valueTransform] function applied to each element of the original array
//     * by the key returned by the given [keySelector] function applied to the element
//     * and returns a map where each group key is associated with a list of corresponding values.
//     *
//     * The returned map preserves the entry iteration order of the keys produced from the original array.
//     *
//     * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
//     */
//    public inline fun <K, V> LongArray.groupBy(keySelector: (Long) -> K, valueTransform: (Long) -> V): Map<K, List<V>> {
//        return groupByTo(LinkedHashMap<K, MutableList<V>>(), keySelector, valueTransform)
//    }
//
//    /**
//     * Groups values returned by the [valueTransform] function applied to each element of the original array
//     * by the key returned by the given [keySelector] function applied to the element
//     * and returns a map where each group key is associated with a list of corresponding values.
//     *
//     * The returned map preserves the entry iteration order of the keys produced from the original array.
//     *
//     * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
//     */
//    public inline fun <K, V> FloatArray.groupBy(keySelector: (Float) -> K, valueTransform: (Float) -> V): Map<K, List<V>> {
//        return groupByTo(LinkedHashMap<K, MutableList<V>>(), keySelector, valueTransform)
//    }
//
//    /**
//     * Groups values returned by the [valueTransform] function applied to each element of the original array
//     * by the key returned by the given [keySelector] function applied to the element
//     * and returns a map where each group key is associated with a list of corresponding values.
//     *
//     * The returned map preserves the entry iteration order of the keys produced from the original array.
//     *
//     * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
//     */
//    public inline fun <K, V> DoubleArray.groupBy(keySelector: (Double) -> K, valueTransform: (Double) -> V): Map<K, List<V>> {
//        return groupByTo(LinkedHashMap<K, MutableList<V>>(), keySelector, valueTransform)
//    }
//
//    /**
//     * Groups values returned by the [valueTransform] function applied to each element of the original array
//     * by the key returned by the given [keySelector] function applied to the element
//     * and returns a map where each group key is associated with a list of corresponding values.
//     *
//     * The returned map preserves the entry iteration order of the keys produced from the original array.
//     *
//     * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
//     */
//    public inline fun <K, V> BooleanArray.groupBy(keySelector: (Boolean) -> K, valueTransform: (Boolean) -> V): Map<K, List<V>> {
//        return groupByTo(LinkedHashMap<K, MutableList<V>>(), keySelector, valueTransform)
//    }
//
//    /**
//     * Groups values returned by the [valueTransform] function applied to each element of the original array
//     * by the key returned by the given [keySelector] function applied to the element
//     * and returns a map where each group key is associated with a list of corresponding values.
//     *
//     * The returned map preserves the entry iteration order of the keys produced from the original array.
//     *
//     * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
//     */
//    public inline fun <K, V> CharArray.groupBy(keySelector: (Char) -> K, valueTransform: (Char) -> V): Map<K, List<V>> {
//        return groupByTo(LinkedHashMap<K, MutableList<V>>(), keySelector, valueTransform)
//    }
//
//    /**
//     * Groups elements of the original array by the key returned by the given [keySelector] function
//     * applied to each element and puts to the [destination] map each group key associated with a list of corresponding elements.
//     *
//     * @return The [destination] map.
//     *
//     * @sample samples.collections.Collections.Transformations.groupBy
//     */
//    public inline fun <T, K, M : MutableMap<in K, MutableList<T>>> Array<out T>.groupByTo(destination: M, keySelector: (T) -> K): M {
//        for (element in this) {
//            val key = keySelector(element)
//            val list = destination.getOrPut(key) { ArrayList<T>() }
//            list.add(element)
//        }
//        return destination
//    }
//
//    /**
//     * Groups elements of the original array by the key returned by the given [keySelector] function
//     * applied to each element and puts to the [destination] map each group key associated with a list of corresponding elements.
//     *
//     * @return The [destination] map.
//     *
//     * @sample samples.collections.Collections.Transformations.groupBy
//     */
//    public inline fun <K, M : MutableMap<in K, MutableList<Byte>>> ByteArray.groupByTo(destination: M, keySelector: (Byte) -> K): M {
//        for (element in this) {
//            val key = keySelector(element)
//            val list = destination.getOrPut(key) { ArrayList<Byte>() }
//            list.add(element)
//        }
//        return destination
//    }
//
//    /**
//     * Groups elements of the original array by the key returned by the given [keySelector] function
//     * applied to each element and puts to the [destination] map each group key associated with a list of corresponding elements.
//     *
//     * @return The [destination] map.
//     *
//     * @sample samples.collections.Collections.Transformations.groupBy
//     */
//    public inline fun <K, M : MutableMap<in K, MutableList<Short>>> ShortArray.groupByTo(destination: M, keySelector: (Short) -> K): M {
//        for (element in this) {
//            val key = keySelector(element)
//            val list = destination.getOrPut(key) { ArrayList<Short>() }
//            list.add(element)
//        }
//        return destination
//    }
//
//    /**
//     * Groups elements of the original array by the key returned by the given [keySelector] function
//     * applied to each element and puts to the [destination] map each group key associated with a list of corresponding elements.
//     *
//     * @return The [destination] map.
//     *
//     * @sample samples.collections.Collections.Transformations.groupBy
//     */
//    public inline fun <K, M : MutableMap<in K, MutableList<Int>>> IntArray.groupByTo(destination: M, keySelector: (Int) -> K): M {
//        for (element in this) {
//            val key = keySelector(element)
//            val list = destination.getOrPut(key) { ArrayList<Int>() }
//            list.add(element)
//        }
//        return destination
//    }
//
//    /**
//     * Groups elements of the original array by the key returned by the given [keySelector] function
//     * applied to each element and puts to the [destination] map each group key associated with a list of corresponding elements.
//     *
//     * @return The [destination] map.
//     *
//     * @sample samples.collections.Collections.Transformations.groupBy
//     */
//    public inline fun <K, M : MutableMap<in K, MutableList<Long>>> LongArray.groupByTo(destination: M, keySelector: (Long) -> K): M {
//        for (element in this) {
//            val key = keySelector(element)
//            val list = destination.getOrPut(key) { ArrayList<Long>() }
//            list.add(element)
//        }
//        return destination
//    }
//
//    /**
//     * Groups elements of the original array by the key returned by the given [keySelector] function
//     * applied to each element and puts to the [destination] map each group key associated with a list of corresponding elements.
//     *
//     * @return The [destination] map.
//     *
//     * @sample samples.collections.Collections.Transformations.groupBy
//     */
//    public inline fun <K, M : MutableMap<in K, MutableList<Float>>> FloatArray.groupByTo(destination: M, keySelector: (Float) -> K): M {
//        for (element in this) {
//            val key = keySelector(element)
//            val list = destination.getOrPut(key) { ArrayList<Float>() }
//            list.add(element)
//        }
//        return destination
//    }
//
//    /**
//     * Groups elements of the original array by the key returned by the given [keySelector] function
//     * applied to each element and puts to the [destination] map each group key associated with a list of corresponding elements.
//     *
//     * @return The [destination] map.
//     *
//     * @sample samples.collections.Collections.Transformations.groupBy
//     */
//    public inline fun <K, M : MutableMap<in K, MutableList<Double>>> DoubleArray.groupByTo(destination: M, keySelector: (Double) -> K): M {
//        for (element in this) {
//            val key = keySelector(element)
//            val list = destination.getOrPut(key) { ArrayList<Double>() }
//            list.add(element)
//        }
//        return destination
//    }
//
//    /**
//     * Groups elements of the original array by the key returned by the given [keySelector] function
//     * applied to each element and puts to the [destination] map each group key associated with a list of corresponding elements.
//     *
//     * @return The [destination] map.
//     *
//     * @sample samples.collections.Collections.Transformations.groupBy
//     */
//    public inline fun <K, M : MutableMap<in K, MutableList<Boolean>>> BooleanArray.groupByTo(destination: M, keySelector: (Boolean) -> K): M {
//        for (element in this) {
//            val key = keySelector(element)
//            val list = destination.getOrPut(key) { ArrayList<Boolean>() }
//            list.add(element)
//        }
//        return destination
//    }
//
//    /**
//     * Groups elements of the original array by the key returned by the given [keySelector] function
//     * applied to each element and puts to the [destination] map each group key associated with a list of corresponding elements.
//     *
//     * @return The [destination] map.
//     *
//     * @sample samples.collections.Collections.Transformations.groupBy
//     */
//    public inline fun <K, M : MutableMap<in K, MutableList<Char>>> CharArray.groupByTo(destination: M, keySelector: (Char) -> K): M {
//        for (element in this) {
//            val key = keySelector(element)
//            val list = destination.getOrPut(key) { ArrayList<Char>() }
//            list.add(element)
//        }
//        return destination
//    }
//
//    /**
//     * Groups values returned by the [valueTransform] function applied to each element of the original array
//     * by the key returned by the given [keySelector] function applied to the element
//     * and puts to the [destination] map each group key associated with a list of corresponding values.
//     *
//     * @return The [destination] map.
//     *
//     * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
//     */
//    public inline fun <T, K, V, M : MutableMap<in K, MutableList<V>>> Array<out T>.groupByTo(destination: M, keySelector: (T) -> K, valueTransform: (T) -> V): M {
//        for (element in this) {
//            val key = keySelector(element)
//            val list = destination.getOrPut(key) { ArrayList<V>() }
//            list.add(valueTransform(element))
//        }
//        return destination
//    }
//
//    /**
//     * Groups values returned by the [valueTransform] function applied to each element of the original array
//     * by the key returned by the given [keySelector] function applied to the element
//     * and puts to the [destination] map each group key associated with a list of corresponding values.
//     *
//     * @return The [destination] map.
//     *
//     * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
//     */
//    public inline fun <K, V, M : MutableMap<in K, MutableList<V>>> ByteArray.groupByTo(destination: M, keySelector: (Byte) -> K, valueTransform: (Byte) -> V): M {
//        for (element in this) {
//            val key = keySelector(element)
//            val list = destination.getOrPut(key) { ArrayList<V>() }
//            list.add(valueTransform(element))
//        }
//        return destination
//    }
//
//    /**
//     * Groups values returned by the [valueTransform] function applied to each element of the original array
//     * by the key returned by the given [keySelector] function applied to the element
//     * and puts to the [destination] map each group key associated with a list of corresponding values.
//     *
//     * @return The [destination] map.
//     *
//     * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
//     */
//    public inline fun <K, V, M : MutableMap<in K, MutableList<V>>> ShortArray.groupByTo(destination: M, keySelector: (Short) -> K, valueTransform: (Short) -> V): M {
//        for (element in this) {
//            val key = keySelector(element)
//            val list = destination.getOrPut(key) { ArrayList<V>() }
//            list.add(valueTransform(element))
//        }
//        return destination
//    }
//
//    /**
//     * Groups values returned by the [valueTransform] function applied to each element of the original array
//     * by the key returned by the given [keySelector] function applied to the element
//     * and puts to the [destination] map each group key associated with a list of corresponding values.
//     *
//     * @return The [destination] map.
//     *
//     * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
//     */
//    public inline fun <K, V, M : MutableMap<in K, MutableList<V>>> IntArray.groupByTo(destination: M, keySelector: (Int) -> K, valueTransform: (Int) -> V): M {
//        for (element in this) {
//            val key = keySelector(element)
//            val list = destination.getOrPut(key) { ArrayList<V>() }
//            list.add(valueTransform(element))
//        }
//        return destination
//    }
//
//    /**
//     * Groups values returned by the [valueTransform] function applied to each element of the original array
//     * by the key returned by the given [keySelector] function applied to the element
//     * and puts to the [destination] map each group key associated with a list of corresponding values.
//     *
//     * @return The [destination] map.
//     *
//     * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
//     */
//    public inline fun <K, V, M : MutableMap<in K, MutableList<V>>> LongArray.groupByTo(destination: M, keySelector: (Long) -> K, valueTransform: (Long) -> V): M {
//        for (element in this) {
//            val key = keySelector(element)
//            val list = destination.getOrPut(key) { ArrayList<V>() }
//            list.add(valueTransform(element))
//        }
//        return destination
//    }
//
//    /**
//     * Groups values returned by the [valueTransform] function applied to each element of the original array
//     * by the key returned by the given [keySelector] function applied to the element
//     * and puts to the [destination] map each group key associated with a list of corresponding values.
//     *
//     * @return The [destination] map.
//     *
//     * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
//     */
//    public inline fun <K, V, M : MutableMap<in K, MutableList<V>>> FloatArray.groupByTo(destination: M, keySelector: (Float) -> K, valueTransform: (Float) -> V): M {
//        for (element in this) {
//            val key = keySelector(element)
//            val list = destination.getOrPut(key) { ArrayList<V>() }
//            list.add(valueTransform(element))
//        }
//        return destination
//    }
//
//    /**
//     * Groups values returned by the [valueTransform] function applied to each element of the original array
//     * by the key returned by the given [keySelector] function applied to the element
//     * and puts to the [destination] map each group key associated with a list of corresponding values.
//     *
//     * @return The [destination] map.
//     *
//     * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
//     */
//    public inline fun <K, V, M : MutableMap<in K, MutableList<V>>> DoubleArray.groupByTo(destination: M, keySelector: (Double) -> K, valueTransform: (Double) -> V): M {
//        for (element in this) {
//            val key = keySelector(element)
//            val list = destination.getOrPut(key) { ArrayList<V>() }
//            list.add(valueTransform(element))
//        }
//        return destination
//    }
//
//    /**
//     * Groups values returned by the [valueTransform] function applied to each element of the original array
//     * by the key returned by the given [keySelector] function applied to the element
//     * and puts to the [destination] map each group key associated with a list of corresponding values.
//     *
//     * @return The [destination] map.
//     *
//     * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
//     */
//    public inline fun <K, V, M : MutableMap<in K, MutableList<V>>> BooleanArray.groupByTo(destination: M, keySelector: (Boolean) -> K, valueTransform: (Boolean) -> V): M {
//        for (element in this) {
//            val key = keySelector(element)
//            val list = destination.getOrPut(key) { ArrayList<V>() }
//            list.add(valueTransform(element))
//        }
//        return destination
//    }
//
//    /**
//     * Groups values returned by the [valueTransform] function applied to each element of the original array
//     * by the key returned by the given [keySelector] function applied to the element
//     * and puts to the [destination] map each group key associated with a list of corresponding values.
//     *
//     * @return The [destination] map.
//     *
//     * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
//     */
//    public inline fun <K, V, M : MutableMap<in K, MutableList<V>>> CharArray.groupByTo(destination: M, keySelector: (Char) -> K, valueTransform: (Char) -> V): M {
//        for (element in this) {
//            val key = keySelector(element)
//            val list = destination.getOrPut(key) { ArrayList<V>() }
//            list.add(valueTransform(element))
//        }
//        return destination
//    }
//
///**
// * Creates a [Grouping] source from an array to be used later with one of group-and-fold operations
// * using the specified [keySelector] function to extract a key from each element.
// *
// * @sample samples.collections.Collections.Transformations.groupingByEachCount
// */
//    @SinceKotlin("1.1")
//    public inline fun <T, K> Array<out T>.groupingBy(crossinline keySelector: (T) -> K): Grouping<T, K> {
//        return object : Grouping<T, K> {
//            override fun sourceIterator(): Iterator<T> = this@groupingBy.iterator()
//            override fun keyOf(element: T): K = keySelector(element)
//        }
//    }
//
//    /**
//     * Returns a list containing the results of applying the given [transform] function
//     * to each element in the original array.
//     */
//    public inline fun <T, R> Array<out T>.map(transform: (T) -> R): List<R> {
//        return mapTo(ArrayList<R>(size), transform)
//    }
//
//    /**
//     * Returns a list containing the results of applying the given [transform] function
//     * to each element in the original array.
//     */
//    public inline fun <R> ByteArray.map(transform: (Byte) -> R): List<R> {
//        return mapTo(ArrayList<R>(size), transform)
//    }
//
//    /**
//     * Returns a list containing the results of applying the given [transform] function
//     * to each element in the original array.
//     */
//    public inline fun <R> ShortArray.map(transform: (Short) -> R): List<R> {
//        return mapTo(ArrayList<R>(size), transform)
//    }
//
//    /**
//     * Returns a list containing the results of applying the given [transform] function
//     * to each element in the original array.
//     */
//    public inline fun <R> IntArray.map(transform: (Int) -> R): List<R> {
//        return mapTo(ArrayList<R>(size), transform)
//    }
//
//    /**
//     * Returns a list containing the results of applying the given [transform] function
//     * to each element in the original array.
//     */
//    public inline fun <R> LongArray.map(transform: (Long) -> R): List<R> {
//        return mapTo(ArrayList<R>(size), transform)
//    }
//
//    /**
//     * Returns a list containing the results of applying the given [transform] function
//     * to each element in the original array.
//     */
//    public inline fun <R> FloatArray.map(transform: (Float) -> R): List<R> {
//        return mapTo(ArrayList<R>(size), transform)
//    }
//
//    /**
//     * Returns a list containing the results of applying the given [transform] function
//     * to each element in the original array.
//     */
//    public inline fun <R> DoubleArray.map(transform: (Double) -> R): List<R> {
//        return mapTo(ArrayList<R>(size), transform)
//    }
//
//    /**
//     * Returns a list containing the results of applying the given [transform] function
//     * to each element in the original array.
//     */
//    public inline fun <R> BooleanArray.map(transform: (Boolean) -> R): List<R> {
//        return mapTo(ArrayList<R>(size), transform)
//    }
//
//    /**
//     * Returns a list containing the results of applying the given [transform] function
//     * to each element in the original array.
//     */
//    public inline fun <R> CharArray.map(transform: (Char) -> R): List<R> {
//        return mapTo(ArrayList<R>(size), transform)
//    }
//
//    /**
//     * Returns a list containing the results of applying the given [transform] function
//     * to each element and its index in the original array.
//     * @param [transform] function that takes the index of an element and the element itself
//     * and returns the result of the transform applied to the element.
//     */
//    public inline fun <T, R> Array<out T>.mapIndexed(transform: (index: Int, T) -> R): List<R> {
//        return mapIndexedTo(ArrayList<R>(size), transform)
//    }
//
//    /**
//     * Returns a list containing the results of applying the given [transform] function
//     * to each element and its index in the original array.
//     * @param [transform] function that takes the index of an element and the element itself
//     * and returns the result of the transform applied to the element.
//     */
//    public inline fun <R> ByteArray.mapIndexed(transform: (index: Int, Byte) -> R): List<R> {
//        return mapIndexedTo(ArrayList<R>(size), transform)
//    }
//
//    /**
//     * Returns a list containing the results of applying the given [transform] function
//     * to each element and its index in the original array.
//     * @param [transform] function that takes the index of an element and the element itself
//     * and returns the result of the transform applied to the element.
//     */
//    public inline fun <R> ShortArray.mapIndexed(transform: (index: Int, Short) -> R): List<R> {
//        return mapIndexedTo(ArrayList<R>(size), transform)
//    }
//
//    /**
//     * Returns a list containing the results of applying the given [transform] function
//     * to each element and its index in the original array.
//     * @param [transform] function that takes the index of an element and the element itself
//     * and returns the result of the transform applied to the element.
//     */
//    public inline fun <R> IntArray.mapIndexed(transform: (index: Int, Int) -> R): List<R> {
//        return mapIndexedTo(ArrayList<R>(size), transform)
//    }
//
//    /**
//     * Returns a list containing the results of applying the given [transform] function
//     * to each element and its index in the original array.
//     * @param [transform] function that takes the index of an element and the element itself
//     * and returns the result of the transform applied to the element.
//     */
//    public inline fun <R> LongArray.mapIndexed(transform: (index: Int, Long) -> R): List<R> {
//        return mapIndexedTo(ArrayList<R>(size), transform)
//    }
//
//    /**
//     * Returns a list containing the results of applying the given [transform] function
//     * to each element and its index in the original array.
//     * @param [transform] function that takes the index of an element and the element itself
//     * and returns the result of the transform applied to the element.
//     */
//    public inline fun <R> FloatArray.mapIndexed(transform: (index: Int, Float) -> R): List<R> {
//        return mapIndexedTo(ArrayList<R>(size), transform)
//    }
//
//    /**
//     * Returns a list containing the results of applying the given [transform] function
//     * to each element and its index in the original array.
//     * @param [transform] function that takes the index of an element and the element itself
//     * and returns the result of the transform applied to the element.
//     */
//    public inline fun <R> DoubleArray.mapIndexed(transform: (index: Int, Double) -> R): List<R> {
//        return mapIndexedTo(ArrayList<R>(size), transform)
//    }
//
//    /**
//     * Returns a list containing the results of applying the given [transform] function
//     * to each element and its index in the original array.
//     * @param [transform] function that takes the index of an element and the element itself
//     * and returns the result of the transform applied to the element.
//     */
//    public inline fun <R> BooleanArray.mapIndexed(transform: (index: Int, Boolean) -> R): List<R> {
//        return mapIndexedTo(ArrayList<R>(size), transform)
//    }
//
//    /**
//     * Returns a list containing the results of applying the given [transform] function
//     * to each element and its index in the original array.
//     * @param [transform] function that takes the index of an element and the element itself
//     * and returns the result of the transform applied to the element.
//     */
//    public inline fun <R> CharArray.mapIndexed(transform: (index: Int, Char) -> R): List<R> {
//        return mapIndexedTo(ArrayList<R>(size), transform)
//    }
//
//    /**
//     * Returns a list containing only the non-null results of applying the given [transform] function
//     * to each element and its index in the original array.
//     * @param [transform] function that takes the index of an element and the element itself
//     * and returns the result of the transform applied to the element.
//     */
//    public inline fun <T, R : Any> Array<out T>.mapIndexedNotNull(transform: (index: Int, T) -> R?): List<R> {
//        return mapIndexedNotNullTo(ArrayList<R>(), transform)
//    }
//
//    /**
//     * Applies the given [transform] function to each element and its index in the original array
//     * and appends only the non-null results to the given [destination].
//     * @param [transform] function that takes the index of an element and the element itself
//     * and returns the result of the transform applied to the element.
//     */
//    public inline fun <T, R : Any, C : MutableCollection<in R>> Array<out T>.mapIndexedNotNullTo(destination: C, transform: (index: Int, T) -> R?): C {
//        forEachIndexed { index, element -> transform(index, element)?.let { destination.add(it) } }
//        return destination
//    }
//
//    /**
//     * Applies the given [transform] function to each element and its index in the original array
//     * and appends the results to the given [destination].
//     * @param [transform] function that takes the index of an element and the element itself
//     * and returns the result of the transform applied to the element.
//     */
//    public inline fun <T, R, C : MutableCollection<in R>> Array<out T>.mapIndexedTo(destination: C, transform: (index: Int, T) -> R): C {
//        var index = 0
//        for (item in this)
//            destination.add(transform(index++, item))
//        return destination
//    }
//
//    /**
//     * Applies the given [transform] function to each element and its index in the original array
//     * and appends the results to the given [destination].
//     * @param [transform] function that takes the index of an element and the element itself
//     * and returns the result of the transform applied to the element.
//     */
//    public inline fun <R, C : MutableCollection<in R>> ByteArray.mapIndexedTo(destination: C, transform: (index: Int, Byte) -> R): C {
//        var index = 0
//        for (item in this)
//            destination.add(transform(index++, item))
//        return destination
//    }
//
//    /**
//     * Applies the given [transform] function to each element and its index in the original array
//     * and appends the results to the given [destination].
//     * @param [transform] function that takes the index of an element and the element itself
//     * and returns the result of the transform applied to the element.
//     */
//    public inline fun <R, C : MutableCollection<in R>> ShortArray.mapIndexedTo(destination: C, transform: (index: Int, Short) -> R): C {
//        var index = 0
//        for (item in this)
//            destination.add(transform(index++, item))
//        return destination
//    }
//
//    /**
//     * Applies the given [transform] function to each element and its index in the original array
//     * and appends the results to the given [destination].
//     * @param [transform] function that takes the index of an element and the element itself
//     * and returns the result of the transform applied to the element.
//     */
//    public inline fun <R, C : MutableCollection<in R>> IntArray.mapIndexedTo(destination: C, transform: (index: Int, Int) -> R): C {
//        var index = 0
//        for (item in this)
//            destination.add(transform(index++, item))
//        return destination
//    }
//
//    /**
//     * Applies the given [transform] function to each element and its index in the original array
//     * and appends the results to the given [destination].
//     * @param [transform] function that takes the index of an element and the element itself
//     * and returns the result of the transform applied to the element.
//     */
//    public inline fun <R, C : MutableCollection<in R>> LongArray.mapIndexedTo(destination: C, transform: (index: Int, Long) -> R): C {
//        var index = 0
//        for (item in this)
//            destination.add(transform(index++, item))
//        return destination
//    }
//
//    /**
//     * Applies the given [transform] function to each element and its index in the original array
//     * and appends the results to the given [destination].
//     * @param [transform] function that takes the index of an element and the element itself
//     * and returns the result of the transform applied to the element.
//     */
//    public inline fun <R, C : MutableCollection<in R>> FloatArray.mapIndexedTo(destination: C, transform: (index: Int, Float) -> R): C {
//        var index = 0
//        for (item in this)
//            destination.add(transform(index++, item))
//        return destination
//    }
//
//    /**
//     * Applies the given [transform] function to each element and its index in the original array
//     * and appends the results to the given [destination].
//     * @param [transform] function that takes the index of an element and the element itself
//     * and returns the result of the transform applied to the element.
//     */
//    public inline fun <R, C : MutableCollection<in R>> DoubleArray.mapIndexedTo(destination: C, transform: (index: Int, Double) -> R): C {
//        var index = 0
//        for (item in this)
//            destination.add(transform(index++, item))
//        return destination
//    }
//
//    /**
//     * Applies the given [transform] function to each element and its index in the original array
//     * and appends the results to the given [destination].
//     * @param [transform] function that takes the index of an element and the element itself
//     * and returns the result of the transform applied to the element.
//     */
//    public inline fun <R, C : MutableCollection<in R>> BooleanArray.mapIndexedTo(destination: C, transform: (index: Int, Boolean) -> R): C {
//        var index = 0
//        for (item in this)
//            destination.add(transform(index++, item))
//        return destination
//    }
//
//    /**
//     * Applies the given [transform] function to each element and its index in the original array
//     * and appends the results to the given [destination].
//     * @param [transform] function that takes the index of an element and the element itself
//     * and returns the result of the transform applied to the element.
//     */
//    public inline fun <R, C : MutableCollection<in R>> CharArray.mapIndexedTo(destination: C, transform: (index: Int, Char) -> R): C {
//        var index = 0
//        for (item in this)
//            destination.add(transform(index++, item))
//        return destination
//    }
//
//    /**
//     * Returns a list containing only the non-null results of applying the given [transform] function
//     * to each element in the original array.
//     */
//    public inline fun <T, R : Any> Array<out T>.mapNotNull(transform: (T) -> R?): List<R> {
//        return mapNotNullTo(ArrayList<R>(), transform)
//    }
//
//    /**
//     * Applies the given [transform] function to each element in the original array
//     * and appends only the non-null results to the given [destination].
//     */
//    public inline fun <T, R : Any, C : MutableCollection<in R>> Array<out T>.mapNotNullTo(destination: C, transform: (T) -> R?): C {
//        forEach { element -> transform(element)?.let { destination.add(it) } }
//        return destination
//    }
//
//    /**
//     * Applies the given [transform] function to each element of the original array
//     * and appends the results to the given [destination].
//     */
//    public inline fun <T, R, C : MutableCollection<in R>> Array<out T>.mapTo(destination: C, transform: (T) -> R): C {
//        for (item in this)
//            destination.add(transform(item))
//        return destination
//    }
//
//    /**
//     * Applies the given [transform] function to each element of the original array
//     * and appends the results to the given [destination].
//     */
//    public inline fun <R, C : MutableCollection<in R>> ByteArray.mapTo(destination: C, transform: (Byte) -> R): C {
//        for (item in this)
//            destination.add(transform(item))
//        return destination
//    }
//
//    /**
//     * Applies the given [transform] function to each element of the original array
//     * and appends the results to the given [destination].
//     */
//    public inline fun <R, C : MutableCollection<in R>> ShortArray.mapTo(destination: C, transform: (Short) -> R): C {
//        for (item in this)
//            destination.add(transform(item))
//        return destination
//    }
//
//    /**
//     * Applies the given [transform] function to each element of the original array
//     * and appends the results to the given [destination].
//     */
//    public inline fun <R, C : MutableCollection<in R>> IntArray.mapTo(destination: C, transform: (Int) -> R): C {
//        for (item in this)
//            destination.add(transform(item))
//        return destination
//    }
//
//    /**
//     * Applies the given [transform] function to each element of the original array
//     * and appends the results to the given [destination].
//     */
//    public inline fun <R, C : MutableCollection<in R>> LongArray.mapTo(destination: C, transform: (Long) -> R): C {
//        for (item in this)
//            destination.add(transform(item))
//        return destination
//    }
//
//    /**
//     * Applies the given [transform] function to each element of the original array
//     * and appends the results to the given [destination].
//     */
//    public inline fun <R, C : MutableCollection<in R>> FloatArray.mapTo(destination: C, transform: (Float) -> R): C {
//        for (item in this)
//            destination.add(transform(item))
//        return destination
//    }
//
//    /**
//     * Applies the given [transform] function to each element of the original array
//     * and appends the results to the given [destination].
//     */
//    public inline fun <R, C : MutableCollection<in R>> DoubleArray.mapTo(destination: C, transform: (Double) -> R): C {
//        for (item in this)
//            destination.add(transform(item))
//        return destination
//    }
//
//    /**
//     * Applies the given [transform] function to each element of the original array
//     * and appends the results to the given [destination].
//     */
//    public inline fun <R, C : MutableCollection<in R>> BooleanArray.mapTo(destination: C, transform: (Boolean) -> R): C {
//        for (item in this)
//            destination.add(transform(item))
//        return destination
//    }
//
//    /**
//     * Applies the given [transform] function to each element of the original array
//     * and appends the results to the given [destination].
//     */
//    public inline fun <R, C : MutableCollection<in R>> CharArray.mapTo(destination: C, transform: (Char) -> R): C {
//        for (item in this)
//            destination.add(transform(item))
//        return destination
//    }
//
//
//
//    /**
//     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
//     */
//    public fun <T> Array<out T>.withIndex(): Iterable<IndexedValue<T>> {
//        return IndexingIterable { iterator() }
//    }
//
//    /**
//     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
//     */
//    public fun ByteArray.withIndex(): Iterable<IndexedValue<Byte>> {
//        return IndexingIterable { iterator() }
//    }
//
//    /**
//     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
//     */
//    public fun ShortArray.withIndex(): Iterable<IndexedValue<Short>> {
//        return IndexingIterable { iterator() }
//    }
//
//    /**
//     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
//     */
//    public fun IntArray.withIndex(): Iterable<IndexedValue<Int>> {
//        return IndexingIterable { iterator() }
//    }
//
//    /**
//     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
//     */
//    public fun LongArray.withIndex(): Iterable<IndexedValue<Long>> {
//        return IndexingIterable { iterator() }
//    }
//
//    /**
//     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
//     */
//    public fun FloatArray.withIndex(): Iterable<IndexedValue<Float>> {
//        return IndexingIterable { iterator() }
//    }
//
//    /**
//     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
//     */
//    public fun DoubleArray.withIndex(): Iterable<IndexedValue<Double>> {
//        return IndexingIterable { iterator() }
//    }
//
//    /**
//     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
//     */
//    public fun BooleanArray.withIndex(): Iterable<IndexedValue<Boolean>> {
//        return IndexingIterable { iterator() }
//    }
//
//    /**
//     * Returns a lazy [Iterable] of [IndexedValue] for each element of the original array.
//     */
//    public fun CharArray.withIndex(): Iterable<IndexedValue<Char>> {
//        return IndexingIterable { iterator() }
//    }
//
//    /**
//     * Returns a list containing only distinct elements from the given array.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public fun <T> Array<out T>.distinct(): List<T> {
//        return this.toMutableSet().toList()
//    }
//
//    /**
//     * Returns a list containing only distinct elements from the given array.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public fun ByteArray.distinct(): List<Byte> {
//        return this.toMutableSet().toList()
//    }
//
//    /**
//     * Returns a list containing only distinct elements from the given array.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public fun ShortArray.distinct(): List<Short> {
//        return this.toMutableSet().toList()
//    }
//
//    /**
//     * Returns a list containing only distinct elements from the given array.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public fun IntArray.distinct(): List<Int> {
//        return this.toMutableSet().toList()
//    }
//
//    /**
//     * Returns a list containing only distinct elements from the given array.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public fun LongArray.distinct(): List<Long> {
//        return this.toMutableSet().toList()
//    }
//
//    /**
//     * Returns a list containing only distinct elements from the given array.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public fun FloatArray.distinct(): List<Float> {
//        return this.toMutableSet().toList()
//    }
//
//    /**
//     * Returns a list containing only distinct elements from the given array.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public fun DoubleArray.distinct(): List<Double> {
//        return this.toMutableSet().toList()
//    }
//
//    /**
//     * Returns a list containing only distinct elements from the given array.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public fun BooleanArray.distinct(): List<Boolean> {
//        return this.toMutableSet().toList()
//    }
//
//    /**
//     * Returns a list containing only distinct elements from the given array.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public fun CharArray.distinct(): List<Char> {
//        return this.toMutableSet().toList()
//    }
//
//    /**
//     * Returns a list containing only elements from the given array
//     * having distinct keys returned by the given [selector] function.
//     *
//     * The elements in the resulting list are in the same order as they were in the source array.
//     */
//    public inline fun <T, K> Array<out T>.distinctBy(selector: (T) -> K): List<T> {
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
//    public inline fun <K> ByteArray.distinctBy(selector: (Byte) -> K): List<Byte> {
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
//    public inline fun <K> ShortArray.distinctBy(selector: (Short) -> K): List<Short> {
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
//    public inline fun <K> IntArray.distinctBy(selector: (Int) -> K): List<Int> {
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
//    public inline fun <K> LongArray.distinctBy(selector: (Long) -> K): List<Long> {
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
//    public inline fun <K> FloatArray.distinctBy(selector: (Float) -> K): List<Float> {
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
//    public inline fun <K> DoubleArray.distinctBy(selector: (Double) -> K): List<Double> {
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
//    public inline fun <K> BooleanArray.distinctBy(selector: (Boolean) -> K): List<Boolean> {
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
//    public inline fun <K> CharArray.distinctBy(selector: (Char) -> K): List<Char> {
//        val set = HashSet<K>()
//        val list = ArrayList<Char>()
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
//    public infix fun <T> Array<out T>.intersect(other: Iterable<T>): Set<T> {
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
//    public infix fun ByteArray.intersect(other: Iterable<Byte>): Set<Byte> {
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
//    public infix fun ShortArray.intersect(other: Iterable<Short>): Set<Short> {
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
//    public infix fun IntArray.intersect(other: Iterable<Int>): Set<Int> {
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
//    public infix fun LongArray.intersect(other: Iterable<Long>): Set<Long> {
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
//    public infix fun FloatArray.intersect(other: Iterable<Float>): Set<Float> {
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
//    public infix fun DoubleArray.intersect(other: Iterable<Double>): Set<Double> {
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
//    public infix fun BooleanArray.intersect(other: Iterable<Boolean>): Set<Boolean> {
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
//    public infix fun CharArray.intersect(other: Iterable<Char>): Set<Char> {
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
//    public infix fun <T> Array<out T>.subtract(other: Iterable<T>): Set<T> {
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
//    public infix fun ByteArray.subtract(other: Iterable<Byte>): Set<Byte> {
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
//    public infix fun ShortArray.subtract(other: Iterable<Short>): Set<Short> {
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
//    public infix fun IntArray.subtract(other: Iterable<Int>): Set<Int> {
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
//    public infix fun LongArray.subtract(other: Iterable<Long>): Set<Long> {
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
//    public infix fun FloatArray.subtract(other: Iterable<Float>): Set<Float> {
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
//    public infix fun DoubleArray.subtract(other: Iterable<Double>): Set<Double> {
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
//    public infix fun BooleanArray.subtract(other: Iterable<Boolean>): Set<Boolean> {
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
//    public infix fun CharArray.subtract(other: Iterable<Char>): Set<Char> {
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
//    public inline fun <T> Array<out T>.count(): Int {
//        return size
//    }
//
///**
// * Returns the number of elements in this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun ByteArray.count(): Int {
//        return size
//    }
//
///**
// * Returns the number of elements in this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun ShortArray.count(): Int {
//        return size
//    }
//
///**
// * Returns the number of elements in this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun IntArray.count(): Int {
//        return size
//    }
//
///**
// * Returns the number of elements in this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun LongArray.count(): Int {
//        return size
//    }
//
///**
// * Returns the number of elements in this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun FloatArray.count(): Int {
//        return size
//    }
//
///**
// * Returns the number of elements in this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun DoubleArray.count(): Int {
//        return size
//    }
//
///**
// * Returns the number of elements in this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun BooleanArray.count(): Int {
//        return size
//    }
//
///**
// * Returns the number of elements in this array.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun CharArray.count(): Int {
//        return size
//    }
//
//    /**
//     * Returns the number of elements matching the given [predicate].
//     */
//    public inline fun <T> Array<out T>.count(predicate: (T) -> Boolean): Int {
//        var count = 0
//        for (element in this) if (predicate(element)) count++
//        return count
//    }
//
//    /**
//     * Returns the number of elements matching the given [predicate].
//     */
//    public inline fun ByteArray.count(predicate: (Byte) -> Boolean): Int {
//        var count = 0
//        for (element in this) if (predicate(element)) count++
//        return count
//    }
//
//    /**
//     * Returns the number of elements matching the given [predicate].
//     */
//    public inline fun ShortArray.count(predicate: (Short) -> Boolean): Int {
//        var count = 0
//        for (element in this) if (predicate(element)) count++
//        return count
//    }
//
//    /**
//     * Returns the number of elements matching the given [predicate].
//     */
//    public inline fun IntArray.count(predicate: (Int) -> Boolean): Int {
//        var count = 0
//        for (element in this) if (predicate(element)) count++
//        return count
//    }
//
//    /**
//     * Returns the number of elements matching the given [predicate].
//     */
//    public inline fun LongArray.count(predicate: (Long) -> Boolean): Int {
//        var count = 0
//        for (element in this) if (predicate(element)) count++
//        return count
//    }
//
//    /**
//     * Returns the number of elements matching the given [predicate].
//     */
//    public inline fun FloatArray.count(predicate: (Float) -> Boolean): Int {
//        var count = 0
//        for (element in this) if (predicate(element)) count++
//        return count
//    }
//
//    /**
//     * Returns the number of elements matching the given [predicate].
//     */
//    public inline fun DoubleArray.count(predicate: (Double) -> Boolean): Int {
//        var count = 0
//        for (element in this) if (predicate(element)) count++
//        return count
//    }
//
//    /**
//     * Returns the number of elements matching the given [predicate].
//     */
//    public inline fun BooleanArray.count(predicate: (Boolean) -> Boolean): Int {
//        var count = 0
//        for (element in this) if (predicate(element)) count++
//        return count
//    }
//
//    /**
//     * Returns the number of elements matching the given [predicate].
//     */
//    public inline fun CharArray.count(predicate: (Char) -> Boolean): Int {
//        var count = 0
//        for (element in this) if (predicate(element)) count++
//        return count
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public inline fun <T, R> Array<out T>.fold(initial: R, operation: (acc: R, T) -> R): R {
//        var accumulator = initial
//        for (element in this) accumulator = operation(accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public inline fun <R> ByteArray.fold(initial: R, operation: (acc: R, Byte) -> R): R {
//        var accumulator = initial
//        for (element in this) accumulator = operation(accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public inline fun <R> ShortArray.fold(initial: R, operation: (acc: R, Short) -> R): R {
//        var accumulator = initial
//        for (element in this) accumulator = operation(accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public inline fun <R> IntArray.fold(initial: R, operation: (acc: R, Int) -> R): R {
//        var accumulator = initial
//        for (element in this) accumulator = operation(accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public inline fun <R> LongArray.fold(initial: R, operation: (acc: R, Long) -> R): R {
//        var accumulator = initial
//        for (element in this) accumulator = operation(accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public inline fun <R> FloatArray.fold(initial: R, operation: (acc: R, Float) -> R): R {
//        var accumulator = initial
//        for (element in this) accumulator = operation(accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public inline fun <R> DoubleArray.fold(initial: R, operation: (acc: R, Double) -> R): R {
//        var accumulator = initial
//        for (element in this) accumulator = operation(accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public inline fun <R> BooleanArray.fold(initial: R, operation: (acc: R, Boolean) -> R): R {
//        var accumulator = initial
//        for (element in this) accumulator = operation(accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public inline fun <R> CharArray.fold(initial: R, operation: (acc: R, Char) -> R): R {
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
//    public inline fun <T, R> Array<out T>.foldIndexed(initial: R, operation: (index: Int, acc: R, T) -> R): R {
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
//    public inline fun <R> ByteArray.foldIndexed(initial: R, operation: (index: Int, acc: R, Byte) -> R): R {
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
//    public inline fun <R> ShortArray.foldIndexed(initial: R, operation: (index: Int, acc: R, Short) -> R): R {
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
//    public inline fun <R> IntArray.foldIndexed(initial: R, operation: (index: Int, acc: R, Int) -> R): R {
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
//    public inline fun <R> LongArray.foldIndexed(initial: R, operation: (index: Int, acc: R, Long) -> R): R {
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
//    public inline fun <R> FloatArray.foldIndexed(initial: R, operation: (index: Int, acc: R, Float) -> R): R {
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
//    public inline fun <R> DoubleArray.foldIndexed(initial: R, operation: (index: Int, acc: R, Double) -> R): R {
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
//    public inline fun <R> BooleanArray.foldIndexed(initial: R, operation: (index: Int, acc: R, Boolean) -> R): R {
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
//    public inline fun <R> CharArray.foldIndexed(initial: R, operation: (index: Int, acc: R, Char) -> R): R {
//        var index = 0
//        var accumulator = initial
//        for (element in this) accumulator = operation(index++, accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from right to left to each element and current accumulator value.
//     */
//    public inline fun <T, R> Array<out T>.foldRight(initial: R, operation: (T, acc: R) -> R): R {
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
//    public inline fun <R> ByteArray.foldRight(initial: R, operation: (Byte, acc: R) -> R): R {
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
//    public inline fun <R> ShortArray.foldRight(initial: R, operation: (Short, acc: R) -> R): R {
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
//    public inline fun <R> IntArray.foldRight(initial: R, operation: (Int, acc: R) -> R): R {
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
//    public inline fun <R> LongArray.foldRight(initial: R, operation: (Long, acc: R) -> R): R {
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
//    public inline fun <R> FloatArray.foldRight(initial: R, operation: (Float, acc: R) -> R): R {
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
//    public inline fun <R> DoubleArray.foldRight(initial: R, operation: (Double, acc: R) -> R): R {
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
//    public inline fun <R> BooleanArray.foldRight(initial: R, operation: (Boolean, acc: R) -> R): R {
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
//    public inline fun <R> CharArray.foldRight(initial: R, operation: (Char, acc: R) -> R): R {
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
//    public inline fun <T, R> Array<out T>.foldRightIndexed(initial: R, operation: (index: Int, T, acc: R) -> R): R {
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
//    public inline fun <R> ByteArray.foldRightIndexed(initial: R, operation: (index: Int, Byte, acc: R) -> R): R {
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
//    public inline fun <R> ShortArray.foldRightIndexed(initial: R, operation: (index: Int, Short, acc: R) -> R): R {
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
//    public inline fun <R> IntArray.foldRightIndexed(initial: R, operation: (index: Int, Int, acc: R) -> R): R {
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
//    public inline fun <R> LongArray.foldRightIndexed(initial: R, operation: (index: Int, Long, acc: R) -> R): R {
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
//    public inline fun <R> FloatArray.foldRightIndexed(initial: R, operation: (index: Int, Float, acc: R) -> R): R {
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
//    public inline fun <R> DoubleArray.foldRightIndexed(initial: R, operation: (index: Int, Double, acc: R) -> R): R {
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
//    public inline fun <R> BooleanArray.foldRightIndexed(initial: R, operation: (index: Int, Boolean, acc: R) -> R): R {
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
//    public inline fun <R> CharArray.foldRightIndexed(initial: R, operation: (index: Int, Char, acc: R) -> R): R {
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
//    public inline fun <T> Array<out T>.forEach(action: (T) -> Unit): Unit {
//        for (element in this) action(element)
//    }
//
//    /**
//     * Performs the given [action] on each element.
//     */
//    public inline fun ByteArray.forEach(action: (Byte) -> Unit): Unit {
//        for (element in this) action(element)
//    }
//
//    /**
//     * Performs the given [action] on each element.
//     */
//    public inline fun ShortArray.forEach(action: (Short) -> Unit): Unit {
//        for (element in this) action(element)
//    }
//
//    /**
//     * Performs the given [action] on each element.
//     */
//    public inline fun IntArray.forEach(action: (Int) -> Unit): Unit {
//        for (element in this) action(element)
//    }
//
//    /**
//     * Performs the given [action] on each element.
//     */
//    public inline fun LongArray.forEach(action: (Long) -> Unit): Unit {
//        for (element in this) action(element)
//    }
//
//    /**
//     * Performs the given [action] on each element.
//     */
//    public inline fun FloatArray.forEach(action: (Float) -> Unit): Unit {
//        for (element in this) action(element)
//    }
//
//    /**
//     * Performs the given [action] on each element.
//     */
//    public inline fun DoubleArray.forEach(action: (Double) -> Unit): Unit {
//        for (element in this) action(element)
//    }
//
//    /**
//     * Performs the given [action] on each element.
//     */
//    public inline fun BooleanArray.forEach(action: (Boolean) -> Unit): Unit {
//        for (element in this) action(element)
//    }
//
//    /**
//     * Performs the given [action] on each element.
//     */
//    public inline fun CharArray.forEach(action: (Char) -> Unit): Unit {
//        for (element in this) action(element)
//    }
//
//    /**
//     * Performs the given [action] on each element, providing sequential index with the element.
//     * @param [action] function that takes the index of an element and the element itself
//     * and performs the desired action on the element.
//     */
//    public inline fun <T> Array<out T>.forEachIndexed(action: (index: Int, T) -> Unit): Unit {
//        var index = 0
//        for (item in this) action(index++, item)
//    }
//
//    /**
//     * Performs the given [action] on each element, providing sequential index with the element.
//     * @param [action] function that takes the index of an element and the element itself
//     * and performs the desired action on the element.
//     */
//    public inline fun ByteArray.forEachIndexed(action: (index: Int, Byte) -> Unit): Unit {
//        var index = 0
//        for (item in this) action(index++, item)
//    }
//
//    /**
//     * Performs the given [action] on each element, providing sequential index with the element.
//     * @param [action] function that takes the index of an element and the element itself
//     * and performs the desired action on the element.
//     */
//    public inline fun ShortArray.forEachIndexed(action: (index: Int, Short) -> Unit): Unit {
//        var index = 0
//        for (item in this) action(index++, item)
//    }
//
//    /**
//     * Performs the given [action] on each element, providing sequential index with the element.
//     * @param [action] function that takes the index of an element and the element itself
//     * and performs the desired action on the element.
//     */
//    public inline fun IntArray.forEachIndexed(action: (index: Int, Int) -> Unit): Unit {
//        var index = 0
//        for (item in this) action(index++, item)
//    }
//
//    /**
//     * Performs the given [action] on each element, providing sequential index with the element.
//     * @param [action] function that takes the index of an element and the element itself
//     * and performs the desired action on the element.
//     */
//    public inline fun LongArray.forEachIndexed(action: (index: Int, Long) -> Unit): Unit {
//        var index = 0
//        for (item in this) action(index++, item)
//    }
//
//    /**
//     * Performs the given [action] on each element, providing sequential index with the element.
//     * @param [action] function that takes the index of an element and the element itself
//     * and performs the desired action on the element.
//     */
//    public inline fun FloatArray.forEachIndexed(action: (index: Int, Float) -> Unit): Unit {
//        var index = 0
//        for (item in this) action(index++, item)
//    }
//
//    /**
//     * Performs the given [action] on each element, providing sequential index with the element.
//     * @param [action] function that takes the index of an element and the element itself
//     * and performs the desired action on the element.
//     */
//    public inline fun DoubleArray.forEachIndexed(action: (index: Int, Double) -> Unit): Unit {
//        var index = 0
//        for (item in this) action(index++, item)
//    }
//
//    /**
//     * Performs the given [action] on each element, providing sequential index with the element.
//     * @param [action] function that takes the index of an element and the element itself
//     * and performs the desired action on the element.
//     */
//    public inline fun BooleanArray.forEachIndexed(action: (index: Int, Boolean) -> Unit): Unit {
//        var index = 0
//        for (item in this) action(index++, item)
//    }
//
//    /**
//     * Performs the given [action] on each element, providing sequential index with the element.
//     * @param [action] function that takes the index of an element and the element itself
//     * and performs the desired action on the element.
//     */
//    public inline fun CharArray.forEachIndexed(action: (index: Int, Char) -> Unit): Unit {
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
//    public fun <T : Comparable<T>> Array<out T>.max(): T? {
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
//    public fun ByteArray.max(): Byte? {
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
//    public fun ShortArray.max(): Short? {
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
//    public fun IntArray.max(): Int? {
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
//    public fun LongArray.max(): Long? {
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
//    public fun FloatArray.max(): Float? {
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
//    public fun DoubleArray.max(): Double? {
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
//    public fun CharArray.max(): Char? {
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
//    public inline fun <T, R : Comparable<R>> Array<out T>.maxBy(selector: (T) -> R): T? {
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
//    public inline fun <R : Comparable<R>> ByteArray.maxBy(selector: (Byte) -> R): Byte? {
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
//    public inline fun <R : Comparable<R>> ShortArray.maxBy(selector: (Short) -> R): Short? {
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
//    public inline fun <R : Comparable<R>> IntArray.maxBy(selector: (Int) -> R): Int? {
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
//    public inline fun <R : Comparable<R>> LongArray.maxBy(selector: (Long) -> R): Long? {
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
//    public inline fun <R : Comparable<R>> FloatArray.maxBy(selector: (Float) -> R): Float? {
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
//    public inline fun <R : Comparable<R>> DoubleArray.maxBy(selector: (Double) -> R): Double? {
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
//    public inline fun <R : Comparable<R>> BooleanArray.maxBy(selector: (Boolean) -> R): Boolean? {
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
//    public inline fun <R : Comparable<R>> CharArray.maxBy(selector: (Char) -> R): Char? {
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
//    public fun <T> Array<out T>.maxWith(comparator: Comparator<in T>): T? {
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
//    public fun ByteArray.maxWith(comparator: Comparator<in Byte>): Byte? {
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
//    public fun ShortArray.maxWith(comparator: Comparator<in Short>): Short? {
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
//    public fun IntArray.maxWith(comparator: Comparator<in Int>): Int? {
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
//    public fun LongArray.maxWith(comparator: Comparator<in Long>): Long? {
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
//    public fun FloatArray.maxWith(comparator: Comparator<in Float>): Float? {
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
//    public fun DoubleArray.maxWith(comparator: Comparator<in Double>): Double? {
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
//    public fun BooleanArray.maxWith(comparator: Comparator<in Boolean>): Boolean? {
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
//    public fun CharArray.maxWith(comparator: Comparator<in Char>): Char? {
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
//    public fun <T : Comparable<T>> Array<out T>.min(): T? {
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
//    public fun ByteArray.min(): Byte? {
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
//    public fun ShortArray.min(): Short? {
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
//    public fun IntArray.min(): Int? {
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
//    public fun LongArray.min(): Long? {
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
//    public fun FloatArray.min(): Float? {
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
//    public fun DoubleArray.min(): Double? {
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
//    public fun CharArray.min(): Char? {
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
//    public inline fun <T, R : Comparable<R>> Array<out T>.minBy(selector: (T) -> R): T? {
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
//    public inline fun <R : Comparable<R>> ByteArray.minBy(selector: (Byte) -> R): Byte? {
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
//    public inline fun <R : Comparable<R>> ShortArray.minBy(selector: (Short) -> R): Short? {
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
//    public inline fun <R : Comparable<R>> IntArray.minBy(selector: (Int) -> R): Int? {
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
//    public inline fun <R : Comparable<R>> LongArray.minBy(selector: (Long) -> R): Long? {
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
//    public inline fun <R : Comparable<R>> FloatArray.minBy(selector: (Float) -> R): Float? {
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
//    public inline fun <R : Comparable<R>> DoubleArray.minBy(selector: (Double) -> R): Double? {
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
//    public inline fun <R : Comparable<R>> BooleanArray.minBy(selector: (Boolean) -> R): Boolean? {
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
//    public inline fun <R : Comparable<R>> CharArray.minBy(selector: (Char) -> R): Char? {
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
//    public fun <T> Array<out T>.minWith(comparator: Comparator<in T>): T? {
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
//    public fun ByteArray.minWith(comparator: Comparator<in Byte>): Byte? {
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
//    public fun ShortArray.minWith(comparator: Comparator<in Short>): Short? {
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
//    public fun IntArray.minWith(comparator: Comparator<in Int>): Int? {
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
//    public fun LongArray.minWith(comparator: Comparator<in Long>): Long? {
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
//    public fun FloatArray.minWith(comparator: Comparator<in Float>): Float? {
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
//    public fun DoubleArray.minWith(comparator: Comparator<in Double>): Double? {
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
//    public fun BooleanArray.minWith(comparator: Comparator<in Boolean>): Boolean? {
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
//    public fun CharArray.minWith(comparator: Comparator<in Char>): Char? {
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
//    public fun <T> Array<out T>.none(): Boolean {
//        return isEmpty()
//    }
//
//    /**
//     * Returns `true` if the array has no elements.
//     */
//    public fun ByteArray.none(): Boolean {
//        return isEmpty()
//    }
//
//    /**
//     * Returns `true` if the array has no elements.
//     */
//    public fun ShortArray.none(): Boolean {
//        return isEmpty()
//    }
//
//    /**
//     * Returns `true` if the array has no elements.
//     */
//    public fun IntArray.none(): Boolean {
//        return isEmpty()
//    }
//
//    /**
//     * Returns `true` if the array has no elements.
//     */
//    public fun LongArray.none(): Boolean {
//        return isEmpty()
//    }
//
//    /**
//     * Returns `true` if the array has no elements.
//     */
//    public fun FloatArray.none(): Boolean {
//        return isEmpty()
//    }
//
//    /**
//     * Returns `true` if the array has no elements.
//     */
//    public fun DoubleArray.none(): Boolean {
//        return isEmpty()
//    }
//
//    /**
//     * Returns `true` if the array has no elements.
//     */
//    public fun BooleanArray.none(): Boolean {
//        return isEmpty()
//    }
//
//    /**
//     * Returns `true` if the array has no elements.
//     */
//    public fun CharArray.none(): Boolean {
//        return isEmpty()
//    }
//
//    /**
//     * Returns `true` if no elements match the given [predicate].
//     */
//    public inline fun <T> Array<out T>.none(predicate: (T) -> Boolean): Boolean {
//        for (element in this) if (predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if no elements match the given [predicate].
//     */
//    public inline fun ByteArray.none(predicate: (Byte) -> Boolean): Boolean {
//        for (element in this) if (predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if no elements match the given [predicate].
//     */
//    public inline fun ShortArray.none(predicate: (Short) -> Boolean): Boolean {
//        for (element in this) if (predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if no elements match the given [predicate].
//     */
//    public inline fun IntArray.none(predicate: (Int) -> Boolean): Boolean {
//        for (element in this) if (predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if no elements match the given [predicate].
//     */
//    public inline fun LongArray.none(predicate: (Long) -> Boolean): Boolean {
//        for (element in this) if (predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if no elements match the given [predicate].
//     */
//    public inline fun FloatArray.none(predicate: (Float) -> Boolean): Boolean {
//        for (element in this) if (predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if no elements match the given [predicate].
//     */
//    public inline fun DoubleArray.none(predicate: (Double) -> Boolean): Boolean {
//        for (element in this) if (predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if no elements match the given [predicate].
//     */
//    public inline fun BooleanArray.none(predicate: (Boolean) -> Boolean): Boolean {
//        for (element in this) if (predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if no elements match the given [predicate].
//     */
//    public inline fun CharArray.none(predicate: (Char) -> Boolean): Boolean {
//        for (element in this) if (predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Accumulates value starting with the first element and applying [operation] from left to right to current accumulator value and each element.
//     */
//    public inline fun <S, T: S> Array<out T>.reduce(operation: (acc: S, T) -> S): S {
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
//    public inline fun ByteArray.reduce(operation: (acc: Byte, Byte) -> Byte): Byte {
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
//    public inline fun ShortArray.reduce(operation: (acc: Short, Short) -> Short): Short {
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
//    public inline fun IntArray.reduce(operation: (acc: Int, Int) -> Int): Int {
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
//    public inline fun LongArray.reduce(operation: (acc: Long, Long) -> Long): Long {
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
//    public inline fun FloatArray.reduce(operation: (acc: Float, Float) -> Float): Float {
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
//    public inline fun DoubleArray.reduce(operation: (acc: Double, Double) -> Double): Double {
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
//    public inline fun BooleanArray.reduce(operation: (acc: Boolean, Boolean) -> Boolean): Boolean {
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
//    public inline fun CharArray.reduce(operation: (acc: Char, Char) -> Char): Char {
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
//    public inline fun <S, T: S> Array<out T>.reduceIndexed(operation: (index: Int, acc: S, T) -> S): S {
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
//    public inline fun ByteArray.reduceIndexed(operation: (index: Int, acc: Byte, Byte) -> Byte): Byte {
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
//    public inline fun ShortArray.reduceIndexed(operation: (index: Int, acc: Short, Short) -> Short): Short {
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
//    public inline fun IntArray.reduceIndexed(operation: (index: Int, acc: Int, Int) -> Int): Int {
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
//    public inline fun LongArray.reduceIndexed(operation: (index: Int, acc: Long, Long) -> Long): Long {
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
//    public inline fun FloatArray.reduceIndexed(operation: (index: Int, acc: Float, Float) -> Float): Float {
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
//    public inline fun DoubleArray.reduceIndexed(operation: (index: Int, acc: Double, Double) -> Double): Double {
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
//    public inline fun BooleanArray.reduceIndexed(operation: (index: Int, acc: Boolean, Boolean) -> Boolean): Boolean {
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
//    public inline fun CharArray.reduceIndexed(operation: (index: Int, acc: Char, Char) -> Char): Char {
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
//    public inline fun <S, T: S> Array<out T>.reduceRight(operation: (T, acc: S) -> S): S {
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
//    public inline fun ByteArray.reduceRight(operation: (Byte, acc: Byte) -> Byte): Byte {
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
//    public inline fun ShortArray.reduceRight(operation: (Short, acc: Short) -> Short): Short {
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
//    public inline fun IntArray.reduceRight(operation: (Int, acc: Int) -> Int): Int {
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
//    public inline fun LongArray.reduceRight(operation: (Long, acc: Long) -> Long): Long {
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
//    public inline fun FloatArray.reduceRight(operation: (Float, acc: Float) -> Float): Float {
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
//    public inline fun DoubleArray.reduceRight(operation: (Double, acc: Double) -> Double): Double {
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
//    public inline fun BooleanArray.reduceRight(operation: (Boolean, acc: Boolean) -> Boolean): Boolean {
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
//    public inline fun CharArray.reduceRight(operation: (Char, acc: Char) -> Char): Char {
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
//    public inline fun <S, T: S> Array<out T>.reduceRightIndexed(operation: (index: Int, T, acc: S) -> S): S {
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
//    public inline fun ByteArray.reduceRightIndexed(operation: (index: Int, Byte, acc: Byte) -> Byte): Byte {
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
//    public inline fun ShortArray.reduceRightIndexed(operation: (index: Int, Short, acc: Short) -> Short): Short {
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
//    public inline fun IntArray.reduceRightIndexed(operation: (index: Int, Int, acc: Int) -> Int): Int {
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
//    public inline fun LongArray.reduceRightIndexed(operation: (index: Int, Long, acc: Long) -> Long): Long {
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
//    public inline fun FloatArray.reduceRightIndexed(operation: (index: Int, Float, acc: Float) -> Float): Float {
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
//    public inline fun DoubleArray.reduceRightIndexed(operation: (index: Int, Double, acc: Double) -> Double): Double {
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
//    public inline fun BooleanArray.reduceRightIndexed(operation: (index: Int, Boolean, acc: Boolean) -> Boolean): Boolean {
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
//    public inline fun CharArray.reduceRightIndexed(operation: (index: Int, Char, acc: Char) -> Char): Char {
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
//    public inline fun <T> Array<out T>.sumBy(selector: (T) -> Int): Int {
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
//    public inline fun ByteArray.sumBy(selector: (Byte) -> Int): Int {
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
//    public inline fun ShortArray.sumBy(selector: (Short) -> Int): Int {
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
//    public inline fun IntArray.sumBy(selector: (Int) -> Int): Int {
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
//    public inline fun LongArray.sumBy(selector: (Long) -> Int): Int {
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
//    public inline fun FloatArray.sumBy(selector: (Float) -> Int): Int {
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
//    public inline fun DoubleArray.sumBy(selector: (Double) -> Int): Int {
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
//    public inline fun BooleanArray.sumBy(selector: (Boolean) -> Int): Int {
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
//    public inline fun CharArray.sumBy(selector: (Char) -> Int): Int {
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
//    public inline fun <T> Array<out T>.sumByDouble(selector: (T) -> Double): Double {
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
//    public inline fun ByteArray.sumByDouble(selector: (Byte) -> Double): Double {
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
//    public inline fun ShortArray.sumByDouble(selector: (Short) -> Double): Double {
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
//    public inline fun IntArray.sumByDouble(selector: (Int) -> Double): Double {
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
//    public inline fun LongArray.sumByDouble(selector: (Long) -> Double): Double {
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
//    public inline fun FloatArray.sumByDouble(selector: (Float) -> Double): Double {
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
//    public inline fun DoubleArray.sumByDouble(selector: (Double) -> Double): Double {
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
//    public inline fun BooleanArray.sumByDouble(selector: (Boolean) -> Double): Double {
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
//    public inline fun CharArray.sumByDouble(selector: (Char) -> Double): Double {
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
//    public fun <T : Any> Array<T?>.requireNoNulls(): Array<T> {
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
//    public inline fun <T> Array<out T>.partition(predicate: (T) -> Boolean): Pair<List<T>, List<T>> {
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
//    public inline fun ByteArray.partition(predicate: (Byte) -> Boolean): Pair<List<Byte>, List<Byte>> {
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
//    public inline fun ShortArray.partition(predicate: (Short) -> Boolean): Pair<List<Short>, List<Short>> {
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
//    public inline fun IntArray.partition(predicate: (Int) -> Boolean): Pair<List<Int>, List<Int>> {
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
//    public inline fun LongArray.partition(predicate: (Long) -> Boolean): Pair<List<Long>, List<Long>> {
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
//    public inline fun FloatArray.partition(predicate: (Float) -> Boolean): Pair<List<Float>, List<Float>> {
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
//    public inline fun DoubleArray.partition(predicate: (Double) -> Boolean): Pair<List<Double>, List<Double>> {
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
//    public inline fun BooleanArray.partition(predicate: (Boolean) -> Boolean): Pair<List<Boolean>, List<Boolean>> {
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
//    public inline fun CharArray.partition(predicate: (Char) -> Boolean): Pair<List<Char>, List<Char>> {
//        val first = ArrayList<Char>()
//        val second = ArrayList<Char>()
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
//    public infix fun <T, R> Array<out T>.zip(other: Array<out R>): List<Pair<T, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> ByteArray.zip(other: Array<out R>): List<Pair<Byte, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> ShortArray.zip(other: Array<out R>): List<Pair<Short, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> IntArray.zip(other: Array<out R>): List<Pair<Int, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> LongArray.zip(other: Array<out R>): List<Pair<Long, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> FloatArray.zip(other: Array<out R>): List<Pair<Float, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> DoubleArray.zip(other: Array<out R>): List<Pair<Double, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> BooleanArray.zip(other: Array<out R>): List<Pair<Boolean, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> CharArray.zip(other: Array<out R>): List<Pair<Char, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public inline fun <T, R, V> Array<out T>.zip(other: Array<out R>, transform: (a: T, b: R) -> V): List<V> {
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
//    public inline fun <R, V> ByteArray.zip(other: Array<out R>, transform: (a: Byte, b: R) -> V): List<V> {
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
//    public inline fun <R, V> ShortArray.zip(other: Array<out R>, transform: (a: Short, b: R) -> V): List<V> {
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
//    public inline fun <R, V> IntArray.zip(other: Array<out R>, transform: (a: Int, b: R) -> V): List<V> {
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
//    public inline fun <R, V> LongArray.zip(other: Array<out R>, transform: (a: Long, b: R) -> V): List<V> {
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
//    public inline fun <R, V> FloatArray.zip(other: Array<out R>, transform: (a: Float, b: R) -> V): List<V> {
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
//    public inline fun <R, V> DoubleArray.zip(other: Array<out R>, transform: (a: Double, b: R) -> V): List<V> {
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
//    public inline fun <R, V> BooleanArray.zip(other: Array<out R>, transform: (a: Boolean, b: R) -> V): List<V> {
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
//    public inline fun <R, V> CharArray.zip(other: Array<out R>, transform: (a: Char, b: R) -> V): List<V> {
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
//    public infix fun <T, R> Array<out T>.zip(other: Iterable<R>): List<Pair<T, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> ByteArray.zip(other: Iterable<R>): List<Pair<Byte, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> ShortArray.zip(other: Iterable<R>): List<Pair<Short, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> IntArray.zip(other: Iterable<R>): List<Pair<Int, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> LongArray.zip(other: Iterable<R>): List<Pair<Long, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> FloatArray.zip(other: Iterable<R>): List<Pair<Float, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> DoubleArray.zip(other: Iterable<R>): List<Pair<Double, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> BooleanArray.zip(other: Iterable<R>): List<Pair<Boolean, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun <R> CharArray.zip(other: Iterable<R>): List<Pair<Char, R>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public inline fun <T, R, V> Array<out T>.zip(other: Iterable<R>, transform: (a: T, b: R) -> V): List<V> {
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
//    public inline fun <R, V> ByteArray.zip(other: Iterable<R>, transform: (a: Byte, b: R) -> V): List<V> {
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
//    public inline fun <R, V> ShortArray.zip(other: Iterable<R>, transform: (a: Short, b: R) -> V): List<V> {
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
//    public inline fun <R, V> IntArray.zip(other: Iterable<R>, transform: (a: Int, b: R) -> V): List<V> {
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
//    public inline fun <R, V> LongArray.zip(other: Iterable<R>, transform: (a: Long, b: R) -> V): List<V> {
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
//    public inline fun <R, V> FloatArray.zip(other: Iterable<R>, transform: (a: Float, b: R) -> V): List<V> {
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
//    public inline fun <R, V> DoubleArray.zip(other: Iterable<R>, transform: (a: Double, b: R) -> V): List<V> {
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
//    public inline fun <R, V> BooleanArray.zip(other: Iterable<R>, transform: (a: Boolean, b: R) -> V): List<V> {
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
//    public inline fun <R, V> CharArray.zip(other: Iterable<R>, transform: (a: Char, b: R) -> V): List<V> {
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
//    public infix fun ByteArray.zip(other: ByteArray): List<Pair<Byte, Byte>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun ShortArray.zip(other: ShortArray): List<Pair<Short, Short>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun IntArray.zip(other: IntArray): List<Pair<Int, Int>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun LongArray.zip(other: LongArray): List<Pair<Long, Long>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun FloatArray.zip(other: FloatArray): List<Pair<Float, Float>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun DoubleArray.zip(other: DoubleArray): List<Pair<Double, Double>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun BooleanArray.zip(other: BooleanArray): List<Pair<Boolean, Boolean>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
//     */
//    public infix fun CharArray.zip(other: CharArray): List<Pair<Char, Char>> {
//        return zip(other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a list of values built from elements of both collections with same indexes using provided [transform]. List has length of shortest collection.
//     */
//    public inline fun <V> ByteArray.zip(other: ByteArray, transform: (a: Byte, b: Byte) -> V): List<V> {
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
//    public inline fun <V> ShortArray.zip(other: ShortArray, transform: (a: Short, b: Short) -> V): List<V> {
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
//    public inline fun <V> IntArray.zip(other: IntArray, transform: (a: Int, b: Int) -> V): List<V> {
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
//    public inline fun <V> LongArray.zip(other: LongArray, transform: (a: Long, b: Long) -> V): List<V> {
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
//    public inline fun <V> FloatArray.zip(other: FloatArray, transform: (a: Float, b: Float) -> V): List<V> {
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
//    public inline fun <V> DoubleArray.zip(other: DoubleArray, transform: (a: Double, b: Double) -> V): List<V> {
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
//    public inline fun <V> BooleanArray.zip(other: BooleanArray, transform: (a: Boolean, b: Boolean) -> V): List<V> {
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
//    public inline fun <V> CharArray.zip(other: CharArray, transform: (a: Char, b: Char) -> V): List<V> {
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
//    public fun <T, A : Appendable> Array<out T>.joinTo(buffer: A, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((T) -> CharSequence)? = null): A {
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
//    public fun <A : Appendable> ByteArray.joinTo(buffer: A, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Byte) -> CharSequence)? = null): A {
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
//    public fun <A : Appendable> ShortArray.joinTo(buffer: A, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Short) -> CharSequence)? = null): A {
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
//    public fun <A : Appendable> IntArray.joinTo(buffer: A, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Int) -> CharSequence)? = null): A {
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
//    public fun <A : Appendable> LongArray.joinTo(buffer: A, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Long) -> CharSequence)? = null): A {
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
//    public fun <A : Appendable> FloatArray.joinTo(buffer: A, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Float) -> CharSequence)? = null): A {
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
//    public fun <A : Appendable> DoubleArray.joinTo(buffer: A, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Double) -> CharSequence)? = null): A {
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
//    public fun <A : Appendable> BooleanArray.joinTo(buffer: A, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Boolean) -> CharSequence)? = null): A {
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
//    public fun <A : Appendable> CharArray.joinTo(buffer: A, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Char) -> CharSequence)? = null): A {
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
//    public fun <T> Array<out T>.joinToString(separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((T) -> CharSequence)? = null): String {
//        return joinTo(StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString()
//    }
//
//    /**
//     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
//     *
//     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
//     * elements will be appended, followed by the [truncated] string (which defaults to "...").
//     */
//    public fun ByteArray.joinToString(separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Byte) -> CharSequence)? = null): String {
//        return joinTo(StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString()
//    }
//
//    /**
//     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
//     *
//     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
//     * elements will be appended, followed by the [truncated] string (which defaults to "...").
//     */
//    public fun ShortArray.joinToString(separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Short) -> CharSequence)? = null): String {
//        return joinTo(StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString()
//    }
//
//    /**
//     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
//     *
//     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
//     * elements will be appended, followed by the [truncated] string (which defaults to "...").
//     */
//    public fun IntArray.joinToString(separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Int) -> CharSequence)? = null): String {
//        return joinTo(StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString()
//    }
//
//    /**
//     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
//     *
//     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
//     * elements will be appended, followed by the [truncated] string (which defaults to "...").
//     */
//    public fun LongArray.joinToString(separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Long) -> CharSequence)? = null): String {
//        return joinTo(StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString()
//    }
//
//    /**
//     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
//     *
//     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
//     * elements will be appended, followed by the [truncated] string (which defaults to "...").
//     */
//    public fun FloatArray.joinToString(separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Float) -> CharSequence)? = null): String {
//        return joinTo(StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString()
//    }
//
//    /**
//     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
//     *
//     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
//     * elements will be appended, followed by the [truncated] string (which defaults to "...").
//     */
//    public fun DoubleArray.joinToString(separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Double) -> CharSequence)? = null): String {
//        return joinTo(StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString()
//    }
//
//    /**
//     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
//     *
//     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
//     * elements will be appended, followed by the [truncated] string (which defaults to "...").
//     */
//    public fun BooleanArray.joinToString(separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Boolean) -> CharSequence)? = null): String {
//        return joinTo(StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString()
//    }
//
//    /**
//     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
//     *
//     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
//     * elements will be appended, followed by the [truncated] string (which defaults to "...").
//     */
//    public fun CharArray.joinToString(separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((Char) -> CharSequence)? = null): String {
//        return joinTo(StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString()
//    }
//}
