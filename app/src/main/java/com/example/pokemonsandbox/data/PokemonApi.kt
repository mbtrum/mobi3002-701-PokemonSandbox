package com.example.pokemonsandbox.data

import com.example.pokemonsandbox.data.dao.Pokemon
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonApi {
    // API endpoint to search for Pokemon characters by name ../api/v2/pokemon/ditto
    @GET("api/v2/pokemon/{name}")
    suspend fun searchPokemon(
        @Path("name") name: String
    ): Pokemon
}

