package fr.ablanc.portfolio

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun Describe() {
    Card(
        modifier = Modifier.padding(8.dp),
        elevation = 8.dp,
        shape = RoundedCornerShape(8.dp),
        backgroundColor = Color.Gray,
    ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("À propos")
                Text("Lorem ipsum dolor sit amet lorem dvLorem ipsum dolor simet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dvLorem ipsum dolor sit amet lorem dv ")
            }
        }
}