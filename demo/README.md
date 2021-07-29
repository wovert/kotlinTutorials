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

### Gradle 更新问题

> 项目Gradle和工具Gradle版本不一致容易出问题

- Error: Unable to tunnel through proxy. Proxy returns "HTTP/1.1 400 Bad Request"
  - 第一种方案：File -> Settings -> Build Execution, Deployment Gradle ->  默认选择了 Use default gradle wrapper(recommended)
选择 Use local gradle distribution 本地Anroid Studio安装路径的gradle
  - 第二种方案：第一种方案还是没有解决时，选择项目的gradle/wrapper/gradle-wrapper.properties, distributionUrl的地址当前工具的版本路径不一样，改成当前工具版本路径
  - 第三种方案：项目根路径下的 build.gradle classpath 'com.android.tools.build:gradle:1.3.0' 的版本号与工具版本号一致就可以
- gradle 一致处于更新状态
  - 第一种方案. 项目gradle低于工具gradle版本号时，/Android Studio 4/gradle/gradle-4.1记住这个版本号，在项目根目录gradle/wrapper/gradle-wrapper.properties 文件中 distributionUrl的地址的版本号改成gradle-4.1就可以了
  - 第二种方案. 手动下载 gradle 版本，并放置在 Android Studio4/grandle/目录下
  - 第三种方案. 在项目根目录gradle/wrapper/gradle-wrapper.properties 文件中 distributionUrl的https改成http
- Gralde project sync failed ... gradle同步失败
  - 查看SDK版本存不存在（AppData/Local/Android/Sdk/platforms/android-XX）, 模块目录下 build.gradle compileSdkVersion 24改成其他的27，
  buildToolsVesion "27.0.1", compile 'com.andorid.support:appcompat-v7:27.1.1.'

### 项目导入差生中文乱码问题

- settings->File Encodings
  - IDE Encoding
  - Project Encoding
  - File or Directory Encoding 和 Property File Encoding
- 单个 java 右键 File Encoding
- build.gradle
```
android {
  ...
  buildTypes{}
  compileOptions {
    encoding "GBK"
  }
}
```
- Module 的 gradle 中添加：`compileOption.encoding="GBK"`


## 变量

### 声明变量

```kt
修饰符 变量 数据类型 = 变量值
val flag:Datatype = "value"
```

### 修饰符

- `val`: 只读变量
- `var`: 读写变量

### 常量

- 编译时常量：const val 常量
- 运行时常量：val 常量

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

## 内联函数

```kt
val ints = intArrayOf(1,2,3,4);
ints.forEach{
  println("Hello $it")
}
for (element in ints) {
  println("Hello $element")
}

inline fun IntArray.forEach(action:(Int) -> Unit): Unit {
  for(element in this) action(element)
}

```

### 定义内联函数

```kt
inline fun hello() {
  println("hello")
}


// 高阶函数与内联更配
inline fun cost(block: () -> Unit) {
  val start = System.currentTimeMillis()
  block()
  println(System.currentTimeMillis() - start))
}

cost {
  println("Hello")
}

val start = System.currentTimeMillis()
println("hello")
println(System.currentTimeMillis() - start))

```
- 高阶函数内联
  - 1.函数本身被内联到调用出
  - 2.函数的函数参数被内联到调用处
  
### 内联属性

- 没有backing-field的属性的 getter/setter可以被内联

### 内联函数的限制

- public/protected 内联方法只能访问对应类的 public 成员
- 内联函数的内联函数参数不能被存储（赋值给变量）
- 内联函数的内联函数参数只能传递给其他内联函数参数

## 类


## IM 第三方服务平台

- 环信
- 融云
- 网易云信
- 极光IM
- 腾讯云通信IM
- 爱萌
- 阿里百川云旺

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

## 表达式

### 中缀表达式

- 只有一个参数，且用infix 修饰的函数

```
class Book{
  infix fun on(place:String) {...}
}
Book() on "MyDesk"
```

### 面向对象五个基本原则(SOLID)

- SRP 单一责任原则
- OCP 开放封闭原则
- LSP 里氏替换原则
- DIP 依赖倒置原则
- ISP 接口分类原则

### Java 继承实力化顺序

- 父类静态成员，子类静态成员
- 父类对象构造：属性（赋值）、构造代码块、构造方法
- 子类对象构造：属性（赋值）、构造代码块、构造方法

### Java 多态

- 编译时多态
  - 设计时多态
  - 方法重载
- 运行时多态
  - 程序运行时动态决定用哪个方法
  
