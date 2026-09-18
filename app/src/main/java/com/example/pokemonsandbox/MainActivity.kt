package com.example.pokemonsandbox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pokemonsandbox.ui.theme.PokemonSandboxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PokemonSandboxTheme {
//                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }

                //ColumnDisplay()
                //FoodsLazyColumn()
                DisplayPokemon()

            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Blue)
    )
    {
        Text(
            text = "Hello $name!"
        )
    }
}

@Composable
fun ColumnDisplay() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(state = rememberScrollState())
    )
    {
        Spacer(modifier = Modifier
            .height(20.dp))


        for(count in 1..100){
            Text("Count: $count")
        }
    }

}

@Composable
fun FoodsLazyColumn() {
    val foods = listOf(
        "Eggs", "Milk", "Bread", "Butter", "Cheese", "Yogurt", "Chicken", "Beef",
        "Pork", "Bacon", "Sausage", "Turkey", "Salmon", "Tuna", "Shrimp", "Rice",
        "Pasta", "Quinoa", "Oats", "Cereal", "Flour", "Sugar", "Salt", "Pepper",
        "Olive Oil", "Vegetable Oil", "Butter", "Honey", "Maple Syrup", "Peanut Butter",
        "Jam", "Ketchup", "Mustard", "Mayonnaise", "Soy Sauce", "Vinegar", "Garlic",
        "Onion", "Tomato", "Potato", "Carrot", "Broccoli", "Spinach", "Lettuce",
        "Cucumber", "Bell Pepper", "Zucchini", "Mushroom", "Corn", "Peas", "Green Beans",
        "Cabbage", "Cauliflower", "Sweet Potato", "Avocado", "Lemon", "Lime", "Apple",
        "Banana", "Orange", "Grapes", "Strawberries", "Blueberries", "Raspberries",
        "Watermelon", "Pineapple", "Mango", "Peach", "Pear", "Cherries", "Kiwi",
        "Almonds", "Walnuts", "Cashews", "Peanuts", "Pistachios", "Sunflower Seeds",
        "Chia Seeds", "Beans", "Lentils", "Chickpeas", "Tofu", "Coconut Milk",
        "Chocolate", "Coffee", "Tea", "Juice", "Soda", "Water", "Wine", "Beer",
        "Crackers", "Chips", "Popcorn", "Granola", "Ice Cream", "Pizza", "Soup",
        "Salsa", "Hot Sauce"
    )

    LazyColumn() {
        items(foods) { food ->
            Text(food)
        }
    }
}

@Composable
fun DisplayPokemon()
{
    // Align in centre of screen
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    )
    {
        Image(
            painter = painterResource(id = R.drawable.ditto),
            contentDescription = "Ditto",
            modifier = Modifier
                .size(100.dp)
        )

        Text(text = "Ditto",
            style = MaterialTheme.typography.headlineLarge
        )

        Text(text = "Limber / Imposter",
            style = MaterialTheme.typography.bodyMedium)
    }
}

