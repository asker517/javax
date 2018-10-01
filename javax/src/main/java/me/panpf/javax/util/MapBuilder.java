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

import java.util.*;

@SuppressWarnings({"WeakerAccess", "UnusedReturnValue"})
public class MapBuilder<K, V> {

    private List<Pair<K, V>> list = new LinkedList<>();

    public MapBuilder(K k, V v) {
        put(k, v);
    }

    public MapBuilder<K, V> put(K k, V v) {
        list.add(new Pair<>(k, v));
        return this;
    }

    public Map<K, V> build() {
        Map<K, V> map = new HashMap<>();
        for (Pair<K, V> pair : list) {
            map.put(pair.first, pair.second);
        }
        return map;
    }

    public WeakHashMap<K, V> buildWeak() {
        WeakHashMap<K, V> map = new WeakHashMap<>();
        for (Pair<K, V> pair : list) {
            map.put(pair.first, pair.second);
        }
        return map;
    }

    public LinkedHashMap<K, V> buildLinked() {
        LinkedHashMap<K, V> map = new LinkedHashMap<>();
        for (Pair<K, V> pair : list) {
            map.put(pair.first, pair.second);
        }
        return map;
    }

    public Hashtable<K, V> buildTable() {
        Hashtable<K, V> map = new Hashtable<>();
        for (Pair<K, V> pair : list) {
            map.put(pair.first, pair.second);
        }
        return map;
    }

    public TreeMap<K, V> buildTree() {
        TreeMap<K, V> map = new TreeMap<>();
        for (Pair<K, V> pair : list) {
            map.put(pair.first, pair.second);
        }
        return map;
    }
}
