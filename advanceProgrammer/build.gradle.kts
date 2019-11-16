plugins {
    application     // 应用插件
    kotlin("jvm") version "1.3.60"
}

// 应用
application {
    mainClassName = "Main"
}

// 依赖
dependencies {
    compile(kotlin("stdlib")) // 编译依赖kotlin标准库
//    compile group: 'commons-httpclient.wso2', name: 'commons-httpclient', version: '3.1.0.wso2v2'
    compile("commons-httpclient", "commons-httpclient", "3.1")
//    compile("org.springframework", "sprint-core", "4.3.9.RELEASE")
    testCompile("junit", "junit", "4.8.1")
}

repositories {
    mavenCentral()  // 下载仓库
    jcenter()       // 下载仓库
}

