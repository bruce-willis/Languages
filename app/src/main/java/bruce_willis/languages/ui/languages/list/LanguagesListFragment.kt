package bruce_willis.languages.ui.languages.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import bruce_willis.languages.R
import bruce_willis.languages.adapter.LanguagesAdapter
import bruce_willis.languages.ui.common.NavigationFragment
import bruce_willis.languages.ui.languages.detail.LanguageDetailFragment
import kotlinx.android.synthetic.main.languages_list_fragment.*

class LanguagesListFragment : NavigationFragment() {
    private lateinit var viewModel: LanguagesListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.languages_list_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(LanguagesListViewModel::class.java)

        val adapter = LanguagesAdapter { id ->
            navigator?.navigateTo({ LanguageDetailFragment.newInstance(id) }, addToBackStack = true)
        }
        languages_list.adapter = adapter
        subscribeUi(adapter)
    }

    private fun subscribeUi(adapter: LanguagesAdapter) {
        viewModel.languages.observe(viewLifecycleOwner, Observer { languages ->
            if (languages != null)
                adapter.submitList(languages)
        })
    }
}
