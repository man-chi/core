package tech.waxc

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class MainKtTest {

    @Test
    fun testDivideTwoPositiveIntegers() {
        assertEquals(2, divide(6, 3))
    }

    @Test
    fun testDivideByZero() {
        assertFailsWith<IllegalArgumentException> { divide(5, 0) }
    }

    @Test
    fun testDivideNegativeByPositive() {
        assertEquals(-2, divide(-6, 3))
    }
}