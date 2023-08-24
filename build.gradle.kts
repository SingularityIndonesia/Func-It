plugins {
    kotlin("multiplatform") version "1.9.10"
    id("maven-publish")
}

group = "com.singularity_indonesia.func_it"
version = "1.0.0"

repositories {
    mavenCentral()
}

kotlin {
    jvm {
        jvmToolchain(8)
        withJava()
        testRuns.named("test") {
            executionTask.configure {
                useJUnitPlatform()
            }
        }
    }
    /*js {
        browser {
            commonWebpackConfig {
                cssSupport {
                    enabled.set(true)
                }
            }
        }
    }*/
    /*val hostOs = System.getProperty("os.name")
    val isArm64 = System.getProperty("os.arch") == "aarch64"
    val isMingwX64 = hostOs.startsWith("Windows")
    val nativeTarget = when {
        hostOs == "Mac OS X" && isArm64 -> macosArm64("native")
        hostOs == "Mac OS X" && !isArm64 -> macosX64("native")
        hostOs == "Linux" && isArm64 -> linuxArm64("native")
        hostOs == "Linux" && !isArm64 -> linuxX64("native")
        isMingwX64 -> mingwX64("native")
        else -> throw GradleException("Host OS is not supported in Kotlin/Native.")
    }*/

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("io.arrow-kt:arrow-core:1.2.0")
                implementation("io.arrow-kt:arrow-fx-coroutines:1.2.0")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation("org.junit.jupiter:junit-jupiter:5.10.0")

                implementation("io.arrow-kt:arrow-core:1.2.0")
                implementation("io.arrow-kt:arrow-fx-coroutines:1.2.0")
            }
        }
//        val jvmMain by getting
//        val jvmTest by getting
//        val jsMain by getting
//        val jsTest by getting
//        val nativeMain by getting {
//            dependencies {
//                implementation("io.arrow-kt:arrow-core:1.2.0")
//                implementation("io.arrow-kt:arrow-fx-coroutines:1.2.0")
//            }
//        }
//        val nativeTest by getting {
//            dependencies {
//                implementation(kotlin("test"))
//                implementation("org.junit.jupiter:junit-jupiter:5.10.0")
//
//                implementation("io.arrow-kt:arrow-core:1.2.0")
//                implementation("io.arrow-kt:arrow-fx-coroutines:1.2.0")
//            }
//        }
    }
}
