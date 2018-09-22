# JAVAX

[![Platform][platform_java_icon]][platform_java_link]
[![Platform][platform_kotlin_icon]][platform_kotlin_link]
![SourceCompatibility][source_compatibility_icon]
![TargetCompatibility][target_compatibility_icon]
![converage_java][converage_java]
![converage_kotlin][converage_kotlin]
[![License][license_icon]][license_link]

Extensions to the Java standard library, some tool methods, and tool methods related to File, IO,
primitive types, String, Array, and Collection extracted from the Kotlin standard library (not available in the Kotlin version)

## Getting Started

### Java version：

Add the following to your `build.gradle` file

```grovvy
compile "me.panpf:javax:$lastVersion"
```

Please replace `$lastVersion` with the latest version: [![Download][version_java_icon]][version_java_link]

Dependencies：
* org.jetbrains:annotations: 13.0

### Kotlin version：

Add the following to your `build.gradle` file

```grovvy
compile "me.panpf:javax-kt:$lastVersion"
```

Dependencies：
* org.jetbrains.kotlin:kotlin-stdlib-jdk7: 1.2.50

Please replace `$lastVersion` with the latest version: [![Download][version_kotlin_icon]][version_kotlin_link]

`You can add Java or Kotlin versions to your project as needed. If your project is Java and Kotlin mixed development, then both versions can be imported, because there are different package names, so there will be no class duplicates.`

## Index

### crypto
* Aes: [Aesx.java] ([Test][AesTest.java]) | [Aes.kt] ([Test][AesTest.kt])
    * createKey, createKeyByPassword, keyFromBytes, keyFromBase64, encrypt, encryptToBase64,
    * decrypt, decryptFromBase64, decryptToString, decryptToStringFromBase64,
* Des: [Desx.java] ([Test][DesTest.java]) | [Des.kt] ([Test][DesTest.kt])
    * createKeyByPassword, encrypt, encryptToBase64,
    * decrypt, decryptFromBase64, decryptToString, decryptToStringFromBase64,
* Rsa: [Rsax.java] ([Test][RsaTest.java]) | [Rsa.kt] ([Test][RsaTest.kt])
    * createKey, pubKeyFromBase64, priKeyFromBase64, sign, signToBase64, verify, verifyFromBase64,
    * encrypt, encryptToBase64, decrypt, decryptFromBase64, decryptToString, decryptToStringFromBase64

### io
* File: [Filex.java] ([Test][FileTest.java]) | [File.kt] ([Test][FileTest.kt])
    * mkdirsOrThrow, mkdirsCheck, createNewFileOrThrow, createNewFileCheck, cleanDir, lengthRecursively,
    * listRecursively, listFilesRecursively, copyTo, copyRecursively, deleteRecursively, startsWith, endsWith,
    * normalize, resolve, resolveSibling, createTempDir, createTempFile, getInvariantSeparatorsPath, getExtension,
    * getNameWithoutExtension, toRelativeString, relative, getRootLength, getRootName, isRooted, toComponents,
    * subPath, inputStream, reader, bufferedReader, readBytes, readText, readLines, useLines, forEachBlock,
    * forEachLine, outputStream, writer, bufferedWriter, printWriter, writeBytes, appendBytes, writeText,
    * appendText, walk, walkTopDown, walkBottomUp
* IOStream: [IOStreamx.java] ([Test][IOStreamTest.java]) | [IOStream.kt] ([Test][IOStreamTest.kt])
    * safeClose, byteInputStream, inputStream, reader, writer, buffered, bufferedReader, bufferedWriter,
    * readBytes, readText, copyTo, lineSequence, useLines, forEachLine, readLines,

### lang
* Char: [Charx.java] ([Test][CharTest.java]) | [Char.kt] ([Test][CharTest.kt])
    * isBlank, isNotBlank, isBlankOr, isChinese, isNotChinese, isNotChineseOr, isDigit, isNotDigit, isNotDigitOr
    * isLetter, isNotLetter, isNotLetterOr, isLetterOrDigit, isNotLetterOrDigit, isNotLetterOrDigitOr
* Class: [Classx.java] ([Test][ClassTest.java]) | [Class.kt] ([Test][ClassTest.kt])
    * getFieldWithParent, getFieldsWithParent, getFieldValue, setFieldValue,
    * getMethodWithParent, getMethodsWithParent, callMethod,
    * getConstructorWithParent, getConstructorsWithParent, getClassHierarchy, isTypeArray, isTypeCollection
