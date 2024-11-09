package org.example

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun lcd(number: Int): Array<Array<String>> {
    return arrayOf(
        arrayOf(" "),
        arrayOf("|"),
        arrayOf("|")
    )
}

fun main() {
    println(App().greeting)
    val printVal = lcd(1)
    for (value in printVal) {
        println(value.first())
    }
}
