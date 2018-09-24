package me.panpf.javaxkt.test.lang

import me.panpf.javaxkt.lang.stackTraceToString
import org.junit.Assert
import org.junit.Test

class ThrowableTest {

    @Test
    fun test() {
        val result = Throwable().stackTraceToString()
        Assert.assertNotNull("stackTraceToString", result)
    }
}
