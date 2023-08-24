import arrow.core.Either
import arrow.core.right
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

/**
 * Created by: stefanus
 * 24/08/23 23.48
 * Design by: stefanus.ayudha@gmail.com
 */

class EitherTest {

    @Test
    fun test_map_true() {
        fun step1(inp: Int): String =
            "$inp step1"

        fun step2(inp: Any): String =
            "$inp step2"

        val a: Either<String, Int> = 1.right()
        val b = a map ::step1 map ::step2

        assertTrue {
            b is Either.Right
        }

        assertTrue {
            b.getOrNull() == "1 step1 step2"
        }
    }

}