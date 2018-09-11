package me.panpf.javaxkt.test.util

import me.panpf.javaxkt.util.toDateYMD
import org.junit.Test

class DateTest {

    @Test
    fun testTo(){
        "2018-06-23".toDateYMD()
    }
}