/**
 * Find which updates are available by running
 *     `$ ./gradlew buildSrcVersions`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version. */
object Versions {
    const val appcompat: String = "1.0.2"

    const val constraintlayout: String = "1.1.3"

    const val espresso_core: String = "3.1.1"

    const val androidx_test_runner: String = "1.1.1"

    const val com_android_tools_build_gradle: String = "3.3.2"

    const val lint_gradle: String = "26.3.2"

    const val de_fayard_buildsrcversions_gradle_plugin: String = "0.3.2" 

    const val junit: String = "4.12"

    const val org_gradle_kotlin_kotlin_dsl_gradle_plugin: String = "1.2.5"

    const val kotlin_android_extensions: String = "1.3.21"

    const val kotlin_annotation_processing_gradle: String = "1.3.21"

    const val kotlin_gradle_plugin: String = "1.3.21"

    const val kotlin_reflect: String = "1.3.21"

    const val kotlin_sam_with_receiver: String = "1.3.21"

    const val kotlin_scripting_compiler_embeddable: String = "1.3.21"

    const val org_jetbrains_kotlin_kotlin_stdlib_jdk8: String = "1.3.21"

    /**
     *
     *   To update Gradle, edit the wrapper file at path:
     *      ./gradle/wrapper/gradle-wrapper.properties
     */
    object Gradle {
        const val runningVersion: String = "5.3"

        const val currentVersion: String = "5.3"

        const val nightlyVersion: String = "5.4-20190322154513+0000"

        const val releaseCandidate: String = ""
    }
}
