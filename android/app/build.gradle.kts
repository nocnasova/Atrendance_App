plugins {
    id("com.android.application")
    id("com.google.gms.google-services") // 👈 Firebase plugin
}

android {
    namespace = "com.example.attendance_app" // change if needed
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.attendance_app" // change if needed
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
}
