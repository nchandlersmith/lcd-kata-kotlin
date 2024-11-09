package org.example.lcd

fun toDigit(number: Int): Array<Array<Char>> {
    return lcdMap.getOrElse(number) { arrayOf(arrayOf(' ')) }
}

private val lcd1 = arrayOf(
    arrayOf(' ', ' ', ' '),
    arrayOf(' ', '|', ' '),
    arrayOf(' ', '|', ' ')
)
private val lcd2 = arrayOf(
    arrayOf(' ', '_', ' '),
    arrayOf(' ', '_', '|'),
    arrayOf('|', '_', ' ')
)
private val lcd3 = arrayOf(
    arrayOf(' ', '_', ' '),
    arrayOf(' ', '_', '|'),
    arrayOf(' ', '_', '|')
)
private val lcd4 = arrayOf(
    arrayOf(' ', ' ', ' '),
    arrayOf('|', '_', '|'),
    arrayOf(' ', ' ', '|')
)
private val lcd5 = arrayOf(
    arrayOf(' ', '_', ' '),
    arrayOf('|', '_', ' '),
    arrayOf(' ', '_', '|')
)
private val lcd6 = arrayOf(
    arrayOf(' ', '_', ' '),
    arrayOf('|', '_', ' '),
    arrayOf('|', '_', '|')
)
private val lcd7 = arrayOf(
    arrayOf(' ', '_', ' '),
    arrayOf(' ', ' ', '|'),
    arrayOf(' ', ' ', '|')
)
private val lcd8 = arrayOf(
    arrayOf(' ', '_', ' '),
    arrayOf('|', '_', '|'),
    arrayOf('|', '_', '|')
)
private val lcd9 = arrayOf(
    arrayOf(' ', '_', ' '),
    arrayOf('|', '_', '|'),
    arrayOf(' ', '_', '|')
)
private val lcdMap = hashMapOf(
    1 to lcd1,
    2 to lcd2,
    3 to lcd3,
    4 to lcd4,
    5 to lcd5,
    6 to lcd6,
    7 to lcd7,
    8 to lcd8,
    9 to lcd9,
)
