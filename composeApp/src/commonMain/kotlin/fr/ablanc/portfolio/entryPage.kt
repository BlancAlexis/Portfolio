package fr.ablanc.portfolio

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.alexis_img
import portfolio.composeapp.generated.resources.github_mark
import portfolio.composeapp.generated.resources.linkedIn_icon

val networks = listOf(
    Networks.Github(Res.drawable.github_mark, "https://github.com/votre_profil", "GitHub"),
    Networks.Linkedin(Res.drawable.linkedIn_icon, "https://linkedin.com/in/votre_profil", "LinkedIn")
)

@Composable
@Preview
fun entryPage() {
    Row(modifier = Modifier.height(IntrinsicSize.Max)) {
        Column(
            Modifier.weight(0.5f).background(Color.Blue),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card(
                modifier = Modifier.padding(8.dp),
                elevation = 8.dp,
                shape = RoundedCornerShape(8.dp),
                backgroundColor = Color.Gray,
            ) {
                Image(painterResource(Res.drawable.alexis_img), null, modifier = Modifier.size(500.dp))

            }
        }
        Column(
            Modifier.weight(0.5f).fillMaxHeight().background(Color.Green).padding(top = 64.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("BLANC Alexis", style = MaterialTheme.typography.h2, fontWeight = androidx.compose.ui.text.font.FontWeight.Bold, textDecoration = TextDecoration.Underline)
            Text("Développpeur Android", style = MaterialTheme.typography.h3,fontStyle = androidx.compose.ui.text.font.FontStyle.Italic)
            Text("À la recherche d'une nouvelle opportunité", modifier = Modifier.padding(top = 32.dp), style = MaterialTheme.typography.h4,fontStyle = androidx.compose.ui.text.font.FontStyle.Italic)
            Spacer(Modifier.weight(1f))
            Row(
                verticalAlignment = Alignment.Bottom,
                modifier = Modifier.padding(bottom = 16.dp)
            ) {
                showSocialNetworksRow(networks)
            }

        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
@Preview
fun showSocialNetworksRow(networks: List<Networks>) {
    FlowRow(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.End
    ) {
        networks.forEach { network ->
            displayNetworkIcon(network)
        }
    }
}

@Composable
@Preview
private fun displayNetworkIcon(networks: Networks) {
    IconButton(onClick = { networks.url }, modifier = Modifier.padding(8.dp)) { //Redirection vers url
      /*  Icon(
            painterResource(resource = networks.image),
            "Mon ${networks.name}",
            modifier = Modifier.size(50.dp)
        )*/

    }
}


sealed class Networks {
    abstract val name: String
    abstract val url: String
    abstract val image: DrawableResource

    data class Github(
        override val image: DrawableResource, override val url: String,
        override val name: String
    ) : Networks()

    data class Linkedin(
        override val image: DrawableResource, override val url: String,
        override val name: String
    ) : Networks()
}