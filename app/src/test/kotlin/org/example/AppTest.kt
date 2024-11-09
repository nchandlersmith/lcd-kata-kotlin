package org.example

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class AppTest: FunSpec({
    test("App should have a greeting") {
        val result = App().greeting
        result shouldBe "Hello World!"
    }
    test("lcd returns a 1") {
        val result = lcd(1)
        val expected = arrayOf(
            arrayOf(' '),
            arrayOf('|'),
            arrayOf('|')
        )
        result shouldBe expected
    }
    test("lcd returns a 2") {
        val result = lcd(2)
        val expected = arrayOf(
            arrayOf(' ', '_'),
            arrayOf(' ', '_', '|'),
            arrayOf('|', '_')
        )
        result shouldBe expected
    }
})
