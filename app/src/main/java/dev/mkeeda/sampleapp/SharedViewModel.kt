package dev.mkeeda.sampleapp

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class SharedViewModel(
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {
    fun getData(): String? {
        val value: String? = savedStateHandle["shared"]
        println("⭐ $value")
        return value
    }

    fun setData(value: String) {
        savedStateHandle["shared"] = value
    }
}
