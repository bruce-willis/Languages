package combruce_willis.github.languages.data.storage

import combruce_willis.github.languages.data.entity.ProgrammingLanguage

// TODO: move to database
val languages = listOf(
    ProgrammingLanguage(
        0,
        "Kotlin",
        "is a statically typed programming language that runs on the Java virtual machine and also can be compiled to JavaScript source code or use the LLVM compiler infrastructure. Its primary development is from a team of JetBrains programmers based in Saint Petersburg, Russia",
        2016,
        "https://en.wikipedia.org/wiki/Kotlin_(programming_language)#/media/File:Kotlin-logo.svg"
    ),
    ProgrammingLanguage(
        1,
        "C#",
        "is a general-purpose, multi-paradigm programming language encompassing strong typing, imperative, declarative, functional, generic, object-oriented (class-based), and component-oriented programming disciplines",
        2002,
        "https://en.wikipedia.org/wiki/C_Sharp_(programming_language)#/media/File:C_Sharp_wordmark.svg"
    )
)