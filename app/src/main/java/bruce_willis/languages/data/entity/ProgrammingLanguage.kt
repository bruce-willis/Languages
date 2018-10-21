package bruce_willis.languages.data.entity

data class ProgrammingLanguage(
    val id: Int,
    val name: String,
    val description: String,
    val releaseYear: Int,
    val websiteUrl: String,
    val fileExtension: String,
    val helloWorld: String,
    val imageUrl: String
)