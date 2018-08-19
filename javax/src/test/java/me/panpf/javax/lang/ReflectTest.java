package me.panpf.javax.lang;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class ReflectTest {

    public static class TestField1 {
        public String testFiled11 = "field11";
        public String testFiled12 = "field12";
    }

    public static class TestField2 extends TestField1 {
        public String testFiled21 = "field21";
        public String testFiled22 = "field22";
    }

    public static class TestField3 extends TestField2 {
        public String testFiled31 = "field31";
        public String testFiled32 = "field32";
    }

    public static class TestMethod {

        private String update;

        public String getUpdate() {
            return update;
        }

        public void setUpdate(String update) {
            this.update = update;
        }
    }

    public static class TestConstructor {

        public TestConstructor() {
        }

        public TestConstructor(String param1) {
        }

        public TestConstructor(String param1, int param2) {
        }
    }

    public static class TestType {
        String[] strings = new String[]{};
        List<String> stringList = new ArrayList<>();
    }

    @Test
    public void testField() {
        TestField1 testClass = new TestField1();

        try {
            Reflectx.setFieldValue(testClass, "testFiled11", "field11x");
        } catch (NoSuchFieldException e) {
            throw new IllegalArgumentException(e);
        }

        try {
            Assert.assertEquals(Reflectx.getFieldValue(testClass, "testFiled11"), "field11x");
        } catch (NoSuchFieldException e) {
            throw new IllegalArgumentException(e);
        }

        Field[] fields = Reflectx.getFields(TestField3.class);
        Assert.assertNotNull(fields);
        Assert.assertEquals(fields.length, 6);

        Field[] field2 = Reflectx.getFields(TestField3.class, 1);
        Assert.assertNotNull(field2);
        Assert.assertEquals(field2.length, 4);
    }

    @Test
    public void testMethod() {
        TestMethod testMethod = new TestMethod();

        try {
            Reflectx.callMethod(testMethod, "setUpdate", "testMethod");
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new IllegalArgumentException(e);
        }

        try {
            Assert.assertEquals(Reflectx.callMethod(testMethod, "getUpdate"), "testMethod");
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new IllegalArgumentException(e);
        }

        try {
            Reflectx.callMethod(testMethod, Reflectx.getMethod(testMethod.getClass(), "setUpdate", String.class), "testMethod2");
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new IllegalArgumentException(e);
        }

        try {
            Assert.assertEquals(Reflectx.callMethod(testMethod, Reflectx.getMethod(testMethod.getClass(), "getUpdate")), "testMethod2");
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new IllegalArgumentException(e);
        }

        Method[] methods = Reflectx.getMethods(TestMethod.class);
        Assert.assertNotNull(methods);
        Assert.assertEquals(methods.length, 14);

        Method[] methods2 = Reflectx.getMethods(TestMethod.class, 0);
        Assert.assertNotNull(methods2);
        Assert.assertEquals(methods2.length, 2);
    }

    @Test
    public void testConstructor() {
        try {
            Assert.assertNotNull(Reflectx.getConstructor(TestConstructor.class, String.class));
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException(e);
        }

        Assert.assertEquals(Reflectx.getConstructors(TestConstructor.class).length, 4);

        Assert.assertEquals(Reflectx.getConstructors(TestConstructor.class, 0).length, 3);
    }

    @Test
    public void testHierarchy() {
        Assert.assertEquals(Reflectx.getHierarchyClasss(TestField3.class).length, 4);
        Assert.assertEquals(Reflectx.getHierarchyClasss(TestField3.class, true).length, 3);
    }

    @Test
    public void testType() {
        try {
            Assert.assertTrue(Reflectx.isTypeArray(Reflectx.getField(TestType.class, "strings"), String.class));
        } catch (NoSuchFieldException e) {
            throw new IllegalArgumentException(e);
        }

        try {
            Assert.assertFalse(Reflectx.isTypeArray(Reflectx.getField(TestType.class, "strings"), Integer.class));
        } catch (NoSuchFieldException e) {
            throw new IllegalArgumentException(e);
        }

        try {
            Assert.assertTrue(Reflectx.isTypeCollection(Reflectx.getField(TestType.class, "stringList"), List.class, String.class));
        } catch (NoSuchFieldException e) {
            throw new IllegalArgumentException(e);
        }

        try {
            Assert.assertFalse(Reflectx.isTypeCollection(Reflectx.getField(TestType.class, "stringList"), List.class, Integer.class));
        } catch (NoSuchFieldException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
