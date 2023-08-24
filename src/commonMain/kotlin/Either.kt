import arrow.core.Either
import arrow.core.flatMap

/**
 * Created by: stefanus
 * 24/08/23 21.15
 * Design by: stefanus.ayudha@gmail.com
 */

/** Alter Value **/
/** # Int **/
infix operator fun Either<*, Int>.plus(friend: Int): Either<*, Int> {
    return this.map { it + friend }
}

infix operator fun Either<*, Int>.minus(friend: Int): Either<*, Int> {
    return this.map { it - friend }
}

infix operator fun Either<*, Int>.times(friend: Int): Either<*, Int> {
    return this.map { it * friend }
}

infix operator fun Either<*, Int>.div(friend: Int): Either<*, Int> {
    return this.map { it / friend }
}

infix operator fun Either<*, Int>.rem(friend: Int): Either<*, Int> {
    return this.map { it % friend }
}

/** # Float **/
infix operator fun Either<*, Float>.plus(friend: Float): Either<*, Float> {
    return this.map { it + friend }
}

infix operator fun Either<*, Float>.minus(friend: Float): Either<*, Float> {
    return this.map { it - friend }
}

infix operator fun Either<*, Float>.times(friend: Float): Either<*, Float> {
    return this.map { it * friend }
}

infix operator fun Either<*, Float>.div(friend: Float): Either<*, Float> {
    return this.map { it / friend }
}

/** # Double **/
infix operator fun Either<*, Double>.plus(friend: Double): Either<*, Double> {
    return this.map { it + friend }
}

infix operator fun Either<*, Double>.minus(friend: Double): Either<*, Double> {
    return this.map { it - friend }
}

infix operator fun Either<*, Double>.times(friend: Double): Either<*, Double> {
    return this.map { it * friend }
}

infix operator fun Either<*, Double>.div(friend: Double): Either<*, Double> {
    return this.map { it / friend }
}

/** # Transformers **/
infix fun <A, B, X> Either<X, A>.map(transformer: (A) -> B): Either<X, B> {
    return this.map(transformer)
}

infix fun <A, X, Y> Either<X, A>.mapLeft(transformer: (X) -> Y): Either<Y, A> {
    return this.mapLeft(transformer)
}

infix fun <A, B, C> Either<A, B>.flatMap(transformer: (right: B) -> Either<A, C>): Either<A, C> {
    return this.flatMap(transformer)
}