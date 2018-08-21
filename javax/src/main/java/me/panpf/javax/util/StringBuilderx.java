package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

@SuppressWarnings("WeakerAccess")
public class StringBuilderx {


    public static <T> void appendElement(@NotNull Appendable appendable, @NotNull T element, @Nullable Transformer<T, CharSequence> transform) {
        try {
            if (transform != null) {
                appendable.append(transform.transform(element));
            } else if (element instanceof CharSequence) {
                appendable.append((CharSequence) element);
            } else if (element instanceof Character) {
                appendable.append((Character) element);
            } else {
                appendable.append(element.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
