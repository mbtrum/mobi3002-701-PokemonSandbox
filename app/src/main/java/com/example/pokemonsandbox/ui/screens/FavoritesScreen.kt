package com.example.pokemonsandbox.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.pokemonsandbox.MainViewModel

@Composable
fun FavoritesScreen(viewModel: MainViewModel) {
    val pokemon = viewModel.pokemon

    pokemon?.let {
        Text("You searched for ${it.name}")
    }
}