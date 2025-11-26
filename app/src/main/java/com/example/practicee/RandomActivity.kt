package com.example.practicee

import android.R.attr.contentDescription
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicee.ui.theme.Blue
import com.example.practicee.ui.theme.Maroon
import com.example.practicee.ui.theme.Pink40
import com.example.practicee.ui.theme.PracticeeTheme
import com.example.practicee.ui.theme.White

class RandomActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RandomBody()
        }
    }
}

@Composable
fun RandomBody(){
    Scaffold { padding->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color= Color.White)
                .padding(padding)

        ) {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(start = 10.dp))
                {
                    Image(
                        painter = painterResource(R.drawable.logo),
                        contentDescription = null,
                        modifier = Modifier
                            .height(100.dp)
                            .width(100.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop,

                        )
                }


                Spacer(modifier = Modifier.width(250.dp))

                Column(
                    modifier = Modifier.padding(end = 5.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(R.drawable.baseline_shopping_cart_24),
                        contentDescription = null,
                        modifier = Modifier.size(100.dp)
                    )
                }
            }

            Row( modifier = Modifier.fillMaxWidth().padding(start = 15.dp, top = 15.dp,end=15.dp)
            ) {
                Card(modifier=Modifier
                    .height(230.dp)
                    .weight(1f),
                    shape=RoundedCornerShape(10.dp),
                    colors= CardDefaults.cardColors(
                        containerColor = Pink40
                    ),
                    elevation = CardDefaults
                        .cardElevation(10.dp))
                {
                    Row(
                        modifier = Modifier.fillMaxWidth()
                            .padding(horizontal = 15.dp, vertical = 10.dp)
                    ) {
                        Text("Pet Accessories",
                            style = TextStyle(

                                fontSize = 25.sp,
                                textAlign=TextAlign.Center
                            ))
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth()
                            .padding(horizontal = 15.dp, vertical = 10.dp)
                    ) {
                        Text("Browse out collection of premium pet products",
                            style = TextStyle(
                                fontSize = 15.sp
                            ))
                    }

                    Row(modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = 15.dp, vertical = 5.dp)) {
                       Button(onClick ={},
                           colors = ButtonDefaults.buttonColors(
                               containerColor =Maroon
                           ),
                           shape = RoundedCornerShape(12.dp),
                           ) {
                           Text("All")
                       }

                        Spacer(modifier = Modifier.width(20.dp))

                        Button(onClick ={},
                            colors = ButtonDefaults.buttonColors(
                                containerColor =Maroon
                            ),
                            shape = RoundedCornerShape(12.dp),
                        ) {
                            Text("Toys")
                        }

                        Spacer(modifier = Modifier.width(20.dp))

                        Button(onClick ={},
                            colors = ButtonDefaults.buttonColors(
                                containerColor =Maroon
                            ),
                            shape = RoundedCornerShape(12.dp),
                        ) {
                            Text("Accessories")
                        }


                    }

                    Row(modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = 15.dp, vertical = 5.dp)) {
                        Button(onClick ={},
                            colors = ButtonDefaults.buttonColors(
                                containerColor =Maroon
                            ),
                            shape = RoundedCornerShape(12.dp),
                        ) {
                            Text("Foods")
                        }
                    }


                }
            }

            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 15.dp)
            ) {
                Card(modifier=Modifier
                    .height(300.dp)
                    .weight(1f),
                    shape=RoundedCornerShape(10.dp),
                    colors= CardDefaults.cardColors(
                        containerColor = White
                    ),
                    elevation = CardDefaults
                        .cardElevation(10.dp)){

                    Card(
                        modifier=Modifier
                            .height(230.dp)
                            .weight(1f),
                        shape=RoundedCornerShape(10.dp),
                        colors= CardDefaults.cardColors(
                            containerColor = White
                        ),
                        elevation = CardDefaults
                            .cardElevation(10.dp)
                    ) {
                        Image(painter = painterResource(R.drawable.dog),
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize())

                    }
                    


                }
            }


        }
    }


}


@Preview
@Composable
fun RandomPreview(){
    RandomBody()
}