# Func-It (Multi Platform)

Collections of utils to support your functional programming kotlin.
This library uses awesome [Kotlin Arrow](https://arrow-kt.io/) as its base functional proramming library.
This library is multiplatform purposes.

It works with standard library such scope functions, standard monads, etc.
This library won't add any new things to learn, just basic things with extra and easier accessibilities.
Ex: infix functions, alters, transformers.

## Implementation

```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}

dependencies {
    implementation 'com.github.SingularityIndonesia:Func-It:1.0.0-alpha1-20230826-01'
}
```

## Features

### 1. Alters

The alters are bunch of infix functions that can operate with the value within the standard monads, such: Options,
Either etc.
Ex:

```kotlin
val a = none<Int>()
// these operations (in b) are lazy, means that these operations won't be executed, unless the input is type of Some
val b = a + 1 + 2 + 3

// these operations (in b) are lazy, means that these operations won't be executed, unless the input is type of Right
val a: Either<ErrorMessage, Int> = 1.right()
val b = a + 2 + 3 + 4
```

Working with monad of list is always awful, so i present monad's list alters with ``altMap``. Ex:

```kotlin

val stepOne: (Int) -> String = { inp ->
    return "$inp step1"
}

val stepTwo: (String) -> String = { inp ->
    return "$inp step2"
}

val a = (1, 2, 3).toList().some()
val b = a altMap stepOne altMap stepTwo // return Some<List<String>> of ["1 step1 step2", "2 step1 step2", .. ]
```

### 2. Transformers

The purpose of transformers is to transform one object to another. Ex:

```kotlin
val stringToInt: (String) -> Option<Int> = { inp ->
    return runCatching {
        inp.toInt()
            .some()
    }.getOrElse {
        none()
    }
}

val a = "some string"
val b = a let stringToInt // result is none

// easy chain transformation
val c = a let stepOne let stepTwo let stepThree let ...
```

### 3. Escaper

This is very useful infix to immediately escape from error in standard monads.

Escaping from left:

```kotlin
val a: Either<String, Int> = "error".left()
val b = a orElse 5
```

Escaping to another monad

```kotlin
// get user from db return error
val getUserFromDB: () -> Result<User> = ...

// get user from internet return User
val getUserFromInternet: () -> Result<User> = ...

// try to get user from db, should return left
val a = getUserFromDB()

// try to get user from db or from internet
val b = (a orElse getUserFromInternet.invoke()) orElse User("dummy")

// the result in 'b' will be User object from internet.
```

*Note: Just remember that escaper is not associative.*

### 4. Infix

Many useful infix functions in it. Ex:

You can alter list inside monad. You can do many things, such appending to list, get elem by index. etc.

```kotlin
val a = (1..5).toList().some()
val b = a + 6 // result = Some([1,2,3,4,5,6])
1 * 2
val c = a[0] // result = Some(1)
val d = a[10] // result = None
```

### 5. Extra standard monad

I Introduce the ``Result<A>`` monad as type alias for ``Either<String,A>``

# Many More Coming

If you have some cool idea that I could put in it, please tell me, I would love to.
