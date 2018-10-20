package combruce_willis.github.languages.ui.languages.detail

import androidx.lifecycle.ViewModel
import combruce_willis.github.languages.data.entity.ProgrammingLanguage
import combruce_willis.github.languages.data.repository.ProgrammingLanguageRepository

class LanguageDetailViewModel(
    repository: ProgrammingLanguageRepository,
    languageId: Int
) :
    ViewModel() {

    val language: ProgrammingLanguage = repository.getLanguage(languageId)

}