/*
 * Copyright (C) 2018 Peng fei Pan <panpfpanpf@outlook.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.panpf.javax.test.lang;

import me.panpf.javax.lang.Classx;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class ClassTest {

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
        List<String> stringList = new ArrayList<String>();
    }

    @Test
    public void testField() {
        TestField1 testClass = new TestField1();

        try {
            Classx.setFieldValue(testClass, "testFiled11", "field11x");
        } catch (NoSuchFieldException e) {
            throw new IllegalArgumentException(e);
        }

        try {
            Assert.assertEquals(Classx.getFieldValue(testClass, "testFiled11"), "field11x");
        } catch (NoSuchFieldException e) {
            throw new IllegalArgumentException(e);
        }

        Field[] fields = Classx.getFieldsWithParent(TestField3.class);
        Assert.assertNotNull(fields);
        Assert.assertEquals(fields.length, 6);

        Field[] field2 = Classx.getFieldsWithParent(TestField3.class, 1);
        Assert.assertNotNull(field2);
        Assert.assertEquals(field2.length, 4);
    }

    @Test
    public void testMethod() {
        TestMethod testMethod = new TestMethod();

        try {
            Classx.callMethod(testMethod, "setUpdate", "testMethod");
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException(e);
        }

        try {
            Assert.assertEquals(Classx.callMethod(testMethod, "getUpdate"), "testMethod");
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException(e);
        }

        try {
            Classx.callMethod(testMethod, Classx.getMethodWithParent(testMethod.getClass(), "setUpdate", String.class), "testMethod2");
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException(e);
        }

        try {
            Assert.assertEquals(Classx.callMethod(testMethod, Classx.getMethodWithParent(testMethod.getClass(), "getUpdate")), "testMethod2");
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException(e);
        }

        Method[] methods = Classx.getMethodsWithParent(TestMethod.class);
        Assert.assertNotNull(methods);
        Assert.assertEquals(methods.length, 14);

        Method[] methods2 = Classx.getMethodsWithParent(TestMethod.class, 0);
        Assert.assertNotNull(methods2);
        Assert.assertEquals(methods2.length, 2);
    }

    @Test
    public void testConstructor() {
        try {
            Assert.assertNotNull(Classx.getConstructorWithParent(TestConstructor.class, String.class));
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException(e);
        }

        Assert.assertEquals(Classx.getConstructorsWithParent(TestConstructor.class).length, 4);

        Assert.assertEquals(Classx.getConstructorsWithParent(TestConstructor.class, 0).length, 3);
    }

    @Test
    public void testHierarchy() {
        Assert.assertEquals(Classx.getClassHierarchy(TestField3.class).length, 4);
        Assert.assertEquals(Classx.getClassHierarchy(TestField3.class, true).length, 3);
    }

    @Test
    public void testType() {
        try {
            Assert.assertTrue(Classx.isTypeArray(Classx.getFieldWithParent(TestType.class, "strings"), String.class));
        } catch (NoSuchFieldException e) {
            throw new IllegalArgumentException(e);
        }

        try {
            Assert.assertFalse(Classx.isTypeArray(Classx.getFieldWithParent(TestType.class, "strings"), Integer.class));
        } catch (NoSuchFieldException e) {
            throw new IllegalArgumentException(e);
        }

        try {
            Assert.assertTrue(Classx.isTypeCollection(Classx.getFieldWithParent(TestType.class, "stringList"), List.class, String.class));
        } catch (NoSuchFieldException e) {
            throw new IllegalArgumentException(e);
        }

        try {
            Assert.assertFalse(Classx.isTypeCollection(Classx.getFieldWithParent(TestType.class, "stringList"), List.class, Integer.class));
        } catch (NoSuchFieldException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
