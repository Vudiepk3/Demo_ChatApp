
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.example.demo_chatapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.demo_chatapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.firebase.storage.ktx) // Use the Kotlin extensions version
    implementation(libs.firebase.messaging.ktx) // Use the Kotlin extensions version
    implementation(libs.firebase.functions)
    implementation(libs.firebase.firestore.ktx) // Use the Kotlin extensions version
    implementation(libs.firebase.analytics)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation(libs.imagepicker)
    implementation(libs.glide)
    implementation(libs.okhttp)
    implementation(libs.ccp)

    implementation(platform(libs.firebase.bom)) // Keep the BOM for Firebase dependency management
    implementation(libs.firebase.auth)
    implementation(libs.firebase.ui.firestore)
}