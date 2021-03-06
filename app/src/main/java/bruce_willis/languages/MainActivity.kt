package bruce_willis.languages

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.transaction
import bruce_willis.languages.ui.Navigator
import bruce_willis.languages.ui.languages.list.LanguagesListFragment

class MainActivity : AppCompatActivity(), Navigator {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            navigateTo(::LanguagesListFragment)
        }
    }

    override fun navigateTo(
        fragmentInstance: () -> Fragment,
        transaction: Int?,
        addToBackStack: Boolean,
        transactionName: String?
    ) {
        supportFragmentManager.transaction {
            if (transaction != null)
                setTransition(transaction)
            replace(R.id.container, fragmentInstance.invoke())
            if (addToBackStack)
                addToBackStack(transactionName)
        }
    }

    override fun navigateBack() = onBackPressed()
}
