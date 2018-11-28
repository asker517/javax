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

package me.panpf.javax.collections;

import me.panpf.javax.util.Action;
import me.panpf.javax.util.DefaultValue;
import me.panpf.javax.util.Pair;
import me.panpf.javax.util.Transformer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

/**
 * Map tool method
 */
public class Mapx {
    // TODO: 2018/11/28 测试

    public static final int INT_MAX_POWER_OF_TWO = Integer.MAX_VALUE / 2 + 1;


    private Mapx() {
    }


    /**
     * Create a MapBuilder
     */
    @NotNull
    public static <K, V> MapBuilder<K, V> builder(@NotNull K k, @Nullable V v) {
        return new MapBuilder<>(k, v);
    }

    /**
     * Returns an empty readable and writable Map<K, V>.
     */
    @NotNull
    public static <K, V> Map<K, V> createEmptyMap() {
        return new HashMap<>(0);
    }

    /**
     * Returns an empty readable and writable HashMap<K, V>.
     */
    @NotNull
    public static <K, V> HashMap<K, V> createEmptyHashMap() {
        return new HashMap<>(0);
    }

    /**
     * Returns an empty readable and writable WeakHashMap<K, V>.
     */
    @NotNull
    public static <K, V> WeakHashMap<K, V> createEmptyWeakHashMap() {
        return new WeakHashMap<>(0);
    }

    /**
     * Returns an empty readable and writable LinkedHashMap<K, V>.
     */
    @NotNull
    public static <K, V> LinkedHashMap<K, V> createEmptyLinkedHashMap() {
        return new LinkedHashMap<>(0);
    }

    /**
     * Returns an empty readable and writable Hashtable<K, V>.
     */
    @NotNull
    public static <K, V> Hashtable<K, V> createEmptyHashtable() {
        return new Hashtable<>(0);
    }

    /**
     * Returns an empty readable and writable TreeMap<K, V>.
     */
    @NotNull
    public static <K, V> TreeMap<K, V> createEmptyTreeMap() {
        return new TreeMap<>();
    }

    /**
     * Returns an empty readable and writable TreeMap<K, V>.
     */
    @NotNull
    public static <K, V> TreeMap<K, V> createEmptySortedMap() {
        return new TreeMap<>();
    }


    /**
     * Returns an empty only readable Map<K, T>.
     */
    @NotNull
    public static <K, T> Map<K, T> onlyReadEmptyMap() {
        //noinspection unchecked
        return Collections.EMPTY_MAP;
    }


    /*
     * *****************************************************************************************************************
     * From kotlin standard library
     * *****************************************************************************************************************
     */


    // TODO: 2018/11/28 转换成 java

//    /**
//     * Returns a new read-only map with the specified contents, given as a list of pairs
//     * where the first value is the key and the second is the value.
//     *
//     * If multiple pairs have the same key, the resulting map will contain the value from the last of those pairs.
//     *
//     * Entries of the map are iterated in the order they were specified.
//     *
//     * The returned map is serializable (JVM).
//     *
//     * @sample samples.collections.Maps.Instantiation.mapFromPairs
//     */
//    public fun <K, V> mapOf(vararg pairs: Pair<K, V>): Map<K, V> =
//            if (pairs.size > 0) pairs.toMap(LinkedHashMap(mapCapacity(pairs.size))) else emptyMap()
//
///**
// * Returns an empty read-only map.
// *
// * The returned map is serializable (JVM).
// * @sample samples.collections.Maps.Instantiation.emptyReadOnlyMap
// */
//    @kotlin.internal.InlineOnly
//    public inline fun <K, V> mapOf(): Map<K, V> = emptyMap()
//
///**
// * Returns an empty new [MutableMap].
// *
// * The returned map preserves the entry iteration order.
// * @sample samples.collections.Maps.Instantiation.emptyMutableMap
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline fun <K, V> mutableMapOf(): MutableMap<K, V> = LinkedHashMap()
//
//    /**
//     * Returns a new [MutableMap] with the specified contents, given as a list of pairs
//     * where the first component is the key and the second is the value.
//     *
//     * If multiple pairs have the same key, the resulting map will contain the value from the last of those pairs.
//     *
//     * Entries of the map are iterated in the order they were specified.
//     *
//     * @sample samples.collections.Maps.Instantiation.mutableMapFromPairs
//     * @sample samples.collections.Maps.Instantiation.emptyMutableMap
//     */
//    public fun <K, V> mutableMapOf(vararg pairs: Pair<K, V>): MutableMap<K, V> =
//            LinkedHashMap<K, V>(mapCapacity(pairs.size)).apply { putAll(pairs) }
//
///**
// * Returns an empty new [HashMap].
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline fun <K, V> hashMapOf(): HashMap<K, V> = HashMap<K, V>()
//
//    /**
//     * Returns a new [HashMap] with the specified contents, given as a list of pairs
//     * where the first component is the key and the second is the value.
//     *
//     * @sample samples.collections.Maps.Instantiation.hashMapFromPairs
//     */
//    public fun <K, V> hashMapOf(vararg pairs: Pair<K, V>): HashMap<K, V> = HashMap<K, V>(mapCapacity(pairs.size)).apply { putAll(pairs) }
//
///**
// * Returns an empty new [LinkedHashMap].
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline fun <K, V> linkedMapOf(): LinkedHashMap<K, V> = LinkedHashMap<K, V>()
//
//    /**
//     * Returns a new [LinkedHashMap] with the specified contents, given as a list of pairs
//     * where the first component is the key and the second is the value.
//     *
//     * If multiple pairs have the same key, the resulting map will contain the value from the last of those pairs.
//     *
//     * Entries of the map are iterated in the order they were specified.
//     *
//     * @sample samples.collections.Maps.Instantiation.linkedMapFromPairs
//     */
//    public fun <K, V> linkedMapOf(vararg pairs: Pair<K, V>): LinkedHashMap<K, V> = pairs.toMap(LinkedHashMap(mapCapacity(pairs.size)))

