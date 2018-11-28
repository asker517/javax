package me.panpf.javax.test.collections

import me.panpf.javax.collections.Collectionx
import me.panpf.javax.collections.Mapx
import me.panpf.javax.test.Assertx.assertThreeEquals
import me.panpf.javax.util.Pair
import org.junit.Assert
import org.junit.Test
import java.util.*

class MapxTest {

    @Test
    fun testBuilder() {
        Assert.assertEquals(Mapx.builder("1", "111").build().size.toLong(), 1)
        Assert.assertEquals(Mapx.builder("1", "111").put("2", "222").put("3", "333").build().size.toLong(), 3)
        Assert.assertEquals(Mapx.builder("1", "111").put("2", "222").put("3", "333").build()["3"], "333")

        Assert.assertNotEquals(Collectionx.joinToString(Mapx.map(Mapx.builder("1", "111").put("3", "333").put("2", "222").build()) { entry -> entry.key }), "1, 3, 2")

        Assert.assertNotEquals(Collectionx.joinToString(Mapx.map(Mapx.builder("1", "111").put("3", "333").put("2", "222").buildWeak()) { entry -> entry.key }), "1, 3, 2")

        Assert.assertNotEquals(Collectionx.joinToString(Mapx.map(Mapx.builder("1", "111").put("3", "333").put("2", "222").buildTable()) { entry -> entry.key }), "1, 3, 2")

        Assert.assertEquals(Collectionx.joinToString(Mapx.map(Mapx.builder("1", "111").put("3", "333").put("2", "222").buildLinked()) { entry -> entry.key }), "1, 3, 2")

        Assert.assertEquals(Collectionx.joinToString(Mapx.map(Mapx.builder("1", "111").put("3", "333").put("2", "222").buildTree()) { entry -> entry.key }), "1, 2, 3")

        Assert.assertEquals(Collectionx.joinToString(Mapx.map(Mapx.builder("3", "333").put("1", "111").put("2", "222").buildTree()) { entry -> entry.key }), "1, 2, 3")

        Assert.assertEquals(Collectionx.joinToString(Mapx.map(Mapx.builder("3", "333").put("1", "111").put("2", "222").buildSorted()) { entry -> entry.key }), "1, 2, 3")
    }

    @Test
    fun testCreate() {
        Assert.assertTrue(Mapx.createEmptyMap<Any, Any>() is HashMap<*, *>)
        Assert.assertTrue(Mapx.createEmptyMap<Any, Any>().isEmpty())
        Mapx.createEmptyMap<Any, Any>()["key"] = "value"

        Assert.assertTrue(Mapx.createEmptyHashMap<Any, Any>().isEmpty())
        Mapx.createEmptyHashMap<Any, Any>()["key"] = "value"

        Assert.assertTrue(Mapx.createEmptyWeakHashMap<Any, Any>().isEmpty())
        Mapx.createEmptyWeakHashMap<Any, Any>()["key"] = "value"

        Assert.assertTrue(Mapx.createEmptyLinkedHashMap<Any, Any>().isEmpty())
        Mapx.createEmptyLinkedHashMap<Any, Any>()["key"] = "value"

        Assert.assertTrue(Mapx.createEmptyHashtable<Any, Any>().isEmpty)
        Mapx.createEmptyHashtable<Any, Any>()["key"] = "value"

        Assert.assertTrue(Mapx.createEmptyTreeMap<Any, Any>().isEmpty())
        Mapx.createEmptyTreeMap<Any, Any>()["key"] = "value"

        Assert.assertTrue(Mapx.createEmptySortedMap<Any, Any>().isEmpty())
        Mapx.createEmptySortedMap<Any, Any>()["key"] = "value"

        Assert.assertTrue(Mapx.onlyReadEmptyMap<Any, Any>().isEmpty())
        try {
            Mapx.onlyReadEmptyMap<Any, Any>()["key"] = "value"
            Assert.fail()
        } catch (e: Exception) {
            e.printStackTrace()
        }

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
        val map = Mapx.createEmptyMap<String, String>()

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
        val map = Mapx.createEmptyMap<String, String>()

        Assert.assertEquals(0, map.size.toLong())
        Assert.assertNull(map["key"])

        Mapx.plusAssign(map, Pair("key", "value"))
        Assert.assertEquals(1, map.size.toLong())
        Assert.assertNotNull(map["key"])

        Mapx.plusAssign(map, null)
        Assert.assertEquals(1, map.size.toLong())
        Assert.assertNotNull(map["key"])

        Assert.assertNull(map["key1"])
        Mapx.plusAssign(map, Pair("key1", "value1"))
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
