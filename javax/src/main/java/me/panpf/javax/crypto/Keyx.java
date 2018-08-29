package me.panpf.javax.crypto;

import me.panpf.javax.util.Base64x;
import org.jetbrains.annotations.NotNull;

import java.security.Key;

public class Keyx {

    /**
     * Convert key to a Base64 string
     */
    @NotNull
    public static String toBase64(Key key) {
        return Base64x.encodeToString(key.getEncoded());
    }

    /**
     * Convert key to a byte array
     */
    @NotNull
    public static byte[] toBytes(Key key) {
        return key.getEncoded();
    }
}
