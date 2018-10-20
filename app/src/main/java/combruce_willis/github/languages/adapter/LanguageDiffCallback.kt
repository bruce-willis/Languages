package combruce_willis.github.languages.adapter

import androidx.recyclerview.widget.DiffUtil
import combruce_willis.github.languages.data.entity.ProgrammingLanguageBasic

class LanguageDiffCallback : DiffUtil.ItemCallback<ProgrammingLanguageBasic>() {
    override fun areItemsTheSame(oldItem: ProgrammingLanguageBasic, newItem: ProgrammingLanguageBasic) = oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: ProgrammingLanguageBasic, newItem: ProgrammingLanguageBasic) = oldItem == newItem
}