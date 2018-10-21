package combruce_willis.github.languages.data.storage

import combruce_willis.github.languages.data.entity.ProgrammingLanguage

// TODO: move to database
val languages = listOf(
    ProgrammingLanguage(
        0,
        "Kotlin",
        "Kotlin is a statically typed programming language that runs on the Java virtual machine and also can be compiled to JavaScript source code or use the LLVM compiler infrastructure. Its primary development is from a team of JetBrains programmers based in Saint Petersburg, Russia",
        2016,
        "https://kotlinlang.org",
        ".kt",
        "https://kotlinlang.org/assets/images/twitter-card/kotlin_800x320.png"
    ),
    ProgrammingLanguage(
        1,
        "C#",
        "C# is a general-purpose, multi-paradigm programming language encompassing strong typing, imperative, declarative, functional, generic, object-oriented (class-based), and component-oriented programming disciplines",
        2002,
        "https://docs.microsoft.com/en-us/dotnet/csharp/",
        ".cs",
        "https://ih0.redbubble.net/image.416412087.0587/flat,550x550,075,f.jpg"
    )
)