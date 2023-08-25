package com.singularity_indonesia.func_it

/**
 * Created by: stefanus
 * 24/08/23 20.25
 * Design by: stefanus.ayudha@gmail.com
 */

infix fun <A, B> A.let(transform: (A) -> B): B {
    return transform(this)
}