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

package me.panpf.javaxkt.test.lang

import me.panpf.javax.collections.Arrayx
import me.panpf.javax.util.Predicate
import me.panpf.javaxkt.lang.*
import org.junit.Assert
import org.junit.Test
import java.lang.reflect.Field
import java.lang.reflect.Method
import java.util.*

class ClassxTest {

    open class TestField1 {
        var testField11 = "field11"
        var testField12 = "field12"
    }

    @Suppress("unused")
    open class TestField2 : TestField1() {
        var testField21 = "field21"
        var testField22 = "field22"
    }

    @Suppress("unused")
    class TestField3 : TestField2() {
        var testField31 = "field31"
        var testField32 = "field32"
    }

    @Suppress("unused")
    class TestMethod {
        var update: String? = null
    }

    @Suppress("unused")
    class TestStatic {
        companion object {
            var field1 = "field11"

            @JvmStatic
            fun test() = field1
        }
    }

    @Suppress("unused")
    class TestConstructor {
        constructor()

        @Suppress("UNUSED_PARAMETER")
        constructor(param1: String)

        @Suppress("UNUSED_PARAMETER")
        constructor(param1: String, param2: Int)
    }

    @Suppress("unused")
    class TestType {
        internal var strings = arrayOf<String>()
        internal var stringList: List<String> = ArrayList()
    }

    @Test
    @Throws(NoSuchFieldException::class, ClassNotFoundException::class)
    fun testField() {
        /*
         * getFieldWithParent
         */
        Assert.assertNotNull(TestStatic::class.java.getFieldWithParent("field1"))
        try {
            TestStatic::class.java.getFieldWithParent("field_no")
            Assert.fail()
        } catch (ignored: Exception) {
        }

        Assert.assertNotNull(TestStatic().getFieldWithParent("field1"))
        try {
            TestStatic().getFieldWithParent("field_no")
            Assert.fail()
        } catch (ignored: Exception) {
        }

        Assert.assertNotNull("me.panpf.javaxkt.test.lang.ClassxTest\$TestStatic".getFieldWithParent("field1"))
        try {
            "me.panpf.javaxkt.test.lang.ClassxTest\$TestStatic".getFieldWithParent("field_no")
            Assert.fail()
        } catch (ignored: Exception) {
        }

        /*
         * getFieldsWithParent
         */
        val filterJacocoFieldPredicate = Predicate<Field> { field -> field.name != "\$jacocoData" }

        Assert.assertEquals(Arrayx.filter(TestField3::class.java.getFieldsWithParent(1), filterJacocoFieldPredicate).toTypedArray().size.toLong(), 4)
        Assert.assertEquals(Arrayx.filter(TestField3::class.java.getFieldsWithParent(), filterJacocoFieldPredicate).toTypedArray().size.toLong(), 6)

        Assert.assertEquals(Arrayx.filter(TestField3().getFieldsWithParent(1), filterJacocoFieldPredicate).toTypedArray().size.toLong(), 4)
        Assert.assertEquals(Arrayx.filter(TestField3().getFieldsWithParent(), filterJacocoFieldPredicate).toTypedArray().size.toLong(), 6)

        Assert.assertEquals(Arrayx.filter("me.panpf.javaxkt.test.lang.ClassxTest\$TestField3".getFieldsWithParent(1), filterJacocoFieldPredicate).toTypedArray().size.toLong(), 4)
        Assert.assertEquals(Arrayx.filter("me.panpf.javaxkt.test.lang.ClassxTest\$TestField3".getFieldsWithParent(), filterJacocoFieldPredicate).toTypedArray().size.toLong(), 6)


        /*
         * get and set field value
         */

        val testField1 = TestField1()

        testField1.setFieldValue(testField1.getFieldWithParent("testField11"), "field11x")
        Assert.assertEquals(testField1.getFieldValue(testField1.getFieldWithParent("testField11")), "field11x")

        testField1.setFieldValue("testField11", "field11y")
        Assert.assertEquals(testField1.getFieldValue("testField11"), "field11y")


        /*
         * get and set static field value
         */

        TestStatic::class.java.getFieldWithParent("field1").setStaticValue("field12")
        Assert.assertEquals(TestStatic::class.java.getFieldWithParent("field1").getStaticValue(), "field12")

        TestStatic::class.java.setStaticFieldValue("field1", "field13")
        Assert.assertEquals(TestStatic::class.java.getStaticFieldValue("field1"), "field13")

        "me.panpf.javaxkt.test.lang.ClassxTest\$TestStatic".setStaticFieldValue("field1", "field15")
        Assert.assertEquals("me.panpf.javaxkt.test.lang.ClassxTest\$TestStatic".getStaticFieldValue("field1"), "field15")
    }

