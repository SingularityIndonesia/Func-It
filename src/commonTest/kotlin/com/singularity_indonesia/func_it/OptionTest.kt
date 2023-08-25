package com.singularity_indonesia.func_it

import arrow.core.Some
import arrow.core.none
import arrow.core.some
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Created by: stefanus
 * 24/08/23 21.01
 * Design by: stefanus.ayudha@gmail.com
 */

class OptionTest {

    @Test
    fun test_add_false() {
        val a = none<Int>()
        val b = a + 2
        assertFalse { b is Some }
    }

    @Test
    fun test_add_true() {
        val a = 1.some()
        val b = a + 2 + 3 + 5 + 7
        assertTrue { b is Some }
        assertTrue { b.getOrNull() == 18 }

    }

    @Test
    fun test_list_add_true() {
        val a = (1..5).toList().some()
        val b = a + 6

        assertTrue {
            b.getOrNull()?.get(5) == 6
        }
    }
}