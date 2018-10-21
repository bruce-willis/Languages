package combruce_willis.github.languages.ui.languages.detail

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import combruce_willis.github.languages.R
import combruce_willis.github.languages.ui.common.NavigationFragment
import kotlinx.android.synthetic.main.fragment_language_detail.*
import kotlinx.android.synthetic.main.fragment_language_detail.view.*
import java.util.concurrent.ThreadLocalRandom


private const val ARG_LANGUAGE = "language"

class LanguageDetailFragment : NavigationFragment() {
    private var languageId: Int = 0
    private lateinit var viewModel: LanguageDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        arguments?.let {
            languageId = it.getInt(ARG_LANGUAGE)
        }

//        (requireActivity() as AppCompatActivity).apply {
//            setSupportActionBar(detail_toolbar)
//            supportActionBar?.setDisplayHomeAsUpEnabled(true)
//        }

        subscribeUI()
        //toolbar_layout.tool
        //(activity as AppCompatActivity).setSupportActionBar(detail_toolbar)
        //(activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        return inflater.inflate(R.layout.fragment_language_detail, container, false)
    }

    private fun subscribeUI() {
        val factory = LanguageDetailViewModelFactory(languageId = languageId)
        viewModel = ViewModelProviders.of(this, factory)
            .get(LanguageDetailViewModel::class.java)
        viewModel.language.observe(viewLifecycleOwner, Observer { language ->
            toolbar_layout.title = language.name
            description.text = language.description
            releaseYear.text = language.releaseYear.toString()
            Glide.with(this)
                .load(language.imageUrl)
                .apply(
                    RequestOptions()
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .dontTransform()
                        .format(DecodeFormat.PREFER_ARGB_8888)
                        .placeholder(ColorDrawable(ThreadLocalRandom.current().nextInt()))
                )
                .into(detail_image)
        })
    }


    companion object {
        fun newInstance(languageId: Int) =
            LanguageDetailFragment().apply {
                arguments = bundleOf(ARG_LANGUAGE to languageId)
            }
    }
}
