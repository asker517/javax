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

package me.panpf.javax.test.util;

import me.panpf.javax.util.Arrayx;
import me.panpf.javax.util.Regexx;
import org.junit.Assert;
import org.junit.Test;

public class RegexxTest {

    private static final String REGEX_IPV4 = "((?:(?:25[0-5]|2[0-4]\\d|(?:1\\d{2}|[1-9]?\\d))\\.){3}(?:25[0-5]|2[0-4]\\d|(?:1\\d{2}|[1-9]?\\d)))";

    private static final String SAMPLE_IP_V4_MATCHES = "221.217.228.166";
    private static final String SAMPLE_IP_V4 = "var returnCitySN = {\"cip\": \"221.217.228.166\", \"cid\": \"110105\", \"cname\": \"北京市朝阳区\"};";
    private static final String SAMPLE_IP_V4_MULTI = "var returnCitySN = {\"cip\": \"221.217.228.166\", \"cip2\": \"221.217.228.167\", \"cip3\": \"221.217.228.168\", \"cid\": \"110105\", \"cname\": \"北京市朝阳区\"};";
    private static final String SAMPLE_IP_V4_REPLACE = "var returnCitySN = {\"cip\": \"天天向上\", \"cid\": \"110105\", \"cname\": \"北京市朝阳区\"};";
    private static final String SAMPLE_IP_V4_MULTI_REPLACE = "var returnCitySN = {\"cip\": \"天天向上\", \"cip2\": \"天天向上\", \"cip3\": \"天天向上\", \"cid\": \"110105\", \"cname\": \"北京市朝阳区\"};";

    @Test
    public void testMatches() {
        Assert.assertTrue(Regexx.matches(Regexx.IPV4, SAMPLE_IP_V4_MATCHES));
        Assert.assertFalse(Regexx.matches(Regexx.IPV4, SAMPLE_IP_V4));

        Assert.assertTrue(Regexx.matches(REGEX_IPV4, SAMPLE_IP_V4_MATCHES));
        Assert.assertFalse(Regexx.matches(REGEX_IPV4, SAMPLE_IP_V4));
    }

    @Test
    public void testFind() {
        Assert.assertTrue(Regexx.find(Regexx.IPV4, SAMPLE_IP_V4));
        Assert.assertTrue(Regexx.find(Regexx.IPV4, SAMPLE_IP_V4, 30));
        Assert.assertFalse(Regexx.find(Regexx.IPV4, SAMPLE_IP_V4, 31));

        Assert.assertTrue(Regexx.find(REGEX_IPV4, SAMPLE_IP_V4));
        Assert.assertTrue(Regexx.find(REGEX_IPV4, SAMPLE_IP_V4, 30));
        Assert.assertFalse(Regexx.find(REGEX_IPV4, SAMPLE_IP_V4, 31));
    }

    @Test
    public void testLookingAt() {
        Assert.assertTrue(Regexx.lookingAt(Regexx.IPV4, "221.217.228.166\", \"cid\": \"110105\", \"cname\": \"北京市朝阳区\"};"));
        Assert.assertFalse(Regexx.lookingAt(Regexx.IPV4, SAMPLE_IP_V4));

        Assert.assertTrue(Regexx.lookingAt(REGEX_IPV4, "221.217.228.166\", \"cid\": \"110105\", \"cname\": \"北京市朝阳区\"};"));
        Assert.assertFalse(Regexx.lookingAt(REGEX_IPV4, SAMPLE_IP_V4));
    }

    @Test
    public void testGetFirst() {
        Assert.assertEquals(Regexx.getFirst(Regexx.IPV4, SAMPLE_IP_V4), "221.217.228.166");
        Assert.assertNull(Regexx.getFirst(Regexx.IPV4, "好好学习"));

        Assert.assertEquals(Regexx.getFirst(REGEX_IPV4, SAMPLE_IP_V4), "221.217.228.166");
        Assert.assertNull(Regexx.getFirst(REGEX_IPV4, "好好学习"));
    }

