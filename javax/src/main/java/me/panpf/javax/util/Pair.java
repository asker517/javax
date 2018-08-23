package me.panpf.javax.util;

@SuppressWarnings("WeakerAccess")
public class Pair<A, B> {
    public final A first;
    public final B second;

    private Pair(A var1, B var2) {
        this.first = var1;
        this.second = var2;
    }

    public String toString() {
        return "Pair[" + this.first + "," + this.second + "]";
    }

    public boolean equals(Object var1) {
        return var1 instanceof Pair
                && (this.first == ((Pair) var1).first || (this.first != null && this.first.equals(((Pair) var1).first)))
                && (this.second == ((Pair) var1).second || (this.second != null && this.second.equals(((Pair) var1).second)));
    }

    public int hashCode() {
        if (this.first == null) {
            return this.second == null ? 0 : this.second.hashCode() + 1;
        } else {
            return this.second == null ? this.first.hashCode() + 2 : this.first.hashCode() * 17 + this.second.hashCode();
        }
    }

    public static <A, B> Pair<A, B> of(A var0, B var1) {
        return new Pair<A, B>(var0, var1);
    }
}