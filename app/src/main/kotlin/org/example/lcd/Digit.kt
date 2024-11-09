package org.example.lcd

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