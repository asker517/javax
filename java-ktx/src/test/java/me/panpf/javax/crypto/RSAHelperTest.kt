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
import java.security.KeyPair
import java.security.SignatureException

class RSAHelperTest {

    /**
     * 测试公钥加密私钥解密
     */
    @Test
    @Throws(BadPaddingException::class, InvalidKeyException::class, IllegalBlockSizeException::class)
    fun testPubPriBytes() {
        val keyPair = RSAHelper.createKey(1024)
        val rsaHelper = RSAHelper.defaultConfig()
        val decryptResult = rsaHelper.decrypt(keyPair.private, rsaHelper.encrypt(keyPair.public, SOURCE.toByteArray()))
        Assert.assertEquals("testPubPriBytes", SOURCE, decryptResult)
    }

    /**
     * 测试私钥加密公钥解密
     */
    @Test
    @Throws(BadPaddingException::class, InvalidKeyException::class, IllegalBlockSizeException::class)
    fun testPriPubBytes() {
        val keyPair = RSAHelper.createKey(1024)
        val rsaHelper = RSAHelper.defaultConfig()
        val decryptResult = rsaHelper.decrypt(keyPair.public, rsaHelper.encrypt(keyPair.private, SOURCE.toByteArray()))
        Assert.assertEquals("testPriPubBytes", SOURCE, decryptResult)
    }

    /**
     * 测试公钥加密私钥解密转 Base64
     */
    @Test
    @Throws(BadPaddingException::class, InvalidKeyException::class, IllegalBlockSizeException::class)
    fun testPubPriWithBase64() {
        val keyPair = RSAHelper.createKey(1024)
        val rsaHelper = RSAHelper.defaultConfig()
        val decryptResult = rsaHelper.decryptFromBase64(keyPair.private, rsaHelper.encryptToBase64(keyPair.public, SOURCE))
        Assert.assertEquals("testPubPriWithBase64", SOURCE, decryptResult)
    }

    /**
     * 测试私钥加密公钥解密转 Base64
     */
    @Test
    @Throws(BadPaddingException::class, InvalidKeyException::class, IllegalBlockSizeException::class)
    fun testPriPubWithBase64() {
        val keyPair = RSAHelper.createKey(1024)
        val rsaHelper = RSAHelper.defaultConfig()
        val decryptResult = rsaHelper.decryptFromBase64(keyPair.public, rsaHelper.encryptToBase64(keyPair.private, SOURCE))
        Assert.assertEquals("testPriPubWithBase64", SOURCE, decryptResult)
    }


    /**
     * 测试签名、验证
     */
    @Test
    @Throws(InvalidKeyException::class, SignatureException::class)
    fun testSignBytes() {
        val keyPair = RSAHelper.createKey(1024)
        val bytesSign = RSAHelper.sign(keyPair.private, SOURCE)
        Assert.assertTrue("testSignBytes", RSAHelper.verify(keyPair.public, SOURCE, bytesSign))
    }

    /**
     * 测试签名、验证 Base64
     */
    @Test
    @Throws(InvalidKeyException::class, SignatureException::class)
    fun testSignWithBase64() {
        val keyPair = RSAHelper.createKey(1024)
        val base64Sign = RSAHelper.signToBase64(keyPair.private, SOURCE)
        Assert.assertTrue("testSignWithBase64", RSAHelper.verifyFromBase64(keyPair.public, SOURCE, base64Sign))
    }

    /**
     * 使用错误的 KEY 解密
     */
    @Test
    @Throws(InvalidKeyException::class, IllegalBlockSizeException::class, BadPaddingException::class)
    fun testErrorKey() {
        val rsaHelper = RSAHelper.defaultConfig()

        val encryptBytes = rsaHelper.encrypt(RSAHelper.createKey(1024).public, SOURCE.toByteArray())
        var bytesPriKeyDecryptResult: String? = null
        try {
            bytesPriKeyDecryptResult = rsaHelper.decrypt(RSAHelper.createKey(1024).private, encryptBytes)
        } catch (e: BadPaddingException) {
            //            e.printStackTrace();
        }

        Assert.assertNotEquals("testErrorKey", SOURCE, bytesPriKeyDecryptResult)
    }


