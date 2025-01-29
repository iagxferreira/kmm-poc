package org.iagxferreira.kmmpoc

import kotlinx.coroutines.CoroutineScope

expect open class BaseViewModel {
    val scope: CoroutineScope
}