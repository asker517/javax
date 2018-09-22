package me.panpf.javax.test.util;

import me.panpf.javax.io.Filex;
import me.panpf.javax.util.LazyValue;
import me.panpf.javax.util.Premisex;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

public class PremiseTest {

    @Test
    public void testRequireFileExist() {
        File testFile = new File("/tmp/testRequireFileExist");
        testFile.delete();

        boolean result;
        try {
            Premisex.requireFileExist(testFile);
            result = true;
        } catch (FileNotFoundException e) {
            result = false;
        }
        Assert.assertFalse(result);

        Filex.createNewFileCheck(testFile);

        try {
            Premisex.requireFileExist(testFile);
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
    public void testCheckInRange() {
        Premisex.checkInRange((byte) 2, (byte) 0, (byte) 5);
        try {
            Premisex.checkInRange((byte) -1, (byte) 0, (byte) 5);
            Assert.fail();
        } catch (Exception ignored) {
        }
        try {
            Premisex.checkInRange((byte) 6, (byte) 0, (byte) 5);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.checkInRange((short) 2, (short) 0, (short) 5);
        try {
            Premisex.checkInRange((short) -1, (short) 0, (short) 5);
            Assert.fail();
        } catch (Exception ignored) {
        }
        try {
            Premisex.checkInRange((short) 6, (short) 0, (short) 5);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.checkInRange(2, 0, 5);
        try {
            Premisex.checkInRange(-1, 0, 5);
            Assert.fail();
        } catch (Exception ignored) {
        }
        try {
            Premisex.checkInRange(6, 0, 5);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.checkInRange(2L, 0L, 5L);
        try {
            Premisex.checkInRange(-1L, 0L, 5L);
            Assert.fail();
        } catch (Exception ignored) {
        }
        try {
            Premisex.checkInRange(6L, 0L, 5L);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.checkInRange(2f, 0f, 5f);
        try {
            Premisex.checkInRange(-1f, 0f, 5f);
            Assert.fail();
        } catch (Exception ignored) {
        }
        try {
            Premisex.checkInRange(6f, 0f, 5f);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.checkInRange(2d, 0d, 5d);
        try {
            Premisex.checkInRange(-1d, 0d, 5d);
            Assert.fail();
        } catch (Exception ignored) {
        }
        try {
            Premisex.checkInRange(6d, 0d, 5d);
            Assert.fail();
        } catch (Exception ignored) {
        }
    }

    @Test
    public void testCheckNotInRange() {
        Premisex.checkNotInRange((byte) 6, (byte) 0, (byte) 5);
        Premisex.checkNotInRange((byte) -1, (byte) 0, (byte) 5);
        try {
            Premisex.checkNotInRange((byte) 2, (byte) 0, (byte) 5);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.checkNotInRange((short) 6, (short) 0, (short) 5);
        Premisex.checkNotInRange((short) -1, (short) 0, (short) 5);
        try {
            Premisex.checkNotInRange((short) 2, (short) 0, (short) 5);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.checkNotInRange(6, 0, 5);
        Premisex.checkNotInRange(-1, 0, 5);
        try {
            Premisex.checkNotInRange(2, 0, 5);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.checkNotInRange(6L, 0L, 5L);
        Premisex.checkNotInRange(-1L, 0L, 5L);
        try {
            Premisex.checkNotInRange(2L, 0L, 5L);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.checkNotInRange(6f, 0f, 5f);
        Premisex.checkNotInRange(-1f, 0f, 5f);
        try {
            Premisex.checkNotInRange(2f, 0f, 5f);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.checkNotInRange(6d, 0d, 5d);
        Premisex.checkNotInRange(-1d, 0d, 5d);
        try {
            Premisex.checkNotInRange(2d, 0d, 5d);
            Assert.fail();
        } catch (Exception ignored) {
        }
    }

    @Test
    public void testRequire() {
        Premisex.require(true);

        try {
            Premisex.require(false);
            Assert.fail();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Premisex.require(false, new LazyValue<String>() {
                @NotNull
                @Override
                public String get() {
                    return "is false";
                }
            });
            Assert.fail();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Premisex.require(true, new LazyValue<String>() {
                @NotNull
                @Override
                public String get() {
                    return "is true";
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRequireNotNull() {
        Premisex.requireNotNull("");

        try {
            Premisex.requireNotNull(null);
            Assert.fail();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Premisex.requireNotNull(null, new LazyValue<String>() {
                @NotNull
                @Override
                public String get() {
                    return "is null";
                }
            });
            Assert.fail();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Premisex.requireNotNull("", new LazyValue<String>() {
                @NotNull
                @Override
                public String get() {
                    return "is not null";
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