    /**
     * Calculate the initial capacity of a map, based on Guava's com.google.common.collect.Maps approach. This is equivalent
     * to the Collection constructor for HashSet, (c.size()/.75f) + 1, but provides further optimisations for very small or
     * very large sizes, allows support non-collection classes, and provides consistency for all map based class construction.
     */
    public static int capacity(int expectedSize) {
        if (expectedSize < 3) {
            return expectedSize + 1;
        }
        if (expectedSize < INT_MAX_POWER_OF_TWO) {
            return expectedSize + expectedSize / 3;
        }
        return Integer.MAX_VALUE; // any large value
    }

//    private const val INT_MAX_POWER_OF_TWO: Int = Int.MAX_VALUE / 2 + 1
//
///** Returns `true` if this map is not empty. */
//    @kotlin.internal.InlineOnly
//    public inline fun <K, V> Map<out K, V>.isNotEmpty(): Boolean = !isEmpty()
//
///**
// * Returns the [Map] if its not `null`, or the empty [Map] otherwise.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun <K, V> Map<K, V>?.orEmpty(): Map<K, V> = this ?: emptyMap()
//
///**
// * Checks if the map contains the given key.
// *
// * This method allows to use the `x in map` syntax for checking whether an object is contained in the map.
// */
//    @kotlin.internal.InlineOnly
//    public inline operator fun <@kotlin.internal.OnlyInputTypes K, V> Map<out K, V>.contains(key: K): Boolean = containsKey(key)
//
///**
// * Returns the value corresponding to the given [key], or `null` if such a key is not present in the map.
// */
//    @kotlin.internal.InlineOnly
//    public inline operator fun <@kotlin.internal.OnlyInputTypes K, V> Map<out K, V>.get(key: K): V? =
//    @Suppress("UNCHECKED_CAST") (this as Map<K, V>).get(key)
//
///**
// * Allows to use the index operator for storing values in a mutable map.
// */
//    @kotlin.internal.InlineOnly
//    public inline operator fun <K, V> MutableMap<K, V>.set(key: K, value: V): Unit {
//        put(key, value)
//    }
//
///**
// * Returns `true` if the map contains the specified [key].
// *
// * Allows to overcome type-safety restriction of `containsKey` that requires to pass a key of type `K`.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun <@kotlin.internal.OnlyInputTypes K> Map<out K, *>.containsKey(key: K): Boolean =
//    @Suppress("UNCHECKED_CAST") (this as Map<K, *>).containsKey(key)
//
///**
// * Returns `true` if the map maps one or more keys to the specified [value].
// *
// * Allows to overcome type-safety restriction of `containsValue` that requires to pass a value of type `V`.
// */
//    @Suppress("EXTENSION_SHADOWED_BY_MEMBER") // false warning, extension takes precedence in some cases
//    @kotlin.internal.InlineOnly
//    public inline fun <K, @kotlin.internal.OnlyInputTypes V> Map<K, V>.containsValue(value: V): Boolean = this.containsValue(value)
//
//
///**
// * Removes the specified key and its corresponding value from this map.
// *
// * @return the previous value associated with the key, or `null` if the key was not present in the map.
//
// * Allows to overcome type-safety restriction of `remove` that requires to pass a key of type `K`.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun <@kotlin.internal.OnlyInputTypes K, V> MutableMap<out K, V>.remove(key: K): V? =
//    @Suppress("UNCHECKED_CAST") (this as MutableMap<K, V>).remove(key)
//
///**
// * Returns the key component of the map entry.
// *
// * This method allows to use destructuring declarations when working with maps, for example:
// * ```
// * for ((key, value) in map) {
// *     // do something with the key and the value
// * }
// * ```
// */
//    @kotlin.internal.InlineOnly
//    public inline operator fun <K, V> Map.Entry<K, V>.component1(): K = key
//
///**
// * Returns the value component of the map entry.
// *
// * This method allows to use destructuring declarations when working with maps, for example:
// * ```
// * for ((key, value) in map) {
// *     // do something with the key and the value
// * }
// * ```
// */
//    @kotlin.internal.InlineOnly
//    public inline operator fun <K, V> Map.Entry<K, V>.component2(): V = value
//
///**
// * Converts entry to [Pair] with key being first component and value being second.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun <K, V> Map.Entry<K, V>.toPair(): Pair<K, V> = Pair(key, value)
//
///**
// * Returns the value for the given key, or the result of the [defaultValue] function if there was no entry for the given key.
// *
// * @sample samples.collections.Maps.Usage.getOrElse
// */
//    @kotlin.internal.InlineOnly
//    public inline fun <K, V> Map<K, V>.getOrElse(key: K, defaultValue: () -> V): V = get(key) ?: defaultValue()
//
//
//    internal inline fun <K, V> Map<K, V>.getOrElseNullable(key: K, defaultValue: () -> V): V {
//        val value = get(key)
//        if (value == null && !containsKey(key)) {
//            return defaultValue()
//        } else {
//            @Suppress("UNCHECKED_CAST")
//            return value as V
//        }
//    }
//
///**
// * Returns the value for the given [key] or throws an exception if there is no such key in the map.
// *
// * If the map was created by [withDefault], resorts to its `defaultValue` provider function
// * instead of throwing an exception.
// *
// * @throws NoSuchElementException when the map doesn't contain a value for the specified key and
// * no implicit default value was provided for that map.
// */
//    @SinceKotlin("1.1")
//    public fun <K, V> Map<K, V>.getValue(key: K): V = getOrImplicitDefault(key)

