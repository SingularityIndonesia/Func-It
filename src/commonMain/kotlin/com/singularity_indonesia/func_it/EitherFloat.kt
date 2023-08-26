package com.singularity_indonesia.func_it

import arrow.core.Either

/**
 * Created by: stefanus
 * 26/08/23 12.05
 * Design by: stefanus.ayudha@gmail.com
 */
/** # Plus **/
infix operator fun Either<*, Float>.plus(friend: Int): Either<*, Float> =
    map { it + friend }

infix operator fun Either<*, Float>.plus(friend: Float): Either<*, Float> =
    map { it + friend }

infix operator fun Either<*, Float>.plus(friend: Double): Either<*, Double> =
    map { it.toDouble() + friend }

/** # Minus **/
infix operator fun Either<*, Float>.minus(friend: Int): Either<*, Float> =
    map { it - friend }

infix operator fun Either<*, Float>.minus(friend: Float): Either<*, Float> =
    map { it - friend }

infix operator fun Either<*, Float>.minus(friend: Double): Either<*, Double> =
    map { it.toDouble() - friend }

/** # Times **/
infix operator fun Either<*, Float>.times(friend: Int): Either<*, Float> =
    map { it * friend }

infix operator fun Either<*, Float>.times(friend: Float): Either<*, Float> =
    map { it * friend }

infix operator fun Either<*, Float>.times(friend: Double): Either<*, Double> =
    map { it.toDouble() * friend }

/** # Div **/
infix operator fun Either<*, Float>.div(friend: Int): Either<*, Float> =
    map { it / friend }

infix operator fun Either<*, Float>.div(friend: Float): Either<*, Float> =
    map { it / friend }

infix operator fun Either<*, Float>.div(friend: Double): Either<*, Double> =
    map { it.toDouble() / friend }