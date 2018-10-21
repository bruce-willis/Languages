package combruce_willis.github.languages.utils

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

/**
 * Creates a LiveData that emits the value that the `callable` function produces, immediately.
 * https://github.com/adibfara/Lives/blob/master/lives/src/main/java/com/snakydesign/livedataextensions/Creating.kt
 */
fun <T> fromCallable(callable: () -> T): LiveData<T> {
    val returnedLiveData = MutableLiveData<T>()
    returnedLiveData.value = callable.invoke()
    return returnedLiveData
}