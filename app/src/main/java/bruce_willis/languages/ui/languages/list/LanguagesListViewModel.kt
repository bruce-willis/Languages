package bruce_willis.languages.ui.languages.list

import androidx.lifecycle.ViewModel
import combruce_willis.github.languages.data.repository.ProgrammingLanguageRepository

// some kind of `Pure man DI`
// http://blog.ploeh.dk/2014/06/10/pure-di/,
// https://blog.jetbrains.com/dotnet/2018/07/31/dependency-injection-doesnt-strictly-require-frameworks-code-smells-series/#more-19339
// TODO: replace with proper DI
class LanguagesListViewModel(
    repository: ProgrammingLanguageRepository =
        ProgrammingLanguageRepository.getInstance()
) :
    ViewModel() {

    val languages = repository.getLanguages()
}
