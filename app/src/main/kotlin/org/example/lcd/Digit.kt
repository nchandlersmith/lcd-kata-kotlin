package org.example.lcd

val emptyLcd: Array<Array<Char>> = arrayOf(emptyArray())

fun toDigit(number: Int): Array<Array<Char>> {
    val rules = listOf(digitRule1, digitRule2, digitRule3, digitRule4)
    var lcdDigit = emptyLcd
    for (rule in rules) {
        lcdDigit = rule(number)
        if (!lcdDigit.first().isEmpty()) {
            return lcdDigit
        }
    }
    return lcdDigit
}

private val digitRule4: (Int) -> Array<Array<Char>> = { number ->
    val digitLcd = arrayOf(
        arrayOf(' ', ' ', ' '),
        arrayOf('|', '_', '|'),
        arrayOf(' ', ' ', '|')
    )
    digitRule(number, 4, digitLcd)
}

private val digitRule3: (Int) -> Array<Array<Char>> = { number ->
    val digitLcd = arrayOf(
        arrayOf(' ', '_', ' '),
        arrayOf(' ', '_', '|'),
        arrayOf(' ', '_', '|')
    )
    digitRule(number, 3, digitLcd)
}

private val digitRule2: (Int) -> Array<Array<Char>> = { number ->
    val digitLcd = arrayOf(
        arrayOf(' ', '_', ' '),
        arrayOf(' ', '_', '|'),
        arrayOf('|', '_', ' ')
    )
    digitRule(number, 2, digitLcd)
}

private val digitRule1: (Int) -> Array<Array<Char>> = { number ->
    val digitLcd = arrayOf(
        arrayOf(' ', ' ', ' '),
        arrayOf(' ', '|', ' '),
        arrayOf(' ', '|', ' ')
    )
    digitRule(number, 1, digitLcd)
}

private fun digitRule(number: Int, digit: Int, digitLcd: Array<Array<Char>>): Array<Array<Char>> {
    if (number == digit) {
        return digitLcd
    }
    return emptyLcd
}