@file:Suppress("RemoveRedundantSpreadOperator")

package me.panpf.javax.test.collections

import me.panpf.javax.collections.Arrayx
import me.panpf.javax.collections.Collectionx
import me.panpf.javax.collections.Mapx
import me.panpf.javax.lang.Classx
import me.panpf.javax.lang.Stringx
import me.panpf.javax.sequences.Sequencex
import me.panpf.javax.test.Assertx.*
import me.panpf.javax.util.DefaultValue
import me.panpf.javax.util.Transformer
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
        Mapx.putAll(map, null as me.panpf.javax.sequences.Sequence<me.panpf.javax.util.Pair<String, String>>?)
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
        assertTrue(newMap1 !== map)
        assertNull(map["key2"])

        val newMap2 = Mapx.plus(map, Arrayx.arrayOf(me.panpf.javax.util.Pair("key2", "value2"), me.panpf.javax.util.Pair("key3", "value3")))
        assertEquals(3, newMap2.size)
        assertAllNotNull(newMap2["key1"], newMap2["key2"], newMap2["key3"])
        assertTrue(newMap2 !== map)
        assertAllNull(map["key2"], map["key3"])

        val newMap3 = Mapx.plus(map, Collectionx.immutableListOf(me.panpf.javax.util.Pair("key2", "value2"), me.panpf.javax.util.Pair("key3", "value3")))
        assertEquals(3, newMap3.size)
        assertAllNotNull(newMap3["key1"], newMap3["key2"], newMap3["key3"])
        assertTrue(newMap3 !== map)
        assertAllNull(map["key2"], map["key3"])

        val newMap4 = Mapx.plus(map, Collectionx.asSequence(Collectionx.immutableListOf(me.panpf.javax.util.Pair("key2", "value2"), me.panpf.javax.util.Pair("key3", "value3"))))
        assertEquals(3, newMap4.size)
        assertAllNotNull(newMap4["key1"], newMap4["key2"], newMap4["key3"])
        assertTrue(newMap4 !== map)
        assertAllNull(map["key2"], map["key3"])

        val newMap5 = Mapx.plus(map, Mapx.builder("key2", "value2").put("key3", "value3").buildHashMap())
        assertEquals(3, newMap5.size)
        assertAllNotNull(newMap5["key1"], newMap5["key2"], newMap5["key3"])
        assertTrue(newMap5 !== map)
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
    fun testRemove() {
        val map = Mapx.builder("key1", "value1").buildHashMap()
        assertEquals(1, map.size.toLong())
        assertNotNull(map["key1"])

        Mapx.remove(null as Map<String, String>?, "key1")
        assertEquals(1, map.size.toLong())
        assertNotNull(map["key1"])

        Mapx.remove(map, "key1")
        assertEquals(0, map.size.toLong())
        assertNull(map["key1"])
    }

    @Test
    fun testMinus() {
        val map = Mapx.builder("key1", "value1").put("key2", "value2").put("key3", "value3").buildHashMap()
        assertEquals(3, map.size.toLong())
        assertAllNotNull(map["key1"], map["key2"], map["key3"])

        val newMap1 = Mapx.minus(map, "key3")
        assertTrue(newMap1 !== map)
        assertEquals(3, map.size.toLong())
        assertAllNotNull(map["key1"], map["key2"], map["key3"])
        assertEquals(2, newMap1.size.toLong())
        assertAllNotNull(newMap1["key1"], newMap1["key2"])

        val newMap2 = Mapx.minus(map, arrayOf("key2", "key3"))
        assertTrue(newMap2 !== map)
        assertEquals(3, map.size.toLong())
        assertAllNotNull(map["key1"], map["key2"], map["key3"])
        assertEquals(1, newMap2.size.toLong())
        assertAllNotNull(newMap2["key1"])

        val newMap3 = Mapx.minus(map, listOf("key2", "key3"))
        assertTrue(newMap3 !== map)
        assertEquals(3, map.size.toLong())
        assertAllNotNull(map["key1"], map["key2"], map["key3"])
        assertEquals(1, newMap3.size.toLong())
        assertAllNotNull(newMap3["key1"])

        val newMap4 = Mapx.minus(map, Collectionx.asSequence(listOf("key2", "key3")))
        assertTrue(newMap4 !== map)
        assertEquals(3, map.size.toLong())
        assertAllNotNull(map["key1"], map["key2"], map["key3"])
        assertEquals(1, newMap4.size.toLong())
        assertAllNotNull(newMap4["key1"])

        val map2 = Mapx.builder("key1", "value1").put("key2", "value2").put("key3", "value3").put("key4", "value4").put("key5", "value5").put("key6", "value6").put("key7", "value7").put("key8", "value8").put("key9", "value9").put("key10", "value10").buildHashMap()
        assertEquals(10, map2.size.toLong())
        assertAllNotNull(map2["key1"], map2["key2"], map2["key3"], map2["key4"], map2["key5"], map2["key6"], map2["key7"], map2["key8"], map2["key9"], map2["key10"])

        Mapx.minusAssign(map2, "key10")
        Mapx.minusAssign(null as Map<String, String>?, "key9")
        assertEquals(9, map2.size.toLong())
        assertAllNotNull(map2["key1"], map2["key2"], map2["key3"], map2["key4"], map2["key5"], map2["key6"], map2["key7"], map2["key8"], map2["key9"])

        Mapx.minusAssign(map2, arrayOf("key8", "key9"))
        Mapx.minusAssign(null as Map<String, String>?, arrayOf("key6", "key7"))
        assertEquals(7, map2.size.toLong())
        assertAllNotNull(map2["key1"], map2["key2"], map2["key3"], map2["key4"], map2["key5"], map2["key6"], map2["key7"])

        Mapx.minusAssign(map2, listOf("key6", "key7"))
        Mapx.minusAssign(null as Map<String, String>?, listOf("key4", "key5"))
        assertEquals(5, map2.size.toLong())
        assertAllNotNull(map2["key1"], map2["key2"], map2["key3"], map2["key4"], map2["key5"])

        Mapx.minusAssign(map2, Collectionx.asSequence(listOf("key4", "key5")))
        Mapx.minusAssign(null as Map<String, String>?, Collectionx.asSequence(listOf("key2", "key3")))
        assertEquals(3, map2.size.toLong())
        assertAllNotNull(map2["key1"], map2["key2"], map2["key3"])
    }

    @Test
    fun testSet() {
        val map = Mapx.builder("key1", "value1").buildHashMap()
        assertEquals(1, map.size.toLong())
        assertAllNotNull(map["key1"])
        assertEquals("value1", map["key1"])

        Mapx.set(map, "key1", "value2")
        assertEquals("value2", map["key1"])

        Mapx.set(null as Map<String, String>?, "key1", "value3")
        assertEquals("value2", map["key1"])
    }

    @Test
    fun testGet() {
        val map = Mapx.builder("key1", "value1").buildHashMap()
        assertEquals(1, map.size.toLong())
        assertAllNotNull(map["key1"])

        assertEquals("value1", Mapx.get(map, "key1"))
        assertNull(Mapx.get(null as Map<String, String>?, "key1"))

        assertEquals("value1", Mapx.getOrElse(map, "key1") { "valueDefault" })
        assertEquals("valueDefault", Mapx.getOrElse(map, "key2") { "valueDefault" })
        assertEquals("valueDefault", Mapx.getOrElse(null as Map<String, String>?, "key1") { "valueDefault" })

        assertEquals("value1", Mapx.getValue(map, "key1"))
        try {
            Mapx.getValue(map, "key2")
            fail()
        } catch (e: Exception) {
        }
//        val defaultValue: DefaultValue<String> = DefaultValue { "valueDefault" }
//        val method = Classx.getMethodWithParent(Mapx::class.java, "getOrElseNullable", Map::class.java, Object::class.java, DefaultValue::class.java)
//        assertEquals("valueDefault", Classx.callStaticMethod(method, map, "key2", defaultValue))
        try {
            Mapx.getValue(null as Map<String, String>?, "key1")
            fail()
        } catch (e: Exception) {
        }

        Mapx.getOrPut(map, "key1") { "value1" }
        assertEquals(1, map.size.toLong())
        assertNotNull(map["key1"])

        Mapx.getOrPut(map, "key2") { "value2" }
        assertEquals(2, map.size.toLong())
        assertNotNull(map["key2"])
    }

    @Test
    fun testContains() {
        val map = Mapx.builder("key1", "value1").buildHashMap()

        assertThreeEquals(true, Mapx.contains(map, "key1"), map.contains("key1"))
        assertThreeEquals(false, Mapx.contains(map, "key2"), map.contains("key2"))
        assertThreeEquals(false, Mapx.contains(null as Map<String, String>?, "key1"), HashMap<String, String>().contains("key1"))

        assertThreeEquals(true, Mapx.containsKey(map, "key1"), map.containsKey("key1"))
        assertThreeEquals(false, Mapx.containsKey(map, "key2"), map.containsKey("key2"))
        assertThreeEquals(false, Mapx.containsKey(null as Map<String, String>?, "key1"), HashMap<String, String>().containsKey("key1"))

        assertThreeEquals(true, Mapx.containsValue(map, "value1"), map.containsValue("value1"))
        assertThreeEquals(false, Mapx.containsValue(map, "value2"), map.containsValue("value2"))
        assertThreeEquals(false, Mapx.containsValue(null as Map<String, String>?, "value2"), HashMap<String, String>().containsValue("value2"))
    }

    @Test
    fun testAll() {
        val map = Mapx.builder("3", "333").put("1", "111").put("2", "222").buildTreeMap()
        assertThreeEquals(true, Mapx.all(map) { Stringx.isDigit(it.key) }, map.all { Stringx.isDigit(it.key) })

        val map2 = Mapx.builder("3", "333").put("1", "111").put("a", "222").buildTreeMap()
        assertThreeEquals(false, Mapx.all(map2) { Stringx.isDigit(it.key) }, map2.all { Stringx.isDigit(it.key) })

        val map3 = mutableMapOf<String, String>()
        assertThreeEquals(true, Mapx.all(map3) { Stringx.isDigit(it.key) }, map3.all { Stringx.isDigit(it.key) })

        val map4: Map<String, String>? = null
        assertThreeEquals(true, Mapx.all(map4) { Stringx.isDigit(it.key) }, mutableMapOf<String, String>().all { Stringx.isDigit(it.key) })
    }

    @Test
    fun testAny() {
        val map1 = Mapx.builder("3", "333").put("1", "111").put("2", "222").buildTreeMap()
        assertThreeEquals(true, Mapx.any(map1) { Stringx.isDigit(it.key) }, map1.any { Stringx.isDigit(it.key) })
        assertThreeEquals(true, Mapx.any(map1), map1.any())

        val map2 = Mapx.builder("a", "333").put("b", "111").put("c", "222").buildTreeMap()
        assertThreeEquals(false, Mapx.any(map2) { Stringx.isDigit(it.key) }, map2.any { Stringx.isDigit(it.key) })

        val map3 = mutableMapOf<String, String>()
        assertThreeEquals(false, Mapx.any(map3) { Stringx.isDigit(it.key) }, map3.any { Stringx.isDigit(it.key) })
        assertThreeEquals(false, Mapx.any(map3), map3.any())

        val map4: Map<String, String>? = null
        assertThreeEquals(false, Mapx.any(map4) { Stringx.isDigit(it.key) }, mutableMapOf<String, String>().any { Stringx.isDigit(it.key) })
        assertThreeEquals(false, Mapx.any(map4), mutableMapOf<String, String>().any())
    }

    @Test
    fun testCount() {
        val map1 = Mapx.builder("3", "333").put("1", "111").put("a", "222").buildTreeMap()
        assertThreeEquals(3, Mapx.count(map1), map1.count())
        assertThreeEquals(2, Mapx.count(map1) { Stringx.isDigit(it.key) }, map1.count { Stringx.isDigit(it.key) })

        val map2 = mutableMapOf<String, String>()
        assertThreeEquals(0, Mapx.count(map2), map2.count())
        assertThreeEquals(0, Mapx.count(map2) { Stringx.isDigit(it.key) }, map2.count { Stringx.isDigit(it.key) })

        val map3: Map<String, String>? = null
        assertThreeEquals(0, Mapx.count(map3), mutableMapOf<String, String>().count())
        assertThreeEquals(0, Mapx.count(map3) { Stringx.isDigit(it.key) }, mutableMapOf<String, String>().count { Stringx.isDigit(it.key) })
    }

    @Test
    fun testEach() {
        val map = Mapx.builder("1", "111").put("2", "222").put("3", "333").buildHashMap()

        assertThreeEquals("1, 2, 3",
                ArrayList<String>().apply { Mapx.forEach(map) { entry -> add(entry.key) } }.joinToString(),
                ArrayList<String>().apply { map.forEach { entry -> add(entry.key) } }.joinToString())

        assertThreeEquals("",
                ArrayList<String>().apply { Mapx.forEach(null as Map<String, String>?) { entry -> add(entry.key) } }.joinToString(),
                ArrayList<String>().apply { mutableMapOf<String, String>().forEach { entry -> add(entry.key) } }.joinToString())

        assertThreeEquals("1, 2, 3",
                ArrayList<String>().apply { Mapx.onEach(map) { entry -> add(entry.key) } }.joinToString(),
                ArrayList<String>().apply { map.onEach { entry -> add(entry.key) } }.joinToString())
    }

    @Test
    fun testMax() {
        val map = Mapx.builder("1", "111").put("2", "222").put("3", "333").buildHashMap()

        assertThreeEquals("3=333",
                Mapx.maxBy(map) { it.key }.toString(),
                map.maxBy { it.key }.toString())

        assertThreeEquals(null,
                Mapx.maxBy(null as Map<String, String>?) { it.key },
                mutableMapOf<String, String>().maxBy { it.key })

        assertThreeEquals("3=333",
                Mapx.maxWith(map) { it1, it2 -> it1.key.compareTo(it2.key) }.toString(),
                map.maxWith(Comparator { it1, it2 -> it1.key.compareTo(it2.key) }).toString())

        assertThreeEquals(null,
                Mapx.maxWith(null as Map<String, String>?) { it1, it2 -> it1.key.compareTo(it2.key) },
                mutableMapOf<String, String>().maxWith(Comparator { it1, it2 -> it1.key.compareTo(it2.key) }))
    }

    @Test
    fun testMin() {
        val map = Mapx.builder("1", "111").put("2", "222").put("3", "333").buildHashMap()

        assertThreeEquals("1=111",
                Mapx.minBy(map) { it.key }.toString(),
                map.minBy { it.key }.toString())

        assertThreeEquals(null,
                Mapx.minBy(null as Map<String, String>?) { it.key },
                mutableMapOf<String, String>().minBy { it.key })

        assertThreeEquals("1=111",
                Mapx.minWith(map) { it1, it2 -> it1.key.compareTo(it2.key) }.toString(),
                map.minWith(Comparator { it1, it2 -> it1.key.compareTo(it2.key) }).toString())

        assertThreeEquals(null,
                Mapx.minWith(null as Map<String, String>?) { it1, it2 -> it1.key.compareTo(it2.key) },
                mutableMapOf<String, String>().minWith(Comparator { it1, it2 -> it1.key.compareTo(it2.key) }))
    }

    @Test
    fun testNone() {
        val map1 = Mapx.builder("3", "333").put("1", "111").put("2", "222").buildTreeMap()
        assertThreeEquals(false, Mapx.none(map1) { Stringx.isDigit(it.key) }, map1.none { Stringx.isDigit(it.key) })
        assertThreeEquals(false, Mapx.none(map1), map1.none())

        val map2 = Mapx.builder("a", "333").put("b", "111").put("c", "222").buildTreeMap()
        assertThreeEquals(true, Mapx.none(map2) { Stringx.isDigit(it.key) }, map2.none { Stringx.isDigit(it.key) })

        val map3 = mutableMapOf<String, String>()
        assertThreeEquals(true, Mapx.none(map3) { Stringx.isDigit(it.key) }, map3.none { Stringx.isDigit(it.key) })
        assertThreeEquals(true, Mapx.none(map3), map3.none())

        val map4: Map<String, String>? = null
        assertThreeEquals(true, Mapx.none(map4) { Stringx.isDigit(it.key) }, mutableMapOf<String, String>().none { Stringx.isDigit(it.key) })
        assertThreeEquals(true, Mapx.none(map4), mutableMapOf<String, String>().none())
    }

    @Test
    fun testFilter() {
        val map = Mapx.builder("3", "333").put("1", "111").put("a", "222").buildTreeMap()

        assertThreeEquals(2,
                Mapx.filterKeys(map) { Stringx.isDigit(it) }.size,
                map.filterKeys { Stringx.isDigit(it) }.size)
        assertThreeEquals(true,
                map !== Mapx.filterKeys(map) { Stringx.isDigit(it) },
                map !== map.filterKeys { Stringx.isDigit(it) })
        assertThreeEquals(0,
                Mapx.filterKeys(null as Map<String, String>?) { Stringx.isDigit(it) }.size,
                mutableMapOf<String, String>().filterKeys { Stringx.isDigit(it) }.size)

        val map2 = Mapx.builder("3", "333").put("1", "111").put("a", "aaa").buildTreeMap()

        assertThreeEquals(2,
                Mapx.filterValues(map2) { Stringx.isDigit(it) }.size,
                map2.filterValues { Stringx.isDigit(it) }.size)
        assertThreeEquals(true,
                map2 !== Mapx.filterValues(map2) { Stringx.isDigit(it) },
                map2 !== map2.filterValues { Stringx.isDigit(it) })
        assertThreeEquals(0,
                Mapx.filterValues(null as Map<String, String>?) { Stringx.isDigit(it) }.size,
                mutableMapOf<String, String>().filterValues { Stringx.isDigit(it) }.size)

        assertThreeEquals(2,
                Mapx.filter(map) { Stringx.isDigit(it.key) }.size,
                map.filter { Stringx.isDigit(it.key) }.size)
        assertThreeEquals(true,
                map !== Mapx.filter(map) { Stringx.isDigit(it.key) },
                map !== map.filter { Stringx.isDigit(it.key) })
        assertThreeEquals(0,
                Mapx.filter(null as Map<String, String>?) { Stringx.isDigit(it.key) }.size,
                mutableMapOf<String, String>().filter { Stringx.isDigit(it.key) }.size)

        assertThreeEquals(2,
                Mapx.filterTo(map, LinkedHashMap()) { Stringx.isDigit(it.key) }.size,
                map.filterTo(LinkedHashMap()) { Stringx.isDigit(it.key) }.size)
        assertThreeEquals(true,
                map !== Mapx.filterTo(map, LinkedHashMap()) { Stringx.isDigit(it.key) },
                map !== map.filterTo(LinkedHashMap()) { Stringx.isDigit(it.key) })
        assertThreeEquals(0,
                Mapx.filterTo(null as Map<String, String>?, LinkedHashMap()) { Stringx.isDigit(it.key) }.size,
                mutableMapOf<String, String>().filterTo(LinkedHashMap()) { Stringx.isDigit(it.key) }.size)

        assertThreeEquals(2,
                Mapx.filterNot(map) { !Stringx.isDigit(it.key) }.size,
                map.filterNot { !Stringx.isDigit(it.key) }.size)
        assertThreeEquals(true,
                map !== Mapx.filterNot(map) { !Stringx.isDigit(it.key) },
                map !== map.filterNot { !Stringx.isDigit(it.key) })
        assertThreeEquals(0,
                Mapx.filterNot(null as Map<String, String>?) { !Stringx.isDigit(it.key) }.size,
                mutableMapOf<String, String>().filterNot { !Stringx.isDigit(it.key) }.size)

        assertThreeEquals(2,
                Mapx.filterNotTo(map, LinkedHashMap()) { !Stringx.isDigit(it.key) }.size,
                map.filterNotTo(LinkedHashMap()) { !Stringx.isDigit(it.key) }.size)
        assertThreeEquals(true,
                map !== Mapx.filterNotTo(map, LinkedHashMap()) { !Stringx.isDigit(it.key) },
                map !== map.filterNotTo(LinkedHashMap()) { !Stringx.isDigit(it.key) })
        assertThreeEquals(0,
                Mapx.filterNotTo(null as Map<String, String>?, LinkedHashMap()) { !Stringx.isDigit(it.key) }.size,
                mutableMapOf<String, String>().filterNotTo(LinkedHashMap()) { !Stringx.isDigit(it.key) }.size)
    }

    @Test
    fun testIterator() {
        val map = Mapx.builder("3", "333").put("1", "111").put("a", "222").buildSortedMap()
        val list = LinkedList<Map.Entry<String, String>>()
        for (char in Mapx.iterator(map)) list.add(char)
        assertEquals("1=111, 3=333, a=222", list.joinToString())
    }

    @Test
    fun testToPair() {
        val map = Mapx.builder("3", "333").put("1", "111").put("a", "222").buildSortedMap()
        assertThreeEquals("(1, 111)",
                Mapx.toPair(map.entries.first()).toString(),
                map.entries.first().toPair().toString())
    }

    @Test
    fun testToMap() {
        assertThreeEquals(mutableMapOf<String, String>(),
                Mapx.toMap(listOf<me.panpf.javax.util.Pair<String, String>>()),
                listOf<kotlin.Pair<String, String>>().toMap())

        assertThreeEquals(Mapx.builder("key1", "value1").buildLinkedHashMap(),
                Mapx.toMap(listOf(me.panpf.javax.util.Pair("key1", "value1"))),
                listOf(kotlin.Pair("key1", "value1")).toMap())

        assertThreeEquals(Mapx.builder("key1", "value1").put("key2", "value2").buildLinkedHashMap(),
                Mapx.toMap(listOf(me.panpf.javax.util.Pair("key1", "value1"), me.panpf.javax.util.Pair("key2", "value2"))),
                listOf(kotlin.Pair("key1", "value1"), kotlin.Pair("key2", "value2")).toMap())

        assertThreeEquals(Mapx.builder("key1", "value1").put("key2", "value2").buildLinkedHashMap(),
                Mapx.toMap((TestIterable(listOf(me.panpf.javax.util.Pair("key1", "value1"), me.panpf.javax.util.Pair("key2", "value2"))))),
                TestIterable(listOf(kotlin.Pair("key1", "value1"), kotlin.Pair("key2", "value2"))).toMap())

        assertThreeEquals(Mapx.builder("key1", "value1").put("key2", "value2").buildLinkedHashMap(),
                Mapx.toMap(listOf(me.panpf.javax.util.Pair("key1", "value1"), me.panpf.javax.util.Pair("key2", "value2")), LinkedHashMap<String, String>()),
                listOf(kotlin.Pair("key1", "value1"), kotlin.Pair("key2", "value2")).toMap(LinkedHashMap()))

        assertThreeEquals(mutableMapOf<String, String>(),
                Mapx.toMap(arrayOf<me.panpf.javax.util.Pair<String, String>>()),
                arrayOf<kotlin.Pair<String, String>>().toMap())

        assertThreeEquals(Mapx.builder("key1", "value1").buildLinkedHashMap(),
                Mapx.toMap(arrayOf(me.panpf.javax.util.Pair("key1", "value1"))),
                arrayOf(kotlin.Pair("key1", "value1")).toMap())

        assertThreeEquals(Mapx.builder("key1", "value1").put("key2", "value2").buildLinkedHashMap(),
                Mapx.toMap(arrayOf(me.panpf.javax.util.Pair("key1", "value1"), me.panpf.javax.util.Pair("key2", "value2"))),
                arrayOf(kotlin.Pair("key1", "value1"), kotlin.Pair("key2", "value2")).toMap())

        assertThreeEquals(Mapx.builder("key1", "value1").put("key2", "value2").buildLinkedHashMap(),
                Mapx.toMap(arrayOf(me.panpf.javax.util.Pair("key1", "value1"), me.panpf.javax.util.Pair("key2", "value2")), LinkedHashMap<String, String>()),
                arrayOf(kotlin.Pair("key1", "value1"), kotlin.Pair("key2", "value2")).toMap(LinkedHashMap()))

        assertThreeEquals(Mapx.builder("key1", "value1").put("key2", "value2").buildLinkedHashMap(),
                Mapx.toMap(Collectionx.asSequence(listOf(me.panpf.javax.util.Pair("key1", "value1"), me.panpf.javax.util.Pair("key2", "value2")))),
                listOf(kotlin.Pair("key1", "value1"), kotlin.Pair("key2", "value2")).asSequence().toMap())

        assertThreeEquals(Mapx.builder("key1", "value1").put("key2", "value2").buildLinkedHashMap(),
                Mapx.toMap(Collectionx.asSequence(listOf(me.panpf.javax.util.Pair("key1", "value1"), me.panpf.javax.util.Pair("key2", "value2"))), LinkedHashMap()),
                listOf(kotlin.Pair("key1", "value1"), kotlin.Pair("key2", "value2")).asSequence().toMap(LinkedHashMap()))

        val map = Mapx.builder("3", "333").put("1", "111").put("2", "222").buildTreeMap()
        assertThreeEquals(map, Mapx.toMap(map), map.toMap())
        assertThreeEquals(true, Mapx.toMap(map) !== map, map.toMap() !== map)
        assertThreeEquals(LinkedHashMap<String, String>(), Mapx.toMap(LinkedHashMap<String, String>()), LinkedHashMap<String, String>().toMap())
        assertThreeEquals(LinkedHashMap<String, String>(), Mapx.toMap(null as LinkedHashMap<String, String>?), LinkedHashMap<String, String>().toMap())

        assertThreeEquals(map, Mapx.toMap(map), map.toMap())
        assertThreeEquals(true, Mapx.toMap(map, LinkedHashMap()) !== map, map.toMap(LinkedHashMap()) !== map)
        assertThreeEquals(LinkedHashMap<String, String>(),
                Mapx.toMap(LinkedHashMap<String, String>(), LinkedHashMap()),
                LinkedHashMap<String, String>().toMap(LinkedHashMap()))
        assertThreeEquals(LinkedHashMap<String, String>(),
                Mapx.toMap(null as LinkedHashMap<String, String>?, LinkedHashMap()),
                LinkedHashMap<String, String>().toMap(LinkedHashMap()))
    }

    @Test
    fun testToList() {
        val map = Mapx.builder("3", "333").put("1", "111").put("2", "222").buildTreeMap()
        assertThreeEquals(listOf(kotlin.Pair("1", "111"), kotlin.Pair("2", "222"), kotlin.Pair("3", "333")).toString(),
                Mapx.toList(map).toString(),
                map.toList().toString())

        assertThreeEquals(listOf<kotlin.Pair<String, String>>().toString(),
                Mapx.toList(LinkedHashMap<String, String>()).toString(),
                LinkedHashMap<String, String>().toList().toString())

        assertThreeEquals(listOf<kotlin.Pair<String, String>>().toString(),
                Mapx.toList(null as LinkedHashMap<String, String>?).toString(),
                LinkedHashMap<String, String>().toList().toString())
    }

    @Test
    fun testAs() {
        val map = Mapx.builder("3", "333").put("1", "111").put("2", "222").buildTreeMap()
        assertThreeEquals(listOf(kotlin.Pair("1", "111"), kotlin.Pair("2", "222"), kotlin.Pair("3", "333")).toString(),
                Mapx.asIterable(map).map { kotlin.Pair(it.key, it.value) }.toString(),
                map.asIterable().map { kotlin.Pair(it.key, it.value) }.toString())

        assertThreeEquals(listOf(kotlin.Pair("1", "111"), kotlin.Pair("2", "222"), kotlin.Pair("3", "333")).toString(),
                Sequencex.toList(Sequencex.map(Mapx.asSequence(map), Transformer<Map.Entry<String, String>, kotlin.Pair<String, String>> { kotlin.Pair(it.key, it.value) })).toString(),
                map.asSequence().map { kotlin.Pair(it.key, it.value) }.toList().toString())
    }

    @Test
    fun testMap() {
        val map = Mapx.builder("3", "333").put("1", "111").put("2", "222").buildTreeMap()

        assertThreeEquals(Mapx.builder("3", 3).put("1", 3).put("2", 3).buildTreeMap(),
                Mapx.mapValuesTo(map, LinkedHashMap<String, Int>()) { it.value.length },
                map.mapValuesTo(LinkedHashMap<String, Int>()) { it.value.length })

        assertThreeEquals(LinkedHashMap<String, Int>(),
                Mapx.mapValuesTo(null as LinkedHashMap<String, String>?, LinkedHashMap<String, Int>()) { it.value.length },
                LinkedHashMap<String, String>().mapValuesTo(LinkedHashMap()) { it.value.length })

        assertThreeEquals(Mapx.builder("3", 3).put("1", 3).put("2", 3).buildTreeMap(),
                Mapx.mapValues(map) { it.value.length },
                map.mapValues { it.value.length })

        assertThreeEquals(Mapx.builder(333, "333").put(111, "111").put(222, "222").buildTreeMap(),
                Mapx.mapKeysTo(map, LinkedHashMap<Int, String>()) { (it.key + it.key + it.key).toInt() },
                map.mapKeysTo(LinkedHashMap<Int, String>()) { (it.key + it.key + it.key).toInt() })

        assertThreeEquals(LinkedHashMap<String, Int>(),
                Mapx.mapKeysTo(null as LinkedHashMap<String, String>?, LinkedHashMap<Int, String>()) { (it.key + it.key + it.key).toInt() },
                LinkedHashMap<String, String>().mapKeysTo(LinkedHashMap()) { (it.key + it.key + it.key).toInt() })

        assertThreeEquals(Mapx.builder(333, "333").put(111, "111").put(222, "222").buildTreeMap(),
                Mapx.mapKeys(map) { (it.key + it.key + it.key).toInt() },
                map.mapKeys { (it.key + it.key + it.key).toInt() })

        assertThreeEquals("1, 2, 3",
                Mapx.mapTo(map, ArrayList<String>()) { it.key }.joinToString(),
                map.mapTo(ArrayList<String>()) { it.key }.joinToString())

        assertThreeEquals("1, 2, 3",
                Mapx.map(map) { it.key }.joinToString(),
                map.map { it.key }.joinToString())

        assertThreeEquals("1, 3",
                Mapx.mapNotNullTo(map, ArrayList()) { if (it.key != "2") it.key else null }.joinToString(),
                map.mapNotNullTo(ArrayList()) { if (it.key != "2") it.key else null }.joinToString())

        assertThreeEquals("1, 3",
                Mapx.mapNotNull(map) { if (it.key != "2") it.key else null }.joinToString(),
                map.mapNotNull { if (it.key != "2") it.key else null }.joinToString())

        assertThreeEquals("1, 1, 1, 2, 2, 2, 3, 3, 3",
                Mapx.flatMapTo(map, ArrayList<String>()) { it.value.toList().map { it.toString() } }.joinToString(),
                map.flatMapTo(ArrayList()) { it.value.toList().map { it.toString() } }.joinToString())

        assertThreeEquals("",
                Mapx.flatMapTo(null as LinkedHashMap<String, String>?, ArrayList<String>()) { it.value.toList().map { it.toString() } }.joinToString(),
                LinkedHashMap<String, String>().flatMapTo(ArrayList()) { it.value.toList().map { it.toString() } }.joinToString())

        assertThreeEquals("1, 1, 1, 2, 2, 2, 3, 3, 3",
                Mapx.flatMap(map) { it.value.toList().map { it.toString() } }.joinToString(),
                map.flatMap { it.value.toList().map { it.toString() } }.joinToString())
    }

    @Test
    fun testCapacity() {
        assertEquals(3, Mapx.capacity(2).toLong())

        assertEquals((3 + 3 / 3).toLong(), Mapx.capacity(3).toLong())
        assertEquals((101 + 101 / 3).toLong(), Mapx.capacity(101).toLong())
        assertEquals((Mapx.INT_MAX_POWER_OF_TWO - 1 + (Mapx.INT_MAX_POWER_OF_TWO - 1) / 3).toLong(), Mapx.capacity(Mapx.INT_MAX_POWER_OF_TWO - 1).toLong())
        assertEquals(Integer.MAX_VALUE.toLong(), Mapx.capacity(Mapx.INT_MAX_POWER_OF_TWO).toLong())
    }

    private class TestIterable<T>(val list: List<T>) : Iterable<T>{

        override fun iterator(): Iterator<T> = list.iterator()
    }
}
