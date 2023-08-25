import Result
import arrow.core.Either
import arrow.core.left
import arrow.core.right

/**
 * Created by: stefanus
 * 25/08/23 00.11
 * Design by: stefanus.ayudha@gmail.com
 */

typealias Result<T> = Either<String, T>

/** # Transformer **/
/** Either to result **/
fun <A> toResult(either: Either<String, A>): Result<A> {
    return either
}

fun <A, X> toResult(either: Either<X, A>): Result<A> {
    return either.mapLeft {
        "$it"
    }
}

/** # Alters **/
/** List Get **/
infix operator fun <A> Result<List<A>>.get(index: Int): Result<A> {
    return this.fold(
        ifLeft = { it.left() },
        ifRight = {
            runCatching {
                it[index].right()
            }.getOrElse {
                (it.localizedMessage ?: it.message ?: it.cause?.message ?: "Unknown Error")
                    .left()
            }
        }
    )
}