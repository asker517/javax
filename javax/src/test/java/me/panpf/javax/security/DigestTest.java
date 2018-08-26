package me.panpf.javax.security;

import me.panpf.javax.io.Filex;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class DigestTest {

    private static final String TEST_TEXT = "禅诗灵韵妙和声，秋叶飘飞过江东。一抹时光生惬意，妍媚红尘缱绻中。";

    private static final String TEXT_MD5 = "ec229d5c3f1ea99ad80efafb4e182fff";
    private static final String TEXT_MD5_16 = "3f1ea99ad80efafb";
    private static final String TEXT_SHA1 = "a5fbb18faa9d2f395ca85ba3960eaa807b0e4a17";
    private static final String TEXT_SHA256 = "dc2f25d24329aee85ff9e2134c928fd7ecbbaae28eaf532fd0be46223d0a2acb";
    private static final String TEXT_SHA512 = "84e439bcd7918c13d70a788212730d34be432b4eaa3f30803633444b63319dc14d1a3f1592deb7ce33499b7cb67c4d7311e216f0fe0c3539f96bd118be63e28e";

    private static final String FILE_MD5 = "1b1e3c0b3266d54c646d27436c3f8e0a";
    private static final String FILE_MD5_16 = "3266d54c646d2743";
    private static final String FILE_SHA1 = "57b920fbc143d0071ed09ffcdc0bb22578ec34fb";
    private static final String FILE_SHA256 = "6b22cd18d0e834e909f84bac115fb28ea818b4678310fe651347daa0e0edd8dc";
    private static final String FILE_SHA512 = "2fcb923149e65d29b7e7e3fbb1ee64ba08a207c68cac4c6cd719f1de49504bfa1a3c5aeb8b167e0bc7156f0894e40cebea6aeeffc89f4d8ab6b0c7a73f0080d8";

    @Test
    public void testDigest() {
        Assert.assertEquals(Digestx.getMD5(TEST_TEXT), TEXT_MD5);
        Assert.assertEquals(Digestx.getMD5_16(TEST_TEXT), TEXT_MD5_16);
        Assert.assertEquals(Digestx.getSHA1(TEST_TEXT), TEXT_SHA1);
        Assert.assertEquals(Digestx.getSHA256(TEST_TEXT), TEXT_SHA256);
        Assert.assertEquals(Digestx.getSHA512(TEST_TEXT), TEXT_SHA512);

        File file = new File("/tmp/testDigest.tmp");
        try {
            Filex.writeText(file, "禅诗灵韵妙和声，秋叶飘飞过江东。一抹时光生惬意，妍媚红尘缱绻中。\n" +
                    "禅诗灵韵妙和声，秋叶飘飞过江东。一抹时光生惬意，妍媚红尘缱绻中。");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Assert.assertEquals(Digestx.getMD5(file), FILE_MD5);
        Assert.assertEquals(Digestx.getMD5_16(file), FILE_MD5_16);
        Assert.assertEquals(Digestx.getSHA1(file), FILE_SHA1);
        Assert.assertEquals(Digestx.getSHA256(file), FILE_SHA256);
        Assert.assertEquals(Digestx.getSHA512(file), FILE_SHA512);

        file.delete();
    }
}
