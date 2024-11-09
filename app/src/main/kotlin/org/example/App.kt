package org.example

import org.example.lcd.toDigit

fun printNumber(number: List<Array<Array<Char>>>) {
    val digit = number.first()
    for (line in digit) {
        for (c in line) {
            print(c)
        }
        println()
    }
}

fun main() {
    println("Enter a digit.")
    val input = readlnOrNull()
    printNumber(listOf(toDigit(input?.toIntOrNull() ?: 1)))
}
