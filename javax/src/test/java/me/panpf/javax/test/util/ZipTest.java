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

package me.panpf.javax.test.util;

import me.panpf.javax.io.Filex;
import me.panpf.javax.security.Digestx;
import me.panpf.javax.util.Zipx;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class ZipTest {

    @Test
    public void testCompression() throws IOException {
        File dir = new File("/tmp/testCompression");
        File file1 = new File("/tmp/testCompression/file1");
        File file2 = new File("/tmp/testCompression/file2");
        File file3 = new File("/tmp/testCompression/file3");
        File file41 = new File("/tmp/testCompression/dir4/file41");
        File file42 = new File("/tmp/testCompression/dir4/file42");
        File file51 = new File("/tmp/testCompression/dir5/file51");
        File file52 = new File("/tmp/testCompression/dir5/file52");

        Filex.deleteRecursively(dir);
        Filex.writeText(Filex.createNewFileOrThrow(file1), "testFile1");
        Filex.writeText(Filex.createNewFileOrThrow(file2), "testFile2");
        Filex.writeText(Filex.createNewFileOrThrow(file3), "testFile3");
        Filex.writeText(Filex.createNewFileOrThrow(file41), "testFile41");
        Filex.writeText(Filex.createNewFileOrThrow(file42), "testFile42");
        Filex.writeText(Filex.createNewFileOrThrow(file51), "testFile51");
        Filex.writeText(Filex.createNewFileOrThrow(file52), "testFile52");

        File dstFile = Zipx.compressionDir(dir);

        Filex.deleteRecursively(Zipx.getDecompressionDstDir(dstFile));
        File decompressionDstDir = Zipx.decompression(dstFile);

        Assert.assertEquals(Digestx.getMD5(file1), Digestx.getMD5(new File(decompressionDstDir, "file1")));
        Assert.assertEquals(Digestx.getMD5(file2), Digestx.getMD5(new File(decompressionDstDir, "file2")));
        Assert.assertEquals(Digestx.getMD5(file3), Digestx.getMD5(new File(decompressionDstDir, "file3")));
        Assert.assertEquals(Digestx.getMD5(file41), Digestx.getMD5(new File(decompressionDstDir, "dir4/file41")));
        Assert.assertEquals(Digestx.getMD5(file42), Digestx.getMD5(new File(decompressionDstDir, "dir4/file42")));
        Assert.assertEquals(Digestx.getMD5(file51), Digestx.getMD5(new File(decompressionDstDir, "dir5/file51")));
        Assert.assertEquals(Digestx.getMD5(file52), Digestx.getMD5(new File(decompressionDstDir, "dir5/file52")));

        Filex.deleteRecursively(dir);
        Filex.deleteRecursively(dstFile);
        Filex.deleteRecursively(decompressionDstDir);
    }
}
