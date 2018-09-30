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

package me.panpf.javaxkt.test.security

import me.panpf.javaxkt.security.*
import org.junit.Assert
import org.junit.Test

import java.io.File

class DigestxTest {

    companion object {

        private const val TEST_TEXT = "禅诗灵韵妙和声，秋叶飘飞过江东。一抹时光生惬意，妍媚红尘缱绻中。"

        private const val TEXT_MD2 = "4f34ef448cea9497a14be8f29e556793"
        private const val TEXT_MD5 = "ec229d5c3f1ea99ad80efafb4e182fff"
        private const val TEXT_MD5_16 = "3f1ea99ad80efafb"
        private const val TEXT_SHA1 = "a5fbb18faa9d2f395ca85ba3960eaa807b0e4a17"
        private const val TEXT_SHA256 = "dc2f25d24329aee85ff9e2134c928fd7ecbbaae28eaf532fd0be46223d0a2acb"
        private const val TEXT_SHA512 = "84e439bcd7918c13d70a788212730d34be432b4eaa3f30803633444b63319dc14d1a3f1592deb7ce33499b7cb67c4d7311e216f0fe0c3539f96bd118be63e28e"

        private const val TEST_FILE_TEXT = "天阔任云雀，山深隐羽虫。轻风如助我，一跃过江东。"

        private const val FILE_MD2 = "2a42d495ecf63d50efc684314f01b8fd"
        private const val FILE_MD5 = "2c4724f2e0756c08ee01e301f03a7591"
        private const val FILE_MD5_16 = "e0756c08ee01e301"
        private const val FILE_SHA1 = "68319460dbca64a77a77df753de69dfed4d8bb6d"
        private const val FILE_SHA256 = "4136d86d8de430af1d61ccf6c9aeced1b17d08652cac549a54e485c91e2cdeb0"
        private const val FILE_SHA512 = "68d108a115ba610f682f2a77cddda354e5cbf211ad18537f74148f71f01b6f4dc5fd72d4d17b86f2b32be3945bcc8a9fbf9b244df21cdeeecb19d86ea3f1b6ea"
    }

    @Test
    fun testInputStreamDigest() {
        Assert.assertEquals(TEST_TEXT.byteInputStream().getDigest("MD2"), TEXT_MD2)
        Assert.assertEquals(TEST_TEXT.byteInputStream().getMD5Digest(), TEXT_MD5)
        Assert.assertEquals(TEST_TEXT.byteInputStream().getMD5_16Digest(), TEXT_MD5_16)
        Assert.assertEquals(TEST_TEXT.byteInputStream().getSHA1Digest(), TEXT_SHA1)
        Assert.assertEquals(TEST_TEXT.byteInputStream().getSHA256Digest(), TEXT_SHA256)
        Assert.assertEquals(TEST_TEXT.byteInputStream().getSHA512Digest(), TEXT_SHA512)
    }

    @Test
    fun testBytesDigest() {
        Assert.assertEquals(TEST_TEXT.toByteArray().getDigest("MD2"), TEXT_MD2)
        Assert.assertEquals(TEST_TEXT.toByteArray().getMD5Digest(), TEXT_MD5)
        Assert.assertEquals(TEST_TEXT.toByteArray().getMD5_16Digest(), TEXT_MD5_16)
        Assert.assertEquals(TEST_TEXT.toByteArray().getSHA1Digest(), TEXT_SHA1)
        Assert.assertEquals(TEST_TEXT.toByteArray().getSHA256Digest(), TEXT_SHA256)
        Assert.assertEquals(TEST_TEXT.toByteArray().getSHA512Digest(), TEXT_SHA512)
    }

    @Test
    fun testTextDigest() {
        Assert.assertEquals(TEST_TEXT.getDigest("MD2"), TEXT_MD2)
        Assert.assertEquals(TEST_TEXT.getMD5Digest(), TEXT_MD5)
        Assert.assertEquals(TEST_TEXT.getMD5_16Digest(), TEXT_MD5_16)
        Assert.assertEquals(TEST_TEXT.getSHA1Digest(), TEXT_SHA1)
        Assert.assertEquals(TEST_TEXT.getSHA256Digest(), TEXT_SHA256)
        Assert.assertEquals(TEST_TEXT.getSHA512Digest(), TEXT_SHA512)
    }

    @Test
    fun testFileDigest() {
        val file = File("/tmp/testFileDigest.tmp").apply { writeText(TEST_FILE_TEXT) }

        Assert.assertEquals(file.getDigest("MD2"), FILE_MD2)
        Assert.assertEquals(file.getMD5Digest(), FILE_MD5)
        Assert.assertEquals(file.getMD5_16Digest(), FILE_MD5_16)
        Assert.assertEquals(file.getSHA1Digest(), FILE_SHA1)
        Assert.assertEquals(file.getSHA256Digest(), FILE_SHA256)
        Assert.assertEquals(file.getSHA512Digest(), FILE_SHA512)

        file.delete()
    }

    @Test
    fun testError() {
        try {
            Assert.assertEquals(TEST_TEXT.getDigest("MD25"), TEXT_MD2)
            Assert.fail()
        } catch (e: RuntimeException) {
        }
    }
}
