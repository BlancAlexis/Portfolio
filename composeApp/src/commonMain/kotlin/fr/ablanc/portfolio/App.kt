package fr.ablanc.portfolio

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.compose_multiplatform

@OptIn(ExperimentalLayoutApi::class)
@Composable
@Preview
fun App() {
    MaterialTheme {
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState()),
        ) {
            entryPage()
            Divider(thickness = 2.dp, color = Color.Black, modifier = Modifier.padding(16.dp))
            Describe()
            Divider(thickness = 2.dp, color = Color.Black, modifier = Modifier.padding(16.dp))
            Portfolio()
            Divider(thickness = 2.dp, color = Color.Black, modifier = Modifier.padding(16.dp))
            Competence()
            Spacer(Modifier.height(16.dp))
            Text(
                "Mon Expérience",
                style = MaterialTheme.typography.h5,
                textDecoration = TextDecoration.Underline
            )
            expPro()
            Text(
                "Mon Expérience",
                style = MaterialTheme.typography.h5,
                textDecoration = TextDecoration.Underline
            )



            expPro()
            expPro()
            Divider()
            expPerso()
            expPerso()
        }
    }
}


@Composable
@Preview
fun expPro() {
    Card(
        Modifier.fillMaxWidth(),
        elevation = 8.dp
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Image(painterResource(Res.drawable.compose_multiplatform), null)
                Text("wimo")
            }
            Column {
                Row {
                    Text("Zlternance")
                    Text("Développpeur Android")
                    Text("2022") // Faire un buildString zt des appends pour avoir qu'un composant text
                }
                Text("Petite description ")
                Text("J'ai fait une petite description et une autre eric le plus grand se la fait pas mais ça marche J'ai fait une petite description et une autre eric le plus grand se la fait pas mais ça marche J'ai fait une petite description et une autre eric le plus grand se la fait pas mais ça marche ")
            }
        }
    }
}

@Composable
@Preview
fun expPerso() {
}

@Composable
@Preview
fun diplome() {
}