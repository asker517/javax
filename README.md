# JAVAX

![Platform][platform_java_icon]
![Platform][platform_kotlin_icon]
![SourceCompatibility][source_compatibility_icon]
![TargetCompatibility][target_compatibility_icon]
[![License][license_image]][license_link]
![converage_java][converage_java]
![converage_kotlin][converage_kotlin]

Extensions to the Java standard library, some tool methods, and tool methods related to File, IO,
primitive types, String, Array, and Collection extracted from the Kotlin standard library (not available in the Kotlin version)

## Getting Started

### Java version：

Add the following to your `build.gradle` file

```grovvy
compile "me.panpf:javax:$lastVersion"
```

Please replace `$lastVersion` with the latest version: [![Download][VersionBadgeIcon]][VersionBadgeLink]

Dependencies：
* org.jetbrains:annotations: 13.0

### Kotlin version：

Add the following to your `build.gradle` file

```grovvy
compile "me.panpf:javax-kt:$lastVersion"
```

Dependencies：
* org.jetbrains.kotlin:kotlin-stdlib-jdk7: 1.2.50

Please replace `$lastVersion` with the latest version: [![Download][KTVersionBadgeIcon]][KTVersionBadgeLink]

`You can add Java or Kotlin versions to your project as needed. If your project is Java and Kotlin mixed development, then both versions can be imported, because there are different package names, so there will be no class duplicates.`

## Index

### crypto
* Aes: [Aesx.java] ([Test][AesTest.java]) | [Aes.kt] ([Test][AesTest.kt])
    * createKey, createKeyByPassword, keyFromBytes, keyFromBase64, encrypt, encryptToBase64, decrypt,
    decryptFromBase64, decryptToString, decryptToStringFromBase64,
* Des: [Desx.java] ([Test][DesTest.java]) | [Des.kt] ([Test][DesTest.kt])
    * createKeyByPassword, encrypt, encryptToBase64, decrypt, decryptFromBase64, decryptToString, decryptToStringFromBase64,
* Rsa: [Rsax.java] ([Test][RsaTest.java]) | [Rsa.kt] ([Test][RsaTest.kt])
    * createKey, pubKeyFromBase64, priKeyFromBase64, sign, signToBase64, verify, verifyFromBase64,
    encrypt, encryptToBase64, decrypt, decryptFromBase64, decryptToString, decryptToStringFromBase64

### io
* File: [Filex.java] ([Test][FileTest.java]) | [File.kt] ([Test][FileTest.kt])
    * mkdirsOrThrow, mkdirsCheck, createNewFileOrThrow, createNewFileCheck, cleanDir, lengthRecursively,
    listRecursively, listFilesRecursively, copyTo, copyRecursively, deleteRecursively, startsWith, endsWith,
    normalize, resolve, resolveSibling, createTempDir, createTempFile, getInvariantSeparatorsPath, getExtension,
    getNameWithoutExtension, toRelativeString, relative, getRootLength, getRootName, isRooted, toComponents,
    subPath, inputStream, reader, bufferedReader, readBytes, readText, readLines, useLines, forEachBlock,
    forEachLine, outputStream, writer, bufferedWriter, printWriter, writeBytes, appendBytes, writeText,
    appendText, walk, walkTopDown, walkBottomUp
* IOStream: [IOStreamx.java]
    * safeClose, byteInputStream, inputStream, reader, writer, buffered, bufferedReader, bufferedWriter,
    readBytes, readText, copyTo, lineSequence, useLines, forEachLine, readLines,

### lang
* Class: [Classx.java] ([Test][ClassTest.java]) | [Class.kt] ([Test][ClassTest.kt])
    * getFieldWithParent, getFieldsWithParent, getFieldValue, setFieldValue, getMethodWithParent, getMethodsWithParent,
    callMethod, getConstructorWithParent, getConstructorsWithParent, getClassHierarchy, isTypeArray, isTypeCollection
* Number: [Numberx.java] ([Test][NumberTest.java]) | [Number.kt] ([Test][NumberTest.kt])
    * scale, pad, coerceAtLeast, coerceAtMost, rangeTo, untilTo, downTo, downUntilTo, toByteOrDefault, toByteOrZero,
    toShortOrDefault, toShortOrZero, toIntOrDefault, toIntOrZero, toLongOrDefault, toLongOrZero,
    toFloatOrDefault, toFloatOrZero, toDoubleOrDefault, toDoubleOrZero
