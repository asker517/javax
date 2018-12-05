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

package me.panpf.javax.test.collections

import me.panpf.javax.collections.Collectionx
import me.panpf.javax.collections.Grouping
import me.panpf.javax.collections.Groupingx
import me.panpf.javax.collections.Mapx
import me.panpf.javax.test.Assertx.assertThreeEquals
import org.junit.Test

class GroupingxTest {

    @Test
    fun testAggregate() {
        val list = listOf("王五", "张三", "李四", "赵六", "李四", "王五", "张三", "李四", "张三")

        assertThreeEquals(Mapx.builder("王", 2).put("张", 3).put("李", 3).put("赵", 1).buildSortedMap(),
                Groupingx.aggregate(Collectionx.groupingBy(list) { it.first().toString() }) { _, accumulator: Int?, _, _ ->
                    (accumulator ?: 0) + 1
                }.toSortedMap(),
                list.groupingBy { it.first().toString() }.aggregate { _, accumulator: Int?, _, _ ->
                    (accumulator ?: 0) + 1
                }.toSortedMap())

        assertThreeEquals(Mapx.builder("王", 2).put("张", 3).put("李", 3).put("赵", 1).buildSortedMap(),
                Groupingx.aggregateTo(Collectionx.groupingBy(list) { it.first().toString() }, LinkedHashMap()) { _, accumulator: Int?, _, _ ->
                    (accumulator ?: 0) + 1
                }.toSortedMap(),
                list.groupingBy { it.first().toString() }.aggregateTo(LinkedHashMap()) { _, accumulator: Int?, _, _ ->
                    (accumulator ?: 0) + 1
                }.toSortedMap())

        assertThreeEquals(LinkedHashMap<String, Int>(),
                Groupingx.aggregateTo(null as Grouping<String, String>?, LinkedHashMap()) { _, accumulator: Int?, _, _ ->
                    (accumulator ?: 0) + 1
                }.toSortedMap(),
                listOf<String>().groupingBy { it.first().toString() }.aggregateTo(LinkedHashMap()) { _, accumulator: Int?, _, _ ->
                    (accumulator ?: 0) + 1
                }.toSortedMap())

        assertThreeEquals(Mapx.builder("王", 2).put("张", 3).put("李", 3).put("赵", 1).buildSortedMap(),
                Groupingx.aggregateTo(Collectionx.groupingBy(list) { it.first().toString() }, LinkedHashMap<String, Int?>().apply { put("王", null) }) { _, accumulator: Int?, _, _ ->
                    (accumulator ?: 0) + 1
                }.toSortedMap(),
                list.groupingBy { it.first().toString() }.aggregateTo(LinkedHashMap<String, Int?>().apply { put("王", null) }) { _, accumulator: Int?, _, _ ->
                    (accumulator ?: 0) + 1
                }.toSortedMap())
    }

    @Test
    fun testFold() {
        val list = listOf("王五", "张三", "李四", "赵六", "李四", "王五", "张三", "李四", "张三")

        assertThreeEquals(Mapx.builder("王", 12).put("张", 13).put("李", 13).put("赵", 11).buildSortedMap(),
                Groupingx.fold(Collectionx.groupingBy(list) { it.first().toString() }, { _, _ -> 10 }) { _, accumulator: Int, _ -> accumulator + 1 }.toSortedMap(),
                list.groupingBy { it.first().toString() }.fold({ _, _ -> 10 }) { _, accumulator: Int, _ ->
                    accumulator + 1
                }.toSortedMap())

        assertThreeEquals(Mapx.builder("王", 12).put("张", 13).put("李", 13).put("赵", 11).buildSortedMap(),
                Groupingx.fold(Collectionx.groupingBy(list) { it.first().toString() }, 10) { accumulator: Int, _ -> accumulator + 1 }.toSortedMap(),
                list.groupingBy { it.first().toString() }.fold(10) { accumulator: Int, _ ->
                    accumulator + 1
                }.toSortedMap())

        assertThreeEquals(Mapx.builder("王", 12).put("张", 13).put("李", 13).put("赵", 11).buildSortedMap(),
                Groupingx.foldTo(Collectionx.groupingBy(list) { it.first().toString() }, LinkedHashMap(), { _, _ -> 10 }) { _, accumulator: Int, _ ->
                    accumulator + 1
                }.toSortedMap(),
                list.groupingBy { it.first().toString() }.foldTo(LinkedHashMap(), { _, _ -> 10 }) { _, accumulator: Int, _ ->
                    accumulator + 1
                }.toSortedMap())

        assertThreeEquals(Mapx.builder("王", 12).put("张", 13).put("李", 13).put("赵", 11).buildSortedMap(),
                Groupingx.foldTo(Collectionx.groupingBy(list) { it.first().toString() }, LinkedHashMap(), 10) { accumulator: Int, _ ->
                    accumulator + 1
                }.toSortedMap(),
                list.groupingBy { it.first().toString() }.foldTo(LinkedHashMap(), 10) { accumulator: Int, _ ->
                    accumulator + 1
                }.toSortedMap())
    }

    @Test
    fun testReduce() {
        val list = listOf("王五", "张三", "李四", "赵六", "李四", "王五", "张三", "李四", "张三")

        assertThreeEquals(Mapx.builder("王", "王五王五").put("张", "张三张三张三").put("李", "李四李四李四").put("赵", "赵六").buildSortedMap(),
                Groupingx.reduce(Collectionx.groupingBy(list) { it.first().toString() }) { _, accumulator, element -> accumulator + element }.toSortedMap(),
                list.groupingBy { it.first().toString() }.reduce { _, accumulator, element -> accumulator + element }.toSortedMap())

        assertThreeEquals(Mapx.builder("王", "王五王五").put("张", "张三张三张三").put("李", "李四李四李四").put("赵", "赵六").buildSortedMap(),
                Groupingx.reduceTo(Collectionx.groupingBy(list) { it.first().toString() }, LinkedHashMap()) { _, accumulator, element -> accumulator + element }.toSortedMap(),
                list.groupingBy { it.first().toString() }.reduceTo(LinkedHashMap()) { _, accumulator, element -> accumulator + element }.toSortedMap())
    }

    @Test
    fun testEachCount() {
        val list = listOf("王五", "张三", "李四", "赵六", "李四", "王五", "张三", "李四", "张三")

        assertThreeEquals(Mapx.builder("王", 2).put("张", 3).put("李", 3).put("赵", 1).buildSortedMap(),
                Groupingx.eachCount(Collectionx.groupingBy(list) { it.first().toString() }).toSortedMap(),
                list.groupingBy { it.first().toString() }.eachCount().toSortedMap())

        assertThreeEquals(Mapx.builder("王", 2).put("张", 3).put("李", 3).put("赵", 1).buildSortedMap(),
                Groupingx.eachCountTo(Collectionx.groupingBy(list) { it.first().toString() }, LinkedHashMap()).toSortedMap(),
                list.groupingBy { it.first().toString() }.eachCountTo(LinkedHashMap()).toSortedMap())
    }
}