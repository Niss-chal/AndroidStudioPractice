package com.example.practicee

import android.R.attr.data
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicee.ui.theme.Blue
import com.example.practicee.ui.theme.White

@Composable
fun HomeScreen() {

    data class Product(val image: Int, val label: String)

    val listData = listOf(
        Product(R.drawable.orange,"Orange"),
        Product(R.drawable.dragon,"DragonFruit"),
        Product(R.drawable.strawberry,"Strawberry"),
        Product(R.drawable.watermelon,"Watermelon"),
        Product(R.drawable.pine,"Pineapple"),
        Product(R.drawable.apple,"Apple"),

    )

    LazyColumn(
        modifier = Modifier.fillMaxSize()
            .background(White)
    ) {

        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center

            ) {
                Image(
                    painter = painterResource(R.drawable.banner),
                    contentDescription = null,
                    modifier = Modifier.size(500.dp)
                        .padding(horizontal = 20.dp)
                )
            }
        }

        item {
            Button(onClick = {}) { Text("Click me") }
            Button(onClick = {}) { Text("Click me") }

            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(20.dp)


            ) {
                Text("Flash Sale", style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                ))
            }
        }

        item {


            LazyRow {

                items(listData.size) { index ->
                    Column(
                        modifier = Modifier.padding(end = 10.dp)
                        , verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painterResource(listData[index].image),
                            contentDescription = null,
                            modifier = Modifier.size(100.dp)
                        )
                        Text(listData[index].label)
                    }
                }

            }
        }

        item {

            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(top = 40.dp, bottom=20.dp ,start = 20.dp)


            ) {
                Text("Recommended For You", style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                ))
            }
        }

        item {


            LazyRow {

                items(listData.size) { index ->
                    Column(
                        modifier = Modifier.padding(end = 10.dp)
                        , verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painterResource(listData[index].image),
                            contentDescription = null,
                            modifier = Modifier.size(100.dp)
                        )
                        Text(listData[index].label)
                    }
                }

            }
        }

    }
}
