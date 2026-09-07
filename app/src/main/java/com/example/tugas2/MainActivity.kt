package com.example.tugas2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            NADINDA()
        }
    }
}

@Composable
fun NADINDA() {
    Row(
        modifier = Modifier
            .padding(top = 50.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.nadin),
            contentDescription = "Foto Nadinda",
            modifier = Modifier
                .size(150.dp)
        )

        Column(
            modifier = Modifier
                .padding(start = 16.dp)
        ) {
            Text(text = "24515040111020")
            Text(text = "Nadinda Carissa Achsan")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NADINDA()
}