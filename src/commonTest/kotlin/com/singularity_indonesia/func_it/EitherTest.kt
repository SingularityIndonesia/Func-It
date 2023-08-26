package com.singularity_indonesia.func_it

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import com.singularity_indonesia.func_it.Result
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue
import kotlin.test.fail

/**
 * Created by: stefanus
 * 24/08/23 23.48
 * Design by: stefanus.ayudha@gmail.com
 */

class EitherTest {

    @Test
    fun `test or immediate return`() {
        val a: Either<String, Int> = "error".left()
        val b = a orElse return

        fail("this line should not be executed")
    }

    @Test
    fun `test or alternative`() {
        val a: Either<String, Int> = "error".left()
        val b = (a orElse 5) * 2

        assertTrue { b == 10 }
    }

    @Test
    fun `test or right`() {
        val a: Either<String, Int> = 2.right()
        val b = (a orElse 5) * 3 // should return 6

        assertEquals(6, b)
    }

    @Test
    fun `test or suspend`() {

        data class User(
            val name: String
        )

        // get user from db return error
        val getUserFromDB: suspend () -> Result<User> =
            { "error".left() }

        // get user from internet return User
        val getUserFromInternet: suspend () -> Result<User> =
            {
                User(
                    name = "from internet"
                ).right()
            }

        // try to get user from db, should return left
        val a = runBlocking {
            getUserFromDB()
        }
        assertTrue { a is Either.Left }

        // try to get user from db or from internet
        val b = runBlocking {
            (a orElse getUserFromInternet.invoke()) orElse User("from b")
        }
        assertTrue { b.name == "from internet" }
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