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

import me.panpf.javax.util.*;
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
     * Returns `true` if this map is null or empty.
     */
    public static <K, V> boolean isNullOrEmpty(@Nullable Map<K, V> map) {
        return map == null || map.isEmpty();
    }


    /**
     * Returns `true` if this map is not null or empty.
     */
    public static <K, V> boolean isNotNullOrEmpty(@Nullable Map<K, V> map) {
        return map != null && !map.isEmpty();
    }


    /*
     * *****************************************************************************************************************
     * From kotlin standard library
     * *****************************************************************************************************************
     */


    // TODO: 2018/11/28 转换成 java

    /**
     * Returns an empty read-only map.
     * <p>
     * The returned map is serializable (JVM).
     */
    @NotNull
    public static <K, V> Map<K, V> immutableMapOf() {
        //noinspection unchecked
        return Collections.EMPTY_MAP;
    }

    /**
     * Returns an immutable map, mapping only the specified key to the
     * specified value.
     * <p>
     * The returned map is serializable.
     */
    @NotNull
    public static <K, V> Map<K, V> immutableMapOf(@NotNull Pair<K, V> pair) {
        return Collections.singletonMap(pair.first, pair.second);
    }

    /**
     * Returns a new read-only map with the specified contents, given as a list of pairs
     * where the first value is the key and the second is the value.
     * <p>
     * If multiple pairs have the same key, the resulting map will contain the value from the last of those pairs.
     * <p>
     * Entries of the map are iterated in the order they were specified.
     * <p>
     * The returned map is serializable (JVM).
     */
    @NotNull
    @SafeVarargs
    public static <K, V> Map<K, V> immutableMapOf(@NotNull Pair<K, V>... pairs) {
        //noinspection unchecked
        return pairs.length > 0 ? toMap(pairs, new LinkedHashMap<K, V>(capacity(pairs.length))) : (Map<K, V>) Collections.EMPTY_MAP;
    }

    /**
     * Returns an empty new [Map].
     * <p>
     * The returned map preserves the entry iteration order.
     */
    public static <K, V> Map<K, V> mutableMapOf() {
        return new LinkedHashMap<>(0);
    }

    /**
     * Returns a new [Map] with the specified contents, given as a list of pairs
     * where the first component is the key and the second is the value.
     * <p>
     * If multiple pairs have the same key, the resulting map will contain the value from the last of those pairs.
     * <p>
     * Entries of the map are iterated in the order they were specified.
     */
    @NotNull
    @SafeVarargs
    public static <K, V> Map<K, V> mutableMapOf(@NotNull Pair<K, V>... pairs) {
        //noinspection unchecked
        return pairs.length > 0 ? toMap(pairs, new LinkedHashMap<K, V>(capacity(pairs.length))) : (Map<K, V>) mutableMapOf();
    }

    /**
     * Returns an empty new [HashMap].
     */
    public static <K, V> HashMap<K, V> hashMapOf() {
        return new HashMap<>(0);
    }

    /**
     * Returns a new [HashMap] with the specified contents, given as a list of pairs
     * where the first component is the key and the second is the value.
     */
    @NotNull
    @SafeVarargs
    public static <K, V> HashMap<K, V> hashMapOf(@NotNull Pair<K, V>... pairs) {
        HashMap<K, V> map = new HashMap<>(capacity(pairs.length));
        putAll(map, pairs);
        return map;
    }

    /**
     * Returns an empty new [LinkedHashMap].
     */
    public static <K, V> LinkedHashMap<K, V> linkedMapOf() {
        return new LinkedHashMap<>(0);
    }

    /**
     * Returns a new [LinkedHashMap] with the specified contents, given as a list of pairs
     * where the first component is the key and the second is the value.
     * <p>
     * If multiple pairs have the same key, the resulting map will contain the value from the last of those pairs.
     * <p>
     * Entries of the map are iterated in the order they were specified.
     */
    @NotNull
    @SafeVarargs
    public static <K, V> LinkedHashMap<K, V> linkedMapOf(@NotNull Pair<K, V>... pairs) {
        LinkedHashMap<K, V> map = new LinkedHashMap<>(capacity(pairs.length));
        putAll(map, pairs);
        return map;
    }

    /**
     * Returns a new [SortedMap] with the specified contents, given as a list of pairs
     * where the first value is the key and the second is the value.
     */
    @NotNull
    @SafeVarargs
    public static <K extends Comparable<K>, V> SortedMap<K, V> sortedMapOf(@NotNull Pair<K, V>... pairs) {
        TreeMap<K, V> map = new TreeMap<>();
        putAll(map, pairs);
        return map;
    }
