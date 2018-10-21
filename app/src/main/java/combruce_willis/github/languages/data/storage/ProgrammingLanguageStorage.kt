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
        "kt",
        """fun main(args : Array<String>) {
  println("Hello, world!")
}""",
        "https://kotlinlang.org/assets/images/twitter-card/kotlin_800x320.png"
    ),
    ProgrammingLanguage(
        1,
        "C#",
        "C# is a general-purpose, multi-paradigm programming language encompassing strong typing, imperative, declarative, functional, generic, object-oriented (class-based), and component-oriented programming disciplines",
        2002,
        "https://docs.microsoft.com/en-us/dotnet/csharp",
        "cs",
        """class HelloWorld {
	static void Main() {
		System.Console.WriteLine("Hello World");
	}
}""",
        "https://ih0.redbubble.net/image.416412087.0587/flat,550x550,075,f.jpg"
    ),
    ProgrammingLanguage(
        2,
        "Java",
        "Java is a general-purpose computer-programming language that is concurrent, class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible.",
        1995,
        "http://java.com",
        "java",
        """public class Java {
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}""",
        "https://cdn.vox-cdn.com/thumbor/_AobZZDt_RVStktVR7mUZpBkovc=/0x0:640x427/1200x800/filters:focal(0x0:640x427)/cdn.vox-cdn.com/assets/1087137/java_logo_640.jpg"
    ),
    ProgrammingLanguage(
        3,
        "Python",
        "Python is an interpreted high-level programming language for general-purpose programming.",
        1991,
        "https://www.python.org",
        "py",
        """print("Hello World")""",
        "https://cdn.auth0.com/blog/python-restful/logo.png"
    ),
    ProgrammingLanguage(
        4,
        "Javascript",
        "JavaScript, often abbreviated as JS, is a high-level, interpreted programming language. It is a language which is also characterized as dynamic, weakly typed, prototype-based and multi-paradigm",
        1995,
        "https://www.javascript.com",
        "js",
        """console.log("Hello World");""",
        "https://www.bleepstatic.com/content/hl-images/2017/03/09/JavaScript.jpg"
    ),
    ProgrammingLanguage(
        5,
        "Dart",
        "Dart is a general-purpose programming language originally developed by Google and later approved as a standard by Ecma (ECMA-408). It is used to build web, server, and mobile applications",
        2013,
        "http://www.dartlang.org",
        "dart",
        """main() {
  print('Hello, World!');
}""",
        "https://udemy-images.udemy.com/course/480x270/1599220_c25d_2.jpg"
    ),
    ProgrammingLanguage(
        6,
        "C++",
        """C++ is a general-purpose programming language. It has imperative, object-oriented and generic programming features, while also providing facilities for low-level memory manipulation. It was designed with a bias toward system programming and embedded, resource-constrained and large systems, with performance, efficiency and flexibility of use as its design highlights""",
        1985,
        "https://isocpp.org",
        "cpp",
        """
#include <iostream> // include API

using namespace std;

int main() // the main code portion of a C++ program
{
   cout << "Hello World" << endl;  //print Hello World on the screen
   return 0; // conventional
}""",
        "https://i.imgur.com/j0Fgsay.png"
    ),
    ProgrammingLanguage(
        7,
        "Rust",
        "Rust is a systems programming language with a focus on safety, especially safe concurrency, supporting functional and imperative-procedural paradigms. Rust is syntactically similar to C++, but its designers intend it to provide better memory safety while still maintaining performance.,",
        2015,
        "https://www.rust-lang.org/",
        "rs",
        """fn main() {
    println!("Hello, world!");
}""",
        "https://i.imgur.com/fI8FwQ9.png"
    )

)