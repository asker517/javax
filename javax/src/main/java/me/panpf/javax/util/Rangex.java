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

package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

import java.text.ParseException;
import java.util.Date;

@SuppressWarnings("WeakerAccess")
public class Rangex {
    private Rangex() {
    }


    /* ******************************************* Byte Range *******************************************/


    /**
     * Create a positive-order byte ranges
     */
    public static IntRange rangeTo(byte start, byte end, byte step) {
        return IntRange.fromClosedRange(start, end, step);
    }

    /**
     * Create a positive-order byte ranges
     */
    public static IntRange rangeTo(byte start, byte end) {
        return rangeTo(start, end, (byte) 1);
    }

    /**
     * Create a positive-order byte range that does not contain [end]
     */
    public static IntRange untilTo(byte start, byte end, byte step) {
        return new IntRange(start, end - 1, step);
    }

    /**
     * Create a positive-order byte range that does not contain [end]
     */
    public static IntRange untilTo(byte start, byte end) {
        return untilTo(start, end, (byte) 1);
    }

    /**
     * Create a reversed byte range
     */
    public static IntRange downTo(byte start, byte end, byte step) {
        return IntRange.fromClosedRange(start, end, step);
    }

    /**
     * Create a reversed byte range
     */
    public static IntRange downTo(byte start, byte end) {
        return downTo(start, end, (byte) -1);
    }

    /**
     * Create a reversed byte range that does not contain [end]
     */
    public static IntRange downUntilTo(byte start, byte end, byte step) {
        return new IntRange(start, end + 1, step);
    }

    /**
     * Create a reversed byte range that does not contain [end]
     */
    public static IntRange downUntilTo(byte start, byte end) {
        return downUntilTo(start, end, (byte) -1);
    }


    /* ******************************************* Short Range *******************************************/


    /**
     * Create a positive-order short ranges
     */
    public static IntRange rangeTo(short start, short end, short step) {
        return IntRange.fromClosedRange(start, end, step);
    }

    /**
     * Create a positive-order short ranges
     */
    public static IntRange rangeTo(short start, short end) {
        return rangeTo(start, end, (short) 1);
    }

    /**
     * Create a positive-order short range that does not contain [end]
     */
    public static IntRange untilTo(short start, short end, short step) {
        return new IntRange(start, end - 1, step);
    }

    /**
     * Create a positive-order short range that does not contain [end]
     */
    public static IntRange untilTo(short start, short end) {
        return untilTo(start, end, (short) 1);
    }

    /**
     * Create a reversed short range
     */
    public static IntRange downTo(short start, short end, short step) {
        return IntRange.fromClosedRange(start, end, step);
    }

    /**
     * Create a reversed short range
     */
    public static IntRange downTo(short start, short end) {
        return downTo(start, end, (short) -1);
    }

    /**
     * Create a reversed short range that does not contain [end]
     */
    public static IntRange downUntilTo(short start, short end, short step) {
        return new IntRange(start, end + 1, step);
    }

    /**
     * Create a reversed short range that does not contain [end]
     */
    public static IntRange downUntilTo(short start, short end) {
        return downUntilTo(start, end, (short) -1);
    }


    /* ******************************************* Int Range *******************************************/


    /**
     * Create a positive-order int ranges
     */
    public static IntRange rangeTo(int start, int end, int step) {
        return IntRange.fromClosedRange(start, end, step);
    }

    /**
     * Create a positive-order int ranges
     */
    public static IntRange rangeTo(int start, int end) {
        return rangeTo(start, end, 1);
    }

    /**
     * Create a positive-order int range that does not contain [end]
     */
    public static IntRange untilTo(int start, int end, int step) {
        return new IntRange(start, end - 1, step);
    }

    /**
     * Create a positive-order int range that does not contain [end]
     */
    public static IntRange untilTo(int start, int end) {
        return untilTo(start, end, 1);
    }

    /**
     * Create a reversed int range
     */
    public static IntRange downTo(int start, int end, int step) {
        return IntRange.fromClosedRange(start, end, step);
    }

    /**
     * Create a reversed int range
     */
    public static IntRange downTo(int start, int end) {
        return downTo(start, end, -1);
    }

    /**
     * Create a reversed int range that does not contain [end]
     */
    public static IntRange downUntilTo(int start, int end, int step) {
        return new IntRange(start, end + 1, step);
    }

    /**
     * Create a reversed int range that does not contain [end]
     */
    public static IntRange downUntilTo(int start, int end) {
        return downUntilTo(start, end, -1);
    }


    /* ******************************************* Long Range *******************************************/


    /**
     * Create a positive-order long ranges
     */
    public static LongRange rangeTo(long start, long end, long step) {
        return LongRange.fromClosedRange(start, end, step);
    }

    /**
     * Create a positive-order long ranges
     */
    public static LongRange rangeTo(long start, long end) {
        return rangeTo(start, end, 1);
    }

    /**
     * Create a positive-order long range that does not contain [end]
     */
    public static LongRange untilTo(long start, long end, long step) {
        return new LongRange(start, end - 1, step);
    }

    /**
     * Create a positive-order long range that does not contain [end]
     */
    public static LongRange untilTo(long start, long end) {
        return untilTo(start, end, 1);
    }

    /**
     * Create a reversed long range
     */
    public static LongRange downTo(long start, long end, long step) {
        return new LongRange(start, end, step);
    }

    /**
     * Create a reversed long range
     */
    public static LongRange downTo(long start, long end) {
        return downTo(start, end, -1);
    }

    /**
     * Create a reversed long range that does not contain [end]
     */
    public static LongRange downUntilTo(long start, long end, long step) {
        return new LongRange(start, end + 1, step);
    }

    /**
     * Create a reversed long range that does not contain [end]
     */
    public static LongRange downUntilTo(long start, long end) {
        return downUntilTo(start, end, -1);
    }


    /* ******************************************* Char Range *******************************************/


    /**
     * Create a positive-order char ranges
     */
    public static CharRange rangeTo(char start, char end, char step) {
        return CharRange.fromClosedRange(start, end, step);
    }

    /**
     * Create a positive-order char ranges
     */
    public static CharRange rangeTo(char start, char end) {
        return rangeTo(start, end, (char) 1);
    }

