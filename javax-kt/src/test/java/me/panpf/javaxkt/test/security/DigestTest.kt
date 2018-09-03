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

class DigestTest {

    companion object {

        private val TEST_TEXT = "禅诗灵韵妙和声，秋叶飘飞过江东。一抹时光生惬意，妍媚红尘缱绻中。"

        private val TEXT_MD5 = "ec229d5c3f1ea99ad80efafb4e182fff"
        private val TEXT_MD5_16 = "3f1ea99ad80efafb"
        private val TEXT_SHA1 = "a5fbb18faa9d2f395ca85ba3960eaa807b0e4a17"
        private val TEXT_SHA256 = "dc2f25d24329aee85ff9e2134c928fd7ecbbaae28eaf532fd0be46223d0a2acb"
        private val TEXT_SHA512 = "84e439bcd7918c13d70a788212730d34be432b4eaa3f30803633444b63319dc14d1a3f1592deb7ce33499b7cb67c4d7311e216f0fe0c3539f96bd118be63e28e"

        private val FILE_MD5 = "1b1e3c0b3266d54c646d27436c3f8e0a"
        private val FILE_MD5_16 = "3266d54c646d2743"
        private val FILE_SHA1 = "57b920fbc143d0071ed09ffcdc0bb22578ec34fb"
        private val FILE_SHA256 = "6b22cd18d0e834e909f84bac115fb28ea818b4678310fe651347daa0e0edd8dc"
        private val FILE_SHA512 = "2fcb923149e65d29b7e7e3fbb1ee64ba08a207c68cac4c6cd719f1de49504bfa1a3c5aeb8b167e0bc7156f0894e40cebea6aeeffc89f4d8ab6b0c7a73f0080d8"
    }

    @Test
    fun testDigest() {
        Assert.assertEquals(TEST_TEXT.getMD5Digest(), TEXT_MD5)
        Assert.assertEquals(TEST_TEXT.getMD5_16Digest(), TEXT_MD5_16)
        Assert.assertEquals(TEST_TEXT.getSHA1Digest(), TEXT_SHA1)
        Assert.assertEquals(TEST_TEXT.getSHA256Digest(), TEXT_SHA256)
        Assert.assertEquals(TEST_TEXT.getSHA512Digest(), TEXT_SHA512)

        val file = File("/tmp/testDigest.tmp")
        file.writeText("禅诗灵韵妙和声，秋叶飘飞过江东。一抹时光生惬意，妍媚红尘缱绻中。\n" +
                "禅诗灵韵妙和声，秋叶飘飞过江东。一抹时光生惬意，妍媚红尘缱绻中。")

        Assert.assertEquals(file.getMD5Digest(), FILE_MD5)
        Assert.assertEquals(file.getMD5_16Digest(), FILE_MD5_16)
        Assert.assertEquals(file.getSHA1Digest(), FILE_SHA1)
        Assert.assertEquals(file.getSHA256Digest(), FILE_SHA256)
        Assert.assertEquals(file.getSHA512Digest(), FILE_SHA512)

        file.delete()
    }
}