## Java 接口

- default: 默认方法，可以带方法体 jdk1.8后新增
- static: 静态方法，可以带方法体 jdk1.8后新增

## Java内部类

- 成员内部类
  - 内部类在外部使用时，无法直接实例化，需要借由外部类信息才能完成实例化
- 静态内部类
  - 静态内部类中，只能直接访问外部类的静态成员，如果需要调用非静态成员，可以通过对象实例
  - 静态内部类对象实例时，可以不依赖于外部类对象
  - 可以通过外部类.内部类.静态成员的方法，访问内部类中的静态成员
  - 当内部类属性与外部类属性同名时，默认直接调用内部类中的成员；如果需要访问外部类中的非静态属性，则可以通过 new 外部类().属性的方法
  
```java
Person.Heart h = new Person().new Heart()

Person.Heart ms = new Person.Heart()
```

### 方法内部类

- 作用访问在方法内
- class 前不可以添加修饰符
- 类中不能包含静态成员
- 类中可以包好 final, abstract 修饰成员

### 匿名内部类

- 匿名内部类没有类型名称、实例对象名称
- 编译后的文件命名：外部类$数字.class
- 无法使用 private、public、protectec、abstract、static 修饰
- 无法编写构造方法，可以添加构造代码块
- 不能出现静态成员
- 匿名内部类可以实现接口也可以继承父类，但是不可兼得


## 方法重载

- Overloads
- 名称相同、参数不同的方法
- Jvm函数签名的概念：函数名、参数列表
- 根返回值没有关系

### 默认参数

- 为函数参数设定一个默认值
- 可以为任意位置的参数设置默认值
- 函数调用产生混淆时用具名参数

### 方法虫重载默认参数

- 二者的型惯性以及@JvmOverloads
- 避免定义关系不大的重载
- 不好的设计
  - List.remove(int)
  - List.remove(Object)

## 继承（实现）语法

- 弗雷需要 `open`才可以被继承
- 父类方法、属性需要`open`才可以被覆写
- 接口、接口方法、抽象类默认为 `open`
- 覆写父类（接口）成员需要 `override` 关键字
- class D:A(), B,C
- 继承类时实际上调用了父类的构造方法
- 类只能单继承，接口可以多实现

## 扩展成员

- 为现有的类添加方法、属性
  - fun X.y(): Z {...}
  val X.m 注意扩展属性不能初始化，类似接口属性
- Java 调用扩展成员类似调用静态方法

## 属性代理

- 定义方法
  - val/var <property name>:<Type> by <expression>
- 代理者需要实现相应的 setValue/getValue 方法
- lazy 原理剖析

## 接口代理

- class Manager(dirver:Driver): Driver by driver
- 接口方法实现交给代理类实现

### 接口方法冲突

- 接口方法可以有默认实现
- 签名一致且返回值相同的冲突
- 子类（实现类）必须覆写冲突方法
- `super<[父类(接口)名]>.[方法名]([参数列表])`

### object

- 只有一个实例的类
- 不能自定义构造方法
- 可以实现接口、继承父类
- 本质上就是单例模式最基本的实现


### 伴生对象与静态成员

- 每个类可以对应一个伴生对象
- 伴生对象的成员全局独一份
- 伴生对象的成员类似 Java 的静态成员
- 静态成员考虑包级函数、变量替代
- JvmField and JvmStatic 的使用

### 印章类和枚举区别

- Sealed class 更在意类型
- 枚举更在意数据

### internal vs default

## 高阶函数

- maxby
- filter
- map
- any
```
列表集合.maxBy{it.height}
列表集合.minBy{it.height}
列表集合.filter{
  (it.age > 18 ) and (it.height > 168)
}
列表集合.map {
  "${it.name} : ${it.age}"
}

// return boolean
列表集合.any {
  it.age == 18
}

列表集合.count {
  it.age < 25
}

// return first object
列表集合.find {
  it.age == 25
}

列表集合.groupBy {
  it.address
}.get("广东")?.forEach{ println(it) }

```

## DSL(领域特定语言)

### 扩展函数

```
fun List<Girl>.查找年龄小于(age: Int) {
  filter {
    it.age < age
  }.forEach(::println)
}

listArr.查找年龄小于(18)

infix fun List<Girl>.查找年龄小于(age: Int) {
  filter {
    it.age < age
  }.forEach(::println)
}

// 特定领域语言
listArr 查找年龄小于 18
```

## Application and Libaray

