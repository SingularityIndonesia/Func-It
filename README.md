# Func-It
Collections of utils to support your functional programming kotlin.
This library uses awesome [Kotlin Arrow](https://arrow-kt.io/) as its base functional proramming library.

It works with standard library such scope functions, and elses. Basicaly i just make it easier to use.
This library won't adding any new things to learn, just a basic tings with extra and easier accessibilities.

## Implementation
```groovy
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}

dependencies {
  implementation 'com.github.SingularityIndonesia:Func-It:1.0.0-alpha1'
}
```

## Features
### 1. Alters
The alters are bunch of infix functions that can operate with the value within a standard wrapper, such: Options, Either etc.
Ex:
```kotlin
val a = none<Int>()
// these operations (in b) are lazy, means that these operations won't be executed, unless the input is type of Some
val b = a + 1 + 2 + 3

// these operations (in b) are lazy, means that these operations won't be executed, unless the input is type of Right
val a: Either<ErrorMessage,Int> = 1.right()
val b = a + 2 + 3 + 4
```

### 2. Transformers
The purpose of transformers is to transform one object to another. Ex:
```kotlin
fun stringToInt(inp: String): Option<Int> =
    runCatching { 
        inp.toInt()
            .some()
    }.getOrElse { 
        none()
    }

val a = "some string"
val b = a let ::stringToInt // result is none

// easy chain transformation
val c = a let ::stepOne let ::stepTwo let ::stepThree let ...
```

# Many More Coming
If you have some cool idea that I could put in it, please tell me, I would love to.
