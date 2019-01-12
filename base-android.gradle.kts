/*
 * MIT License
 *
 * Copyright (c) 2019 Nicholas Doglio
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

/*This doesn't work  ¯\_(ツ)_/¯

Waiting on more information

https://stackoverflow.com/questions/53604782/how-to-create-a-base-gradle-file-in-kotlin-dsl-for-multi-module-project/53604884


https://github.com/gradle/kotlin-dsl/issues/1287
*/

//plugins {
//    id("com.android.library")
//    kotlin("kotlin.android")
//    kotlin("kapt")
//}
//
//android {
//    compileSdkVersion(App.compileSdk)
//    defaultConfig {
//        minSdkVersion(App.minSdk)
//        targetSdkVersion(App.targetSdk)
//        versionCode = App.versionCode
//        versionName = App.versionName
//        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
//    }
//
//    buildTypes {
//        getByName("release") {
//            isMinifyEnabled = false
//            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
//        }
//    }
//
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_1_8
//        targetCompatibility = JavaVersion.VERSION_1_8
//    }
//}
//
//dependencies {
//    val implementation by configurations
//    val testImplementation by configurations
//    val androidTestImplementation by configurations
//
//    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
//    implementation(Libs.kotlin_stdlib_jdk8)
//    implementation(Libs.appcompat)
//    testImplementation(Libs.junit)
//    androidTestImplementation(Libs.androidx_test_runner)
//    androidTestImplementation(Libs.espresso_core)
//}
