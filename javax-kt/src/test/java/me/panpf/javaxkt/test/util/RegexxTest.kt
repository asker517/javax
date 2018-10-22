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

package me.panpf.javaxkt.test.util

import me.panpf.javax.util.Arrayx
import me.panpf.javax.util.Regexx
import me.panpf.javaxkt.util.*
import org.junit.Assert
import org.junit.Test

class RegexxTest {

    companion object {

        private const val REGEX_IPV4 = "((?:(?:25[0-5]|2[0-4]\\d|(?:1\\d{2}|[1-9]?\\d))\\.){3}(?:25[0-5]|2[0-4]\\d|(?:1\\d{2}|[1-9]?\\d)))"

        private const val SAMPLE_IP_V4_MATCHES = "221.217.228.166"
        private const val SAMPLE_IP_V4 = "var returnCitySN = {\"cip\": \"221.217.228.166\", \"cid\": \"110105\", \"cname\": \"北京市朝阳区\"};"
        private const val SAMPLE_IP_V4_MULTI = "var returnCitySN = {\"cip\": \"221.217.228.166\", \"cip2\": \"221.217.228.167\", \"cip3\": \"221.217.228.168\", \"cid\": \"110105\", \"cname\": \"北京市朝阳区\"};"
        private const val SAMPLE_IP_V4_REPLACE = "var returnCitySN = {\"cip\": \"天天向上\", \"cid\": \"110105\", \"cname\": \"北京市朝阳区\"};"
        private const val SAMPLE_IP_V4_MULTI_REPLACE = "var returnCitySN = {\"cip\": \"天天向上\", \"cip2\": \"天天向上\", \"cip3\": \"天天向上\", \"cid\": \"110105\", \"cname\": \"北京市朝阳区\"};"
    }

    @Test
    fun testMatches() {
        Assert.assertTrue(Regexx.IPV4.regexMatches(SAMPLE_IP_V4_MATCHES))
        Assert.assertFalse(Regexx.IPV4.regexMatches(SAMPLE_IP_V4))

        Assert.assertTrue(REGEX_IPV4.regexMatches(SAMPLE_IP_V4_MATCHES))
        Assert.assertFalse(REGEX_IPV4.regexMatches(SAMPLE_IP_V4))
    }

    @Test
    fun testFind() {
        Assert.assertTrue(Regexx.IPV4.regexFind(SAMPLE_IP_V4))
        Assert.assertTrue(Regexx.IPV4.regexFind(SAMPLE_IP_V4, 30))
        Assert.assertFalse(Regexx.IPV4.regexFind(SAMPLE_IP_V4, 31))

        Assert.assertTrue(REGEX_IPV4.regexFind(SAMPLE_IP_V4))
        Assert.assertTrue(REGEX_IPV4.regexFind(SAMPLE_IP_V4, 30))
        Assert.assertFalse(REGEX_IPV4.regexFind(SAMPLE_IP_V4, 31))
    }

    @Test
    fun testLookingAt() {
        Assert.assertTrue(Regexx.IPV4.regexLookingAt("221.217.228.166\", \"cid\": \"110105\", \"cname\": \"北京市朝阳区\"};"))
        Assert.assertFalse(Regexx.IPV4.regexLookingAt(SAMPLE_IP_V4))

        Assert.assertTrue(REGEX_IPV4.regexLookingAt("221.217.228.166\", \"cid\": \"110105\", \"cname\": \"北京市朝阳区\"};"))
        Assert.assertFalse(REGEX_IPV4.regexLookingAt(SAMPLE_IP_V4))
    }

    @Test
    fun testGetFirst() {
        Assert.assertEquals(Regexx.IPV4.regexGetFirst(SAMPLE_IP_V4), "221.217.228.166")
        Assert.assertNull(Regexx.IPV4.regexGetFirst("好好学习"))

        Assert.assertEquals(REGEX_IPV4.regexGetFirst(SAMPLE_IP_V4), "221.217.228.166")
        Assert.assertNull(REGEX_IPV4.regexGetFirst("好好学习"))
    }

