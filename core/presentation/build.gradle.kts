plugins {
    id(Plugin.ANDROID_LIB)
    id(Plugin.KOTLIN_ANDROID)
}

android {
    namespace = Namespace.Core.PRESENTATION

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
    api(project(Module.Core.NAVIGATION))
    api(project(Module.Core.RESOURCES))
    api(project(Module.DOMAIN))

    api(platform(Dependency.COMPOSE_BOM))
    api(Dependency.COMPOSE_LIVE_DATA)
    api(Dependency.COMPOSE_MATERIAL3)
    api(Dependency.CONSTRAINT_LAYOUT_COMPOSE)
    api(Dependency.NAVIGATION_COMPOSE)
    api(Dependency.HILT_NAVIGATION_COMPOSE)
    api(Dependency.ACCOMPANIST_NAVIGATION_MATERIAL)
    api(Dependency.ACCOMPANIST_FLOW_LAYOUT)
    api(Dependency.ACCOMPANIST_PAGER)

    api(Dependency.LIFECYCLE_VIEW_MODEL_COMPOSE)

    api(Dependency.COIL_COMPOSE)
    api(Dependency.COIL_SVG)

    api(Dependency.BROWSER)
}