package combruce_willis.github.languages.ui.languages

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import combruce_willis.github.languages.R

class LanguagesListFragment : androidx.fragment.app.Fragment() {

    companion object {
        fun newInstance() = LanguagesListFragment()
    }

    private lateinit var viewModel: LanguagesListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.languages_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(LanguagesListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
