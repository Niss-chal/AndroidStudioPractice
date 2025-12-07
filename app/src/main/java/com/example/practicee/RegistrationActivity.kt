package com.example.practicee

import android.R.attr.data
import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.DatePickerDialog
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
import androidx.compose.ui.platform.LocalContext
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
import com.example.practicee.ui.theme.LightGreen
import com.example.practicee.ui.theme.PracticeeTheme
import com.example.practicee.ui.theme.White
import java.util.Calendar

class RegistrationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RegistrationBody()

        }
    }
}

@Composable
fun RegistrationBody(){


    var email by remember { mutableStateOf("")}
    var password by remember { mutableStateOf("") }
    var visibility by remember { mutableStateOf(false) }
    var terms by remember { mutableStateOf(false) }
    var date by remember { mutableStateOf("") }


    val context = LocalContext.current
    val activity = context as Activity
    val sharedPreference =
        context.getSharedPreferences("User",
            Context.MODE_PRIVATE)

    val editor = sharedPreference.edit()


    var calender = Calendar.getInstance()
    var year = calender.get(Calendar.YEAR)
    var month = calender.get(Calendar.MONTH)
    var day = calender.get(Calendar.DAY_OF_MONTH)
    var datePicker = android.app.DatePickerDialog(
        context, { _, y, m, d ->
            date = "$d/${m + 1}/$y"
        }, year, month, day
    )
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
                Text("Sign Up", style = TextStyle(
                    color = Blue,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                ))
            }

            Spacer(modifier = Modifier.height(20.dp))

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

            OutlinedTextField(
                value = date,
                onValueChange={ data ->
                    date=data
                },
                shape = RoundedCornerShape(12.dp),
                enabled = false,
                modifier = Modifier.fillMaxWidth().clickable{
                    datePicker.show()
                }
                    .padding(horizontal=15.dp),
                placeholder = {
                    Text("dd/mm/yyyy")
                },
                colors=TextFieldDefaults.colors(
                    disabledContainerColor = Greyy,
                    disabledIndicatorColor = Color.Transparent,
                    focusedContainerColor = Greyy,
                    unfocusedContainerColor = Greyy,
                    focusedIndicatorColor = DarkGrey,
                    unfocusedIndicatorColor = Color.Transparent
                )
            )

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

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ){
                Checkbox(
                    checked = terms,
                    onCheckedChange = { data ->
                        terms = data
                    },
                    colors = CheckboxDefaults.colors(
                        checkedColor = LightGreen,
                        checkmarkColor = White
                    )
                )
                Text("I agree to terms and Conditions")
            }


            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(
                    onClick = {
                        if(!terms){
                            Toast.makeText(context,"Please agree to terms and conditions",Toast.LENGTH_SHORT).show()
                        }else{
                            editor.putString("email",email)
                            editor.putString("password",password)
                            editor.putString("date",date)

                            editor.apply()
                            activity.finish()

                            Toast.makeText(context,"Registered Successfully",Toast.LENGTH_SHORT).show()
                        }


                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Blue
                    ),
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 6.dp
                    ),
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp)

                ) {
                    Text("Sign Up")
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(vertical = 15.dp, horizontal = 20.dp)
            ) {
                Text(buildAnnotatedString {
                    append("Don't have an Account? ")

                    withStyle(style = SpanStyle(color=Blue)){
                        append("Sign In")
                    }
                },
                    style = TextStyle(fontSize = 16.sp))
            }




        }
    }

}

@Preview
@Composable
fun PreviewRegistration(){
    RegistrationBody()
}