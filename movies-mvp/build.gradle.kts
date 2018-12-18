
plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(App.compileSdk)
    defaultConfig {
        applicationId = "com.nicholasdoglio.movies"
        minSdkVersion(App.minSdk)
        targetSdkVersion(App.targetSdk)
        versionCode = App.versionCode
        versionName = App.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Libs.org_jetbrains_kotlin_kotlin_stdlib_jdk8)
    implementation(Libs.appcompat)
    implementation(Libs.constraintlayout)
    testImplementation(Libs.junit)
    androidTestImplementation(Libs.androidx_test_runner)
    androidTestImplementation(Libs.espresso_core)
}
