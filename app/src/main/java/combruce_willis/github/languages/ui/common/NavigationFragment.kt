package combruce_willis.github.languages.ui.common

import android.content.Context
import androidx.fragment.app.Fragment
import combruce_willis.github.languages.ui.Navigator

abstract class NavigationFragment : Fragment() {
    var navigator: Navigator? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Navigator) {
            navigator = context
        } else {
            throw RuntimeException(context.toString() + " must implement Navigator interface")
        }
    }

    override fun onDetach() {
        super.onDetach()
        navigator = null
    }
}