package org.example

import org.example.lcd.toLcd

fun printNumber(number: Array<Array<Char>>) {
    for (line in number) {
        for (c in line) {
            print(c)
        }
        println()
    }
    println()
}

fun main() {
    println("Enter a number.")
    val input = readlnOrNull()?.toIntOrNull() ?: 1
    printNumber(toLcd(input))
}
