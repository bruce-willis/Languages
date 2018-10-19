package combruce_willis.github.languages.adapter

import androidx.recyclerview.widget.DiffUtil
import combruce_willis.github.languages.data.entity.ProgrammingLanguage

class LanguageDiffCallback : DiffUtil.ItemCallback<ProgrammingLanguage>() {
    override fun areItemsTheSame(oldItem: ProgrammingLanguage, newItem: ProgrammingLanguage) = oldItem.name == newItem.name

    override fun areContentsTheSame(oldItem: ProgrammingLanguage, newItem: ProgrammingLanguage) = oldItem == newItem

}