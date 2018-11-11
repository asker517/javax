package me.panpf.javax.test.collections

import me.panpf.javax.collections.Collectionx
import org.junit.Assert
import org.junit.Test

class CollectionxTest {

    @Test
    fun testDrop() {
        val lists = listOf("1", "2", "3", "4")
        Assert.assertEquals(Collectionx.joinToArrayString(Collectionx.drop(lists, 2)), Collectionx.joinToArrayString(lists.drop(2)))
    }
}