    @Test
    public void testGetAll() {
        Assert.assertArrayEquals(Regexx.getAll(Regexx.IPV4, SAMPLE_IP_V4), Arrayx.arrayOf("221.217.228.166"));
        Assert.assertArrayEquals(Regexx.getAll(Regexx.IPV4, "好好学习"), new String[0]);
        Assert.assertArrayEquals(Regexx.getAll(Regexx.IPV4, SAMPLE_IP_V4_MULTI), Arrayx.arrayOf("221.217.228.166", "221.217.228.167", "221.217.228.168"));

        Assert.assertArrayEquals(Regexx.getAll(REGEX_IPV4, SAMPLE_IP_V4), Arrayx.arrayOf("221.217.228.166"));
        Assert.assertArrayEquals(Regexx.getAll(REGEX_IPV4, "好好学习"), new String[0]);
        Assert.assertArrayEquals(Regexx.getAll(REGEX_IPV4, SAMPLE_IP_V4_MULTI), Arrayx.arrayOf("221.217.228.166", "221.217.228.167", "221.217.228.168"));
    }

    @Test
    public void testGroupFirst() {
        Regexx.Group group = Regexx.firstGroup(Regexx.IPV4, SAMPLE_IP_V4);
        Assert.assertNotNull(group);
        Assert.assertEquals(group.getStart(), 28);
        Assert.assertEquals(group.getContent(), "221.217.228.166");
        Assert.assertEquals(group.getEnd(), 43);

        group = Regexx.firstGroup(REGEX_IPV4, SAMPLE_IP_V4);
        Assert.assertNotNull(group);
        Assert.assertEquals(group.getStart(), 28);
        Assert.assertEquals(group.getContent(), "221.217.228.166");
        Assert.assertEquals(group.getEnd(), 43);
    }

    @Test
    public void testGroupAll() {
        Regexx.Group[] groups = Regexx.allGroup(Regexx.IPV4, SAMPLE_IP_V4_MULTI);
        Assert.assertNotNull(groups);

        Assert.assertEquals(groups[0].getStart(), 28);
        Assert.assertEquals(groups[0].getContent(), "221.217.228.166");
        Assert.assertEquals(groups[0].getEnd(), 43);

        Assert.assertEquals(groups[1].getStart(), 55);
        Assert.assertEquals(groups[1].getContent(), "221.217.228.167");
        Assert.assertEquals(groups[1].getEnd(), 70);

        Assert.assertEquals(groups[2].getStart(), 82);
        Assert.assertEquals(groups[2].getContent(), "221.217.228.168");
        Assert.assertEquals(groups[2].getEnd(), 97);

        groups = Regexx.allGroup(REGEX_IPV4, SAMPLE_IP_V4_MULTI);
        Assert.assertNotNull(groups);

        Assert.assertEquals(groups[0].getStart(), 28);
        Assert.assertEquals(groups[0].getContent(), "221.217.228.166");
        Assert.assertEquals(groups[0].getEnd(), 43);

        Assert.assertEquals(groups[1].getStart(), 55);
        Assert.assertEquals(groups[1].getContent(), "221.217.228.167");
        Assert.assertEquals(groups[1].getEnd(), 70);

        Assert.assertEquals(groups[2].getStart(), 82);
        Assert.assertEquals(groups[2].getContent(), "221.217.228.168");
        Assert.assertEquals(groups[2].getEnd(), 97);
    }

    @Test
    public void testReplaceFirst() {
        Assert.assertEquals(Regexx.replaceFirst(Regexx.IPV4, SAMPLE_IP_V4, "天天向上"), SAMPLE_IP_V4_REPLACE);
        Assert.assertEquals(Regexx.replaceFirst(Regexx.IPV4, "好好学习", "天天向上"), "好好学习");

        Assert.assertEquals(Regexx.replaceFirst(REGEX_IPV4, SAMPLE_IP_V4, "天天向上"), SAMPLE_IP_V4_REPLACE);
        Assert.assertEquals(Regexx.replaceFirst(REGEX_IPV4, "好好学习", "天天向上"), "好好学习");
    }

    @Test
    public void testReplaceAll() {
        Assert.assertEquals(Regexx.replaceAll(Regexx.IPV4, SAMPLE_IP_V4_MULTI, "天天向上"), SAMPLE_IP_V4_MULTI_REPLACE);
        Assert.assertEquals(Regexx.replaceAll(Regexx.IPV4, "好好学习", "天天向上"), "好好学习");

        Assert.assertEquals(Regexx.replaceAll(REGEX_IPV4, SAMPLE_IP_V4_MULTI, "天天向上"), SAMPLE_IP_V4_MULTI_REPLACE);
        Assert.assertEquals(Regexx.replaceAll(REGEX_IPV4, "好好学习", "天天向上"), "好好学习");
    }
}
