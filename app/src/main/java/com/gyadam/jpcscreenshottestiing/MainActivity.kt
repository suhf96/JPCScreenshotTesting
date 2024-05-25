package com.gyadam.jpcscreenshottestiing

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gyadam.jpcscreenshottestiing.ui.theme.JPCScreenshotTestiingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JPCScreenshotTestiingTheme {
                TestScreenForScreenshots()
            }
        }
    }
}

@Composable
fun TestScreenForScreenshots(modifier: Modifier = Modifier) {
    Surface(modifier = modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                modifier = Modifier.padding(top = 40.dp),
                text = "Title of the Test Screen",
                style = MaterialTheme.typography.titleLarge.copy(textAlign = TextAlign.Center)
            )
            Text(
                text = "Subtitle of the Test Screen",
                style = MaterialTheme.typography.titleSmall
            )
            TextField(
                value = "",
                onValueChange = {},
                shape = CircleShape,
                label = {
                    Text(text = "First text input")
                },
                trailingIcon = {
                    Icons.Default.Add
                },
                modifier = Modifier.padding(vertical = 20.dp)
            )

            TextField(
                value = "",
                onValueChange = {},
                shape = CircleShape,
                label = {
                    Text(text = "Second text input")
                },
                trailingIcon = {
                    Icons.Default.Add
                },
                modifier = Modifier.padding(vertical = 20.dp)
            )

            Button(onClick = { /*TODO*/ }) {
                Text(text = "Test button")
            }
        }
    }
}


@Preview
@Composable
fun TestScreenPreview() {
    TestScreenForScreenshots()
}

