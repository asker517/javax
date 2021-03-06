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

package me.panpf.javax.test.crypto;

import me.panpf.javax.crypto.Aesx;
import me.panpf.javax.crypto.Keyx;
import me.panpf.javax.util.Base64x;
import org.junit.Assert;
import org.junit.Test;

public class KeyxTest {

    @Test
    public void testToBase64() {
        String seed = "" + System.currentTimeMillis();

        String key1 = Keyx.toBase64(Aesx.createKeyByPassword(seed, 16));
        String key2 = Keyx.toBase64(Aesx.createKeyByPassword(seed, 16));

        Assert.assertEquals("testToBase64", key1, key2);
    }

    @Test
    public void testToBytes() {
        String seed = "" + System.currentTimeMillis();

        String key1 = Base64x.encodeToString(Keyx.toBytes(Aesx.createKeyByPassword(seed, 16)));
        String key2 = Base64x.encodeToString(Keyx.toBytes(Aesx.createKeyByPassword(seed, 16)));

        Assert.assertEquals("testToBytes", key1, key2);
    }
}
