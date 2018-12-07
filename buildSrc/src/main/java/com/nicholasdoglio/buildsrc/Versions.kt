package com.nicholasdoglio.buildsrc

/**
 * Find which updates are available by running
 *     `$ ./gradlew syncLibs`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version. */
object Versions {
    const val constraint_layout: String = "1.1.3"

    const val espresso_core: String = "3.0.2"

    const val com_android_support_test_runner: String = "1.0.2"

    const val appcompat_v7: String = "28.0.0"

    const val com_android_tools_build_gradle: String =
        "3.3.0-rc01" // exceed the version found: 3.2.1

    const val lint_gradle: String = "26.3.0-rc01" // exceed the version found: 26.2.1

    const val jmfayard_github_io_gradle_kotlin_dsl_libs_gradle_plugin: String = "0.2.6"

    const val junit: String = "4.12"

    const val org_gradle_kotlin_kotlin_dsl_gradle_plugin: String = "1.0.4"

    const val org_jetbrains_kotlin: String = "1.3.10"

    /**
     *
     *   To update Gradle, edit the wrapper file at path:
     *      ./gradle/wrapper/gradle-wrapper.properties
     */
    object Gradle {
        const val runningVersion: String = "5.0"

        const val currentVersion: String = "5.0"

        const val nightlyVersion: String = "5.1-20181201000046+0000"

        const val releaseCandidate: String = ""
    }
}
