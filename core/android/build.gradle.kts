plugins {
    id(Plugin.ANDROID_LIB)
    id(Plugin.KOTLIN_ANDROID)
    id(Plugin.HILT)
    id(Plugin.KOTLIN_KAPT)
}

android {
    namespace = Namespace.Core.ANDROID

    compileSdk = Version.COMPILE_SDK

    defaultConfig {
        minSdk = Version.MIN_SDK
        targetSdk = Version.TARGET_SDK
    }

    flavorDimensions.add(FlavorDimension.ENV)
    productFlavors {
        create(ProductFlavor.DEV)
        create(ProductFlavor.PROD)
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = Version.TARGET_JVM
    }
}

dependencies {
    api(project(Module.Core.KOTLIN))

    api(platform(Dependency.FIREBASE_BOM))

    implementation(Dependency.FIREBASE_CRASHLYTICS)

    api(Dependency.COROUTINES_ANDROID)

    api(Dependency.LIFECYCLE_VIEW_MODEL)
    api(Dependency.LIFECYCLE_RUNTIME)

    implementation(Dependency.HILT_ANDROID)
    kapt(Dependency.HILT_COMPILER)
}