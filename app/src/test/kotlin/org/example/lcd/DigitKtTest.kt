package org.example.lcd

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class DigitKtTest: FunSpec({
    test("toDigit returns a 1") {
        val result = toDigitLcd(1)
        val expected = arrayOf(
            arrayOf(' ', ' ', ' '),
            arrayOf(' ', '|', ' '),
            arrayOf(' ', '|', ' ')
        )
        result shouldBe expected
    }
    test("toDigit returns a 2") {
        val result = toDigitLcd(2)
        val expected = arrayOf(
            arrayOf(' ', '_', ' '),
            arrayOf(' ', '_', '|'),
            arrayOf('|', '_', ' ')
        )
        result shouldBe expected
    }
    test("toDigit returns a 3") {
        val result = toDigitLcd(3)
        val expected = arrayOf(
            arrayOf(' ', '_', ' '),
            arrayOf(' ', '_', '|'),
            arrayOf(' ', '_', '|')
        )
        result shouldBe expected
    }
    test("toDigit returns a 4") {
        val result = toDigitLcd(4)
        val expected = arrayOf(
            arrayOf(' ', ' ', ' '),
            arrayOf('|', '_', '|'),
            arrayOf(' ', ' ', '|')
        )
        result shouldBe expected
    }
    test("toDigit returns a 5") {
        val result = toDigitLcd(5)
        val expected = arrayOf(
            arrayOf(' ', '_', ' '),
            arrayOf('|', '_', ' '),
            arrayOf(' ', '_', '|')
        )
        result shouldBe expected
    }
    test("toDigit returns a 6") {
        val result = toDigitLcd(6)
        val expected = arrayOf(
            arrayOf(' ', '_', ' '),
            arrayOf('|', '_', ' '),
            arrayOf('|', '_', '|')
        )
        result shouldBe expected
    }
    test("toDigit returns a 7") {
        val result = toDigitLcd(7)
        val expected = arrayOf(
            arrayOf(' ', '_', ' '),
            arrayOf(' ', ' ', '|'),
            arrayOf(' ', ' ', '|')
        )
        result shouldBe expected
    }
    test("toDigit returns an 8") {
        val result = toDigitLcd(8)
        val expected = arrayOf(
            arrayOf(' ', '_', ' '),
            arrayOf('|', '_', '|'),
            arrayOf('|', '_', '|')
        )
        result shouldBe expected
    }
    test("toDigit returns a 9") {
        val result = toDigitLcd(9)
        val expected = arrayOf(
            arrayOf(' ', '_', ' '),
            arrayOf('|', '_', '|'),
            arrayOf(' ', '_', '|')
        )
        result shouldBe expected
    }
    test("toDigit returns a 0") {
        val result = toDigitLcd(0)
        val expected = arrayOf(
            arrayOf(' ', '_', ' '),
            arrayOf('|', ' ', '|'),
            arrayOf('|', '_', '|')
        )
        result shouldBe expected
    }
})