* String: [Stringx.java] ([Test][StringTest.java]) | [String.kt] ([Test][StringTest.kt])
    * isBlank, isNotBlank, isNullOrBlank, isNotNullOrBlank, isAllBlank, isAllNotBlank, isAllNullOrBlank, isAllNotNullOrBlank,
    isEmpty, isNotEmpty, isNullOrEmpty, isNotNullOrEmpty, isAllEmpty, isAllNotEmpty, isAllNullOrEmpty, isAllNotNullOrEmpty,
    isDigit, isChinese, isLetterOrDigit, startsWith, endsWith, equals, orEmpty, orDefault, emptyToNull, blankToNull,
    removeChar, removeFirstChar, removeLastChar, capitalize, decapitalize, limit, padStart, padEnd, regionMatches,
    findAnyOf, findLastAnyOf, indexOf, indexOfAny, lastIndexOf, lastIndexOfAny, substringBefore, substringBeforeLast,
    substringAfterLast, toByteArray, orContains, andContains
* Throwable: [Throwablex.java] ([Test][ThrowableTest.java]) | [Throwable.kt] ([Test][ThrowableTest.kt])
    * stackTraceToString

### security
* Digest: [Digestx.java] ([Test][DigestTest.java]) | [Digest.kt] ([Test][DigestTest.kt])
    * getDigest, getMD5, getMD5_16, getSHA1, getSHA256, getSHA512

### util
* Array: [Arrayx.java]
    * arrayOf, isEmpty, isNotEmpty, toTypedArray, toCollection, toList, toSet, toHashSet, asList,
    map, mapTo, mapIndexed, mapIndexedTo, mapNotNull, mapNotNullTo, mapIndexedNotNull, mapIndexedNotNullTo,
    reverse, reversed, reversedArray, sort, sortDescending, sortWith, sortBy, sortByDescending, sorted,
    sortedDescending, sortedWith, sortedWith, sortedBy, sortedByDescending, sortedArray, sortedArrayDescending, sortedArrayWith,
    single, singleOrNull, any, copyOf, copyOfRange, iterator, asIterable, groupBy, groupByTo, groupingBy, count, max, maxBy,
    maxWith, min, minBy, minWith, joinTo, joinToString, joinToArrayString, contentToString, sum, sumBy, sumByDouble,
    plus, plusElement, indices, indexOf, indexOfFirst, contains, forEach, forEachIndexed, filter, filterIndexed, filterIndexedTo,
    filterNot, filterNotNull, filterNotNullTo, filterNotTo, filterTo, zip, partition, all, first, firstOrNull, last, lastIndexOf, lastOrNull,
    find, findLast, getOrElse, getOrNull, elementAt, elementAtOrElse, elementAtOrNull, contentEquals, flatMap,
    flatMapTo, average, none, reduce, reduceIndexed, reduceRight, reduceRightIndexed, fold, foldIndexed, foldRight,
    foldRightIndexed, intersect, subtract, binarySearch, drop, take, slice
* Base64: [Base64x.java] ([Test][Base64Test.java]) | [Base64.kt] ([Test][Base64Test.kt])
    * encodeToString, encodeToBytes, encodeTo, encodeToBuffer, urlEncodeToString, urlEncodeToBytes, urlEncodeTo, urlEncodeToBuffer,
    mimeEncodeToString, mimeEncodeToBytes, mimeEncodeTo, mimeEncodeToBuffer, decodeToBytes, decodeToString, decodeTo, decodeToBuffer,
    urlDecodeToBytes, urlDecodeToString, urlDecodeTo, urlDecodeToBuffer, mimeDecodeToBytes, mimeDecodeToString, mimeDecodeTo, mimeDecodeToBuffer,
