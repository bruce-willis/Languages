package bruce_willis.languages.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

// TODO: replace with cicerone/Navigation component
interface Navigator {
    fun navigateTo(
        fragmentInstance: () -> Fragment,
        transaction: Int? = FragmentTransaction.TRANSIT_EXIT_MASK,
        addToBackStack: Boolean = false,
        transactionName: String? = null
    )

    fun navigateBack()
}