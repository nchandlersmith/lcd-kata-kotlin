package org.example

import org.example.lcd.toDigit

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