- Application 作为应用程序启动：`apply plugin: 'com.android.application'`
- Library 作为库工程被引用：`apply plugin: 'com.android.library'`

### 两套 AndroidManifest

- 一套用于Application时使用，配置主题及默认启动，位于debug目录
- 一套用于Library时使用注册组件及权限，位于release目录

### AndroidManifest切换

```
sourceSets {
  main {
    if (xxx.toBoolean()) {
      manifest.srcFile 'src/main/release/AndroidManifest.xml'
    } else {
      manifest.srcFile 'src/main/debug/AndroidManifest.xml'
    }
  }
}
```

## android-extendsion

- 视图绑定，可直接使用XML中ID操作该控件
- 插件级别，无需引入第三放库
- 无需定义变量，极大的减少代码
- 适用于Activity, Fragament, Adapter及自定义 View

插件：apply plugin: 'kotlin-andorid-extentions'


## Anko

- Anko Commons
- Anko Layouts
- Anko SQLite
- Anko Coroutines

### Anko Commons 配置

- 依赖包：compile "org.jetbrains.anko:anko-commons:$anko_version"
- v4依赖包：compile "org.jetbrains.anko:anko-commons:$anko_version"

### Anko Commons 使用

- 跳转类：startActivity, intent 等
- 提示类：toast, dialog 等
- 日志类：verbose(), debug(), info(), warn(), error()
- 尺寸类：dip(), sp(), px2dp(), px2sp(), dimen()

### Anko Layouts 配置

- 依赖包：compile "org.jetbrains.anko:anko-sdk25:$anko_version"
- v7依赖包：compile "org.jetbrains.anko:anko-appcompat-v7:$anko_version"
- 事件依赖包：compile "org.jetbrains.anko:anko-sdk25-coroutines:$anko_version"
- v7事件依赖包：compile "org.jetbrains.anko:anko-appcompat-v7-coroutines:$anko_version"

### Anko Layouts 使用

```
verticalLayout {
  padding = dip(30)
  editTtext {
    hint = "Name"
    textSize = 24f
  }
  editText {
    hint = "Password"
    textSize = 24f
  }
  button("Login") {
    textSize = 26f
    onClick { toast("Hello") }
  }
}
```

### Anko SQLite

- 配置：
  - 依赖包：compile "org.jetbrains.anko:anko-sqlite:$anko_version"
- 使用
  - 第三方库替代，如OrmLite, LitePal, GreenDao, Realm等
  
### Anko Coroutines

- 配置
  - 依赖包: compile "org.jetbrains.anko:anko-coroutines:$anko_version"
- 使用
  - 第三方库替代，如rx

## RxKotlin

- 基于RxJava的扩展库，以Kkotlin的风格提供大量的扩展方法
- 响应式编程
- 观察者模式
- 配置: `compile "io.reactivex:rxkotlin:${rx_kotlin_version}"`

## RxAndroid

- 基于RxJava的扩展库，可以优雅的处理异步请求
- 更好的兼容Android特性、如主线程、UI事件
- 配置: `compile "io.reactivex:rxandroid:${rx_android_version}"`


## ProgressBar

- Android 4.0 以后不能直接在线程中操作控件，除了ProgressBar控件

```
final ProgressBard progress = findViewById(R.id.progress);
progress.setProgress(80);
new Thread(){
  @Override
  public void run() {
    for (int i=1; i<=100; i++) {
      progress.setProgress(i);
      try {
        Thread.sleep(30);
      } catch(InterruptedException e) {
        e.printStatckTrace();
      }
    }
  }
}.start()
```

## Activity 启动模式

- standard(入栈出栈)
- singleTop(顶部复用, 顶部的跳转到顶部的时候没有变化， ABC, 再打开C，还是ABC, 如果打开B，变成ABCB)
- singleTask(ABCDE -> 跳转到C，变成 AB stack，去掉D)
- singleInstance(ABCD statck -> 打开 E 变成 ABCD statck 和 E statck 独栈)

## Activity 生命周期

- 1. onCreate()
- 2. onStart() 能看见，不能交互
- 3. onResume() 能交互
- 4. onPause() ---(User returns to the activity， Dialog Activity)---> onResume()
- 5. onStop()
  - User navigates to the activity(), -> onRestart()
  - App process killed, -> onCreate()
- 6. onDestory()


## Fragment

> 解决不同设备的分辨率适配问题

- Android 3.0+以后
- 一个Activity可以运行多个 Fragment
- Fragment不能脱离Activity而存在
- Activity是屏幕的主体，而Fragment是Activity的一个组成元素

