package com.example.practicee

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.platform.InspectableModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicee.ui.theme.LightGreen
import com.example.practicee.ui.theme.PracticeeTheme

class CardPractice : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UIPractice()

        }
    }
}

@Composable
fun UIPractice() {
    Scaffold() { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = LightGreen)
                .padding(padding)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth().padding(20.dp),
                    horizontalArrangement = Arrangement.End
            ) {
                Image(
                    painter=painterResource(R.drawable.profile),
                    contentDescription = null,
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop

                )
            }

            Row(
                modifier = Modifier.padding( start = 15.dp),
            ) {
                Text("Card",style= TextStyle(
                    fontSize=40.sp,
                    color=Color.White,
                    fontWeight = FontWeight.Bold
                ))
            }

            Row(
                modifier = Modifier.padding( start = 15.dp),
            ) {
                Text("Simple and easy to use app",style= TextStyle(
                    fontSize=20.sp,
                    color=Color.White,
                    fontWeight = FontWeight.Bold
                ))
            }

            Row(
                modifier = Modifier.padding( top = 10.dp,start = 15.dp, end = 15.dp),
            ) {
                Card(
                    modifier=Modifier
                        .height(200.dp)
                        .weight(1f),
                    shape=RoundedCornerShape(10.dp),
                    colors= CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults
                        .cardElevation(10.dp)
                ) {
                    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                        Image(painter = painterResource(R.drawable.apple),
                            contentDescription = null,
                            modifier = Modifier.height(100.dp)
                                .width(100.dp),
                            contentScale = ContentScale.Crop

                        )
                        Text("Apple", style = TextStyle(color =Color.Black, fontSize = 25.sp))

                    }
                }

                Spacer( modifier = Modifier.width(10.dp))

                Card(
                    modifier=Modifier
                        .height(200.dp)
                        .weight(1f),
                    shape=RoundedCornerShape(10.dp),
                    colors= CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults
                        .cardElevation(10.dp)
                ) {
                    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                        Image(painter = painterResource(R.drawable.pine),
                            contentDescription = null,
                            modifier = Modifier.height(100.dp)
                                .width(100.dp),
                            contentScale = ContentScale.Crop

                        )
                        Text("PineApple", style = TextStyle(color =Color.Black, fontSize = 25.sp))

                    }
                }
            }

            Row(
                modifier = Modifier.padding( top = 10.dp, start = 15.dp, end = 15.dp),
            ) {
                Card(
                    modifier=Modifier
                        .height(200.dp)
                        .weight(1f),
                    shape=RoundedCornerShape(10.dp),
                    colors= CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults
                        .cardElevation(10.dp)
                ) {
                    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                        Image(painter = painterResource(R.drawable.dragon),
                            contentDescription = null,
                            modifier = Modifier.height(100.dp)
                                .width(100.dp),
                            contentScale = ContentScale.Crop

                        )
                        Text("DragonFruit", style = TextStyle(color =Color.Black, fontSize = 25.sp))

                    }
                }

                Spacer( modifier = Modifier.width(10.dp))

                Card(
                    modifier=Modifier
                        .height(200.dp)
                        .weight(1f),
                    shape=RoundedCornerShape(10.dp),
                    colors= CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults
                        .cardElevation(10.dp)
                ) {
                    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                        Image(painter = painterResource(R.drawable.watermelon),
                            contentDescription = null,
                            modifier = Modifier.height(100.dp)
                                .width(100.dp),
                            contentScale = ContentScale.Crop

                        )
                        Text("WaterMelon", style = TextStyle(color =Color.Black, fontSize = 25.sp))

                    }
                }
            }

            Row(
                modifier = Modifier.padding( top = 10.dp,start = 15.dp, end = 15.dp)
            ) {
                Card(
                    modifier=Modifier
                        .height(200.dp)
                        .weight(1f),
                    shape=RoundedCornerShape(10.dp),
                    colors= CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults
                        .cardElevation(10.dp)
                ) {
                    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                        Image(painter = painterResource(R.drawable.strawberry),
                            contentDescription = null,
                            modifier = Modifier.height(100.dp)
                                .width(100.dp),
                            contentScale = ContentScale.Crop

                        )
                        Text("Strawberry", style = TextStyle(color =Color.Black, fontSize = 25.sp))

                    }
                }

                Spacer( modifier = Modifier.width(10.dp))

                Card(
                    modifier=Modifier
                        .height(200.dp)
                        .weight(1f),
                    shape=RoundedCornerShape(10.dp),
                    colors= CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults
                        .cardElevation(10.dp)
                ) {
                    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                        Image(painter = painterResource(R.drawable.orange),
                            contentDescription = null,
                            modifier = Modifier.height(100.dp)
                                .width(100.dp),
                            contentScale = ContentScale.Crop

                        )
                        Text("Orange", style = TextStyle(color =Color.Black, fontSize = 25.sp))

                    }
                }
            }

            Row(modifier = Modifier.padding( top = 5.dp,start = 15.dp, end = 15.dp, bottom = 5.dp)) {
                Card(
                    modifier=Modifier
                        .height(50.dp)
                        .weight(1f),
                    shape=RoundedCornerShape(10.dp),
                    colors= CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults
                        .cardElevation(10.dp)
                ) {
                    Column(modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.Start,
                        verticalArrangement = Arrangement.Center) {
                        Image(painter = painterResource(R.drawable.stgjpg),
                            contentDescription = null,
                            modifier = Modifier.height(100.dp)
                                .width(100.dp),
                            contentScale = ContentScale.Crop

                        )

                        Text("Settings")
                    }

                }
            }



        }
    }

}


@Preview
@Composable
fun UIPreview(){
    UIPractice()
}

