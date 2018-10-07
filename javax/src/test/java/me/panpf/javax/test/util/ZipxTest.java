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

public class ZipxTest {

    @Test
    public void testFilesTo() throws IOException {
        final File dir = new File("/tmp/testCompression");
        File compressDstFile = null;
        File decompressionDstDir = null;
        try {
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

            compressDstFile = Zipx.getCompressDstFile(dir);
            Zipx.compressFilesTo(Arrayx.arrayOf(dir), compressDstFile, new Transformer<File, String>() {
                @NotNull
                @Override
                public String transform(@NotNull File file) {
                    return file.getPath().replace(dir.getPath() + File.separator, "");
                }
            });

            File decompressDstDir = Zipx.getDecompressDstDir(compressDstFile);
            Filex.deleteRecursively(decompressDstDir);
            decompressionDstDir = Zipx.decompressTo(compressDstFile, decompressDstDir);

            Assert.assertEquals(Digestx.getMD5(file1), Digestx.getMD5(new File(decompressionDstDir, "file1")));
            Assert.assertEquals(Digestx.getMD5(file2), Digestx.getMD5(new File(decompressionDstDir, "file2")));
            Assert.assertEquals(Digestx.getMD5(file3), Digestx.getMD5(new File(decompressionDstDir, "file3")));
            Assert.assertEquals(Digestx.getMD5(file41), Digestx.getMD5(new File(decompressionDstDir, "dir4/file41")));
            Assert.assertEquals(Digestx.getMD5(file42), Digestx.getMD5(new File(decompressionDstDir, "dir4/file42")));
            Assert.assertEquals(Digestx.getMD5(file51), Digestx.getMD5(new File(decompressionDstDir, "dir5/file51")));
            Assert.assertEquals(Digestx.getMD5(file52), Digestx.getMD5(new File(decompressionDstDir, "dir5/file52")));
        } finally {
            Filex.deleteRecursively(dir);
            if (compressDstFile != null) Filex.deleteRecursively(compressDstFile);
            if (decompressionDstDir != null) Filex.deleteRecursively(decompressionDstDir);
        }
    }

    @Test
    public void testFileTo() throws IOException {
        File file1 = new File("/tmp/testCompression/file1.txt");
        File compress1File = null;
        File decompress1Dir = null;
        File decompress1File = null;
        try {
            Filex.writeText(Filex.createNewFileOrThrow(file1), "testFile1");

            compress1File = Zipx.compressFileTo(file1, new File(file1.getPath() + "1"));
            decompress1Dir = Zipx.decompressTo(compress1File, new File(compress1File.getParentFile().getPath() + "1"));
            decompress1File = new File(decompress1Dir, file1.getName());

            Assert.assertEquals(Digestx.getMD5(file1), Digestx.getMD5(decompress1File));
        } finally {
            Filex.deleteRecursively(file1);
            if (compress1File != null) Filex.deleteRecursively(compress1File);
            if (decompress1Dir != null) Filex.deleteRecursively(decompress1Dir);
            if (decompress1File != null) Filex.deleteRecursively(decompress1File);
        }
    }

    @Test
    public void testFile() throws IOException {
        File file2 = new File("/tmp/testCompression/file2.txt");
        File compress2File = null;
        File decompress2Dir = null;
        File decompress2File = null;
        try {
            Filex.writeText(Filex.createNewFileOrThrow(file2), "testFile2");
            String originMd5 = Digestx.getMD5(file2);

            compress2File = Zipx.compressFile(file2);
            Filex.deleteRecursively(file2);

            decompress2Dir = Zipx.decompress(compress2File);
            decompress2File = new File(decompress2Dir, file2.getName());

            Assert.assertEquals(originMd5, Digestx.getMD5(decompress2File));
        } finally {
            Filex.deleteRecursively(file2);
            if (compress2File != null) Filex.deleteRecursively(compress2File);
            if (decompress2Dir != null) Filex.deleteRecursively(decompress2Dir);
            if (decompress2File != null) Filex.deleteRecursively(decompress2File);
        }
    }

    @Test
    public void testCompressListener() throws IOException {
        File dir = new File("/tmp/testCompression");
        File dstFile = null;
        try {
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

            final List<String> progress = new ArrayList<>();
            dstFile = Zipx.compressDir(dir, new ZipListener() {
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
            });

            Assert.assertEquals(Collectionx.joinToArrayString(progress), "[EntryStart: file1, 9/67->file1: 9/9, EntryEnd: file1, EntryStart: dir4/file41, 19/67->dir4/file41: 10/10, EntryEnd: dir4/file41, EntryStart: dir4/file42, 29/67->dir4/file42: 10/10, EntryEnd: dir4/file42, EntryStart: dir5/file52, 39/67->dir5/file52: 10/10, EntryEnd: dir5/file52, EntryStart: dir5/file51, 49/67->dir5/file51: 10/10, EntryEnd: dir5/file51, EntryStart: file2, 58/67->file2: 9/9, EntryEnd: file2, EntryStart: file3, 67/67->file3: 9/9, EntryEnd: file3]");
        } finally {
            Filex.deleteRecursively(dir);
            if (dstFile != null) {
                Filex.deleteRecursively(dstFile);
            }
        }
    }

    @Test
    public void testDecompressListener() throws IOException {
        File dir = new File("/tmp/testCompression");
        File dstFile = null;
        File decompressionDstDir = null;
        try {
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

            dstFile = Zipx.compressDir(dir);

            Filex.deleteRecursively(Zipx.getDecompressDstDir(dstFile));

            final List<String> progress = new ArrayList<>();
            decompressionDstDir = Zipx.decompress(dstFile, new ZipListener() {
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
            });

            Assert.assertEquals(Collectionx.joinToArrayString(progress), "[EntryStart: file1, 9/67->file1: 9/9, EntryEnd: file1, EntryStart: dir4/file41, 19/67->dir4/file41: 10/10, EntryEnd: dir4/file41, EntryStart: dir4/file42, 29/67->dir4/file42: 10/10, EntryEnd: dir4/file42, EntryStart: dir5/file52, 39/67->dir5/file52: 10/10, EntryEnd: dir5/file52, EntryStart: dir5/file51, 49/67->dir5/file51: 10/10, EntryEnd: dir5/file51, EntryStart: file2, 58/67->file2: 9/9, EntryEnd: file2, EntryStart: file3, 67/67->file3: 9/9, EntryEnd: file3]");
        } finally {
            Filex.deleteRecursively(dir);
            if (dstFile != null) {
                Filex.deleteRecursively(dstFile);
            }
            if (decompressionDstDir != null) {
                Filex.deleteRecursively(decompressionDstDir);
            }
        }
    }
}
