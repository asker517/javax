package me.panpf.javax.test.lang;

import me.panpf.javax.lang.Throwablex;
import org.junit.Assert;
import org.junit.Test;

public class ThrowableTest {

    @Test
    public void test() {
        String result = Throwablex.stackTraceToString(new Throwable());
        Assert.assertNotNull("stackTraceToString", result);
    }
}
