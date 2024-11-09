package org.example

fun toDigit(number: Int): Array<Array<Char>> {
    if (3 == number) {
        return arrayOf(
            arrayOf(' ', '_', ' '),
            arrayOf(' ', '_', '|'),
            arrayOf(' ', '_', '|')
        )
    }
    if (2 == number) {
        return arrayOf(
            arrayOf(' ', '_', ' '),
            arrayOf(' ', '_', '|'),
            arrayOf('|', '_', ' ')
        )
    }
    return arrayOf(
        arrayOf(' ', ' ', ' '),
        arrayOf(' ', '|', ' '),
        arrayOf(' ', '|', ' ')
    )
}

fun printNumber(number: Array<Array<Char>>) {
    for (line in number) {
        for (c in line) {
            print(c)
        }
        println()
    }
}

fun main() {
    println("Enter a digit.")
    val input = readlnOrNull()
    printNumber(toDigit(input?.toIntOrNull() ?: 1))
}
