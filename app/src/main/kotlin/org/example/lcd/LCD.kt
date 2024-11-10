package org.example.lcd

fun toLcd(number: Int): Array<Array<Char>> {
    val digitList = number.toString().map { it.digitToInt() }
    val lcd: Array<Array<Char>> = arrayOf(emptyArray(), emptyArray(), emptyArray())
    for (digit in digitList) {
        val digitLcd = toDigitLcd(digit)
        digitLcd.forEachIndexed { index, line -> lcd[index] += line }
    }
    return lcd
}