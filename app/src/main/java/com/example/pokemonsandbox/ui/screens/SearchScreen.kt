package com.example.pokemonsandbox.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.pokemonsandbox.MainViewModel
import com.example.pokemonsandbox.R
import com.example.pokemonsandbox.data.Pokemon

@Composable
fun SearchScreen(viewModel: MainViewModel) {

    val pokemonSearchName = viewModel.pokemonSearchName


    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(
            text = pokemon.name,
            style = MaterialTheme.typography.headlineMedium
        )
    }
}