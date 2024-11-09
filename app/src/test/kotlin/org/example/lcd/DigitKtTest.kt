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
})