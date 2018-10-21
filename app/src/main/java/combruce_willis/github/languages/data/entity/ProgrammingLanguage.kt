package combruce_willis.github.languages.data.entity


data class ProgrammingLanguage(
    val id: Int,
    val name: String,
    val description: String,
    val releaseYear: Int,
    val websiteUrl: String,
    val fileExtension: String,
    val imageUrl: String
)