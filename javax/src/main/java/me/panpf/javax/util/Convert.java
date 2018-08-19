package me.panpf.javax.util;

public interface Convert<Data, Result> {
    Result convert(Data data);
}
