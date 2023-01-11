plugins {
    id(Plugin.ANDROID_LIB)
    id(Plugin.KOTLIN_ANDROID)
    id(Plugin.HILT)
    id(Plugin.KOTLIN_KAPT)
}

android {
    namespace = Namespace.Presentation.HOME

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
        compose = BuildFeature.COMPOSE
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Version.KOTLIN_COMPILER_EXTENSION
    }
}

dependencies {
    implementation(project(Module.Core.PRESENTATION))

    implementation(Dependency.HILT_ANDROID)
    kapt(Dependency.HILT_COMPILER)
}