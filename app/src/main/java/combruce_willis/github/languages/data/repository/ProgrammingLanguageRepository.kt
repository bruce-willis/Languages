package combruce_willis.github.languages.data.repository

import combruce_willis.github.languages.data.entity.ProgrammingLanguage

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

    private val languages = listOf<ProgrammingLanguage>(
        ProgrammingLanguage(
            "Kotlin",
            "is a statically typed programming language that runs on the Java virtual machine and also can be compiled to JavaScript source code or use the LLVM compiler infrastructure. Its primary development is from a team of JetBrains programmers based in Saint Petersburg, Russia",
            2016,
            "https://en.wikipedia.org/wiki/Kotlin_(programming_language)#/media/File:Kotlin-logo.svg"
        )
    )

    fun getLanguages() = languages

    fun getLanguage(id: Int) = languages[id]

}