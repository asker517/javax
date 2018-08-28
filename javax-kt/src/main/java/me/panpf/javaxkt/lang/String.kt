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

package me.panpf.javaxkt.lang

/*
 * String tool
 */

/**
 * Return true if the specified string contains one of the strings in [params]
 */
fun String.orContains(params: Array<String>): Boolean {
    for (param in params) {
        if (this.contains(param)) {
            return true
        }
    }

    return false
}

/**
 * Return true if the specified string contains all the strings in[params]
 */
fun String.andContains(params: Array<String>): Boolean {
    for (param in params) {
        if (!this.contains(param)) {
            return false
        }
    }

    return true
}