//
///**
// * Returns an empty new [Map].
// *
// * The returned map preserves the entry iteration order.
// * @sample samples.collections.Maps.Instantiation.emptyMutableMap
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public static <K, V> mutableMapOf(): Map<K, V> = LinkedHashMap()
//
//    /**
//     * Returns a new [Map] with the specified contents, given as a list of pairs
//     * where the first component is the key and the second is the value.
//     *
//     * If multiple pairs have the same key, the resulting map will contain the value from the last of those pairs.
//     *
//     * Entries of the map are iterated in the order they were specified.
//     *
//     * @sample samples.collections.Maps.Instantiation.mutableMapFromPairs
//     * @sample samples.collections.Maps.Instantiation.emptyMutableMap
//     */
//    public static <K, V> mutableMapOf(vararg pairs: Pair<K, V>): Map<K, V> =
//            LinkedHashMap<K, V>(mapCapacity(pairs.size)).apply { putAll(pairs) }
//
///**
// * Returns an empty new [HashMap].
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public static <K, V> hashMapOf(): HashMap<K, V> = HashMap<K, V>()
//
//    /**
//     * Returns a new [HashMap] with the specified contents, given as a list of pairs
//     * where the first component is the key and the second is the value.
//     *
//     * @sample samples.collections.Maps.Instantiation.hashMapFromPairs
//     */
//    public static <K, V> hashMapOf(vararg pairs: Pair<K, V>): HashMap<K, V> = HashMap<K, V>(mapCapacity(pairs.size)).apply { putAll(pairs) }
//
///**
// * Returns an empty new [LinkedHashMap].
// */
//    @SinceKotlin("1.1")
//    @kotlin.internal.InlineOnly
//    public static <K, V> linkedMapOf(): LinkedHashMap<K, V> = LinkedHashMap<K, V>()
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
//    public static <K, V> linkedMapOf(vararg pairs: Pair<K, V>): LinkedHashMap<K, V> = pairs.toMap(LinkedHashMap(mapCapacity(pairs.size)))

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


    /**
     * Returns `true` if this map is empty.
     */
    public static <K, V> boolean isEmpty(@NotNull Map<K, V> map) {
        //noinspection ConstantConditions
        return map != null && map.isEmpty();
    }

    /**
     * Returns `true` if this map is not empty.
     */
    public static <K, V> boolean isNotEmpty(@NotNull Map<K, V> map) {
        //noinspection ConstantConditions
        return map != null && !map.isEmpty();
    }

    /**
     * Returns the [Map] if its not `null`, or the empty [Map] otherwise.
     */
    public static <K, V> Map<K, V> orEmpty(@Nullable Map<K, V> map) {
        return map != null ? map : Mapx.<K, V>mutableMapOf();
    }
