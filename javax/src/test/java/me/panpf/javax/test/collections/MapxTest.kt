@file:Suppress("RemoveRedundantSpreadOperator")

package me.panpf.javax.test.collections

import me.panpf.javax.collections.Arrayx
import me.panpf.javax.collections.Collectionx
import me.panpf.javax.collections.Mapx
import me.panpf.javax.test.Assertx.*
import org.junit.Assert.*
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

    @Test
    fun testNullOrEmpty() {
        assertTrue(Mapx.isNullOrEmpty(HashMap<String, String>()))
        assertTrue(Mapx.isNullOrEmpty(null as HashMap<String, String>?))
        assertFalse(Mapx.isNullOrEmpty(HashMap<String, String>().apply { put("key", "value") }))

        assertFalse(Mapx.isNotNullOrEmpty(HashMap<String, String>()))
        assertFalse(Mapx.isNotNullOrEmpty(null as HashMap<String, String>?))
        assertTrue(Mapx.isNotNullOrEmpty(HashMap<String, String>().apply { put("key", "value") }))
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
        assertThreeEquals(0, Mapx.mutableMapOf<String, String>(*arrayOf<me.panpf.javax.util.Pair<String, String>>()).size,
                mutableMapOf(*arrayOf<kotlin.Pair<String, String>>()).size)
        assertThreeEquals(LinkedHashMap::class.java.name, Mapx.mutableMapOf<String, String>(*arrayOf<me.panpf.javax.util.Pair<String, String>>())::class.java.name,
                mutableMapOf(*arrayOf<kotlin.Pair<String, String>>())::class.java.name)

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
    fun testEmpty() {
        assertThreeEquals(true, Mapx.isEmpty(HashMap<String, String>()), HashMap<String, String>().isEmpty())
        assertThreeEquals(false, Mapx.isEmpty(HashMap<String, String>().apply { put("key", "value") }), HashMap<String, String>().apply { put("key", "value") }.isEmpty())
        assertEquals(false, Mapx.isEmpty(null as Map<String, String>?))

        assertThreeEquals(false, Mapx.isNotEmpty(HashMap<String, String>()), HashMap<String, String>().isNotEmpty())
        assertThreeEquals(true, Mapx.isNotEmpty(HashMap<String, String>().apply { put("key", "value") }), HashMap<String, String>().apply { put("key", "value") }.isNotEmpty())
        assertEquals(false, Mapx.isNotEmpty(null as Map<String, String>?))

        val map: LinkedHashMap<String, String>? = LinkedHashMap()
        assertThreeEquals(map, Mapx.orEmpty(map), map.orEmpty())
        assertThreeEquals(0, Mapx.orEmpty<String, String>(null).size, null.orEmpty<String, String>().size)
        assertEquals(LinkedHashMap::class.java.name, Mapx.orEmpty<String, String>(null)::class.java.name)
        assertEquals(emptyMap<String, String>()::class.java.name, null.orEmpty<String, String>()::class.java.name)
    }

    @Test
    fun testPut() {
        val map = LinkedHashMap<String, String>()

        assertEquals(0, map.size)
        assertAllNull(map["key1"], map["key2"])
        Mapx.putAll(map, Arrayx.arrayOf(me.panpf.javax.util.Pair("key1", "value1"), me.panpf.javax.util.Pair("key2", "value2")))
        Mapx.putAll(map, null as Array<me.panpf.javax.util.Pair<String, String>>?)
        assertEquals(2, map.size)
        assertAllNotNull(map["key1"], map["key2"])

        assertEquals(2, map.size)
        assertAllNull(map["key3"], map["key4"])
        Mapx.putAll(map, Collectionx.immutableListOf(me.panpf.javax.util.Pair("key3", "value3"), me.panpf.javax.util.Pair("key4", "value4")))
        Mapx.putAll(map, null as List<me.panpf.javax.util.Pair<String, String>>?)
        assertEquals(4, map.size)
        assertAllNotNull(map["key3"], map["key4"])

        assertEquals(4, map.size)
        assertAllNull(map["key5"], map["key6"])
        Mapx.putAll(map, Collectionx.asSequence(Collectionx.immutableListOf(me.panpf.javax.util.Pair("key5", "value5"), me.panpf.javax.util.Pair("key6", "value6"))))
        Mapx.putAll(map, null as List<me.panpf.javax.util.Pair<String, String>>?)
        assertEquals(6, map.size)
        assertAllNotNull(map["key5"], map["key6"])
    }

    @Test
    fun testPlus() {
        val map = Mapx.builder("key1", "value1").buildHashMap()
        assertEquals(1, map.size)
        assertNotNull(map["key1"])

        val newMap1 = Mapx.plus(map, me.panpf.javax.util.Pair("key2", "value2"))
        assertEquals(2, newMap1.size)
        assertAllNotNull(newMap1["key1"], newMap1["key2"])
        assertTrue(newMap1 != map)
        assertNull(map["key2"])

        val newMap2 = Mapx.plus(map, Arrayx.arrayOf(me.panpf.javax.util.Pair("key2", "value2"), me.panpf.javax.util.Pair("key3", "value3")))
        assertEquals(3, newMap2.size)
        assertAllNotNull(newMap2["key1"], newMap2["key2"], newMap2["key3"])
        assertTrue(newMap2 != map)
        assertAllNull(map["key2"], map["key3"])

        val newMap3 = Mapx.plus(map, Collectionx.immutableListOf(me.panpf.javax.util.Pair("key2", "value2"), me.panpf.javax.util.Pair("key3", "value3")))
        assertEquals(3, newMap3.size)
        assertAllNotNull(newMap3["key1"], newMap3["key2"], newMap3["key3"])
        assertTrue(newMap3 != map)
        assertAllNull(map["key2"], map["key3"])

        val newMap4 = Mapx.plus(map, Collectionx.asSequence(Collectionx.immutableListOf(me.panpf.javax.util.Pair("key2", "value2"), me.panpf.javax.util.Pair("key3", "value3"))))
        assertEquals(3, newMap4.size)
        assertAllNotNull(newMap4["key1"], newMap4["key2"], newMap4["key3"])
        assertTrue(newMap4 != map)
        assertAllNull(map["key2"], map["key3"])

        val newMap5 = Mapx.plus(map, Mapx.builder("key2", "value2").put("key3", "value3").buildHashMap())
        assertEquals(3, newMap5.size)
        assertAllNotNull(newMap5["key1"], newMap5["key2"], newMap5["key3"])
        assertTrue(newMap5 != map)
        assertAllNull(map["key2"], map["key3"])
        assertEquals(1, Mapx.plus(map, null as Map<String, String>?).size)

        assertEquals(1, map.size.toLong())
        assertAllNotNull(map["key1"])
        assertAllNull(map["key2"])
        Mapx.plusAssign(map, me.panpf.javax.util.Pair("key2", "value2"))
        Mapx.plusAssign(map, null as me.panpf.javax.util.Pair<String, String>?)
        assertEquals(2, map.size.toLong())
        assertAllNotNull(map["key1"], map["key2"])

        assertAllNull(map["key3"], map["key4"])
        Mapx.plusAssign(map, Arrayx.arrayOf(me.panpf.javax.util.Pair("key3", "value3"), me.panpf.javax.util.Pair("key4", "value4")))
        assertEquals(4, map.size.toLong())
        assertAllNotNull(map["key1"], map["key2"], map["key3"], map["key4"])

        assertAllNull(map["key5"], map["key6"])
        Mapx.plusAssign(map, Collectionx.immutableListOf(me.panpf.javax.util.Pair("key5", "value5"), me.panpf.javax.util.Pair("key6", "value6")))
        assertEquals(6, map.size.toLong())
        assertAllNotNull(map["key1"], map["key2"], map["key3"], map["key4"], map["key5"], map["key6"])

        assertAllNull(map["key7"], map["key8"])
        Mapx.plusAssign(map, Collectionx.asSequence(Collectionx.immutableListOf(me.panpf.javax.util.Pair("key7", "value7"),
                me.panpf.javax.util.Pair("key8", "value8"))))
        assertEquals(8, map.size.toLong())
        assertAllNotNull(map["key1"], map["key2"], map["key3"], map["key4"], map["key5"], map["key6"], map["key7"], map["key8"])

        assertAllNull(map["key9"], map["key10"])
        Mapx.plusAssign(map, Mapx.builder("key9", "value9").put("key10", "value10").buildHashMap())
        Mapx.plusAssign(map, null as Map<String, String>?)
        assertEquals(10, map.size.toLong())
        assertAllNotNull(map["key1"], map["key2"], map["key3"], map["key4"], map["key5"], map["key6"], map["key7"], map["key8"], map["key9"], map["key10"])
    }

    @Test
    fun testGetOrPut() {
        val map = HashMap<String, String>()

        assertEquals(0, map.size.toLong())
        assertNull(map["key"])

        Mapx.getOrPut(map, "key") { "value" }
        assertEquals(1, map.size.toLong())
        assertNotNull(map["key"])

        Mapx.getOrPut(map, "key") { "value" }
        assertEquals(1, map.size.toLong())
        assertNotNull(map["key"])

        assertNull(map["key1"])

        Mapx.getOrPut(map, "key1") { "value1" }
        assertEquals(2, map.size.toLong())
        assertNotNull(map["key1"])
    }

    @Test
    fun testForEach() {
        val map = Mapx.builder("1", "111").put("2", "222").put("3", "333").buildHashMap()

        assertThreeEquals("1, 2, 3",
                ArrayList<String>().apply { Mapx.forEach(map) { entry -> add(entry.key) } }.joinToString(),
                ArrayList<String>().apply { map.forEach { entry -> add(entry.key) } }.joinToString())
    }

    @Test
    fun testMap() {
        val map = Mapx.builder("3", "333").put("1", "111").put("2", "222").buildTreeMap()

        assertThreeEquals("1, 2, 3", Mapx.map(map) { entry -> entry.key }.joinToString(), map.map { entry -> entry.key }.joinToString())

        assertThreeEquals("1, 2, 3", Mapx.mapTo(map, ArrayList<String>()) { entry -> entry.key }.joinToString(),
                map.mapTo(ArrayList<String>()) { entry -> entry.key }.joinToString())
    }

    @Test
    fun testCapacity() {
        assertEquals(3, Mapx.capacity(2).toLong())

        assertEquals((3 + 3 / 3).toLong(), Mapx.capacity(3).toLong())
        assertEquals((101 + 101 / 3).toLong(), Mapx.capacity(101).toLong())
        assertEquals((Mapx.INT_MAX_POWER_OF_TWO - 1 + (Mapx.INT_MAX_POWER_OF_TWO - 1) / 3).toLong(), Mapx.capacity(Mapx.INT_MAX_POWER_OF_TWO - 1).toLong())
        assertEquals(Integer.MAX_VALUE.toLong(), Mapx.capacity(Mapx.INT_MAX_POWER_OF_TWO).toLong())
    }
}
