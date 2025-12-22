package com.example.practicee

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicee.model.UserModel
import com.example.practicee.ui.theme.Blue
import com.example.practicee.ui.theme.DarkGrey
import com.example.practicee.ui.theme.Greyy
import com.example.practicee.ui.theme.LightGreen
import com.example.practicee.ui.theme.PracticeeTheme
import com.example.practicee.ui.theme.White

class ForgotpassActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
             forgotpassbody()


        }
    }
}

@Composable
fun forgotpassbody() {

    var email by remember { mutableStateOf("") }

    Scaffold() { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = White)
                .padding(padding)
        ) {

            Row(
                modifier = Modifier
            ) {
                Text(
                    "Reset Password", style = TextStyle(
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth()

            ) {
                OutlinedTextField(
                    value = email,
                    onValueChange = { data ->
                        email = data
                    },
                    shape = RoundedCornerShape(12.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Email
                    ),
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                    placeholder = {
                        Text("abc@gmail.com")
                    },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Greyy,
                        unfocusedContainerColor = Greyy,
                        focusedIndicatorColor = DarkGrey,
                        unfocusedIndicatorColor = Color.Transparent
                    )
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Blue
                    ),
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 6.dp
                    ),
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp)

                ) {
                    Text("Reset Password")
                }
            }


        }

    }
}