* Number: [Numberx.java] ([Test][NumberTest.java]) | [Number.kt] ([Test][NumberTest.kt])
    * scale, pad, coerce, to\*OrDefault, to\*OrZero
* String: [Stringx.java] ([Test][StringTest.java]) | [String.kt] ([Test][StringTest.kt])
    * isSafe, isNotSafe, isNotSafeOr, isChinese, isNotChinese, isNotChineseOr,
    * isBlank, isNotBlank, isBlankOr, isNullOrBlank, isNotNullOrBlank, isNullOrBlankOr
    * isEmpty, isNotEmpty, isEmptyOr, isNullOrEmpty, isNotNullOrEmpty, isNullOrEmptyOr,
    * isDigit, isNotDigit, isNotDigitOr, isLetter, isNotLetter, isNotLetterOr,
    * isLetterOrDigit, isNotLetterOrDigit, isNotLetterOrDigitOr, orContains, andContains,
    * startsWith, endsWith, equals, orEmpty, orDefault, emptyToNull, blankToNull, remove,
    * capitalize, decapitalize, limit, pad, regionMatches, find, indexOf, substring, toByteArray
* Throwable: [Throwablex.java] ([Test][ThrowableTest.java]) | [Throwable.kt] ([Test][ThrowableTest.kt])
    * stackTraceToString

### security
* Digest: [Digestx.java] ([Test][DigestTest.java]) | [Digest.kt] ([Test][DigestTest.kt])
    * getDigest, getMD5, getMD5_16, getSHA1, getSHA256, getSHA512

### util
* Array: [Arrayx.java]
    * arrayOf, isEmpty, isNotEmpty, toTypedArray, toCollection, toList, toSet, toHashSet, asList, map, reverse, sort,
    * single, any, iterator, asIterable, groupBy, groupingBy, count, max, min, join, sum, plus, indices, indexOf,
    * contains, forEach, filter, zip, partition, all, first, last, find, get, elementAt, flatMap, average, none,
    * reduce, fold, intersect, subtract, drop, take, distinct, withIndex
* Array2: [Arrayx2.java]
    * contentHashCode, contentDeepEquals, contentDeepHashCode, contentDeepToString, contentToString,
    * contentEquals, binarySearch, copyOf, slice, associate
* Date: [Datex.java] ([Test][DateTest.java]) | [Date.kt] ([Test][DateTest.kt])
    * createCalendar, toDate, toMillisecond, format, getYear, getMonth, get\*, addYear, addMonth, add\*,
    * isSameYear, isSameMonth, isSame\*, differYear, differMonth, differ\*
* Base64: [Base64x.java] ([Test][Base64Test.java]) | [Base64.kt] ([Test][Base64Test.kt])
    * encode, urlEncode, mimeEncode, decode, urlDecode, mimeDecode,
* Collection: [Collectionx.java]
    * isEmpty, isNotEmpty, orEmpty, listOf, emptyList, collectionSizeOrDefault, filter, map, flatMap, join, count,
    * average, sum, first, last, find, get, max, min, addAll, removeAll, partition, toCollection, toList, toSet, toHashSet,
    * convertToSet, union, all, any, contains, forEach, chunked, minus, plus, group, sort, reverse, indexOf, fold,
    * reduce, slice, take, take, distinct, intersect, retainAll, associate, drop, single, elementAt, fill, shuffle
* Comparison: [Comparisonx.java]
    * compareValues, compareValuesBy, compareBy, compareByDescending, maxOf, minOf, areEqual
* Format: [Formatx.java] ([Test][FormatTest.java]) | [Format.kt] ([Test][FormatTest.kt])
    * formatDouble, formatFloat, percent, fileSize, mediumFileSize, shortFileSize,
    * totalTime, totalTimeShort, totalTimeZH, totalTimeZHShort, count
* Map: [Mapx.java]
    * mapCapacity, getOrPut
* Premise: [Premisex.java] ([Test][PremiseTest.java]) | [Premise.kt] ([Test][PremiseTest.kt])
    * require, requireNotNull, check, checkNotNull, requireSafe, requireNotSafe
    * requireFileExist, requireIsDir, requireIsFile, requireInRange, requireNotInRange
