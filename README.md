# JAVAX

![Platform][platform_java_icon]
![Platform][platform_kotlin_icon]
[![License][license_image]][license_link]

对 Java 标准库的扩展，提供一些工具方法，以及从 Kotlin 标准库中提取的 File、IO、基本类型、String、Array、Collection 相关的工具方法（Kotlin 版本没有）

### 导入

#### Java 版：
```grovvy
compile "me.panpf:javax:$lastVersion"
```

请自行替换 `$lastVersion` 为最新的版本 [![Download][VersionBadgeIcon]][VersionBadgeLink]

依赖：
* org.jetbrains:annotations: 13.0

#### Kotlin 版：

```grovvy
compile "me.panpf:javax-kt:$lastVersion"
```

依赖：
* org.jetbrains.kotlin:kotlin-stdlib-jdk8: 1.2.31
* org.jetbrains:annotations: 13.0
* me.panpf:[kotlinx][kotlinx]: 0.2

请自行替换 `$lastVersion` 为最新的版本 [![Download][KTVersionBadgeIcon]][KTVersionBadgeLink]

你可以根据需要选择一个版本导入，如果你的项目是 Java 加 Kotlin 混合开发的那么两个版本都可以导入，因为两个版本采用了不同的包名所以不会有类重复问题

### 索引

#### Crypto
* Aes: [Aesx.java] ([Test][AesTest.java]) | [Aes.kt] ([Test][AesTest.kt])
* Des: [Desx.java] ([Test][DesTest.java]) | [Des.kt] ([Test][DesTest.kt])
* Rsa: [Rsax.java] ([Test][RsaTest.java]) | [Rsa.kt] ([Test][RsaTest.kt])

#### IO
* File: [Filex.java] ([Test][FileTest.java]) | [File.kt] ([Test][FileTest.kt])
* IOStream: [IOStreamx.java]

#### Lang
* Class: [Classx.java] ([Test][ClassTest.java]) | [Class.kt] ([Test][ClassTest.kt])
* Int: [Intx.java]
* String: [Stringx.java] ([Test][StringTest.java]) | [String.kt] ([Test][StringTest.kt])

#### Security
* Digest: [Digestx.java] ([Test][DigestTest.java]) | [Digest.kt] ([Test][DigestTest.kt])

#### Util
* Array: [Arrayx.java]
* Base64: [Base64x.java] ([Test][Base64Test.java]) | [Base64.kt] ([Test][Base64Test.kt])
* Collection: [Collectionx.java]
* Comparison: [Comparisonx.java]
* Format: [Formatx.java] ([Test][FormatTest.java]) | [Format.kt] ([Test][FormatTest.kt])
* Map: [Mapx.java]
* Premise: [Premisex.java]
* Zip: [Zipx.java] ([Test][ZipTest.java]) | [Zip.kt] ([Test][ZipTest.kt])

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
[license_image]: https://img.shields.io/badge/License-Apache%202-blue.svg
[license_link]: https://www.apache.org/licenses/LICENSE-2.0
[VersionBadgeIcon]: https://api.bintray.com/packages/panpf/maven/javax/images/download.svg
[VersionBadgeLink]:https://bintray.com/panpf/maven/javax/_latestVersion
[KTVersionBadgeIcon]: https://api.bintray.com/packages/panpf/maven/javax-kt/images/download.svg
[KTVersionBadgeLink]:https://bintray.com/panpf/maven/javax-kt/_latestVersion
[CHANGELOG.md]: CHANGELOG.md
[kotlinx]: https://github.com/panpf/kotlinx

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

[Intx.java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/lang/Intx.java

[Stringx.java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/lang/Stringx.java
[StringTest.java]: https://github.com/panpf/javax/blob/master/javax/src/test/java/me/panpf/javax/test/lang/StringTest.java
[String.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/main/java/me/panpf/javaxkt/lang/String.kt
[StringTest.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/test/java/me/panpf/javaxkt/test/lang/StringTest.kt

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

[Zipx.java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/util/Zipx.java
[ZipTest.java]: https://github.com/panpf/javax/blob/master/javax/src/test/java/me/panpf/javax/test/util/ZipTest.java
[Zip.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/main/java/me/panpf/javaxkt/util/Zip.kt
[ZipTest.kt]: https://github.com/panpf/javax/blob/master/javax-kt/src/test/java/me/panpf/javaxkt/test/util/ZipTest.kt
