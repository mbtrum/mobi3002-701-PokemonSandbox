package com.example.pokemonsandbox

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.pokemonsandbox.data.Pokemon

class MainViewModel : ViewModel() {
    // compose will watch this property now and update UI automatically if it changes.
    var pokemon by mutableStateOf<Pokemon?>(value = null)

    init {

    }

    fun searchPokemon(name: String) {

    }
}