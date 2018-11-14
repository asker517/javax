# JAVAX

[![Platform][platform_java_icon]][platform_java_link]
[![Platform][platform_kotlin_icon]][platform_kotlin_link]
![SourceCompatibility][source_compatibility_icon]
![TargetCompatibility][target_compatibility_icon]
![converage_java][converage_java]
<!--![converage_kotlin][converage_kotlin]-->
[![License][license_icon]][license_link]

Extensions to the Java standard library, some tool methods related to File, IO, primitive types, String, Array, and Collection

### :warning: `Warning`

`Currently in the development stage, some APIs have not been tested yet, please use them carefully`

## Getting Started

Add the following to your `build.gradle` file

```grovvy
compile "me.panpf:javax:$lastVersion"
```

Please replace `$lastVersion` with the latest version: [![Download][version_java_icon]][version_java_link]

Dependencies：
* org.jetbrains:annotations: 13.0

### Kotlin Expansion：

Add the following to your `build.gradle` file

```grovvy
compile "me.panpf:javax-kt:$lastVersion"
```

Dependencies：
* org.jetbrains.kotlin:kotlin-stdlib-jdk7: 1.2.71

Please replace `$lastVersion` with the latest version: [![Download][version_kotlin_icon]][version_kotlin_link]

`javax-kt is a javax extension on the Kotlin platform that allows you to use javax more comfortably on Kotlin`

## Index

:warning: Representatives with the `(Test)` tag have passed the test and can be used with confidence.

### collections
* Array: [Arrayx.java] | [Arrayx.kt]
    * arrayOf, isEmpty, isNotEmpty, isNullOrEmpty, isNotNullOrEmpty, toTypedArray, toCollection, toList, toSet,
    * toHashSet, asList, map, reverse, sort, single, any, iterator, asIterable, groupBy, groupingBy, count,
    * max, min, join, sum, plus, indices, indexOf, contains, forEach, filter, zip, partition, all, first, last,
    * find, get, elementAt, flatMap, average, none, reduce, fold, intersect, subtract, drop, take, distinct,
    * withIndex, orEmpty
* Array2: [Arrayx2.java]
    * contentHashCode, contentDeepEquals, contentDeepHashCode, contentDeepToString, contentToString,
    * contentEquals, binarySearch, copyOf, slice, associate
* Collection: [Collectionx.java] | [Collectionx.kt]
    * ieEmpty, isNotEmpty, isNullEmpty, isNotNullEmpty, orEmpty, listOf, setOf, createEmptyList, createEmptySet,
    * createEmptyStack, createEmptyQueue, createEmptyDeque, collectionSizeOrDefault, filter, map, flatMap, join,
    * count, average, sum, first, last, find, get, max, min, addAll, removeAll, partition, toCollection, toList,
    * toSet, toHashSet, convertToSet, union, all, any, contains, forEach, chunked, minus, plus, group, sort, reverse,
    * indexOf, fold, reduce, slice, take, take, distinct, intersect, retainAll, associate, drop, single, elementAt,
    * fill, shuffle
* Map: [Mapx.java]
    * createEmptyMap, mapCapacity, getOrPut, builder, forEach, forEachIndexed, map, mapTo, mapIndexed, mapIndexedTo

### crypto
* Aes: [Aesx.java] ([Test][AesxTest.java]) | [Aesx.kt] ([Test][AesxTest.kt])
    * createKey, createKeyByPassword, keyFromBytes, keyFromBase64, encrypt, encryptToBase64,
    * decrypt, decryptFromBase64, decryptToString, decryptToStringFromBase64,
* Des: [Desx.java] ([Test][DesxTest.java]) | [Desx.kt] ([Test][DesxTest.kt])
    * createKeyByPassword, encrypt, encryptToBase64,
    * decrypt, decryptFromBase64, decryptToString, decryptToStringFromBase64,
* Key: [Keyx.java] ([Test][KeyTest.java]) | [Keyx.kt] ([Test][KeyxTest.kt])
    * toBase64, toBytes
