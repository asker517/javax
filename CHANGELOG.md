## v...

* :fire: Stringx orContains rename to containsAny and andContains rename to containsAll
* :bug: Fix Stringx startsWith, endsWith, findAnyOf, indexOf, regionMatchesImpl method throw IndexOutOfBoundsException exception bug
* :sparkles: Stringx.kt adds limit method
* :fire: Stringx indAnyOf rename to findAnyOf
* :sparkles: Stringx findAnyOf adds overload method
* :bug: Fix Stringx lastIndexOf method default startIndex is 0, should be length - 1 bug
* :sparkles: MapBuilder adds buildSorted method
* :white_check_mark: Perfect Stringx testing
* :fire: Collectionx createOnlyReadEmptyList rename to onlyReadEmptyList, createOnlyReadEmptySet rename to onlyReadEmptySet
* :fire: Mapx createOnlyReadEmptyMap rename to onlyReadEmptyMap, mapCapacity rename to capacity, put rename to plusAssign
* :fire: Mapx remove forEachIndexed, mapIndexed, mapToIndexed method
* :fire: Collectionx listOf rename to mutableListOf, onlyReadListOf rename to immutableListOf
* :fire: Collectionx remove all createEmpty* method
* :fire: Refactoring Collectionx listOf and setOf method
* :fire: Mapx remove all createEmpty* method
* :sparkles: Mapx add mapOf method
* :sparkles: Arrayx adds asSequence method
* :sparkles: Collectionx adds asSequence method
* :sparkles: Stringx adds asSequence method
* :fire: MapBuilder rename build\* method
* :fire: Rangex.until method now return \*Range
* :sparkles: Add Sequencex
* :sparkles: Stringx adds splitToSequence, split, lineSequence, lines, chunkedSequence, windowedSequence
* :white_check_mark: Perfect Mathx testing
* :white_check_mark: Perfect Numberx testing
* :fire: Sequence no longer inherits Iterable
* :white_check_mark: Perfect Mapx testing



## v0.9.0

Removed:
* :fire: Zipx remove compressDirTo, compressDir method
* :fire: Rangex remove rangeTo(float, float, step), until(float..), downTo(float..), downUntilTo(float..) method
* :fire: Rangex remove rangeTo(double, double, step), until(double..), downTo(double..), downUntilTo(double..) method
* :fire: Rangex year\*, month\*, etc. remove long and String overload methods
* :fire: Datex year\*, month\*, etc. remove long and String overload methods

Rename:
* :fire: Formatx totalTimeShort rename to shortTotalTime, durationShort rename to shortDuration
* :fire: IOStreamx safeClose rename to closeQuietly
* :fire: IOStreamx rename to Streamx

Behavior change:
* :fire: The Zipx getDecompressDstDir method now returns `zipSourceFile.getParentFile()`

Change package name:
* :fire: Arrayx, Arrayx2, Mapx and related class moved to collections package
* :fire: Rangex moved and related class to collections ranges

Add:
* :sparkles: Filex adds getAllExtension, getNameWithoutAllExtension, createFileTree, compareFilePath, existOrAddNumber method
* :sparkles: Filex adds FilePredicate, DirectoryPredicate, FileComparator, FilePathComparator method
* :sparkles: Zipx adds compressChildFileTo, compressChildFile, listEntry, listEntryName, size, ZipEntryNameTransformer
* :sparkles: Rangex adds coerceIn method
* :sparkles: IOStreamx adds readBytesClose, readBytesCloseQuietly, readTextClose, readTextCloseQuietly method

Perfect test:
* :white_check_mark: Perfect Zipx testing
* :white_check_mark: Perfect Formatx testing
* :white_check_mark: Perfect Rangex testing
* :white_check_mark: Perfect Datex testing
* :white_check_mark: Perfect Keyx testing


## v0.8.5

Fix bug:
* :bug: Fix Filex startsWith method bug
* :bug: Filex getInvariantSeparatorsPath method change to static
* :bug: Fix IOStreamx forEachLine method crash bug

Removed:
* :fire: Filex remove getRootName and getRoot method

Major change:
* :fire: Comparisonx compareBy method The selector parameter type is changed to NullableAllTransformer. The methods that are implicated are Arrayx.sortBy, Arrayx.sortedBy, Collectionx.sortBy, Collectionx.sortedBy

Add:
* :sparkles: Filex createTempDir and createTempFile method added overload method
* :sparkles: Filex.kt adds toComponents and subPath method
* :sparkles: Filex adds bufferedInputStream and bufferedOutputStream method

