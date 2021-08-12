package net.wovert.kotlin.oop.extension

class CompanionObjectExtension {
    companion object MyObject {

    }
}

fun CompanionObjectExtension.MyObject.method () {
    println("Hello World")
}

fun main(args: Array<String>) {
    CompanionObjectExtension.method();
}