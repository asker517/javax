package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collectionx {

    @NotNull
    public static <Data, Result> List<Result> map(@NotNull Collection<Data> collection, @NotNull Convert<Data, Result> convert) {
        List<Result> resultList = new ArrayList<>(collection.size());
        for (Data data : collection) {
            resultList.add(convert.convert(data));
        }
        return resultList;
    }

    @NotNull
    public static String join(@NotNull Collection collection, @NotNull String delimiter, @Nullable String itemNullOrEmptyResult) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (Object object : collection) {
            if (builder.length() > 1) {
                builder.append(delimiter);
            }
            builder.append(object != null ? object : itemNullOrEmptyResult);
        }
        builder.append("]");
        return builder.toString();
    }
}
