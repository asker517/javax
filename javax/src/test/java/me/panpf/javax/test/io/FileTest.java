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

package me.panpf.javax.test.io;

import me.panpf.javax.io.Filex;
import me.panpf.javax.io.UnableCreateDirException;
import me.panpf.javax.io.UnableCreateFileException;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {

    @Test
    public void testRequireExist() {
        File testFile = new File("/tmp/testRequireExist");
        testFile.delete();

        boolean result;
        try {
            Filex.requireExist(testFile);
            result = true;
        } catch (FileNotFoundException e) {
            result = false;
        }
        Assert.assertFalse(result);

        Filex.createNewFileCheck(testFile);

        try {
            Filex.requireExist(testFile);
            result = true;
        } catch (FileNotFoundException e) {
            result = false;
        }
        Assert.assertTrue(result);

        testFile.delete();
    }

    @Test
    public void testRequireIsDir() {
        File testDir = new File("/tmp/testRequireIsDir");

        // 不存在时
        Filex.deleteRecursively(testDir);
        boolean result;
        try {
            Filex.requireIsDir(testDir);
            result = true;
        } catch (IllegalArgumentException e) {
            result = false;
        }
        Assert.assertFalse(result);

        // 文件
        Filex.createNewFileCheck(testDir);
        try {
            Filex.requireIsDir(testDir);
            result = true;
        } catch (IllegalArgumentException e) {
            result = false;
        }
        Assert.assertFalse(result);

        // 目录
        Filex.deleteRecursively(testDir);
        Filex.mkdirsCheck(testDir);
        try {
            Filex.requireIsDir(testDir);
            result = true;
        } catch (IllegalArgumentException e) {
            result = false;
        }
        Assert.assertTrue(result);

        Filex.deleteRecursively(testDir);
    }

    @Test
    public void testRequireIsFile() {
        File testFile = new File("/tmp/testRequireIsFile");

        // 不存在时
        Filex.deleteRecursively(testFile);
        boolean result;
        try {
            Filex.requireIsFile(testFile);
            result = true;
        } catch (IllegalArgumentException e) {
            result = false;
        }
        Assert.assertFalse(result);

        // 目录
        Filex.mkdirsCheck(testFile);
        try {
            Filex.requireIsFile(testFile);
            result = true;
        } catch (IllegalArgumentException e) {
            result = false;
        }
        Assert.assertFalse(result);

        // 文件
        Filex.deleteRecursively(testFile);
        Filex.createNewFileCheck(testFile);
        try {
            Filex.requireIsFile(testFile);
            result = true;
        } catch (IllegalArgumentException e) {
            result = false;
        }
        Assert.assertTrue(result);

        Filex.deleteRecursively(testFile);
    }

    @Test
    public void testCleanDir() throws UnableCreateFileException, UnableCreateDirException {
        File dir = new File("/tmp/javaxCleanDirTest");
        File testFile1 = new File(dir, "test1.txt");
        File testFile2 = new File(dir, "test2.txt");

        Assert.assertFalse(testFile1.exists());
        Filex.createNewFileOrThrow(testFile1);
        Assert.assertTrue(testFile1.exists());

        Assert.assertFalse(testFile2.exists());
        Filex.createNewFileCheck(testFile2);
        Assert.assertTrue(testFile2.exists());

        Filex.cleanDir(dir);
        Assert.assertEquals(dir.listFiles().length, 0);

        dir.delete();
        Assert.assertFalse(dir.exists());
    }

    @Test
    public void testCreateNewFile() throws UnableCreateFileException, UnableCreateDirException {
        File dir = new File("/tmp/javaxCreateNewFileTest");
        File testFile1 = new File(dir, "test1.txt");
        File testFile2 = new File(dir, "test2.txt");

        Assert.assertFalse(testFile1.exists());
        Filex.createNewFileOrThrow(testFile1);
        Assert.assertTrue(testFile1.exists());

        Assert.assertFalse(testFile2.exists());
        Filex.createNewFileCheck(testFile2);
        Assert.assertTrue(testFile2.exists());

        Filex.deleteRecursively(dir);
        Assert.assertFalse(dir.exists());
    }

    @Test
    public void testCreateDir() throws UnableCreateDirException {
        File dir1 = new File("/tmp/javaxCreateDirTest1");
        File dir2 = new File("/tmp/javaxCreateDirTest2");

        Assert.assertFalse(dir1.exists());
        Filex.mkdirsOrThrow(dir1);
        Assert.assertTrue(dir1.exists());

        Assert.assertFalse(dir2.exists());
        Filex.mkdirsOrThrow(dir2);
        Assert.assertTrue(dir2.exists());

        Filex.deleteRecursively(dir1);
        Assert.assertFalse(dir1.exists());

        Filex.deleteRecursively(dir2);
        Assert.assertFalse(dir2.exists());
    }

    @Test
    public void testNameSuffix() {
        File file = new File("/tmp/testNameSuffix.txt");
        Assert.assertEquals(Filex.getExtension(file), "txt");
    }

    @Test
    public void testSimpleName() {
        File file = new File("/tmp/testSimpleName.txt");
        Assert.assertEquals(Filex.getNameWithoutExtension(file), "testSimpleName");
    }

    @Test
    public void testLengthWithDir() throws IOException {
        File dir = new File("/tmp/testLengthWithDir");

        File childFile1 = new File(dir, "test1.txt");
        Filex.createNewFileOrThrow(childFile1);
        Filex.writeText(childFile1, "111");
        Assert.assertEquals(childFile1.length(), 3);

        File childFile2 = new File(dir, "test2.txt");
        Filex.createNewFileOrThrow(childFile2);
        Filex.writeText(childFile2, "111");
        Assert.assertEquals(childFile2.length(), 3);

        Assert.assertEquals(Filex.lengthRecursively(dir), 6);

        Filex.deleteRecursively(dir);
        Assert.assertFalse(dir.exists());
    }
}