    @Test
    fun testGetAll() {
        Assert.assertArrayEquals(Regexx.IPV4.regexGetAll(SAMPLE_IP_V4), Arrayx.arrayOf("221.217.228.166"))
        Assert.assertArrayEquals(Regexx.IPV4.regexGetAll("好好学习"), arrayOfNulls<String>(0))
        Assert.assertArrayEquals(Regexx.IPV4.regexGetAll(SAMPLE_IP_V4_MULTI), Arrayx.arrayOf("221.217.228.166", "221.217.228.167", "221.217.228.168"))

        Assert.assertArrayEquals(REGEX_IPV4.regexGetAll(SAMPLE_IP_V4), Arrayx.arrayOf("221.217.228.166"))
        Assert.assertArrayEquals(REGEX_IPV4.regexGetAll("好好学习"), arrayOfNulls<String>(0))
        Assert.assertArrayEquals(REGEX_IPV4.regexGetAll(SAMPLE_IP_V4_MULTI), Arrayx.arrayOf("221.217.228.166", "221.217.228.167", "221.217.228.168"))
    }

    @Test
    fun testGroupFirst() {
        var group: Regexx.Group? = Regexx.IPV4.regexFirstGroup(SAMPLE_IP_V4)
        Assert.assertNotNull(group)
        Assert.assertEquals(group!!.start.toLong(), 28)
        Assert.assertEquals(group.content, "221.217.228.166")
        Assert.assertEquals(group.end.toLong(), 43)

        group = REGEX_IPV4.regexFirstGroup(SAMPLE_IP_V4)
        Assert.assertNotNull(group)
        Assert.assertEquals(group!!.start.toLong(), 28)
        Assert.assertEquals(group.content, "221.217.228.166")
        Assert.assertEquals(group.end.toLong(), 43)
    }

    @Test
    fun testGroupAll() {
        var groups: Array<Regexx.Group> = Regexx.IPV4.regexAllGroup(SAMPLE_IP_V4_MULTI)
        Assert.assertNotNull(groups)

        Assert.assertEquals(groups[0].start.toLong(), 28)
        Assert.assertEquals(groups[0].content, "221.217.228.166")
        Assert.assertEquals(groups[0].end.toLong(), 43)

        Assert.assertEquals(groups[1].start.toLong(), 55)
        Assert.assertEquals(groups[1].content, "221.217.228.167")
        Assert.assertEquals(groups[1].end.toLong(), 70)

        Assert.assertEquals(groups[2].start.toLong(), 82)
        Assert.assertEquals(groups[2].content, "221.217.228.168")
        Assert.assertEquals(groups[2].end.toLong(), 97)

        groups = REGEX_IPV4.regexAllGroup(SAMPLE_IP_V4_MULTI)
        Assert.assertNotNull(groups)

        Assert.assertEquals(groups[0].start.toLong(), 28)
        Assert.assertEquals(groups[0].content, "221.217.228.166")
        Assert.assertEquals(groups[0].end.toLong(), 43)

        Assert.assertEquals(groups[1].start.toLong(), 55)
        Assert.assertEquals(groups[1].content, "221.217.228.167")
        Assert.assertEquals(groups[1].end.toLong(), 70)

        Assert.assertEquals(groups[2].start.toLong(), 82)
        Assert.assertEquals(groups[2].content, "221.217.228.168")
        Assert.assertEquals(groups[2].end.toLong(), 97)
    }

    @Test
    fun testReplaceFirst() {
        Assert.assertEquals(Regexx.IPV4.regexReplaceFirst(SAMPLE_IP_V4, "天天向上"), SAMPLE_IP_V4_REPLACE)
        Assert.assertEquals(Regexx.IPV4.regexReplaceFirst("好好学习", "天天向上"), "好好学习")

        Assert.assertEquals(REGEX_IPV4.regexReplaceFirst(SAMPLE_IP_V4, "天天向上"), SAMPLE_IP_V4_REPLACE)
        Assert.assertEquals(REGEX_IPV4.regexReplaceFirst("好好学习", "天天向上"), "好好学习")
    }

    @Test
    fun testReplaceAll() {
        Assert.assertEquals(Regexx.IPV4.regexReplaceAll(SAMPLE_IP_V4_MULTI, "天天向上"), SAMPLE_IP_V4_MULTI_REPLACE)
        Assert.assertEquals(Regexx.IPV4.regexReplaceAll("好好学习", "天天向上"), "好好学习")

        Assert.assertEquals(REGEX_IPV4.regexReplaceAll(SAMPLE_IP_V4_MULTI, "天天向上"), SAMPLE_IP_V4_MULTI_REPLACE)
        Assert.assertEquals(REGEX_IPV4.regexReplaceAll("好好学习", "天天向上"), "好好学习")
    }
}