    //    @Test
    //    public void testEcbNoPadding() throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
    //        RSAHelper rsaHelper = RSAHelper.makeBuilder().ecbMode().noPadding().build();
    //        KeyPair keyPair = RSAHelper.createKey(1024);
    //        String decryptResult = rsaHelper.decrypt(keyPair.getPrivate(), rsaHelper.encrypt(keyPair.getPublic(), SOURCE.getBytes()));
    //        Assert.assertEquals("testEcbNoPadding", SOURCE, decryptResult);
    //    }

    @Test
    @Throws(InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
    fun testEcbPKCS1Padding() {
        val rsaHelper = RSAHelper.makeBuilder().ecbMode().pkcs1Padding().build()
        val keyPair = RSAHelper.createKey(1024)
        val decryptResult = rsaHelper.decrypt(keyPair.private, rsaHelper.encrypt(keyPair.public, SOURCE.toByteArray()))
        Assert.assertEquals("testEcbPKCS1Padding", SOURCE, decryptResult)
    }

    //    @Test
    //    public void testEcbPKCS5Padding() throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
    //        RSAHelper rsaHelper = RSAHelper.makeBuilder().ecbMode().pkcs5Padding().build();
    //        KeyPair keyPair = RSAHelper.createKey(1024);
    //        String decryptResult = rsaHelper.decrypt(keyPair.getPrivate(), rsaHelper.encrypt(keyPair.getPublic(), SOURCE.getBytes()));
    //        Assert.assertEquals("testEcbPKCS5Padding", SOURCE, decryptResult);
    //    }

    //    @Test
    //    public void testEcbPKCS7Padding() throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
    //        RSAHelper rsaHelper = RSAHelper.makeBuilder().ecbMode().pkcs7Padding().build();
    //        KeyPair keyPair = RSAHelper.createKey(1024);
    //        String decryptResult = rsaHelper.decrypt(keyPair.getPrivate(), rsaHelper.encrypt(keyPair.getPublic(), SOURCE.getBytes()));
    //        Assert.assertEquals("testEcbPKCS7Padding", SOURCE, decryptResult);
    //    }

    //    @Test
    //    public void testEcbISO10126Padding() throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
    //        RSAHelper rsaHelper = RSAHelper.makeBuilder().ecbMode().iso10126Padding().build();
    //        KeyPair keyPair = RSAHelper.createKey(1024);
    //        String decryptResult = rsaHelper.decrypt(keyPair.getPrivate(), rsaHelper.encrypt(keyPair.getPublic(), SOURCE.getBytes()));
    //        Assert.assertEquals("testEcbISO10126Padding", SOURCE, decryptResult);
    //    }

    @Test
    @Throws(InvalidKeyException::class, BadPaddingException::class, IllegalBlockSizeException::class)
    fun testEcbOAEPPadding() {
        val rsaHelper = RSAHelper.makeBuilder().ecbMode().oaepPadding().build()
        val keyPair = RSAHelper.createKey(1024)
        val decryptResult = rsaHelper.decrypt(keyPair.private, rsaHelper.encrypt(keyPair.public, SOURCE_OAEP.toByteArray()))
        Assert.assertEquals("testEcbOAEPPadding", SOURCE_OAEP, decryptResult)
    }

    companion object {

        private val SOURCE = "{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}{\"key1\":\"value1\",\"key2\":\"value2\"}"

        private val SOURCE_OAEP = "小红那年七岁，她跟着爸妈去赶集，站在一个卖童装的摊位旁边"
    }

    //    @Test
    //    public void testEcbSSL3Padding() throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
    //        KeyPair keyPair = RSAHelper.createKey(1024);
    //        RSAHelper rsaHelper = RSAHelper.makeBuilder().ecbMode().ssl3Padding().build();
    //        String decryptResult = rsaHelper.decrypt(keyPair.getPrivate(), rsaHelper.encrypt(keyPair.getPublic(), SOURCE.getBytes()));
    //        Assert.assertEquals("testEcbSSL3Padding", SOURCE, decryptResult);
    //    }


    //    @Test
    //    public void testCbcNoPadding() throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
    //        RSAHelper rsaHelper = RSAHelper.makeBuilder().cbcMode().noPadding().build();
    //        KeyPair keyPair = RSAHelper.createKey(1024);
    //        String decryptResult = rsaHelper.decrypt(keyPair.getPrivate(), rsaHelper.encrypt(keyPair.getPublic(), SOURCE.getBytes()));
    //        Assert.assertEquals("testCbcNoPadding", SOURCE, decryptResult);
    //    }

    //    @Test
    //    public void testCbcPKCS1Padding() throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
    //        RSAHelper rsaHelper = RSAHelper.makeBuilder().cbcMode().pkcs1Padding().build();
    //        KeyPair keyPair = RSAHelper.createKey(1024);
    //        String decryptResult = rsaHelper.decrypt(keyPair.getPrivate(), rsaHelper.encrypt(keyPair.getPublic(), SOURCE.getBytes()));
    //        Assert.assertEquals("testCbcPKCS1Padding", SOURCE, decryptResult);
    //    }

    //    @Test
    //    public void testCbcPKCS5Padding() throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
    //        RSAHelper rsaHelper = RSAHelper.makeBuilder().cbcMode().pkcs5Padding().build();
    //        KeyPair keyPair = RSAHelper.createKey(1024);
    //        String decryptResult = rsaHelper.decrypt(keyPair.getPrivate(), rsaHelper.encrypt(keyPair.getPublic(), SOURCE.getBytes()));
    //        Assert.assertEquals("testCbcPKCS5Padding", SOURCE, decryptResult);
    //    }

    //    @Test
    //    public void testCbcPKCS7Padding() throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
    //        RSAHelper rsaHelper = RSAHelper.makeBuilder().cbcMode().pkcs7Padding().build();
    //        KeyPair keyPair = RSAHelper.createKey(1024);
    //        String decryptResult = rsaHelper.decrypt(keyPair.getPrivate(), rsaHelper.encrypt(keyPair.getPublic(), SOURCE.getBytes()));
    //        Assert.assertEquals("testCbcPKCS7Padding", SOURCE, decryptResult);
    //    }

    //    @Test
    //    public void testCbcISO10126Padding() throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
    //        RSAHelper rsaHelper = RSAHelper.makeBuilder().cbcMode().iso10126Padding().build();
    //        KeyPair keyPair = RSAHelper.createKey(1024);
    //        String decryptResult = rsaHelper.decrypt(keyPair.getPrivate(), rsaHelper.encrypt(keyPair.getPublic(), SOURCE.getBytes()));
    //        Assert.assertEquals("testCbcISO10126Padding", SOURCE, decryptResult);
    //    }

    //    @Test
    //    public void testCbcOAEPPadding() throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
    //        RSAHelper rsaHelper = RSAHelper.makeBuilder().cbcMode().oaepPadding().build();
    //        KeyPair keyPair = RSAHelper.createKey(1024);
    //        String decryptResult = rsaHelper.decrypt(keyPair.getPrivate(), rsaHelper.encrypt(keyPair.getPublic(), SOURCE_OAEP.getBytes()));
    //        Assert.assertEquals("testCbcOAEPPadding", SOURCE_OAEP, decryptResult);
    //    }

    //    @Test
    //    public void testCbcSSL3Padding() throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
    //        KeyPair keyPair = RSAHelper.createKey(1024);
    //        RSAHelper rsaHelper = RSAHelper.makeBuilder().cbcMode().ssl3Padding().build();
    //        String decryptResult = rsaHelper.decrypt(keyPair.getPrivate(), rsaHelper.encrypt(keyPair.getPublic(), SOURCE.getBytes()));
    //        Assert.assertEquals("testCbcSSL3Padding", SOURCE, decryptResult);
    //    }
}