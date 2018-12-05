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

@file:Suppress("RemoveRedundantSpreadOperator")

package me.panpf.javax.test.collections

import me.panpf.javax.collections.Collectionx
import me.panpf.javax.test.Assertx.assertThreeEquals
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.*
import kotlin.Comparator
import kotlin.collections.LinkedHashSet

class CollectionxTest {


    /*
     * *****************************************************************************************************************
     * From kotlin standard library
     * *****************************************************************************************************************
     */


    @Test
    fun testListOf() {
        assertThreeEquals(0, Collectionx.immutableListOf<String>().size, listOf<String>().size)
        assertEquals(Collections.EMPTY_LIST::class.java.name, Collectionx.immutableListOf<String>()::class.java.name)
        assertEquals(emptyList<String>()::class.java.name, listOf<String>()::class.java.name)
        try {
            Collectionx.immutableListOf<String>().add("3")
            Assert.fail()
        } catch (e: Exception) {
        }

        assertThreeEquals(1, Collectionx.immutableListOf("1").size, listOf("1").size)
        assertThreeEquals(Collections.singletonList("1")::class.java.name, Collectionx.immutableListOf("1")::class.java.name, listOf("1")::class.java.name)
        try {
            Collectionx.immutableListOf("1").add("3")
            Assert.fail()
        } catch (e: Exception) {
        }

        assertThreeEquals(1, Collectionx.immutableListOf(null as String?).size, listOf(null as String?).size)
        assertThreeEquals(Collections.singletonList("1")::class.java.name, Collectionx.immutableListOf(null as String?)::class.java.name, listOf(null as String?)::class.java.name)
        try {
            Collectionx.immutableListOf(null as String?).add("3")
            Assert.fail()
        } catch (e: Exception) {
        }

        assertThreeEquals(2, Collectionx.immutableListOf("1", "2").size, listOf("1", "2").size)
        assertThreeEquals(Arrays.asList("1", "2")::class.java.name, Collectionx.immutableListOf("1", "2")::class.java.name, listOf("1", "2")::class.java.name)
        try {
            Collectionx.immutableListOf("1", "2").add("3")
            Assert.fail()
        } catch (e: Exception) {
        }

        assertThreeEquals(0, Collectionx.immutableListOf(*arrayOf<String>()).size, listOf(*arrayOf<String>()).size)
        assertEquals(Collections.EMPTY_LIST::class.java.name, Collectionx.immutableListOf(*arrayOf<String>())::class.java.name)
        assertEquals(emptyList<String>()::class.java.name, listOf(*arrayOf<String>())::class.java.name)
        try {
            Collectionx.immutableListOf(*arrayOf<String>()).add("3")
            Assert.fail()
        } catch (e: Exception) {
        }


        assertThreeEquals(0, Collectionx.mutableListOf<String>().size, mutableListOf<String>().size)
        assertThreeEquals(ArrayList::class.java.name, Collectionx.mutableListOf<String>()::class.java.name, mutableListOf<String>()::class.java.name)
        assertThreeEquals(1, Collectionx.mutableListOf<String>().apply { add("3") }.size, mutableListOf<String>().apply { add("3") }.size)

        assertThreeEquals(2, Collectionx.mutableListOf("1", "2").size, mutableListOf("1", "2").size)
        assertThreeEquals(ArrayList::class.java.name, Collectionx.mutableListOf("1", "2")::class.java.name, mutableListOf("1", "2")::class.java.name)
        assertThreeEquals(3, Collectionx.mutableListOf("1", "2").apply { add("3") }.size, mutableListOf("1", "2").apply { add("3") }.size)


        assertThreeEquals(0, Collectionx.arrayListOf<String>().size, arrayListOf<String>().size)
        assertThreeEquals(ArrayList::class.java.name, Collectionx.arrayListOf<String>()::class.java.name, arrayListOf<String>()::class.java.name)
        assertThreeEquals(1, Collectionx.arrayListOf<String>().apply { add("3") }.size, arrayListOf<String>().apply { add("3") }.size)

        assertThreeEquals(2, Collectionx.arrayListOf("1", "2").size, arrayListOf("1", "2").size)
        assertThreeEquals(ArrayList::class.java.name, Collectionx.arrayListOf("1", "2")::class.java.name, arrayListOf("1", "2")::class.java.name)
        assertThreeEquals(3, Collectionx.arrayListOf("1", "2").apply { add("3") }.size, arrayListOf("1", "2").apply { add("3") }.size)
    }