* Rsa: [Rsax.java] ([Test][RsaxTest.java]) | [Rsax.kt] ([Test][RsaxTest.kt])
    * createKey, pubKeyFromBase64, priKeyFromBase64, sign, signToBase64, verify, verifyFromBase64,
    * encrypt, encryptToBase64, decrypt, decryptFromBase64, decryptToString, decryptToStringFromBase64

### io
* File: [Filex.java] ([Test][FilexTest.java]) | [Filex.kt] ([Test][FilexTest.kt])
    * mkdirsOrThrow, mkdirsOrCheck, createNewFileOrThrow, createNewFileOrCheck, clean, cleanRecursively,
    * lengthRecursively, listRecursively, listFilesRecursively, copyTo, copyRecursively, deleteRecursively,
    * startsWith, endsWith, normalize, resolve, resolveSibling, createTempDir, createTempFile,
    * getInvariantSeparatorsPath, getExtension, getNameWithoutExtension, toRelativeString, relative,
    * isRooted, toComponents, subPath, inputStream, bufferedInputStream, reader, bufferedReader, readBytes,
    * readText, readLines, useLines, forEachBlock, forEachLine, outputStream, bufferedOutputStream, writer,
    * bufferedWriter, printWriter, writeBytes, appendBytes, writeText, appendText, walk, walkTopDown,
    * walkBottomUp listCount, listCountRecursively, getAllExtension, getNameWithoutAllExtension,
    * createFileTree, compareFilePath, FilePredicate, DirectoryPredicate, FileComparator, FilePathComparator
    * existOrAddNumber
* IOStream: [IOStreamx.java] ([Test][IOStreamxTest.java]) | [IOStreamx.kt] ([Test][IOStreamxTest.kt])
    * safeClose, byteInputStream, inputStream, reader, writer, buffered, bufferedReader, bufferedWriter,
    * readBytes, readText, copyTo, lineSequence, useLines, forEachLine, readLines,

### lang
* Annotation: [Annotationx.java] ([Test][AnnotationxTest.java]) | [Annotationx.kt] ([Test][AnnotationxTest.kt])
    * getAnnotationFromEnum
* Char: [Charx.java] ([Test][CharxTest.java]) | [Charx.kt] ([Test][CharxTest.kt])
    * isBlank, isNotBlank, isBlankOr, isChinese, isNotChinese, isNotChineseOr, isDigit, isNotDigit, isNotDigitOr
    * isLetter, isNotLetter, isNotLetterOr, isLetterOrDigit, isNotLetterOrDigit, isNotLetterOrDigitOr
* Class: [Classx.java] ([Test][ClassxTest.java]) | [Classx.kt] ([Test][ClassxTest.kt])
    * getFieldWithParent, getFieldsWithParent, getFieldValue, getStaticFieldValue, setFieldValue,
    * setStaticFieldValue, getMethodWithParent, getMethodsWithParent, callMethod, callStaticMethod,
    * getConstructorWithParent, getConstructorsWithParent, getClassHierarchy, isTypeArray, isTypeCollection
* Math: [Mathx.java] ([Test][MathxTest.java]) | [Mathx.kt] ([Test][MathxTest.kt])
    * divide, divideToInt, divideToLong, scale, proportion, percent
* Number: [Numberx.java] ([Test][NumberxTest.java]) | [Numberx.kt] ([Test][NumberxTest.kt])
    * to\*OrDefault, to\*OrZero, orZero(Kt)
