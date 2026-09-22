package com.example.pokemonsandbox.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.pokemonsandbox.R
import com.example.pokemonsandbox.models.Pokemon

@Composable
fun AllPokemon(innerPadding: PaddingValues) {

    val listPokemon = listOf(
        Pokemon(
            name = "Ditto",
            abilities = "limber, imposter",
            resourceId = R.drawable.ditto
        ),
        Pokemon(
            name = "Charmander",
            abilities = "blaze, solar-power",
            resourceId = R.drawable.charmander
        ),
        Pokemon(
            name = "Mr. Mime",
            abilities = "soundproof, filter, technician",
            resourceId = R.drawable.mrmime
        )
    )

    LazyColumn(
        modifier = Modifier.padding(innerPadding)
    ) {
        items(listPokemon) { pokemon ->
            Row()
            {
                Image(
                    painter = painterResource(id = pokemon.resourceId),
                    contentDescription = pokemon.name
                )

                Text(pokemon.name)

                Text(pokemon.abilities)
            }

            HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)
        }
    }
}