Perfect test:
* :white_check_mark: Perfect Filex testing
* :white_check_mark: Perfect IOStreamx testing
* :white_check_mark: Perfect Annotationx testing
* :white_check_mark: Perfect Comparisonx testing
* :white_check_mark: Perfect Premisex testing


## v0.8.4

Fix bug:
* :bug: Fixed a bug where the Collectionx drop method did not return results as expected, the method affected by it is Filex.toRelativeString
* :bug: Fixed the Filex toRelativeString method to return a null bug when the two parameters are the same
* :bug: Filex FileTreeWalk.DirectoryState to force validation to be a directory bug

Rename:
* :fire: Filex cleanDir rename to cleanRecursively
* :fire: Filex mkdirsCheck rename to mkdirsOrCheck, createNewFileCheck rename to createNewFileOrCheck
* :fire: Filex listFilesRecursively(File, @Nullable FileFilter) method change to listFilesRecursively(File, @NotNull FileFilter), listFilesRecursively(File, @Nullable FilenameFilter) method change to listFilesRecursively(File, @NotNull FilenameFilter)

New:
* :sparkles: Filex copyTo and copyRecursively method added overload method
* :sparkles: Filex adds clean method
* :sparkles: Filex adds `String[] listRecursively(File dir, FilenameFilter)` and `String[] listRecursively(File dir, FileFilter)` method
* :sparkles: Filex adds listCount, listCountRecursively method


## v0.8.3

:fire: Removed Classx getStaticFieldValue(Object, String), setStaticFieldValue(Object, String, Object), callStaticMethod(Object, String, Object...) method


## v0.8.2

* :sparkles: Classx support class name
* :sparkles: Netx adds ipStringToLong, ipLongToString, isMacAddress method
* :sparkles: Regexx adds MAC_ADDRESS


## v0.8.1

* :zap: Formatx's fileSize method now returns 1000 KB 0.98 MB
* :sparkles: Netx adds getCity method
* :fire: FormatTotalTimeConfig change to Formatx.TotalTimeConfig


## v0.8.0

Fix bug:
* :bug: Fix IOStreamx readBytes(URL) method does not close the InputStream bug
* :bug: Fix Collectionx sortedWith(Iterable<T>), sorted(Iterable<T>) ClassCastException
* :bug: Fix Arrayx reversedArray(T\[\]), plus(T\[\])  ClassCastException
* :bug: Fix Arrayx2 copyOf(T\[\]), copyOfRange(T\[\]), sliceArray(T\[\])  ClassCastException

Removed Or Renamed
* :fire: CharIterator rename to CharRangeIterator, DoubleIterator rename to DoubleRangeIterator, FloatIterator rename to FloatRangeIterator,
    IntIterator rename to IntRangeIterator, LongIterator rename to LongRangeIterator, DateIterator rename to DateRangeIterator
* :fire: Collectionx isEmpty and isNotEmpty method not support null
* :fire: Arrayx isEmpty and isNotEmpty method not support null
* :fire: Arrayx remove orEmpty(T\[\]) method
* :fire: Arrayx reversedArray(T\[\]), sortedArray(T\[\]), sortedArrayDescending(T\[\]), sortedArrayWith(T\[\]), plus(T\[\]), plusElement(T\[\]) method the first parameter is marked @NotNull
* :fire: Arrayx2 copyOf(T\[\]), copyOfRange(T\[\]), sliceArray(T\[\]) method the first parameter is marked @NotNull
* :fire: Collectionx remove toTypeArray(Collection<T>), toTypeArray(Iterable<T>) method

Hammer:
* :art: Perfect Stringx.kt startsWith and endWith

New:
* :sparkles: Stringx adds removeChar, removeFirstChar, removeLastChar, removeIndex, removeRange,
    removePrefix, removeSuffix, removeSurrounding method, find, findLast, first, firstOrNull,
    last, lastOrNull, getOrElse, getOrNull, indexOf, lastIndexOf, substring, subSequence, toByteArray,
    indices, lastIndex, reversed, filter, trim, iterator, iterable, replace, commonWith, contains,
    elementAt, single, drop, slice, take, associate, toCollection, toHashSet, toList, toSet, toSortedSet,
    flatMap, group, map, withIndex, all, any, count, fold, forEach, max, min, none, onEach, reduce, sum,
    chunked, partition, windowed, zip, asIterable, toSortedSet, method
* :sparkles: Stringx orContains and andContains support ignoreCase
* :sparkles: Collectionx adds setOf, isNullOrEmpty and isNotNullOrEmpty method
* :sparkles: Arrayx adds isNullOrEmpty and isNotNullOrEmpty, arrayOfNulls method
* :sparkles: Add Regexx
* :sparkles: Add Netx
* :sparkles: Formatx adds duration and durationShort method


