package com.singularity_indonesia.func_it

import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Created by: stefanus
 * 10/09/23 22.23
 * Design by: stefanus.ayudha@gmail.com
 */
class CompositionTest {
    fun f(x: Double): Double {
        // Define the implementation of f
        return x + 1
    }

    fun g(x: Double): Double {
        // Define the implementation of g
        return x * 2
    }

    fun h(x: Double): Double {
        // Define the implementation of h
        return x - 3
    }

    @Test
    fun testComposition() {
        val x = 10.0 // Replace with your desired input value

        // Compose the functions and apply them to x
        val result = ::f o ::g o ::h o x

        // result ((10 - 3) * 2) + 1
        assertEquals(15.0, result)
    }
}