plugins {
    id(Plugin.ANDROID_APP) version Version.ANDROID_PLUGIN apply false
    id(Plugin.ANDROID_LIB) version Version.ANDROID_PLUGIN apply false
    id(Plugin.KOTLIN_ANDROID) version Version.KOTLIN apply false
    id(Plugin.GOOGLE_SERVICES) version Version.GOOGLE_SERVICES_PLUGIN apply false
    id(Plugin.FIREBASE_CRASHLYTICS) version Version.FIREBASE_CRASHLYTICS_PLUGIN apply false
    id(Plugin.GOOGLE_HILT) version Version.HILT apply false
}