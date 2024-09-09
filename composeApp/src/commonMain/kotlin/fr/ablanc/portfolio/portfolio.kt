package fr.ablanc.portfolio

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.compose_multiplatform

val projects = listOf(Project("PokedexPokemon", "https://github.com/PokeAPI/pokeapi", "https://github.com/PokeAPI/pokeapi"),Project("ExploreRoubaix", "https://github.com/PokeAPI/pokeapi", "https://github.com/PokeAPI/pokeapi"),Project("Portfolio", "https://github.com/PokeAPI/pokeapi", "https://github.com/PokeAPI/pokeapi"))
data class Project(val name: String, val description: String, val image: String)

@Composable
fun Portfolio() {
    var projectSelected by remember { mutableIntStateOf(1) }
        Row()
        {
            Column(modifier = Modifier
                .fillMaxWidth(0.2f)
                .fillMaxHeight()) {
                projects.forEachIndexed { index, project ->
                    Row(
                        modifier = Modifier
                            .clickable {
                                projectSelected = index
                            }
                            .fillMaxWidth()
                            .fillMaxHeight(0.33f)

                    ) {
                        Text(text = "${project.name}")
                    }
                }
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .background(
                        when (projectSelected) {
                            1 -> Color.Red
                            2 -> Color.Green
                            3 -> Color.Blue
                            else -> Color.White
                        }
                    )
                    .fillMaxSize()
            ) {
                Image(painter = painterResource(Res.drawable.compose_multiplatform), contentDescription = "", modifier = Modifier.border(1.dp, Color.Black).fillMaxSize(0.3f))
                Text(text = "Hello")
                Text(text = "fjiofijsqfusqfiqsfnisqfsqujfhsqfcsqifnvcscvisfisdeujsqdnujfnnhesduqijfvsnuqfh<snfh<sji<snhfv<iuhsngvb<isvgvs<vfgnm<nbsgsfvsvg")
            }
        }
}

