plugins {
    id("com.android.library")
    id("kotlin-android")
    id("android-module-dependencies")
    id("test-module-dependencies")
    id("jacoco-module-dependencies")
}

android {
    namespace = "app.aaps.shared.tests"
}

dependencies {
    implementation(project(":core:data"))
    implementation(project(":core:interfaces"))
    implementation(project(":core:objects"))
    implementation(project(":core:ui"))
    implementation(project(":core:utils"))
    implementation(project(":implementation"))
    implementation(project(":shared:impl"))


    api(Libs.Mockito.jupiter)
    api(Libs.Mockito.kotlin)
    api(Libs.JUnit.jupiterApi)

    //api "com.google.dagger:dagger:$dagger_version"
    //api "com.google.dagger:dagger-android:$dagger_version"
    //api "com.google.dagger:dagger-android-support:$dagger_version"
}