    /**
     * Returns the value for the given key. If the key is not found in the map, calls the [defaultValue] function,
     * puts its result into the map under the given key and returns it.
     */
    @NotNull
    public static <K, V> V getOrPut(@NotNull Map<K, V> map, K key, @NotNull DefaultValue<V> defaultValue) {
        V value = map.get(key);
        if (value == null) {
            V answer = defaultValue.get();
            map.put(key, answer);
            return answer;
        } else {
            return value;
        }
    }

///**
// * Returns an [Iterator] over the entries in the [Map].
// *
// * @sample samples.collections.Maps.Usage.forOverEntries
// */
//    @kotlin.internal.InlineOnly
//    public inline operator fun <K, V> Map<out K, V>.iterator(): Iterator<Map.Entry<K, V>> = entries.iterator()
//
///**
// * Returns a [MutableIterator] over the mutable entries in the [MutableMap].
// *
// */
//    @kotlin.jvm.JvmName("mutableIterator")
//    @kotlin.internal.InlineOnly
//    public inline operator fun <K, V> MutableMap<K, V>.iterator(): MutableIterator<MutableMap.MutableEntry<K, V>> = entries.iterator()
//
//    /**
//     * Populates the given [destination] map with entries having the keys of this map and the values obtained
//     * by applying the [transform] function to each entry in this [Map].
//     */
//    public inline fun <K, V, R, M : MutableMap<in K, in R>> Map<out K, V>.mapValuesTo(destination: M, transform: (Map.Entry<K, V>) -> R): M {
//        return entries.associateByTo(destination, { it.key }, transform)
//    }
//
//    /**
//     * Populates the given [destination] map with entries having the keys obtained
//     * by applying the [transform] function to each entry in this [Map] and the values of this map.
//     *
//     * In case if any two entries are mapped to the equal keys, the value of the latter one will overwrite
//     * the value associated with the former one.
//     */
//    public inline fun <K, V, R, M : MutableMap<in R, in V>> Map<out K, V>.mapKeysTo(destination: M, transform: (Map.Entry<K, V>) -> R): M {
//        return entries.associateByTo(destination, transform, { it.value })
//    }
//
//    /**
//     * Puts all the given [pairs] into this [MutableMap] with the first component in the pair being the key and the second the value.
//     */
//    public fun <K, V> MutableMap<in K, in V>.putAll(pairs: Array<out Pair<K, V>>): Unit {
//        for ((key, value) in pairs) {
//            put(key, value)
//        }
//    }
//
//    /**
//     * Puts all the elements of the given collection into this [MutableMap] with the first component in the pair being the key and the second the value.
//     */
//    public fun <K, V> MutableMap<in K, in V>.putAll(pairs: Iterable<Pair<K, V>>): Unit {
//        for ((key, value) in pairs) {
//            put(key, value)
//        }
//    }
//
//    /**
//     * Puts all the elements of the given sequence into this [MutableMap] with the first component in the pair being the key and the second the value.
//     */
//    public fun <K, V> MutableMap<in K, in V>.putAll(pairs: Sequence<Pair<K, V>>): Unit {
//        for ((key, value) in pairs) {
//            put(key, value)
//        }
//    }
//
//    /**
//     * Returns a new map with entries having the keys of this map and the values obtained by applying the [transform]
//     * function to each entry in this [Map].
//     *
//     * The returned map preserves the entry iteration order of the original map.
//     *
//     * @sample samples.collections.Maps.Transformations.mapValues
//     */
//    public inline fun <K, V, R> Map<out K, V>.mapValues(transform: (Map.Entry<K, V>) -> R): Map<K, R> {
//        return mapValuesTo(LinkedHashMap<K, R>(mapCapacity(size)), transform) // .optimizeReadOnlyMap()
//    }
//
//    /**
//     * Returns a new Map with entries having the keys obtained by applying the [transform] function to each entry in this
//     * [Map] and the values of this map.
//     *
//     * In case if any two entries are mapped to the equal keys, the value of the latter one will overwrite
//     * the value associated with the former one.
//     *
//     * The returned map preserves the entry iteration order of the original map.
//     *
//     * @sample samples.collections.Maps.Transformations.mapKeys
//     */
//    public inline fun <K, V, R> Map<out K, V>.mapKeys(transform: (Map.Entry<K, V>) -> R): Map<R, V> {
//        return mapKeysTo(LinkedHashMap<R, V>(mapCapacity(size)), transform) // .optimizeReadOnlyMap()
//    }
//
//    /**
//     * Returns a map containing all key-value pairs with keys matching the given [predicate].
//     *
//     * The returned map preserves the entry iteration order of the original map.
//     * @sample samples.collections.Maps.Filtering.filterKeys
//     */
//    public inline fun <K, V> Map<out K, V>.filterKeys(predicate: (K) -> Boolean): Map<K, V> {
//        val result = LinkedHashMap<K, V>()
//        for (entry in this) {
//            if (predicate(entry.key)) {
//                result.put(entry.key, entry.value)
//            }
//        }
//        return result
//    }
//
//    /**
//     * Returns a map containing all key-value pairs with values matching the given [predicate].
//     *
//     * The returned map preserves the entry iteration order of the original map.
//     *  @sample samples.collections.Maps.Filtering.filterValues
//     */
//    public inline fun <K, V> Map<out K, V>.filterValues(predicate: (V) -> Boolean): Map<K, V> {
//        val result = LinkedHashMap<K, V>()
//        for (entry in this) {
//            if (predicate(entry.value)) {
//                result.put(entry.key, entry.value)
//            }
//        }
//        return result
//    }
//
//
//    /**
//     * Appends all entries matching the given [predicate] into the mutable map given as [destination] parameter.
//     *
//     * @return the destination map.
//     * @sample samples.collections.Maps.Filtering.filterTo
//     */
//    public inline fun <K, V, M : MutableMap<in K, in V>> Map<out K, V>.filterTo(destination: M, predicate: (Map.Entry<K, V>) -> Boolean): M {
//        for (element in this) {
//            if (predicate(element)) {
//                destination.put(element.key, element.value)
//            }
//        }
//        return destination
//    }
//
//    /**
//     * Returns a new map containing all key-value pairs matching the given [predicate].
//     *
//     * The returned map preserves the entry iteration order of the original map.
//     * @sample samples.collections.Maps.Filtering.filter
//     */
//    public inline fun <K, V> Map<out K, V>.filter(predicate: (Map.Entry<K, V>) -> Boolean): Map<K, V> {
//        return filterTo(LinkedHashMap<K, V>(), predicate)
//    }
//
//    /**
//     * Appends all entries not matching the given [predicate] into the given [destination].
//     *
//     * @return the destination map.
//     * @sample samples.collections.Maps.Filtering.filterNotTo
//     */
//    public inline fun <K, V, M : MutableMap<in K, in V>> Map<out K, V>.filterNotTo(destination: M, predicate: (Map.Entry<K, V>) -> Boolean): M {
//        for (element in this) {
//            if (!predicate(element)) {
//                destination.put(element.key, element.value)
//            }
//        }
//        return destination
//    }
//
//    /**
//     * Returns a new map containing all key-value pairs not matching the given [predicate].
//     *
//     * The returned map preserves the entry iteration order of the original map.
//     * @sample samples.collections.Maps.Filtering.filterNot
//     */
//    public inline fun <K, V> Map<out K, V>.filterNot(predicate: (Map.Entry<K, V>) -> Boolean): Map<K, V> {
//        return filterNotTo(LinkedHashMap<K, V>(), predicate)
//    }
//
//    /**
//     * Returns a new map containing all key-value pairs from the given collection of pairs.
//     *
//     * The returned map preserves the entry iteration order of the original collection.
//     */
//    public fun <K, V> Iterable<Pair<K, V>>.toMap(): Map<K, V> {
//        if (this is Collection) {
//            return when (size) {
//                0 -> emptyMap()
//                1 -> mapOf(if (this is List) this[0] else iterator().next())
//            else -> toMap(LinkedHashMap<K, V>(mapCapacity(size)))
//            }
//        }
//        return toMap(LinkedHashMap<K, V>()).optimizeReadOnlyMap()
//    }
//
///**
// * Populates and returns the [destination] mutable map with key-value pairs from the given collection of pairs.
// */
//    public fun <K, V, M : MutableMap<in K, in V>> Iterable<Pair<K, V>>.toMap(destination: M): M =
//    destination.apply { putAll(this@toMap) }
//
//    /**
//     * Returns a new map containing all key-value pairs from the given array of pairs.
//     *
//     * The returned map preserves the entry iteration order of the original array.
//     */
//    public fun <K, V> Array<out Pair<K, V>>.toMap(): Map<K, V> = when (size) {
//        0 -> emptyMap()
//        1 -> mapOf(this[0])
//    else -> toMap(LinkedHashMap<K, V>(mapCapacity(size)))
//    }
//
///**
// *  Populates and returns the [destination] mutable map with key-value pairs from the given array of pairs.
// */
//    public fun <K, V, M : MutableMap<in K, in V>> Array<out Pair<K, V>>.toMap(destination: M): M =
//    destination.apply { putAll(this@toMap) }
//
//    /**
//     * Returns a new map containing all key-value pairs from the given sequence of pairs.
//     *
//     * The returned map preserves the entry iteration order of the original sequence.
//     */
//    public fun <K, V> Sequence<Pair<K, V>>.toMap(): Map<K, V> = toMap(LinkedHashMap<K, V>()).optimizeReadOnlyMap()
//
///**
// * Populates and returns the [destination] mutable map with key-value pairs from the given sequence of pairs.
// */
//    public fun <K, V, M : MutableMap<in K, in V>> Sequence<Pair<K, V>>.toMap(destination: M): M =
//    destination.apply { putAll(this@toMap) }
//
///**
// * Returns a new read-only map containing all key-value pairs from the original map.
// *
// * The returned map preserves the entry iteration order of the original map.
// */
//    @SinceKotlin("1.1")
//    public fun <K, V> Map<out K, V>.toMap(): Map<K, V> = when (size) {
//        0 -> emptyMap()
//        1 -> toSingletonMap()
//    else -> toMutableMap()
//    }
//
///**
// * Returns a new mutable map containing all key-value pairs from the original map.
// *
// * The returned map preserves the entry iteration order of the original map.
// */
//    @SinceKotlin("1.1")
//    public fun <K, V> Map<out K, V>.toMutableMap(): MutableMap<K, V> = LinkedHashMap(this)
//
///**
// * Populates and returns the [destination] mutable map with key-value pairs from the given map.
// */
//    @SinceKotlin("1.1")
//    public fun <K, V, M : MutableMap<in K, in V>> Map<out K, V>.toMap(destination: M): M =
//    destination.apply { putAll(this@toMap) }
//
//    /**
//     * Creates a new read-only map by replacing or adding an entry to this map from a given key-value [pair].
//     *
//     * The returned map preserves the entry iteration order of the original map.
//     * The [pair] is iterated in the end if it has a unique key.
//     */
//    public operator fun <K, V> Map<out K, V>.plus(pair: Pair<K, V>): Map<K, V> =
//            if (this.isEmpty()) mapOf(pair) else LinkedHashMap(this).apply { put(pair.first, pair.second) }
//
//    /**
//     * Creates a new read-only map by replacing or adding entries to this map from a given collection of key-value [pairs].
//     *
//     * The returned map preserves the entry iteration order of the original map.
//     * Those [pairs] with unique keys are iterated in the end in the order of [pairs] collection.
//     */
//    public operator fun <K, V> Map<out K, V>.plus(pairs: Iterable<Pair<K, V>>): Map<K, V> =
//            if (this.isEmpty()) pairs.toMap() else LinkedHashMap(this).apply { putAll(pairs) }
//
//    /**
//     * Creates a new read-only map by replacing or adding entries to this map from a given array of key-value [pairs].
//     *
//     * The returned map preserves the entry iteration order of the original map.
//     * Those [pairs] with unique keys are iterated in the end in the order of [pairs] array.
//     */
//    public operator fun <K, V> Map<out K, V>.plus(pairs: Array<out Pair<K, V>>): Map<K, V> =
//            if (this.isEmpty()) pairs.toMap() else LinkedHashMap(this).apply { putAll(pairs) }
//
//    /**
//     * Creates a new read-only map by replacing or adding entries to this map from a given sequence of key-value [pairs].
//     *
//     * The returned map preserves the entry iteration order of the original map.
//     * Those [pairs] with unique keys are iterated in the end in the order of [pairs] sequence.
//     */
//    public operator fun <K, V> Map<out K, V>.plus(pairs: Sequence<Pair<K, V>>): Map<K, V> =
//    LinkedHashMap(this).apply { putAll(pairs) }.optimizeReadOnlyMap()
//
//    /**
//     * Creates a new read-only map by replacing or adding entries to this map from another [map].
//     *
//     * The returned map preserves the entry iteration order of the original map.
//     * Those entries of another [map] that are missing in this map are iterated in the end in the order of that [map].
//     */
//    public operator fun <K, V> Map<out K, V>.plus(map: Map<out K, V>): Map<K, V> =
//    LinkedHashMap(this).apply { putAll(map) }
//
//
//    @kotlin.internal.InlineOnly
//    public inline operator fun <K, V> MutableMap<in K, in V>.plusAssign(pair: Pair<K, V>) {
//        put(pair.first, pair.second)
//    }

