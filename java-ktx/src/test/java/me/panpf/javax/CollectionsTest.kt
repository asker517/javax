package me.panpf.javax

import me.panpf.javax.util.groupPair
import org.junit.Assert.assertEquals
import org.junit.Test

class CollectionsTest {

    @Test
    fun testCleanDir() {
        val items = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val pair = items.groupPair { it % 2 == 0 }
        assertEquals(pair.first?.joinToString { it.toString() } ?: "empty", "2, 4, 6, 8, 10")
        assertEquals(pair.second?.joinToString { it.toString() } ?: "empty", "1, 3, 5, 7, 9")
    }
}