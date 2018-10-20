package combruce_willis.github.languages.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import combruce_willis.github.languages.data.entity.ProgrammingLanguage
import combruce_willis.github.languages.data.entity.ProgrammingLanguageBasic
import kotlinx.android.synthetic.main.language_list_element.view.*

class LanguageViewHolder(itemView: View, private val navigate: (Int) -> Unit) :
    RecyclerView.ViewHolder(itemView) {

    private val name = itemView.language_name

    fun bindLanguage(languageBasic: ProgrammingLanguageBasic) {
        name.text = languageBasic.name
        itemView.setOnClickListener { navigate(languageBasic.id) }
    }
}