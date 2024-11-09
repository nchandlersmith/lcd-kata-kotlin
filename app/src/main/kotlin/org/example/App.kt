package org.example

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun lcd(number: Int): Array<Array<Char>> {
    if (2 == number) {
        return arrayOf(
            arrayOf(' ', '_'),
            arrayOf(' ', '_', '|'),
            arrayOf('|', '_')
        )
    }
    return arrayOf(
        arrayOf(' '),
        arrayOf('|'),
        arrayOf('|')
    )
}

fun main() {
    println(App().greeting)
    val display = lcd(2)
    for (line in display) {
        for (c in line) {
            print(c)
        }
        println()
    }
}
