package org.example.lcd

fun intToDigitList(int: Int): List<Int> {
    return int.toString().map { it.digitToInt() }
}