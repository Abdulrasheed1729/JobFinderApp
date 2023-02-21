package com.example.jobfinderapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun OnboardingPage() {
    Scaffold(
        backgroundColor = Color.White,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize()

        ) {
            Box(
                modifier = Modifier
                    .background(
                        color = Color.LightGray,
                        shape = RoundedCornerShape(30.dp),
                    )
                    .height(200.dp)
                    .width(200.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.woman_with_laptop),
                    contentDescription = "woman-with-laptop",
                    contentScale = ContentScale.FillHeight,
                    modifier = Modifier
                        .width(150.dp)
                        .height(160.dp)
                        .align(alignment = Alignment.BottomCenter)
                )
            }

            Spacer(modifier = Modifier.height(80.dp))

            Text(
                text = "Get The Job\nThat You Dream",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,

                )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Lorem ipsum is placeholder text\ncommonly used in the graphic",
                color = Color.Gray,
                textAlign = TextAlign.Center,
                fontSize = 18.sp,
            )
            Spacer(modifier = Modifier.height(100.dp))
            Button(
                onClick = { },
                modifier = Modifier
                    .height(85.dp)
                    .width(85.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Black,
                ),
                elevation = ButtonDefaults.elevation(5.0.dp),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(
                    text = "Start",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }


        }
    }

}

@Preview(showBackground = true)
@Composable
fun OnboardingPagePreview() {
    OnboardingPage()
}