    /**
     * Create a positive-order char range that does not contain [end]
     */
    public static CharRange untilTo(char start, char end, char step) {
        return new CharRange(start, (char) (end - 1), step);
    }

    /**
     * Create a positive-order char range that does not contain [end]
     */
    public static CharRange untilTo(char start, char end) {
        return untilTo(start, end, (char) 1);
    }

    /**
     * Create a reversed char range
     */
    public static CharRange downTo(char start, char end, char step) {
        return new CharRange(start, end, step);
    }

    /**
     * Create a reversed char range
     */
    public static CharRange downTo(char start, char end) {
        return downTo(start, end, (char) -1);
    }

    /**
     * Create a reversed char range that does not contain [end]
     */
    public static CharRange downUntilTo(char start, char end, char step) {
        return new CharRange(start, (char) (end + 1), step);
    }

    /**
     * Create a reversed char range that does not contain [end]
     */
    public static CharRange downUntilTo(char start, char end) {
        return downUntilTo(start, end, (char) -1);
    }


    /* ******************************************* Year Range *******************************************/


    /**
     * Create a positive-order year ranges
     */
    @NotNull
    public static YearRange yearRangeTo(@NotNull Date date, @NotNull Date endInclusive, int step) {
        return new YearRange(date, endInclusive, step);
    }

    /**
     * Create a positive-order year ranges
     */
    @NotNull
    public static YearRange yearRangeTo(@NotNull Date date, @NotNull Date endInclusive) {
        return yearRangeTo(date, endInclusive, 1);
    }

