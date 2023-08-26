package com.singularity_indonesia.func_it

import arrow.core.*
import arrow.core.flatMap

/**
 * Created by: stefanus
 * 24/08/23 21.15
 * Design by: stefanus.ayudha@gmail.com
 */

/** # Alter Value **/
/** ## List **/
/**
 * The alt map, operates directly with the item inside the list, inside the monad.
 * It transforms your Monad<List<A>> into Monad<List<B>>.
 */
infix fun <A, B, X> Either<X, List<A>>.altMap(transformer: (A) -> B): Either<X, List<B>> {
    return this.map {
        it.map(transformer)
    }
}

infix operator fun <A, X> Either<X, List<A>>.plus(friend: A): Either<X, List<A>> {
    return this.map {
        it.plus(friend)
    }
}

infix operator fun <A, X> Either<X, List<A>>.plus(friends: List<A>): Either<X, List<A>> {
    return this.map {
        it.plus(friends)
    }
}

/** ## Transformers **/
infix fun <A, B, X> Either<X, A>.map(transformer: (A) -> B): Either<X, B> {
    return this.map(transformer)
}

infix fun <A, X, Y> Either<X, A>.mapLeft(transformer: (X) -> Y): Either<Y, A> {
    return this.mapLeft(transformer)
}

infix fun <A, B, C> Either<A, B>.flatMap(transformer: (right: B) -> Either<A, C>): Either<A, C> {
    return this.flatMap(transformer)
}