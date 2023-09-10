package com.singularity_indonesia.func_it

/**
 * Created by: stefanus
 * 10/09/23 22.23
 * Design by: stefanus.ayudha@gmail.com
 */

infix fun <X, Y> ((X) -> Y).o(some: X): Y {
    return this.invoke(some)
}

infix fun <X, Y, Z> ((Y) -> Z).o(func: (X) -> Y): (X) -> Z {
    fun composed(some: X): Z {
        val y = func.invoke(some)
        return this.invoke(y)
    }
    return ::composed
}