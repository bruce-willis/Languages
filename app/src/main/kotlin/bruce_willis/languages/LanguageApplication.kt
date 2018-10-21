package combruce_willis.github.languages

import android.app.Application
import io.github.kbiakov.codeview.classifier.CodeProcessor

class LanguageApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        //CodeProcessor.init(this)
        //code_view.setOptions(Options.get(context!!).disableHighlightAnimation())
    }
}