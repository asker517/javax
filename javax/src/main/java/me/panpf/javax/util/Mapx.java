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

import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * Map tool method
 */
@SuppressWarnings({"WeakerAccess", "UnusedReturnValue"})
public class Mapx {

    public static final int INT_MAX_POWER_OF_TWO = Integer.MAX_VALUE / 2 + 1;

    private Mapx() {
    }

    /**
     * Create a MapBuilder
     */
    @NotNull
    public static <K, V> MapBuilder<K, V> builder(K k, V v) {
        return new MapBuilder<>(k, v);
    }


    /*
     * *****************************************************************************************************************
     * From kotlin standard library
     * *****************************************************************************************************************
     */


    /**
     * Calculate the initial capacity of a map, based on Guava's com.google.common.collect.Maps approach. This is equivalent
     * to the Collection constructor for HashSet, (c.size()/.75f) + 1, but provides further optimisations for very small or
     * very large sizes, allows support non-collection classes, and provides consistency for all map based class construction.
     */
    public static int mapCapacity(int expectedSize) {
        if (expectedSize < 3) {
            return expectedSize + 1;
        }
        if (expectedSize < INT_MAX_POWER_OF_TWO) {
            return expectedSize + expectedSize / 3;
        }
        return Integer.MAX_VALUE; // any large value
    }

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

    public static <K, V> Map<K, V> put(Map<K, V> map, Pair<K, V> pair) {
        map.put(pair.first, pair.second);
        return map;
    }

    /**
     * Traversing Map
     */
    public static <K, V> void forEach(@NotNull Map<K, V> map, @NotNull Action2<K, V> action) {
        for (K k : map.keySet()) {
            V v = map.get(k);
            action.action(k, v);
        }
    }

    /**
     * Traversing Map
     */
    public static <K, V> void forEachIndexed(@NotNull Map<K, V> map, @NotNull IndexedAction2<K, V> action) {
        int index = 0;
        for (K k : map.keySet()) {
            V v = map.get(k);
            action.action(index++, k, v);
        }
    }

    public static <K, V, R, D extends Collection<R>> D mapTo(@NotNull Map<K, V> map, D destination, @NotNull Transformer2<K, V, R> transformer) {
        for (K k : map.keySet()) {
            V v = map.get(k);
            destination.add(transformer.transform(k, v));
        }
        return destination;
    }

    public static <K, V, R> List<R> map(@NotNull Map<K, V> map, @NotNull Transformer2<K, V, R> transformer) {
        return mapTo(map, new ArrayList<R>(), transformer);
    }

    public static <K, V, R, D extends Collection<R>> D mapIndexedTo(@NotNull Map<K, V> map, D destination, @NotNull IndexedTransformer2<K, V, R> transformer) {
        int index = 0;
        for (K k : map.keySet()) {
            V v = map.get(k);
            destination.add(transformer.transform(index++, k, v));
        }
        return destination;
    }

    public static <K, V, R> List<R> mapIndexed(@NotNull Map<K, V> map, @NotNull IndexedTransformer2<K, V, R> transformer) {
        return mapIndexedTo(map, new ArrayList<R>(), transformer);
    }
}
