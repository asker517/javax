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
* AESHelper: [Java 版][AESHelper_java]([测试用例][AESHelper_java_test]]) | [Kotlin 版][AESHelper_kotlin]([测试用例][AESHelper_kotlin_test])


### 更新日志

请查看 [CHANGELOG.md] 文件


### License
    Copyright (C) 2018 Peng fei Pan <sky@panpf.me>

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
[AESHelper_java]: https://github.com/panpf/javax/blob/master/javax/src/main/java/me/panpf/javax/crypto/AESHelper.java
[AESHelper_java_test]: https://github.com/panpf/javax/blob/master/javax/src/test/java/me/panpf/javax/crypto/AESHelperTest.java
[AESHelper_kotlin]: https://github.com/panpf/javax/blob/master/javax-kt/src/main/java/me/panpf/javaxkt/crypto/AESHelper.java
[AESHelper_kotlin_test]: https://github.com/panpf/javax/blob/master/javax-kt/src/test/java/me/panpf/javaxkt/crypto/AESHelperTest.kt
