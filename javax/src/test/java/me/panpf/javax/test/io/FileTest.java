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
import me.panpf.javax.util.Premisex;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class FileTest {

    @Test
    public void testRequireExist() {
        File testFile = new File("/tmp/testRequireExist");
        testFile.delete();

        boolean result;
        try {
            Premisex.requireExist(testFile);
            result = true;
        } catch (FileNotFoundException e) {
            result = false;
        }
        Assert.assertFalse(result);

        Filex.createNewFileCheck(testFile);

        try {
            Premisex.requireExist(testFile);
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
            Premisex.requireIsDir(testDir);
            result = true;
        } catch (IllegalArgumentException e) {
            result = false;
        }
        Assert.assertFalse(result);

        // 文件
        Filex.createNewFileCheck(testDir);
        try {
            Premisex.requireIsDir(testDir);
            result = true;
        } catch (IllegalArgumentException e) {
            result = false;
        }
        Assert.assertFalse(result);

        // 目录
        Filex.deleteRecursively(testDir);
        Filex.mkdirsCheck(testDir);
        try {
            Premisex.requireIsDir(testDir);
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
            Premisex.requireIsFile(testFile);
            result = true;
        } catch (IllegalArgumentException e) {
            result = false;
        }
        Assert.assertFalse(result);

        // 目录
        Filex.mkdirsCheck(testFile);
        try {
            Premisex.requireIsFile(testFile);
            result = true;
        } catch (IllegalArgumentException e) {
            result = false;
        }
        Assert.assertFalse(result);

        // 文件
        Filex.deleteRecursively(testFile);
        Filex.createNewFileCheck(testFile);
        try {
            Premisex.requireIsFile(testFile);
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

    @Test
    public void testList() throws UnableCreateFileException, UnableCreateDirException {
        File testDir = new File("/tmp/testList");

        File testFile11 = new File(testDir, "dir1/file1");
        File testFile12 = new File(testDir, "dir1/file2");
        File testFile13 = new File(testDir, "dir1/file3");

        File testFile21 = new File(testDir, "dir2/file1");
        File testFile22 = new File(testDir, "dir2/file2");
        File testFile23 = new File(testDir, "dir2/file3");

        File testFile31 = new File(testDir, "dir3/file1");
        File testFile32 = new File(testDir, "dir3/file2");
        File testFile33 = new File(testDir, "dir3/file3");

        File testFile4 = new File(testDir, "file4");
        File testFile5 = new File(testDir, "file5");
        File testFile6 = new File(testDir, "file6");

        Filex.createNewFileOrThrow(testFile11);
        Filex.createNewFileOrThrow(testFile12);
        Filex.createNewFileOrThrow(testFile13);
        Filex.createNewFileOrThrow(testFile21);
        Filex.createNewFileOrThrow(testFile22);
        Filex.createNewFileOrThrow(testFile23);
        Filex.createNewFileOrThrow(testFile31);
        Filex.createNewFileOrThrow(testFile32);
        Filex.createNewFileOrThrow(testFile33);
        Filex.createNewFileOrThrow(testFile4);
        Filex.createNewFileOrThrow(testFile5);
        Filex.createNewFileOrThrow(testFile6);

        String[] childPaths = Filex.listRecursively(testDir);
        Assert.assertEquals(childPaths != null ? childPaths.length : 0, 15);

        File[] childFiles = Filex.listFilesRecursively(testDir);
        Assert.assertEquals(childFiles != null ? childFiles.length : 0, 15);

        File[] childFiles2 = Filex.listFilesRecursively(testDir, new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile();
            }
        });
        Assert.assertEquals(childFiles2 != null ? childFiles2.length : 0, 12);

        File[] childFiles3 = Filex.listFilesRecursively(testDir, new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return dir.isFile() && name.endsWith("2");
            }
        });
        Assert.assertEquals(childFiles3 != null ? childFiles3.length : 0, 3);

        Filex.deleteRecursively(testDir);
    }
}