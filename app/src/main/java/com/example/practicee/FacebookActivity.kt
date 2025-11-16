package com.example.practicee

import android.R.attr.contentDescription
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicee.ui.theme.Blue
import com.example.practicee.ui.theme.DarkGrey
import com.example.practicee.ui.theme.Greyy
import com.example.practicee.ui.theme.PracticeeTheme
import com.example.practicee.ui.theme.White
import org.w3c.dom.Text

class FacebookActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FacebookBody()

        }
    }
}

@Composable
fun FacebookBody(){

    var email by remember { mutableStateOf("")}
    var password by remember { mutableStateOf("") }
    var visibility by remember { mutableStateOf(false) }
    Scaffold() {
        padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(White)
                .padding(padding)
        ) {
            Spacer(modifier = Modifier.padding(60.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically

            ) {
                Text("Sign In", style = TextStyle(
                    color = Blue,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                ))
            }

            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 25.dp, vertical = 20.dp)

            ) {
                Text("It was popularized in the 1960s with the release of Letraset sheet containing Lorem Ipsum",
                    style= TextStyle(
                        color=Color.Gray.copy(0.8f),
                        fontSize = 13.sp,
                        textAlign = TextAlign.Center
                    )
                )
            }

            Row(
                modifier= Modifier.fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {
                SocialMediaCard(
                    Modifier
                        .height(80.dp)
                        .weight(1f),
                    R.drawable.facebook,
                    "Facebook"
                )

                Spacer(modifier = Modifier.width(15.dp))

                SocialMediaCard(
                    Modifier
                        .height(60.dp)
                        .weight(1f),
                    R.drawable.google,
                    "Google"

                )

            }

            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal=10.dp, vertical = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                HorizontalDivider(
                    modifier=Modifier.weight(1f)
                )

                Text("OR",modifier= Modifier.padding(horizontal = 20.dp))


                HorizontalDivider(
                    modifier=Modifier.weight(1f)
                )
            }

            Row(
                modifier=Modifier.fillMaxWidth()

            ) {
                OutlinedTextField(
                    value = email,
                    onValueChange = { data->
                        email=data
                    },
                    shape= RoundedCornerShape(12.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Email
                    ),
                    modifier = Modifier.fillMaxWidth().padding(horizontal=20.dp),
                    placeholder = {
                        Text("abc@gmail.com")
                    },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor=Greyy,
                        unfocusedContainerColor=Greyy,
                        focusedIndicatorColor= DarkGrey,
                        unfocusedIndicatorColor=Color.Transparent
                    )
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier=Modifier.fillMaxWidth()
            ) {
               OutlinedTextField(
                   value=password,
                   onValueChange = {data->
                       password=data
                   },
                   shape = RoundedCornerShape(12.dp),
                   visualTransformation = if
                           (!visibility) PasswordVisualTransformation()
                   else
                       VisualTransformation.None,
                   trailingIcon ={
                       IconButton(onClick={
                           visibility=!visibility
                       }) {
                           Icon(
                               painter =if(visibility)
                               painterResource(R.drawable.baseline_visibility_off_24)
                               else
                               painterResource(
                                   (R.drawable.baseline_visibility_24)
                               ),
                               contentDescription = null
                           )

                       }

                   },
                   modifier = Modifier.fillMaxWidth().padding(horizontal=20.dp),
                   placeholder = {
                       Text("************")
                   },

                   colors = TextFieldDefaults.colors(
                       focusedContainerColor=Greyy,
                       unfocusedContainerColor=Greyy,
                       focusedIndicatorColor= DarkGrey,
                       unfocusedIndicatorColor=Color.Transparent
                   )
               )
            }

            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(20.dp),
                horizontalArrangement = Arrangement.End

            ) {
                Text("Forget Password?", style = TextStyle(
                    color=Color.Gray.copy(0.8f)
                ))
            }

           Row(
               modifier = Modifier.fillMaxWidth()
           ) {
               Button(
                   onClick = {},
                   colors = ButtonDefaults.buttonColors(
                       containerColor = Blue
                   ),
                   elevation = ButtonDefaults.buttonElevation(
                       defaultElevation = 6.dp
                   ),
                   shape = RoundedCornerShape(12.dp),
                   modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp)

               ) {
                   Text("Log In")
               }
           }

            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(vertical = 15.dp, horizontal = 20.dp)
            ) {
                Text(buildAnnotatedString {
                    append("Don't have an Account? ")

                    withStyle(style = SpanStyle(color=Blue)){
                        append("Sign Up")
                    }
                },
                    style = TextStyle(fontSize = 16.sp))
            }




        }
    }

}



@Composable
fun SocialMediaCard(modifier: Modifier,image: Int, label:  String){
    Card(
        modifier = Modifier
    ) {
        Row(
            modifier=Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter= painterResource(image),
                contentDescription = null,
                modifier = Modifier.size(30.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))
            Text(label)
        }
    }
}

@Preview
@Composable
fun FacebookPreview(){
    FacebookBody()
}