* Collection: [Collectionx.java]
    * isEmpty, isNotEmpty, orEmpty, listOf, emptyList, collectionSizeOrDefault, filterTo, filterNotTo, filterNotNullTo,
    filterIndexedTo, filterIsInstanceTo, filter, filterNot, filterNotNull, filterIndexed, filterIsInstance, filterInPlace,
    mapTo, map, mapIndexedTo, mapIndexed, mapNotNullTo, mapNotNull, mapIndexedNotNullTo, mapIndexedNotNull, flatMapTo,
    flatMap, joinTo, joinToString, joinToArrayString, count, average, sum, sumBy, sumByDouble, first, firstOrNull, last,
    lastIndexOf, lastOrNull, find, findLast, getOrElse, getOrNull, max, maxBy, maxWith, min, minBy, minWith, addAll, removeAll,
    partition, toCollection, toList, toSet, toSortedSet, toHashSet, safeToConvertToSet, convertToSetForSetOperationWith,
    convertToSetForSetOperation, union, all, any, contains, forEach, forEachIndexed, chunked, minus, minusElement, plus,
    plusElement, groupByTo, groupBy, groupingBy, sortWith, sortBy, sortByDescending, sortedWith, sortedBy, sortedByDescending,
    reverse, indexOf, indexOfFirst, indexOfLast, fold, foldIndexed, foldRight, foldRightIndexed, reduce, reduceIndexed, reduceRight,
    reduceRightIndexed, slice, take, takeLast, takeLastWhile, takeWhile, distinct, distinctBy, intersect, retainAll, associateTo,
    associate, associateByTo, associateBy, drop, dropLast, dropLastWhile, dropWhile, single, singleOrNull, elementAtOrElse,
    elementAt, elementAtOrNull, fill, shuffle, shuffled
* Comparison: [Comparisonx.java]
    * compareValues, compareValuesBy, compareBy, compareByDescending, maxOf, minOf
* Format: [Formatx.java] ([Test][FormatTest.java]) | [Format.kt] ([Test][FormatTest.kt])
    * formatDouble, formatFloat, percent, fileSize, mediumFileSize, shortFileSize, totalTime
* Map: [Mapx.java]
    * mapCapacity, getOrPut
* Premise: [Premisex.java] ([Test][PremiseTest.java]) | [Premise.kt] ([Test][PremiseTest.kt])
    * checkInRange, checkNotInRange, requireNonNull, require, requireFileExist, requireIsDir, requireIsFile, requireNoNulls, areEqual
* Zip: [Zipx.java] ([Test][ZipTest.java]) | [Zip.kt] ([Test][ZipTest.kt])
    * compressionFilesTo, compressionDirTo, compressionDir, decompressionTo, decompression

## Change log

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
[platform_kotlin_icon]: https://img.shields.io/badge/Platform-Kotlin-blue.svg
[license_image]: https://img.shields.io/badge/License-Apache%202-blue.svg
[license_link]: https://www.apache.org/licenses/LICENSE-2.0
[VersionBadgeIcon]: https://api.bintray.com/packages/panpf/maven/javax/images/download.svg
[VersionBadgeLink]:https://bintray.com/panpf/maven/javax/_latestVersion
[KTVersionBadgeIcon]: https://api.bintray.com/packages/panpf/maven/javax-kt/images/download.svg
[KTVersionBadgeLink]:https://bintray.com/panpf/maven/javax-kt/_latestVersion
[CHANGELOG.md]: CHANGELOG.md
[source_compatibility_icon]: https://img.shields.io/badge/SourceCompatibility-1.7-red.svg
[target_compatibility_icon]: https://img.shields.io/badge/TargetCompatibility-1.7-red.svg
[converage_java]: https://img.shields.io/badge/ConverageJava-24%25-orange.svg
[converage_kotlin]: https://img.shields.io/badge/ConverageKotlin-74%25-orange.svg

