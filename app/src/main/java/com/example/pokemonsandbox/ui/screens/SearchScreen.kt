package com.example.pokemonsandbox.ui.screens

import android.graphics.Color
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.input.clearText
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.pokemonsandbox.MainViewModel
import kotlin.toString

@Composable
fun SearchScreen(viewModel: MainViewModel) {
    val pokemon = viewModel.pokemon
    val searchTextFieldState = rememberTextFieldState(initialText = "")

    Column(){
        TextField(
            state = searchTextFieldState,
            label = { Text("Search your favorite Pokemon") }
        )

        Button(
            onClick = {
                // TO-DO: validate name first before calling function
                viewModel.searchPokemon(searchTextFieldState.text.toString().trim())
                searchTextFieldState.clearText()
            }
        ) {
            Text("Go")
        }

        // Error message
        val errorMessage = viewModel.error
        errorMessage?.let {
            Text(errorMessage,
                color = MaterialTheme.colorScheme.error)
        }

        // API result
        pokemon?.let {
            // get a high quality image to display based on the PokeAPI character id.
            val imageUrl = "https://raw.githubusercontent.com/HybridShivam/Pokemon/master/assets/images/${it.id.toString().padStart(4, '0')}.png"

            Column() {

                AsyncImage(
                    model = imageUrl,
                    contentDescription = it.name,
                    modifier = Modifier.size(200.dp)
                )

                Text(it.id.toString())
                Text(it.name)
                Text("Weight: ${it.weight}")
                Text("Height: ${it.height}")
            }
        }
    }
}