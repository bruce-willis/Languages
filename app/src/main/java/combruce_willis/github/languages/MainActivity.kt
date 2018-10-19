package combruce_willis.github.languages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import combruce_willis.github.languages.ui.languages.LanguagesListFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, LanguagesListFragment.newInstance())
                .commitNow()
        }
    }

}
