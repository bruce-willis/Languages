package combruce_willis.github.languages.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import combruce_willis.github.languages.R
import combruce_willis.github.languages.data.entity.ProgrammingLanguage

class LanguagesAdapter : ListAdapter<ProgrammingLanguage, LanguageViewHolder>(LanguageDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.language_list_element, parent, false)
        return LanguageViewHolder(view)
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        holder.bindLanguage(getItem(position))
    }
}