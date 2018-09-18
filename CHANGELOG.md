## 0.6.4 pre
* Char add isNotBlank, isBlankOr, isNotChinese, isNotChineseOr, isDigit, isNotDigit, isNotDigitOr,
    isLetter, isNotLetter, isNotLetterOr, isLetterOrDigit, isNotLetterOrDigit, isNotLetterOrDigitOr method
* String add isSafe, isNotSafe, isNotSafeOr, isNotBlank, isBlankOr, isNotNullOrBlank, isNullOrBlankOr,
    isNotEmpty, isEmptyOr, isNotNullOrEmpty, isNullOrEmptyOr, isNotChineseOr, isDigit, isNotDigit,
    isNotDigitOr, isLetter, isNotLetter, isNotLetterOr, isNotLetterOrDigit, isNotLetterOrDigitOr

## 0.6.3
* 修复 Zip 中 compressionDirTo() 方法 使用 '/' 作为文件路径分隔符导致在 Windows 上没有正确的返回文件名的 bug
* IOStream.kt 增加 safeClose()
* Digest 中 File 相关方法抛出 IOException
* 增加 Date
* 增加 Range
* Number 中的 rangeTo, untilTo, downTo, downUntilTo 移到 Range

## 0.6.2
* 增加 Throwable
* Number 增加 toByte、toShort、toInt 等方法
* Premise 增加 checkInRange、checkNotInRange
* File
    * 增加 listRecursively
    * requireExist, requireIsDir, requireIsFile 移到 Premise 中，并且 requireExist rename to requireFileExist
* Kotlin 版本移除 annotations 依赖
* Comparisonx 增加 maxOf, minOf
* Arrayx
    * requireNoNulls, 移到 Premise 中
    * 完善 toCollection, toSet, toHashSet
    * 增加 indices, contains, indexOf, forEach, filter, zip, partition, all, first, firstOrNull, last, lastIndexOf, lastOrNull,
    find, findLast, getOrElse, getOrNull, elementAt, elementAtOrElse, elementAtOrNull, contentEquals, flatMap,
    flatMapTo, average, none, reduce, reduceIndexed, reduceRight, reduceRightIndexed, fold, foldIndexed, foldRight,
    foldRightIndexed, intersect, subtract, binarySearch,  drop, take, slice, distinct, associate, withIndex
* 增加 Arrayx2

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