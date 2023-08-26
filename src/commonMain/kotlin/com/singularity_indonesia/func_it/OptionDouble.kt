package com.singularity_indonesia.func_it

import arrow.core.Option

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

//infix operator fun Option<Double>.plus(friend: Option<Int>): Result<Double> {
//    val first = this.getOrNull() ?: return "First param is None".left()
//    val second = friend.getOrNull() ?: return "Second param is None".left()
//    return (first + second).right()
//}
//
//infix operator fun Option<Double>.plus(friend: Option<Float>): Result<Double> {
//    val first = this.getOrNull() ?: return "First param is None".left()
//    val second = friend.getOrNull() ?: return "Second param is None".left()
//    return (first + second).right()
//}
//
//infix operator fun Option<Double>.plus(friend: Option<Double>): Result<Double> {
//    val first = this.getOrNull() ?: return "First param is None".left()
//    val second = friend.getOrNull() ?: return "Second param is None".left()
//    return (first + second).right()
//}

infix operator fun Option<Double>.minus(friend: Int): Option<Double> =
    map { it - friend }

infix operator fun Option<Double>.minus(friend: Float): Option<Double> =
    map { it - friend }

infix operator fun Option<Double>.minus(friend: Double): Option<Double> =
    map { it - friend }

//infix operator fun Option<Double>.minus(friend: Option<Int>): Result<Double> {
//    val first = this.getOrNull() ?: return "First param is None".left()
//    val second = friend.getOrNull() ?: return "Second param is None".left()
//    return (first - second).right()
//}
//
//infix operator fun Option<Double>.minus(friend: Option<Float>): Result<Double> {
//    val first = this.getOrNull() ?: return "First param is None".left()
//    val second = friend.getOrNull() ?: return "Second param is None".left()
//    return (first - second).right()
//}
//
//infix operator fun Option<Double>.minus(friend: Option<Double>): Result<Double> {
//    val first = this.getOrNull() ?: return "First param is None".left()
//    val second = friend.getOrNull() ?: return "Second param is None".left()
//    return (first - second).right()
//}

infix operator fun Option<Double>.times(friend: Int): Option<Double> =
    map { it * friend }

infix operator fun Option<Double>.times(friend: Float): Option<Double> =
    map { it * friend }

infix operator fun Option<Double>.times(friend: Double): Option<Double> =
    map { it * friend }

//infix operator fun Option<Double>.times(friend: Option<Int>): Result<Double> {
//    val first = this.getOrNull() ?: return "First param is None".left()
//    val second = friend.getOrNull() ?: return "Second param is None".left()
//    return (first * second).right()
//}
//
//infix operator fun Option<Double>.times(friend: Option<Float>): Result<Double> {
//    val first = this.getOrNull() ?: return "First param is None".left()
//    val second = friend.getOrNull() ?: return "Second param is None".left()
//    return (first * second).right()
//}
//
//infix operator fun Option<Double>.times(friend: Option<Double>): Result<Double> {
//    val first = this.getOrNull() ?: return "First param is None".left()
//    val second = friend.getOrNull() ?: return "Second param is None".left()
//    return (first * second).right()
//}

infix operator fun Option<Double>.div(friend: Int): Option<Double> =
    map { it / friend }

infix operator fun Option<Double>.div(friend: Float): Option<Double> =
    map { it / friend }

infix operator fun Option<Double>.div(friend: Double): Option<Double> =
    map { it / friend }

//infix operator fun Option<Double>.div(friend: Option<Int>): Result<Double> {
//    val first = this.getOrNull() ?: return "First param is None".left()
//    val second = friend.getOrNull() ?: return "Second param is None".left()
//    return (first / second).right()
//}
//
//infix operator fun Option<Double>.div(friend: Option<Float>): Result<Double> {
//    val first = this.getOrNull() ?: return "First param is None".left()
//    val second = friend.getOrNull() ?: return "Second param is None".left()
//    return (first / second).right()
//}
//
//infix operator fun Option<Double>.div(friend: Option<Double>): Result<Double> {
//    val first = this.getOrNull() ?: return "First param is None".left()
//    val second = friend.getOrNull() ?: return "Second param is None".left()
//    return (first / second).right()
//}