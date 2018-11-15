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

package me.panpf.javaxkt.test.crypto

import me.panpf.javaxkt.crypto.createAesKeyByPassword
import me.panpf.javaxkt.crypto.toBase64
import me.panpf.javaxkt.crypto.toBytes
import me.panpf.javaxkt.util.base64EncodeToString
import org.junit.Assert
import org.junit.Test

class KeyxTest {

    @Test
    fun testToBase64() {
        val seed = "" + System.currentTimeMillis()

        val key1 = seed.createAesKeyByPassword(16).toBase64()
        val key2 = seed.createAesKeyByPassword(16).toBase64()

        Assert.assertEquals("testToBase64", key1, key2)
    }

    @Test
    fun testToBytes() {
        val seed = "" + System.currentTimeMillis()

        val key1 = seed.createAesKeyByPassword(16).toBytes().base64EncodeToString()
        val key2 = seed.createAesKeyByPassword(16).toBytes().base64EncodeToString()

        Assert.assertEquals("testToBytes", key1, key2)
    }
}