    /**
     * Appends or replaces the given [pair] in this mutable map.
     */
    @NotNull
    public static <K, V> Map<K, V> plusAssign(@NotNull Map<K, V> map, @Nullable Pair<K, V> pair) {
        if (pair != null) map.put(pair.first, pair.second);
        return map;
    }

///**
// * Appends or replaces all pairs from the given collection of [pairs] in this mutable map.
// */
//    @kotlin.internal.InlineOnly
//    public inline operator fun <K, V> MutableMap<in K, in V>.plusAssign(pairs: Iterable<Pair<K, V>>) {
//        putAll(pairs)
//    }
//
///**
// * Appends or replaces all pairs from the given array of [pairs] in this mutable map.
// */
//    @kotlin.internal.InlineOnly
//    public inline operator fun <K, V> MutableMap<in K, in V>.plusAssign(pairs: Array<out Pair<K, V>>) {
//        putAll(pairs)
//    }
//
///**
// * Appends or replaces all pairs from the given sequence of [pairs] in this mutable map.
// */
//    @kotlin.internal.InlineOnly
//    public inline operator fun <K, V> MutableMap<in K, in V>.plusAssign(pairs: Sequence<Pair<K, V>>) {
//        putAll(pairs)
//    }
//
///**
// * Appends or replaces all entries from the given [map] in this mutable map.
// */
//    @kotlin.internal.InlineOnly
//    public inline operator fun <K, V> MutableMap<in K, in V>.plusAssign(map: Map<K, V>) {
//        putAll(map)
//    }
//
///**
// * Returns a map containing all entries of the original map except the entry with the given [key].
// *
// * The returned map preserves the entry iteration order of the original map.
// */
//    @SinceKotlin("1.1")
//    public operator fun <K, V> Map<out K, V>.minus(key: K): Map<K, V> =
//            this.toMutableMap().apply { minusAssign(key) }.optimizeReadOnlyMap()
//
///**
// * Returns a map containing all entries of the original map except those entries
// * the keys of which are contained in the given [keys] collection.
// *
// * The returned map preserves the entry iteration order of the original map.
// */
//    @SinceKotlin("1.1")
//    public operator fun <K, V> Map<out K, V>.minus(keys: Iterable<K>): Map<K, V> =
//            this.toMutableMap().apply { minusAssign(keys) }.optimizeReadOnlyMap()
//
///**
// * Returns a map containing all entries of the original map except those entries
// * the keys of which are contained in the given [keys] array.
// *
// * The returned map preserves the entry iteration order of the original map.
// */
//    @SinceKotlin("1.1")
//    public operator fun <K, V> Map<out K, V>.minus(keys: Array<out K>): Map<K, V> =
//            this.toMutableMap().apply { minusAssign(keys) }.optimizeReadOnlyMap()
//
///**
// * Returns a map containing all entries of the original map except those entries
// * the keys of which are contained in the given [keys] sequence.
// *
// * The returned map preserves the entry iteration order of the original map.
// */
//    @SinceKotlin("1.1")
//    public operator fun <K, V> Map<out K, V>.minus(keys: Sequence<K>): Map<K, V> =
//            this.toMutableMap().apply { minusAssign(keys) }.optimizeReadOnlyMap()
//
///**
// * Removes the entry with the given [key] from this mutable map.
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline operator fun <K, V> MutableMap<K, V>.minusAssign(key: K) {
//        remove(key)
//    }
//
///**
// * Removes all entries the keys of which are contained in the given [keys] collection from this mutable map.
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline operator fun <K, V> MutableMap<K, V>.minusAssign(keys: Iterable<K>) {
//        this.keys.removeAll(keys)
//    }
//
///**
// * Removes all entries the keys of which are contained in the given [keys] array from this mutable map.
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline operator fun <K, V> MutableMap<K, V>.minusAssign(keys: Array<out K>) {
//        this.keys.removeAll(keys)
//    }
//
///**
// * Removes all entries from the keys of which are contained in the given [keys] sequence from this mutable map.
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public inline operator fun <K, V> MutableMap<K, V>.minusAssign(keys: Sequence<K>) {
//        this.keys.removeAll(keys)
//    }
//
//
//    // do not expose for now @PublishedApi
//    internal fun <K, V> Map<K, V>.optimizeReadOnlyMap() = when (size) {
//        0 -> emptyMap()
//        1 -> toSingletonMapOrSelf()
//    else -> this
//    }
//
//    /**
//     * Returns a [List] containing all key-value pairs.
//     */
//    public fun <K, V> Map<out K, V>.toList(): List<Pair<K, V>> {
//        if (size == 0)
//            return emptyList()
//        val iterator = entries.iterator()
//        if (!iterator.hasNext())
//            return emptyList()
//        val first = iterator.next()
//        if (!iterator.hasNext())
//            return listOf(first.toPair())
//        val result = ArrayList<Pair<K, V>>(size)
//                result.add(first.toPair())
//        do {
//            result.add(iterator.next().toPair())
//        } while (iterator.hasNext())
//        return result
//    }
//
//    /**
//     * Returns a single list of all elements yielded from results of [transform] function being invoked on each entry of original map.
//     */
//    public inline fun <K, V, R> Map<out K, V>.flatMap(transform: (Map.Entry<K, V>) -> Iterable<R>): List<R> {
//        return flatMapTo(ArrayList<R>(), transform)
//    }
//
//    /**
//     * Appends all elements yielded from results of [transform] function being invoked on each entry of original map, to the given [destination].
//     */
//    public inline fun <K, V, R, C : MutableCollection<in R>> Map<out K, V>.flatMapTo(destination: C, transform: (Map.Entry<K, V>) -> Iterable<R>): C {
//        for (element in this) {
//            val list = transform(element)
//            destination.addAll(list)
//        }
//        return destination
//    }
//
//
//    public inline fun <K, V, R> Map<out K, V>.map(transform: (Map.Entry<K, V>) -> R): List<R> {
//        return mapTo(ArrayList<R>(size), transform)
//    }

    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each entry in the original map.
     */
    @NotNull
    public static <K, V, R> List<R> map(@NotNull Map<K, V> map, @NotNull Transformer<Map.Entry<K, V>, R> transformer) {
        return mapTo(map, new ArrayList<R>(), transformer);
    }

//    /**
//     * Returns a list containing only the non-null results of applying the given [transform] function
//     * to each entry in the original map.
//     */
//    public inline fun <K, V, R : Any> Map<out K, V>.mapNotNull(transform: (Map.Entry<K, V>) -> R?): List<R> {
//        return mapNotNullTo(ArrayList<R>(), transform)
//    }
//
//    /**
//     * Applies the given [transform] function to each entry in the original map
//     * and appends only the non-null results to the given [destination].
//     */
//    public inline fun <K, V, R : Any, C : MutableCollection<in R>> Map<out K, V>.mapNotNullTo(destination: C, transform: (Map.Entry<K, V>) -> R?): C {
//        forEach { element -> transform(element)?.let { destination.add(it) } }
//        return destination
//    }

    /**
     * Applies the given [transform] function to each entry of the original map
     * and appends the results to the given [destination].
     */
    @NotNull
    public static <K, V, R, C extends Collection<R>> C mapTo(@NotNull Map<K, V> map, @NotNull C destination, @NotNull Transformer<Map.Entry<K, V>, R> transformer) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            destination.add(transformer.transform(entry));
        }
        return destination;
    }

//    /**
//     * Returns `true` if all entries match the given [predicate].
//     *
//     * @sample samples.collections.Collections.Aggregates.all
//     */
//    public inline fun <K, V> Map<out K, V>.all(predicate: (Map.Entry<K, V>) -> Boolean): Boolean {
//        if (isEmpty()) return true
//        for (element in this) if (!predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if map has at least one entry.
//     *
//     * @sample samples.collections.Collections.Aggregates.any
//     */
//    public fun <K, V> Map<out K, V>.any(): Boolean {
//        return !isEmpty()
//    }
//
//    /**
//     * Returns `true` if at least one entry matches the given [predicate].
//     *
//     * @sample samples.collections.Collections.Aggregates.anyWithPredicate
//     */
//    public inline fun <K, V> Map<out K, V>.any(predicate: (Map.Entry<K, V>) -> Boolean): Boolean {
//        if (isEmpty()) return false
//        for (element in this) if (predicate(element)) return true
//        return false
//    }
//
///**
// * Returns the number of entries in this map.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun <K, V> Map<out K, V>.count(): Int {
//        return size
//    }
//
//    /**
//     * Returns the number of entries matching the given [predicate].
//     */
//    public inline fun <K, V> Map<out K, V>.count(predicate: (Map.Entry<K, V>) -> Boolean): Int {
//        if (isEmpty()) return 0
//        var count = 0
//        for (element in this) if (predicate(element)) count++
//        return count
//    }
//

    /**
     * Performs the given [action] on each entry.
     */
    public static <K, V> void forEach(@NotNull Map<K, V> map, @NotNull Action<Map.Entry<K, V>> action) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            action.action(entry);
        }
    }
//
///**
// * Returns the first entry yielding the largest value of the given function or `null` if there are no entries.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun <K, V, R : Comparable<R>> Map<out K, V>.maxBy(selector: (Map.Entry<K, V>) -> R): Map.Entry<K, V>? {
//        return entries.maxBy(selector)
//    }
//
///**
// * Returns the first entry having the largest value according to the provided [comparator] or `null` if there are no entries.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun <K, V> Map<out K, V>.maxWith(comparator: Comparator<in Map.Entry<K, V>>): Map.Entry<K, V>? {
//        return entries.maxWith(comparator)
//    }
//
//    /**
//     * Returns the first entry yielding the smallest value of the given function or `null` if there are no entries.
//     */
//    public inline fun <K, V, R : Comparable<R>> Map<out K, V>.minBy(selector: (Map.Entry<K, V>) -> R): Map.Entry<K, V>? {
//        return entries.minBy(selector)
//    }
//
//    /**
//     * Returns the first entry having the smallest value according to the provided [comparator] or `null` if there are no entries.
//     */
//    public fun <K, V> Map<out K, V>.minWith(comparator: Comparator<in Map.Entry<K, V>>): Map.Entry<K, V>? {
//        return entries.minWith(comparator)
//    }
//
//    /**
//     * Returns `true` if the map has no entries.
//     *
//     * @sample samples.collections.Collections.Aggregates.none
//     */
//    public fun <K, V> Map<out K, V>.none(): Boolean {
//        return isEmpty()
//    }
//
//    /**
//     * Returns `true` if no entries match the given [predicate].
//     *
//     * @sample samples.collections.Collections.Aggregates.noneWithPredicate
//     */
//    public inline fun <K, V> Map<out K, V>.none(predicate: (Map.Entry<K, V>) -> Boolean): Boolean {
//        if (isEmpty()) return true
//        for (element in this) if (predicate(element)) return false
//        return true
//    }
//
///**
// * Performs the given [action] on each entry and returns the map itself afterwards.
// */
//    @SinceKotlin("1.1")
//    public inline fun <K, V, M : Map<out K, V>> M.onEach(action: (Map.Entry<K, V>) -> Unit): M {
//        return apply { for (element in this) action(element) }
//    }
//
///**
// * Creates an [Iterable] instance that wraps the original map returning its entries when being iterated.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun <K, V> Map<out K, V>.asIterable(): Iterable<Map.Entry<K, V>> {
//        return entries
//    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original map returning its entries when being iterated.
//     */
//    public fun <K, V> Map<out K, V>.asSequence(): Sequence<Map.Entry<K, V>> {
//        return entries.asSequence()
//    }
}
