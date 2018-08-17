package me.panpf.javax.util;

import org.junit.Assert;
import org.junit.Test;

public class Base64CompatTest {

    @Test
    public void testBase64(){
        String source = "上山打老虎";
        String result = new String(Base64Compat.getDecoder().decode(Base64Compat.getEncoder().encodeToString(source.getBytes())));
        Assert.assertEquals(source, result);
    }
}
