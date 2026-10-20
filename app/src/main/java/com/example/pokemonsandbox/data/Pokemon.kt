package com.example.pokemonsandbox.data

data class Pokemon(
    val id: Int,
    val name: String,
    val height: Int,
    val weight: Int,
    val sprites: Sprites,
    val abilities: List<Abilities>
)

data class Sprites (
    val frontDefault: String // json: "front_default"
)

data class Abilities(
    val isHidden: Boolean, // json: "is_hidden"
    val slot: Int,
    val ability: Ability
)

data class Ability(
    val name: String
)