    /**
     * Create a positive-order year ranges
     */
    @NotNull
    public static YearRange yearRangeTo(long millisecondValue, long endInclusive, int step) {
        return yearRangeTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive), step);
    }

    /**
     * Create a positive-order year ranges
     */
    @NotNull
    public static YearRange yearRangeTo(long millisecondValue, long endInclusive) {
        return yearRangeTo(millisecondValue, endInclusive, 1);
    }

    /**
     * Create a positive-order year ranges, parsing the formatted date string with 'yyyy'
     */
    @NotNull
    public static YearRange yearYRangeTo(@NotNull String formattedDate, @NotNull String endInclusive, int step) throws ParseException {
        return yearRangeTo(Datex.toDateY(formattedDate), Datex.toDateY(endInclusive), step);
    }

    /**
     * Create a positive-order year ranges, parsing the formatted date string with 'yyyy'
     */
    @NotNull
    public static YearRange yearYRangeTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return yearYRangeTo(formattedDate, endInclusive, 1);
    }


    /**
     * Create a positive-order year range that does not contain [end]
     */
    @NotNull
    public static YearRange yearUntilTo(@NotNull Date date, @NotNull Date end, int step) {
        return new YearRange(date, Datex.addYear(end, -1), step);
    }

    /**
     * Create a positive-order year range that does not contain [end]
     */
    @NotNull
    public static YearRange yearUntilTo(@NotNull Date date, @NotNull Date end) {
        return yearUntilTo(date, end, 1);
    }

    /**
     * Create a positive-order year range that does not contain [end]
     */
    @NotNull
    public static YearRange yearUntilTo(long millisecondValue, long end, int step) {
        return yearUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end), step);
    }

    /**
     * Create a positive-order year range that does not contain [end]
     */
    @NotNull
    public static YearRange yearUntilTo(long millisecondValue, long end) {
        return yearUntilTo(millisecondValue, end, 1);
    }

    /**
     * Create a positive-order year range that does not contain [end], parsing the formatted date string with 'yyyy'
     */
    @NotNull
    public static YearRange yearYUntilTo(@NotNull String formattedDate, @NotNull String end, int step) throws ParseException {
        return yearUntilTo(Datex.toDateY(formattedDate), Datex.toDateY(end), step);
    }

    /**
     * Create a positive-order year range that does not contain [end], parsing the formatted date string with 'yyyy'
     */
    @NotNull
    public static YearRange yearYUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return yearYUntilTo(formattedDate, end, 1);
    }


    /**
     * Create a reversed year range
     */
    @NotNull
    public static YearRange yearDownTo(@NotNull Date date, @NotNull Date endInclusive, int step) {
        return new YearRange(date, endInclusive, step);
    }

    /**
     * Create a reversed year range
     */
    @NotNull
    public static YearRange yearDownTo(@NotNull Date date, @NotNull Date endInclusive) {
        return yearDownTo(date, endInclusive, -1);
    }

    /**
     * Create a reversed year range
     */
    @NotNull
    public static YearRange yearDownTo(long millisecondValue, long endInclusive, int step) {
        return yearDownTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive), step);
    }

    /**
     * Create a reversed year range
     */
    @NotNull
    public static YearRange yearDownTo(long millisecondValue, long endInclusive) {
        return yearDownTo(millisecondValue, endInclusive, -1);
    }

    /**
     * Create a reversed year range, parsing the formatted date string with 'yyyy'
     */
    @NotNull
    public static YearRange yearYDownTo(@NotNull String formattedDate, @NotNull String endInclusive, int step) throws ParseException {
        return yearDownTo(Datex.toDateY(formattedDate), Datex.toDateY(endInclusive), step);
    }

    /**
     * Create a reversed year range, parsing the formatted date string with 'yyyy'
     */
    @NotNull
    public static YearRange yearYDownTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return yearYDownTo(formattedDate, endInclusive, -1);
    }


    /**
     * Create a reversed year range that does not contain [end]
     */
    @NotNull
    public static YearRange yearDownUntilTo(@NotNull Date date, @NotNull Date end, int step) {
        return new YearRange(date, Datex.addYear(end, 1), step);
    }

    /**
     * Create a reversed year range that does not contain [end]
     */
    @NotNull
    public static YearRange yearDownUntilTo(@NotNull Date date, @NotNull Date end) {
        return yearDownUntilTo(date, end, -1);
    }

    /**
     * Create a reversed year range that does not contain [end]
     */
    @NotNull
    public static YearRange yearDownUntilTo(long millisecondValue, long end, int step) {
        return yearDownUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end), step);
    }

    /**
     * Create a reversed year range that does not contain [end]
     */
    @NotNull
    public static YearRange yearDownUntilTo(long millisecondValue, long end) {
        return yearDownUntilTo(millisecondValue, end, -1);
    }

    /**
     * Create a reversed year range that does not contain [end], parsing the formatted date string with 'yyyy'
     */
    @NotNull
    public static YearRange yearYDownUntilTo(@NotNull String formattedDate, @NotNull String end, int step) throws ParseException {
        return yearDownUntilTo(Datex.toDateY(formattedDate), Datex.toDateY(end), step);
    }

    /**
     * Create a reversed year range that does not contain [end], parsing the formatted date string with 'yyyy'
     */
    @NotNull
    public static YearRange yearYDownUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return yearYDownUntilTo(formattedDate, end, -1);
    }


    /* ******************************************* Month Range *******************************************/


    /**
     * Create a positive-order month ranges
     */
    @NotNull
    public static MonthRange monthRangeTo(@NotNull Date date, @NotNull Date endInclusive, int step) {
        return new MonthRange(date, endInclusive, step);
    }

    /**
     * Create a positive-order month ranges
     */
    @NotNull
    public static MonthRange monthRangeTo(@NotNull Date date, @NotNull Date endInclusive) {
        return monthRangeTo(date, endInclusive, 1);
    }

    /**
     * Create a positive-order month ranges
     */
    @NotNull
    public static MonthRange monthRangeTo(long millisecondValue, long endInclusive, int step) {
        return monthRangeTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive), step);
    }

    /**
     * Create a positive-order month ranges
     */
    @NotNull
    public static MonthRange monthRangeTo(long millisecondValue, long endInclusive) {
        return monthRangeTo(millisecondValue, endInclusive, 1);
    }

    /**
     * Create a positive-order month ranges, parsing the formatted date string with 'yyyy-MM'
     */
    @NotNull
    public static MonthRange monthYMRangeTo(@NotNull String formattedDate, @NotNull String endInclusive, int step) throws ParseException {
        return monthRangeTo(Datex.toDateYM(formattedDate), Datex.toDateYM(endInclusive), step);
    }

    /**
     * Create a positive-order month ranges, parsing the formatted date string with 'yyyy-MM'
     */
    @NotNull
    public static MonthRange monthYMRangeTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return monthYMRangeTo(formattedDate, endInclusive, 1);
    }


    /**
     * Create a positive-order month range that does not contain [end]
     */
    @NotNull
    public static MonthRange monthUntilTo(@NotNull Date date, @NotNull Date end, int step) {
        return new MonthRange(date, Datex.addMonth(end, -1), step);
    }

    /**
     * Create a positive-order month range that does not contain [end]
     */
    @NotNull
    public static MonthRange monthUntilTo(@NotNull Date date, @NotNull Date end) {
        return monthUntilTo(date, end, 1);
    }

    /**
     * Create a positive-order month range that does not contain [end]
     */
    @NotNull
    public static MonthRange monthUntilTo(long millisecondValue, long end, int step) {
        return monthUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end), step);
    }

    /**
     * Create a positive-order month range that does not contain [end]
     */
    @NotNull
    public static MonthRange monthUntilTo(long millisecondValue, long end) {
        return monthUntilTo(millisecondValue, end, 1);
    }

    /**
     * Create a positive-order month range that does not contain [end], parsing the formatted date string with 'yyyy-MM'
     */
    @NotNull
    public static MonthRange monthYMUntilTo(@NotNull String formattedDate, @NotNull String end, int step) throws ParseException {
        return monthUntilTo(Datex.toDateYM(formattedDate), Datex.toDateYM(end), step);
    }

    /**
     * Create a positive-order month range that does not contain [end], parsing the formatted date string with 'yyyy-MM'
     */
    @NotNull
    public static MonthRange monthYMUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return monthYMUntilTo(formattedDate, end, 1);
    }


    /**
     * Create a reversed month range
     */
    @NotNull
    public static MonthRange monthDownTo(@NotNull Date date, @NotNull Date endInclusive, int step) {
        return new MonthRange(date, endInclusive, step);
    }

    /**
     * Create a reversed month range
     */
    @NotNull
    public static MonthRange monthDownTo(@NotNull Date date, @NotNull Date endInclusive) {
        return monthDownTo(date, endInclusive, -1);
    }

    /**
     * Create a reversed month range
     */
    @NotNull
    public static MonthRange monthDownTo(long millisecondValue, long endInclusive, int step) {
        return monthDownTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive), step);
    }

    /**
     * Create a reversed month range
     */
    @NotNull
    public static MonthRange monthDownTo(long millisecondValue, long endInclusive) {
        return monthDownTo(millisecondValue, endInclusive, -1);
    }

    /**
     * Create a reversed month range, parsing the formatted date string with 'yyyy-MM'
     */
    @NotNull
    public static MonthRange monthYMDownTo(@NotNull String formattedDate, @NotNull String endInclusive, int step) throws ParseException {
        return monthDownTo(Datex.toDateYM(formattedDate), Datex.toDateYM(endInclusive), step);
    }

    /**
     * Create a reversed month range, parsing the formatted date string with 'yyyy-MM'
     */
    @NotNull
    public static MonthRange monthYMDownTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return monthYMDownTo(formattedDate, endInclusive, -1);
    }


    /**
     * Create a reversed month range that does not contain [end]
     */
    @NotNull
    public static MonthRange monthDownUntilTo(@NotNull Date date, @NotNull Date end, int step) {
        return new MonthRange(date, Datex.addMonth(end, 1), step);
    }

    /**
     * Create a reversed month range that does not contain [end]
     */
    @NotNull
    public static MonthRange monthDownUntilTo(@NotNull Date date, @NotNull Date end) {
        return monthDownUntilTo(date, end, -1);
    }

    /**
     * Create a reversed month range that does not contain [end]
     */
    @NotNull
    public static MonthRange monthDownUntilTo(long millisecondValue, long end, int step) {
        return monthDownUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end), step);
    }

    /**
     * Create a reversed month range that does not contain [end]
     */
    @NotNull
    public static MonthRange monthDownUntilTo(long millisecondValue, long end) {
        return monthDownUntilTo(millisecondValue, end, -1);
    }

    /**
     * Create a reversed month range that does not contain [end], parsing the formatted date string with 'yyyy-MM'
     */
    @NotNull
    public static MonthRange monthYMDownUntilTo(@NotNull String formattedDate, @NotNull String end, int step) throws ParseException {
        return monthDownUntilTo(Datex.toDateYM(formattedDate), Datex.toDateYM(end), step);
    }

    /**
     * Create a reversed month range that does not contain [end], parsing the formatted date string with 'yyyy-MM'
     */
    @NotNull
    public static MonthRange monthYMDownUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return monthYMDownUntilTo(formattedDate, end, -1);
    }


    /* ******************************************* Day Range *******************************************/


    /**
     * Create a positive-order day ranges
     */
    @NotNull
    public static DayRange dayRangeTo(@NotNull Date date, @NotNull Date endInclusive, int step) {
        return new DayRange(date, endInclusive, step);
    }

    /**
     * Create a positive-order day ranges
     */
    @NotNull
    public static DayRange dayRangeTo(@NotNull Date date, @NotNull Date endInclusive) {
        return dayRangeTo(date, endInclusive, 1);
    }

    /**
     * Create a positive-order day ranges
     */
    @NotNull
    public static DayRange dayRangeTo(long millisecondValue, long endInclusive, int step) {
        return dayRangeTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive), step);
    }

    /**
     * Create a positive-order day ranges
     */
    @NotNull
    public static DayRange dayRangeTo(long millisecondValue, long endInclusive) {
        return dayRangeTo(millisecondValue, endInclusive, 1);
    }

    /**
     * Create a positive-order day ranges, parsing the formatted date string with 'yyyy-MM-dd'
     */
    @NotNull
    public static DayRange dayYMDRangeTo(@NotNull String formattedDate, @NotNull String endInclusive, int step) throws ParseException {
        return dayRangeTo(Datex.toDateYMD(formattedDate), Datex.toDateYMD(endInclusive), step);
    }

    /**
     * Create a positive-order day ranges, parsing the formatted date string with 'yyyy-MM-dd'
     */
    @NotNull
    public static DayRange dayYMDRangeTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return dayYMDRangeTo(formattedDate, endInclusive, 1);
    }


    /**
     * Create a positive-order day range that does not contain [end]
     */
    @NotNull
    public static DayRange dayUntilTo(@NotNull Date date, @NotNull Date end, int step) {
        return new DayRange(date, Datex.addDayOfMonth(end, -1), step);
    }

    /**
     * Create a positive-order day range that does not contain [end]
     */
    @NotNull
    public static DayRange dayUntilTo(@NotNull Date date, @NotNull Date end) {
        return dayUntilTo(date, end, 1);
    }

    /**
     * Create a positive-order day range that does not contain [end]
     */
    @NotNull
    public static DayRange dayUntilTo(long millisecondValue, long end, int step) {
        return dayUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end), step);
    }

    /**
     * Create a positive-order day range that does not contain [end]
     */
    @NotNull
    public static DayRange dayUntilTo(long millisecondValue, long end) {
        return dayUntilTo(millisecondValue, end, 1);
    }

    /**
     * Create a positive-order day range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd'
     */
    @NotNull
    public static DayRange dayYMDUntilTo(@NotNull String formattedDate, @NotNull String end, int step) throws ParseException {
        return dayUntilTo(Datex.toDateYMD(formattedDate), Datex.toDateYMD(end), step);
    }

    /**
     * Create a positive-order day range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd'
     */
    @NotNull
    public static DayRange dayYMDUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return dayYMDUntilTo(formattedDate, end, 1);
    }


    /**
     * Create a reversed day range
     */
    @NotNull
    public static DayRange dayDownTo(@NotNull Date date, @NotNull Date endInclusive, int step) {
        return new DayRange(date, endInclusive, step);
    }

    /**
     * Create a reversed day range
     */
    @NotNull
    public static DayRange dayDownTo(@NotNull Date date, @NotNull Date endInclusive) {
        return dayDownTo(date, endInclusive, -1);
    }

    /**
     * Create a reversed day range
     */
    @NotNull
    public static DayRange dayDownTo(long millisecondValue, long endInclusive, int step) {
        return dayDownTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive), step);
    }

    /**
     * Create a reversed day range
     */
    @NotNull
    public static DayRange dayDownTo(long millisecondValue, long endInclusive) {
        return dayDownTo(millisecondValue, endInclusive, -1);
    }

    /**
     * Create a reversed day range, parsing the formatted date string with 'yyyy-MM-dd'
     */
    @NotNull
    public static DayRange dayYMDDownTo(@NotNull String formattedDate, @NotNull String endInclusive, int step) throws ParseException {
        return dayDownTo(Datex.toDateYMD(formattedDate), Datex.toDateYMD(endInclusive), step);
    }

    /**
     * Create a reversed day range, parsing the formatted date string with 'yyyy-MM-dd'
     */
    @NotNull
    public static DayRange dayYMDDownTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return dayYMDDownTo(formattedDate, endInclusive, -1);
    }


    /**
     * Create a reversed day range that does not contain [end]
     */
    @NotNull
    public static DayRange dayDownUntilTo(@NotNull Date date, @NotNull Date end, int step) {
        return new DayRange(date, Datex.addDayOfMonth(end, 1), step);
    }

    /**
     * Create a reversed day range that does not contain [end]
     */
    @NotNull
    public static DayRange dayDownUntilTo(@NotNull Date date, @NotNull Date end) {
        return dayDownUntilTo(date, end, -1);
    }

    /**
     * Create a reversed day range that does not contain [end]
     */
    @NotNull
    public static DayRange dayDownUntilTo(long millisecondValue, long end, int step) {
        return dayDownUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end), step);
    }

    /**
     * Create a reversed day range that does not contain [end]
     */
    @NotNull
    public static DayRange dayDownUntilTo(long millisecondValue, long end) {
        return dayDownUntilTo(millisecondValue, end, -1);
    }

    /**
     * Create a reversed day range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd'
     */
    @NotNull
    public static DayRange dayYMDDownUntilTo(@NotNull String formattedDate, @NotNull String end, int step) throws ParseException {
        return dayDownUntilTo(Datex.toDateYMD(formattedDate), Datex.toDateYMD(end), step);
    }

    /**
     * Create a reversed day range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd'
     */
    @NotNull
    public static DayRange dayYMDDownUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return dayYMDDownUntilTo(formattedDate, end, -1);
    }


    /* ******************************************* Hour Range *******************************************/


    /**
     * Create a positive-order hour ranges
     */
    @NotNull
    public static HourRange hourRangeTo(@NotNull Date date, @NotNull Date endInclusive, int step) {
        return new HourRange(date, endInclusive, step);
    }

    /**
     * Create a positive-order hour ranges
     */
    @NotNull
    public static HourRange hourRangeTo(@NotNull Date date, @NotNull Date endInclusive) {
        return hourRangeTo(date, endInclusive, 1);
    }

    /**
     * Create a positive-order hour ranges
     */
    @NotNull
    public static HourRange hourRangeTo(long millisecondValue, long endInclusive, int step) {
        return hourRangeTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive), step);
    }

    /**
     * Create a positive-order hour ranges
     */
    @NotNull
    public static HourRange hourRangeTo(long millisecondValue, long endInclusive) {
        return hourRangeTo(millisecondValue, endInclusive, 1);
    }

    /**
     * Create a positive-order hour ranges, parsing the formatted date string with 'yyyy-MM-dd HH'
     */
    @NotNull
    public static HourRange hourYMDHRangeTo(@NotNull String formattedDate, @NotNull String endInclusive, int step) throws ParseException {
        return hourRangeTo(Datex.toDateYMDH(formattedDate), Datex.toDateYMDH(endInclusive), step);
    }

    /**
     * Create a positive-order hour ranges, parsing the formatted date string with 'yyyy-MM-dd HH'
     */
    @NotNull
    public static HourRange hourYMDHRangeTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return hourYMDHRangeTo(formattedDate, endInclusive, 1);
    }


    /**
     * Create a positive-order hour range that does not contain [end]
     */
    @NotNull
    public static HourRange hourUntilTo(@NotNull Date date, @NotNull Date end, int step) {
        return new HourRange(date, Datex.addHourOfDay(end, -1), step);
    }

    /**
     * Create a positive-order hour range that does not contain [end]
     */
    @NotNull
    public static HourRange hourUntilTo(@NotNull Date date, @NotNull Date end) {
        return hourUntilTo(date, end, 1);
    }

    /**
     * Create a positive-order hour range that does not contain [end]
     */
    @NotNull
    public static HourRange hourUntilTo(long millisecondValue, long end, int step) {
        return hourUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end), step);
    }

    /**
     * Create a positive-order hour range that does not contain [end]
     */
    @NotNull
    public static HourRange hourUntilTo(long millisecondValue, long end) {
        return hourUntilTo(millisecondValue, end, 1);
    }

    /**
     * Create a positive-order hour range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH'
     */
    @NotNull
    public static HourRange hourYMDHUntilTo(@NotNull String formattedDate, @NotNull String end, int step) throws ParseException {
        return hourUntilTo(Datex.toDateYMDH(formattedDate), Datex.toDateYMDH(end), step);
    }

    /**
     * Create a positive-order hour range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH'
     */
    @NotNull
    public static HourRange hourYMDHUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return hourYMDHUntilTo(formattedDate, end, 1);
    }


    /**
     * Create a reversed hour range
     */
    @NotNull
    public static HourRange hourDownTo(@NotNull Date date, @NotNull Date endInclusive, int step) {
        return new HourRange(date, endInclusive, step);
    }

    /**
     * Create a reversed hour range
     */
    @NotNull
    public static HourRange hourDownTo(@NotNull Date date, @NotNull Date endInclusive) {
        return hourDownTo(date, endInclusive, -1);
    }

    /**
     * Create a reversed hour range
     */
    @NotNull
    public static HourRange hourDownTo(long millisecondValue, long endInclusive, int step) {
        return hourDownTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive), step);
    }

    /**
     * Create a reversed hour range
     */
    @NotNull
    public static HourRange hourDownTo(long millisecondValue, long endInclusive) {
        return hourDownTo(millisecondValue, endInclusive, -1);
    }

    /**
     * Create a reversed hour range, parsing the formatted date string with 'yyyy-MM-dd HH'
     */
    @NotNull
    public static HourRange hourYMDHDownTo(@NotNull String formattedDate, @NotNull String endInclusive, int step) throws ParseException {
        return hourDownTo(Datex.toDateYMDH(formattedDate), Datex.toDateYMDH(endInclusive), step);
    }

    /**
     * Create a reversed hour range, parsing the formatted date string with 'yyyy-MM-dd HH'
     */
    @NotNull
    public static HourRange hourYMDHDownTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return hourYMDHDownTo(formattedDate, endInclusive, -1);
    }


    /**
     * Create a reversed hour range that does not contain [end]
     */
    @NotNull
    public static HourRange hourDownUntilTo(@NotNull Date date, @NotNull Date end, int step) {
        return new HourRange(date, Datex.addHourOfDay(end, 1), step);
    }

    /**
     * Create a reversed hour range that does not contain [end]
     */
    @NotNull
    public static HourRange hourDownUntilTo(@NotNull Date date, @NotNull Date end) {
        return hourDownUntilTo(date, end, -1);
    }

    /**
     * Create a reversed hour range that does not contain [end]
     */
    @NotNull
    public static HourRange hourDownUntilTo(long millisecondValue, long end, int step) {
        return hourDownUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end), step);
    }

    /**
     * Create a reversed hour range that does not contain [end]
     */
    @NotNull
    public static HourRange hourDownUntilTo(long millisecondValue, long end) {
        return hourDownUntilTo(millisecondValue, end, -1);
    }

    /**
     * Create a reversed hour range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH'
     */
    @NotNull
    public static HourRange hourYMDHDownUntilTo(@NotNull String formattedDate, @NotNull String end, int step) throws ParseException {
        return hourDownUntilTo(Datex.toDateYMDH(formattedDate), Datex.toDateYMDH(end), step);
    }

    /**
     * Create a reversed hour range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH'
     */
    @NotNull
    public static HourRange hourYMDHDownUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return hourYMDHDownUntilTo(formattedDate, end, -1);
    }


    /* ******************************************* Minute Range *******************************************/


    /**
     * Create a positive-order minute ranges
     */
    @NotNull
    public static MinuteRange minuteRangeTo(@NotNull Date date, @NotNull Date endInclusive, int step) {
        return new MinuteRange(date, endInclusive, step);
    }

    /**
     * Create a positive-order minute ranges
     */
    @NotNull
    public static MinuteRange minuteRangeTo(@NotNull Date date, @NotNull Date endInclusive) {
        return minuteRangeTo(date, endInclusive, 1);
    }

    /**
     * Create a positive-order minute ranges
     */
    @NotNull
    public static MinuteRange minuteRangeTo(long millisecondValue, long endInclusive, int step) {
        return minuteRangeTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive), step);
    }

    /**
     * Create a positive-order minute ranges
     */
    @NotNull
    public static MinuteRange minuteRangeTo(long millisecondValue, long endInclusive) {
        return minuteRangeTo(millisecondValue, endInclusive, 1);
    }

    /**
     * Create a positive-order minute ranges, parsing the formatted date string with 'yyyy-MM-dd HH:mm'
     */
    @NotNull
    public static MinuteRange minuteYMDHMRangeTo(@NotNull String formattedDate, @NotNull String endInclusive, int step) throws ParseException {
        return minuteRangeTo(Datex.toDateYMDHM(formattedDate), Datex.toDateYMDHM(endInclusive), step);
    }

    /**
     * Create a positive-order minute ranges, parsing the formatted date string with 'yyyy-MM-dd HH:mm'
     */
    @NotNull
    public static MinuteRange minuteYMDHMRangeTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return minuteYMDHMRangeTo(formattedDate, endInclusive, 1);
    }


    /**
     * Create a positive-order minute range that does not contain [end]
     */
    @NotNull
    public static MinuteRange minuteUntilTo(@NotNull Date date, @NotNull Date end, int step) {
        return new MinuteRange(date, Datex.addMinute(end, -1), step);
    }

    /**
     * Create a positive-order minute range that does not contain [end]
     */
    @NotNull
    public static MinuteRange minuteUntilTo(@NotNull Date date, @NotNull Date end) {
        return minuteUntilTo(date, end, 1);
    }

    /**
     * Create a positive-order minute range that does not contain [end]
     */
    @NotNull
    public static MinuteRange minuteUntilTo(long millisecondValue, long end, int step) {
        return minuteUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end), step);
    }

    /**
     * Create a positive-order minute range that does not contain [end]
     */
    @NotNull
    public static MinuteRange minuteUntilTo(long millisecondValue, long end) {
        return minuteUntilTo(millisecondValue, end, 1);
    }

    /**
     * Create a positive-order minute range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm'
     */
    @NotNull
    public static MinuteRange minuteYMDHMUntilTo(@NotNull String formattedDate, @NotNull String end, int step) throws ParseException {
        return minuteUntilTo(Datex.toDateYMDHM(formattedDate), Datex.toDateYMDHM(end), step);
    }

    /**
     * Create a positive-order minute range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm'
     */
    @NotNull
    public static MinuteRange minuteYMDHMUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return minuteYMDHMUntilTo(formattedDate, end, 1);
    }


    /**
     * Create a reversed minute range
     */
    @NotNull
    public static MinuteRange minuteDownTo(@NotNull Date date, @NotNull Date endInclusive, int step) {
        return new MinuteRange(date, endInclusive, step);
    }

    /**
     * Create a reversed minute range
     */
    @NotNull
    public static MinuteRange minuteDownTo(@NotNull Date date, @NotNull Date endInclusive) {
        return minuteDownTo(date, endInclusive, -1);
    }

    /**
     * Create a reversed minute range
     */
    @NotNull
    public static MinuteRange minuteDownTo(long millisecondValue, long endInclusive, int step) {
        return minuteDownTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive), step);
    }

    /**
     * Create a reversed minute range
     */
    @NotNull
    public static MinuteRange minuteDownTo(long millisecondValue, long endInclusive) {
        return minuteDownTo(millisecondValue, endInclusive, -1);
    }

    /**
     * Create a reversed minute range, parsing the formatted date string with 'yyyy-MM-dd HH:mm'
     */
    @NotNull
    public static MinuteRange minuteYMDHMDownTo(@NotNull String formattedDate, @NotNull String endInclusive, int step) throws ParseException {
        return minuteDownTo(Datex.toDateYMDHM(formattedDate), Datex.toDateYMDHM(endInclusive), step);
    }

    /**
     * Create a reversed minute range, parsing the formatted date string with 'yyyy-MM-dd HH:mm'
     */
    @NotNull
    public static MinuteRange minuteYMDHMDownTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return minuteYMDHMDownTo(formattedDate, endInclusive, -1);
    }


    /**
     * Create a reversed minute range that does not contain [end]
     */
    @NotNull
    public static MinuteRange minuteDownUntilTo(@NotNull Date date, @NotNull Date end, int step) {
        return new MinuteRange(date, Datex.addMinute(end, 1), step);
    }

    /**
     * Create a reversed minute range that does not contain [end]
     */
    @NotNull
    public static MinuteRange minuteDownUntilTo(@NotNull Date date, @NotNull Date end) {
        return minuteDownUntilTo(date, end, -1);
    }

    /**
     * Create a reversed minute range that does not contain [end]
     */
    @NotNull
    public static MinuteRange minuteDownUntilTo(long millisecondValue, long end, int step) {
        return minuteDownUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end), step);
    }

    /**
     * Create a reversed minute range that does not contain [end]
     */
    @NotNull
    public static MinuteRange minuteDownUntilTo(long millisecondValue, long end) {
        return minuteDownUntilTo(millisecondValue, end, -1);
    }

    /**
     * Create a reversed minute range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm'
     */
    @NotNull
    public static MinuteRange minuteYMDHMDownUntilTo(@NotNull String formattedDate, @NotNull String end, int step) throws ParseException {
        return minuteDownUntilTo(Datex.toDateYMDHM(formattedDate), Datex.toDateYMDHM(end), step);
    }

    /**
     * Create a reversed minute range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm'
     */
    @NotNull
    public static MinuteRange minuteYMDHMDownUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return minuteYMDHMDownUntilTo(formattedDate, end, -1);
    }


    /* ******************************************* Second Range *******************************************/


    /**
     * Create a positive-order second ranges
     */
    @NotNull
    public static SecondRange secondRangeTo(@NotNull Date date, @NotNull Date endInclusive, int step) {
        return new SecondRange(date, endInclusive, step);
    }

    /**
     * Create a positive-order second ranges
     */
    @NotNull
    public static SecondRange secondRangeTo(@NotNull Date date, @NotNull Date endInclusive) {
        return secondRangeTo(date, endInclusive, 1);
    }

    /**
     * Create a positive-order second ranges
     */
    @NotNull
    public static SecondRange secondRangeTo(long millisecondValue, long endInclusive, int step) {
        return secondRangeTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive), step);
    }

    /**
     * Create a positive-order second ranges
     */
    @NotNull
    public static SecondRange secondRangeTo(long millisecondValue, long endInclusive) {
        return secondRangeTo(millisecondValue, endInclusive, 1);
    }

    /**
     * Create a positive-order second ranges, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
     */
    @NotNull
    public static SecondRange secondYMDHMSRangeTo(@NotNull String formattedDate, @NotNull String endInclusive, int step) throws ParseException {
        return secondRangeTo(Datex.toDateYMDHMS(formattedDate), Datex.toDateYMDHMS(endInclusive), step);
    }

    /**
     * Create a positive-order second ranges, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
     */
    @NotNull
    public static SecondRange secondYMDHMSRangeTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return secondYMDHMSRangeTo(formattedDate, endInclusive, 1);
    }


    /**
     * Create a positive-order second range that does not contain [end]
     */
    @NotNull
    public static SecondRange secondUntilTo(@NotNull Date date, @NotNull Date end, int step) {
        return new SecondRange(date, Datex.addSecond(end, -1), step);
    }

    /**
     * Create a positive-order second range that does not contain [end]
     */
    @NotNull
    public static SecondRange secondUntilTo(@NotNull Date date, @NotNull Date end) {
        return secondUntilTo(date, end, 1);
    }

    /**
     * Create a positive-order second range that does not contain [end]
     */
    @NotNull
    public static SecondRange secondUntilTo(long millisecondValue, long end, int step) {
        return secondUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end), step);
    }

    /**
     * Create a positive-order second range that does not contain [end]
     */
    @NotNull
    public static SecondRange secondUntilTo(long millisecondValue, long end) {
        return secondUntilTo(millisecondValue, end, 1);
    }

    /**
     * Create a positive-order second range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
     */
    @NotNull
    public static SecondRange secondYMDHMSUntilTo(@NotNull String formattedDate, @NotNull String end, int step) throws ParseException {
        return secondUntilTo(Datex.toDateYMDHMS(formattedDate), Datex.toDateYMDHMS(end), step);
    }

    /**
     * Create a positive-order second range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
     */
    @NotNull
    public static SecondRange secondYMDHMSUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return secondYMDHMSUntilTo(formattedDate, end, 1);
    }


    /**
     * Create a reversed second range
     */
    @NotNull
    public static SecondRange secondDownTo(@NotNull Date date, @NotNull Date endInclusive, int step) {
        return new SecondRange(date, endInclusive, step);
    }

    /**
     * Create a reversed second range
     */
    @NotNull
    public static SecondRange secondDownTo(@NotNull Date date, @NotNull Date endInclusive) {
        return secondDownTo(date, endInclusive, -1);
    }

    /**
     * Create a reversed second range
     */
    @NotNull
    public static SecondRange secondDownTo(long millisecondValue, long endInclusive, int step) {
        return secondDownTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive), step);
    }

    /**
     * Create a reversed second range
     */
    @NotNull
    public static SecondRange secondDownTo(long millisecondValue, long endInclusive) {
        return secondDownTo(millisecondValue, endInclusive, -1);
    }

    /**
     * Create a reversed second range, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
     */
    @NotNull
    public static SecondRange secondYMDHMSDownTo(@NotNull String formattedDate, @NotNull String endInclusive, int step) throws ParseException {
        return secondDownTo(Datex.toDateYMDHMS(formattedDate), Datex.toDateYMDHMS(endInclusive), step);
    }

    /**
     * Create a reversed second range, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
     */
    @NotNull
    public static SecondRange secondYMDHMSDownTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return secondYMDHMSDownTo(formattedDate, endInclusive, -1);
    }


    /**
     * Create a reversed second range that does not contain [end]
     */
    @NotNull
    public static SecondRange secondDownUntilTo(@NotNull Date date, @NotNull Date end, int step) {
        return new SecondRange(date, Datex.addSecond(end, 1), step);
    }

    /**
     * Create a reversed second range that does not contain [end]
     */
    @NotNull
    public static SecondRange secondDownUntilTo(@NotNull Date date, @NotNull Date end) {
        return secondDownUntilTo(date, end, -1);
    }

    /**
     * Create a reversed second range that does not contain [end]
     */
    @NotNull
    public static SecondRange secondDownUntilTo(long millisecondValue, long end, int step) {
        return secondDownUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end), step);
    }

    /**
     * Create a reversed second range that does not contain [end]
     */
    @NotNull
    public static SecondRange secondDownUntilTo(long millisecondValue, long end) {
        return secondDownUntilTo(millisecondValue, end, -1);
    }

    /**
     * Create a reversed second range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
     */
    @NotNull
    public static SecondRange secondYMDHMSDownUntilTo(@NotNull String formattedDate, @NotNull String end, int step) throws ParseException {
        return secondDownUntilTo(Datex.toDateYMDHMS(formattedDate), Datex.toDateYMDHMS(end), step);
    }

    /**
     * Create a reversed second range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
     */
    @NotNull
    public static SecondRange secondYMDHMSDownUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return secondYMDHMSDownUntilTo(formattedDate, end, -1);
    }


    /* ******************************************* Millisecond Range *******************************************/


    /**
     * Create a positive-order millisecond ranges
     */
    @NotNull
    public static MillisecondRange millisecondRangeTo(@NotNull Date date, @NotNull Date endInclusive, int step) {
        return new MillisecondRange(date, endInclusive, step);
    }

    /**
     * Create a positive-order millisecond ranges
     */
    @NotNull
    public static MillisecondRange millisecondRangeTo(@NotNull Date date, @NotNull Date endInclusive) {
        return millisecondRangeTo(date, endInclusive, 1);
    }

    /**
     * Create a positive-order millisecond ranges
     */
    @NotNull
    public static MillisecondRange millisecondRangeTo(long millisecondValue, long endInclusive, int step) {
        return millisecondRangeTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive), step);
    }

    /**
     * Create a positive-order millisecond ranges
     */
    @NotNull
    public static MillisecondRange millisecondRangeTo(long millisecondValue, long endInclusive) {
        return millisecondRangeTo(millisecondValue, endInclusive, 1);
    }

    /**
     * Create a positive-order millisecond ranges, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
     */
    @NotNull
    public static MillisecondRange millisecondYMDHMSMRangeTo(@NotNull String formattedDate, @NotNull String endInclusive, int step) throws ParseException {
        return millisecondRangeTo(Datex.toDateYMDHMSM(formattedDate), Datex.toDateYMDHMSM(endInclusive), step);
    }

    /**
     * Create a positive-order millisecond ranges, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
     */
    @NotNull
    public static MillisecondRange millisecondYMDHMSMRangeTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return millisecondYMDHMSMRangeTo(formattedDate, endInclusive, 1);
    }


    /**
     * Create a positive-order millisecond range that does not contain [end]
     */
    @NotNull
    public static MillisecondRange millisecondUntilTo(@NotNull Date date, @NotNull Date end, int step) {
        return new MillisecondRange(date, Datex.addMillisecond(end, -1), step);
    }

    /**
     * Create a positive-order millisecond range that does not contain [end]
     */
    @NotNull
    public static MillisecondRange millisecondUntilTo(@NotNull Date date, @NotNull Date end) {
        return millisecondUntilTo(date, end, 1);
    }

    /**
     * Create a positive-order millisecond range that does not contain [end]
     */
    @NotNull
    public static MillisecondRange millisecondUntilTo(long millisecondValue, long end, int step) {
        return millisecondUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end), step);
    }

    /**
     * Create a positive-order millisecond range that does not contain [end]
     */
    @NotNull
    public static MillisecondRange millisecondUntilTo(long millisecondValue, long end) {
        return millisecondUntilTo(millisecondValue, end, 1);
    }

    /**
     * Create a positive-order millisecond range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
     */
    @NotNull
    public static MillisecondRange millisecondYMDHMSMUntilTo(@NotNull String formattedDate, @NotNull String end, int step) throws ParseException {
        return millisecondUntilTo(Datex.toDateYMDHMSM(formattedDate), Datex.toDateYMDHMSM(end), step);
    }

    /**
     * Create a positive-order millisecond range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
     */
    @NotNull
    public static MillisecondRange millisecondYMDHMSMUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return millisecondYMDHMSMUntilTo(formattedDate, end, 1);
    }


    /**
     * Create a reversed millisecond range
     */
    @NotNull
    public static MillisecondRange millisecondDownTo(@NotNull Date date, @NotNull Date endInclusive, int step) {
        return new MillisecondRange(date, endInclusive, step);
    }

    /**
     * Create a reversed millisecond range
     */
    @NotNull
    public static MillisecondRange millisecondDownTo(@NotNull Date date, @NotNull Date endInclusive) {
        return millisecondDownTo(date, endInclusive, -1);
    }

    /**
     * Create a reversed millisecond range
     */
    @NotNull
    public static MillisecondRange millisecondDownTo(long millisecondValue, long endInclusive, int step) {
        return millisecondDownTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive), step);
    }

    /**
     * Create a reversed millisecond range
     */
    @NotNull
    public static MillisecondRange millisecondDownTo(long millisecondValue, long endInclusive) {
        return millisecondDownTo(millisecondValue, endInclusive, -1);
    }

    /**
     * Create a reversed millisecond range, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
     */
    @NotNull
    public static MillisecondRange millisecondYMDHMSMDownTo(@NotNull String formattedDate, @NotNull String endInclusive, int step) throws ParseException {
        return millisecondDownTo(Datex.toDateYMDHMSM(formattedDate), Datex.toDateYMDHMSM(endInclusive), step);
    }

    /**
     * Create a reversed millisecond range, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
     */
    @NotNull
    public static MillisecondRange millisecondYMDHMSMDownTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return millisecondYMDHMSMDownTo(formattedDate, endInclusive, -1);
    }


    /**
     * Create a reversed millisecond range that does not contain [end]
     */
    @NotNull
    public static MillisecondRange millisecondDownUntilTo(@NotNull Date date, @NotNull Date end, int step) {
        return new MillisecondRange(date, Datex.addMillisecond(end, 1), step);
    }

    /**
     * Create a reversed millisecond range that does not contain [end]
     */
    @NotNull
    public static MillisecondRange millisecondDownUntilTo(@NotNull Date date, @NotNull Date end) {
        return millisecondDownUntilTo(date, end, -1);
    }

    /**
     * Create a reversed millisecond range that does not contain [end]
     */
    @NotNull
    public static MillisecondRange millisecondDownUntilTo(long millisecondValue, long end, int step) {
        return millisecondDownUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end), step);
    }

    /**
     * Create a reversed millisecond range that does not contain [end]
     */
    @NotNull
    public static MillisecondRange millisecondDownUntilTo(long millisecondValue, long end) {
        return millisecondDownUntilTo(millisecondValue, end, -1);
    }

    /**
     * Create a reversed millisecond range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
     */
    @NotNull
    public static MillisecondRange millisecondYMDHMSMDownUntilTo(@NotNull String formattedDate, @NotNull String end, int step) throws ParseException {
        return millisecondDownUntilTo(Datex.toDateYMDHMSM(formattedDate), Datex.toDateYMDHMSM(end), step);
    }

    /**
     * Create a reversed millisecond range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
     */
    @NotNull
    public static MillisecondRange millisecondYMDHMSMDownUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return millisecondYMDHMSMDownUntilTo(formattedDate, end, -1);
    }
}
