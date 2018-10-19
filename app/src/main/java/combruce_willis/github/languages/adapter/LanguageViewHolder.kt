package combruce_willis.github.languages.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import combruce_willis.github.languages.data.entity.ProgrammingLanguage
import kotlinx.android.synthetic.main.language_list_element.view.*

class LanguageViewHolder(itemView: View) :  RecyclerView.ViewHolder(itemView) {

    private val name = itemView.language_name

    fun bindLanguage(language: ProgrammingLanguage) {
        name.text = language.name
    }
}