    @Test
    @Throws(NoSuchMethodException::class, ClassNotFoundException::class, NoSuchFieldException::class)
    fun testMethod() {
        /*
         * getMethodWithParent
         */

        Assert.assertNotNull(TestStatic::class.java.getMethodWithParent("test"))
        try {
            TestStatic::class.java.getMethodWithParent("test_no")
            Assert.fail()
        } catch (ignored: NoSuchMethodException) {
        }

        Assert.assertNotNull(TestStatic().getMethodWithParent("test"))
        try {
            TestStatic().getMethodWithParent("test_no")
            Assert.fail()
        } catch (ignored: NoSuchMethodException) {
        }

        Assert.assertNotNull("me.panpf.javaxkt.test.lang.ClassxTest\$TestStatic".getMethodWithParent("test"))
        try {
            "me.panpf.javaxkt.test.lang.ClassxTest\$TestStatic".getMethodWithParent("test_no")
            Assert.fail()
        } catch (ignored: NoSuchMethodException) {
        }

        /*
         * getMethodsWithParent
         */

        val filterJacocoMethodPredicate = Predicate<Method> { field -> field.name != "\$jacocoInit" }

        Assert.assertEquals(Arrayx.filter(TestMethod::class.java.getMethodsWithParent(), filterJacocoMethodPredicate).toTypedArray().size.toLong(), 14)
        Assert.assertEquals(Arrayx.filter(TestMethod::class.java.getMethodsWithParent(0), filterJacocoMethodPredicate).toTypedArray().size.toLong(), 2)

        Assert.assertEquals(Arrayx.filter(TestMethod().getMethodsWithParent(), filterJacocoMethodPredicate).toTypedArray().size.toLong(), 14)
        Assert.assertEquals(Arrayx.filter(TestMethod().getMethodsWithParent(0), filterJacocoMethodPredicate).toTypedArray().size.toLong(), 2)

        Assert.assertEquals(Arrayx.filter("me.panpf.javaxkt.test.lang.ClassxTest\$TestMethod".getMethodsWithParent(), filterJacocoMethodPredicate).toTypedArray().size.toLong(), 14)
        Assert.assertEquals(Arrayx.filter("me.panpf.javaxkt.test.lang.ClassxTest\$TestMethod".getMethodsWithParent(0), filterJacocoMethodPredicate).toTypedArray().size.toLong(), 2)

        /*
         * callMethod
         */

        val testMethod = TestMethod()

        testMethod.callMethod(testMethod.getMethodWithParent("setUpdate", String::class.java), "updatex")
        Assert.assertEquals(testMethod.callMethod(testMethod.getMethodWithParent("getUpdate")), "updatex")

        testMethod.callMethod("setUpdate", "updatex")
        Assert.assertEquals(testMethod.callMethod("getUpdate"), "updatex")


        /*
         * callStaticMethod
         */
        TestStatic::class.java.setStaticFieldValue("field1", "fieldx")

        Assert.assertEquals(TestStatic::class.java.getMethodWithParent("test").callStaticMethod(), "fieldx")
        Assert.assertEquals(TestStatic::class.java.callStaticMethod("test"), "fieldx")
        Assert.assertEquals("me.panpf.javaxkt.test.lang.ClassxTest\$TestStatic".callStaticMethod("test"), "fieldx")
    }

    @Test
    @Throws(NoSuchMethodException::class, ClassNotFoundException::class)
    fun testConstructor() {
        Assert.assertNotNull(TestConstructor::class.java.getConstructorWithParent(String::class.java))
        Assert.assertNotNull(TestConstructor().getConstructorWithParent(String::class.java))
        Assert.assertNotNull("me.panpf.javaxkt.test.lang.ClassxTest\$TestConstructor".getConstructorWithParent(String::class.java))

        Assert.assertEquals(TestConstructor::class.java.getConstructorsWithParent().size.toLong(), 4)
        Assert.assertEquals(TestConstructor::class.java.getConstructorsWithParent(0).size.toLong(), 3)

        Assert.assertEquals(TestConstructor().getConstructorsWithParent().size.toLong(), 4)
        Assert.assertEquals(TestConstructor().getConstructorsWithParent(0).size.toLong(), 3)

        Assert.assertEquals("me.panpf.javaxkt.test.lang.ClassxTest\$TestConstructor".getConstructorsWithParent().size.toLong(), 4)
        Assert.assertEquals("me.panpf.javaxkt.test.lang.ClassxTest\$TestConstructor".getConstructorsWithParent(0).size.toLong(), 3)
    }

    @Test
    @Throws(ClassNotFoundException::class)
    fun testHierarchy() {
        Assert.assertEquals(TestField3::class.java.getClassHierarchy().size.toLong(), 4)
        Assert.assertEquals(TestField3::class.java.getClassHierarchy(true).size.toLong(), 3)

        Assert.assertEquals(TestField3().getClassHierarchy().size.toLong(), 4)
        Assert.assertEquals(TestField3().getClassHierarchy(true).size.toLong(), 3)

        Assert.assertEquals("me.panpf.javaxkt.test.lang.ClassxTest\$TestField3".getClassHierarchy().size.toLong(), 4)
        Assert.assertEquals("me.panpf.javaxkt.test.lang.ClassxTest\$TestField3".getClassHierarchy(true).size.toLong(), 3)
    }

    @Test
    fun testType() {
        try {
            Assert.assertTrue(TestType::class.java.getFieldWithParent("strings").isTypeArray(String::class.java))
        } catch (e: NoSuchFieldException) {
            throw IllegalArgumentException(e)
        }

        try {
            Assert.assertFalse(TestType::class.java.getFieldWithParent("strings").isTypeArray(Int::class.java))
        } catch (e: NoSuchFieldException) {
            throw IllegalArgumentException(e)
        }

        try {
            Assert.assertTrue(TestType::class.java.getFieldWithParent("stringList").isTypeCollection(List::class.java, String::class.java))
        } catch (e: NoSuchFieldException) {
            throw IllegalArgumentException(e)
        }

        try {
            Assert.assertFalse(TestType::class.java.getFieldWithParent("stringList").isTypeCollection(List::class.java, Int::class.java))
        } catch (e: NoSuchFieldException) {
            throw IllegalArgumentException(e)
        }

    }
}
