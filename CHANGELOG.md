## 0.5 pre
* Digest 增加 InputStream 系列方法
* Collectionx 增加 joinToString(@NotNull Iterable<T>, @Nullable CharSequence, @NotNull Transformer<T, CharSequence>) 方法
* File mkdirsWithThrow() 重命名为 mkdirsOrThrow，createNewFileWithThrow 重命名为 createNewFileOrThrow，mkdirsWith() 重命名为 mkdirsCheck，createNewFileWith 重命名为 createNewFileCheck
* javax-kt 移除对 kotlinx 的依赖
* Array 增加 group() 系列方法、iterator() 系列方法、asIterable() 系列方法

## v0.4

* 重构 AES、DES、RSA 工具类，详情参见源码和测试用例