//
///**
// * Checks if the map contains the given key.
// *
// * This method allows to use the `x in map` syntax for checking whether an object is contained in the map.
// */
//    @kotlin.internal.InlineOnly
//    public operator static <@kotlin.internal.OnlyInputTypes K, V> boolean contains(@Nullable Map<K, V> map, key: K) = containsKey(key)
//
///**
// * Returns the value corresponding to the given [key], or `null` if such a key is not present in the map.
// */
//    @kotlin.internal.InlineOnly
//    public operator static <@kotlin.internal.OnlyInputTypes K, V> get(@Nullable Map<K, V> map, key: K): V? =
//    @Suppress("UNCHECKED_CAST") (this as Map<K, V>).get(key)
//
///**
// * Allows to use the index operator for storing values in a mutable map.
// */
//    @kotlin.internal.InlineOnly
//    public operator static <K, V> set(@Nullable Map<K, V> map, key: K, value: V): Unit {
//        put(key, value)
//    }
//
///**
// * Returns `true` if the map contains the specified [key].
// *
// * Allows to overcome type-safety restriction of `containsKey` that requires to pass a key of type `K`.
// */
//    @kotlin.internal.InlineOnly
//    public static <@kotlin.internal.OnlyInputTypes K> boolean Map<K, *>.containsKey(key: K) =
//    @Suppress("UNCHECKED_CAST") (this as Map<K, *>).containsKey(key)
//
///**
// * Returns `true` if the map maps one or more keys to the specified [value].
// *
// * Allows to overcome type-safety restriction of `containsValue` that requires to pass a value of type `V`.
// */
//    @Suppress("EXTENSION_SHADOWED_BY_MEMBER") // false warning, extension takes precedence in some cases
//    @kotlin.internal.InlineOnly
//    public static <K, @kotlin.internal.OnlyInputTypes V> boolean containsValue(@Nullable Map<K, V> map, value: V) = this.containsValue(value)
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
//    public static <@kotlin.internal.OnlyInputTypes K, V> Mutableremove(@Nullable Map<K, V> map, key: K): V? =
//    @Suppress("UNCHECKED_CAST") (this as Map<K, V>).remove(key)
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
//    public operator static <K, V> Map.Entry<K, V>.component1(): K = key
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
//    public operator static <K, V> Map.Entry<K, V>.component2(): V = value
//

    /**
     * Converts entry to [Pair] with key being first component and value being second.
     */
    public static <K, V> Pair<K, V> toPair(@NotNull Map.Entry<K, V> entry) {
        return new Pair<>(entry.getKey(), entry.getValue());
    }
//
///**
// * Returns the value for the given key, or the result of the [defaultValue] function if there was no entry for the given key.
// *
// * @sample samples.collections.Maps.Usage.getOrElse
// */
//    @kotlin.internal.InlineOnly
//    public static <K, V> getOrElse(@Nullable Map<K, V> map, key: K, defaultValue: () -> V): V = get(key) ?: defaultValue()
//
//
//    internal static <K, V> getOrElseNullable(@Nullable Map<K, V> map, key: K, defaultValue: () -> V): V {
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
//    public static <K, V> getValue(@Nullable Map<K, V> map, key: K): V = getOrImplicitDefault(key)

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
//    public operator static <K, V> iterator(@Nullable Map<K, V> map, ): Iterator<Map.Entry<K, V>> = entries.iterator()
//
///**
// * Returns a [Iterator] over the mutable entries in the [Map].
// *
// */
//    @kotlin.jvm.JvmName("mutableIterator")
//    @kotlin.internal.InlineOnly
//    public operator static <K, V> Mutableiterator(@Nullable Map<K, V> map, ): Iterator<Map.Entry<K, V>> = entries.iterator()
//
//    /**
//     * Populates the given [destination] map with entries having the keys of this map and the values obtained
//     * by applying the [transform] function to each entry in this [Map].
//     */
//    public static <K, V, R, M : Map<K,  R>> mapValuesTo(@Nullable Map<K, V> map, destination: M, transform: (Map.Entry<K, V>) -> R): M {
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
//    public static <K, V, R, M : Map<R,  V>> mapKeysTo(@Nullable Map<K, V> map, destination: M, transform: (Map.Entry<K, V>) -> R): M {
//        return entries.associateByTo(destination, transform, { it.value })
//    }
//

    /**
     * Puts all the given [pairs] into this [Map] with the first component in the pair being the key and the second the value.
     */
    public static <K, V> void putAll(@NotNull Map<K, V> map, @Nullable Pair<K, V>[] pairs) {
        if (pairs != null) {
            for (Pair<K, V> pair : pairs) {
                map.put(pair.first, pair.second);
            }
        }
    }

    /**
     * Puts all the elements of the given collection into this [Map] with the first component in the pair being the key and the second the value.
     */
    public static <K, V> void putAll(@NotNull Map<K, V> map, @Nullable Iterable<Pair<K, V>> pairs) {
        if (pairs != null) {
            for (Pair<K, V> pair : pairs) {
                map.put(pair.first, pair.second);
            }
        }
    }


    /**
     * Puts all the elements of the given sequence into this [Map] with the first component in the pair being the key and the second the value.
     */
    public static <K, V> void putAll(@NotNull Map<K, V> map, @Nullable Sequence<Pair<K, V>> pairs) {
        if (pairs != null) {
            for (Pair<K, V> pair : pairs) {
                map.put(pair.first, pair.second);
            }
        }
    }
