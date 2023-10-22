package com.example.presentationcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.presentationcard.ui.theme.PresentationCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PresentationCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PresentationCard()
                }
            }
        }
    }
}

@Composable
fun PresentationCard() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color.DarkGray)
            .padding(top = 150.dp)
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ){
        val image = painterResource(id = R.drawable.android)
        Image(painter = image, contentDescription = null, modifier = Modifier
            .height(120.dp)
            .width(150.dp))
        Text(text = "Antonio Medina",color = Color.White)
        Text(text = "Estudiante de la ULPGC",color = Color(0xFF3ddc84),)
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 400.dp)
            .padding(bottom = 70.dp)
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 70.dp, top = 20.dp),
        ){
            val icon = painterResource(id = R.drawable.telefono)
            Icon(
                painter = icon,
                contentDescription = null,
                modifier = Modifier
                    .size(46.dp),
                tint = Color.White
            )
            Text(text = "+34674512435",
                modifier = Modifier.padding(start = 20.dp),
                color = Color.White)
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp, top = 20.dp),
        ){
            val icon2 = painterResource(id = R.drawable.mail)
            Icon(
                painter = icon2,
                contentDescription = null,
                modifier = Modifier
                    .size(46.dp),
                tint = Color.White
            )
            Text(text = "tonigroudon@gmail.com",
                modifier = Modifier.padding(start = 20.dp),
                color = Color.White)
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, top = 20.dp),
        ){
            val icon3 = painterResource(id = R.drawable.compartir)
            Icon(
                painter = icon3,
                contentDescription = null,
                modifier = Modifier
                    .size(46.dp),
                tint = Color.White
            )
            Text(text = "antonio.medina115@alu.ulpgc.es",
                modifier = Modifier.padding(start = 20.dp),
                color = Color.White)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PresentationCardPreview() {
    PresentationCardTheme {
        Surface{
            PresentationCard()
        }

    }
}