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

package me.panpf.javax.test.security;

import me.panpf.javax.io.Filex;
import me.panpf.javax.io.IOStreamx;
import me.panpf.javax.security.Digestx;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class DigestxTest {

    private static final String TEST_TEXT = "禅诗灵韵妙和声，秋叶飘飞过江东。一抹时光生惬意，妍媚红尘缱绻中。";

    private static final String TEXT_MD2 = "4f34ef448cea9497a14be8f29e556793";
    private static final String TEXT_MD5 = "ec229d5c3f1ea99ad80efafb4e182fff";
    private static final String TEXT_MD5_16 = "3f1ea99ad80efafb";
    private static final String TEXT_SHA1 = "a5fbb18faa9d2f395ca85ba3960eaa807b0e4a17";
    private static final String TEXT_SHA256 = "dc2f25d24329aee85ff9e2134c928fd7ecbbaae28eaf532fd0be46223d0a2acb";
    private static final String TEXT_SHA512 = "84e439bcd7918c13d70a788212730d34be432b4eaa3f30803633444b63319dc14d1a3f1592deb7ce33499b7cb67c4d7311e216f0fe0c3539f96bd118be63e28e";

    private static final String TEST_FILE_TEXT = "天阔任云雀，山深隐羽虫。轻风如助我，一跃过江东。";

    private static final String FILE_MD2 = "2a42d495ecf63d50efc684314f01b8fd";
    private static final String FILE_MD5 = "2c4724f2e0756c08ee01e301f03a7591";
    private static final String FILE_MD5_16 = "e0756c08ee01e301";
    private static final String FILE_SHA1 = "68319460dbca64a77a77df753de69dfed4d8bb6d";
    private static final String FILE_SHA256 = "4136d86d8de430af1d61ccf6c9aeced1b17d08652cac549a54e485c91e2cdeb0";
    private static final String FILE_SHA512 = "68d108a115ba610f682f2a77cddda354e5cbf211ad18537f74148f71f01b6f4dc5fd72d4d17b86f2b32be3945bcc8a9fbf9b244df21cdeeecb19d86ea3f1b6ea";

    @Test
    public void testInputStreamDigest() throws IOException {
        Assert.assertEquals(Digestx.getDigest(IOStreamx.byteInputStream(TEST_TEXT), "MD2"), TEXT_MD2);
        Assert.assertEquals(Digestx.getMD5(IOStreamx.byteInputStream(TEST_TEXT)), TEXT_MD5);
        Assert.assertEquals(Digestx.getMD5_16(IOStreamx.byteInputStream(TEST_TEXT)), TEXT_MD5_16);
        Assert.assertEquals(Digestx.getSHA1(IOStreamx.byteInputStream(TEST_TEXT)), TEXT_SHA1);
        Assert.assertEquals(Digestx.getSHA256(IOStreamx.byteInputStream(TEST_TEXT)), TEXT_SHA256);
        Assert.assertEquals(Digestx.getSHA512(IOStreamx.byteInputStream(TEST_TEXT)), TEXT_SHA512);
    }

    @Test
    public void testBytesDigest() {
        Assert.assertEquals(Digestx.getDigest(TEST_TEXT.getBytes(), "MD2"), TEXT_MD2);
        Assert.assertEquals(Digestx.getMD5(TEST_TEXT.getBytes()), TEXT_MD5);
        Assert.assertEquals(Digestx.getMD5_16(TEST_TEXT.getBytes()), TEXT_MD5_16);
        Assert.assertEquals(Digestx.getSHA1(TEST_TEXT.getBytes()), TEXT_SHA1);
        Assert.assertEquals(Digestx.getSHA256(TEST_TEXT.getBytes()), TEXT_SHA256);
        Assert.assertEquals(Digestx.getSHA512(TEST_TEXT.getBytes()), TEXT_SHA512);
    }

    @Test
    public void testTextDigest() {
        Assert.assertEquals(Digestx.getDigest(TEST_TEXT, "MD2"), TEXT_MD2);
        Assert.assertEquals(Digestx.getMD5(TEST_TEXT), TEXT_MD5);
        Assert.assertEquals(Digestx.getMD5_16(TEST_TEXT), TEXT_MD5_16);
        Assert.assertEquals(Digestx.getSHA1(TEST_TEXT), TEXT_SHA1);
        Assert.assertEquals(Digestx.getSHA256(TEST_TEXT), TEXT_SHA256);
        Assert.assertEquals(Digestx.getSHA512(TEST_TEXT), TEXT_SHA512);
    }

    @Test
    public void testFileDigest() throws IOException {
        File file = new File("/tmp/testDigest.tmp");
        Filex.writeText(file, TEST_FILE_TEXT);

        Assert.assertEquals(Digestx.getDigest(file, "MD2"), FILE_MD2);
        Assert.assertEquals(Digestx.getMD5(file), FILE_MD5);
        Assert.assertEquals(Digestx.getMD5_16(file), FILE_MD5_16);
        Assert.assertEquals(Digestx.getSHA1(file), FILE_SHA1);
        Assert.assertEquals(Digestx.getSHA256(file), FILE_SHA256);
        Assert.assertEquals(Digestx.getSHA512(file), FILE_SHA512);

        file.delete();
    }

    @Test
    public void  testError() {
        try {
            Assert.assertEquals(Digestx.getDigest(TEST_TEXT, "MD25"), TEXT_MD2);
            Assert.fail();
        } catch (RuntimeException ignored) {
        }
    }
}
