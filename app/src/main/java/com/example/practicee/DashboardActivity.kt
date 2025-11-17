package com.example.practicee

import android.R.attr.padding
import android.graphics.Color
import android.graphics.drawable.Icon
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
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practicee.ui.theme.PracticeeTheme

class DashboardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Composable
fun SpotifyBody() {
    Scaffold() { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = androidx.compose.ui.graphics.Color.Black)
                .padding(padding)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    "Recently Played", style = TextStyle(
                        color = androidx.compose.ui.graphics.Color.White,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier.weight(2f)

                )

                Row(
                    modifier = Modifier
                        .weight(1f).padding(end = 20.dp),
                    horizontalArrangement = Arrangement.End
                ) {
                    Image(
                        painter = painterResource(R.drawable.baseline_notifications_24),
                        contentDescription = null,

                        )

                    Spacer(
                        modifier = Modifier.width(10.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.baseline_history_24),
                        contentDescription = null
                    )
                    Spacer(
                        modifier = Modifier.width(10.dp)
                    )

                    Image(
                        painter = painterResource(R.drawable.baseline_settings_24),
                        contentDescription = null
                    )
                    Spacer(
                        modifier = Modifier.width(10.dp)
                    )
                }


            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(R.drawable.qqqueen),
                        contentDescription = null,
                        modifier = Modifier
                            .height(100.dp)
                            .width(100.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop,
                    )
                    Text(
                        "Queen", style = TextStyle(
                            color = androidx.compose.ui.graphics.Color.White
                        )
                    )
                }
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(R.drawable.alb),
                        contentDescription = null,
                        modifier = Modifier
                            .height(100.dp)
                            .width(100.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop,
                    )
                    Text(
                        "Albratross", style = TextStyle(
                            color = androidx.compose.ui.graphics.Color.White
                        )
                    )
                }
            }
            Row(
                modifier = Modifier.padding(top = 15.dp, start = 15.dp, bottom = 5.dp)
            ) {
                Text(
                    "Recommended For Today", style = TextStyle(
                        color = androidx.compose.ui.graphics.Color.White,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
            Row() {
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(R.drawable.img_2),
                        contentDescription = null,
                        modifier = Modifier
                            .height(200.dp)
                            .width(200.dp)
                    )

                }
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(R.drawable.img_3),
                        contentDescription = null,
                        modifier = Modifier
                            .height(200.dp)
                            .width(200.dp)
                    )

                }
            }
            Row(
                modifier = Modifier.padding(top = 15.dp, start = 15.dp, bottom = 5.dp)
            ) {
                Text(
                    "Editor's Picks", style = TextStyle(
                        color = androidx.compose.ui.graphics.Color.White,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
            Row() {
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(R.drawable.img),
                        contentDescription = null,
                        modifier = Modifier
                            .height(200.dp)
                            .width(200.dp)
                    )

                }
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(R.drawable.img_1),
                        contentDescription = null,
                        modifier = Modifier
                            .height(200.dp)
                            .width(200.dp)
                    )
                }
            }
        }
    }
}


@Preview
@Composable
fun SpotifyDash() {
    SpotifyBody()
}
