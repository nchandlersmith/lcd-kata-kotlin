package org.example

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class AppTest: FunSpec({
    test("App should have a greeting") {
        val result = App().greeting
        result shouldBe "Hello World!"
    }
})
