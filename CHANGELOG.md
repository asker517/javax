## 0.6.2
* Arrayx 增加 indices, contains, indexOf
* 增加 Throwable
* File 增加 listRecursively
* Number 增加 toByte、toShort、toInt 等方法
* Premise 增加 checkInRange、checkNotInRange

## 0.6.1
* Arrayx 增加 plus, contentToString
* Number 修复 range(1, 1) 崩溃的 bug，并增加 downUntilTo 方法

## v0.6
* Intx 重命名为 Numberx 并增加 scale 系列方法
* Format 强制设置 roundingMode 为 RoundingMode.HALF_UP

## v0.5
* Digest 增加 InputStream 系列方法
* Collectionx 扩展 join 系列方法
* File mkdirsWithThrow() 重命名为 mkdirsOrThrow，createNewFileWithThrow 重命名为 createNewFileOrThrow，mkdirsWith() 重命名为 mkdirsCheck，createNewFileWith 重命名为 createNewFileCheck
* javax-kt 移除对 kotlinx 的依赖
* Arrayx 增加 group、iterator、asIterable、toList、asList、sorted、sortedArray、reverse reversed、reversedArray、map、count、max、min、join、requireNoNulls、sum 系列方法
* Arrayx 删除 toString(byte[]) 方法

## v0.4

* 重构 AES、DES、RSA 工具类，详情参见源码和测试用例