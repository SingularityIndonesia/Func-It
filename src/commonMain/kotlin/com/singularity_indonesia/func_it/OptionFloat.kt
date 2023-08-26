package com.singularity_indonesia.func_it

import arrow.core.*

/**
 * Created by: stefanus
 * 26/08/23 12.14
 * Design by: stefanus.ayudha@gmail.com
 */
/** # Float **/
infix operator fun Option<Float>.plus(friend: Int): Option<Float> =
    map { it + friend }

infix operator fun Option<Float>.plus(friend: Float): Option<Float> =
    map { it + friend }

infix operator fun Option<Float>.plus(friend: Double): Option<Double> =
    map { it.toDouble() + friend }

infix operator fun Option<Float>.plus(friend: Option<Int>): Either<String, Float> {
    val first = this.getOrNull() ?: return "First param is None".left()
    val second = friend.getOrNull() ?: return "Second param is None".left()
    return (first + second).right()
}

infix operator fun Option<Float>.plus(friend: Option<Float>): Either<String, Float> {
    val first = this.getOrNull() ?: return "First param is None".left()
    val second = friend.getOrNull() ?: return "Second param is None".left()
    return (first + second).right()
}

infix operator fun Option<Float>.plus(friend: Option<Double>): Either<String, Double> {
    val first = this.getOrNull()?.toDouble() ?: return "First param is None".left()
    val second = friend.getOrNull() ?: return "Second param is None".left()
    return (first + second).right()
}

infix operator fun Option<Float>.minus(friend: Int): Option<Float> =
    map { it - friend }

infix operator fun Option<Float>.minus(friend: Float): Option<Float> =
    map { it - friend }

infix operator fun Option<Float>.minus(friend: Double): Option<Double> =
    map { it.toDouble() - friend }

infix operator fun Option<Float>.minus(friend: Option<Int>): Either<String, Float> {
    val first = this.getOrNull() ?: return "First param is None".left()
    val second = friend.getOrNull() ?: return "Second param is None".left()
    return (first - second).right()
}

infix operator fun Option<Float>.minus(friend: Option<Float>): Either<String, Float> {
    val first = this.getOrNull() ?: return "First param is None".left()
    val second = friend.getOrNull() ?: return "Second param is None".left()
    return (first - second).right()
}

infix operator fun Option<Float>.minus(friend: Option<Double>): Either<String, Double> {
    val first = this.getOrNull()?.toDouble() ?: return "First param is None".left()
    val second = friend.getOrNull() ?: return "Second param is None".left()
    return (first - second).right()
}

infix operator fun Option<Float>.times(friend: Int): Option<Float> =
    map { it * friend }

infix operator fun Option<Float>.times(friend: Float): Option<Float> =
    map { it * friend }

infix operator fun Option<Float>.times(friend: Double): Option<Double> =
    map { it.toDouble() * friend }

infix operator fun Option<Float>.times(friend: Option<Int>): Either<String, Float> {
    val first = this.getOrNull() ?: return "First param is None".left()
    val second = friend.getOrNull() ?: return "Second param is None".left()
    return (first * second).right()
}

infix operator fun Option<Float>.times(friend: Option<Float>): Either<String, Float> {
    val first = this.getOrNull() ?: return "First param is None".left()
    val second = friend.getOrNull() ?: return "Second param is None".left()
    return (first * second).right()
}

infix operator fun Option<Float>.times(friend: Option<Double>): Either<String, Double> {
    val first = this.getOrNull()?.toDouble() ?: return "First param is None".left()
    val second = friend.getOrNull() ?: return "Second param is None".left()
    return (first * second).right()
}

infix operator fun Option<Float>.div(friend: Int): Option<Float> =
    map { it / friend }

infix operator fun Option<Float>.div(friend: Float): Option<Float> =
    map { it / friend }

infix operator fun Option<Float>.div(friend: Double): Option<Double> =
    map { it.toDouble() / friend }

infix operator fun Option<Float>.div(friend: Option<Int>): Either<String, Float> {
    val first = this.getOrNull() ?: return "First param is None".left()
    val second = friend.getOrNull() ?: return "Second param is None".left()
    return (first / second).right()
}

infix operator fun Option<Float>.div(friend: Option<Float>): Either<String, Float> {
    val first = this.getOrNull() ?: return "First param is None".left()
    val second = friend.getOrNull() ?: return "Second param is None".left()
    return (first / second).right()
}

infix operator fun Option<Float>.div(friend: Option<Double>): Either<String, Double> {
    val first = this.getOrNull()?.toDouble() ?: return "First param is None".left()
    val second = friend.getOrNull() ?: return "Second param is None".left()
    return (first / second).right()
}