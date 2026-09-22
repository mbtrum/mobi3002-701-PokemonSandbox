package com.example.pokemonsandbox.models

import androidx.annotation.DrawableRes

data class Pokemon(
    val name: String,
    val abilities: String,
    val resourceId: Int // drawable/image
)