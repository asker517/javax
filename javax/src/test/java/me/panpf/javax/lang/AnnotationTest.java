package me.panpf.javax.lang;

import org.junit.Assert;
import org.junit.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class AnnotationTest {

    public enum TesetEnum {
        @TestAnnotation("1")
        VALUE1,

        VALUE2,
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface TestAnnotation {
        String value();
    }

    @Test
    public void testFromEnum() {
        Assert.assertEquals(Annotationx.getAnnotationFromEnum(TesetEnum.VALUE1, TestAnnotation.class).value(), "1");
        Assert.assertNull(Annotationx.getAnnotationFromEnum(TesetEnum.VALUE2, TestAnnotation.class));
    }
}