* String: [Stringx.java] | [Stringx.kt]
    * isSafe, isNotSafe, isNotSafeOr, isChinese, isNotChinese, isNotChineseOr,
    * isBlank, isNotBlank, isBlankOr, isNullOrBlank, isNotNullOrBlank, isNullOrBlankOr
    * isEmpty, isNotEmpty, isEmptyOr, isNullOrEmpty, isNotNullOrEmpty, isNullOrEmptyOr,
    * isDigit, isNotDigit, isNotDigitOr, isLetter, isNotLetter, isNotLetterOr,
    * isLetterOrDigit, isNotLetterOrDigit, isNotLetterOrDigitOr, orContains, andContains,
    * startsWith, endsWith, equals, orEmpty, orDefault, emptyToNull, blankToNull, remove,
    * capitalize, decapitalize, limit, pad, regionMatches, find, indexOf, substring, subSequence, toByteArray
    * reversed, filter, first, last, getOrElse, getOrNull, iterator, iterable, indices, lastIndex, trim,
    * replace, commonWith, contains, elementAt, single, drop, slice, take, associate, toCollection, toHashSet,
    * toList, toSet, toSortedSet, flatMap, group, map, withIndex, all, any, count, fold, forEach, max, min,
    * none, onEach, reduce, sum, chunked, partition, windowed, zip, asIterable, toSortedSet, method
* Throwable: [Throwablex.java] ([Test][ThrowablexTest.java]) | [Throwablex.kt] ([Test][ThrowablexTest.kt])
    * stackTraceToString

### net
* net: [Netx.java] ([Test][NetxTest.java]) | [Netx.kt] ([Test][NetxTest.kt])
    * isIPV4, isIPV6, isMacAddress, getLocalIPAddress, getLocalIPV4Address, getExternalIPV4Address, getCity
    * ipStringToLong, ipLongToString

### ranges
* Range: [Rangex.java] ([Test][RangexTest.java]) | [Rangex.kt] ([Test][RangexTest.kt])
    * in, notIn, rangeTo, until, downTo, downUntilTo,
    * yearRangeTo, monthRangeTo, \*RangeTo, yearDownTo, monthDownTo, * \*DownTo,
    * yearUntilTo, monthUntilTo, \*UntilTo, yearDownUntilTo, monthDownUntilTo, \*DownUntilTo
    * coerceAtLeast, coerceAtMost, coerceIn

### security
* Digest: [Digestx.java] ([Test][DigestxTest.java]) | [Digestx.kt] ([Test][DigestxTest.kt])
    * getDigest, getMD5, getMD5_16, getSHA1, getSHA256, getSHA512

### util
* Date: [Datex.java] | [Datex.kt]
    * createCalendar, toDate, toMillisecond, format, getYear, getMonth, get\*, addYear, addMonth, add\*,
    * isSameYear, isSameMonth, isSame\*, differYear, differMonth, differ\*
* Base64: [Base64x.java] ([Test][Base64xTest.java]) | [Base64x.kt] ([Test][Base64xTest.kt])
    * encode, encodeToString, decode, decodeToString
* Comparison: [Comparisonx.java] ([Test][ComparisonxTest.java])
    * compareValues, compareValuesBy, compareBy, compareByDescending, maxOf, minOf, areEqual
* Format: [Formatx.java] ([Test][FormatxTest.java]) | [Formatx.kt] ([Test][FormatxTest.kt])
    * formatDouble, formatFloat, percent, fileSize, mediumFileSize, shortFileSize,
    * totalTime, shortTotalTime, totalTimeZH, shortTotalTimeZH, count
    * hiddenStartChars, hiddenMiddleChars, hiddenEndChars, pad, duration, shortDuration
* Premise: [Premisex.java] ([Test][PremisexTest.java]) | [Premisex.kt] ([Test][PremisexTest.kt])
    * require, requireNotNull, check, checkNotNull, requireSafe, requireNotSafe
    * requireFileExist, requireIsDir, requireIsFile, requireInRange, requireNotInRange, requireNotZero
* Regex: [Regexx.java] ([Test][RegexxTest.java]) | [Regexx.kt] ([Test][RegexxTest.kt])
    * matches, find, lookingAt, getFirst, getAll, firstGroup, allGroup, replaceFirst, replaceAll
    * IPV4, IPV6, MAC_ADDRESS, CHINESE, CHINESE_SYMBOL, BLANK, EMAIL, URI, FLOAT_NUMBER, INTEGER
