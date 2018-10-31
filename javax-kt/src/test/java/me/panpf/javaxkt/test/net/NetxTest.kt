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

package me.panpf.javaxkt.test.net

import me.panpf.javaxkt.net.*
import org.junit.Assert
import org.junit.Test

class NetxTest {

    @Test
    fun testIpType() {
        Assert.assertTrue("8.8.8.8".isIPV4())
        Assert.assertFalse("天天向上".isIPV4())

        Assert.assertTrue("11:11:e:1EEE:11:11:200.200.200.200".isIPV6())
        Assert.assertTrue("5e:0:0:0:0:0:5668:eeee".isIPV6())
        Assert.assertTrue("8.8.8.8".isIPV6())
        Assert.assertFalse("天天向上".isIPV6())

        Assert.assertTrue("58:E8:76:83:A2:C7".isMacAddress())
        Assert.assertTrue("58-E8-76-83-A2-C7".isMacAddress())
        Assert.assertTrue("58:e8:76:83:a2:c7".isMacAddress())
        Assert.assertTrue("58-e8-76-83-a2-c7".isMacAddress())
        Assert.assertFalse("58/E8:76:83:A2:C7".isMacAddress())
        Assert.assertFalse("天天向上".isMacAddress())
    }

    @Test
    fun testIpLong2String() {
        val ip = "221.217.228.166"
        Assert.assertEquals(ip.ipStringToLong().ipLongToString(), ip)
    }
}
