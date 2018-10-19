package combruce_willis.github.languages.ui.languages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import combruce_willis.github.languages.R
import combruce_willis.github.languages.adapter.LanguagesAdapter
import kotlinx.android.synthetic.main.languages_list_fragment.*

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        languages_list.layoutManager = LinearLayoutManager(languages_list.context)
        languages_list.adapter = LanguagesAdapter()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(LanguagesListViewModel::class.java)
        // TODO: Use the ViewModel
        (languages_list.adapter as LanguagesAdapter).submitList(viewModel.languages)
    }

}