    @Test
    fun testSetOf() {
        assertThreeEquals(0, Collectionx.immutableSetOf<String>().size, setOf<String>().size)
        assertEquals(Collections.EMPTY_SET::class.java.name, Collectionx.immutableSetOf<String>()::class.java.name)
        assertEquals(emptySet<String>()::class.java.name, setOf<String>()::class.java.name)
        try {
            Collectionx.immutableSetOf<String>().add("3")
            Assert.fail()
        } catch (e: Exception) {
        }

        assertThreeEquals(1, Collectionx.immutableSetOf("1").size, setOf("1").size)
        assertThreeEquals(Collections.singleton("1")::class.java.name, Collectionx.immutableSetOf("1")::class.java.name, setOf("1")::class.java.name)
        try {
            Collectionx.immutableSetOf("1").add("3")
            Assert.fail()
        } catch (e: Exception) {
        }

        assertThreeEquals(1, Collectionx.immutableSetOf(null as String?).size, setOf(null as String?).size)
        assertThreeEquals(Collections.singleton("1")::class.java.name, Collectionx.immutableSetOf(null as String?)::class.java.name, setOf(null as String?)::class.java.name)
        try {
            Collectionx.immutableSetOf(null as String?).add("3")
            Assert.fail()
        } catch (e: Exception) {
        }

        assertThreeEquals(2, Collectionx.immutableSetOf("1", "2").size, setOf("1", "2").size)
        assertThreeEquals(LinkedHashSet::class.java.name, Collectionx.immutableSetOf("1", "2")::class.java.name, setOf("1", "2")::class.java.name)
        Collectionx.immutableSetOf("1", "2").add("3")
        (setOf("1", "2") as LinkedHashSet).add("3")

        assertThreeEquals(0, Collectionx.immutableSetOf(*arrayOf<String>()).size, setOf(*arrayOf<String>()).size)
        assertEquals(Collections.EMPTY_SET::class.java.name, Collectionx.immutableSetOf(*arrayOf<String>())::class.java.name)
        assertEquals(emptySet<String>()::class.java.name, setOf(*arrayOf<String>())::class.java.name)
        try {
            Collectionx.immutableSetOf(*arrayOf<String>()).add("3")
            Assert.fail()
        } catch (e: Exception) {
        }


        assertThreeEquals(0, Collectionx.mutableSetOf<String>().size, mutableSetOf<String>().size)
        assertThreeEquals(java.util.LinkedHashSet::class.java.name, Collectionx.mutableSetOf<String>()::class.java.name, mutableSetOf<String>()::class.java.name)
        assertThreeEquals(1, Collectionx.mutableSetOf<String>().apply { add("3") }.size, mutableSetOf<String>().apply { add("3") }.size)

        assertThreeEquals(2, Collectionx.mutableSetOf("1", "2").size, mutableSetOf("1", "2").size)
        assertThreeEquals(java.util.LinkedHashSet::class.java.name, Collectionx.mutableSetOf("1", "2")::class.java.name, mutableSetOf("1", "2")::class.java.name)
        assertThreeEquals(3, Collectionx.mutableSetOf("1", "2").apply { add("3") }.size, mutableSetOf("1", "2").apply { add("3") }.size)


        assertThreeEquals(0, Collectionx.hashSetOf<String>().size, hashSetOf<String>().size)
        assertThreeEquals(HashSet::class.java.name, Collectionx.hashSetOf<String>()::class.java.name, hashSetOf<String>()::class.java.name)
        assertThreeEquals(1, Collectionx.hashSetOf<String>().apply { add("3") }.size, hashSetOf<String>().apply { add("3") }.size)

        assertThreeEquals(2, Collectionx.hashSetOf("1", "2").size, hashSetOf("1", "2").size)
        assertThreeEquals(HashSet::class.java.name, Collectionx.hashSetOf("1", "2")::class.java.name, hashSetOf("1", "2")::class.java.name)
        assertThreeEquals(3, Collectionx.hashSetOf("1", "2").apply { add("3") }.size, hashSetOf("1", "2").apply { add("3") }.size)


        assertThreeEquals(0, Collectionx.linkedSetOf<String>().size, linkedSetOf<String>().size)
        assertThreeEquals(java.util.LinkedHashSet::class.java.name, Collectionx.linkedSetOf<String>()::class.java.name, linkedSetOf<String>()::class.java.name)
        assertThreeEquals(1, Collectionx.linkedSetOf<String>().apply { add("3") }.size, linkedSetOf<String>().apply { add("3") }.size)

        assertThreeEquals(2, Collectionx.linkedSetOf("1", "2").size, linkedSetOf("1", "2").size)
        assertThreeEquals(java.util.LinkedHashSet::class.java.name, Collectionx.linkedSetOf("1", "2")::class.java.name, linkedSetOf("1", "2")::class.java.name)
        assertThreeEquals(3, Collectionx.linkedSetOf("1", "2").apply { add("3") }.size, linkedSetOf("1", "2").apply { add("3") }.size)


        assertThreeEquals(0, Collectionx.sortedSetOf<String>().size, sortedSetOf<String>().size)
        assertThreeEquals(java.util.TreeSet::class.java.name, Collectionx.sortedSetOf<String>()::class.java.name, sortedSetOf<String>()::class.java.name)
        assertThreeEquals(1, Collectionx.sortedSetOf<String>().apply { add("3") }.size, sortedSetOf<String>().apply { add("3") }.size)

        assertThreeEquals(2, Collectionx.sortedSetOf("1", "2").size, sortedSetOf("1", "2").size)
        assertThreeEquals(java.util.TreeSet::class.java.name, Collectionx.sortedSetOf("1", "2")::class.java.name, sortedSetOf("1", "2")::class.java.name)
        assertThreeEquals(3, Collectionx.sortedSetOf("1", "2").apply { add("3") }.size, sortedSetOf("1", "2").apply { add("3") }.size)

        assertThreeEquals("2,1", Collectionx.sortedSetOf(Comparator { it1, it2 -> (it1.toInt() - it2.toInt()) * -1 }, "1", "2").joinToString(","),
                sortedSetOf(Comparator { it1, it2 -> (it1.toInt() - it2.toInt()) * -1 }, "1", "2").joinToString(","))
    }

    @Test
    fun testDrop() {
        val lists = listOf("1", "2", "3", "4")
        Assert.assertEquals(Collectionx.joinToArrayString(Collectionx.drop(lists, 2)), Collectionx.joinToArrayString(lists.drop(2)))
    }
}