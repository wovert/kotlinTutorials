plugins {
    application // 应用程序插件
//    java  // java插件
//    war     // war插件
    kotlin("jvm") version "1.3.60"
}

application {
    mainClassName = "Test" // 主类名称
}

dependencies {
    compile(kotlin("stdlib"))
}

repositories {
    jcenter()
}

// 自定义任务
task("helloworld", {
    println("hello world!")
})

task("helloworld2", {
    println("hello world2!")
})

task("closedoor") {
    doFirst {
        println("关闭冰箱")
    }

}.dependsOn("putelephant") // 依赖putelephant

task("opendoor") {
    var num = 10;
    println("扫描时执行" + num)
    doFirst {
        println("打开冰箱") // 运行时执行
    }
}

task("putelephant") {
    doFirst {
        println("大象放入冰箱内")
    }

}.dependsOn("opendoor") // 依赖opendoor



// task声明周期
// 扫描：执行整个任务脚本内容
// 执行：执行具体任务

// 纪录所有源代码文件名称，增量式更新（第二次更新没有输入或输出变化编译话费0s）
task("getSrcName") {
    inputs.dir("src") // 输入
    outputs.file("info.txt") // 输出
    doFirst {
        var srcDir = fileTree("src")
        var infoTxt = file("info.txt")
        infoTxt.writeText("")
        srcDir.forEach {
            if (it.isFile) {
                Thread.sleep(1000) // 1s
                infoTxt.appendText(it.absolutePath)
                infoTxt.appendText("\n")
            }
        }
    }
}