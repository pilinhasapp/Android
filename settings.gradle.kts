pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootDir.walkTopDown().forEach { file ->
    if (File(file, "src").exists() && File(file, "build.gradle.kts").exists() && !file.endsWith("buildSrc")) {
        val moduleName = file.path.removePrefix(rootDir.path).replace(File.separator, ":")
        include(moduleName)
    }
}
