@file:Suppress("RemoveRedundantSpreadOperator")

package me.panpf.javax.test.collections

import me.panpf.javax.collections.Collectionx
import me.panpf.javax.collections.Mapx
import me.panpf.javax.test.Assertx.assertThreeEquals
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.fail
import org.junit.Test
import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.LinkedHashMap

class MapxTest {

    @Test
    fun testBuilder() {
        assertEquals(1, Mapx.builder("1", "111").buildHashMap().size.toLong())
        assertEquals(3, Mapx.builder("1", "111").put("2", "222").put("3", "333").buildHashMap().size.toLong())
        assertEquals("333", Mapx.builder("1", "111").put("2", "222").put("3", "333").buildHashMap()["3"])

        assertNotEquals("1, 3, 2", Mapx.builder("1", "111").put("3", "333").put("2", "222").buildHashMap().map { entry -> entry.key }.joinToString())
        assertNotEquals("1, 3, 2", Mapx.builder("1", "111").put("3", "333").put("2", "222").buildWeakHashMap().map { entry -> entry.key }.joinToString())
        assertNotEquals("1, 3, 2", Mapx.builder("1", "111").put("3", "333").put("2", "222").buildHashtable().map { entry -> entry.key }.joinToString())
        assertEquals("1, 3, 2", Mapx.builder("1", "111").put("3", "333").put("2", "222").buildLinkedHashMap().map { entry -> entry.key }.joinToString())
        assertEquals("1, 2, 3", Mapx.builder("1", "111").put("3", "333").put("2", "222").buildTreeMap().map { entry -> entry.key }.joinToString())
        assertEquals("1, 2, 3", Mapx.builder("3", "333").put("1", "111").put("2", "222").buildTreeMap().map { entry -> entry.key }.joinToString())
        assertEquals("1, 2, 3", Mapx.builder("3", "333").put("1", "111").put("2", "222").buildSortedMap().map { entry -> entry.key }.joinToString())
    }

        Assert.assertEquals(Collectionx.joinToString(Mapx.map(Mapx.builder("1", "111").put("3", "333").put("2", "222").buildTree()) { entry -> entry.key }), "1, 2, 3")

        Assert.assertEquals(Collectionx.joinToString(Mapx.map(Mapx.builder("3", "333").put("1", "111").put("2", "222").buildTree()) { entry -> entry.key }), "1, 2, 3")

