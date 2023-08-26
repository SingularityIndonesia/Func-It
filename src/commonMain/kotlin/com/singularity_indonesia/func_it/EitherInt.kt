package com.singularity_indonesia.func_it

import arrow.core.Either

/**
 * Created by: stefanus
 * 26/08/23 11.55
 * Design by: stefanus.ayudha@gmail.com
 */

/** # Plus **/
infix operator fun Either<*, Int>.plus(friend: Int): Either<*, Int> =
    map { it + friend }

infix operator fun Either<*, Int>.plus(friend: Float): Either<*, Float> =
    map { it.toFloat() + friend }

infix operator fun Either<*, Int>.plus(friend: Double): Either<*, Double> =
    map { it.toDouble() + friend }

/** # Minus **/
infix operator fun Either<*, Int>.minus(friend: Int): Either<*, Int> =
    map { it - friend }

infix operator fun Either<*, Int>.minus(friend: Float): Either<*, Float> =
    map { it.toFloat() - friend }

infix operator fun Either<*, Int>.minus(friend: Double): Either<*, Double> =
    map { it.toDouble() - friend }

/** # Times **/
infix operator fun Either<*, Int>.times(friend: Int): Either<*, Int> =
    map { it * friend }

infix operator fun Either<*, Int>.times(friend: Float): Either<*, Float> =
    map { it.toFloat() * friend }

infix operator fun Either<*, Int>.times(friend: Double): Either<*, Double> =
    map { it.toDouble() * friend }

/** # Div **/
infix operator fun Either<*, Int>.div(friend: Int): Either<*, Int> =
    map { it / friend }

infix operator fun Either<*, Int>.div(friend: Float): Either<*, Float> =
    map { it.toFloat() / friend }

infix operator fun Either<*, Int>.div(friend: Double): Either<*, Double> =
    map { it.toDouble() / friend }

/** # Div **/
infix operator fun Either<*, Int>.rem(friend: Int): Either<*, Int> =
    map { it % friend }