* Zip: [Zipx.java] | [Zipx.kt]
    * compressFilesTo, compressFilesTo, compressFileTo, compressFile, compressChildFileTo, compressChildFile,
    * decompressTo, decompress, getCompressDstFile, getDecompressDstDir, getTrueSize, listEntry, listEntryName,
    * size, ZipEntryNameTransformer

## Change Log

Please view the [CHANGELOG.md] file


## License
    Copyright (C) 2018 Peng fei Pan <panpfpanpf@outlook.com>

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


[platform_java_icon]: https://img.shields.io/badge/Platform-Java-red.svg
[platform_java_link]: https://www.java.com
[platform_kotlin_icon]: https://img.shields.io/badge/Platform-Kotlin-blue.svg
[platform_kotlin_link]: http://kotlinlang.org
[license_icon]: https://img.shields.io/badge/License-Apache%202-blue.svg
[license_link]: https://www.apache.org/licenses/LICENSE-2.0
[version_java_icon]: https://api.bintray.com/packages/panpf/maven/javax/images/download.svg
[version_java_link]:https://bintray.com/panpf/maven/javax/_latestVersion
[version_kotlin_icon]: https://api.bintray.com/packages/panpf/maven/javax-kt/images/download.svg
[version_kotlin_link]: https://bintray.com/panpf/maven/javax-kt/_latestVersion
[source_compatibility_icon]: https://img.shields.io/badge/SourceCompatibility-1.7-red.svg
[target_compatibility_icon]: https://img.shields.io/badge/TargetCompatibility-1.7-red.svg
[converage_java]: https://img.shields.io/badge/ConverageJava-28%25-orange.svg
[converage_kotlin]: https://img.shields.io/badge/ConverageKotlin-88%25-orange.svg

[CHANGELOG.md]: CHANGELOG.md

