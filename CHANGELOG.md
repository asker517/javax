## 0.5
* Digest 增加 InputStream 系列方法
* Collectionx 扩展 join 系列方法
* File mkdirsWithThrow() 重命名为 mkdirsOrThrow，createNewFileWithThrow 重命名为 createNewFileOrThrow，mkdirsWith() 重命名为 mkdirsCheck，createNewFileWith 重命名为 createNewFileCheck
* javax-kt 移除对 kotlinx 的依赖
* Arrayx 增加 group()、iterator()、asIterable()、toList()、asList()、sorted()、sortedArray()、reverse() reversed、reversedArray、map、count、max、min、join、requireNoNulls、sum 系列方法
* Arrayx 删除 toString(byte[]) 方法

## v0.4

* 重构 AES、DES、RSA 工具类，详情参见源码和测试用例