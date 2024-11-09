package org.example.lcd

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class LCDKtTest:FunSpec({
    test("toLcd returns lcd for 1") {
        val expected = arrayOf(
            arrayOf(' ', ' ', ' '),
            arrayOf(' ', '|', ' '),
            arrayOf(' ', '|', ' ')
        )
        val result = toLcd(1)
        result shouldBe expected
    }
})