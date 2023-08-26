package com.singularity_indonesia.func_it

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import com.singularity_indonesia.func_it.map
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

/**
 * Created by: stefanus
 * 24/08/23 23.48
 * Design by: stefanus.ayudha@gmail.com
 */

class EitherTest {

    @Test
    fun just_test() {
        val a: Either<String, Int> = 1.right()
        val b = a.flatMap { "asndaln $it".right() }

        println(b)

        val c: Either<String, Int> = "error".left()
        val d = c.flatMap { "asndaln $it".right() }

        println(d)
    }

    @Test
    fun test_map_true() {
        val step1: (Int) -> String = { inp ->
            "$inp step1"
        }

        val step2: (Any) -> String = { inp ->
            "$inp step2"
        }

        val a: Either<String, Int> = 1.right()
        val b = a map step1 map step2

        assertTrue {
            b is Either.Right
        }

        assertTrue {
            b.getOrNull() == "1 step1 step2"
        }
    }

}