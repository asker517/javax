package me.panpf.javax.lang;

public class Objectx {

    /**
     * Returns {@code true} if the provided reference is {@code null} otherwise
     * returns {@code false}.
     */
    public static boolean isNull(Object obj) {
        return obj == null;
    }

    /**
     * Returns {@code true} if the provided reference is non-{@code null}
     * otherwise returns {@code false}.
     */
    public static boolean nonNull(Object obj) {
        return obj != null;
    }
}
