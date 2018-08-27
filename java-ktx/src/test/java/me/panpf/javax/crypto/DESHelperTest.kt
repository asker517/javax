/*
 * Copyright (C) 2018 Peng fei Pan <sky@panpf.me>
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

package me.panpf.javax.crypto

import org.junit.Assert
import org.junit.Test

import javax.crypto.BadPaddingException
import javax.crypto.IllegalBlockSizeException
import java.security.InvalidKeyException
import java.security.spec.InvalidKeySpecException

class DESHelperTest {

    @Test
    @Throws(InvalidKeySpecException::class, InvalidKeyException::class, IllegalBlockSizeException::class, BadPaddingException::class)
    fun testDefaultConfig() {
        val desHelper = DESHelper.defaultConfig(DESHelper.key(PASSWORD))
        val decryptResult = desHelper.decrypt(desHelper.encrypt(SOURCE.toByteArray()))
        Assert.assertEquals("testDefaultConfig", SOURCE, decryptResult)
    }

    @Test
    @Throws(InvalidKeySpecException::class, InvalidKeyException::class, IllegalBlockSizeException::class, BadPaddingException::class)
    fun testDefaultConfigWithBase64() {
        val desHelper = DESHelper.defaultConfig(DESHelper.key(PASSWORD))
        val decryptResult = desHelper.decrypt(desHelper.encrypt(SOURCE.toByteArray()))
        Assert.assertEquals("testDefaultConfigWithBase64", SOURCE, decryptResult)
    }


    @Test
    @Throws(InvalidKeySpecException::class, InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
    fun testEcbNoPadding() {
        val desHelper = DESHelper.makeBuilder(DESHelper.key(PASSWORD)).ecbMode().noPadding().build()
        val decryptResult = desHelper.decrypt(desHelper.encrypt(SOURCE_NOPADDING.toByteArray()))
        Assert.assertEquals("testEcbPKCS5Padding", SOURCE_NOPADDING, decryptResult)
    }

    //    @Test
    //    public void testEcbPKCS1Padding() throws InvalidKeySpecException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
    //        DESHelper desHelper = DESHelper.makeBuilder(DESHelper.key(PASSWORD)).ecbMode().pkcs1Padding().build();
    //        String decryptResult = desHelper.decrypt(desHelper.encrypt(SOURCE.getBytes()));
    //        Assert.assertEquals("testEcbPKCS5Padding", SOURCE, decryptResult);
    //    }

    @Test
    @Throws(InvalidKeySpecException::class, InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
    fun testEcbPKCS5Padding() {
        val desHelper = DESHelper.makeBuilder(DESHelper.key(PASSWORD)).ecbMode().pkcs5Padding().build()
        val decryptResult = desHelper.decrypt(desHelper.encrypt(SOURCE.toByteArray()))
        Assert.assertEquals("testEcbPKCS5Padding", SOURCE, decryptResult)
    }

    //    @Test
    //    public void testEcbPKCS7Padding() throws InvalidKeySpecException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
    //        DESHelper desHelper = DESHelper.makeBuilder(DESHelper.key(PASSWORD)).ecbMode().pkcs7Padding().build();
    //        String decryptResult = desHelper.decrypt(desHelper.encrypt(SOURCE.getBytes()));
    //        Assert.assertEquals("testEcbPKCS7Padding", SOURCE, decryptResult);
    //    }

    @Test
    @Throws(InvalidKeySpecException::class, InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
    fun testEcbISO10126Padding() {
        val desHelper = DESHelper.makeBuilder(DESHelper.key(PASSWORD)).ecbMode().iso10126Padding().build()
        val decryptResult = desHelper.decrypt(desHelper.encrypt(SOURCE.toByteArray()))
        Assert.assertEquals("testEcbISO10126Padding", SOURCE, decryptResult)
    }

    //    @Test
    //    public void testEcbOAEPPadding() throws InvalidKeySpecException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
    //        DESHelper desHelper = DESHelper.makeBuilder(DESHelper.key(PASSWORD)).ecbMode().oaepPadding().build();
    //        String decryptResult = desHelper.decrypt(desHelper.encrypt(SOURCE.getBytes()));
    //        Assert.assertEquals("testEcbOAEPPadding", SOURCE, decryptResult);
    //    }

    //    @Test
    //    public void testEcbSSL3Padding() throws InvalidKeySpecException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
    //        DESHelper desHelper = DESHelper.makeBuilder(DESHelper.key(PASSWORD)).ecbMode().ssl3Padding().build();
    //        String decryptResult = desHelper.decrypt(desHelper.encrypt(SOURCE.getBytes()));
    //        Assert.assertEquals("testEcbSSL3Padding", SOURCE, decryptResult);
    //    }


    @Test
    @Throws(InvalidKeySpecException::class, InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
    fun testCbcNoPadding() {
        val desHelper = DESHelper.makeBuilder(DESHelper.key(PASSWORD)).cbcMode().noPadding().build()
        val decryptResult = desHelper.decrypt(desHelper.encrypt(SOURCE_NOPADDING.toByteArray()))
        Assert.assertEquals("testCbcPKCS5Padding", SOURCE_NOPADDING, decryptResult)
    }

    //    @Test
    //    public void testCbcPKCS1Padding() throws InvalidKeySpecException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
    //        DESHelper desHelper = DESHelper.makeBuilder(DESHelper.key(PASSWORD)).cbcMode().pkcs1Padding().build();
    //        String decryptResult = desHelper.decrypt(desHelper.encrypt(SOURCE.getBytes()));
    //        Assert.assertEquals("testCbcPKCS5Padding", SOURCE, decryptResult);
    //    }

    @Test
    @Throws(InvalidKeySpecException::class, InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
    fun testCbcPKCS5Padding() {
        val desHelper = DESHelper.makeBuilder(DESHelper.key(PASSWORD)).cbcMode().pkcs5Padding().build()
        val decryptResult = desHelper.decrypt(desHelper.encrypt(SOURCE.toByteArray()))
        Assert.assertEquals("testCbcPKCS5Padding", SOURCE, decryptResult)
    }

    //    @Test
    //    public void testCbcPKCS7Padding() throws InvalidKeySpecException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
    //        DESHelper desHelper = DESHelper.makeBuilder(DESHelper.key(PASSWORD)).cbcMode().pkcs7Padding().build();
    //        String decryptResult = desHelper.decrypt(desHelper.encrypt(SOURCE.getBytes()));
    //        Assert.assertEquals("testCbcPKCS7Padding", SOURCE, decryptResult);
    //    }

    @Test
    @Throws(InvalidKeySpecException::class, InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
    fun testCbcISO10126Padding() {
        val desHelper = DESHelper.makeBuilder(DESHelper.key(PASSWORD)).cbcMode().iso10126Padding().build()
        val decryptResult = desHelper.decrypt(desHelper.encrypt(SOURCE.toByteArray()))
        Assert.assertEquals("testCbcISO10126Padding", SOURCE, decryptResult)
    }

    //    @Test
    //    public void testCbcOAEPPadding() throws InvalidKeySpecException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
    //        DESHelper desHelper = DESHelper.makeBuilder(DESHelper.key(PASSWORD)).cbcMode().oaepPadding().build();
    //        String decryptResult = desHelper.decrypt(desHelper.encrypt(SOURCE.getBytes()));
    //        Assert.assertEquals("testCbcOAEPPadding", SOURCE, decryptResult);
    //    }

    //    @Test
    //    public void testCbcSSL3Padding() throws InvalidKeySpecException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
    //        DESHelper desHelper = DESHelper.makeBuilder(DESHelper.key(PASSWORD)).cbcMode().ssl3Padding().build();
    //        String decryptResult = desHelper.decrypt(desHelper.encrypt(SOURCE.getBytes()));
    //        Assert.assertEquals("testCbcSSL3Padding", SOURCE, decryptResult);
    //    }


    @Test
    @Throws(InvalidKeySpecException::class, InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
    fun testErrorPassword() {
        val desHelper = DESHelper.makeBuilder(DESHelper.key(PASSWORD)).ecbMode().pkcs5Padding().build()
        val errorDesHelper = DESHelper.makeBuilder(DESHelper.key(PASSWORD_ERROR)).ecbMode().pkcs5Padding().build()

        val encryptResult = desHelper.encryptToBase64(SOURCE)
        var errorDecryptResult: String? = null
        try {
            errorDecryptResult = errorDesHelper.decryptFromBase64(encryptResult)
        } catch (e: BadPaddingException) {
            //            e.printStackTrace();
        }

        Assert.assertNotEquals("【DES】eTest error password failed", SOURCE, errorDecryptResult)
    }

    @Test
    @Throws(InvalidKeySpecException::class, InvalidKeyException::class, IllegalBlockSizeException::class, BadPaddingException::class)
    fun testLikePassword() {
        val desHelper = DESHelper.makeBuilder(DESHelper.key(PASSWORD)).ecbMode().pkcs5Padding().build()
        val likeDesHelper = DESHelper.makeBuilder(DESHelper.key(PASSWORD_LIKE)).ecbMode().pkcs5Padding().build()

        val encryptResult = desHelper.encryptToBase64(SOURCE)
        val likeDecryptResult = likeDesHelper.decryptFromBase64(encryptResult)

        Assert.assertEquals("testLikePassword", SOURCE, likeDecryptResult)
    }

    companion object {
        private val PASSWORD = "18237482748921347893"
        private val PASSWORD_ERROR = "abcdefteryrhhgdsgdsg"
        private val PASSWORD_LIKE = "182374827489"
        private val SOURCE = "小红那年七岁，她跟着爸妈去赶集，站在一个卖童装的摊位旁边，盯着那条裙子，无论如何都不肯走。\n" +
                "\n" +
                "她太想要这样一条裙子了，或者说白了，她想要一件新衣服，一件不是妈妈手工做的，而是商店里买来的衣服。\n" +
                "\n" +
                "她听见已经走出了几步的妈妈跟站得更远的爸爸说，“这孩子到底随谁呢？才这么大就这么臭美？我们家里人哪有这种样子的？能不能要点脸？”\n" +
                "\n" +
                "爸爸已经非常烦躁，走上前来，不由分说劈头给了她一个耳光，“就知道穿穿穿，打扮那么排场出去干什么？”\n" +
                "\n" +
                "她哇地一声哭了，妈妈倒是很恼怒地跑过来拉住爸爸，“你有病吗？谁让你打她了？”\n" +
                "\n" +
                "可是裙子最终还是没买。她反而成了全家人的笑柄，一直到很多年后，妈妈提起她小时候，还是笑得肚子疼，“一丁点儿大，臭美得很！”\n" +
                "\n" +
                "然后有兄弟姐妹在旁边起哄揶揄她"

        private val SOURCE_NOPADDING = "小红那年七岁，她跟着爸妈去赶集，站在一个卖童装的摊位旁边，盯着那"
    }
}
