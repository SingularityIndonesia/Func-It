package com.singularity_indonesia.func_it

import arrow.core.*
import arrow.core.getOrElse

/**
 * Created by: stefanus
 * 24/08/23 20.55
 * Design by: stefanus.ayudha@gmail.com
 */

/** Alter Value **/

/** # List **/

/**
 * The alt map, operates directly with the item inside the list, inside the monad.
 * It transforms your Monad<List<A>> into Monad<List<B>>.
 */
infix fun <A, B> Option<List<A>>.altMap(transformer: (A) -> B): Option<List<B>> =
    map {
        it.map(transformer)
    }

infix operator fun <A> Option<List<A>>.plus(friend: A): Option<List<A>> =
    map {
        it.plus(friend)
    }

infix operator fun <A> Option<List<A>>.get(index: Int): Option<A> =
    flatMap {
        runCatching {
            it[index].some()
        }.getOrElse {
            none()
        }
    }

infix operator fun <A> Option<List<A>>.plus(friends: List<A>): Option<List<A>> =
    map {
        it.plus(friends)
    }

/** # Transformers **/
infix fun <A, B> Option<A>.map(transformer: (A) -> B): Option<B> =
    map(transformer)

infix fun <A, B> Option<A>.flatMap(transformer: (some: A) -> Option<B>): Option<B> =
    flatMap(transformer)

infix fun <A> Option<A>.getOrElse(some: A): A =
    getOrElse { some }