package infix

class Book {
    infix fun on (place: String) {
        println(place)
    }
}

fun main() {
    Book() on "MyDesk"
}