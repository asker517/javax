@file:Suppress("RemoveRedundantSpreadOperator")

package me.panpf.javaxkt.test.collections

import me.panpf.javaxkt.collections.isNotNullOrEmpty
import me.panpf.javaxkt.collections.isNullOrEmpty
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class MapxTest {

    @Test
    fun testNullOrEmpty() {
        assertTrue(HashMap<String, String>().isNullOrEmpty())
        assertTrue((null as HashMap<String, String>?).isNullOrEmpty())
        assertFalse(HashMap<String, String>().apply { put("key", "value") }.isNullOrEmpty())

        assertFalse(HashMap<String, String>().isNotNullOrEmpty())
        assertFalse((null as HashMap<String, String>?).isNotNullOrEmpty())
        assertTrue(HashMap<String, String>().apply { put("key", "value") }.isNotNullOrEmpty())
    }
}
