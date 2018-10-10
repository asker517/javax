## 0.6.7

* :hammer: The method in Stringx whose name ends with `or` adds a String overload method.
* :sparkles: Stringx add reversed, filter, filterBlank method
* :fire: Base64x encodeToBytes method renamed to encode, decodeToBytes method renamed to decode
* :fire: Base64x removes encodeTo, encodeToBuffer, decodeTo, decodeToBuffer and all methods whose method names begin with 'url' or 'mime'
* :fire: Remove Mapx.EMPTY_MAP, Collectionx.EMPTY_LIST, Collectionx.EMPTY_SET

## 0.6.6

Removed Or Renamed
* :fire: EMPTY_MAP from Collectionx move to Mapx
* :fire: Remove the following classes or constants in javax-kt, now use the corresponding class or constant in javax directly
    * Aes.kt AES, AES_ECB_NO, AES_ECB_PKCS5, AES_ECB_PKCS7, AES_ECB_ISO10126, AES_CBC_NO, AES_CBC_PKCS5, AES_CBC_PKCS7, AES_CBC_ISO10126
    * Des.kt DES, DES_ECB_NO, DES_ECB_PKCS5, DES_ECB_PKCS7, DES_ECB_ISO10126, DES_CBC_NO, DES_CBC_PKCS5, DES_CBC_PKCS7, DES_CBC_ISO10126
    * Rsa.kt RSA, RSA_ECB_PKCS1, RSA_ECB_OAEP, RSA_SIGNATURE
    * DateRange.kt, YearRange.kt, MonthRange.kt, DayRange.kt, HourRange.kt, MinuteRange.kt, SecondRange.kt, MillisecondRange.kt
    * InsecureSHA1PRNGKeyDerivator.kt, UnableCreateDirException.kt, UnableCreateFileException.kt
* :fire: Zip's compression\* method is renamed to compress\*, and the decompression\* method is renamed to decompress
* :fire: The names of the encrypt and decrypt methods of Rsa.kt are added to rsa

Bug
* :bug: Kotlin version setting of the Format format method roundingMode is RoundingMode.HALF_UP

New
* :sparkles: Add Stopwatch
* :sparkles: Add Annotationx
* :sparkles: Numberx add in and notIn method
* :sparkles: Digestx support bytes
* :sparkles: Stringx orEmpty, orDefault, emptyToNull, blankToNull support CharSequence
* :sparkles: Formatx add hiddenStartChars, hiddenMiddleChars, hiddenEndChars method
* :sparkles: Premisex.kt requireNotNull and checkNotNull method add Overload method
* :sparkles: Mapx add builder, forEach, forEachIndexed, map, mapIndexed method
* :sparkles: Arrayx add orEmpty method
* :sparkles: Filex add lengthRecursively(File\[\]) and lengthRecursively(Iterable<File>) method
* :sparkles: IOStreamx copyTo method add CopyListener argument
* :sparkles: Collectionx and Arrayx joinToArrayString method added kotlin extension
* :sparkles: Zip add getDecompressionDstDir, getCompressDstDir method
* :sparkles: Zipx.kt zipCompressFilesTo method add Overload method
* :sparkles: Zipx compress and decompress method supported progress listener

Hammer
* :hammer: Now all methods in javax-kt are extensions to javax
* :hammer: The primary parameters of all Collectionx methods are now Nullable
* :hammer: The primary parameters of all Arrayx methods are now Nullable


## 0.6.5
* :hammer: String orContains and andContains change to extension method
* :hammer: Premise's areEqual method moves to Comparison
* :fire: Remove Premise's requireNoNulls method
* :hammer: Premise's requireNonNull method rename to requireNotNull
* :hammer: Premise's checkInRange and checkNotInRange method rename to requireInRange and requireNotInRange
* :sparkles: Premise add check and checkNotNull method
* :sparkles: Premise add requireSafe and requireNotSafe method
* :sparkles: Aes.kt add toAesKeyFromBytes and toAesKeyFromBase64 method
* :fire: Aes remove decrypt(String, String, Key), decryptFromBase64(byte\[\], String, Key),
decryptToString(String, String, Key), decryptToStringFromBase64(byte\[\], String, Key) method
* :fire: Des remove decrypt(String, String, Key), decryptFromBase64(byte\[\], String, Key),
decryptToString(String, String, Key), decryptToStringFromBase64(byte\[\], String, Key) method
* :fire: RSA remove verify(String, byte[], PublicKey), verify(String, String, PublicKey),
    verifyFromBase64(byte[], byte[], PublicKey), verifyFromBase64(byte[], String, PublicKey),
    decrypt(String, String, Key), decryptFromBase64(byte[], String, Key),
    decryptToString(String, String, Key), decryptToStringFromBase64(byte[], String, Key) method
* :sparkles: Premise add requireNotZero method
* :hammer: Refacing Premise require, check, requireNotNull, checkNotNull, requireFileExist,
    requireIsDir, requireIsFile, requireInRange, requireNotInRange, requireSafe, requireNotSafe method signature
* :arrow_up: Updating to Kotlin 1.2.61

## 0.6.4
* Char add isNotBlank, isBlankOr, isNotChinese, isNotChineseOr, isDigit, isNotDigit, isNotDigitOr,
    isLetter, isNotLetter, isNotLetterOr, isLetterOrDigit, isNotLetterOrDigit, isNotLetterOrDigitOr method
* String add isSafe, isNotSafe, isNotSafeOr, isNotBlank, isBlankOr, isNotNullOrBlank, isNullOrBlankOr,
    isNotEmpty, isEmptyOr, isNotNullOrEmpty, isNullOrEmptyOr, isNotChineseOr, isDigit, isNotDigit,
    isNotDigitOr, isLetter, isNotLetter, isNotLetterOr, isNotLetterOrDigit, isNotLetterOrDigitOr
* The return content of Format's totalTime method has spaces added, and the totalTimeShort, totalTimeZH, totalTimeZHShort methods have been added.
* Format add formatCount method

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