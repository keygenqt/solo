buildscript {

    val kotlinVersion: String by project
    val gradleVersion: String by project
    val hiltVersion: String by project

    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:$gradleVersion")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("com.google.dagger:hilt-android-gradle-plugin:$hiltVersion")
    }
}

plugins {
    id("com.diffplug.spotless")
}

subprojects {

    apply(plugin = "com.diffplug.spotless")

    spotless {
        kotlin {
            target("**/*.kt")
            targetExclude("**/build/**")
            ktlint(findProperty("ktlintVersion").toString())
                .userData(
                    mapOf(
                        "disabled_rules" to "no-wildcard-imports",
                    )
                )
            licenseHeaderFile("$rootDir/copyright.txt")
        }
    }
}