        Assert.assertEquals(Collectionx.joinToString(Mapx.map(Mapx.builder("3", "333").put("1", "111").put("2", "222").buildSorted()) { entry -> entry.key }), "1, 2, 3")
    }


    /*
     * *****************************************************************************************************************
     * From kotlin standard library
     * *****************************************************************************************************************
     */


    @Test
    fun testMapOf() {
        assertThreeEquals(0, Mapx.immutableMapOf<String, String>().size, mapOf<String, String>().size)
        assertEquals(Collections.EMPTY_MAP::class.java.name, Mapx.immutableMapOf<String, String>()::class.java.name)
        assertEquals(emptyMap<String, String>()::class.java.name, mapOf<String, String>()::class.java.name)
        try {
            Mapx.immutableMapOf<String, String>()["key3"] = "value3"
            fail()
        } catch (e: Exception) {
        }

        assertThreeEquals(1, Mapx.immutableMapOf(me.panpf.javax.util.Pair("key", "value")).size,
                mapOf(kotlin.Pair("key", "value")).size)
        assertThreeEquals(Collections.singletonMap("key", "value")::class.java.name,
                Mapx.immutableMapOf(me.panpf.javax.util.Pair("key", "value"))::class.java.name,
                mapOf(kotlin.Pair("key", "value"))::class.java.name)
        try {
            Mapx.immutableMapOf(me.panpf.javax.util.Pair("key", "value"))["key3"] = "value3"
            fail()
        } catch (e: Exception) {
        }

        assertThreeEquals(2, Mapx.immutableMapOf(me.panpf.javax.util.Pair("key", "value"), me.panpf.javax.util.Pair("key2", "value2")).size,
                mapOf(kotlin.Pair("key", "value"), kotlin.Pair("key2", "value2")).size)
        assertThreeEquals(LinkedHashMap::class.java.name,
                Mapx.immutableMapOf(me.panpf.javax.util.Pair("key", "value"), me.panpf.javax.util.Pair("key2", "value2"))::class.java.name,
                mapOf(kotlin.Pair("key", "value"), kotlin.Pair("key2", "value2"))::class.java.name)
        Mapx.immutableMapOf(me.panpf.javax.util.Pair("key", "value"), me.panpf.javax.util.Pair("key2", "value2"))["key3"] = "value3"
        (mapOf(kotlin.Pair("key", "value"), kotlin.Pair("key2", "value2")) as LinkedHashMap)["key3"] = "value3"

        assertThreeEquals(0, Mapx.immutableMapOf(*arrayOf<me.panpf.javax.util.Pair<String, String>>()).size,
                mapOf(*arrayOf<Pair<String, String>>()).size)
        assertEquals(Collections.EMPTY_MAP::class.java.name, Mapx.immutableMapOf(*arrayOf<me.panpf.javax.util.Pair<String, String>>())::class.java.name)
        assertEquals(emptyMap<String, String>()::class.java.name, mapOf(*arrayOf<Pair<String, String>>())::class.java.name)
        try {
            Mapx.immutableMapOf(*arrayOf<me.panpf.javax.util.Pair<String, String>>())["key3"] = "value3"
            fail()
        } catch (e: Exception) {
        }

        try {
            Mapx.immutableMapOf<String, String>(null)
            fail()
        } catch (e: Exception) {
        }


        assertThreeEquals(0, Mapx.mutableMapOf<String, String>().size, mutableMapOf<String, String>().size)
        assertThreeEquals(LinkedHashMap::class.java.name, Mapx.mutableMapOf<String, String>()::class.java.name, mutableMapOf<String, String>()::class.java.name)
        assertThreeEquals(1, Mapx.mutableMapOf<String, String>().apply { put("key3", "value3") }.size, mutableMapOf<String, String>().apply { put("key3", "value3") }.size)

        assertThreeEquals(2, Mapx.mutableMapOf<String, String>(me.panpf.javax.util.Pair("key", "value"), me.panpf.javax.util.Pair("key2", "value2")).size,
                mutableMapOf(kotlin.Pair("key", "value"), kotlin.Pair("key2", "value2")).size)
        assertThreeEquals(LinkedHashMap::class.java.name, Mapx.mutableMapOf<String, String>(me.panpf.javax.util.Pair("key", "value"), me.panpf.javax.util.Pair("key2", "value2"))::class.java.name,
                mutableMapOf(kotlin.Pair("key", "value"), kotlin.Pair("key2", "value2"))::class.java.name)
        assertThreeEquals(3, Mapx.mutableMapOf<String, String>(me.panpf.javax.util.Pair("key", "value"), me.panpf.javax.util.Pair("key2", "value2")).apply { put("key3", "value3") }.size,
                mutableMapOf(kotlin.Pair("key", "value"), kotlin.Pair("key2", "value2")).apply { put("key3", "value3") }.size)


        assertThreeEquals(0, Mapx.hashMapOf<String, String>().size, hashMapOf<String, String>().size)
        assertThreeEquals(java.util.HashMap::class.java.name, Mapx.hashMapOf<String, String>()::class.java.name, hashMapOf<String, String>()::class.java.name)
        assertThreeEquals(1, Mapx.hashMapOf<String, String>().apply { put("key3", "value3") }.size, hashMapOf<String, String>().apply { put("key3", "value3") }.size)

        assertThreeEquals(2, Mapx.hashMapOf<String, String>(me.panpf.javax.util.Pair("key", "value"), me.panpf.javax.util.Pair("key2", "value2")).size,
                hashMapOf(kotlin.Pair("key", "value"), kotlin.Pair("key2", "value2")).size)
        assertThreeEquals(java.util.HashMap::class.java.name, Mapx.hashMapOf<String, String>(me.panpf.javax.util.Pair("key", "value"), me.panpf.javax.util.Pair("key2", "value2"))::class.java.name,
                hashMapOf(kotlin.Pair("key", "value"), kotlin.Pair("key2", "value2"))::class.java.name)
        assertThreeEquals(3, Mapx.hashMapOf<String, String>(me.panpf.javax.util.Pair("key", "value"), me.panpf.javax.util.Pair("key2", "value2")).apply { put("key3", "value3") }.size,
                hashMapOf(kotlin.Pair("key", "value"), kotlin.Pair("key2", "value2")).apply { put("key3", "value3") }.size)


        assertThreeEquals(0, Mapx.linkedMapOf<String, String>().size, linkedMapOf<String, String>().size)
        assertThreeEquals(LinkedHashMap::class.java.name, Mapx.linkedMapOf<String, String>()::class.java.name, linkedMapOf<String, String>()::class.java.name)
        assertThreeEquals(1, Mapx.linkedMapOf<String, String>().apply { put("key3", "value3") }.size, linkedMapOf<String, String>().apply { put("key3", "value3") }.size)

        assertThreeEquals(2, Mapx.linkedMapOf<String, String>(me.panpf.javax.util.Pair("key", "value"), me.panpf.javax.util.Pair("key2", "value2")).size,
                linkedMapOf(kotlin.Pair("key", "value"), kotlin.Pair("key2", "value2")).size)
        assertThreeEquals(LinkedHashMap::class.java.name, Mapx.linkedMapOf<String, String>(me.panpf.javax.util.Pair("key", "value"), me.panpf.javax.util.Pair("key2", "value2"))::class.java.name,
                linkedMapOf(kotlin.Pair("key", "value"), kotlin.Pair("key2", "value2"))::class.java.name)
        assertThreeEquals(3, Mapx.linkedMapOf<String, String>(me.panpf.javax.util.Pair("key", "value"), me.panpf.javax.util.Pair("key2", "value2")).apply { put("key3", "value3") }.size,
                linkedMapOf(kotlin.Pair("key", "value"), kotlin.Pair("key2", "value2")).apply { put("key3", "value3") }.size)


        assertThreeEquals(2, Mapx.sortedMapOf<String, String>(me.panpf.javax.util.Pair("key", "value"), me.panpf.javax.util.Pair("key2", "value2")).size,
                sortedMapOf(kotlin.Pair("key", "value"), kotlin.Pair("key2", "value2")).size)
        assertThreeEquals(TreeMap::class.java.name, Mapx.sortedMapOf<String, String>(me.panpf.javax.util.Pair("key", "value"), me.panpf.javax.util.Pair("key2", "value2"))::class.java.name,
                sortedMapOf(kotlin.Pair("key", "value"), kotlin.Pair("key2", "value2"))::class.java.name)
        assertThreeEquals(3, Mapx.sortedMapOf<String, String>(me.panpf.javax.util.Pair("key", "value"), me.panpf.javax.util.Pair("key2", "value2")).apply { put("key3", "value3") }.size,
                sortedMapOf(kotlin.Pair("key", "value"), kotlin.Pair("key2", "value2")).apply { put("key3", "value3") }.size)

        assertThreeEquals("{key=value, key2=value2}", Mapx.sortedMapOf<String, String>(me.panpf.javax.util.Pair("key2", "value2"), me.panpf.javax.util.Pair("key", "value")).toString(),
                sortedMapOf(kotlin.Pair("key2", "value2"), kotlin.Pair("key", "value")).toString())
    }

    @Test
    fun testCapacity() {
        Assert.assertEquals(3, Mapx.capacity(2).toLong())

        Assert.assertEquals((3 + 3 / 3).toLong(), Mapx.capacity(3).toLong())
        Assert.assertEquals((101 + 101 / 3).toLong(), Mapx.capacity(101).toLong())
        Assert.assertEquals((Mapx.INT_MAX_POWER_OF_TWO - 1 + (Mapx.INT_MAX_POWER_OF_TWO - 1) / 3).toLong(), Mapx.capacity(Mapx.INT_MAX_POWER_OF_TWO - 1).toLong())
        Assert.assertEquals(Integer.MAX_VALUE.toLong(), Mapx.capacity(Mapx.INT_MAX_POWER_OF_TWO).toLong())
    }

    @Test
    fun testGetOrPut() {
        val map = HashMap<String, String>()

        Assert.assertEquals(0, map.size.toLong())
        Assert.assertNull(map["key"])

        Mapx.getOrPut(map, "key") { "value" }
        Assert.assertEquals(1, map.size.toLong())
        Assert.assertNotNull(map["key"])

        Mapx.getOrPut(map, "key") { "value" }
        Assert.assertEquals(1, map.size.toLong())
        Assert.assertNotNull(map["key"])

        Assert.assertNull(map["key1"])

        Mapx.getOrPut(map, "key1") { "value1" }
        Assert.assertEquals(2, map.size.toLong())
        Assert.assertNotNull(map["key1"])
    }

    @Test
    fun testPlusAssign() {
        val map = HashMap<String, String>()

        Assert.assertEquals(0, map.size.toLong())
        Assert.assertNull(map["key"])

        Mapx.plusAssign(map, me.panpf.javax.util.Pair("key", "value"))
        Assert.assertEquals(1, map.size.toLong())
        Assert.assertNotNull(map["key"])

        Mapx.plusAssign(map, null)
        Assert.assertEquals(1, map.size.toLong())
        Assert.assertNotNull(map["key"])

        Assert.assertNull(map["key1"])
        Mapx.plusAssign(map, me.panpf.javax.util.Pair("key1", "value1"))
        Assert.assertEquals(2, map.size.toLong())
        Assert.assertNotNull(map["key1"])
    }

    @Test
    fun testForEach() {
        val map = Mapx.builder("1", "111").put("2", "222").put("3", "333").build()

        assertThreeEquals("1, 2, 3",
                ArrayList<String>().apply { Mapx.forEach(map) { entry -> add(entry.key) } }.joinToString(),
                ArrayList<String>().apply { map.forEach { entry -> add(entry.key) } }.joinToString())
    }

    @Test
    fun testMap() {
        val map = Mapx.builder("3", "333").put("1", "111").put("2", "222").buildTree()

        assertThreeEquals("1, 2, 3", Mapx.map(map) { entry -> entry.key }.joinToString(), map.map { entry -> entry.key }.joinToString())

        assertThreeEquals("1, 2, 3", Mapx.mapTo(map, ArrayList<String>()) { entry -> entry.key }.joinToString(),
                map.mapTo(ArrayList<String>()) { entry -> entry.key }.joinToString())
    }
}
