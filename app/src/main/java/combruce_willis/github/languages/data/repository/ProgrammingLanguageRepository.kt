package combruce_willis.github.languages.data.repository

import combruce_willis.github.languages.data.converter.convertToBasicModel
import combruce_willis.github.languages.data.entity.ProgrammingLanguageBasic
import combruce_willis.github.languages.data.storage.languages

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


    fun getLanguages() : List<ProgrammingLanguageBasic> {
        //Thread.sleep(20000)
        return languages.map { it.convertToBasicModel() }
    }

    fun getLanguage(id: Int) = languages.find { it.id == id }!!

}