plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.example.snapsearch"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.snapsearch"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

//configurations.all {
//    resolutionStrategy {
//        force ("com.google.android.gms:play-services-vision:20.0.0")
//        force ("com.google.android.gms:play-services-vision-common:20.0.0")
//    }
//}

dependencies {
    implementation(platform(libs.firebase.bom))

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

//    implementation(libs.firebase.ml.vision) // throwing error duplicate classes!!
//    implementation(libs.firebase.config) // throwing error duplicate classes!!
//    implementation(libs.firebase.functions) // throwing error duplicate classes!!
//    implementation(libs.firebase.firestore) // throwing error duplicate classes!!
//    implementation(libs.firebase.analytics) // throwing error duplicate classes!!

    implementation(libs.image.labeling)
    implementation(libs.volley)
    implementation(libs.picasso)

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
