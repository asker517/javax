package me.panpf.javax.test.util;

import me.panpf.javax.util.Premisex;
import org.junit.Assert;
import org.junit.Test;

public class PremiseTest {

    @Test
    public void testInRange() {
        Premisex.checkInRange((byte) 2, (byte) 0, (byte) 5);
        try {
            Premisex.checkInRange((byte) 6, (byte) 0, (byte) 5);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.checkInRange((short) 2, (short) 0, (short) 5);
        try {
            Premisex.checkInRange((short) 6, (short) 0, (short) 5);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.checkInRange(2, 0, 5);
        try {
            Premisex.checkInRange(6, 0, 5);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.checkInRange(2L, 0L, 5L);
        try {
            Premisex.checkInRange(6L, 0L, 5L);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.checkInRange(2f, 0f, 5f);
        try {
            Premisex.checkInRange(6f, 0f, 5f);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.checkInRange(2d, 0d, 5d);
        try {
            Premisex.checkInRange(6d, 0d, 5d);
            Assert.fail();
        } catch (Exception ignored) {
        }
    }

    @Test
    public void testNotInRange() {
        Premisex.checkNotInRange((byte) 6, (byte) 0, (byte) 5);
        try {
            Premisex.checkNotInRange((byte) 2, (byte) 0, (byte) 5);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.checkNotInRange((short) 6, (short) 0, (short) 5);
        try {
            Premisex.checkNotInRange((short) 2, (short) 0, (short) 5);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.checkNotInRange(6, 0, 5);
        try {
            Premisex.checkNotInRange(2, 0, 5);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.checkNotInRange(6L, 0L, 5L);
        try {
            Premisex.checkNotInRange(2L, 0L, 5L);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.checkNotInRange(6f, 0f, 5f);
        try {
            Premisex.checkNotInRange(2f, 0f, 5f);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.checkNotInRange(6d, 0d, 5d);
        try {
            Premisex.checkNotInRange(2d, 0d, 5d);
            Assert.fail();
        } catch (Exception ignored) {
        }
    }
}
