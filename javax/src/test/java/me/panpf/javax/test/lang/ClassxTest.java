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
import me.panpf.javax.util.Arrayx;
import me.panpf.javax.util.Predicate;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class ClassxTest {

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

    @SuppressWarnings("WeakerAccess")
    public static class TestStatic {
        public static String filed1 = "filed11";

        public static String test() {
            return filed1;
        }
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

    @SuppressWarnings("WeakerAccess")
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
    public void testField() throws NoSuchFieldException, ClassNotFoundException {
        /*
         * getFieldWithParent
         */
        Assert.assertNotNull(Classx.getFieldWithParent(TestStatic.class, "filed1"));
        try {
            Classx.getFieldWithParent(TestStatic.class, "filed_no");
            Assert.fail();
        } catch (Exception ignored) {
        }

        Assert.assertNotNull(Classx.getFieldWithParent(new TestStatic(), "filed1"));
        try {
            Classx.getFieldWithParent(new TestStatic(), "filed_no");
            Assert.fail();
        } catch (Exception ignored) {
        }

        Assert.assertNotNull(Classx.getFieldWithParent("me.panpf.javax.test.lang.ClassxTest$TestStatic", "filed1"));
        try {
            Classx.getFieldWithParent("me.panpf.javax.test.lang.ClassxTest$TestStatic", "filed_no");
            Assert.fail();
        } catch (Exception ignored) {
        }

        /*
         * getFieldsWithParent
         */
        Predicate<Field> filterJacocoFiledPredicate = new Predicate<Field>() {
            @Override
            public boolean accept(@NotNull Field field) {
                return !field.getName().equals("$jacocoData");
            }
        };

        Assert.assertEquals(Arrayx.filter(Classx.getFieldsWithParent(TestField3.class, 1), filterJacocoFiledPredicate).toArray(new Field[0]).length, 4);
        Assert.assertEquals(Arrayx.filter(Classx.getFieldsWithParent(TestField3.class), filterJacocoFiledPredicate).toArray(new Field[0]).length, 6);

        Assert.assertEquals(Arrayx.filter(Classx.getFieldsWithParent(new TestField3(), 1), filterJacocoFiledPredicate).toArray(new Field[0]).length, 4);
        Assert.assertEquals(Arrayx.filter(Classx.getFieldsWithParent(new TestField3()), filterJacocoFiledPredicate).toArray(new Field[0]).length, 6);

        Assert.assertEquals(Arrayx.filter(Classx.getFieldsWithParent("me.panpf.javax.test.lang.ClassxTest$TestField3", 1), filterJacocoFiledPredicate).toArray(new Field[0]).length, 4);
        Assert.assertEquals(Arrayx.filter(Classx.getFieldsWithParent("me.panpf.javax.test.lang.ClassxTest$TestField3"), filterJacocoFiledPredicate).toArray(new Field[0]).length, 6);


        /*
         * get and set field value
         */

        TestField1 testField1 = new TestField1();

        Classx.setFieldValue(testField1, Classx.getFieldWithParent(testField1, "testFiled11"), "field11x");
        Assert.assertEquals(Classx.getFieldValue(testField1, Classx.getFieldWithParent(testField1, "testFiled11")), "field11x");

        Classx.setFieldValue(testField1, "testFiled11", "field11y");
        Assert.assertEquals(Classx.getFieldValue(testField1, "testFiled11"), "field11y");


        /*
         * get and set static filed value
         */

        Classx.setStaticFieldValue(Classx.getFieldWithParent(TestStatic.class, "filed1"), "filed12");
        Assert.assertEquals(Classx.getStaticFieldValue(Classx.getFieldWithParent(TestStatic.class, "filed1")), "filed12");

        Classx.setStaticFieldValue(TestStatic.class, "filed1", "filed13");
        Assert.assertEquals(Classx.getStaticFieldValue(TestStatic.class, "filed1"), "filed13");

        Classx.setStaticFieldValue("me.panpf.javax.test.lang.ClassxTest$TestStatic", "filed1", "filed15");
        Assert.assertEquals(Classx.getStaticFieldValue("me.panpf.javax.test.lang.ClassxTest$TestStatic", "filed1"), "filed15");
    }

    @Test
    public void testMethod() throws NoSuchMethodException, ClassNotFoundException, NoSuchFieldException {
        /*
         * getMethodWithParent
         */

        Assert.assertNotNull(Classx.getMethodWithParent(TestStatic.class, "test"));
        try {
            Classx.getMethodWithParent(TestStatic.class, "test_no");
            Assert.fail();
        } catch (NoSuchMethodException ignored) {
        }

        Assert.assertNotNull(Classx.getMethodWithParent(new TestStatic(), "test"));
        try {
            Classx.getMethodWithParent(new TestStatic(), "test_no");
            Assert.fail();
        } catch (NoSuchMethodException ignored) {
        }

        Assert.assertNotNull(Classx.getMethodWithParent("me.panpf.javax.test.lang.ClassxTest$TestStatic", "test"));
        try {
            Classx.getMethodWithParent("me.panpf.javax.test.lang.ClassxTest$TestStatic", "test_no");
            Assert.fail();
        } catch (NoSuchMethodException ignored) {
        }

        /*
         * getMethodsWithParent
         */

        Predicate<Method> filterJacocoMethodPredicate = new Predicate<Method>() {
            @Override
            public boolean accept(@NotNull Method field) {
                return !field.getName().equals("$jacocoInit");
            }
        };

        Assert.assertEquals(Arrayx.filter(Classx.getMethodsWithParent(TestMethod.class), filterJacocoMethodPredicate).toArray(new Method[0]).length, 14);
        Assert.assertEquals(Arrayx.filter(Classx.getMethodsWithParent(TestMethod.class, 0), filterJacocoMethodPredicate).toArray(new Method[0]).length, 2);

        Assert.assertEquals(Arrayx.filter(Classx.getMethodsWithParent(new TestMethod()), filterJacocoMethodPredicate).toArray(new Method[0]).length, 14);
        Assert.assertEquals(Arrayx.filter(Classx.getMethodsWithParent(new TestMethod(), 0), filterJacocoMethodPredicate).toArray(new Method[0]).length, 2);

        Assert.assertEquals(Arrayx.filter(Classx.getMethodsWithParent("me.panpf.javax.test.lang.ClassxTest$TestMethod"), filterJacocoMethodPredicate).toArray(new Method[0]).length, 14);
        Assert.assertEquals(Arrayx.filter(Classx.getMethodsWithParent("me.panpf.javax.test.lang.ClassxTest$TestMethod", 0), filterJacocoMethodPredicate).toArray(new Method[0]).length, 2);

        /*
         * callMethod
         */

        TestMethod testMethod = new TestMethod();

        Classx.callMethod(testMethod, Classx.getMethodWithParent(testMethod, "setUpdate", String.class), "updatex");
        Assert.assertEquals(Classx.callMethod(testMethod, Classx.getMethodWithParent(testMethod, "getUpdate")), "updatex");

        Classx.callMethod(testMethod, "setUpdate", "updatex");
        Assert.assertEquals(Classx.callMethod(testMethod, "getUpdate"), "updatex");


        /*
         * callStaticMethod
         */
        Classx.setStaticFieldValue(TestStatic.class, "filed1", "filedx");

        Assert.assertEquals(Classx.callStaticMethod(Classx.getMethodWithParent(TestStatic.class, "test")), "filedx");
        Assert.assertEquals(Classx.callStaticMethod(TestStatic.class, "test"), "filedx");
        Assert.assertEquals(Classx.callStaticMethod("me.panpf.javax.test.lang.ClassxTest$TestStatic", "test"), "filedx");
    }

    @Test
    public void testConstructor() throws NoSuchMethodException, ClassNotFoundException {
        Assert.assertNotNull(Classx.getConstructorWithParent(TestConstructor.class, String.class));
        Assert.assertNotNull(Classx.getConstructorWithParent(new TestConstructor(), String.class));
        Assert.assertNotNull(Classx.getConstructorWithParent("me.panpf.javax.test.lang.ClassxTest$TestConstructor", String.class));

        Assert.assertEquals(Classx.getConstructorsWithParent(TestConstructor.class).length, 4);
        Assert.assertEquals(Classx.getConstructorsWithParent(TestConstructor.class, 0).length, 3);

        Assert.assertEquals(Classx.getConstructorsWithParent(new TestConstructor()).length, 4);
        Assert.assertEquals(Classx.getConstructorsWithParent(new TestConstructor(), 0).length, 3);

        Assert.assertEquals(Classx.getConstructorsWithParent("me.panpf.javax.test.lang.ClassxTest$TestConstructor").length, 4);
        Assert.assertEquals(Classx.getConstructorsWithParent("me.panpf.javax.test.lang.ClassxTest$TestConstructor", 0).length, 3);
    }

    @Test
    public void testHierarchy() throws ClassNotFoundException {
        Assert.assertEquals(Classx.getClassHierarchy(TestField3.class).length, 4);
        Assert.assertEquals(Classx.getClassHierarchy(TestField3.class, true).length, 3);

        Assert.assertEquals(Classx.getClassHierarchy(new TestField3()).length, 4);
        Assert.assertEquals(Classx.getClassHierarchy(new TestField3(), true).length, 3);

        Assert.assertEquals(Classx.getClassHierarchy("me.panpf.javax.test.lang.ClassxTest$TestField3").length, 4);
        Assert.assertEquals(Classx.getClassHierarchy("me.panpf.javax.test.lang.ClassxTest$TestField3", true).length, 3);
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
