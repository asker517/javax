package me.panpf.javax.test;

import org.junit.Assert;

public class Assertx {


    /**
     * Asserts that two objects are equal. If they are not, an
     * {@link AssertionError} without a message is thrown. If
     * <code>expected</code> and <code>actual</code> are <code>null</code>,
     * they are considered equal.
     *
     * @param expected expected value
     * @param actual1  the value to check against <code>expected</code>
     * @param actual2  the value to check against <code>expected</code>
     */
    public static void assertThreeEquals(Object expected, Object actual1, Object actual2) {
        Assert.assertEquals("actual1", expected, actual1);
        Assert.assertEquals("actual2", expected, actual2);
    }
}
