# JAVAX

![Platform][platform_java_icon]
![Platform][platform_kotlin_icon]

对 Java 标准库的扩展，提供一些工具方法，以及从 Kotlin 标准库中提取的 File、IO、基本类型、String、Array、Collection 相关的工具方法（Kotlin 版本没有）

### 导入

Java 版：
```grovvy
compile "me.panpf:javax:$lastVersion"
```

请自行替换 `$lastVersion` 为最新的版本 [![Download][VersionBadgeIcon]][VersionBadgeLink]

Kotlin 版：

```grovvy
compile "me.panpf:javax-kt:$lastVersion"
```

请自行替换 `$lastVersion` 为最新的版本 [![Download][KTVersionBadgeIcon]][KTVersionBadgeLink]

你可以根据需要选择一个版本导入，如果你的项目是 Java 加 Kotlin 混合开发的那么两个版本都可以导入，因为两个版本采用了不同的包名所以不会有类重复问题

### 目录

#### Crypto
* Aes: [Java][Aes_java] ([Test][Aes_java_test]) | [Kotlin][Aes_kotlin] ([Test][Aes_kotlin_test])
* Des: [Java][Des_java] ([Test][Des_java_test]) | [Kotlin][Des_kotlin] ([Test][Des_kotlin_test])
* Rsa: [Java][Rsa_java] ([Test][Rsa_java_test]) | [Kotlin][Rsa_kotlin] ([Test][Rsa_kotlin_test])

#### IO
* File: [Java][File_java] ([Test][File_java_test]) | [Kotlin][File_kotlin] ([Test][File_kotlin_test])
* IOStream: [Java][IOStream_java]

#### Lang
* Class: [Java][Class_java] ([Test][Class_java_test]) | [Kotlin][Class_kotlin] ([Test][Class_kotlin_test])
* Int: [Java][Int_java]
* String: [Java][String_java] ([Test][String_java_test]) | [Kotlin][String_kotlin] ([Test][String_kotlin_test])

#### Security
* Digest: [Java][Digest_java] ([Test][Digest_java_test]) | [Kotlin][Digest_kotlin] ([Test][Digest_kotlin_test])

#### Util
* Array: [Java][Array_java]
* Base64: [Java][Base64_java] ([Test][Base64_java_test]) | [Kotlin][Base64_kotlin] ([Test][Base64_kotlin_test])
* Collection: [Java][Collection_java]
* Comparison: [Java][Comparison_java]
* Format: [Java][Format_java] ([Test][Format_java_test]) | [Kotlin][Format_kotlin] ([Test][Format_kotlin_test])
* Map: [Java][Map_java]
* Premise: [Java][Premise_java]
* Zip: [Java][Zip_java] ([Test][Zip_java_test]) | [Kotlin][Zip_kotlin] ([Test][Zip_kotlin_test])

### 更新日志

请查看 [CHANGELOG.md] 文件


### License
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
[VersionBadgeIcon]: https://api.bintray.com/packages/panpf/maven/javax/images/download.svg
[VersionBadgeLink]:https://bintray.com/panpf/maven/javax/_latestVersion
[KTVersionBadgeIcon]: https://api.bintray.com/packages/panpf/maven/javax-kt/images/download.svg
[KTVersionBadgeLink]:https://bintray.com/panpf/maven/javax-kt/_latestVersion
[CHANGELOG.md]: CHANGELOG.md

