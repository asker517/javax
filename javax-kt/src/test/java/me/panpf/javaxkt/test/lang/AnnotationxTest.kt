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

import me.panpf.javax.lang.Annotationx
import org.junit.Assert
import org.junit.Test

class AnnotationxTest {

    enum class TesetEnum {
        @TestAnnotation("1")
        VALUE1,

        VALUE2
    }

    @Target(AnnotationTarget.PROPERTY)
    @Retention(AnnotationRetention.RUNTIME)
    annotation class TestAnnotation(val value: String)

    @Test
    fun testFromEnum() {
        Assert.assertEquals(Annotationx.getAnnotationFromEnum(TesetEnum.VALUE1, TestAnnotation::class.java)?.value, "1")
        Assert.assertNull(Annotationx.getAnnotationFromEnum(TesetEnum.VALUE2, TestAnnotation::class.java))
    }
}