[Arrayx.java]: javax/src/main/java/me/panpf/javax/collections/Arrayx.java
[ArrayxTest.java]: javax/src/test/java/me/panpf/javax/test/collections/ArrayxTest.java
[Arrayx.kt]: javax-kt/src/main/java/me/panpf/javaxkt/collections/Arrayx.kt
[ArrayxTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/collections/ArrayxTest.kt

[Arrayx2.java]: javax/src/main/java/me/panpf/javax/collections/Arrayx2.java
[Array2xTest.java]: javax/src/test/java/me/panpf/javax/test/collections/Array2xTest.java
[Array2x.kt]: javax-kt/src/main/java/me/panpf/javaxkt/collections/Array2x.kt
[Array2xTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/collections/Array2xTest.kt

[Collectionx.java]: javax/src/main/java/me/panpf/javax/collections/Collectionx.java
[CollectionxTest.java]: javax/src/test/java/me/panpf/javax/test/collections/CollectionxTest.kt
[Collectionx.kt]: javax-kt/src/main/java/me/panpf/javaxkt/collections/Collectionx.kt
[CollectionxTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/collections/CollectionxTest.kt

[Mapx.java]: javax/src/main/java/me/panpf/javax/collections/Map.java
[MapxTest.java]: javax/src/test/java/me/panpf/javax/test/collections/MapxTest.java
[Mapx.kt]: javax-kt/src/main/java/me/panpf/javaxkt/collections/Mapx.kt
[MapxTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/collections/MapxTest.kt

[Aesx.java]: javax/src/main/java/me/panpf/javax/crypto/Aesx.java
[AesxTest.java]: javax/src/test/java/me/panpf/javax/test/crypto/AesxTest.java
[Aesx.kt]: javax-kt/src/main/java/me/panpf/javaxkt/crypto/Aesx.kt
[AesxTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/crypto/AesxTest.kt

[Desx.java]: javax/src/main/java/me/panpf/javax/crypto/Desx.java
[DesxTest.java]: javax/src/test/java/me/panpf/javax/test/crypto/DesxTest.java
[Desx.kt]: javax-kt/src/main/java/me/panpf/javaxkt/crypto/Desx.kt
[DesxTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/crypto/DesxTest.kt

[Keyx.java]: javax/src/main/java/me/panpf/javax/crypto/Keyx.java
[KeyxTest.java]: javax/src/test/java/me/panpf/javax/test/crypto/KeyxTest.java
[Keyx.kt]: javax-kt/src/main/java/me/panpf/javaxkt/crypto/Keyx.kt
[KeyxTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/crypto/KeyxTest.kt

[Rsax.java]: javax/src/main/java/me/panpf/javax/crypto/Rsax.java
[RsaxTest.java]: javax/src/test/java/me/panpf/javax/test/crypto/RsaxTest.java
[Rsax.kt]: javax-kt/src/main/java/me/panpf/javaxkt/crypto/Rsax.kt
[RsaxTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/crypto/RsaxTest.kt

[Filex.java]: javax/src/main/java/me/panpf/javax/io/Filex.java
[FilexTest.java]: javax/src/test/java/me/panpf/javax/test/io/FilexTest.kt
[Filex.kt]: javax-kt/src/main/java/me/panpf/javaxkt/io/Filex.kt
[FilexTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/io/FilexTest.kt

[IOStreamx.java]: javax/src/main/java/me/panpf/javax/io/IOStreamx.java
[IOStreamxTest.java]: javax/src/test/java/me/panpf/javax/test/io/IOStreamxTest.kt
[IOStreamx.kt]: javax-kt/src/main/java/me/panpf/javaxkt/io/IOStreamx.kt
[IOStreamxTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/io/IOStreamxTest.kt

[Annotationx.java]: javax/src/main/java/me/panpf/javax/lang/Annotationx.java
[AnnotationxTest.java]: javax/src/test/java/me/panpf/javax/test/lang/AnnotationxTest.java
[Annotationx.kt]: javax-kt/src/main/java/me/panpf/javaxkt/lang/Annotationx.kt
[AnnotationxTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/lang/AnnotationxTest.kt

[Charx.java]: javax/src/main/java/me/panpf/javax/lang/Charx.java
[CharxTest.java]: javax/src/test/java/me/panpf/javax/test/lang/CharxTest.java
[Charx.kt]: javax-kt/src/main/java/me/panpf/javaxkt/lang/Charx.kt
[CharxTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/lang/CharxTest.kt

[Classx.java]: javax/src/main/java/me/panpf/javax/lang/Classx.java
[ClassxTest.java]: javax/src/test/java/me/panpf/javax/test/lang/ClassxTest.java
[Classx.kt]: javax-kt/src/main/java/me/panpf/javaxkt/lang/Classx.kt
[ClassxTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/lang/ClassxTest.kt

[Mathx.java]: javax/src/main/java/me/panpf/javax/lang/Mathx.java
[MathxTest.java]: javax/src/test/java/me/panpf/javax/test/lang/MathxTest.java
[Mathx.kt]: javax-kt/src/main/java/me/panpf/javaxkt/lang/Mathx.kt
[MathxTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/lang/MathxTest.kt

[Numberx.java]: javax/src/main/java/me/panpf/javax/lang/Numberx.java
[NumberxTest.java]: javax/src/test/java/me/panpf/javax/test/lang/NumberxTest.java
[Numberx.kt]: javax-kt/src/main/java/me/panpf/javaxkt/lang/Numberx.kt
[NumberxTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/lang/NumberxTest.kt

[Stringx.java]: javax/src/main/java/me/panpf/javax/lang/Stringx.java
[StringxTest.java]: javax/src/test/java/me/panpf/javax/test/lang/StringxTest.java
[Stringx.kt]: javax-kt/src/main/java/me/panpf/javaxkt/lang/Stringx.kt
[StringxTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/lang/StringxTest.kt

[Throwablex.java]: javax/src/main/java/me/panpf/javax/lang/Throwablex.java
[ThrowablexTest.java]: javax/src/test/java/me/panpf/javax/test/lang/ThrowablexTest.java
[Throwablex.kt]: javax-kt/src/main/java/me/panpf/javaxkt/lang/Throwablex.kt
[ThrowablexTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/lang/ThrowablexTest.kt

[Netx.java]: javax/src/main/java/me/panpf/javax/security/Netx.java
[NetxTest.java]: javax/src/test/java/me/panpf/javax/test/security/NetxTest.java
[Netx.kt]: javax-kt/src/main/java/me/panpf/javaxkt/security/Netx.kt
[NetxTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/security/NetxTest.kt

[Rangex.java]: javax/src/main/java/me/panpf/javax/ranges/Rangex.java
[RangexTest.java]: javax/src/test/java/me/panpf/javax/test/ranges/RangexTest.kt
[Rangex.kt]: javax-kt/src/main/java/me/panpf/javaxkt/ranges/Rangex.kt
[RangexTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/ranges/RangexTest.kt

[Digestx.java]: javax/src/main/java/me/panpf/javax/security/Digestx.java
[DigestxTest.java]: javax/src/test/java/me/panpf/javax/test/security/DigestxTest.java
[Digestx.kt]: javax-kt/src/main/java/me/panpf/javaxkt/security/Digestx.kt
[DigestxTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/security/DigestxTest.kt

[Datex.java]: javax/src/main/java/me/panpf/javax/util/Datex.java
[DatexTest.java]: javax/src/test/java/me/panpf/javax/test/util/DatexTest.java
[Datex.kt]: javax-kt/src/main/java/me/panpf/javaxkt/util/Datex.kt
[DatexTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/util/DatexTest.kt

[Base64x.java]: javax/src/main/java/me/panpf/javax/util/Base64x.java
[Base64xTest.java]: javax/src/test/java/me/panpf/javax/test/util/Base64xTest.java
[Base64x.kt]: javax-kt/src/main/java/me/panpf/javaxkt/util/Base64x.kt
[Base64xTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/util/Base64xTest.kt

[Comparisonx.java]: javax/src/main/java/me/panpf/javax/util/Comparisonx.java
[ComparisonxTest.java]: javax/src/test/java/me/panpf/javax/test/util/ComparisonxTest.java
[Comparisonx.kt]: javax-kt/src/main/java/me/panpf/javaxkt/util/Comparisonx.kt
[ComparisonxTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/util/ComparisonxTest.kt

[Formatx.java]: javax/src/main/java/me/panpf/javax/util/Formatx.java
[FormatxTest.java]: javax/src/test/java/me/panpf/javax/test/util/FormatxTest.java
[Formatx.kt]: javax-kt/src/main/java/me/panpf/javaxkt/util/Formatx.kt
[FormatxTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/util/FormatxTest.kt

[Premisex.java]: javax/src/main/java/me/panpf/javax/util/Premisex.java
[PremisexTest.java]: javax/src/test/java/me/panpf/javax/test/util/PremisexTest.java
[Premisex.kt]: javax-kt/src/main/java/me/panpf/javaxkt/util/Premisex.kt
[PremisexTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/util/PremisexTest.kt

[Regexx.java]: javax/src/main/java/me/panpf/javax/util/Regexx.java
[RegexxTest.java]: javax/src/test/java/me/panpf/javax/test/util/RegexxTest.java
[Regexx.kt]: javax-kt/src/main/java/me/panpf/javaxkt/util/Regexx.kt
[RegexxTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/util/RegexxTest.kt

[Stopwatchx.java]: javax/src/main/java/me/panpf/javax/util/Stopwatch.java
[StopwatchxTest.java]: javax/src/test/java/me/panpf/javax/test/util/StopwatchxTest.java
[Stopwatchx.kt]: javax-kt/src/main/java/me/panpf/javaxkt/util/Stopwatchx.kt
[StopwatchxTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/util/StopwatchxTest.kt

[Zipx.java]: javax/src/main/java/me/panpf/javax/util/Zipx.java
[ZipxTest.java]: javax/src/test/java/me/panpf/javax/test/util/ZipxTest.java
[Zipx.kt]: javax-kt/src/main/java/me/panpf/javaxkt/util/Zipx.kt
[ZipxTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/util/ZipxTest.kt
