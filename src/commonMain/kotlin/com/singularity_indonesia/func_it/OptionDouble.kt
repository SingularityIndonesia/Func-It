package com.singularity_indonesia.func_it

import arrow.core.Either
import arrow.core.Option
import arrow.core.left
import arrow.core.right

/**
 * Created by: stefanus
 * 26/08/23 12.14
 * Design by: stefanus.ayudha@gmail.com
 */

/** # Double **/
infix operator fun Option<Double>.plus(friend: Int): Option<Double> =
    map { it + friend }

infix operator fun Option<Double>.plus(friend: Float): Option<Double> =
    map { it + friend }

infix operator fun Option<Double>.plus(friend: Double): Option<Double> =
    map { it + friend }

infix operator fun Option<Double>.plus(friend: Option<Int>): Either<String, Double> {
    val first = this.getOrNull() ?: return "First param is None".left()
    val second = friend.getOrNull() ?: return "Second param is None".left()
    return (first + second).right()
}

infix operator fun Option<Double>.plus(friend: Option<Float>): Either<String, Double> {
    val first = this.getOrNull() ?: return "First param is None".left()
    val second = friend.getOrNull() ?: return "Second param is None".left()
    return (first + second).right()
}

infix operator fun Option<Double>.plus(friend: Option<Double>): Either<String, Double> {
    val first = this.getOrNull() ?: return "First param is None".left()
    val second = friend.getOrNull() ?: return "Second param is None".left()
    return (first + second).right()
}

infix operator fun Option<Double>.minus(friend: Int): Option<Double> =
    map { it - friend }

infix operator fun Option<Double>.minus(friend: Float): Option<Double> =
    map { it - friend }

infix operator fun Option<Double>.minus(friend: Double): Option<Double> =
    map { it - friend }

infix operator fun Option<Double>.minus(friend: Option<Int>): Either<String, Double> {
    val first = this.getOrNull() ?: return "First param is None".left()
    val second = friend.getOrNull() ?: return "Second param is None".left()
    return (first - second).right()
}

infix operator fun Option<Double>.minus(friend: Option<Float>): Either<String, Double> {
    val first = this.getOrNull() ?: return "First param is None".left()
    val second = friend.getOrNull() ?: return "Second param is None".left()
    return (first - second).right()
}

infix operator fun Option<Double>.minus(friend: Option<Double>): Either<String, Double> {
    val first = this.getOrNull() ?: return "First param is None".left()
    val second = friend.getOrNull() ?: return "Second param is None".left()
    return (first - second).right()
}

infix operator fun Option<Double>.times(friend: Int): Option<Double> =
    map { it * friend }

infix operator fun Option<Double>.times(friend: Float): Option<Double> =
    map { it * friend }

infix operator fun Option<Double>.times(friend: Double): Option<Double> =
    map { it * friend }

infix operator fun Option<Double>.times(friend: Option<Int>): Either<String, Double> {
    val first = this.getOrNull() ?: return "First param is None".left()
    val second = friend.getOrNull() ?: return "Second param is None".left()
    return (first * second).right()
}

infix operator fun Option<Double>.times(friend: Option<Float>): Either<String, Double> {
    val first = this.getOrNull() ?: return "First param is None".left()
    val second = friend.getOrNull() ?: return "Second param is None".left()
    return (first * second).right()
}

infix operator fun Option<Double>.times(friend: Option<Double>): Either<String, Double> {
    val first = this.getOrNull() ?: return "First param is None".left()
    val second = friend.getOrNull() ?: return "Second param is None".left()
    return (first * second).right()
}

infix operator fun Option<Double>.div(friend: Int): Option<Double> =
    map { it / friend }

infix operator fun Option<Double>.div(friend: Float): Option<Double> =
    map { it / friend }

infix operator fun Option<Double>.div(friend: Double): Option<Double> =
    map { it / friend }

infix operator fun Option<Double>.div(friend: Option<Int>): Either<String, Double> {
    val first = this.getOrNull() ?: return "First param is None".left()
    val second = friend.getOrNull() ?: return "Second param is None".left()
    return (first / second).right()
}

infix operator fun Option<Double>.div(friend: Option<Float>): Either<String, Double> {
    val first = this.getOrNull() ?: return "First param is None".left()
    val second = friend.getOrNull() ?: return "Second param is None".left()
    return (first / second).right()
}

infix operator fun Option<Double>.div(friend: Option<Double>): Either<String, Double> {
    val first = this.getOrNull() ?: return "First param is None".left()
    val second = friend.getOrNull() ?: return "Second param is None".left()
    return (first / second).right()
}