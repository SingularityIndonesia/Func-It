package com.singularity_indonesia.func_it

import arrow.core.Option
import arrow.core.left
import arrow.core.right

/**
 * Created by: stefanus
 * 26/08/23 12.14
 * Design by: stefanus.ayudha@gmail.com
 */
/** # Int **/
infix operator fun Option<Int>.plus(friend: Int): Option<Int> =
    map { it + friend }

infix operator fun Option<Int>.plus(friend: Float): Option<Float> =
    map { it.toFloat() + friend }

infix operator fun Option<Int>.plus(friend: Double): Option<Double> =
    map { it.toFloat() + friend }

//infix operator fun Option<Int>.plus(friend: Option<Int>): Result<Int> {
//    val first = this.getOrNull() ?: return "First param is None".left()
//    val second = friend.getOrNull() ?: return "Second param is None".left()
//    return (first + second).right()
//}
//
//infix operator fun Option<Int>.plus(friend: Option<Float>): Result<Float> {
//    val first = this.getOrNull() ?: return "First param is None".left()
//    val second = friend.getOrNull() ?: return "Second param is None".left()
//    return (first.toFloat() + second).right()
//}
//
//infix operator fun Option<Int>.plus(friend: Option<Double>): Result<Double> {
//    val first = this.getOrNull()?.toDouble() ?: return "First param is None".left()
//    val second = friend.getOrNull() ?: return "Second param is None".left()
//    return (first + second).right()
//}

infix operator fun Option<Int>.minus(friend: Int): Option<Int> =
    map { it - friend }

infix operator fun Option<Int>.minus(friend: Float): Option<Float> =
    map { it.toFloat() - friend }

infix operator fun Option<Int>.minus(friend: Double): Option<Double> =
    map { it.toFloat() - friend }

//infix operator fun Option<Int>.minus(friend: Option<Int>): Result<Int> {
//    val first = this.getOrNull() ?: return "First param is None".left()
//    val second = friend.getOrNull() ?: return "Second param is None".left()
//    return (first - second).right()
//}
//
//infix operator fun Option<Int>.minus(friend: Option<Float>): Result<Float> {
//    val first = this.getOrNull() ?: return "First param is None".left()
//    val second = friend.getOrNull() ?: return "Second param is None".left()
//    return (first.toFloat() - second).right()
//}
//
//infix operator fun Option<Int>.minus(friend: Option<Double>): Result<Double> {
//    val first = this.getOrNull()?.toDouble() ?: return "First param is None".left()
//    val second = friend.getOrNull() ?: return "Second param is None".left()
//    return (first - second).right()
//}

infix operator fun Option<Int>.times(friend: Int): Option<Int> =
    map { it * friend }

infix operator fun Option<Int>.times(friend: Float): Option<Float> =
    map { it.toFloat() * friend }

infix operator fun Option<Int>.times(friend: Double): Option<Double> =
    map { it.toFloat() * friend }

//infix operator fun Option<Int>.times(friend: Option<Int>): Result<Int> {
//    val first = this.getOrNull() ?: return "First param is None".left()
//    val second = friend.getOrNull() ?: return "Second param is None".left()
//    return (first * second).right()
//}
//
//infix operator fun Option<Int>.times(friend: Option<Float>): Result<Float> {
//    val first = this.getOrNull() ?: return "First param is None".left()
//    val second = friend.getOrNull() ?: return "Second param is None".left()
//    return (first.toFloat() * second).right()
//}
//
//infix operator fun Option<Int>.times(friend: Option<Double>): Result<Double> {
//    val first = this.getOrNull()?.toDouble() ?: return "First param is None".left()
//    val second = friend.getOrNull() ?: return "Second param is None".left()
//    return (first * second).right()
//}

infix operator fun Option<Int>.div(friend: Int): Option<Int> =
    map { it / friend }

infix operator fun Option<Int>.div(friend: Float): Option<Float> =
    map { it.toFloat() / friend }

infix operator fun Option<Int>.div(friend: Double): Option<Double> =
    map { it.toFloat() / friend }

//infix operator fun Option<Int>.div(friend: Option<Int>): Result<Int> {
//    val first = this.getOrNull() ?: return "First param is None".left()
//    val second = friend.getOrNull() ?: return "Second param is None".left()
//    return (first / second).right()
//}
//
//infix operator fun Option<Int>.div(friend: Option<Float>): Result<Float> {
//    val first = this.getOrNull() ?: return "First param is None".left()
//    val second = friend.getOrNull() ?: return "Second param is None".left()
//    return (first.toFloat() / second).right()
//}
//
//infix operator fun Option<Int>.div(friend: Option<Double>): Result<Double> {
//    val first = this.getOrNull()?.toDouble() ?: return "First param is None".left()
//    val second = friend.getOrNull() ?: return "Second param is None".left()
//    return (first / second).right()
//}

infix operator fun Option<Int>.rem(friend: Int): Option<Int> =
    map { it % friend }