## v0.7.1

* :fire: Collectionx remove emptyList, emptySet method
* :sparkles: Collectionx adds createEmptyList, createEmptyArrayList, createEmptyLinkedList,
    createOnlyReadEmptyList, createEmptySet, createEmptyHashSet, createEmptyLinkedHashSet,
    createOnlyReadEmptySet, createEmptyStack, createEmptyQueue, createEmptyBlockingQueue,
    createEmptyArrayBlockingQueue, createEmptyLinkedBlockingQueue, createEmptyPriorityQueue,
    createEmptyDeque, createEmptyArrayDeque, createEmptyBlockingDeque method
* :sparkles: Mapx adds createEmptyMap, createEmptyHashMap, createEmptyWeakHashMap, createEmptyLinkedHashMap
    createEmptyHashtable, createEmptyTreeMap, createOnlyReadEmptyMap method
* :sparkles: Collectionx adds arrayListOf, linkedListOf, onlyReadListOf method


## v0.7.0

* :arrow_up: Updating to Kotlin 1.2.71
* :fire: Formatx totalTimeZH and totalTimeZHSHort method default parameter '分' to '分钟'
* :sparkles: Formatx adds totalTime(long, FormatTotalTimeConfig) method


## v0.6.9

* :fire: Classx getFieldValue(Field) rename to getStaticFieldValue(Field)
* :fire: Classx getFieldValue(Class<?>, String) rename to getStaticFieldValue(Class<?>, String)
* :fire: Classx setFieldValue(Field, Object) rename to setStaticFieldValue(Field, Object)
* :fire: Classx setFieldValue(Class<?>, String, Object) rename to setStaticFieldValue(Class<?>, String, Object)
* :fire: Classx callMethod(Method, Object...) rename to callStaticMethod(Method, Object...)
* :fire: Classx callMethod(Class<?>, String, Object...) rename to callStaticMethod(Class<?>, String, Object...)


## v0.6.8

* :sparkles: Classx getFieldValue(Class<?>, String), setFieldValue(Class<?>, String, Object), callMethod(Class<?>, String, Object...),


## v0.6.7

* :bug: Collectionx avoids using java.util.ArrayList because it can't be added
* :fire: Base64x encodeToBytes method renamed to encode, decodeToBytes method renamed to decode
* :fire: Base64x removes encodeTo, encodeToBuffer, decodeTo, decodeToBuffer and all methods whose method names begin with 'url' or 'mime'
* :fire: Remove Mapx.EMPTY_MAP, Collectionx.EMPTY_LIST, Collectionx.EMPTY_SET
* :fire: Numberx scale method move to Mathx
* :fire: Numberx in, notIn method move to Rangex
* :fire: Numberx coerceAtLeast, coerceAtMost method move to Rangex
* :fire: Numberx pad method move to Formatx
* :fire: Formatx totalTime method ignoreMillisecond parameter changed to level
* :sparkles: Stringx add reversed, filter, filterBlank method
* :sparkles: Digestx add \*OrEmpty and \*OrNull method
* :sparkles: Numberx.kt add orZero method
* :sparkles: Add Mathx
* :hammer: The method in Stringx whose name ends with `or` adds a String overload method.


## v0.6.6

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


## v0.6.5
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


## v0.6.4
* Char add isNotBlank, isBlankOr, isNotChinese, isNotChineseOr, isDigit, isNotDigit, isNotDigitOr,
    isLetter, isNotLetter, isNotLetterOr, isLetterOrDigit, isNotLetterOrDigit, isNotLetterOrDigitOr method
* String add isSafe, isNotSafe, isNotSafeOr, isNotBlank, isBlankOr, isNotNullOrBlank, isNullOrBlankOr,
    isNotEmpty, isEmptyOr, isNotNullOrEmpty, isNullOrEmptyOr, isNotChineseOr, isDigit, isNotDigit,
    isNotDigitOr, isLetter, isNotLetter, isNotLetterOr, isNotLetterOrDigit, isNotLetterOrDigitOr
* The return content of Format's totalTime method has spaces added, and the totalTimeShort, totalTimeZH, totalTimeZHShort methods have been added.
* Format add formatCount method


## v0.6.3
* 修复 Zip 中 compressionDirTo() 方法 使用 '/' 作为文件路径分隔符导致在 Windows 上没有正确的返回文件名的 bug
* IOStream.kt 增加 safeClose()
* Digest 中 File 相关方法抛出 IOException
* 增加 Date
* 增加 Range
* Number 中的 rangeTo, untilTo, downTo, downUntilTo 移到 Range


## v0.6.2
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


## v0.6.1
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