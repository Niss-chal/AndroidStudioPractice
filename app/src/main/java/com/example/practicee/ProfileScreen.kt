package com.example.practicee

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicee.ui.theme.Blue
import com.example.practicee.ui.theme.Greyy
import com.example.practicee.ui.theme.Maroon
import com.example.practicee.ui.theme.Pink40
import com.example.practicee.ui.theme.White

@Composable
fun ProfileScreen() {

    data class Feature(
        val icon: Int,
        val  title: String
    )

    val featureList = listOf(
        Feature(R.drawable.baseline_favorite_24,"Favorites"),
        Feature(R.drawable.baseline_checklist_24,"Orders"),
        Feature(R.drawable.baseline_account_balance_wallet_24,"Wallet"),
        Feature(R.drawable.baseline_money_24,"Coins")
    )

    LazyColumn(
        modifier = Modifier.fillMaxSize()
            .background(White)
    ) {
        item {
            Row(
                modifier = Modifier.fillMaxWidth().padding(20.dp),
            ) {
                Image(
                        painter=painterResource(R.drawable.profile),
                        contentDescription = null,
                        modifier = Modifier
                            .height(75.dp)
                            .width(75.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop

                )


                Spacer(modifier = Modifier.width(20.dp))

                Column(
                    modifier = Modifier.fillMaxSize().padding(top = 10.dp)
                    , verticalArrangement = Arrangement.Center
                    , horizontalAlignment = Alignment.Start

                ) {
                    Text(
                        text = "HEHE HAHA",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier= Modifier.height(16.dp))
                    Text(
                        text = "Manage Profile",
                        color=Color(0xFF942929),
                        fontSize = 14.sp
                    )
                }

                Spacer(modifier= Modifier.height(16.dp))
            }
        }

        item {
            HorizontalDivider(modifier = Modifier, thickness = 1.dp,color=Color.Gray)



        }



        item{
            LazyRow(
                modifier =  Modifier.fillMaxWidth().padding(20.dp)
                , horizontalArrangement = Arrangement.SpaceBetween
            ) {



                items(featureList)
                { feature -> FeatureItem(
                        icon=feature.icon,
                        title=feature.title
                    )
                }
            }
        }
    }
}

 @Composable
 fun  FeatureItem(icon: Int,title: String){
     Column(
         horizontalAlignment = Alignment.CenterHorizontally
     ) {
         Box(
             modifier= Modifier.size(55.dp)
                 .background(Color(0xFFECECEC)
             , RoundedCornerShape(12.dp)),
         contentAlignment =   Alignment.Center
         ){
             Image(
                 painter = painterResource(id=icon),
                 contentDescription = null,
                 modifier = Modifier.size(28.dp)
             )

     }
         Spacer(modifier = Modifier.height(6.dp))
         Text(text = title, fontWeight = FontWeight.Bold)
     }
 }
