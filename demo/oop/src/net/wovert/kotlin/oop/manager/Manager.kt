package net.wovert.kotlin.oop.manager

interface Driver {
    fun drive()
}
interface Writer {
    fun write()
}

class CarDriver: Driver {
    override fun drive() {
        println("开小轿车")
    }
}
class PPTWriter: Writer {
    override fun write() {
        println("PPT 写作")
    }
}

class Manager: Driver, Writer {
    override fun drive() {
        TODO("Not yet implemented")
    }
    override fun write() {
        TODO("Not yet implemented")
    }
}

class SeniorManager(val driver:Driver, val writer:Writer): Driver by driver, Writer by writer {
    override fun drive() {
        driver.drive()
    }

    override fun write() {
        writer.write()
    }
}

fun main(args: Array<String>) {
    val driver = CarDriver()
    val writer = PPTWriter()
    val manager = SeniorManager(driver, writer)
    manager.drive()
    manager.write()
}