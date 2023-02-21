package com.example.jobfinderapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jobfinderapp.ui.components.JobCard

@Composable
fun HomePage() {


    Scaffold(
        backgroundColor = Color.White
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    painter = painterResource(
                        id = R.drawable.ic_round_dehaze_24
                    ),
                    modifier = Modifier
                        .height(32.dp)
                        .width(32.dp),
                    contentDescription = null
                )
                Image(
                    painter = painterResource(id = R.drawable.woman_portrait),
                    contentDescription = "woman-portrait",
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp)
                        .clip(shape = RoundedCornerShape(16.dp)),
                )
            }

            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Discover\nThe Perfect Job",
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                modifier = Modifier.padding(end = 16.dp, start = 16.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .padding(end = 16.dp, start = 16.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                label = { Text(text = "Search job or position") },
                trailingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_baseline_search_24),
                        contentDescription = null
                    )
                },
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 16.dp)
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Bottom,
            ) {

                Text(
                    text = "Popular",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                )
                Text(
                    text = "Latest",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Gray,
                )
                Text(
                    text = "Categories",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Gray,
                )
                Text(
                    text = "Upcoming",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Gray,
                )

            }
            Spacer(modifier = Modifier.height(24.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState()),
            ) {
                JobCard(
                    cardColor = Color.Black,
                    companyLogo = painterResource(id = R.drawable.apple),
                    logoBackgroundColor = Color.White,
                    textColor = Color.LightGray,
                    companyName = "Apple",
                    jobTitle = "Sr Product Designer",
                    location = "Ibadan, Nigeria",
                    salary = "$6K/mo"
                )
                JobCard(
                    cardColor = Color.White,
                    companyLogo = painterResource(id = R.drawable.google),
                    logoBackgroundColor = Color.LightGray,
                    textColor = Color.Black,
                    companyName = "Google",
                    jobTitle = "Network Engineer",
                    location = "Lagos, Nigeria",
                    salary = "$2K/mo"
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomePagePreview() {
    HomePage()
}