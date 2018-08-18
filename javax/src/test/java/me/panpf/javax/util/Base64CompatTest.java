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

import org.junit.Assert;
import org.junit.Test;

public class Base64CompatTest {

    @Test
    public void testBase64(){
        String source = "上山打老虎";
        String result = new String(Base64Compat.getDecoder().decode(Base64Compat.getEncoder().encodeToString(source.getBytes())));
        Assert.assertEquals(source, result);
    }
}
