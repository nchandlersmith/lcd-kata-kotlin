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

fun main() {
    println("Enter a digit.")
    val input = readLine()
    val display = toDigit(input?.toIntOrNull() ?: 1)
    for (line in display) {
        for (c in line) {
            print(c)
        }
        println()
    }
}
