plugins {
    id("org.jetbrains.compose") version "1.0.0"
    id("org.jmailen.kotlinter")
    id("com.android.application")
    kotlin("android")
}

group = "city.ludos.f8full"
version = "1.0"


dependencies {
    implementation(project(":common"))
    implementation("androidx.activity:activity-compose:1.4.0")
}

android {
    compileSdk = 31
    defaultConfig {
        applicationId = "city.ludos.f8full.android"
        minSdk = 24
        targetSdk  = 31
        versionCode = 1
        versionName = "1.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}