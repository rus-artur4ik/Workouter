plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = 33
    defaultConfig {
        applicationId = "com.rus_artur4ik.simpleworkoutdiary.android"
        minSdk = 26
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    buildFeatures {
        // Enables Jetpack Compose for this module
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.0"
    }
}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.6.1")
    implementation("androidx.appcompat:appcompat:1.5.0")

    // Compose
    implementation("androidx.activity:activity-compose:1.5.1")
    implementation("androidx.compose.material3:material3:1.0.0-beta01")
    implementation("androidx.compose.material3:material3-window-size-class:1.0.0-beta01")
    implementation("androidx.compose.animation:animation:1.2.1")
    // Tooling support (Previews, etc.)
    implementation("androidx.compose.ui:ui-tooling:1.2.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.5.1")
    implementation("com.google.android.material:compose-theme-adapter:1.1.17")

    // Navigation
    implementation("androidx.navigation:navigation-compose:2.5.1")

    // Dagger
    annotationProcessor("com.google.dagger:dagger-android-processor:2.43.1")
    annotationProcessor("com.google.dagger:dagger-compiler:2.43.1")
    implementation("com.google.dagger:dagger-android:2.43.1")

    // Misc
    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")

}