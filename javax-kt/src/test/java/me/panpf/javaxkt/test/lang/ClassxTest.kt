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
        var testFiled11 = "field11"
        var testFiled12 = "field12"
    }

    @Suppress("unused")
    open class TestField2 : TestField1() {
        var testFiled21 = "field21"
        var testFiled22 = "field22"
    }

    @Suppress("unused")
    class TestField3 : TestField2() {
        var testFiled31 = "field31"
        var testFiled32 = "field32"
    }

    @Suppress("unused")
    class TestMethod {
        var update: String? = null
    }

    @Suppress("unused")
    class TestStatic {
        companion object {
            var filed1 = "filed11"

            @JvmStatic
            fun test() = filed1
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
        Assert.assertNotNull(TestStatic::class.java.getFieldWithParent("filed1"))
        try {
            TestStatic::class.java.getFieldWithParent("filed_no")
            Assert.fail()
        } catch (ignored: Exception) {
        }

        Assert.assertNotNull(TestStatic().getFieldWithParent("filed1"))
        try {
            TestStatic().getFieldWithParent("filed_no")
            Assert.fail()
        } catch (ignored: Exception) {
        }

        Assert.assertNotNull("me.panpf.javaxkt.test.lang.ClassxTest\$TestStatic".getFieldWithParent("filed1"))
        try {
            "me.panpf.javaxkt.test.lang.ClassxTest\$TestStatic".getFieldWithParent("filed_no")
            Assert.fail()
        } catch (ignored: Exception) {
        }

        /*
         * getFieldsWithParent
         */
        val filterJacocoFiledPredicate = Predicate<Field> { field -> field.name != "\$jacocoData" }

        Assert.assertEquals(Arrayx.filter(TestField3::class.java.getFieldsWithParent(1), filterJacocoFiledPredicate).toTypedArray().size.toLong(), 4)
        Assert.assertEquals(Arrayx.filter(TestField3::class.java.getFieldsWithParent(), filterJacocoFiledPredicate).toTypedArray().size.toLong(), 6)

        Assert.assertEquals(Arrayx.filter(TestField3().getFieldsWithParent(1), filterJacocoFiledPredicate).toTypedArray().size.toLong(), 4)
        Assert.assertEquals(Arrayx.filter(TestField3().getFieldsWithParent(), filterJacocoFiledPredicate).toTypedArray().size.toLong(), 6)

        Assert.assertEquals(Arrayx.filter("me.panpf.javaxkt.test.lang.ClassxTest\$TestField3".getFieldsWithParent(1), filterJacocoFiledPredicate).toTypedArray().size.toLong(), 4)
        Assert.assertEquals(Arrayx.filter("me.panpf.javaxkt.test.lang.ClassxTest\$TestField3".getFieldsWithParent(), filterJacocoFiledPredicate).toTypedArray().size.toLong(), 6)


        /*
         * get and set field value
         */

        val testField1 = TestField1()

        testField1.setFieldValue(testField1.getFieldWithParent("testFiled11"), "field11x")
        Assert.assertEquals(testField1.getFieldValue(testField1.getFieldWithParent("testFiled11")), "field11x")

        testField1.setFieldValue("testFiled11", "field11y")
        Assert.assertEquals(testField1.getFieldValue("testFiled11"), "field11y")


        /*
         * get and set static filed value
         */

        TestStatic::class.java.getFieldWithParent("filed1").setStaticValue("filed12")
        Assert.assertEquals(TestStatic::class.java.getFieldWithParent("filed1").getStaticValue(), "filed12")

        TestStatic::class.java.setStaticFieldValue("filed1", "filed13")
        Assert.assertEquals(TestStatic::class.java.getStaticFieldValue("filed1"), "filed13")

        "me.panpf.javaxkt.test.lang.ClassxTest\$TestStatic".setStaticFieldValue("filed1", "filed15")
        Assert.assertEquals("me.panpf.javaxkt.test.lang.ClassxTest\$TestStatic".getStaticFieldValue("filed1"), "filed15")
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
        TestStatic::class.java.setStaticFieldValue("filed1", "filedx")

        Assert.assertEquals(TestStatic::class.java.getMethodWithParent("test").callStaticMethod(), "filedx")
        Assert.assertEquals(TestStatic::class.java.callStaticMethod("test"), "filedx")
        Assert.assertEquals("me.panpf.javaxkt.test.lang.ClassxTest\$TestStatic".callStaticMethod("test"), "filedx")
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
