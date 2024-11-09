package org.example.lcd

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class DigitKtTest: FunSpec({
    test("toDigit returns a 1") {
        val result = toDigit(1)
        val expected = arrayOf(
            arrayOf(' ', ' ', ' '),
            arrayOf(' ', '|', ' '),
            arrayOf(' ', '|', ' ')
        )
        result shouldBe expected
    }
    test("toDigit returns a 2") {
        val result = toDigit(2)
        val expected = arrayOf(
            arrayOf(' ', '_', ' '),
            arrayOf(' ', '_', '|'),
            arrayOf('|', '_', ' ')
        )
        result shouldBe expected
    }
    test("toDigit returns a 3") {
        val result = toDigit(3)
        val expected = arrayOf(
            arrayOf(' ', '_', ' '),
            arrayOf(' ', '_', '|'),
            arrayOf(' ', '_', '|')
        )
        result shouldBe expected
    }
    test("toDigit returns a 4") {
        val result = toDigit(4)
        val expected = arrayOf(
            arrayOf(' ', ' ', ' '),
            arrayOf('|', '_', '|'),
            arrayOf(' ', ' ', '|')
        )
        result shouldBe expected
    }
    test("toDigit returns a 5") {
        val result = toDigit(5)
        val expected = arrayOf(
            arrayOf(' ', '_', ' '),
            arrayOf('|', '_', ' '),
            arrayOf(' ', '_', '|')
        )
        result shouldBe expected
    }
    test("toDigit returns a 6") {
        val result = toDigit(6)
        val expected = arrayOf(
            arrayOf(' ', '_', ' '),
            arrayOf('|', '_', ' '),
            arrayOf('|', '_', '|')
        )
        result shouldBe expected
    }
    test("toDigit returns a 7") {
        val result = toDigit(7)
        val expected = arrayOf(
            arrayOf(' ', '_', ' '),
            arrayOf(' ', ' ', '|'),
            arrayOf(' ', ' ', '|')
        )
        result shouldBe expected
    }
    test("toDigit returns an 8") {
        val result = toDigit(8)
        val expected = arrayOf(
            arrayOf(' ', '_', ' '),
            arrayOf('|', '_', '|'),
            arrayOf('|', '_', '|')
        )
        result shouldBe expected
    }
    test("toDigit returns a 9") {
        val result = toDigit(9)
        val expected = arrayOf(
            arrayOf(' ', '_', ' '),
            arrayOf('|', '_', '|'),
            arrayOf(' ', '_', '|')
        )
        result shouldBe expected
    }
})