package bruce_willis.languages.data.entity

// Simpler model for list (we don't need so many fields for displaying in list)
data class ProgrammingLanguageBasic(
    val id: Int,
    val name: String,
    val fileExtension: String
)