package fr.ablanc.portfolio

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
        Column (
            modifier = Modifier.scrollable(state = rememberScrollState(), orientation = androidx.compose.foundation.gestures.Orientation.Vertical)
        ){
        Row(modifier = Modifier.height(IntrinsicSize.Max)) {
            Column(
                Modifier.weight(0.5f).background(Color.Blue),
                horizontalAlignment = Alignment.Start
            ) {
                Image(painterResource(Res.drawable.compose_multiplatform), null)
            }
            Column(
                Modifier.weight(0.5f).fillMaxHeight().background(Color.Green),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text("BLANC Alexis")
                Text("Développpeur Android")
                Text("BLANC Alexis")
                FlowRow(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ){
                    showCompetence()
                }
            }
        }
            showPortoflio()
        Text("\"CatchPhrase Lorem Ipsus dolor sit amet \"")
        Spacer(Modifier.height(16.dp))
        Divider()
        Text("Mon Expérience", style = MaterialTheme.typography.h5, textDecoration = TextDecoration.Underline)
        expPro()
            Text("Mon Expérience", style = MaterialTheme.typography.h5, textDecoration = TextDecoration.Underline)



            expPro()
        expPro()
        Divider()
expPerso()
expPerso()
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
@Preview
fun showCompetence(){
    FlowRow(
        modifier = Modifier.fillMaxWidth()
    ) {
        for(i in 0..4) // Set un tab des technos voulu
        showTechno()
    }
}
@Composable
@Preview
private fun showCV() {
    Image(painterResource(Res.drawable.compose_multiplatform), null, modifier = Modifier.clip(RoundedCornerShape(16.dp)))
    Text("CV")
}

@Composable
@Preview
private fun showTechno() {
    Icon(painterResource(Res.drawable.compose_multiplatform), null, modifier = Modifier.size(5.dp))
    Text("Kotlin")
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
@Preview
private fun showPortoflio() {
    cardPortoflio()
}
@Composable
@Preview
private fun cardPortoflio() {
    Card (
        modifier = Modifier.padding(8.dp),
        elevation = 8.dp,
        shape = RoundedCornerShape(8.dp),
        backgroundColor = Color.Gray,
    ){
        Row {
            Column {
                Text("Titre")
                Text("Lorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dv ")
            }
            Image(painterResource(Res.drawable.compose_multiplatform), null)
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