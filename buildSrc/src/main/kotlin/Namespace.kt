object Namespace {
    private const val BASE = "com.pilinhas.android"

    const val APP = BASE

    object Core {
        private const val BASE_CORE = "$BASE.core"

        const val ANDROID = "$BASE_CORE.android"
        const val NAVIGATION = "$BASE_CORE.navigation"
        const val PRESENTATION = "$BASE_CORE.presentation"
        const val RESOURCES = "$BASE_CORE.resources"
        const val DATABASE = "$BASE_CORE.database"
        const val DATASTORE = "$BASE_CORE.datastore"
        const val WORK = "$BASE_CORE.work"
    }

    object Data {
        private const val BASE_DATA = "$BASE.data"

        const val OUTCOME = "$BASE_DATA.outcome"
    }

    object Presentation {
        private const val BASE_PRESENTATION = "$BASE.presentation"

        const val HOME = "$BASE_PRESENTATION.home"
    }
}