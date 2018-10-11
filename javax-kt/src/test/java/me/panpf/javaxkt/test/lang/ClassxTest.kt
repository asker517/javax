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

import me.panpf.javaxkt.lang.*
import org.junit.Assert
import org.junit.Test
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
    fun testField() {
        TestStatic::class.java.setFieldValue("filed1", "filed12")
        Assert.assertEquals(TestStatic::class.java.getFieldValue("filed1"), "filed12")

        TestStatic::class.java.getFieldWithParent("filed1").setValue("filed13")
        Assert.assertEquals(TestStatic::class.java.getFieldWithParent("filed1").getValue(), "filed13")

        Assert.assertNotNull(TestField3().getFieldValue("testFiled31"))

        try {
            TestField3().getFieldValue(TestField3::class.java.getFieldWithParent("unknown"))
            Assert.fail()
        } catch (e: Exception) {
        }

        try {
            TestField3().getFieldValue("unknown")
            Assert.fail()
        } catch (e: Exception) {
        }

        val testClass = TestField1()

        try {
            testClass.setFieldValue("testFiled11", "field11x")
        } catch (e: NoSuchFieldException) {
            throw IllegalArgumentException(e)
        }

        try {
            testClass.setFieldValue(testClass.getFieldWithParent("testFiled11"), "field11x")
        } catch (e: NoSuchFieldException) {
            throw IllegalArgumentException(e)
        }

        try {
            Assert.assertEquals(testClass.getFieldValue("testFiled11"), "field11x")
        } catch (e: NoSuchFieldException) {
            throw IllegalArgumentException(e)
        }

        val fields = TestField3::class.java.getFieldsWithParent().filter { it.name != "\$jacocoData" }.toTypedArray()
        Assert.assertNotNull(fields)
        Assert.assertEquals(fields.size.toLong(), 6)

        val fields1 = TestField3::class.java.getFieldsWithParent(-1).filter { it.name != "\$jacocoData" }.toTypedArray()
        Assert.assertNotNull(fields1)
        Assert.assertEquals(fields1.size.toLong(), 6)

        val fields3 = TestField3().getFieldsWithParent().filter { it.name != "\$jacocoData" }.toTypedArray()
        Assert.assertNotNull(fields3)
        Assert.assertEquals(fields3.size.toLong(), 6)

        val field2 = TestField3().getFieldsWithParent(1).filter { it.name != "\$jacocoData" }.toTypedArray()
        Assert.assertNotNull(field2)
        Assert.assertEquals(field2.size.toLong(), 4)
    }

    @Test
    fun testMethod() {
        Assert.assertNotNull(TestStatic::class.java.getMethodWithParent("test"))

        Assert.assertNotNull(TestStatic::class.java.getMethodsWithParent())

        Assert.assertNotNull(TestStatic::class.java.callMethod("test"))

        Assert.assertNotNull(TestStatic::class.java.getMethodWithParent("test").call())

        Assert.assertNotNull(TestMethod().callMethod("toString"))
        try {
            TestMethod().callMethod("unknown")
            Assert.fail()
        } catch (e: Exception) {
        }

        val testMethod = TestMethod()

        try {
            testMethod.callMethod("setUpdate", "testMethod")
        } catch (e: NoSuchMethodException) {
            throw IllegalArgumentException(e)
        }

        try {
            Assert.assertEquals(testMethod.callMethod("getUpdate"), "testMethod")
        } catch (e: NoSuchMethodException) {
            throw IllegalArgumentException(e)
        }

        try {
            testMethod.callMethod(testMethod.getMethodWithParent("setUpdate", String::class.java), "testMethod2")
        } catch (e: NoSuchMethodException) {
            throw IllegalArgumentException(e)
        }

        try {
            Assert.assertEquals(testMethod.callMethod(testMethod.getMethodWithParent("getUpdate")), "testMethod2")
        } catch (e: NoSuchMethodException) {
            throw IllegalArgumentException(e)
        }

        val methods = TestMethod().getMethodsWithParent().filter { it.name != "\$jacocoInit" }.toTypedArray()
        Assert.assertNotNull(methods)
        Assert.assertEquals(methods.size.toLong(), 14)

        val methods1 = TestMethod::class.java.getMethodsWithParent().filter { it.name != "\$jacocoInit" }.toTypedArray()
        Assert.assertNotNull(methods1)
        Assert.assertEquals(methods1.size.toLong(), 14)

        val methods2 = TestMethod().getMethodsWithParent(0).filter { it.name != "\$jacocoInit" }.toTypedArray()
        Assert.assertNotNull(methods2)
        Assert.assertEquals(methods2.size.toLong(), 2)

        val methods3 = TestMethod::class.java.getMethodsWithParent(0).filter { it.name != "\$jacocoInit" }.toTypedArray()
        Assert.assertNotNull(methods3)
        Assert.assertEquals(methods3.size.toLong(), 2)
    }

    @Test
    fun testConstructor() {
        try {
            Assert.assertNotNull(TestConstructor::class.java.getConstructorWithParent(String::class.java))
        } catch (e: NoSuchMethodException) {
            throw IllegalArgumentException(e)
        }

        try {
            Assert.assertNotNull(TestConstructor().getConstructorWithParent(String::class.java))
        } catch (e: NoSuchMethodException) {
            throw IllegalArgumentException(e)
        }

        Assert.assertEquals(TestConstructor::class.java.getConstructorsWithParent(-1).size, 4)

        Assert.assertEquals(TestConstructor::class.java.getConstructorsWithParent().size, 4)

        Assert.assertEquals(TestConstructor().getConstructorsWithParent().size, 4)

        Assert.assertEquals(TestConstructor().getConstructorsWithParent(0).size, 3)
    }

    @Test
    fun testHierarchy() {
        Assert.assertEquals(TestField3::class.java.getClassHierarchy(false).size, 4)
        Assert.assertEquals(TestField3::class.java.getClassHierarchy().size, 4)
        Assert.assertEquals(TestField3().getClassHierarchy().size, 4)

        Assert.assertEquals(TestField3().getClassHierarchy(true).size, 3)
    }

    @Test
    fun testType() {
        try {
            Assert.assertTrue(TestType::class.java.getFieldWithParent("strings").isTypeArray(String::class.java))
        } catch (e: NoSuchFieldException) {
            throw IllegalArgumentException(e)
        }

        try {
            Assert.assertTrue(TestType().getFieldWithParent("strings").isTypeArray(String::class.java))
        } catch (e: NoSuchFieldException) {
            throw IllegalArgumentException(e)
        }

        try {
            Assert.assertFalse(TestType().getFieldWithParent("strings").isTypeArray(Int::class.java))
        } catch (e: NoSuchFieldException) {
            throw IllegalArgumentException(e)
        }

        try {
            Assert.assertTrue(TestType().getFieldWithParent("stringList").isTypeCollection(List::class.java, String::class.java))
        } catch (e: NoSuchFieldException) {
            throw IllegalArgumentException(e)
        }

        try {
            Assert.assertFalse(TestType().getFieldWithParent("stringList").isTypeCollection(List::class.java, Int::class.java))
        } catch (e: NoSuchFieldException) {
            throw IllegalArgumentException(e)
        }
    }
}
