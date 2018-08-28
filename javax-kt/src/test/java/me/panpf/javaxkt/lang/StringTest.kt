package me.panpf.javaxkt.lang

import org.junit.Assert
import org.junit.Test

class StringTest {

    @Test
    fun testContains() {
        Assert.assertTrue("今天天气晴".orContains(arrayOf("哈", "天")))
        Assert.assertFalse("今天天气晴".orContains(arrayOf("哈")))

        Assert.assertTrue("今天天气晴".andContains(arrayOf("晴", "天")))
        Assert.assertFalse("今天天气晴".andContains(arrayOf("哈", "天")))
    }
}