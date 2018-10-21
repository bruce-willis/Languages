package combruce_willis.github.languages.ui.languages.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import combruce_willis.github.languages.data.repository.ProgrammingLanguageRepository

class LanguageDetailViewModelFactory(
    private val repository: ProgrammingLanguageRepository =
        ProgrammingLanguageRepository.getInstance(),
    private val languageId: Int
) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return LanguageDetailViewModel(repository, languageId) as T
    }
}