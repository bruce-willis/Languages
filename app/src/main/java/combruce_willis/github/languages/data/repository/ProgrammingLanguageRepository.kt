package combruce_willis.github.languages.data.repository

import combruce_willis.github.languages.data.converter.convertToBasicModel
import combruce_willis.github.languages.data.storage.languages
import combruce_willis.github.languages.utils.fromCallable

class ProgrammingLanguageRepository private constructor() {

    // TODO: replace with proper DI (Dagger/Koin)
    companion object {

        // For Singleton instantiation
        @Volatile
        private var instance: ProgrammingLanguageRepository? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: ProgrammingLanguageRepository().also { instance = it }
            }
    }

    fun getLanguages() = fromCallable {
        // Thread.sleep(30000)
        languages.map { it.convertToBasicModel() }
    }

    fun getLanguage(id: Int) = fromCallable { languages.find { it.id == id }!! }

}