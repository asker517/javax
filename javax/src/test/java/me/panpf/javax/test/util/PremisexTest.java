package me.panpf.javax.test.util;

import me.panpf.javax.io.Filex;
import me.panpf.javax.util.LazyValue;
import me.panpf.javax.util.Premisex;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

public class PremisexTest {

    @Test
    public void testRequire() {
        Premisex.require(true);

        try {
            Premisex.require(false);
            Assert.fail();
        } catch (Exception e) {
            // e.printStackTrace();
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
            // e.printStackTrace();
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
            // e.printStackTrace();
        }
    }

    @Test
    public void testCheck() {
        Premisex.check(true);

        try {
            Premisex.check(false);
            Assert.fail();
        } catch (Exception e) {
            // e.printStackTrace();
        }

        try {
            Premisex.check(false, new LazyValue<String>() {
                @NotNull
                @Override
                public String get() {
                    return "is false";
                }
            });
            Assert.fail();
        } catch (Exception e) {
            // e.printStackTrace();
        }

        try {
            Premisex.check(true, new LazyValue<String>() {
                @NotNull
                @Override
                public String get() {
                    return "is true";
                }
            });
        } catch (Exception e) {
            // e.printStackTrace();
        }
    }

    @Test
    public void testNotNull() {
        Premisex.requireNotNull("", new LazyValue<String>() {
            @NotNull
            @Override
            public String get() {
                return "is null";
            }
        });
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
            // e.printStackTrace();
        }
        Premisex.requireNotNull("");
        try {
            Premisex.requireNotNull(null);
            Assert.fail();
        } catch (Exception e) {
            // e.printStackTrace();
        }

        Premisex.requireNotNull("", "param");
        try {
            Premisex.requireNotNull(null, "param");
            Assert.fail();
        } catch (Exception e) {
            // e.printStackTrace();
        }


        Premisex.checkNotNull("", new LazyValue<String>() {
            @NotNull
            @Override
            public String get() {
                return "is null";
            }
        });
        try {
            Premisex.checkNotNull(null, new LazyValue<String>() {
                @NotNull
                @Override
                public String get() {
                    return "is null";
                }
            });
            Assert.fail();
        } catch (Exception e) {
            // e.printStackTrace();
        }
        Premisex.checkNotNull("");
        try {
            Premisex.checkNotNull(null);
            Assert.fail();
        } catch (Exception e) {
            // e.printStackTrace();
        }

        Premisex.checkNotNull("", "param");
        try {
            Premisex.checkNotNull(null, "param");
            Assert.fail();
        } catch (Exception e) {
            // e.printStackTrace();
        }
    }

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

        Filex.createNewFileOrCheck(testFile);

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
        Filex.createNewFileOrCheck(testDir);
        try {
            Premisex.requireIsDir(testDir);
            result = true;
        } catch (IllegalArgumentException e) {
            result = false;
        }
        Assert.assertFalse(result);

        // 目录
        Filex.deleteRecursively(testDir);
        Filex.mkdirsOrCheck(testDir);
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
        Filex.mkdirsOrCheck(testFile);
        try {
            Premisex.requireIsFile(testFile);
            result = true;
        } catch (IllegalArgumentException e) {
            result = false;
        }
        Assert.assertFalse(result);

        // 文件
        Filex.deleteRecursively(testFile);
        Filex.createNewFileOrCheck(testFile);
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
    public void testRequireInRange() {
        Premisex.requireInRange((byte) 2, (byte) 0, (byte) 5);
        try {
            Premisex.requireInRange((byte) -1, (byte) 0, (byte) 5);
            Assert.fail();
        } catch (Exception ignored) {
        }
        try {
            Premisex.requireInRange((byte) 6, (byte) 0, (byte) 5);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.requireInRange((short) 2, (short) 0, (short) 5);
        try {
            Premisex.requireInRange((short) -1, (short) 0, (short) 5);
            Assert.fail();
        } catch (Exception ignored) {
        }
        try {
            Premisex.requireInRange((short) 6, (short) 0, (short) 5);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.requireInRange(2, 0, 5);
        try {
            Premisex.requireInRange(-1, 0, 5);
            Assert.fail();
        } catch (Exception ignored) {
        }
        try {
            Premisex.requireInRange(6, 0, 5);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.requireInRange(2L, 0L, 5L);
        try {
            Premisex.requireInRange(-1L, 0L, 5L);
            Assert.fail();
        } catch (Exception ignored) {
        }
        try {
            Premisex.requireInRange(6L, 0L, 5L);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.requireInRange(2f, 0f, 5f);
        try {
            Premisex.requireInRange(-1f, 0f, 5f);
            Assert.fail();
        } catch (Exception ignored) {
        }
        try {
            Premisex.requireInRange(6f, 0f, 5f);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.requireInRange(2d, 0d, 5d);
        try {
            Premisex.requireInRange(-1d, 0d, 5d);
            Assert.fail();
        } catch (Exception ignored) {
        }
        try {
            Premisex.requireInRange(6d, 0d, 5d);
            Assert.fail();
        } catch (Exception ignored) {
        }
    }

    @Test
    public void testRequireNotInRange() {
        Premisex.requireNotInRange((byte) 6, (byte) 0, (byte) 5);
        Premisex.requireNotInRange((byte) -1, (byte) 0, (byte) 5);
        try {
            Premisex.requireNotInRange((byte) 2, (byte) 0, (byte) 5);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.requireNotInRange((short) 6, (short) 0, (short) 5);
        Premisex.requireNotInRange((short) -1, (short) 0, (short) 5);
        try {
            Premisex.requireNotInRange((short) 2, (short) 0, (short) 5);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.requireNotInRange(6, 0, 5);
        Premisex.requireNotInRange(-1, 0, 5);
        try {
            Premisex.requireNotInRange(2, 0, 5);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.requireNotInRange(6L, 0L, 5L);
        Premisex.requireNotInRange(-1L, 0L, 5L);
        try {
            Premisex.requireNotInRange(2L, 0L, 5L);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.requireNotInRange(6f, 0f, 5f);
        Premisex.requireNotInRange(-1f, 0f, 5f);
        try {
            Premisex.requireNotInRange(2f, 0f, 5f);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.requireNotInRange(6d, 0d, 5d);
        Premisex.requireNotInRange(-1d, 0d, 5d);
        try {
            Premisex.requireNotInRange(2d, 0d, 5d);
            Assert.fail();
        } catch (Exception ignored) {
        }
    }

    @Test
    public void testRequireSafe() {
        Premisex.requireSafe("fas");

        try {
            Premisex.requireSafe("");
            Assert.fail();
        } catch (Exception ignored) {
        }
    }

    @Test
    public void testRequireNotSafe() {
        Premisex.requireNotSafe("");

        try {
            Premisex.requireNotSafe("fas");
            Assert.fail();
        } catch (Exception ignored) {
        }
    }

    @Test
    public void testRequireNotZero() {
        Premisex.requireNotZero((byte)1);
        try {
            Premisex.requireNotZero((byte)0);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.requireNotZero((short)1);
        try {
            Premisex.requireNotZero((short)0);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.requireNotZero(1);
        try {
            Premisex.requireNotZero(0);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.requireNotZero(1L);
        try {
            Premisex.requireNotZero(0L);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.requireNotZero(1f);
        try {
            Premisex.requireNotZero(0f);
            Assert.fail();
        } catch (Exception ignored) {
        }

        Premisex.requireNotZero(1.0);
        try {
            Premisex.requireNotZero(0.0);
            Assert.fail();
        } catch (Exception ignored) {
        }
    }
}
