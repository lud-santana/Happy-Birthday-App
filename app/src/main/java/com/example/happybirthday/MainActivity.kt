package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.InspectableModifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TextoDeSaudacao(
                        mensagem = "Feliz aniversário, criatura!!",
                        assinatura = "Yuri :)",
                        modifier = Modifier.padding(10.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun TextoDeSaudacao(mensagem: String, assinatura: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = mensagem,
            fontSize = 70.sp,
            lineHeight = 80.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "De: $assinatura",
            fontSize = 40.sp,
            modifier = modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Preview(name = "Happy Birthday App", showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        TextoDeSaudacao(mensagem = "Feliz aniversário, criatura!", assinatura = "Yuri :)")
    }
}