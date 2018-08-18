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

package me.panpf.javax.crypto;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import me.panpf.javax.util.Base64Compat;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/**
 * DES 对称加密、解密工具
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public class DESHelper {

    private static final String ALGORITHM = "DES";
    private static final String MODE_ECB = "ECB";
    private static final String MODE_CBC = "CBC";

    private Key key;
    private String mode;
    private String padding;

    private DESHelper(@NotNull Key key, @Nullable String mode, @Nullable String padding) {
        this.key = key;
        this.mode = mode;
        this.padding = padding;
    }

    /**
     * 获取密码 key
     *
     * @param password 密码
     * @return 用于解码的 key 通过密码生成
     * @throws InvalidKeyException     密码无效
     * @throws InvalidKeySpecException 密码无效
     */
    @NotNull
    public static Key key(@NotNull String password)
            throws InvalidKeyException, InvalidKeySpecException {
        DESKeySpec keySpec = new DESKeySpec(password.getBytes());
        SecretKeyFactory keyFactory;
        try {
            keyFactory = SecretKeyFactory.getInstance(ALGORITHM);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        return keyFactory.generateSecret(keySpec);
    }

    /**
     * 创建 DESHelper.Builder
     *
     * @param key 秘钥
     */
    @NotNull
    public static DESHelper.Builder makeBuilder(@NotNull Key key) {
        return new Builder(key);
    }

    /**
     * 创建使用默认 mode 和 padding 的 DESHelper
     *
     * @param key 秘钥
     */
    @NotNull
    public static DESHelper defaultConfig(@NotNull Key key) {
        return new Builder(key).build();
    }


    /**
     * 加密
     *
     * @param textBytes 待加密的明文
     * @return 加密后的密文
     * @throws InvalidKeyException       密码无效
     * @throws BadPaddingException       密码错误
     * @throws IllegalBlockSizeException 密码长度和密文长度不匹配，请检查密码长度个密文长度
     */
    @NotNull
    public byte[] encrypt(@NotNull byte[] textBytes)
            throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        return createCipher(Cipher.ENCRYPT_MODE).doFinal(textBytes);
    }

    /**
     * 加密
     *
     * @param text 待加密的明文
     * @return 加密后的密文
     * @throws InvalidKeyException       密码无效
     * @throws BadPaddingException       密码错误
     * @throws IllegalBlockSizeException 密码长度和密文长度不匹配，请检查密码长度个密文长度
     */
    @NotNull
    public byte[] encrypt(@NotNull String text)
            throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        return encrypt(text.getBytes());
    }

    /**
     * 加密并返回 BASE64 字符串
     *
     * @param textBytes 待加密的明文
     * @return 加密后的密文
     * @throws InvalidKeyException       密码无效
     * @throws BadPaddingException       密码错误
     * @throws IllegalBlockSizeException 密码长度和密文长度不匹配，请检查密码长度个密文长度
     */
    @NotNull
    public String encryptToBase64(@NotNull byte[] textBytes)
            throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        return Base64Compat.getEncoder().encodeToString(encrypt(textBytes));
    }

    /**
     * 加密并返回 BASE64 字符串
     *
     * @param text 待加密的明文
     * @return 加密后的密文
     * @throws InvalidKeyException       密码无效
     * @throws BadPaddingException       密码错误
     * @throws IllegalBlockSizeException 密码长度和密文长度不匹配，请检查密码长度个密文长度
     */
    @NotNull
    public String encryptToBase64(@NotNull String text)
            throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        return Base64Compat.getEncoder().encodeToString(encrypt(text.getBytes()));
    }

    /**
     * 解密
     *
     * @param cipherTextBytes 待解密的密文
     * @return 解密后的明文
     * @throws InvalidKeyException       密码无效
     * @throws BadPaddingException       密码错误
     * @throws IllegalBlockSizeException 密码长度和密文长度不匹配，请检查密码长度个密文长度
     */
    @NotNull
    public String decrypt(@NotNull byte[] cipherTextBytes)
            throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        Cipher cipher = createCipher(Cipher.DECRYPT_MODE);
        byte[] data = cipher.doFinal(cipherTextBytes);
        return new String(data);
    }

    /**
     * 解密
     *
     * @param cipherText 待解密的密文
     * @return 解密后的明文
     * @throws InvalidKeyException       密码无效
     * @throws BadPaddingException       密码错误
     * @throws IllegalBlockSizeException 密码长度和密文长度不匹配，请检查密码长度个密文长度
     */
    @NotNull
    public String decrypt(@NotNull String cipherText)
            throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        return decrypt(cipherText.getBytes());
    }

    /**
     * 解密使用了 BASE64 转码的密文
     *
     * @param cipherTextBytes 待解密的密文
     * @return 解密后的明文
     * @throws InvalidKeyException       密码无效
     * @throws BadPaddingException       密码错误
     * @throws IllegalBlockSizeException 密码长度和密文长度不匹配，请检查密码长度个密文长度
     */
    @NotNull
    public String decryptFromBase64(@NotNull byte[] cipherTextBytes)
            throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        return decrypt(Base64Compat.getDecoder().decode(cipherTextBytes));
    }

    /**
     * 解密使用了 BASE64 转码的密文
     *
     * @param cipherText 待解密的密文
     * @return 解密后的明文
     * @throws InvalidKeyException       密码无效
     * @throws BadPaddingException       密码错误
     * @throws IllegalBlockSizeException 密码长度和密文长度不匹配，请检查密码长度个密文长度
     */
    @NotNull
    public String decryptFromBase64(@NotNull String cipherText)
            throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        return decrypt(Base64Compat.getDecoder().decode(cipherText.getBytes()));
    }

    @NotNull
    private Cipher createCipher(int opMode) throws InvalidKeyException {
        String cipherAlgorithm;
        if (mode == null || padding == null) {
            cipherAlgorithm = ALGORITHM;
        } else {
            cipherAlgorithm = String.format("%s/%s/%s", ALGORITHM, mode, padding);
        }

        Cipher cipher;
        try {
            cipher = Cipher.getInstance(cipherAlgorithm);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new IllegalArgumentException(e);
        }

        AlgorithmParameterSpec spec = null;
        if (MODE_CBC.equals(mode)) {
            spec = new IvParameterSpec(new byte[cipher.getBlockSize()]);
        }

        try {
            cipher.init(opMode, key, spec);
        } catch (InvalidAlgorithmParameterException e) {
            throw new IllegalArgumentException(e);
        }

        return cipher;
    }

    public static class Builder {
        private static final String PADDING_NO = "NoPadding";
        //        private static final String PADDING_PKCS1 = "PKCS1Padding";  // Java 不支持
        private static final String PADDING_PKCS5 = "PKCS5Padding";
        //        private static final String PADDING_PKCS7 = "PKCS7Padding";  // Java 不支持
        private static final String PADDING_ISO10126 = "ISO10126Padding";
//        private static final String PADDING_OAEP = "OAEPPadding";  // Java 不支持
//        private static final String PADDING_SSL3 = "SSL3Padding";  // Java 不支持

        private Key key;
        private String mode;
        private String padding;

        private Builder(@NotNull Key key) {
            this.key = key;
        }

        @NotNull
        public Builder ecbMode() {
            mode = MODE_ECB;
            return this;
        }

        @NotNull
        public Builder cbcMode() {
            mode = MODE_CBC;
            return this;
        }

        @NotNull
        public Builder noPadding() {
            padding = PADDING_NO;
            return this;
        }

//        @NotNull
//        public Builder pkcs1Padding() {
//            padding = PADDING_PKCS1;
//            return this;
//        }

        @NotNull
        public Builder pkcs5Padding() {
            padding = PADDING_PKCS5;
            return this;
        }

//        @NotNull
//        public Builder pkcs7Padding() {
//            padding = PADDING_PKCS7;
//            return this;
//        }

        @NotNull
        public Builder iso10126Padding() {
            padding = PADDING_ISO10126;
            return this;
        }

//        @NotNull
//        public Builder oaepPadding() {
//            padding = PADDING_OAEP;
//            return this;
//        }

//        @NotNull
//        public Builder ssl3Padding() {
//            padding = PADDING_SSL3;
//            return this;
//        }

        @NotNull
        public DESHelper build() {
            return new DESHelper(key, mode, padding);
        }
    }
}
