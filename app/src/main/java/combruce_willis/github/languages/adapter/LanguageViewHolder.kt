package combruce_willis.github.languages.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import combruce_willis.github.languages.R
import combruce_willis.github.languages.data.entity.ProgrammingLanguageBasic
import kotlinx.android.synthetic.main.language_list_element.view.*

class LanguageViewHolder(itemView: View, private val navigate: (Int) -> Unit) :
    RecyclerView.ViewHolder(itemView) {

    private val name = itemView.language_name
    private val fileExtension = itemView.file_extension

    fun bindLanguage(languageBasic: ProgrammingLanguageBasic) {
        name.text = languageBasic.name
        fileExtension.text = itemView.context?.getString(R.string.file_extension, languageBasic.fileExtension)
        itemView.setOnClickListener { navigate(languageBasic.id) }
    }
}