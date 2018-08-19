package me.panpf.javax.lang;

import org.junit.Assert;
import org.junit.Test;

public class CharTest {

    @Test
    public void testIsBlank() {
        Assert.assertTrue(Charx.isBlank(' '));
        Assert.assertFalse(Charx.isBlank('*'));
        Assert.assertFalse(Charx.isBlank('8'));
        Assert.assertFalse(Charx.isBlank('a'));
        Assert.assertFalse(Charx.isBlank('天'));

        Assert.assertTrue(Charx.isBlank(' ', ' '));
        Assert.assertFalse(Charx.isBlank(' ', '*'));
        Assert.assertFalse(Charx.isBlank(' ', '8'));
        Assert.assertFalse(Charx.isBlank(' ', 'a'));
        Assert.assertFalse(Charx.isBlank(' ', '天'));
    }

    @Test
    public void testIsChinese() {
        Assert.assertTrue(Charx.isChinese('今'));
        Assert.assertFalse(Charx.isChinese('*'));
        Assert.assertFalse(Charx.isChinese('8'));
        Assert.assertFalse(Charx.isChinese('a'));
        Assert.assertFalse(Charx.isChinese(' '));

        Assert.assertTrue(Charx.isChinese('今', '天'));
        Assert.assertFalse(Charx.isChinese('今', '*'));
        Assert.assertFalse(Charx.isChinese('今', '8'));
        Assert.assertFalse(Charx.isChinese('今', 'a'));
        Assert.assertFalse(Charx.isChinese('今', ' '));
    }

    @Test
    public void testIsDigit() {
        Assert.assertTrue(Charx.isDigit('8'));
        Assert.assertFalse(Charx.isDigit('*'));
        Assert.assertFalse(Charx.isDigit('a'));
        Assert.assertFalse(Charx.isDigit(' '));
        Assert.assertFalse(Charx.isDigit('天'));

        Assert.assertTrue(Charx.isDigit('8', '8'));
        Assert.assertFalse(Charx.isDigit('8', '*'));
        Assert.assertFalse(Charx.isDigit('8', 'a'));
        Assert.assertFalse(Charx.isDigit('8', ' '));
        Assert.assertFalse(Charx.isDigit('8', '天'));
    }
}
