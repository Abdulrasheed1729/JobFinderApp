package com.example.jobfinderapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun JobCard(
    cardColor: Color,
    logoBackgroundColor: Color,
    companyLogo: Painter,
    textColor: Color,
    companyName: String,
    jobTitle: String,
    salary: String,
    location: String,
) {
    Card(
        elevation = 16.dp,
        shape = RoundedCornerShape(16.dp),
        backgroundColor = cardColor,
        modifier = Modifier
            .padding(start = 16.dp)
            .height(180.dp)
            .width(260.dp),
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(CircleShape)
                        .height(42.dp)
                        .background(logoBackgroundColor)
                ) {

                    Image(
                        painter = companyLogo,
                        contentDescription = null,
                        modifier = Modifier.clip(CircleShape),
                        contentScale = ContentScale.Inside,
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .height(24.dp)
                        .width(72.dp)
                        .background(color = Color.DarkGray)
                ) {

                    Text(text = "Full-time", color = Color.White)
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = companyName,
                color = Color.Gray,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = jobTitle,
                color = textColor,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "$salary\t\t $location",
                color = textColor,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
            )
        }
    }
}