* Range: [Rangex.java] ([Test][RangeTest.java]) | [Range.kt] ([Test][RangeTest.kt])
    * rangeTo, until, downTo, downUntilTo,
    * yearRangeTo, monthRangeTo, \*RangeTo, yearDownTo, monthDownTo, * \*DownTo,
    * yearUntilTo, monthUntilTo, \*UntilTo, yearDownUntilTo, monthDownUntilTo, \*DownUntilTo
* Zip: [Zipx.java] ([Test][ZipTest.java]) | [Zip.kt] ([Test][ZipTest.kt])
    * compressionFilesTo, compressionDirTo, compressionDir, decompressionTo, decompression

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
[converage_java]: https://img.shields.io/badge/ConverageJava-24%25-orange.svg
[converage_kotlin]: https://img.shields.io/badge/ConverageKotlin-83%25-orange.svg

[CHANGELOG.md]: CHANGELOG.md

[Aesx.java]: javax/src/main/java/me/panpf/javax/crypto/Aesx.java
[AesTest.java]: javax/src/test/java/me/panpf/javax/test/crypto/AesTest.java
[Aes.kt]: javax-kt/src/main/java/me/panpf/javaxkt/crypto/Aes.kt
[AesTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/crypto/AesTest.kt

[Desx.java]: javax/src/main/java/me/panpf/javax/crypto/Desx.java
[DesTest.java]: javax/src/test/java/me/panpf/javax/test/crypto/DesTest.java
[Des.kt]: javax-kt/src/main/java/me/panpf/javaxkt/crypto/Des.kt
[DesTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/crypto/DesTest.kt

[Rsax.java]: javax/src/main/java/me/panpf/javax/crypto/Rsax.java
[RsaTest.java]: javax/src/test/java/me/panpf/javax/test/crypto/RsaTest.java
[Rsa.kt]: javax-kt/src/main/java/me/panpf/javaxkt/crypto/Rsa.kt
[RsaTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/crypto/RsaTest.kt

[Filex.java]: javax/src/main/java/me/panpf/javax/io/Filex.java
[FileTest.java]: javax/src/test/java/me/panpf/javax/test/io/FileTest.java
[File.kt]: javax-kt/src/main/java/me/panpf/javaxkt/io/File.kt
[FileTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/io/FileTest.kt

[IOStreamx.java]: javax/src/main/java/me/panpf/javax/io/IOStreamx.java
[IOStreamTest.java]: javax/src/test/java/me/panpf/javax/test/io/IOStreamTest.java
[IOStream.kt]: javax-kt/src/main/java/me/panpf/javaxkt/io/IOStream.kt
[IOStreamTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/io/IOStreamTest.kt

[Charx.java]: javax/src/main/java/me/panpf/javax/lang/Charx.java
[CharTest.java]: javax/src/test/java/me/panpf/javax/test/lang/CharTest.java
[Char.kt]: javax-kt/src/main/java/me/panpf/javaxkt/lang/Char.kt
[CharTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/lang/CharTest.kt

[Classx.java]: javax/src/main/java/me/panpf/javax/lang/Classx.java
[ClassTest.java]: javax/src/test/java/me/panpf/javax/test/lang/ClassTest.java
[Class.kt]: javax-kt/src/main/java/me/panpf/javaxkt/lang/Class.kt
[ClassTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/lang/ClassTest.kt

[Numberx.java]: javax/src/main/java/me/panpf/javax/lang/Numberx.java
[NumberTest.java]: javax/src/test/java/me/panpf/javax/test/lang/NumberTest.java
[Number.kt]: javax-kt/src/main/java/me/panpf/javaxkt/lang/Number.kt
[NumberTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/lang/NumberTest.kt

[Stringx.java]: javax/src/main/java/me/panpf/javax/lang/Stringx.java
[StringTest.java]: javax/src/test/java/me/panpf/javax/test/lang/StringTest.java
[String.kt]: javax-kt/src/main/java/me/panpf/javaxkt/lang/String.kt
[StringTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/lang/StringTest.kt

[Throwablex.java]: javax/src/main/java/me/panpf/javax/lang/Throwablex.java
[ThrowableTest.java]: javax/src/test/java/me/panpf/javax/test/lang/ThrowableTest.java
[Throwable.kt]: javax-kt/src/main/java/me/panpf/javaxkt/lang/Throwable.kt
[ThrowableTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/lang/ThrowableTest.kt

[Digestx.java]: javax/src/main/java/me/panpf/javax/security/Digestx.java
[DigestTest.java]: javax/src/test/java/me/panpf/javax/test/security/DigestTest.java
[Digest.kt]: javax-kt/src/main/java/me/panpf/javaxkt/security/Digest.kt
[DigestTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/security/DigestTest.kt

[Arrayx.java]: javax/src/main/java/me/panpf/javax/util/Arrayx.java
[ArrayTest.java]: javax/src/test/java/me/panpf/javax/test/util/ArrayTest.java
[Array.kt]: javax-kt/src/main/java/me/panpf/javaxkt/util/Array.kt
[ArrayTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/util/ArrayTest.kt

[Arrayx2.java]: javax/src/main/java/me/panpf/javax/util/Arrayx2.java
[Array2Test.java]: javax/src/test/java/me/panpf/javax/test/util/Array2Test.java
[Array2.kt]: javax-kt/src/main/java/me/panpf/javaxkt/util/Array2.kt
[Array2Test.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/util/Array2Test.kt

[Datex.java]: javax/src/main/java/me/panpf/javax/util/Datex.java
[DateTest.java]: javax/src/test/java/me/panpf/javax/test/util/DateTest.java
[Date.kt]: javax-kt/src/main/java/me/panpf/javaxkt/util/Date.kt
[DateTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/util/DateTest.kt

[Base64x.java]: javax/src/main/java/me/panpf/javax/util/Base64x.java
[Base64Test.java]: javax/src/test/java/me/panpf/javax/test/util/Base64Test.java
[Base64.kt]: javax-kt/src/main/java/me/panpf/javaxkt/util/Base64.kt
[Base64Test.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/util/Base64Test.kt

[Collectionx.java]: javax/src/main/java/me/panpf/javax/util/Collectionx.java
[CollectionTest.java]: javax/src/test/java/me/panpf/javax/test/util/CollectionTest.java
[Collection.kt]: javax-kt/src/main/java/me/panpf/javaxkt/util/Collection.kt
[CollectionTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/util/CollectionTest.kt

[Comparisonx.java]: javax/src/main/java/me/panpf/javax/util/Comparisonx.java
[ComparisonTest.java]: javax/src/test/java/me/panpf/javax/test/util/ComparisonTest.java
[Comparison.kt]: javax-kt/src/main/java/me/panpf/javaxkt/util/Comparison.kt
[ComparisonTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/util/ComparisonTest.kt

[Formatx.java]: javax/src/main/java/me/panpf/javax/util/Formatx.java
[FormatTest.java]: javax/src/test/java/me/panpf/javax/test/util/FormatTest.java
[Format.kt]: javax-kt/src/main/java/me/panpf/javaxkt/util/Format.kt
[FormatTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/util/FormatTest.kt

[Mapx.java]: javax/src/main/java/me/panpf/javax/util/Map.java
[MapTest.java]: javax/src/test/java/me/panpf/javax/test/util/MapTest.java
[Map.kt]: javax-kt/src/main/java/me/panpf/javaxkt/util/Map.kt
[MapTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/util/MapTest.kt

[Premisex.java]: javax/src/main/java/me/panpf/javax/util/Premisex.java
[PremiseTest.java]: javax/src/test/java/me/panpf/javax/test/util/PremiseTest.java
[Premise.kt]: javax-kt/src/main/java/me/panpf/javaxkt/util/Premise.kt
[PremiseTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/util/PremiseTest.kt

[Rangex.java]: javax/src/main/java/me/panpf/javax/util/Rangex.java
[RangeTest.java]: javax/src/test/java/me/panpf/javax/test/util/RangeTest.java
[Range.kt]: javax-kt/src/main/java/me/panpf/javaxkt/util/Range.kt
[RangeTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/util/RangeTest.kt

[Zipx.java]: javax/src/main/java/me/panpf/javax/util/Zipx.java
[ZipTest.java]: javax/src/test/java/me/panpf/javax/test/util/ZipTest.java
[Zip.kt]: javax-kt/src/main/java/me/panpf/javaxkt/util/Zip.kt
[ZipTest.kt]: javax-kt/src/test/java/me/panpf/javaxkt/test/util/ZipTest.kt
