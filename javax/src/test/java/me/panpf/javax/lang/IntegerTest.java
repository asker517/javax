package me.panpf.javax.lang;

import org.junit.Assert;
import org.junit.Test;

public class IntegerTest {

    @Test
    public void testPad() {
        Assert.assertEquals(Intx.pad(10, 5), "00010");
        Assert.assertEquals(Intx.pad(10L, 5), "00010");
    }
}