[Aes_java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/crypto/Aesx.java
[Aes_java_test]: https://github.com/panpf/javax/blob/master/javax/src/test/java/me/panpf/javax/crypto/AesTest.java
[Aes_kotlin]: https://github.com/panpf/javax/blob/master/javax-kt/src/main/java/me/panpf/javaxkt/crypto/Aes.kt
[Aes_kotlin_test]: https://github.com/panpf/javax/blob/master/javax-kt/src/test/java/me/panpf/javaxkt/crypto/AesTest.kt

[Des_java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/crypto/Desx.java
[Des_java_test]: https://github.com/panpf/javax/blob/master/javax/src/test/java/me/panpf/javax/crypto/DesTest.java
[Des_kotlin]: https://github.com/panpf/javax/blob/master/javax-kt/src/main/java/me/panpf/javaxkt/crypto/Des.kt
[Des_kotlin_test]: https://github.com/panpf/javax/blob/master/javax-kt/src/test/java/me/panpf/javaxkt/crypto/DesTest.kt

[Rsa_java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/crypto/Rsax.java
[Rsa_java_test]: https://github.com/panpf/javax/blob/master/javax/src/test/java/me/panpf/javax/crypto/RsaTest.java
[Rsa_kotlin]: https://github.com/panpf/javax/blob/master/javax-kt/src/main/java/me/panpf/javaxkt/crypto/Rsa.kt
[Rsa_kotlin_test]: https://github.com/panpf/javax/blob/master/javax-kt/src/test/java/me/panpf/javaxkt/crypto/RsaTest.kt

[File_java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/io/Filex.java
[File_java_test]: https://github.com/panpf/javax/blob/master/javax/src/test/java/me/panpf/javax/io/FileTest.java
[File_kotlin]: https://github.com/panpf/javax/blob/master/javax-kt/src/main/java/me/panpf/javaxkt/io/File.kt
[File_kotlin_test]: https://github.com/panpf/javax/blob/master/javax-kt/src/test/java/me/panpf/javaxkt/io/FileTest.kt

[IOStream_java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/io/IOStreamx.java

[Class_java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/lang/Classx.java
[Class_java_test]: https://github.com/panpf/javax/blob/master/javax/src/test/java/me/panpf/javax/lang/ClassTest.java
[Class_kotlin]: https://github.com/panpf/javax/blob/master/javax-kt/src/main/java/me/panpf/javaxkt/lang/Class.kt
[Class_kotlin_test]: https://github.com/panpf/javax/blob/master/javax-kt/src/test/java/me/panpf/javaxkt/lang/ClassTest.kt

[Int_java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/lang/Intx.java

[String_java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/lang/Stringx.java
[String_java_test]: https://github.com/panpf/javax/blob/master/javax/src/test/java/me/panpf/javax/lang/StringTest.java
[String_kotlin]: https://github.com/panpf/javax/blob/master/javax-kt/src/main/java/me/panpf/javaxkt/lang/String.kt
[String_kotlin_test]: https://github.com/panpf/javax/blob/master/javax-kt/src/test/java/me/panpf/javaxkt/lang/StringTest.kt

[Digest_java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/security/Digestx.java
[Digest_java_test]: https://github.com/panpf/javax/blob/master/javax/src/test/java/me/panpf/javax/security/DigestTest.java
[Digest_kotlin]: https://github.com/panpf/javax/blob/master/javax-kt/src/main/java/me/panpf/javaxkt/security/Digest.kt
[Digest_kotlin_test]: https://github.com/panpf/javax/blob/master/javax-kt/src/test/java/me/panpf/javaxkt/security/DigestTest.kt

[Array_java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/util/Arrayx.java

[Base64_java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/util/Base64x.java
[Base64_java_test]: https://github.com/panpf/javax/blob/master/javax/src/test/java/me/panpf/javax/util/Base64Test.java
[Base64_kotlin]: https://github.com/panpf/javax/blob/master/javax-kt/src/main/java/me/panpf/javaxkt/util/Base64.kt
[Base64_kotlin_test]: https://github.com/panpf/javax/blob/master/javax-kt/src/test/java/me/panpf/javaxkt/util/Base64Test.kt

[Collection_java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/util/Collectionx.java

[Comparison_java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/util/Comparisonx.java

[Format_java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/util/Formatx.java
[Format_java_test]: https://github.com/panpf/javax/blob/master/javax/src/test/java/me/panpf/javax/util/FormatTest.java
[Format_kotlin]: https://github.com/panpf/javax/blob/master/javax-kt/src/main/java/me/panpf/javaxkt/util/Format.kt
[Format_kotlin_test]: https://github.com/panpf/javax/blob/master/javax-kt/src/test/java/me/panpf/javaxkt/util/FormatTest.kt

[Map_java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/util/Mapx.java

[Premise_java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/util/Premisex.java

[Zip_java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/util/Zipx.java
[Zip_java_test]: https://github.com/panpf/javax/blob/master/javax/src/test/java/me/panpf/javax/util/ZipTest.java
[Zip_kotlin]: https://github.com/panpf/javax/blob/master/javax-kt/src/main/java/me/panpf/javaxkt/util/Zip.kt
[Zip_kotlin_test]: https://github.com/panpf/javax/blob/master/javax-kt/src/test/java/me/panpf/javaxkt/util/ZipTest.kt
