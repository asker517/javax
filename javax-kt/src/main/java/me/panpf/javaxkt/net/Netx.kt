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

package me.panpf.javaxkt.net

import me.panpf.javax.net.Netx

/**
 * Return true if the given ip address is IP v4
 */
inline fun CharSequence?.isIPV4(): Boolean = Netx.isIPV4(this)

/**
 * Return true if the given ip address is IP v6
 */
inline fun CharSequence?.isIPV6(): Boolean = Netx.isIPV6(this)

/**
 * Return true if the given char sequence is mac address. Support for splitting in ':' and '-'
 */
inline fun CharSequence?.isMacAddress(): Boolean = Netx.isMacAddress(this)

inline fun Long.ipLongToString(): String = Netx.ipLongToString(this)

inline fun String.ipStringToLong(): Long = Netx.ipStringToLong(this)

