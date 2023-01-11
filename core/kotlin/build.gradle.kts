plugins {
    id(Plugin.JAVA_LIB)
    id(Plugin.KOTLIN_JVM)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    api(Dependency.COROUTINES_CORE)
}