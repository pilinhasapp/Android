plugins {
    id(Plugin.JAVA_LIB)
    id(Plugin.KOTLIN_JVM)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    implementation(project(Module.Core.KOTLIN))
    implementation(Dependency.JAVAX_INJECT)
}