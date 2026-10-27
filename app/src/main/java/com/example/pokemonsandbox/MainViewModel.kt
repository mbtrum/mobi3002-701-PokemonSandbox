package com.example.pokemonsandbox

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokemonsandbox.data.dao.Pokemon
import com.example.pokemonsandbox.data.PokemonApi
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainViewModel : ViewModel() {
    // Stores the JSON data returned from API
    var pokemon by mutableStateOf<Pokemon?>(null)
        private set

    var error by mutableStateOf<String?>(null)
        private set

    // Implement the PokemonApi with Retrofit builder
    private val api = Retrofit.Builder()
        .baseUrl("https://pokeapi.co/") // API hostname
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(PokemonApi::class.java) // Interface

    fun searchPokemon(name: String) {
        // Launch co-routine
        viewModelScope.launch {
            try {
                pokemon = api.searchPokemon(name)
                error = null;
            } catch(e: Exception){
                Log.e("MainViewModel",e.toString())
                error = "The Pokemon $name was not found. Try again!"
            }
        }
    }
}