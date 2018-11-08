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
import me.panpf.javax.util.*;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipxTest {

    @Test
    public void testFilesTo() throws IOException {
        final File dir1 = new File("/tmp/testFilesTo1");
        try {
            final File sourceDir = Filex.createFileTree(new File(dir1, "test"), 3, 2, "file.txt", "testFilesTo");
            String sourceContents = Collectionx.joinToString(Arrayx.filter(Filex.listFilesRecursively(sourceDir), new Filex.FilePredicate()), "\n", new FileContentTransformer());

            File compressDstFile = Zipx.getCompressDstFile(sourceDir);
            ZipProgressListener compressProgressListener = new ZipProgressListener();
            Zipx.compressFilesTo(sourceDir.listFiles(), compressDstFile, Zipx.ZipEntryNameTransformer.createByParent(sourceDir), compressProgressListener);
            Assert.assertEquals(Collectionx.joinToArrayString(Collectionx.sortedWith(Zipx.listEntryName(compressDstFile), new Filex.FilePathComparator())), "[test/file1.txt, test/file2.txt, test/file3.txt, test/dir1/file1.txt, test/dir1/file2.txt, test/dir1/file3.txt, test/dir2/file1.txt, test/dir2/file2.txt, test/dir2/file3.txt, test/dir3/file1.txt, test/dir3/file2.txt, test/dir3/file3.txt]");
            Assert.assertEquals(compressProgressListener.getLog(), "[EntryStart: test/dir1/file1.txt, 15/180->test/dir1/file1.txt: 15/15, EntryEnd: test/dir1/file1.txt, EntryStart: test/dir1/file3.txt, 30/180->test/dir1/file3.txt: 15/15, EntryEnd: test/dir1/file3.txt, EntryStart: test/dir1/file2.txt, 45/180->test/dir1/file2.txt: 15/15, EntryEnd: test/dir1/file2.txt, EntryStart: test/dir3/file1.txt, 60/180->test/dir3/file1.txt: 15/15, EntryEnd: test/dir3/file1.txt, EntryStart: test/dir3/file3.txt, 75/180->test/dir3/file3.txt: 15/15, EntryEnd: test/dir3/file3.txt, EntryStart: test/dir3/file2.txt, 90/180->test/dir3/file2.txt: 15/15, EntryEnd: test/dir3/file2.txt, EntryStart: test/dir2/file1.txt, 105/180->test/dir2/file1.txt: 15/15, EntryEnd: test/dir2/file1.txt, EntryStart: test/dir2/file3.txt, 120/180->test/dir2/file3.txt: 15/15, EntryEnd: test/dir2/file3.txt, EntryStart: test/dir2/file2.txt, 135/180->test/dir2/file2.txt: 15/15, EntryEnd: test/dir2/file2.txt, EntryStart: test/file1.txt, 150/180->test/file1.txt: 15/15, EntryEnd: test/file1.txt, EntryStart: test/file3.txt, 165/180->test/file3.txt: 15/15, EntryEnd: test/file3.txt, EntryStart: test/file2.txt, 180/180->test/file2.txt: 15/15, EntryEnd: test/file2.txt]");

            Filex.deleteRecursively(sourceDir);
            File decompressDstDir = new File(compressDstFile.getParentFile(), Filex.getNameWithoutExtension(compressDstFile) + "1");
            ZipProgressListener decompressProgressListener = new ZipProgressListener();
            Zipx.decompressTo(compressDstFile, decompressDstDir, decompressProgressListener);
            Assert.assertEquals(decompressProgressListener.getLog(), "[EntryStart: test/dir1/file1.txt, 15/180->test/dir1/file1.txt: 15/15, EntryEnd: test/dir1/file1.txt, EntryStart: test/dir1/file3.txt, 30/180->test/dir1/file3.txt: 15/15, EntryEnd: test/dir1/file3.txt, EntryStart: test/dir1/file2.txt, 45/180->test/dir1/file2.txt: 15/15, EntryEnd: test/dir1/file2.txt, EntryStart: test/dir3/file1.txt, 60/180->test/dir3/file1.txt: 15/15, EntryEnd: test/dir3/file1.txt, EntryStart: test/dir3/file3.txt, 75/180->test/dir3/file3.txt: 15/15, EntryEnd: test/dir3/file3.txt, EntryStart: test/dir3/file2.txt, 90/180->test/dir3/file2.txt: 15/15, EntryEnd: test/dir3/file2.txt, EntryStart: test/dir2/file1.txt, 105/180->test/dir2/file1.txt: 15/15, EntryEnd: test/dir2/file1.txt, EntryStart: test/dir2/file3.txt, 120/180->test/dir2/file3.txt: 15/15, EntryEnd: test/dir2/file3.txt, EntryStart: test/dir2/file2.txt, 135/180->test/dir2/file2.txt: 15/15, EntryEnd: test/dir2/file2.txt, EntryStart: test/file1.txt, 150/180->test/file1.txt: 15/15, EntryEnd: test/file1.txt, EntryStart: test/file3.txt, 165/180->test/file3.txt: 15/15, EntryEnd: test/file3.txt, EntryStart: test/file2.txt, 180/180->test/file2.txt: 15/15, EntryEnd: test/file2.txt]");

            Filex.deleteRecursively(compressDstFile);
            String decompressContents = Collectionx.joinToString(Arrayx.filter(Filex.listFilesRecursively(decompressDstDir), new Filex.FilePredicate()), "\n", new FileContentTransformer());
            Assert.assertEquals(sourceContents, decompressContents);
        } finally {
            Filex.deleteRecursively(dir1);
        }

        final File dir2 = new File("/tmp/testFilesTo2");
        try {
            final File sourceDir = Filex.createFileTree(new File(dir2, "test"), 3, 2, "file.txt", "testFilesTo");
            String sourceContents = Collectionx.joinToString(Arrayx.filter(Filex.listFilesRecursively(sourceDir), new Filex.FilePredicate()), "\n", new FileContentTransformer());

            File compressDstFile = Zipx.getCompressDstFile(sourceDir);
            Zipx.compressFilesTo(sourceDir.listFiles(), compressDstFile, Zipx.ZipEntryNameTransformer.createByParent(sourceDir));
            Assert.assertEquals(Collectionx.joinToArrayString(Collectionx.sortedWith(Zipx.listEntryName(compressDstFile), new Filex.FilePathComparator())), "[test/file1.txt, test/file2.txt, test/file3.txt, test/dir1/file1.txt, test/dir1/file2.txt, test/dir1/file3.txt, test/dir2/file1.txt, test/dir2/file2.txt, test/dir2/file3.txt, test/dir3/file1.txt, test/dir3/file2.txt, test/dir3/file3.txt]");

            Filex.deleteRecursively(sourceDir);
            File decompressDstDir = new File(compressDstFile.getParentFile(), Filex.getNameWithoutExtension(compressDstFile) + "1");
            Zipx.decompressTo(compressDstFile, decompressDstDir);

            Filex.deleteRecursively(compressDstFile);
            String decompressContents = Collectionx.joinToString(Arrayx.filter(Filex.listFilesRecursively(decompressDstDir), new Filex.FilePredicate()), "\n", new FileContentTransformer());
            Assert.assertEquals(sourceContents, decompressContents);
        } finally {
            Filex.deleteRecursively(dir2);
        }
    }

    @Test
    public void testFileTo() throws IOException {
        final File dir1 = new File("/tmp/testFileTo1");
        try {
            final File sourceDir = Filex.createFileTree(new File(dir1, "test"), 3, 2, "file.txt", "testFilesTo");
            String sourceContents = Collectionx.joinToString(Arrayx.filter(Filex.listFilesRecursively(sourceDir), new Filex.FilePredicate()), "\n", new FileContentTransformer());

            File compressDstFile = Zipx.getCompressDstFile(sourceDir);
            ZipProgressListener compressProgressListener = new ZipProgressListener();
            Zipx.compressFileTo(sourceDir, compressDstFile, compressProgressListener);
            Assert.assertEquals(Collectionx.joinToArrayString(Collectionx.sortedWith(Zipx.listEntryName(compressDstFile), new Filex.FilePathComparator())), "[test/file1.txt, test/file2.txt, test/file3.txt, test/dir1/file1.txt, test/dir1/file2.txt, test/dir1/file3.txt, test/dir2/file1.txt, test/dir2/file2.txt, test/dir2/file3.txt, test/dir3/file1.txt, test/dir3/file2.txt, test/dir3/file3.txt]");
            Assert.assertEquals(compressProgressListener.getLog(), "[EntryStart: test/dir1/file1.txt, 15/180->test/dir1/file1.txt: 15/15, EntryEnd: test/dir1/file1.txt, EntryStart: test/dir1/file3.txt, 30/180->test/dir1/file3.txt: 15/15, EntryEnd: test/dir1/file3.txt, EntryStart: test/dir1/file2.txt, 45/180->test/dir1/file2.txt: 15/15, EntryEnd: test/dir1/file2.txt, EntryStart: test/dir3/file1.txt, 60/180->test/dir3/file1.txt: 15/15, EntryEnd: test/dir3/file1.txt, EntryStart: test/dir3/file3.txt, 75/180->test/dir3/file3.txt: 15/15, EntryEnd: test/dir3/file3.txt, EntryStart: test/dir3/file2.txt, 90/180->test/dir3/file2.txt: 15/15, EntryEnd: test/dir3/file2.txt, EntryStart: test/dir2/file1.txt, 105/180->test/dir2/file1.txt: 15/15, EntryEnd: test/dir2/file1.txt, EntryStart: test/dir2/file3.txt, 120/180->test/dir2/file3.txt: 15/15, EntryEnd: test/dir2/file3.txt, EntryStart: test/dir2/file2.txt, 135/180->test/dir2/file2.txt: 15/15, EntryEnd: test/dir2/file2.txt, EntryStart: test/file1.txt, 150/180->test/file1.txt: 15/15, EntryEnd: test/file1.txt, EntryStart: test/file3.txt, 165/180->test/file3.txt: 15/15, EntryEnd: test/file3.txt, EntryStart: test/file2.txt, 180/180->test/file2.txt: 15/15, EntryEnd: test/file2.txt]");

            Filex.deleteRecursively(sourceDir);
            File decompressDstDir = new File(compressDstFile.getParentFile(), Filex.getNameWithoutExtension(compressDstFile) + "1");
            ZipProgressListener decompressProgressListener = new ZipProgressListener();
            Zipx.decompressTo(compressDstFile, decompressDstDir, decompressProgressListener);
            Assert.assertEquals(decompressProgressListener.getLog(), "[EntryStart: test/dir1/file1.txt, 15/180->test/dir1/file1.txt: 15/15, EntryEnd: test/dir1/file1.txt, EntryStart: test/dir1/file3.txt, 30/180->test/dir1/file3.txt: 15/15, EntryEnd: test/dir1/file3.txt, EntryStart: test/dir1/file2.txt, 45/180->test/dir1/file2.txt: 15/15, EntryEnd: test/dir1/file2.txt, EntryStart: test/dir3/file1.txt, 60/180->test/dir3/file1.txt: 15/15, EntryEnd: test/dir3/file1.txt, EntryStart: test/dir3/file3.txt, 75/180->test/dir3/file3.txt: 15/15, EntryEnd: test/dir3/file3.txt, EntryStart: test/dir3/file2.txt, 90/180->test/dir3/file2.txt: 15/15, EntryEnd: test/dir3/file2.txt, EntryStart: test/dir2/file1.txt, 105/180->test/dir2/file1.txt: 15/15, EntryEnd: test/dir2/file1.txt, EntryStart: test/dir2/file3.txt, 120/180->test/dir2/file3.txt: 15/15, EntryEnd: test/dir2/file3.txt, EntryStart: test/dir2/file2.txt, 135/180->test/dir2/file2.txt: 15/15, EntryEnd: test/dir2/file2.txt, EntryStart: test/file1.txt, 150/180->test/file1.txt: 15/15, EntryEnd: test/file1.txt, EntryStart: test/file3.txt, 165/180->test/file3.txt: 15/15, EntryEnd: test/file3.txt, EntryStart: test/file2.txt, 180/180->test/file2.txt: 15/15, EntryEnd: test/file2.txt]");

            Filex.deleteRecursively(compressDstFile);
            String decompressContents = Collectionx.joinToString(Arrayx.filter(Filex.listFilesRecursively(decompressDstDir), new Filex.FilePredicate()), "\n", new FileContentTransformer());
            Assert.assertEquals(sourceContents, decompressContents);
        } finally {
            Filex.deleteRecursively(dir1);
        }

        final File file2 = new File("/tmp/testFileTo2/file.txt");
        try {
            Filex.writeText(Filex.createNewFileOrThrow(file2), "testFilesTo");
            String sourceMd5 = Digestx.getMD5(file2);

            File compressDstFile = Zipx.getCompressDstFile(file2);
            Zipx.compressFileTo(file2, compressDstFile);

            Filex.deleteRecursively(file2);
            File decompressDstDir = Zipx.getDecompressDstDir(compressDstFile);
            Zipx.decompressTo(compressDstFile, decompressDstDir);

            String decompressMd5 = Digestx.getMD5(new File(decompressDstDir, file2.getName()));
            Assert.assertEquals(sourceMd5, decompressMd5);
        } finally {
            Filex.deleteRecursively(file2.getParentFile());
        }
    }

    @Test
    public void testFile() throws IOException {
        final File dir1 = new File("/tmp/testFile1");
        try {
            final File sourceDir = Filex.createFileTree(new File(dir1, "test"), 3, 2, "file.txt", "testFilesTo");
            String sourceContents = Collectionx.joinToString(Arrayx.filter(Filex.listFilesRecursively(sourceDir), new Filex.FilePredicate()), "\n", new FileContentTransformer());

            ZipProgressListener compressProgressListener = new ZipProgressListener();
            File compressDstFile = Zipx.compressFile(sourceDir, compressProgressListener);
            Assert.assertEquals(Collectionx.joinToArrayString(Collectionx.sortedWith(Zipx.listEntryName(compressDstFile), new Filex.FilePathComparator())), "[test/file1.txt, test/file2.txt, test/file3.txt, test/dir1/file1.txt, test/dir1/file2.txt, test/dir1/file3.txt, test/dir2/file1.txt, test/dir2/file2.txt, test/dir2/file3.txt, test/dir3/file1.txt, test/dir3/file2.txt, test/dir3/file3.txt]");
            Assert.assertEquals(compressProgressListener.getLog(), "[EntryStart: test/dir1/file1.txt, 15/180->test/dir1/file1.txt: 15/15, EntryEnd: test/dir1/file1.txt, EntryStart: test/dir1/file3.txt, 30/180->test/dir1/file3.txt: 15/15, EntryEnd: test/dir1/file3.txt, EntryStart: test/dir1/file2.txt, 45/180->test/dir1/file2.txt: 15/15, EntryEnd: test/dir1/file2.txt, EntryStart: test/dir3/file1.txt, 60/180->test/dir3/file1.txt: 15/15, EntryEnd: test/dir3/file1.txt, EntryStart: test/dir3/file3.txt, 75/180->test/dir3/file3.txt: 15/15, EntryEnd: test/dir3/file3.txt, EntryStart: test/dir3/file2.txt, 90/180->test/dir3/file2.txt: 15/15, EntryEnd: test/dir3/file2.txt, EntryStart: test/dir2/file1.txt, 105/180->test/dir2/file1.txt: 15/15, EntryEnd: test/dir2/file1.txt, EntryStart: test/dir2/file3.txt, 120/180->test/dir2/file3.txt: 15/15, EntryEnd: test/dir2/file3.txt, EntryStart: test/dir2/file2.txt, 135/180->test/dir2/file2.txt: 15/15, EntryEnd: test/dir2/file2.txt, EntryStart: test/file1.txt, 150/180->test/file1.txt: 15/15, EntryEnd: test/file1.txt, EntryStart: test/file3.txt, 165/180->test/file3.txt: 15/15, EntryEnd: test/file3.txt, EntryStart: test/file2.txt, 180/180->test/file2.txt: 15/15, EntryEnd: test/file2.txt]");

            Filex.deleteRecursively(sourceDir);
            ZipProgressListener decompressProgressListener = new ZipProgressListener();
            File decompressDstDir = Zipx.decompress(compressDstFile, decompressProgressListener);
            Assert.assertEquals(decompressProgressListener.getLog(), "[EntryStart: test/dir1/file1.txt, 15/180->test/dir1/file1.txt: 15/15, EntryEnd: test/dir1/file1.txt, EntryStart: test/dir1/file3.txt, 30/180->test/dir1/file3.txt: 15/15, EntryEnd: test/dir1/file3.txt, EntryStart: test/dir1/file2.txt, 45/180->test/dir1/file2.txt: 15/15, EntryEnd: test/dir1/file2.txt, EntryStart: test/dir3/file1.txt, 60/180->test/dir3/file1.txt: 15/15, EntryEnd: test/dir3/file1.txt, EntryStart: test/dir3/file3.txt, 75/180->test/dir3/file3.txt: 15/15, EntryEnd: test/dir3/file3.txt, EntryStart: test/dir3/file2.txt, 90/180->test/dir3/file2.txt: 15/15, EntryEnd: test/dir3/file2.txt, EntryStart: test/dir2/file1.txt, 105/180->test/dir2/file1.txt: 15/15, EntryEnd: test/dir2/file1.txt, EntryStart: test/dir2/file3.txt, 120/180->test/dir2/file3.txt: 15/15, EntryEnd: test/dir2/file3.txt, EntryStart: test/dir2/file2.txt, 135/180->test/dir2/file2.txt: 15/15, EntryEnd: test/dir2/file2.txt, EntryStart: test/file1.txt, 150/180->test/file1.txt: 15/15, EntryEnd: test/file1.txt, EntryStart: test/file3.txt, 165/180->test/file3.txt: 15/15, EntryEnd: test/file3.txt, EntryStart: test/file2.txt, 180/180->test/file2.txt: 15/15, EntryEnd: test/file2.txt]");

            Filex.deleteRecursively(compressDstFile);
            String decompressContents = Collectionx.joinToString(Arrayx.filter(Filex.listFilesRecursively(decompressDstDir), new Filex.FilePredicate()), "\n", new FileContentTransformer());
            Assert.assertEquals(sourceContents, decompressContents);
        } finally {
            Filex.deleteRecursively(dir1);
        }

        final File file2 = new File("/tmp/testFile2/file.txt");
        try {
            Filex.writeText(Filex.createNewFileOrThrow(file2), "testFilesTo");
            String sourceMd5 = Digestx.getMD5(file2);

            File compressDstFile = Zipx.compressFile(file2);

            Filex.deleteRecursively(file2);
            File decompressDstDir = Zipx.decompress(compressDstFile);

            String decompressMd5 = Digestx.getMD5(new File(decompressDstDir, file2.getName()));
            Assert.assertEquals(sourceMd5, decompressMd5);
        } finally {
            Filex.deleteRecursively(file2.getParentFile());
        }
    }

    @Test
    public void testChildFileTo() throws IOException {
        final File dir1 = new File("/tmp/testChildFileTo1");
        try {
            final File sourceDir = Filex.createFileTree(new File(dir1, "test"), 3, 2, "file.txt", "testChildFileTo");
            String sourceContents = Collectionx.joinToString(Arrayx.filter(Filex.listFilesRecursively(sourceDir), new Filex.FilePredicate()), "\n", new FileContentTransformer());

            File compressDstFile = Zipx.getCompressDstFile(sourceDir);
            ZipProgressListener compressProgressListener = new ZipProgressListener();
            Zipx.compressChildFileTo(sourceDir, compressDstFile, compressProgressListener);
            Assert.assertEquals(Collectionx.joinToArrayString(Collectionx.sortedWith(Zipx.listEntryName(compressDstFile), new Filex.FilePathComparator())), "[file1.txt, file2.txt, file3.txt, dir1/file1.txt, dir1/file2.txt, dir1/file3.txt, dir2/file1.txt, dir2/file2.txt, dir2/file3.txt, dir3/file1.txt, dir3/file2.txt, dir3/file3.txt]");
            Assert.assertEquals(compressProgressListener.getLog(), "[EntryStart: dir1/file1.txt, 19/228->dir1/file1.txt: 19/19, EntryEnd: dir1/file1.txt, EntryStart: dir1/file3.txt, 38/228->dir1/file3.txt: 19/19, EntryEnd: dir1/file3.txt, EntryStart: dir1/file2.txt, 57/228->dir1/file2.txt: 19/19, EntryEnd: dir1/file2.txt, EntryStart: dir3/file1.txt, 76/228->dir3/file1.txt: 19/19, EntryEnd: dir3/file1.txt, EntryStart: dir3/file3.txt, 95/228->dir3/file3.txt: 19/19, EntryEnd: dir3/file3.txt, EntryStart: dir3/file2.txt, 114/228->dir3/file2.txt: 19/19, EntryEnd: dir3/file2.txt, EntryStart: dir2/file1.txt, 133/228->dir2/file1.txt: 19/19, EntryEnd: dir2/file1.txt, EntryStart: dir2/file3.txt, 152/228->dir2/file3.txt: 19/19, EntryEnd: dir2/file3.txt, EntryStart: dir2/file2.txt, 171/228->dir2/file2.txt: 19/19, EntryEnd: dir2/file2.txt, EntryStart: file1.txt, 190/228->file1.txt: 19/19, EntryEnd: file1.txt, EntryStart: file3.txt, 209/228->file3.txt: 19/19, EntryEnd: file3.txt, EntryStart: file2.txt, 228/228->file2.txt: 19/19, EntryEnd: file2.txt]");

            Filex.deleteRecursively(sourceDir);
            File decompressDstDir = new File(compressDstFile.getParentFile(), Filex.getNameWithoutExtension(compressDstFile) + "1");
            ZipProgressListener decompressProgressListener = new ZipProgressListener();
            Zipx.decompressTo(compressDstFile, decompressDstDir, decompressProgressListener);
            Assert.assertEquals(decompressProgressListener.getLog(), "[EntryStart: dir1/file1.txt, 19/228->dir1/file1.txt: 19/19, EntryEnd: dir1/file1.txt, EntryStart: dir1/file3.txt, 38/228->dir1/file3.txt: 19/19, EntryEnd: dir1/file3.txt, EntryStart: dir1/file2.txt, 57/228->dir1/file2.txt: 19/19, EntryEnd: dir1/file2.txt, EntryStart: dir3/file1.txt, 76/228->dir3/file1.txt: 19/19, EntryEnd: dir3/file1.txt, EntryStart: dir3/file3.txt, 95/228->dir3/file3.txt: 19/19, EntryEnd: dir3/file3.txt, EntryStart: dir3/file2.txt, 114/228->dir3/file2.txt: 19/19, EntryEnd: dir3/file2.txt, EntryStart: dir2/file1.txt, 133/228->dir2/file1.txt: 19/19, EntryEnd: dir2/file1.txt, EntryStart: dir2/file3.txt, 152/228->dir2/file3.txt: 19/19, EntryEnd: dir2/file3.txt, EntryStart: dir2/file2.txt, 171/228->dir2/file2.txt: 19/19, EntryEnd: dir2/file2.txt, EntryStart: file1.txt, 190/228->file1.txt: 19/19, EntryEnd: file1.txt, EntryStart: file3.txt, 209/228->file3.txt: 19/19, EntryEnd: file3.txt, EntryStart: file2.txt, 228/228->file2.txt: 19/19, EntryEnd: file2.txt]");

            Filex.deleteRecursively(compressDstFile);
            String decompressContents = Collectionx.joinToString(Arrayx.filter(Filex.listFilesRecursively(decompressDstDir), new Filex.FilePredicate()), "\n", new FileContentTransformer());
            Assert.assertEquals(sourceContents, decompressContents);
        } finally {
            Filex.deleteRecursively(dir1);
        }

        final File file2 = new File("/tmp/testChildFileTo2/file.txt");
        try {
            Filex.writeText(Filex.createNewFileOrThrow(file2), "testChildFileTo");
            String sourceMd5 = Digestx.getMD5(file2);

            File compressDstFile = Zipx.getCompressDstFile(file2);
            Zipx.compressChildFileTo(file2, compressDstFile);

            Filex.deleteRecursively(file2);
            File decompressDstDir = Zipx.getDecompressDstDir(compressDstFile);
            Zipx.decompressTo(compressDstFile, decompressDstDir);

            String decompressMd5 = Digestx.getMD5(new File(decompressDstDir, file2.getName()));
            Assert.assertEquals(sourceMd5, decompressMd5);
        } finally {
            Filex.deleteRecursively(file2.getParentFile());
        }
    }

    @Test
    public void testChildFile() throws IOException {
        final File dir1 = new File("/tmp/testChildFile1");
        try {
            final File sourceDir = Filex.createFileTree(new File(dir1, "test"), 3, 2, "file.txt", "testChildFile");
            String sourceContents = Collectionx.joinToString(Arrayx.filter(Filex.listFilesRecursively(sourceDir), new Filex.FilePredicate()), "\n", new FileContentTransformer());

            ZipProgressListener compressProgressListener = new ZipProgressListener();
            File compressDstFile = Zipx.compressChildFile(sourceDir, compressProgressListener);
            Assert.assertEquals(Collectionx.joinToArrayString(Collectionx.sortedWith(Zipx.listEntryName(compressDstFile), new Filex.FilePathComparator())), "[file1.txt, file2.txt, file3.txt, dir1/file1.txt, dir1/file2.txt, dir1/file3.txt, dir2/file1.txt, dir2/file2.txt, dir2/file3.txt, dir3/file1.txt, dir3/file2.txt, dir3/file3.txt]");
            Assert.assertEquals(compressProgressListener.getLog(), "[EntryStart: dir1/file1.txt, 17/204->dir1/file1.txt: 17/17, EntryEnd: dir1/file1.txt, EntryStart: dir1/file3.txt, 34/204->dir1/file3.txt: 17/17, EntryEnd: dir1/file3.txt, EntryStart: dir1/file2.txt, 51/204->dir1/file2.txt: 17/17, EntryEnd: dir1/file2.txt, EntryStart: dir3/file1.txt, 68/204->dir3/file1.txt: 17/17, EntryEnd: dir3/file1.txt, EntryStart: dir3/file3.txt, 85/204->dir3/file3.txt: 17/17, EntryEnd: dir3/file3.txt, EntryStart: dir3/file2.txt, 102/204->dir3/file2.txt: 17/17, EntryEnd: dir3/file2.txt, EntryStart: dir2/file1.txt, 119/204->dir2/file1.txt: 17/17, EntryEnd: dir2/file1.txt, EntryStart: dir2/file3.txt, 136/204->dir2/file3.txt: 17/17, EntryEnd: dir2/file3.txt, EntryStart: dir2/file2.txt, 153/204->dir2/file2.txt: 17/17, EntryEnd: dir2/file2.txt, EntryStart: file1.txt, 170/204->file1.txt: 17/17, EntryEnd: file1.txt, EntryStart: file3.txt, 187/204->file3.txt: 17/17, EntryEnd: file3.txt, EntryStart: file2.txt, 204/204->file2.txt: 17/17, EntryEnd: file2.txt]");

            Filex.deleteRecursively(sourceDir);
            ZipProgressListener decompressProgressListener = new ZipProgressListener();
            File decompressDstDir = Zipx.decompress(compressDstFile, decompressProgressListener);
            Assert.assertEquals(decompressProgressListener.getLog(), "[EntryStart: dir1/file1.txt, 17/204->dir1/file1.txt: 17/17, EntryEnd: dir1/file1.txt, EntryStart: dir1/file3.txt, 34/204->dir1/file3.txt: 17/17, EntryEnd: dir1/file3.txt, EntryStart: dir1/file2.txt, 51/204->dir1/file2.txt: 17/17, EntryEnd: dir1/file2.txt, EntryStart: dir3/file1.txt, 68/204->dir3/file1.txt: 17/17, EntryEnd: dir3/file1.txt, EntryStart: dir3/file3.txt, 85/204->dir3/file3.txt: 17/17, EntryEnd: dir3/file3.txt, EntryStart: dir3/file2.txt, 102/204->dir3/file2.txt: 17/17, EntryEnd: dir3/file2.txt, EntryStart: dir2/file1.txt, 119/204->dir2/file1.txt: 17/17, EntryEnd: dir2/file1.txt, EntryStart: dir2/file3.txt, 136/204->dir2/file3.txt: 17/17, EntryEnd: dir2/file3.txt, EntryStart: dir2/file2.txt, 153/204->dir2/file2.txt: 17/17, EntryEnd: dir2/file2.txt, EntryStart: file1.txt, 170/204->file1.txt: 17/17, EntryEnd: file1.txt, EntryStart: file3.txt, 187/204->file3.txt: 17/17, EntryEnd: file3.txt, EntryStart: file2.txt, 204/204->file2.txt: 17/17, EntryEnd: file2.txt]");

            Filex.deleteRecursively(compressDstFile);
            String decompressContents = Collectionx.joinToString(Arrayx.filter(Filex.listFilesRecursively(decompressDstDir), new Filex.FilePredicate()), "\n", new FileContentTransformer());
            Assert.assertEquals(sourceContents, decompressContents);
        } finally {
            Filex.deleteRecursively(dir1);
        }

        final File file2 = new File("/tmp/testChildFile2/file.txt");
        try {
            Filex.writeText(Filex.createNewFileOrThrow(file2), "testChildFile");
            String sourceMd5 = Digestx.getMD5(file2);

            File compressDstFile = Zipx.compressChildFile(file2);

            Filex.deleteRecursively(file2);
            File decompressDstDir = Zipx.decompress(compressDstFile);

            String decompressMd5 = Digestx.getMD5(new File(decompressDstDir, file2.getName()));
            Assert.assertEquals(sourceMd5, decompressMd5);
        } finally {
            Filex.deleteRecursively(file2.getParentFile());
        }
    }

    @Test
    public void testGetCompressDstFile() {
        Assert.assertEquals("/tmp/testGetCompressDstFile.txt.zip", Zipx.getCompressDstFile(new File("/tmp/testGetCompressDstFile.txt")).getPath());
    }

    @Test
    public void testGetDecompressDstFile() {
        Assert.assertEquals("/tmp", Zipx.getDecompressDstDir(new File("/tmp/testGetCompressDstFile.zip")).getPath());
    }

    @Test
    public void testTrueSize() throws IOException {
        final File dir1 = Filex.createFileTree(new File("/tmp/testTrueSize/test"), 3, 2, "file.txt", "testTrueSize");
        try {
            File compressDstFile = Zipx.compressFile(dir1);
            try {
                Assert.assertEquals(192, Zipx.getTrueSize(compressDstFile));
                try (ZipFile zipFile = new ZipFile(compressDstFile)) {
                    Assert.assertEquals(192, Zipx.getTrueSize(zipFile));
                }
            } finally {
                Filex.deleteRecursively(compressDstFile);
            }
        } finally {
            Filex.deleteRecursively(dir1.getParentFile());
        }
    }

    @Test
    public void testListEntry() throws IOException {
        final File dir1 = Filex.createFileTree(new File("/tmp/testListEntry/test"), 3, 2, "file.txt", "testListEntry");
        try {
            File compressDstFile = Zipx.compressFile(dir1);
            Assert.assertEquals(Collectionx.joinToArrayString(Collectionx.sortedWith(Collectionx.map(Zipx.listEntry(compressDstFile), new Transformer<ZipEntry, String>() {
                @NotNull
                @Override
                public String transform(@NotNull ZipEntry zipEntry) {
                    return zipEntry.getName();
                }
            }), new Filex.FilePathComparator())), "[test/file1.txt, test/file2.txt, test/file3.txt, test/dir1/file1.txt, test/dir1/file2.txt, test/dir1/file3.txt, test/dir2/file1.txt, test/dir2/file2.txt, test/dir2/file3.txt, test/dir3/file1.txt, test/dir3/file2.txt, test/dir3/file3.txt]");

            Assert.assertEquals(Collectionx.joinToArrayString(Collectionx.sortedWith(Collectionx.map(Zipx.listEntry(new ZipFile(compressDstFile)), new Transformer<ZipEntry, String>() {
                @NotNull
                @Override
                public String transform(@NotNull ZipEntry zipEntry) {
                    return zipEntry.getName();
                }
            }), new Filex.FilePathComparator())), "[test/file1.txt, test/file2.txt, test/file3.txt, test/dir1/file1.txt, test/dir1/file2.txt, test/dir1/file3.txt, test/dir2/file1.txt, test/dir2/file2.txt, test/dir2/file3.txt, test/dir3/file1.txt, test/dir3/file2.txt, test/dir3/file3.txt]");
        } finally {
            Filex.deleteRecursively(dir1.getParentFile());
        }
    }

    @Test
    public void testLisEntryName() throws IOException {
        final File dir1 = Filex.createFileTree(new File("/tmp/testLisEntryName/test"), 3, 2, "file.txt", "testListEntry");
        try {
            File compressDstFile = Zipx.compressFile(dir1);
            Assert.assertEquals(Collectionx.joinToArrayString(Collectionx.sortedWith(Zipx.listEntryName(compressDstFile), new Filex.FilePathComparator())), "[test/file1.txt, test/file2.txt, test/file3.txt, test/dir1/file1.txt, test/dir1/file2.txt, test/dir1/file3.txt, test/dir2/file1.txt, test/dir2/file2.txt, test/dir2/file3.txt, test/dir3/file1.txt, test/dir3/file2.txt, test/dir3/file3.txt]");

            Assert.assertEquals(Collectionx.joinToArrayString(Collectionx.sortedWith(Zipx.listEntryName(new ZipFile(compressDstFile)), new Filex.FilePathComparator())), "[test/file1.txt, test/file2.txt, test/file3.txt, test/dir1/file1.txt, test/dir1/file2.txt, test/dir1/file3.txt, test/dir2/file1.txt, test/dir2/file2.txt, test/dir2/file3.txt, test/dir3/file1.txt, test/dir3/file2.txt, test/dir3/file3.txt]");
        } finally {
            Filex.deleteRecursively(dir1.getParentFile());
        }
    }

    @Test
    public void testSize() throws IOException {
        final File dir1 = Filex.createFileTree(new File("/tmp/testSize/test"), 3, 2, "file.txt", "testListEntry");
        try {
            File compressDstFile = Zipx.compressFile(dir1);
            Assert.assertEquals(12, Zipx.size(compressDstFile));
        } finally {
            Filex.deleteRecursively(dir1.getParentFile());
        }
    }

    private static class ZipProgressListener implements ZipListener {
        private final List<String> progress = new ArrayList<>();

        @Override
        public void onEntryStart(@NotNull ZipEntry zipEntry) {
            progress.add("EntryStart: " + zipEntry.getName());
        }

        @Override
        public void onUpdateProgress(long totalLength, long completedLength, @NotNull ZipEntry zipEntry, long entryTotalLength, long entryCompletedLength) {
            progress.add(completedLength + "/" + totalLength + "->" + zipEntry.getName() + ": " + entryCompletedLength + "/" + entryTotalLength);
        }

        @Override
        public void onEntryEnd(@NotNull ZipEntry zipEntry) {
            progress.add("EntryEnd: " + zipEntry.getName());
        }

        String getLog() {
            return Collectionx.joinToArrayString(progress);
        }
    }

    private static class FileContentTransformer implements Transformer<File, CharSequence> {
        @NotNull
        @Override
        public CharSequence transform(@NotNull File file) {
            try {
                return Filex.readText(file);
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }
    }
}
