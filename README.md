# Languages
Best app with list of programming languages

<p align="center">
    <img src="app\src\main\ic_launcher-web.png" alt="logo">
</p>

* [Installation](#installation)
* [Used libraries](#used-libraries)
* [TODO](#TODO)
* [Screenshots & gifs](#screenshots-and-gifs)


### Installation
* Download `apk` from [release](https://github.com/bruce-willis/Languages/releases) section
* build manually:
```
git clone https://github.com/bruce-willis/Languages.git
cd Languages
./gradlew build
```

**Note**: Make sure your *Android SDK* has the *Android Support Repository* installed, and that your `$ANDROID_HOME` environment
variable is pointing at the SDK or add a `local.properties` file in the root project with a `sdk.dir=...` line.

### Used libraries  
* [LiveData](https://developer.android.com/topic/libraries/architecture/livedata)
* [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel)
* [Android ktx](https://developer.android.com/kotlin/ktx)
* [Glide](https://github.com/bumptech/glide) for working with images.
* [CodeView-android](https://github.com/kbiakov/CodeView-android) display code with syntax highlighting

### TODO
* [ ] proper DI system
* [ ] store info in database

### Screenshots and gifs
<details>
    <summary>splash</summary>
    
<div align="center">

<img max-height="500px" max-width="500px" src="https://i.imgur.com/I0DJn5K.png">

</div>
</details>

<details>
    <summary>list</summary>
    
<div align="center">

<img max-height="500px" max-width="500px" src="https://i.imgur.com/x2SLqHv.png">

</div>
</details>

<details>
    <summary>detail</summary>
    
<div align="center">

<img max-height="500px" max-width="500px" src="https://i.imgur.com/l5zc8Gf.png">

</div>
</details>

<details>
<summary>collapsing toolbar</summary>
    
<div align="center">

<img max-height="500px" max-width="500px" src="https://thumbs.gfycat.com/UnitedLeafyAustralianfurseal-size_restricted.gif">

</div>
 </details>