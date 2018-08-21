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

package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

import java.text.DecimalFormat;

/**
 * Mathematical related tool method
 */
@SuppressWarnings("WeakerAccess")
public class Mathx {

    /**
     * Pythagorean theorem
     */
    public static double pythagoreanTheorem(double value1, double value2) {
        return Math.sqrt((value1 * value1) + (value2 * value2));
    }

    /**
     * Calculate the percentage
     *
     * @param value           Value
     * @param decimalPlaces   Keep a few decimal places
     * @param replaceWithZero Use 0 instead when the number of decimal places is insufficient
     * @param removePercent   Delete the percent sign at the end of the string
     */
    @NotNull
    public static String percent(double value, int decimalPlaces, boolean replaceWithZero, boolean removePercent) {
        StringBuilder buffString = new StringBuilder();
        buffString.append("#");
        if (decimalPlaces > 0) {
            buffString.append(".");
        }
        for (int w = 0; w < decimalPlaces; w++) {
            buffString.append(replaceWithZero ? "0" : "#");
        }
        buffString.append("%");
        String result = new DecimalFormat(buffString.toString()).format(value);
        if (removePercent && result.length() > 0) {
            result = result.substring(0, result.length() - 1);
        }
        return result;
    }

    /**
     * Calculate the percentage
     *
     * @param value1          value1
     * @param value2          value2
     * @param decimalPlaces   Keep a few decimal places
     * @param replaceWithZero Use 0 instead when the number of decimal places is insufficient
     * @param removePercent   Delete the percent sign at the end of the string
     */
    @NotNull
    public static String percent(double value1, double value2, int decimalPlaces, boolean replaceWithZero, boolean removePercent) {
        return percent(value1 / value2, decimalPlaces, replaceWithZero, removePercent);
    }

    /**
     * Calculate the percentage, Leave two decimal places by default
     *
     * @param value Value
     */
    @NotNull
    public static String percent(double value) {
        return percent(value, 2, false, false);
    }

    /**
     * Calculate the percentage, Leave two decimal places by default
     *
     * @param value1 value1
     * @param value2 value2
     */
    public static String percent(double value1, double value2) {
        return percent(value1 / value2, 2, false, false);
    }
}