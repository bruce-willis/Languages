package bruce_willis.languages.ui.languages.detail

import androidx.lifecycle.ViewModel
import combruce_willis.github.languages.data.repository.ProgrammingLanguageRepository

class LanguageDetailViewModel(
    repository: ProgrammingLanguageRepository,
    languageId: Int
) :
    ViewModel() {

    val language = repository.getLanguage(languageId)

}