/*
This doesn't work  ¯\_(ツ)_/¯

Waiting on more information

https://stackoverflow.com/questions/53604782/how-to-create-a-base-gradle-file-in-kotlin-dsl-for-multi-module-project/53604884


https://github.com/gradle/kotlin-dsl/issues/1287





import com.android.build.gradle.LibraryExtension
import com.nicholasdoglio.buildsrc.App
import com.nicholasdoglio.buildsrc.Libs

apply {
    plugin("com.android.library")
    plugin("org.jetbrains.kotlin.android")
    plugin("org.jetbrains.kotlin.kapt")
}

configure<LibraryExtension> {
    compileSdkVersion(App.compileSdk)
    defaultConfig {
        minSdkVersion(App.minSdk)
        targetSdkVersion(App.targetSdk)
        versionCode = App.versionCode
        versionName = App.versionName
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    val implementation by configurations
    val testImplementation by configurations
    val androidTestImplementation by configurations

    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Libs.kotlin_stdlib_jdk8)
    implementation(Libs.appcompat_v7)
    testImplementation(Libs.junit)
    androidTestImplementation(Libs.com_android_support_test_runner)
    androidTestImplementation(Libs.espresso_core)
}*/
