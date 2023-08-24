import arrow.core.Option

/**
 * Created by: stefanus
 * 24/08/23 20.55
 * Design by: stefanus.ayudha@gmail.com
 */

/** Alter Value **/
/** # Int **/
infix operator fun Option<Int>.plus(friend: Int): Option<Int> {
    return this.map { it + friend }
}

infix operator fun Option<Int>.minus(friend: Int): Option<Int> {
    return this.map { it - friend }
}

infix operator fun Option<Int>.times(friend: Int): Option<Int> {
    return this.map { it * friend }
}

infix operator fun Option<Int>.div(friend: Int): Option<Int> {
    return this.map { it / friend }
}

infix operator fun Option<Int>.rem(friend: Int): Option<Int> {
    return this.map { it % friend }
}

/** # Float **/
infix operator fun Option<Float>.plus(friend: Float): Option<Float> {
    return this.map { it + friend }
}

infix operator fun Option<Float>.minus(friend: Float): Option<Float> {
    return this.map { it - friend }
}

infix operator fun Option<Float>.times(friend: Float): Option<Float> {
    return this.map { it * friend }
}

infix operator fun Option<Float>.div(friend: Float): Option<Float> {
    return this.map { it / friend }
}

/** # Double **/
infix operator fun Option<Double>.plus(friend: Double): Option<Double> {
    return this.map { it + friend }
}

infix operator fun Option<Double>.minus(friend: Double): Option<Double> {
    return this.map { it - friend }
}

infix operator fun Option<Double>.times(friend: Double): Option<Double> {
    return this.map { it * friend }
}

infix operator fun Option<Double>.div(friend: Double): Option<Double> {
    return this.map { it / friend }
}