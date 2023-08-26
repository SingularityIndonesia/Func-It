package com.singularity_indonesia.func_it

import arrow.core.Either

/**
 * Created by: stefanus
 * 26/08/23 12.11
 * Design by: stefanus.ayudha@gmail.com
 */
/** # Plus **/
infix operator fun Either<*, Double>.plus(friend: Int): Either<*, Double> =
    map { it + friend }

infix operator fun Either<*, Double>.plus(friend: Float): Either<*, Double> =
    map { it + friend }

infix operator fun Either<*, Double>.plus(friend: Double): Either<*, Double> =
    map { it + friend }

/** # Minus **/
infix operator fun Either<*, Double>.minus(friend: Int): Either<*, Double> =
    map { it - friend }

infix operator fun Either<*, Double>.minus(friend: Float): Either<*, Double> =
    map { it - friend }

infix operator fun Either<*, Double>.minus(friend: Double): Either<*, Double> =
    map { it - friend }

/** # Times **/
infix operator fun Either<*, Double>.times(friend: Int): Either<*, Double> =
    map { it * friend }

infix operator fun Either<*, Double>.times(friend: Float): Either<*, Double> =
    map { it * friend }

infix operator fun Either<*, Double>.times(friend: Double): Either<*, Double> =
    map { it * friend }

/** # Div **/
infix operator fun Either<*, Double>.div(friend: Int): Either<*, Double> =
    map { it / friend }

infix operator fun Either<*, Double>.div(friend: Float): Either<*, Double> =
    map { it / friend }

infix operator fun Either<*, Double>.div(friend: Double): Either<*, Double> =
    map { it / friend }