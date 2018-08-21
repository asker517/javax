package me.panpf.javax.util;

@SuppressWarnings("WeakerAccess")
public class Pair<A, B> {
    public final A fst;
    public final B snd;

    private Pair(A var1, B var2) {
        this.fst = var1;
        this.snd = var2;
    }

    public String toString() {
        return "Pair[" + this.fst + "," + this.snd + "]";
    }

    public boolean equals(Object var1) {
        return var1 instanceof Pair
                && (this.fst == ((Pair) var1).fst || (this.fst != null && this.fst.equals(((Pair) var1).fst)))
                && (this.snd == ((Pair) var1).snd || (this.snd != null && this.snd.equals(((Pair) var1).snd)));
    }

    public int hashCode() {
        if (this.fst == null) {
            return this.snd == null ? 0 : this.snd.hashCode() + 1;
        } else {
            return this.snd == null ? this.fst.hashCode() + 2 : this.fst.hashCode() * 17 + this.snd.hashCode();
        }
    }

    public static <A, B> Pair<A, B> of(A var0, B var1) {
        //noinspection unchecked
        return new Pair(var0, var1);
    }
}