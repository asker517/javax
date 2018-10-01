package me.panpf.javax.test.util;

import me.panpf.javax.util.*;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MapxTest {

    @Test
    public void testBuilder() {
        Assert.assertEquals(Mapx.builder("1", "111").build().size(), 1);
        Assert.assertEquals(Mapx.builder("1", "111").put("2", "222").put("3", "333").build().size(), 3);
        Assert.assertEquals(Mapx.builder("1", "111").put("2", "222").put("3", "333").build().get("3"), "333");

        Assert.assertNotEquals(Collectionx.joinToString(Mapx.map(Mapx.builder("1", "111").put("3", "333").put("2", "222").build(), new Transformer2<String, String, String>() {
            @NotNull
            @Override
            public String transform(@NotNull String s, @NotNull String s2) {
                return s;
            }
        })), "1, 3, 2");

        Assert.assertNotEquals(Collectionx.joinToString(Mapx.map(Mapx.builder("1", "111").put("3", "333").put("2", "222").buildWeak(), new Transformer2<String, String, String>() {
            @NotNull
            @Override
            public String transform(@NotNull String s, @NotNull String s2) {
                return s;
            }
        })), "1, 3, 2");

        Assert.assertNotEquals(Collectionx.joinToString(Mapx.map(Mapx.builder("1", "111").put("3", "333").put("2", "222").buildTable(), new Transformer2<String, String, String>() {
            @NotNull
            @Override
            public String transform(@NotNull String s, @NotNull String s2) {
                return s;
            }
        })), "1, 3, 2");

        Assert.assertEquals(Collectionx.joinToString(Mapx.map(Mapx.builder("1", "111").put("3", "333").put("2", "222").buildLinked(), new Transformer2<String, String, String>() {
            @NotNull
            @Override
            public String transform(@NotNull String s, @NotNull String s2) {
                return s;
            }
        })), "1, 3, 2");

        Assert.assertEquals(Collectionx.joinToString(Mapx.map(Mapx.builder("1", "111").put("3", "333").put("2", "222").buildTree(), new Transformer2<String, String, String>() {
            @NotNull
            @Override
            public String transform(@NotNull String s, @NotNull String s2) {
                return s;
            }
        })), "1, 2, 3");

        Assert.assertEquals(Collectionx.joinToString(Mapx.map(Mapx.builder("3", "333").put("1", "111").put("2", "222").buildTree(), new Transformer2<String, String, String>() {
            @NotNull
            @Override
            public String transform(@NotNull String s, @NotNull String s2) {
                return s;
            }
        })), "1, 2, 3");
    }

    @Test
    public void testForEach() {
        final List<String> mapList = new ArrayList<>();
        Mapx.forEach(Mapx.builder("1", "111").put("2", "222").put("3", "333").build(), new Action2<String, String>() {
            @Override
            public void action(@NotNull String s, @NotNull String s2) {
                mapList.add(s);
            }
        });
        Assert.assertEquals(Collectionx.joinToString(mapList), "1, 2, 3");

        final List<String> indexedMapList = new ArrayList<>();
        Mapx.forEachIndexed(Mapx.builder("1", "111").put("2", "222").put("3", "333").build(), new IndexedAction2<String, String>() {
            @Override
            public void action(int index, @NotNull String s, @NotNull String s2) {
                indexedMapList.add(index + ":" + s);
            }
        });
        Assert.assertEquals(Collectionx.joinToString(indexedMapList), "0:1, 1:2, 2:3");
    }

    @Test
    public void testMap() {
        Assert.assertEquals(Collectionx.joinToString(Mapx.map(Mapx.builder("3", "333").put("1", "111").put("2", "222").buildTree(), new Transformer2<String, String, String>() {
            @NotNull
            @Override
            public String transform(@NotNull String s, @NotNull String s2) {
                return s;
            }
        })), "1, 2, 3");

        Assert.assertEquals(Collectionx.joinToString(Mapx.mapIndexed(Mapx.builder("3", "333").put("1", "111").put("2", "222").buildTree(), new IndexedTransformer2<String, String, String>() {
            @NotNull
            @Override
            public String transform(int index, @NotNull String s, @NotNull String s2) {
                return index + ":" + s;
            }
        })), "0:1, 1:2, 2:3");
    }
}
