plugins {
    id(Plugin.ANDROID_LIB)
    id(Plugin.KOTLIN_ANDROID)
}

android {
    namespace = Namespace.Core.NAVIGATION

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

    buildFeatures {
        viewBinding = BuildFeature.VIEW_BINDING
    }
}

dependencies {
    api(project(Module.Core.ANDROID))
}