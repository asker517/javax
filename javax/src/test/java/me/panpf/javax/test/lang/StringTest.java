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

package me.panpf.javax.test.lang;

import me.panpf.javax.lang.Stringx;
import me.panpf.javax.util.Arrayx;
import me.panpf.javax.util.Collectionx;
import org.junit.Test;

import java.util.Collection;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class StringTest {

    private static final String BLANK = "     ";
    private static final String EMPTY = "";
    private static final String YES = "yes";
    private static final String DIGIT = "8";
    private static final String LETTER = "a飞";
    private static final String CHINESE = "飞";
    private static final String LETTER_OR_DIGIT = "a飞8";
    private static final String SYMBOL = "*%￥#@";

    @Test
    public void testSafe() {
        assertTrue(Stringx.isSafe(YES));
        assertFalse(Stringx.isSafe(null));
        assertFalse(Stringx.isSafe(BLANK));
        assertFalse(Stringx.isSafe(EMPTY));

        assertTrue(Stringx.isNotSafe(null));
        assertTrue(Stringx.isNotSafe(BLANK));
        assertTrue(Stringx.isNotSafe(EMPTY));
        assertFalse(Stringx.isNotSafe(YES));

//        assertTrue(Stringx.isAllSafe(Arrayx.arrayOf(YES, YES)));
//        assertFalse(Stringx.isAllSafe(Arrayx.arrayOf(YES, null)));
//        assertTrue(Stringx.isAllSafe(Collectionx.listOf(YES, YES)));
//        assertFalse(Stringx.isAllSafe(Collectionx.listOf(YES, null)));
//        assertFalse(Stringx.isAllSafe((CharSequence[]) null));
//        assertFalse(Stringx.isAllSafe(new String[0]));
//        assertFalse(Stringx.isAllSafe((Collection<CharSequence>) null));
//        assertFalse(Stringx.isAllSafe(new LinkedList<String>()));
//
//        assertTrue(Stringx.isAllNotSafe(Arrayx.arrayOf(BLANK, EMPTY)));
//        assertFalse(Stringx.isAllNotSafe(Arrayx.arrayOf(BLANK, YES)));
//        assertTrue(Stringx.isAllNotSafe(Collectionx.listOf(BLANK, EMPTY)));
//        assertFalse(Stringx.isAllNotSafe(Collectionx.listOf(BLANK, YES)));
//        assertTrue(Stringx.isAllNotSafe((CharSequence[]) null));
//        assertTrue(Stringx.isAllNotSafe(new String[0]));
//        assertTrue(Stringx.isAllNotSafe((Collection<CharSequence>) null));
//        assertTrue(Stringx.isAllNotSafe(new LinkedList<String>()));
//
//        assertTrue(Stringx.isPartSafe(Arrayx.arrayOf(YES, null)));
//        assertFalse(Stringx.isPartSafe(Arrayx.arrayOf(YES, YES)));
//        assertFalse(Stringx.isPartSafe(Arrayx.arrayOf((CharSequence) null, null)));
//        assertTrue(Stringx.isPartSafe(Collectionx.listOf(YES, null)));
//        assertFalse(Stringx.isPartSafe(Collectionx.listOf(YES, YES)));
//        assertFalse(Stringx.isPartSafe(Collectionx.listOf((CharSequence) null, null)));
//        assertFalse(Stringx.isPartSafe((CharSequence[]) null));
//        assertFalse(Stringx.isPartSafe(new String[0]));
//        assertFalse(Stringx.isPartSafe((Collection<CharSequence>) null));
//        assertFalse(Stringx.isPartSafe(new LinkedList<String>()));

        assertEquals(Stringx.isNotSafeOr(EMPTY, "default"), "default");
        assertEquals(Stringx.isNotSafeOr(YES, "default"), YES);
    }

    @Test
    public void testIsBlank() {
        assertTrue(Stringx.isBlank(BLANK));
        assertTrue(Stringx.isBlank(EMPTY));
        assertFalse(Stringx.isBlank(YES));
        assertFalse(Stringx.isBlank(null));

        assertTrue(Stringx.isNotBlank(YES));
        assertTrue(Stringx.isNotBlank(null));
        assertFalse(Stringx.isNotBlank(BLANK));
        assertFalse(Stringx.isNotBlank(EMPTY));

//        assertTrue(Stringx.isAllBlank(Arrayx.arrayOf(BLANK, EMPTY)));
//        assertFalse(Stringx.isAllBlank(Arrayx.arrayOf(YES, BLANK)));
//        assertTrue(Stringx.isAllBlank(Collectionx.listOf(BLANK, EMPTY)));
//        assertFalse(Stringx.isAllBlank(Collectionx.listOf(YES, BLANK)));
//        assertFalse(Stringx.isAllBlank((CharSequence[]) null));
//        assertFalse(Stringx.isAllBlank((Collection<CharSequence>) null));
//        assertFalse(Stringx.isAllBlank(new String[0]));
//        assertFalse(Stringx.isAllBlank(new LinkedList<String>()));
//
//        assertTrue(Stringx.isAllNotBlank(Arrayx.arrayOf(YES, YES)));
//        assertFalse(Stringx.isAllNotBlank(Arrayx.arrayOf(YES, BLANK)));
//        assertTrue(Stringx.isAllNotBlank(Collectionx.listOf(YES, YES)));
//        assertFalse(Stringx.isAllNotBlank(Collectionx.listOf(YES, BLANK)));
//        assertTrue(Stringx.isAllNotBlank((CharSequence[]) null));
//        assertTrue(Stringx.isAllNotBlank((Collection<CharSequence>) null));
//        assertTrue(Stringx.isAllNotBlank(new String[0]));
//        assertTrue(Stringx.isAllNotBlank(new LinkedList<String>()));
//
//        assertTrue(Stringx.isPartBlank(Arrayx.arrayOf(BLANK, YES)));
//        assertFalse(Stringx.isPartBlank(Arrayx.arrayOf(BLANK, BLANK)));
//        assertFalse(Stringx.isPartBlank(Arrayx.arrayOf(YES, YES)));
//        assertTrue(Stringx.isPartBlank(Collectionx.listOf(BLANK, YES)));
//        assertFalse(Stringx.isPartBlank(Collectionx.listOf(BLANK, BLANK)));
//        assertFalse(Stringx.isPartBlank(Collectionx.listOf(YES, YES)));
//        assertFalse(Stringx.isPartBlank((CharSequence[]) null));
//        assertFalse(Stringx.isPartBlank((Collection<CharSequence>) null));
//        assertFalse(Stringx.isPartBlank(new String[0]));
//        assertFalse(Stringx.isPartBlank(new LinkedList<String>()));

        assertEquals(Stringx.isBlankOr(BLANK, "default"), "default");
        assertEquals(Stringx.isBlankOr(YES, "default"), YES);


        assertTrue(Stringx.isNullOrBlank(null));
        assertTrue(Stringx.isNullOrBlank(BLANK));
        assertTrue(Stringx.isNullOrBlank(EMPTY));
        assertFalse(Stringx.isNullOrBlank(YES));

        assertTrue(Stringx.isNotNullOrBlank(YES));
        assertFalse(Stringx.isNotNullOrBlank(null));
        assertFalse(Stringx.isNotNullOrBlank(BLANK));
        assertFalse(Stringx.isNotNullOrBlank(EMPTY));

//        assertTrue(Stringx.isAllNullOrBlank(Arrayx.arrayOf(null, BLANK, EMPTY)));
//        assertFalse(Stringx.isAllNullOrBlank(Arrayx.arrayOf(YES, YES)));
//        assertTrue(Stringx.isAllNullOrBlank(Collectionx.listOf(null, BLANK, EMPTY)));
//        assertFalse(Stringx.isAllNullOrBlank(Collectionx.listOf(YES, YES)));
//        assertTrue(Stringx.isAllNullOrBlank((CharSequence[]) null));
//        assertTrue(Stringx.isAllNullOrBlank((Collection<CharSequence>) null));
//        assertTrue(Stringx.isAllNullOrBlank(new String[0]));
//        assertTrue(Stringx.isAllNullOrBlank(new LinkedList<String>()));
//
//        assertTrue(Stringx.isAllNotNullOrBlank(Arrayx.arrayOf(YES, YES)));
//        assertFalse(Stringx.isAllNotNullOrBlank(Arrayx.arrayOf(null, BLANK, EMPTY)));
//        assertTrue(Stringx.isAllNotNullOrBlank(Collectionx.listOf(YES, YES)));
//        assertFalse(Stringx.isAllNotNullOrBlank(Collectionx.listOf(null, BLANK, EMPTY)));
//        assertFalse(Stringx.isAllNotNullOrBlank((CharSequence[]) null));
//        assertFalse(Stringx.isAllNotNullOrBlank((Collection<CharSequence>) null));
//        assertFalse(Stringx.isAllNotNullOrBlank(new String[0]));
//        assertFalse(Stringx.isAllNotNullOrBlank(new LinkedList<String>()));
//
//        assertTrue(Stringx.isPartNullOrBlank(Arrayx.arrayOf(null, YES)));
//        assertFalse(Stringx.isPartNullOrBlank(Arrayx.arrayOf(YES, YES)));
//        assertFalse(Stringx.isPartNullOrBlank(Arrayx.arrayOf((CharSequence) null, null)));
//        assertTrue(Stringx.isPartNullOrBlank(Collectionx.listOf(null, YES)));
//        assertFalse(Stringx.isPartNullOrBlank(Collectionx.listOf(YES, YES)));
//        assertFalse(Stringx.isPartNullOrBlank(Collectionx.listOf((CharSequence) null, null)));
//        assertFalse(Stringx.isPartNullOrBlank((CharSequence[]) null));
//        assertFalse(Stringx.isPartNullOrBlank((Collection<CharSequence>) null));
//        assertFalse(Stringx.isPartNullOrBlank(new String[0]));
//        assertFalse(Stringx.isPartNullOrBlank(new LinkedList<String>()));

        assertEquals(Stringx.isNullOrBlankOr(BLANK, "default"), "default");
        assertEquals(Stringx.isNullOrBlankOr(null, "default"), "default");
        assertEquals(Stringx.isNullOrBlankOr(YES, "default"), YES);
    }

    @Test
    public void testIsEmpty() {
        assertTrue(Stringx.isEmpty(EMPTY));
        assertFalse(Stringx.isEmpty(BLANK));
        assertFalse(Stringx.isEmpty(YES));
        assertFalse(Stringx.isEmpty(null));

        assertTrue(Stringx.isNotEmpty(BLANK));
        assertTrue(Stringx.isNotEmpty(YES));
        assertTrue(Stringx.isNotEmpty(null));
        assertFalse(Stringx.isNotEmpty(EMPTY));

//        assertTrue(Stringx.isAllEmpty(Arrayx.arrayOf(EMPTY, EMPTY)));
//        assertFalse(Stringx.isAllEmpty(Arrayx.arrayOf(YES, EMPTY)));
//        assertFalse(Stringx.isAllEmpty((CharSequence[]) null));
//        assertTrue(Stringx.isAllEmpty(Collectionx.listOf(EMPTY, EMPTY)));
//        assertFalse(Stringx.isAllEmpty(Collectionx.listOf(YES, EMPTY)));
//        assertFalse(Stringx.isAllEmpty((CharSequence[]) null));
//        assertFalse(Stringx.isAllEmpty((Collection<CharSequence>) null));
//        assertFalse(Stringx.isAllEmpty(new String[0]));
//        assertFalse(Stringx.isAllEmpty(new LinkedList<String>()));
//
//        assertTrue(Stringx.isAllNotEmpty(Arrayx.arrayOf(YES, YES)));
//        assertFalse(Stringx.isAllNotEmpty(Arrayx.arrayOf(YES, EMPTY)));
//        assertTrue(Stringx.isAllNotEmpty(Collectionx.listOf(YES, YES)));
//        assertFalse(Stringx.isAllNotEmpty(Collectionx.listOf(YES, EMPTY)));
//        assertTrue(Stringx.isAllNotEmpty((CharSequence[]) null));
//        assertTrue(Stringx.isAllNotEmpty((Collection<CharSequence>) null));
//        assertTrue(Stringx.isAllNotEmpty(new String[0]));
//        assertTrue(Stringx.isAllNotEmpty(new LinkedList<String>()));
//
//        assertTrue(Stringx.isPartEmpty(Arrayx.arrayOf(YES, EMPTY)));
//        assertFalse(Stringx.isPartEmpty(Arrayx.arrayOf(YES, YES)));
//        assertFalse(Stringx.isPartEmpty(Arrayx.arrayOf(EMPTY, EMPTY)));
//        assertTrue(Stringx.isPartEmpty(Collectionx.listOf(YES, EMPTY)));
//        assertFalse(Stringx.isPartEmpty(Collectionx.listOf(YES, YES)));
//        assertFalse(Stringx.isPartEmpty(Collectionx.listOf(EMPTY, EMPTY)));
//        assertFalse(Stringx.isPartEmpty((CharSequence[]) null));
//        assertFalse(Stringx.isPartEmpty((Collection<CharSequence>) null));
//        assertFalse(Stringx.isPartEmpty(new String[0]));
//        assertFalse(Stringx.isPartEmpty(new LinkedList<String>()));

        assertEquals(Stringx.isEmptyOr(EMPTY, "default"), "default");
        assertEquals(Stringx.isEmptyOr(YES, "default"), YES);


        assertTrue(Stringx.isNullOrEmpty(null));
        assertTrue(Stringx.isNullOrEmpty(EMPTY));
        assertFalse(Stringx.isNullOrEmpty(YES));

        assertTrue(Stringx.isNotNullOrEmpty(YES));
        assertFalse(Stringx.isNotNullOrEmpty(null));
        assertFalse(Stringx.isNotNullOrEmpty(EMPTY));

//        assertTrue(Stringx.isAllNullOrEmpty(Arrayx.arrayOf(null, EMPTY)));
//        assertFalse(Stringx.isAllNullOrEmpty(Arrayx.arrayOf(YES, YES)));
//        assertTrue(Stringx.isAllNullOrEmpty(Collectionx.listOf(null, EMPTY)));
//        assertFalse(Stringx.isAllNullOrEmpty(Collectionx.listOf(YES, YES)));
//        assertTrue(Stringx.isAllNullOrEmpty((CharSequence[]) null));
//        assertTrue(Stringx.isAllNullOrEmpty((Collection<CharSequence>) null));
//        assertTrue(Stringx.isAllNullOrEmpty(new String[0]));
//        assertTrue(Stringx.isAllNullOrEmpty(new LinkedList<String>()));
//
//        assertTrue(Stringx.isAllNotNullOrEmpty(Arrayx.arrayOf(YES, YES)));
//        assertFalse(Stringx.isAllNotNullOrEmpty(Arrayx.arrayOf(YES, null)));
//        assertTrue(Stringx.isAllNotNullOrEmpty(Collectionx.listOf(YES, YES)));
//        assertFalse(Stringx.isAllNotNullOrEmpty(Collectionx.listOf(YES, null)));
//        assertFalse(Stringx.isAllNotNullOrEmpty((CharSequence[]) null));
//        assertFalse(Stringx.isAllNotNullOrEmpty((Collection<CharSequence>) null));
//        assertFalse(Stringx.isAllNotNullOrEmpty(new String[0]));
//        assertFalse(Stringx.isAllNotNullOrEmpty(new LinkedList<String>()));
//
//        assertTrue(Stringx.isPartNullOrEmpty(Arrayx.arrayOf(YES, EMPTY)));
//        assertFalse(Stringx.isPartNullOrEmpty(Arrayx.arrayOf(YES, YES)));
//        assertFalse(Stringx.isPartNullOrEmpty(Arrayx.arrayOf(null, EMPTY)));
//        assertTrue(Stringx.isPartNullOrEmpty(Collectionx.listOf(YES, EMPTY)));
//        assertFalse(Stringx.isPartNullOrEmpty(Collectionx.listOf(YES, YES)));
//        assertFalse(Stringx.isPartNullOrEmpty(Collectionx.listOf(null, EMPTY)));
//        assertFalse(Stringx.isPartNullOrEmpty((CharSequence[]) null));
//        assertFalse(Stringx.isPartNullOrEmpty((Collection<CharSequence>) null));
//        assertFalse(Stringx.isPartNullOrEmpty(new String[0]));
//        assertFalse(Stringx.isPartNullOrEmpty(new LinkedList<String>()));

        assertEquals(Stringx.isNullOrEmptyOr(EMPTY, "default"), "default");
        assertEquals(Stringx.isNullOrEmptyOr(null, "default"), "default");
        assertEquals(Stringx.isNullOrEmptyOr(YES, "default"), YES);
    }

    @Test
    public void testChinese() {
        assertTrue(Stringx.isChinese(CHINESE));
        assertFalse(Stringx.isChinese(EMPTY));
        assertFalse(Stringx.isChinese(DIGIT));
        assertFalse(Stringx.isChinese(LETTER));
        assertFalse(Stringx.isChinese(BLANK));
        assertFalse(Stringx.isChinese(null));

        assertTrue(Stringx.isNotChinese(EMPTY));
        assertTrue(Stringx.isNotChinese(DIGIT));
        assertTrue(Stringx.isNotChinese(LETTER));
        assertTrue(Stringx.isNotChinese(BLANK));
        assertTrue(Stringx.isNotChinese(null));
        assertFalse(Stringx.isNotChinese(CHINESE));

//        assertTrue(Stringx.isAllChinese(Arrayx.arrayOf(CHINESE, CHINESE)));
//        assertFalse(Stringx.isAllChinese(Arrayx.arrayOf(CHINESE, EMPTY)));
//        assertTrue(Stringx.isAllChinese(Collectionx.listOf(CHINESE, CHINESE)));
//        assertFalse(Stringx.isAllChinese(Collectionx.listOf(CHINESE, EMPTY)));
//        assertFalse(Stringx.isAllChinese((CharSequence[]) null));
//        assertFalse(Stringx.isAllChinese((Collection<CharSequence>) null));
//        assertFalse(Stringx.isAllChinese(new String[0]));
//        assertFalse(Stringx.isAllChinese(new LinkedList<String>()));
//
//        assertTrue(Stringx.isAllNotChinese(Arrayx.arrayOf(EMPTY, EMPTY)));
//        assertFalse(Stringx.isAllNotChinese(Arrayx.arrayOf(CHINESE, CHINESE)));
//        assertFalse(Stringx.isAllNotChinese(Arrayx.arrayOf(CHINESE, EMPTY)));
//        assertTrue(Stringx.isAllNotChinese(Collectionx.listOf(EMPTY, EMPTY)));
//        assertFalse(Stringx.isAllNotChinese(Collectionx.listOf(CHINESE, CHINESE)));
//        assertFalse(Stringx.isAllNotChinese(Collectionx.listOf(CHINESE, EMPTY)));
//        assertTrue(Stringx.isAllNotChinese((CharSequence[]) null));
//        assertTrue(Stringx.isAllNotChinese((Collection<CharSequence>) null));
//        assertTrue(Stringx.isAllNotChinese(new String[0]));
//        assertTrue(Stringx.isAllNotChinese(new LinkedList<String>()));
//
//        assertTrue(Stringx.isPartChinese(Arrayx.arrayOf(CHINESE, EMPTY)));
//        assertFalse(Stringx.isPartChinese(Arrayx.arrayOf(CHINESE, CHINESE)));
//        assertFalse(Stringx.isPartChinese(Arrayx.arrayOf(EMPTY, EMPTY)));
//        assertTrue(Stringx.isPartChinese(Collectionx.listOf(CHINESE, EMPTY)));
//        assertFalse(Stringx.isPartChinese(Collectionx.listOf(CHINESE, CHINESE)));
//        assertFalse(Stringx.isPartChinese(Collectionx.listOf(EMPTY, EMPTY)));
//        assertFalse(Stringx.isPartChinese((CharSequence[]) null));
//        assertFalse(Stringx.isPartChinese((Collection<CharSequence>) null));
//        assertFalse(Stringx.isPartChinese(new String[0]));
//        assertFalse(Stringx.isPartChinese(new LinkedList<String>()));

        assertEquals(Stringx.isNotChineseOr(LETTER, "default"), "default");
        assertEquals(Stringx.isNotChineseOr(null, "default"), "default");
        assertEquals(Stringx.isNotChineseOr(CHINESE, "default"), CHINESE);
    }

    @Test
    public void testDigit() {
        assertTrue(Stringx.isDigit(DIGIT));
        assertFalse(Stringx.isDigit(EMPTY));
        assertFalse(Stringx.isDigit(CHINESE));
        assertFalse(Stringx.isDigit(LETTER));
        assertFalse(Stringx.isDigit(BLANK));
        assertFalse(Stringx.isDigit(null));

        assertTrue(Stringx.isNotDigit(EMPTY));
        assertTrue(Stringx.isNotDigit(CHINESE));
        assertTrue(Stringx.isNotDigit(LETTER));
        assertTrue(Stringx.isNotDigit(BLANK));
        assertTrue(Stringx.isNotDigit(null));
        assertFalse(Stringx.isNotDigit(DIGIT));

//        assertTrue(Stringx.isAllDigit(Arrayx.arrayOf(DIGIT, DIGIT)));
//        assertFalse(Stringx.isAllDigit(Arrayx.arrayOf(DIGIT, EMPTY)));
//        assertTrue(Stringx.isAllDigit(Collectionx.listOf(DIGIT, DIGIT)));
//        assertFalse(Stringx.isAllDigit(Collectionx.listOf(DIGIT, EMPTY)));
//        assertFalse(Stringx.isAllDigit((CharSequence[]) null));
//        assertFalse(Stringx.isAllDigit((Collection<CharSequence>) null));
//        assertFalse(Stringx.isAllDigit(new String[0]));
//        assertFalse(Stringx.isAllDigit(new LinkedList<String>()));
//
//        assertTrue(Stringx.isAllNotDigit(Arrayx.arrayOf(EMPTY, EMPTY)));
//        assertFalse(Stringx.isAllNotDigit(Arrayx.arrayOf(DIGIT, DIGIT)));
//        assertFalse(Stringx.isAllNotDigit(Arrayx.arrayOf(DIGIT, EMPTY)));
//        assertTrue(Stringx.isAllNotDigit(Collectionx.listOf(EMPTY, EMPTY)));
//        assertFalse(Stringx.isAllNotDigit(Collectionx.listOf(DIGIT, DIGIT)));
//        assertFalse(Stringx.isAllNotDigit(Collectionx.listOf(DIGIT, EMPTY)));
//        assertTrue(Stringx.isAllNotDigit((CharSequence[]) null));
//        assertTrue(Stringx.isAllNotDigit((Collection<CharSequence>) null));
//        assertTrue(Stringx.isAllNotDigit(new String[0]));
//        assertTrue(Stringx.isAllNotDigit(new LinkedList<String>()));
//
//        assertTrue(Stringx.isPartDigit(Arrayx.arrayOf(DIGIT, EMPTY)));
//        assertFalse(Stringx.isPartDigit(Arrayx.arrayOf(DIGIT, DIGIT)));
//        assertFalse(Stringx.isPartDigit(Arrayx.arrayOf(EMPTY, EMPTY)));
//        assertTrue(Stringx.isPartDigit(Collectionx.listOf(DIGIT, EMPTY)));
//        assertFalse(Stringx.isPartDigit(Collectionx.listOf(DIGIT, DIGIT)));
//        assertFalse(Stringx.isPartDigit(Collectionx.listOf(EMPTY, EMPTY)));
//        assertFalse(Stringx.isPartDigit((CharSequence[]) null));
//        assertFalse(Stringx.isPartDigit((Collection<CharSequence>) null));
//        assertFalse(Stringx.isPartDigit(new String[0]));
//        assertFalse(Stringx.isPartDigit(new LinkedList<String>()));

        assertEquals(Stringx.isNotDigitOr(LETTER, "3"), "3");
        assertEquals(Stringx.isNotDigitOr(null, "3"), "3");
        assertEquals(Stringx.isNotDigitOr(DIGIT, "3"), DIGIT);
    }

    @Test
    public void testLetter() {
        assertTrue(Stringx.isLetter(LETTER));
        assertFalse(Stringx.isLetter(EMPTY));
        assertFalse(Stringx.isLetter(DIGIT));
        assertFalse(Stringx.isLetter(BLANK));
        assertFalse(Stringx.isLetter(null));

        assertTrue(Stringx.isNotLetter(EMPTY));
        assertTrue(Stringx.isNotLetter(DIGIT));
        assertTrue(Stringx.isNotLetter(BLANK));
        assertTrue(Stringx.isNotLetter(null));
        assertFalse(Stringx.isNotLetter(LETTER));

//        assertTrue(Stringx.isAllLetter(Arrayx.arrayOf(LETTER, LETTER)));
//        assertFalse(Stringx.isAllLetter(Arrayx.arrayOf(LETTER, EMPTY)));
//        assertTrue(Stringx.isAllLetter(Collectionx.listOf(LETTER, LETTER)));
//        assertFalse(Stringx.isAllLetter(Collectionx.listOf(LETTER, EMPTY)));
//        assertFalse(Stringx.isAllLetter((CharSequence[]) null));
//        assertFalse(Stringx.isAllLetter((Collection<CharSequence>) null));
//        assertFalse(Stringx.isAllLetter(new String[0]));
//        assertFalse(Stringx.isAllLetter(new LinkedList<String>()));
//
//        assertTrue(Stringx.isAllNotLetter(Arrayx.arrayOf(EMPTY, EMPTY)));
//        assertFalse(Stringx.isAllNotLetter(Arrayx.arrayOf(LETTER, LETTER)));
//        assertFalse(Stringx.isAllNotLetter(Arrayx.arrayOf(LETTER, EMPTY)));
//        assertTrue(Stringx.isAllNotLetter(Collectionx.listOf(EMPTY, EMPTY)));
//        assertFalse(Stringx.isAllNotLetter(Collectionx.listOf(LETTER, LETTER)));
//        assertFalse(Stringx.isAllNotLetter(Collectionx.listOf(LETTER, EMPTY)));
//        assertTrue(Stringx.isAllNotLetter((CharSequence[]) null));
//        assertTrue(Stringx.isAllNotLetter((Collection<CharSequence>) null));
//        assertTrue(Stringx.isAllNotLetter(new String[0]));
//        assertTrue(Stringx.isAllNotLetter(new LinkedList<String>()));
//
//        assertTrue(Stringx.isPartLetter(Arrayx.arrayOf(LETTER, EMPTY)));
//        assertFalse(Stringx.isPartLetter(Arrayx.arrayOf(LETTER, LETTER)));
//        assertFalse(Stringx.isPartLetter(Arrayx.arrayOf(EMPTY, EMPTY)));
//        assertTrue(Stringx.isPartLetter(Collectionx.listOf(LETTER, EMPTY)));
//        assertFalse(Stringx.isPartLetter(Collectionx.listOf(LETTER, LETTER)));
//        assertFalse(Stringx.isPartLetter(Collectionx.listOf(EMPTY, EMPTY)));
//        assertFalse(Stringx.isPartLetter((CharSequence[]) null));
//        assertFalse(Stringx.isPartLetter((Collection<CharSequence>) null));
//        assertFalse(Stringx.isPartLetter(new String[0]));
//        assertFalse(Stringx.isPartLetter(new LinkedList<String>()));

        assertEquals(Stringx.isNotLetterOr(DIGIT, "default"), "default");
        assertEquals(Stringx.isNotLetterOr(null, "default"), "default");
        assertEquals(Stringx.isNotLetterOr(LETTER, "default"), LETTER);
    }

    @Test
    public void testLetterOrDigit() {
        assertTrue(Stringx.isLetterOrDigit(LETTER_OR_DIGIT));
        assertFalse(Stringx.isLetterOrDigit(EMPTY));
        assertFalse(Stringx.isLetterOrDigit(BLANK));
        assertFalse(Stringx.isLetterOrDigit(SYMBOL));
        assertFalse(Stringx.isLetterOrDigit(null));

        assertTrue(Stringx.isNotLetterOrDigit(EMPTY));
        assertTrue(Stringx.isNotLetterOrDigit(BLANK));
        assertTrue(Stringx.isNotLetterOrDigit(null));
        assertTrue(Stringx.isNotLetterOrDigit(SYMBOL));
        assertFalse(Stringx.isNotLetterOrDigit(LETTER_OR_DIGIT));

//        assertTrue(Stringx.isAllLetterOrDigit(Arrayx.arrayOf(LETTER_OR_DIGIT, LETTER_OR_DIGIT)));
//        assertFalse(Stringx.isAllLetterOrDigit(Arrayx.arrayOf(LETTER_OR_DIGIT, EMPTY)));
//        assertTrue(Stringx.isAllLetterOrDigit(Collectionx.listOf(LETTER_OR_DIGIT, LETTER_OR_DIGIT)));
//        assertFalse(Stringx.isAllLetterOrDigit(Collectionx.listOf(LETTER_OR_DIGIT, EMPTY)));
//        assertFalse(Stringx.isAllLetterOrDigit((CharSequence[]) null));
//        assertFalse(Stringx.isAllLetterOrDigit((Collection<CharSequence>) null));
//        assertFalse(Stringx.isAllLetterOrDigit(new String[0]));
//        assertFalse(Stringx.isAllLetterOrDigit(new LinkedList<String>()));
//
//        assertTrue(Stringx.isAllNotLetterOrDigit(Arrayx.arrayOf(EMPTY, EMPTY)));
//        assertFalse(Stringx.isAllNotLetterOrDigit(Arrayx.arrayOf(LETTER_OR_DIGIT, LETTER_OR_DIGIT)));
//        assertFalse(Stringx.isAllNotLetterOrDigit(Arrayx.arrayOf(LETTER_OR_DIGIT, EMPTY)));
//        assertTrue(Stringx.isAllNotLetterOrDigit(Collectionx.listOf(EMPTY, EMPTY)));
//        assertFalse(Stringx.isAllNotLetterOrDigit(Collectionx.listOf(LETTER_OR_DIGIT, LETTER_OR_DIGIT)));
//        assertFalse(Stringx.isAllNotLetterOrDigit(Collectionx.listOf(LETTER_OR_DIGIT, EMPTY)));
//        assertTrue(Stringx.isAllNotLetterOrDigit((CharSequence[]) null));
//        assertTrue(Stringx.isAllNotLetterOrDigit((Collection<CharSequence>) null));
//        assertTrue(Stringx.isAllNotLetterOrDigit(new String[0]));
//        assertTrue(Stringx.isAllNotLetterOrDigit(new LinkedList<String>()));
//
//        assertTrue(Stringx.isPartLetterOrDigit(Arrayx.arrayOf(LETTER_OR_DIGIT, EMPTY)));
//        assertFalse(Stringx.isPartLetterOrDigit(Arrayx.arrayOf(LETTER_OR_DIGIT, LETTER_OR_DIGIT)));
//        assertFalse(Stringx.isPartLetterOrDigit(Arrayx.arrayOf(EMPTY, EMPTY)));
//        assertTrue(Stringx.isPartLetterOrDigit(Collectionx.listOf(LETTER_OR_DIGIT, EMPTY)));
//        assertFalse(Stringx.isPartLetterOrDigit(Collectionx.listOf(LETTER_OR_DIGIT, LETTER_OR_DIGIT)));
//        assertFalse(Stringx.isPartLetterOrDigit(Collectionx.listOf(EMPTY, EMPTY)));
//        assertFalse(Stringx.isPartLetterOrDigit((CharSequence[]) null));
//        assertFalse(Stringx.isPartLetterOrDigit((Collection<CharSequence>) null));
//        assertFalse(Stringx.isPartLetterOrDigit(new String[0]));
//        assertFalse(Stringx.isPartLetterOrDigit(new LinkedList<String>()));

        assertEquals(Stringx.isNotLetterOrDigitOr(EMPTY, "default"), "default");
        assertEquals(Stringx.isNotLetterOrDigitOr(null, "default"), "default");
        assertEquals(Stringx.isNotLetterOrDigitOr(LETTER_OR_DIGIT, "default"), LETTER_OR_DIGIT);
    }

    @Test
    public void testContains() {
        assertTrue(Stringx.orContains("今天天气晴", new String[]{"哈", "天"}));
        assertFalse(Stringx.orContains("今天天气晴", new String[]{"哈"}));
        assertTrue(Stringx.orContains("今天天气晴", Collectionx.listOf("哈", "天")));
        assertFalse(Stringx.orContains("今天天气晴", Collectionx.listOf("哈")));
        assertFalse(Stringx.orContains("今天天气晴", (String[]) null));
        assertFalse(Stringx.orContains(null, (String[]) null));
        assertFalse(Stringx.orContains("今天天气晴", (Collection<String>) null));
        assertFalse(Stringx.orContains(null, (Collection<String>) null));
        assertFalse(Stringx.orContains("今天天气晴", new String[0]));
        assertFalse(Stringx.orContains("今天天气晴", new LinkedList<String>()));

        assertTrue(Stringx.andContains("今天天气晴", new String[]{"晴", "天"}));
        assertFalse(Stringx.andContains("今天天气晴", new String[]{"哈", "天"}));
        assertTrue(Stringx.andContains("今天天气晴", Collectionx.listOf("晴", "天")));
        assertFalse(Stringx.andContains("今天天气晴", Collectionx.listOf("哈", "天")));
        assertFalse(Stringx.andContains("今天天气晴", (String[]) null));
        assertFalse(Stringx.andContains(null, (String[]) null));
        assertFalse(Stringx.andContains("今天天气晴", (Collection<String>) null));
        assertFalse(Stringx.andContains(null, (Collection<String>) null));
        assertFalse(Stringx.andContains("今天天气晴", new String[0]));
        assertFalse(Stringx.andContains("今天天气晴", new LinkedList<String>()));
    }

    @Test
    public void testStartsWith() {
        assertTrue(Stringx.startsWith("JavaBean", "Java"));
        assertFalse(Stringx.startsWith("JavaBean", "Jave"));

        assertFalse(Stringx.startsWith("JavaBean", "java"));
        assertTrue(Stringx.startsWith("JavaBean", "java", true));
    }

    @Test
    public void testEndsWith() {
        assertTrue(Stringx.endsWith("JavaBean", "Bean"));
        assertFalse(Stringx.endsWith("JavaBean", "Bea"));

        assertFalse(Stringx.endsWith("JavaBean", "bean"));
        assertTrue(Stringx.endsWith("JavaBean", "bean", true));
    }

    @Test
    public void testEquals() {
        assertTrue(Stringx.equals("JavaBean", "JavaBean"));
        assertFalse(Stringx.equals("JavaBean", "javabean"));
        assertTrue(Stringx.equals("JavaBean", "javabean", true));

        assertFalse(Stringx.equals("JavaBean", null));
        assertFalse(Stringx.equals(null, "javabean"));
        assertTrue(Stringx.equals(null, null));
    }

    @Test
    public void testConvert() {
        assertEquals(Stringx.orEmpty("JavaBean"), "JavaBean");
        assertEquals(Stringx.orEmpty(null), EMPTY);

        assertEquals(Stringx.orDefault("JavaBean", "defaultValue"), "JavaBean");
        assertEquals(Stringx.orDefault(null, "defaultValue"), "defaultValue");

        assertEquals(Stringx.emptyToNull("JavaBean"), "JavaBean");
        assertNull(Stringx.emptyToNull(EMPTY));

        assertEquals(Stringx.blankToNull("JavaBean"), "JavaBean");
        assertNull(Stringx.blankToNull("    "));
    }

    @Test
    public void testRemoveChar() {
        assertEquals(Stringx.removeChar("JavaBean", 'a'), "JvBen");
        assertEquals(Stringx.removeFirstChar("JavaBean", 'a'), "JvaBean");
        assertEquals(Stringx.removeLastChar("JavaBean", 'a'), "JavaBen");
        assertEquals(Stringx.removeIndex("JavaBean", 4), "Javaean");
    }

    @Test
    public void testCapitalize() {
        assertEquals(Stringx.capitalize("android"), "Android");
        assertEquals(Stringx.decapitalize("Android"), "android");
    }

    @Test
    public void testLimit() {
        assertEquals(Stringx.limit("今天天气晴", 6), "今天天气晴");
        assertEquals(Stringx.limit("今天天气晴", 6, "..."), "今天天气晴");

        assertEquals(Stringx.limit("今天天气晴朗，万里无云", 6), "今天天气晴朗");
        assertEquals(Stringx.limit("今天天气晴朗，万里无云", 6, "..."), "今天天气晴朗...");
    }

    @Test
    public void testPad() {
        assertEquals(Stringx.padStart("今天天气晴", 4), "今天天气晴");
        assertEquals(Stringx.padStart("今天天气晴", 5), "今天天气晴");
        assertEquals(Stringx.padStart("今天天气晴", 10), "     今天天气晴");
        assertEquals(Stringx.padStart("今天天气晴", 10, '.'), ".....今天天气晴");

        assertEquals(Stringx.padEnd("今天天气晴", 4), "今天天气晴");
        assertEquals(Stringx.padEnd("今天天气晴", 5), "今天天气晴");
        assertEquals(Stringx.padEnd("今天天气晴", 10), "今天天气晴     ");
        assertEquals(Stringx.padEnd("今天天气晴", 10, '.'), "今天天气晴.....");
    }
}
