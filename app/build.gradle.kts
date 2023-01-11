import com.android.build.gradle.AppPlugin

plugins {
    id(Plugin.ANDROID_APP)
    id(Plugin.KOTLIN_ANDROID)
    id(Plugin.GOOGLE_SERVICES)
    id(Plugin.FIREBASE_CRASHLYTICS)
    id(Plugin.HILT)
    id(Plugin.KOTLIN_KAPT)
}

android {
    namespace = Namespace.APP

    compileSdk = Version.COMPILE_SDK

    defaultConfig {
        minSdk = Version.MIN_SDK
        targetSdk = Version.TARGET_SDK
        applicationId = Application.Pilinhas.ID
        versionCode = Application.Pilinhas.VERSION_CODE
        versionName = Application.Pilinhas.VERSION_NAME
    }

    flavorDimensions.add(FlavorDimension.ENV)
    productFlavors {
        create(ProductFlavor.DEV) {
            applicationIdSuffix = ApplicationIdSuffix.DEV
            versionNameSuffix = VersionNameSuffix.DEV
        }
        create(ProductFlavor.PROD)
    }

    buildTypes {
        debug {
            isMinifyEnabled = IsMinifyEnabled.DEBUG
            proguardFiles(getDefaultProguardFile(ProguardFile.DEFAULT), ProguardFile.PROJECT)
        }

        release {
            isMinifyEnabled = IsMinifyEnabled.RELEASE
            proguardFiles(getDefaultProguardFile(ProguardFile.DEFAULT), ProguardFile.PROJECT)
        }
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
    rootProject.subprojects.forEach { project ->
        if (project.subprojects.isEmpty() && !project.plugins.hasPlugin(AppPlugin::class)) {
            implementation(project)
        }
    }

    implementation(Dependency.ACTIVITY_COMPOSE)

    implementation(Dependency.HILT_WORK)
    kapt(Dependency.HILT_WORK_COMPILER)

    implementation(Dependency.HILT_ANDROID)
    kapt(Dependency.HILT_COMPILER)
}