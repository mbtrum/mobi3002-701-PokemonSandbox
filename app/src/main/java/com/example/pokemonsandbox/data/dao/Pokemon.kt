package com.example.pokemonsandbox.data.dao

import com.google.gson.annotations.SerializedName

data class Pokemon(
    val id: Int,
    val name: String,
    val height: Int,
    val weight: Int,
    val sprites: Sprites,
    val abilities: List<Abilities>
)

data class Sprites (
    @SerializedName("front_default") val frontDefault: String,
    @SerializedName("back_default") val backDefault: String,
)

data class Abilities(
    @SerializedName("is_hidden") val isHidden: Boolean,
    val slot: Int,
    val ability: Ability
)

data class Ability(
    val name: String
)