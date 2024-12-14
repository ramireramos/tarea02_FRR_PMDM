plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "ramirezramos.francisco.tarea2"
    compileSdk = 34

    defaultConfig {
        applicationId = "ramirezramos.francisco.tarea2"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures{
        viewBinding = true;
        dataBinding = true;
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
    implementation("androidx.core:core-splashscreen:1.0.1")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation ("com.squareup.picasso:picasso:2.71828")
    implementation ("androidx.navigation:navigation-fragment-ktx:2.7.1")
    implementation ("androidx.navigation:navigation-ui-ktx:2.7.1")
    implementation ("androidx.databinding:viewbinding:8.7.3")

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}