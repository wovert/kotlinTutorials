# Kotlin

## IntelliJ Idea 快捷键

- `Alt + Enter`: 去除数据类型关键子自动推导
- `Shift + Command + a`: Mac 截图
- `Control + Shift + p`: 显示数据类型

## Kotlin 是什么

> Andrey 开发的Android开发语言。Kotlin是全栈开发语言

可以运行在 Java JVM，Android，浏览器上的静态语言。与Java 100%兼容。除了自己的标准库之外，仍然可以使用经典的Java集合框架。


- Android 官方开发语言
- 100% 兼容 Java
- Kotlin-Js 前段开发（运行在浏览器上）
- Kotlin-JVM 服务端开发
- Kotlin-Native 本地执行程序（编译成机器码运行在系统上）

## Kotlin 发展历程

- 2010 立项
- 2011.6 对外公开
- 2012.2 开源
- 2013.8 支持Android Studio
- 2014.6 全新的开源Web站点和域名 [kotlinlang.org](http://kotlinlang.org)
- 2016.2 发布 1.0
- 2016.9 发布 1.0.4 支持 apt

## 开发环境搭建

### 命令行编译器

- 直接下载
- 包管理工具
  - Linux: SDKMAN
  - Mac OSX: Homebrew
  - Windows: Scoop

- 常用命令
  - kotlin: 运行脚本/REPL
  - kotlinc: 编译 kotlin 源码
    
### IntelliJ IDEA

- 内置 kotlin插件，无需安装

## 参考资料

- [官方文档](https://kotlinlang.org/docs/reference/)
- [Kotlin源码](https://github.com/JetBrains/kotlin)
- [Kotlin 官博](https://blog.jetbrains.com/kotlin/)
- Kotlin 微信公众号：Kotlin
- [Gradle 文档](https://docs.gradle.org/current/userguide/userguide.html)

## 如何学习Kotlin

- 语言特性
- 案例演示
- 对比Java
- 字节码分析

## Kotlin编译器使用与反编译

1. 下载 Kotlin 编译器：[kotlin-compiler-1.5.20.zip](https://github.com/JetBrains/kotlin/releases/tag/v1.5.20)
2. 配置环境变量 PATH
3. 编写Kotlin文件 HelloWorld.kt
4. 编译 `# kotlinc HelloWorld.kt`
5. 运行 `# kotlin HelloWorldKt`
6. 反编译 `# javap HelloWorldKt.class` or `# javap -c HelloKotlinKt.class`

- 生成jar包：`# kotlinc HelloWorld.kt -include-runtime -d HelloWorld.jar`
- 运行jar包：`# java -jar HelloWorld.jar`

## 目录

1. Kotlin 介绍——开发环境搭建
2. 基础语言——基本类型/空安全类型/智能转换/类与对象初步/数组与区间
3. 程序结构——常量与变量/函数/Lambda/类成员/条件表达式/循环语句/运算符/异常捕获
4. 面向对象——抽象类和接口/object/伴生对象/扩展方法/属性代理/数据类/内部类/枚举和密封类
5. 高阶函数——常见高阶函数/尾递归优化/闭包/函数复合/科里化/偏函数
6. DSL——基本概念/案例开发/Gradle 脚本
7. 协程——基本概念/协程的使用/封装协程库/协程原理分析
8. 与Java混编——基本互操作/正则表达式/集合框架/IO操作/装箱与拆箱/NoArg插件/AllOpen插件/注解处理器
9. 应用于展望——前景与展望/编写脚本/服务端/前段/Android/Native

## java工程转为kotlin工程

1. 工程目录下**build.gradle**文件中添加 `dependencies { classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.50"`
2. app目录下**build.gradle**文件中添加 `apply plugin: 'kotlin-android'
   dependencies {
       // 添加标准库
       implementation 'org.jetbrains.kotlin:kotlin-stdlib:1.3.50'
`
3. 点击 Sync Now

## Grandle

> 灵活高效且支持多语言平台的构建工具

- Ant
  - XML 配置
  - 手动管理依赖
- Maven
  - XML 配置
  - 中央仓库
  - 自动管理以来
- Gradle
  - Groovy/Kotlin
  - 支持多种仓库
  - 易扩展高性能
   
### 安装 Gradle

1. 直接安装
2. 通过包管理工具
- SDKMAN: sdk install gradle
- Homebrew: brew install gradle
3. Gradle Wrapper
- 每个 Gradle工程可以灵活配置 Gradle版本
- 无需手动下载安装，配置版本即可自动下载

- gradle/wrapper/gradle-wrapper.properties 的 `distributionUrl=https\://services.gradle.org/distributions/gradle-6.1.1-all.zip`

### Gradle工程

- build.gradle 根工程配置（仓库在哪里，使用哪个编译器）
- gradle.properties 属性配置文件，值会添加到 project当中
- settings.gradle 工程初始化配置文件

### gradle配置

- gradle配置
  - 构建插件仓库 -> 去哪儿找构建插件
  - 构建插件配置 -> 找哪些构建插件
  - 工程依赖仓库 -> 去哪儿找工程依赖
  - 工程依赖配置 -> 找哪些工程依赖
  - 任务管理 -> 如何构建

## 变量

### 声明变量

```kt
修饰符 变量 数据类型 = 变量值
val flag:Datatype = "value"
```

### 修饰符

- `val`: 只读变量
- `var`: 读写变量

### 类型自动推导

```kt
var a = 2 // java: int a = 2;
val b = "Hello Kotlink" // java: final String b = "hello Java"
```

### Long类型标记

```kt
long c = 123490L; // 0000
```

### 数值类型转换

```kt
var e:Int = 10
var f:Long = e.toLong()
```

## 数据类型

### 无符号类型

> Kotlin需要兼容**C语言**

无| 有符号类型  | 无符号类型
---- | ----- | ------  
字节  | Byte | UByte 
短整型  | Short | UShort
整型  | Int | UInt
长整型  | Long | ULong
字符串  | String | String

### 布尔类型

``` kt
var flag: Boolean = true
```
### Number类型

- 浮点型
  - Double: 64bit
  - Float: 32bit
 - 整型
   - Long: 64bit
   - Int: 32bit
   - Short: 16bit
 - 字节
   - Byte: 8bit

 ### Char 类型

 - 字符对应 Java 的 Character
 - 占两个字节，表示一个16位的 Unicode 字符
 - 字符用单引号 '' 引起来，例如：'a','0','\n'


### 数组基本类型

无| Kotlin  | Java
---- | ----- | ------  
整型  | `IntArray` | int[]
整型装箱  | `Array<Int>` | Integer[]
字符  | `CharArray` | char[]
字符装箱  | `Array<Char>` | Character[]
字符串  | `Array<String>` | String[]

- 基本类型：IntArray, FloatArray, CharArray
- 引用类型：Array<String>, Array<Char>, Array<Int>

#### 数组的创建

```kt
var c0 = intArrayOf(1,2,3,4,5)
var c1 = IntArray(5){it + 1} // it的值得数组下标
println(c0.size) // 数组长度
println(c1.indices) // 数组
```

### 区间

```kt
val intRange = 1..10 // [1,10]
val charRange = 'a'..'z'
val longRange = 1L..100L 
```

### 集合框架

- List/Map/Set
- Pair & Triple

无| Kotlin  | Java
---- | ----- | ------  
不可变 List  | `List<T>` | List<T>
可变List  | `MutableList<T>` | List<T>
不可变 Map  | `Map<K,V>` | Map<K,V>
可变 Map  | `MutableMap<K,V>` | Map<K,V>
不可变 Set  | `Set<T>` | Set<T>
可变 Set  | `MutableSet<T>` | Set<T>

### 集合实现类复用与类型别名

- typealias ArrayList<E> = java.util.ArrayList<E>
- typealias LinkedHashMap<K, V> = java.util.LinkedHashMap<K, V>
- typealias HashMap<K, V> = java.util.HashMap<K, V>
- typealias LinkedHashSet<E> = java.util.LinkedHashSet<E>
- typealias HashSet<E> = java.util.HashSet<E>

### pair
```kt
val pair = "hello" to "kotlin"
val pair2 = Pair("Hello", "kotlink")
val first = pair.first
val second = pair.second
val (x,y) = pair2
```

## 函数

### 函数的定义

```kt
// main: 函数名
// args: Array<String> 函数参数列表
// Unit: 函数返回值
fun main(args Array<String>):Unit {
  println(args.contentToString())
}
```

### 函数类型

- `fun foo(){}` => `() -> Unit`
- `fun foo(p:Int):String { ... }` => `(Int) -> String`
- `class Foo { fun bar(p1:String, p2:Long): Any { ... } }` 
  => `Foo.(String, Long) -> Any`, `(Foo, String, Long) -> Any`, `Function3<Foo, String, Long, Any>`
  - Foo就是Bar方法的receiver(接收器)

### 函数的引用
> 类似C语言中的函数指针，可用于函数传递

- `fun foo() {}` => `::foo` = `val f:() -> Unit = ::foo`
- `fun foo(p:Int):string {}` => `::foo` = `val g:(Int) -> String = ::foo`
- `class Foo { fun bar(p1:String, p2:Long): Any { ... } }`
  => `Foo::bar` = `val h:(Foo, String, Long) -> Any = Foo::bar`
  
### 变长参数

```kt
fun main(vararg args:String) {
    println(args.contentToString())
}
```

### 多返回值

```kt
fun multiReturnValues(): Triple<Int, Long, Double> {
    return Triple(1, 3L, 4.0)
}
```

### 默认参数

```kt
fun defaultParameter(x:Int, y:String, z:Long = 0L) {
ToDO
}
defaultParameter(5, "hello")
```

### 具名参数

```kt
fun f(x:Int = 5, y:String, z:Long = 0L) {}

f(y = "hello")
```

## 类

- 属性必须初始化


## 空类型

```kt
var nullable:Stirng? = "hello"
nullable = null // 可空类型
val length = nullable.length // 可能触发空指针，编译错误
```

## lambda

- 匿名函数
- 写法：`{[参数列表]->[函数体，最后一行是返回值]}`

`val sum = {a:Int, b:Int -> a + b}`

- `() -> Unit` 无参，返回值为 Unit
- `(Int) -> Int` 传入整型，返回一个整型
- `(String, (String)->String) -> Boolean` 传入字符串，Lambda表达式，返回Boolean

- 函数参数调用时最后一个Lambda可以移出去
- 函数参数只有一个Lambda，调用时小括号可省略
- Lambda只有一个参数可以默认为 `it`
- 入参，返回值与形式参数一致的函数可以用函数引用的方式作为实参传入

## 类


### 构造器

- 主构造器
  - init 块
  - 属性初始化
- 副构造器
  - 不定义构造器
  - 主构造器默认参数
- 工厂函数

`
// var age:int 构造器参数，同时定义类属性；类内部全局可见
// name:String 普通的构造器参数；构造器内可见(init块，属性初始化)
class Person(var age:Int, name: String) {
  var name:String
  val firstName: String?
  // init 块类似于注构造器的方法体
  init {
    this.name = name
    // firstName = name.split(" ")[] // 属性必须初始化
  }
  init {
    ...
  }
}
`

### 副构造器

`
class Perosn(var age:Int, var name:String): Animal() {
  // 定义了注构造器后在类内部，再定义的构造器被成为副构造器
  // this(age, "unknow") 调用主构造器，确保构造器路径唯一性
  constructor(age: Int) : this(age, "unkonw") {

  }
}
`

### 不定义主构造器（不推荐）

`
class Person:Animal {
  var age:Int
  var name:String
  // super() 调用父类构造器
  constructor(age:Int, name:String): super() {
    this.age = age
    this.name = name
  }

  // this(age, "unknown") 可调用父类或自己的其他构造
  constructor(age:Int): this(age, "unknown")
}
`
### 主构造器默认参数（推荐）

`
class Person
(var age:Int, var name:String = "unknown")
:Animal()
`

`
class Person
@JvmOverloads // 主构造器默认参数Java代码中可以以重载的形式调用
constructor(var age:Int, var name:String = "unknown")
:Animal()
`

### 构造同名的工厂函数

`
class Person(var age:Int, var name:String = "unknown") {
  override fun equals(other: Any?)
    = (other as? Person)?.name?.equals(name)?: false
  override fun hashCode() = name.hashCode()
}

val person = HashMap<String, Person>()
fun Person(name:String): Person {
  return persons[name]?:Person(1,name).also{ persons[name] = it}
}
`

### 可见行对比

可见行类型| Java  | Kotlin
---- | ----- | ------  
public  | 公开 | 与Java相同，默认
internal  | X | 模块内可见
default  | 包内可见，默认 | X
protected  | **包内**及子类可见 | **类内**部及子类可见
private  | **类内**可见 | **类或文件内**可见

### 修饰对象

可见行类型| 顶级声明  | 类 | 成员
---- | ----- | ------  
public  | OK | OK | OK
internal  | OK, 模块 | OK，模块 | OK,模块
protected  | X | X | OK
private  | OK, 文件 | OK，文件 | OK, 类

### 模块

- IntelliJ IDEA 模块
- Maven 工程
- Gradle SourceSet
- Ant 任务中一次调用 <kotlinc> 的文件

直观的江，一个**JAR包，一个aar**

### internal vs default

- 