//
//    /**
//     * Returns a new map with entries having the keys of this map and the values obtained by applying the [transform]
//     * function to each entry in this [Map].
//     *
//     * The returned map preserves the entry iteration order of the original map.
//     *
//     * @sample samples.collections.Maps.Transformations.mapValues
//     */
//    public static <K, V, R> mapValues(@Nullable Map<K, V> map, transform: (Map.Entry<K, V>) -> R): Map<K, R> {
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
//    public static <K, V, R> mapKeys(@Nullable Map<K, V> map, transform: (Map.Entry<K, V>) -> R): Map<R, V> {
//        return mapKeysTo(LinkedHashMap<R, V>(mapCapacity(size)), transform) // .optimizeReadOnlyMap()
//    }
//
//    /**
//     * Returns a map containing all key-value pairs with keys matching the given [predicate].
//     *
//     * The returned map preserves the entry iteration order of the original map.
//     * @sample samples.collections.Maps.Filtering.filterKeys
//     */
//    public static <K, V> filterKeys(@Nullable Map<K, V> map, predicate: (K) -> Boolean): Map<K, V> {
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
//    public static <K, V> filterValues(@Nullable Map<K, V> map, predicate: (V) -> Boolean): Map<K, V> {
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
//    public static <K, V, M : Map<K,  V>> filterTo(@Nullable Map<K, V> map, destination: M, @NotNull Predicate<Map.Entry<K, V>> predicate): M {
//        for (Map.Entry<K, V> element : map.entrySet()) {
//            if (predicate.accept(element)) {
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
//    public static <K, V> filter(@Nullable Map<K, V> map, @NotNull Predicate<Map.Entry<K, V>> predicate): Map<K, V> {
//        return filterTo(LinkedHashMap<K, V>(), predicate)
//    }
//
//    /**
//     * Appends all entries not matching the given [predicate] into the given [destination].
//     *
//     * @return the destination map.
//     * @sample samples.collections.Maps.Filtering.filterNotTo
//     */
//    public static <K, V, M : Map<K,  V>> filterNotTo(@Nullable Map<K, V> map, destination: M, @NotNull Predicate<Map.Entry<K, V>> predicate): M {
//        for (Map.Entry<K, V> element : map.entrySet()) {
//            if (!predicate.accept(element)) {
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
//    public static <K, V> filterNot(@Nullable Map<K, V> map, @NotNull Predicate<Map.Entry<K, V>> predicate): Map<K, V> {
//        return filterNotTo(LinkedHashMap<K, V>(), predicate)
//    }


    /**
     * Returns a new map containing all key-value pairs from the given collection of pairs.
     * <p>
     * The returned map preserves the entry iteration order of the original collection.
     */
    public static <K, V> Map<K, V> toMap(@Nullable Iterable<Pair<K, V>> pairs) {
        if (pairs instanceof Collection) {
            int size = Collectionx.count(pairs);
            if (size == 0) {
                return mutableMapOf();
            } else if (size == 1) {
                return mutableMapOf(Collectionx.first(pairs));
            } else {
                return toMap(pairs, new LinkedHashMap<K, V>(capacity(size)));
            }
        } else {
            return toMap(pairs, new LinkedHashMap<K, V>());
        }
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs from the given collection of pairs.
     */
    @NotNull
    public static <K, V, M extends Map<K, V>> M toMap(@Nullable Iterable<Pair<K, V>> pairs, @NotNull M destination) {
        putAll(destination, pairs);
        return destination;
    }

    /**
     * Returns a new map containing all key-value pairs from the given array of pairs.
     * <p>
     * The returned map preserves the entry iteration order of the original array.
     */
    public static <K, V> Map<K, V> toMap(@Nullable Pair<K, V>... pairs) {
        if (pairs == null || pairs.length == 0) {
            return mutableMapOf();
        } else if (pairs.length == 1) {
            return mutableMapOf(pairs[0]);
        } else {
            return toMap(pairs, new LinkedHashMap<K, V>(capacity(pairs.length)));
        }
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs from the given array of pairs.
     */
    public static <K, V, M extends Map<K, V>> M toMap(@Nullable Pair<K, V>[] pairs, @NotNull M destination) {
        putAll(destination, pairs);
        return destination;
    }


    /**
     * Returns a new map containing all key-value pairs from the given sequence of pairs.
     * <p>
     * The returned map preserves the entry iteration order of the original sequence.
     */
    public static <K, V> Map<K, V> toMap(@Nullable Sequence<Pair<K, V>> pairs) {
        return toMap(pairs, new LinkedHashMap<K, V>());
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs from the given sequence of pairs.
     */
    public static <K, V, M extends Map<K, V>> M toMap(@Nullable Sequence<Pair<K, V>> pairs, @NotNull M destination) {
        putAll(destination, pairs);
        return destination;
    }

    /**
     * Returns a new mutable map containing all key-value pairs from the original map.
     * <p>
     * The returned map preserves the entry iteration order of the original map.
     */
    @NotNull
    public static <K, V> Map<K, V> toMap(@Nullable Map<K, V> map) {
        if (isNullOrEmpty(map)) {
            return mutableMapOf();
        } else if (map.size() == 1) {
            return toSingletonMap(map);
        } else {
            return new LinkedHashMap<>(map);
        }
    }

//    /**
//     * Returns a new mutable map containing all key-value pairs from the original map.
//     *
//     * The returned map preserves the entry iteration order of the original map.
//     */
//    @NotNull
//    public static <K, V> Map<K, V> toMutableMap(@Nullable Map<K, V> map){
//        return map != null ? new LinkedHashMap<>(map) : new LinkedHashMap<K, V>();
//    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs from the given map.
     */
    @NotNull
    public static <K, V, M extends Map<K, V>> M toMap(@Nullable Map<K, V> map, @NotNull M destination) {
        if (map != null) destination.putAll(map);
        return destination;
    }

    /*
     * creates a singleton copy of map, if there is specialization available in target platform, otherwise returns itself
     */
    public static <K, V> Map<K, V> toSingletonMapOrSelf(Map<K, V> map) {
        return toSingletonMap(map);
    }

    /*
     * creates a singleton copy of map
     */
    public static <K, V> Map<K, V> toSingletonMap(@NotNull Map<K, V> map) {
        Map.Entry<K, V> entry = map.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }


    /**
     * Creates a new read-only map by replacing or adding an entry to this map from a given key-value [pair].
     * <p>
     * The returned map preserves the entry iteration order of the original map.
     * The [pair] is iterated in the end if it has a unique key.
     */
    @NotNull
    public static <K, V> Map<K, V> plus(@Nullable Map<K, V> map, @Nullable Pair<K, V> pair) {
        Map<K, V> newMap = toMap(map);
        plusAssign(newMap, pair);
        return newMap;
    }

    /**
     * Creates a new read-only map by replacing or adding entries to this map from a given collection of key-value [pairs].
     * <p>
     * The returned map preserves the entry iteration order of the original map.
     * Those [pairs] with unique keys are iterated in the end in the order of [pairs] collection.
     */
    @NotNull
    public static <K, V> Map<K, V> plus(@Nullable Map<K, V> map, @Nullable Iterable<Pair<K, V>> pairs) {
        Map<K, V> newMap = toMap(map);
        plusAssign(newMap, pairs);
        return newMap;
    }

    /**
     * Creates a new read-only map by replacing or adding entries to this map from a given array of key-value [pairs].
     * <p>
     * The returned map preserves the entry iteration order of the original map.
     * Those [pairs] with unique keys are iterated in the end in the order of [pairs] array.
     */
    @NotNull
    public static <K, V> Map<K, V> plus(@Nullable Map<K, V> map, @Nullable Pair<K, V>[] pairs) {
        Map<K, V> newMap = toMap(map);
        plusAssign(newMap, pairs);
        return newMap;
    }

    /**
     * Creates a new read-only map by replacing or adding entries to this map from a given sequence of key-value [pairs].
     * <p>
     * The returned map preserves the entry iteration order of the original map.
     * Those [pairs] with unique keys are iterated in the end in the order of [pairs] sequence.
     */
    public static <K, V> Map<K, V> plus(@Nullable Map<K, V> map, @Nullable Sequence<Pair<K, V>> pairs) {
        Map<K, V> newMap = toMap(map);
        plusAssign(newMap, pairs);
        return newMap;
    }

    /**
     * Creates a new read-only map by replacing or adding entries to this map from another [map].
     * <p>
     * The returned map preserves the entry iteration order of the original map.
     * Those entries of another [map] that are missing in this map are iterated in the end in the order of that [map].
     */
    public static <K, V> Map<K, V> plus(@Nullable Map<K, V> map, @Nullable Map<K, V> otherMap) {
        Map<K, V> newMap = toMap(map);
        if (otherMap != null) newMap.putAll(otherMap);
        return newMap;
    }


    /**
     * Appends or replaces the given [pair] in this mutable map.
     */
    public static <K, V> void plusAssign(@NotNull Map<K, V> map, @Nullable Pair<K, V> pair) {
        if (pair != null) {
            map.put(pair.first, pair.second);
        }
    }

    /**
     * Appends or replaces all pairs from the given collection of [pairs] in this mutable map.
     */
    public static <K, V> void plusAssign(@NotNull Map<K, V> map, @Nullable Iterable<Pair<K, V>> pairs) {
        putAll(map, pairs);
    }

    /**
     * Appends or replaces all pairs from the given array of [pairs] in this mutable map.
     */
    public static <K, V> void plusAssign(@NotNull Map<K, V> map, @Nullable Pair<K, V>[] pairs) {
        putAll(map, pairs);
    }


    /**
     * Appends or replaces all pairs from the given sequence of [pairs] in this mutable map.
     */
    public static <K, V> void plusAssign(@NotNull Map<K, V> map, @Nullable Sequence<Pair<K, V>> pairs) {
        putAll(map, pairs);
    }

    /**
     * Appends or replaces all entries from the given [map] in this mutable map.
     */
    public static <K, V> void plusAssign(@NotNull Map<K, V> map, @Nullable Map<K, V> otherMap) {
        if (otherMap != null) map.putAll(otherMap);
    }


    /**
     * Returns a map containing all entries of the original map except the entry with the given [key].
     * <p>
     * The returned map preserves the entry iteration order of the original map.
     */
    public static <K, V> Map<K, V> minus(@Nullable Map<K, V> map, @NotNull K key) {
        Map<K, V> newMap = toMap(map);
        minusAssign(newMap, key);
        return newMap;
    }

    /**
     * Returns a map containing all entries of the original map except those entries
     * the keys of which are contained in the given [keys] collection.
     * <p>
     * The returned map preserves the entry iteration order of the original map.
     */
    public static <K, V> Map<K, V> minus(@Nullable Map<K, V> map, @Nullable Iterable<K> keys) {
        Map<K, V> newMap = toMap(map);
        minusAssign(newMap, keys);
        return newMap;
    }

    /**
     * Returns a map containing all entries of the original map except those entries
     * the keys of which are contained in the given [keys] array.
     * <p>
     * The returned map preserves the entry iteration order of the original map.
     */
    public static <K, V> Map<K, V> minus(@Nullable Map<K, V> map, @Nullable K[] keys) {
        Map<K, V> newMap = toMap(map);
        minusAssign(newMap, keys);
        return newMap;
    }


    /**
     * Returns a map containing all entries of the original map except those entries
     * the keys of which are contained in the given [keys] sequence.
     * <p>
     * The returned map preserves the entry iteration order of the original map.
     */
    public static <K, V> Map<K, V> minus(@Nullable Map<K, V> map, @Nullable Sequence<K> keys) {
        Map<K, V> newMap = toMap(map);
        minusAssign(newMap, keys);
        return newMap;
    }

    /**
     * Removes the entry with the given [key] from this mutable map.
     */
    public static <K, V> void minusAssign(@Nullable Map<K, V> map, @NotNull K key) {
        if (map != null) {
            map.remove(key);
        }
    }

    /**
     * Removes all entries the keys of which are contained in the given [keys] collection from this mutable map.
     */
    public static <K, V> void minusAssign(@Nullable Map<K, V> map, @Nullable Iterable<K> keys) {
        if (map != null) {
            Collectionx.removeAll(map.keySet(), keys);
        }
    }

    /**
     * Removes all entries the keys of which are contained in the given [keys] array from this mutable map.
     */
    public static <K, V> void minusAssign(@Nullable Map<K, V> map, @Nullable K[] keys) {
        if (map != null) {
            Collectionx.removeAll(map.keySet(), keys);
        }
    }

    /**
     * Removes all entries from the keys of which are contained in the given [keys] sequence from this mutable map.
     */
    public static <K, V> void minusAssign(@Nullable Map<K, V> map, @Nullable Sequence<K> keys) {
        if (map != null) {
            Collectionx.removeAll(map.keySet(), keys);
        }
    }


//    // do not expose for now @PublishedApi
//    private static <K, V> Map<K, V> optimizeReadOnlyMap(@Nullable Map<K, V> map, ) = when (size) {
//        0 -> emptyMap()
//        1 -> toSingletonMapOrSelf()
//    else -> this
//    }


    /**
     * Returns a [List] containing all key-value pairs.
     */
    public static <K, V> List<Pair<K, V>> toList(@Nullable Map<K, V> map) {
        if (map == null || map.size() == 0) return Collectionx.arrayListOf();

        Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();
        if (!iterator.hasNext()) return Collectionx.arrayListOf();

        Map.Entry<K, V> first = iterator.next();
        if (!iterator.hasNext()) return Collectionx.mutableListOf(toPair(first));

        ArrayList<Pair<K, V>> result = new ArrayList<>(count(map));
        result.add(toPair(first));
        do {
            result.add(toPair(iterator.next()));
        } while (iterator.hasNext());
        return result;
    }


    /**
     * Returns a single list of all elements yielded from results of [transform] function being invoked on each entry of original map.
     */
    @NotNull
    public static <K, V, R> List<R> flatMap(@Nullable Map<K, V> map, @NotNull Transformer<Map.Entry<K, V>, Iterable<R>> transform) {
        return flatMapTo(map, new ArrayList<R>(), transform);
    }

    /**
     * Appends all elements yielded from results of [transform] function being invoked on each entry of original map, to the given [destination].
     */
    @NotNull
    public static <K, V, R, C extends Collection<R>> C flatMapTo(@Nullable Map<K, V> map, @NotNull C destination, Transformer<Map.Entry<K, V>, Iterable<R>> transform) {
        if (map != null) {
            for (Map.Entry<K, V> element : map.entrySet()) {
                Iterable<R> list = transform.transform(element);
                Collectionx.addAll(destination, list);
            }
        }
        return destination;
    }


    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each entry in the original map.
     */
    @NotNull
    public static <K, V, R> List<R> map(@NotNull Map<K, V> map, @NotNull Transformer<Map.Entry<K, V>, R> transformer) {
        return mapTo(map, new ArrayList<R>(count(map)), transformer);
    }

    /**
     * Returns a list containing only the non-null results of applying the given [transform] function
     * to each entry in the original map.
     */
    public static <K, V, R> List<R> mapNotNull(@Nullable Map<K, V> map, @NotNull NullableTransformer<Map.Entry<K, V>, R> transform) {
        return mapNotNullTo(map, new ArrayList<R>(), transform);
    }

    /**
     * Applies the given [transform] function to each entry in the original map
     * and appends only the non-null results to the given [destination].
     */
    @NotNull
    public static <K, V, R, C extends Collection<R>> C mapNotNullTo(@Nullable Map<K, V> map, @NotNull final C destination, @NotNull final NullableTransformer<Map.Entry<K, V>, R> transform) {
        forEach(map, new Action<Map.Entry<K, V>>() {
            @Override
            public void action(@NotNull Map.Entry<K, V> element) {
                R r = transform.transform(element);
                if (r != null) destination.add(r);
            }
        });
        return destination;
    }

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

    /**
     * Returns `true` if all entries match the given [predicate].
     */
    public static <K, V> boolean all(@Nullable Map<K, V> map, @NotNull Predicate<Map.Entry<K, V>> predicate) {
        if (map == null || map.isEmpty()) return true;
        for (Map.Entry<K, V> element : map.entrySet()) if (!predicate.accept(element)) return false;
        return true;
    }

    /**
     * Returns `true` if map has at least one entry.
     */
    public static <K, V> boolean any(@Nullable Map<K, V> map) {
        return map != null && !map.isEmpty();
    }

    /**
     * Returns `true` if at least one entry matches the given [predicate].
     */
    public static <K, V> boolean any(@Nullable Map<K, V> map, @NotNull Predicate<Map.Entry<K, V>> predicate) {
        if (map == null || map.isEmpty()) return false;
        for (Map.Entry<K, V> element : map.entrySet()) if (predicate.accept(element)) return true;
        return false;
    }

    /**
     * Returns the number of entries in this map.
     */
    public static <K, V> int count(@Nullable Map<K, V> map) {
        return map != null ? map.size() : 0;
    }

    /**
     * Returns the number of entries matching the given [predicate].
     */
    public static <K, V> int count(@Nullable Map<K, V> map, @NotNull Predicate<Map.Entry<K, V>> predicate) {
        if (map == null || map.isEmpty()) return 0;
        int count = 0;
        for (Map.Entry<K, V> element : map.entrySet()) if (predicate.accept(element)) count++;
        return count;
    }


    /**
     * Performs the given [action] on each entry.
     */
    public static <K, V> void forEach(@Nullable Map<K, V> map, @NotNull Action<Map.Entry<K, V>> action) {
        if (map != null) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                action.action(entry);
            }
        }
    }

    /**
     * Returns the first entry yielding the largest value of the given function or `null` if there are no entries.
     */
    @Nullable
    public static <K, V, R extends Comparable<R>> Map.Entry<K, V> maxBy(@Nullable Map<K, V> map, @NotNull Transformer<Map.Entry<K, V>, R> selector) {
        return Collectionx.maxBy(map != null ? map.entrySet() : null, selector);
    }

    /**
     * Returns the first entry having the largest value according to the provided [comparator] or `null` if there are no entries.
     */
    @Nullable
    public static <K, V> Map.Entry<K, V> maxWith(@Nullable Map<K, V> map, @NotNull Comparator<Map.Entry<K, V>> comparator) {
        return Collectionx.maxWith(map != null ? map.entrySet() : null, comparator);
    }

    /**
     * Returns the first entry yielding the smallest value of the given function or `null` if there are no entries.
     */
    @Nullable
    public static <K, V, R extends Comparable<R>> Map.Entry<K, V> minBy(@Nullable Map<K, V> map, @NotNull Transformer<Map.Entry<K, V>, R> selector) {
        return Collectionx.minBy(map != null ? map.entrySet() : null, selector);
    }

    /**
     * Returns the first entry having the smallest value according to the provided [comparator] or `null` if there are no entries.
     */
    @Nullable
    public static <K, V> Map.Entry<K, V> minWith(@Nullable Map<K, V> map, @NotNull Comparator<Map.Entry<K, V>> comparator) {
        return Collectionx.minWith(map != null ? map.entrySet() : null, comparator);
    }

    /**
     * Returns `true` if the map has no entries.
     */
    public static <K, V> boolean none(@Nullable Map<K, V> map) {
        return map == null || map.isEmpty();
    }


    /**
     * Returns `true` if no entries match the given [predicate].
     */
    public static <K, V> boolean none(@Nullable Map<K, V> map, Predicate<Map.Entry<K, V>> predicate) {
        if (map == null || map.isEmpty()) return true;
        for (Map.Entry<K, V> element : map.entrySet()) {
            if (predicate.accept(element)) return false;
        }
        return true;
    }


    /**
     * Performs the given [action] on each entry and returns the map itself afterwards.
     */
    @NotNull
    public static <K, V, M extends Map<K, V>> M onEach(@NotNull M m, Action<Map.Entry<K, V>> action) {
        for (Map.Entry<K, V> element : m.entrySet()) {
            action.action(element);
        }
        return m;
    }


    /**
     * Creates an [Iterable] instance that wraps the original map returning its entries when being iterated.
     */
    @NotNull
    public static <K, V> Iterable<Map.Entry<K, V>> asIterable(@NotNull Map<K, V> map) {
        return map.entrySet();
    }

    // TODO: 2018/11/28 Sequence
//
//    /**
//     * Creates a [Sequence] instance that wraps the original map returning its entries when being iterated.
//     */
//    public static <K, V> asSequence(@Nullable Map<K, V> map, ): Sequence<Map.Entry<K, V>> {
//        return entries.asSequence()
//    }
}
