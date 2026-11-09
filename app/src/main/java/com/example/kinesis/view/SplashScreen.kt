package com.example.kinesis.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.kinesis.R
import com.example.kinesis.ui.theme.AzulMarinho
import com.example.kinesis.ui.theme.Bege

@Composable
fun SplashScreen(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize().background(color = Bege),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.kinesis),
            contentDescription = null,

        )

        Text(
           text = "Apoio para seguir e coragem para recomeçar!",
            fontSize = 14.sp,
            color = AzulMarinho,
            fontWeight = FontWeight.Bold,

        )
    }
}

@Preview
@Composable
private fun SplashScreenPreview() {
    SplashScreen(navController = rememberNavController())
}