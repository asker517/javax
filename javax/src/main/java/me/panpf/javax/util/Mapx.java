package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

import java.util.Map;

@SuppressWarnings("WeakerAccess")
public class Mapx {

    public static final int INT_MAX_POWER_OF_TWO = Integer.MAX_VALUE / 2 + 1;

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
}
