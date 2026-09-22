package com.example.pokemonsandbox.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.pokemonsandbox.R
import com.example.pokemonsandbox.models.Pokemon

@Composable
fun SearchPokemon(innerPadding: PaddingValues) {

    val pokemon = Pokemon(
        name = "Charmander",
        abilities = "blaze, solar-power",
        resourceId = R.drawable.charmander
    )

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
    ) {

        Image(
            painter = painterResource(id = pokemon.resourceId),
            contentDescription = pokemon.name
        )

        Text(
            text = pokemon.name,
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text("Abilities:")

        Text(pokemon.abilities)
    }
}