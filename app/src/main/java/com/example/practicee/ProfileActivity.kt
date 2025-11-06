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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practicee.ui.theme.PracticeeTheme

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileBody()

        }
    }
}

@Composable
fun ProfileBody(){
    Scaffold { padding->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color= Color.White)
                .padding(padding)

        ) {
            Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment= Alignment.CenterVertically,
                    horizontalArrangement= Arrangement.SpaceBetween
                    ){
                Icon(

                    //if default library is used
//                    imageVector = Icons.Default.Add,
//                    contentDescription = null

                    painter = painterResource(R.drawable.baseline_arrow_back_ios_24),
                    contentDescription = null

                )
                Text("hehehaha2225")
                Icon(
                    painter = painterResource(R.drawable.baseline_more_horiz_24),
                    contentDescription = null
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment= Alignment.CenterVertically,
                horizontalArrangement= Arrangement.SpaceAround

            ){
                Image(
                    painter = painterResource(R.drawable.example),
                    contentDescription = null,
                    modifier = Modifier
                        .height(100.dp)
                        .width(100.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop

                )
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("125")
                    Text("Posts")
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("1B")
                    Text("Followers")
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("1")
                    Text("Following")
                }



            }

            Row(
                modifier = Modifier.padding(top=15.dp,start=20.dp, bottom =5.dp)
            ) {
                Text("NOBODY KNOWS")
            }

            Row(
                modifier = Modifier.padding(start=20.dp, bottom =5.dp)
            ) {
                Text("An example of the ui")

            }

            Row(
                modifier = Modifier.padding(start=20.dp, bottom = 5.dp)
            ) {
                Text("LINK",style= TextStyle(
                    color = Color.Blue
                ))
            }

            Row(
                modifier = Modifier.padding(start=20.dp, bottom = 10.dp)
            ) {
                Text("Followed by everyone")
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment= Alignment.CenterVertically,
                horizontalArrangement= Arrangement.SpaceAround
            ) {
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Image(
                        painter = painterResource(R.drawable.story),
                        contentDescription = null,
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop,

                    )
                    Text("Story 1")
                }
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(R.drawable.story2),
                        contentDescription = null,
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text("Story 2")
                }
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(R.drawable.story3jpg),
                        contentDescription = null,
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text("Story 3")
                }
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(R.drawable.story4),
                        contentDescription = null,
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text("Story 4")
                }

            }
        }
    }

}

@Preview
@Composable
fun BodyPreview(){
    ProfileBody()
}
