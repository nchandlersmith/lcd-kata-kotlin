package org.example.lcd

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class UtilsKtTest: FunSpec({
  test("intToDigitList handles digit") {
      val result = intToDigitList(1)
      result shouldBe  listOf(1)
  }
    test("intToDigitList handles double digits") {
        val result = intToDigitList(12)
        result shouldBe  listOf(1, 2)
    }
    test("intToDigitList handles triple digits") {
        val result = intToDigitList(123)
        result shouldBe  listOf(1, 2, 3)
    }
    test("intToDigitList handles quadruple digits") {
        val result = intToDigitList(1234)
        result shouldBe  listOf(1, 2, 3, 4)
    }
    test("intToDigitList handles 10 digits") {
        val result = intToDigitList(1234567890)
        result shouldBe  listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    }
})