[Aesx.java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/crypto/Aesx.java
[AesTest.java]: https://github.com/panpf/javax/blob/master/javax/src/test/java/me/panpf/javax/test/crypto/AesTest.java
[Aes.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/main/java/me/panpf/javaxkt/crypto/Aes.kt
[AesTest.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/test/java/me/panpf/javaxkt/test/crypto/AesTest.kt

[Desx.java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/crypto/Desx.java
[DesTest.java]: https://github.com/panpf/javax/blob/master/javax/src/test/java/me/panpf/javax/test/crypto/DesTest.java
[Des.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/main/java/me/panpf/javaxkt/crypto/Des.kt
[DesTest.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/test/java/me/panpf/javaxkt/test/crypto/DesTest.kt

[Rsax.java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/crypto/Rsax.java
[RsaTest.java]: https://github.com/panpf/javax/blob/master/javax/src/test/java/me/panpf/javax/test/crypto/RsaTest.java
[Rsa.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/main/java/me/panpf/javaxkt/crypto/Rsa.kt
[RsaTest.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/test/java/me/panpf/javaxkt/test/crypto/RsaTest.kt

[Filex.java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/io/Filex.java
[FileTest.java]: https://github.com/panpf/javax/blob/master/javax/src/test/java/me/panpf/javax/test/io/FileTest.java
[File.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/main/java/me/panpf/javaxkt/io/File.kt
[FileTest.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/test/java/me/panpf/javaxkt/test/io/FileTest.kt

[IOStreamx.java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/io/IOStreamx.java

[Classx.java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/lang/Classx.java
[ClassTest.java]: https://github.com/panpf/javax/blob/master/javax/src/test/java/me/panpf/javax/test/lang/ClassTest.java
[Class.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/main/java/me/panpf/javaxkt/lang/Class.kt
[ClassTest.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/test/java/me/panpf/javaxkt/test/lang/ClassTest.kt

[Numberx.java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/lang/Numberx.java
[NumberTest.java]: https://github.com/panpf/javax/blob/master/javax/src/test/java/me/panpf/javax/test/lang/NumberTest.java
[Number.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/main/java/me/panpf/javaxkt/lang/Number.kt
[NumberTest.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/test/java/me/panpf/javaxkt/test/lang/NumberTest.kt

[Stringx.java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/lang/Stringx.java
[StringTest.java]: https://github.com/panpf/javax/blob/master/javax/src/test/java/me/panpf/javax/test/lang/StringTest.java
[String.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/main/java/me/panpf/javaxkt/lang/String.kt
[StringTest.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/test/java/me/panpf/javaxkt/test/lang/StringTest.kt

[Throwablex.java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/lang/Throwablex.java
[ThrowableTest.java]: https://github.com/panpf/javax/blob/master/javax/src/test/java/me/panpf/javax/test/lang/ThrowableTest.java
[Throwable.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/main/java/me/panpf/javaxkt/lang/Throwable.kt
[ThrowableTest.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/test/java/me/panpf/javaxkt/test/lang/ThrowableTest.kt

[Digestx.java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/security/Digestx.java
[DigestTest.java]: https://github.com/panpf/javax/blob/master/javax/src/test/java/me/panpf/javax/test/security/DigestTest.java
[Digest.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/main/java/me/panpf/javaxkt/security/Digest.kt
[DigestTest.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/test/java/me/panpf/javaxkt/test/security/DigestTest.kt

[Arrayx.java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/util/Arrayx.java

[Base64x.java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/util/Base64x.java
[Base64Test.java]: https://github.com/panpf/javax/blob/master/javax/src/test/java/me/panpf/javax/test/util/Base64Test.java
[Base64.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/main/java/me/panpf/javaxkt/util/Base64.kt
[Base64Test.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/test/java/me/panpf/javaxkt/test/util/Base64Test.kt

[Collectionx.java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/util/Collectionx.java

[Comparisonx.java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/util/Comparisonx.java

[Formatx.java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/util/Formatx.java
[FormatTest.java]: https://github.com/panpf/javax/blob/master/javax/src/test/java/me/panpf/javax/test/util/FormatTest.java
[Format.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/main/java/me/panpf/javaxkt/util/Format.kt
[FormatTest.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/test/java/me/panpf/javaxkt/test/util/FormatTest.kt

[Mapx.java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/util/Mapx.java

[Premisex.java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/util/Premisex.java
[PremiseTest.java]: https://github.com/panpf/javax/blob/master/javax/src/test/java/me/panpf/javax/test/util/PremiseTest.java
[Premise.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/main/java/me/panpf/javaxkt/util/Premise.kt
[PremiseTest.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/test/java/me/panpf/javaxkt/test/util/PremiseTest.kt

[Zipx.java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/util/Zipx.java
[ZipTest.java]: https://github.com/panpf/javax/blob/master/javax/src/test/java/me/panpf/javax/test/util/ZipTest.java
[Zip.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/main/java/me/panpf/javaxkt/util/Zip.kt
[ZipTest.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/test/java/me/panpf/javaxkt/test/util/ZipTest.kt
