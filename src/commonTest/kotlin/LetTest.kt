import arrow.core.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Created by: stefanus
 * 24/08/23 20.33
 * Design by: stefanus.ayudha@gmail.com
 */

class LetTest {
    private fun intToString(inp: Int): String =
        "string $inp"

    private fun stringToInt(inp: String): Option<Int> =
        runCatching {
            inp.toInt()
                .some()
        }.getOrElse { none() }


    @Test
    fun int_to_string() {
        val a = 1
        val b = a let ::intToString
        assertEquals("string 1", b)
    }

    @Test
    fun string_to_int_false() {
        val a = "asdad"
        val b = a let ::stringToInt

        assertFalse { b is Some }
    }

    @Test
    fun string_to_int_true() {
        val a = "1"
        val b = a let ::stringToInt

        assertTrue { b is Some }
    }
}