- created vs onAttach()/onCreate()/onCreateView()/onActivityCreated()
- Destoryed vs onDestroyView()/onDestory()/onDetach()

### 静态加载 VS 动态加载

- 静态加载 xml

## java vs kotlin

- build.gradle
  - sourceSets {  main.java.srcDirs += "src/main/kotlin" }
  
## collection接口

- 单列集合中共性的方法
- 没有带索引的方法

- 子类
  - List接口
  - Set接口

### List(列表)

- List元素有序并且可以重复的集合，成为序列
- List可以精确的控制每个元素的插入位置，或删除某个位置的元素
- List的两个主要实现类是 ArrayList 和 LinkedList

### ArrayList

- 底层数组实现
- 动态增长，以满足应用程序的需求
- 在列表尾部插入或删除数据非常有效
- 适合查找和更新元素
- ArrayList中的元素可以为null

### List接口


- 有序集合
- 允许存储重复的元素
- 有索引

- Verctor集合
- ArrayList集合
- LinkedList集合

### Set接口

- 不允许存储重复元素
- 没有索引

- TreeSet集合
- HashSet集合
- LinkedHashSet集合

## 泛型

> 一种未知的数据类型；是一个变量，用来接受数据类型

- E e: Element元素
- T t: Type 类型

### 




## Intent

> 不同组建之间通信的媒介，媒介中含有一次操作的动作、动作设计的数据、附加数据进行描述并完成组件的调用

### Intent属性

- Action
- Data
- Category
- Type
- Component
- Extra

## API28(Android 9.0) 新特性

1. 9.0对 http 请求的限制
2. 创建安全配置文件
  - 1. 在 res 目录下创建 xml/network_security_config 文件
  - 2. 增加 `cleartextTrafficPermitted` 属性
3. 添加安全配置文件
  - 1. AndroidManifest.xml 中的 Application 申明

## ListView

1. 在Layout中创建ListView
2. 创建每一行的layout
3. 创建每一行的数据
4. 用adapter 将数据填充到每一行的视图中

## 泛型

- 函数声明泛型：`fun <T> maxOf(a:T, b:T):T`
- 类声明泛型：`sealed class List<T>`

### 使用泛型

```kt
val max:String = maxOf<String>("Hello", "world");
val max = maxOf("Hello", "world");
val list: List.Cons<Double> = List.Cons<Double>(1.0, List.Nil)
val list =  List.Cons(1.0, List.Nil)
```

## ASCII

- 48 - '0'
- 64 - 'A'
- 97 - 'a'

## RecyclerView

- LayoutManager
  - LinearLayoutManager
  - GridLayoutManger
  - StaggeredGridLayoutManager
- Adapter
- ViewHolder

- buide.gradle
```
// noinspection GradleCompatible
implementation 'com.android.support:appcompat-v7:28.0.0'
implementation 'com.android.support:recyclerview-v7:28.0.0'
```

## Android 数据存储

- SharedPreferences 存储数据
- 文件存储（内部，外部）
- SQLite 数据库存储
- ContentProvider 存储数据
- 网络存储数据

### SharedPreferences 存储数据

- 存放登录的配置信息
- 本质上是 xml 文件，是通过类似键值对的方式存放信息
- 位于程序私有目录中，即data/data/[packageName]/shared_prefs

### SharedPreferences 操作模式

- MODE_APPEND: 追加方式存储
- MODE_PRIVATE: 私有方式存储，其他应用无法访问
- MODE_WORLD_READABLE: 可被其他应用读取
- MODE_WORLD_WRITEABLE: 可被其他应用写入

### 外部存储 ExternalStorage

- 内存 Memory
- 内部存储 InternalStorage
- 外部存储 ExternalStorage
  - storage or mnt目录
  - Environment.getExternalStorageDirectory()
  - 共有目录(DCIM、DOWNLOAD等)
  - 私有目录(Android/data/应用包名)

## Retrofit

- 基于okhttp封装的网络库
- 与Rx完美结合

### Retrofit配置

```
ext.ok_http_version = '3.14.9'
ext.retrofit_version = '2.6.4'
```

build.gradle
```
compile "com.squareup.okhttp3:okhttp:${ok_http_version}"
compile "com.squareup.retrofit2:retrofit:${retrofit_version}"
compile "com.squareup.okhttp3:logging-interceptor:${ok_http_version}"
compile "com.squareup.retrofit2:converter-gson:${retrofit_version}"
compile "com.squareup.retrofit2:adapter-rxjava:${retrofit_version}"
```

