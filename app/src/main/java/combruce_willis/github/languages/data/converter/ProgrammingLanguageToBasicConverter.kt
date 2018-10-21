package combruce_willis.github.languages.data.converter

import combruce_willis.github.languages.data.entity.ProgrammingLanguage
import combruce_willis.github.languages.data.entity.ProgrammingLanguageBasic

// This can be done via Room (on the power of SQLite)
// https://developer.android.com/training/data-storage/room/accessing-data#query-subset-cols
// TODO: replace with Room
fun ProgrammingLanguage.convertToBasicModel() =
    ProgrammingLanguageBasic(this.id, this.name, this.fileExtension)