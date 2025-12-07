package com.example.practicee

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.practicee.ui.theme.Blue
import com.example.practicee.ui.theme.DarkGrey
import com.example.practicee.ui.theme.Greyy
import com.example.practicee.ui.theme.White

@Composable
fun SearchScreen() {

    data class Product(val image: Int, val label: String)

    var search by remember { mutableStateOf("")}

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
                modifier = Modifier.fillMaxSize().padding(vertical = 20.dp)
                , verticalAlignment = Alignment.CenterVertically
                , horizontalArrangement = Arrangement.Center
            ) {
                OutlinedTextField(
                    value = search,
                    onValueChange = { data ->
                        search = data
                    },
                    placeholder = {
                        Text("\uD83D\uDD0D Search Bar")
                    },
                    modifier = Modifier
                        .border(BorderStroke(2.dp, Color.Black), shape = RectangleShape),   // <- Fixed
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent
                    )
                )

            }
        }

        item{
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier.height(1000.dp)
            ) {
                items(listData.size) { index ->
                        Image(
                            painterResource(listData[index].image),
                            contentDescription = null,
                            modifier = Modifier.size(250.dp).padding(vertical = 20.dp, horizontal = 10.dp)
                        )

                }
            }
        }

    }
}
