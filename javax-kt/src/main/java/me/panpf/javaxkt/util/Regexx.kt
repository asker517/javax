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

@file:Suppress("NOTHING_TO_INLINE")

package me.panpf.javaxkt.util

import me.panpf.javax.util.Regexx
import java.util.regex.Pattern


/**
 * Return true if the entire sequence of characters matches the given regular expression
 */
inline fun Pattern.regexMatches(charSequence: CharSequence?): Boolean = Regexx.matches(this, charSequence)

/**
 * Return true if the entire sequence of characters matches the given regular expression
 */
inline fun String.regexMatches(charSequence: CharSequence?): Boolean = Regexx.matches(this, charSequence)

/**
 * Returns true if the specified sequence of characters matches any given position from the specified position to the given regular expression
 */
inline fun Pattern.regexFind(charSequence: CharSequence?, start: Int): Boolean = Regexx.find(this, charSequence, start)

/**
 * Returns true if the specified sequence of characters matches any given position from the specified position to the given regular expression
 */
inline fun String.regexFind(charSequence: CharSequence?, start: Int): Boolean = Regexx.find(this, charSequence, start)

/**
 * Return true if a given regular expression is matched anywhere in a given sequence of characters
 */
inline fun Pattern.regexFind(charSequence: CharSequence?): Boolean = Regexx.find(this, charSequence)

/**
 * Return true if a given regular expression is matched anywhere in a given sequence of characters
 */
inline fun String.regexFind(charSequence: CharSequence?): Boolean = Regexx.find(this, charSequence)

/**
 * Return true if the given regular expression is matched at the beginning of the character sequence
 */
inline fun Pattern.regexLookingAt(charSequence: CharSequence?): Boolean = Regexx.lookingAt(this, charSequence)

/**
 * Return true if the given regular expression is matched at the beginning of the character sequence
 */
inline fun String.regexLookingAt(charSequence: CharSequence?): Boolean = Regexx.lookingAt(this, charSequence)

/**
 * Get the first matching string
 */
inline fun Pattern.regexGetFirst(charSequence: CharSequence?): String? = Regexx.getFirst(this, charSequence)

/**
 * Get the first matching string
 */
inline fun String.regexGetFirst(charSequence: CharSequence?): String? = Regexx.getFirst(this, charSequence)

/**
 * Get the all matching string
 */
inline fun Pattern.regexGetAll(charSequence: CharSequence?): Array<String> = Regexx.getAll(this, charSequence)

/**
 * Get the all matching string
 */
inline fun String.regexGetAll(charSequence: CharSequence?): Array<String> = Regexx.getAll(this, charSequence)

/**
 * Get the first matching group
 */
inline fun Pattern.regexFirstGroup(charSequence: CharSequence?): Regexx.Group? = Regexx.firstGroup(this, charSequence)

/**
 * Get the first matching group
 */
inline fun String.regexFirstGroup(charSequence: CharSequence?): Regexx.Group? = Regexx.firstGroup(this, charSequence)

/**
 * Get the all matching group
 */
inline fun Pattern.regexAllGroup(charSequence: CharSequence?): Array<Regexx.Group> = Regexx.allGroup(this, charSequence)

/**
 * Get the all matching group
 */
inline fun String.regexAllGroup(charSequence: CharSequence?): Array<Regexx.Group> = Regexx.allGroup(this, charSequence)

/**
 * Replace the first matching string
 */
inline fun Pattern.regexReplaceFirst(charSequence: CharSequence?, replacement: String): String = Regexx.replaceFirst(this, charSequence, replacement)

/**
 * Replace the first matching string
 */
inline fun String.regexReplaceFirst(charSequence: CharSequence?, replacement: String): String = Regexx.replaceFirst(this, charSequence, replacement)

/**
 * Replace the all matching string
 */
inline fun Pattern.regexReplaceAll(charSequence: CharSequence?, replacement: String): String = Regexx.replaceAll(this, charSequence, replacement)

/**
 * Replace the all matching string
 */
inline fun String.regexReplaceAll(charSequence: CharSequence?, replacement: String): String = Regexx.replaceAll(this, charSequence, replacement)