object Module {
    const val DOMAIN = ":domain"

    object Core {
        private const val BASE = ":core"

        const val ANDROID = "$BASE:android"
        const val NETWORK = "$BASE:network"
        const val DATABASE = "$BASE:database"
        const val DATASTORE = "$BASE:datastore"
        const val WORK = "$BASE:work"
        const val KOTLIN = "$BASE:kotlin"
        const val PRESENTATION = "$BASE:presentation"
        const val NAVIGATION = "$BASE:navigation"
        const val RESOURCES = "$BASE:resources"
    }
}