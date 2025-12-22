package com.example.practicee

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicee.model.ProductModel
import com.example.practicee.repository.ProductRepoImpl
import com.example.practicee.ui.theme.Blue
import com.example.practicee.ui.theme.DarkGrey
import com.example.practicee.ui.theme.Greyy
import com.example.practicee.ui.theme.PracticeeTheme
import com.example.practicee.ui.theme.White
import com.example.practicee.viewmodel.ProductViewModel

class ProductActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            productBody()
        }
    }
}

@Composable
fun productBody(){


    var productViewModel = remember { ProductViewModel(ProductRepoImpl()) }
    var model = remember { ProductModel() }
    var name by remember { mutableStateOf("") }
    var price by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }

    val context = LocalContext.current
    val activity =context as Activity

    Scaffold() { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = White)
                .padding(padding)
        ) {


            Row(
                modifier = Modifier.fillMaxWidth().padding(top = 20.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically

            ) {
                Text(
                    "Add Product", style = TextStyle(
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                )
            }

            Spacer(modifier = Modifier.height(30.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically


            ) {
                OutlinedTextField(
                    value = name,
                    onValueChange = { data ->
                        name = data
                    },
                    shape = RoundedCornerShape(12.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    ),
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                    placeholder = {
                        Text("Enter the name")
                    },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Greyy,
                        unfocusedContainerColor = Greyy,
                        focusedIndicatorColor = DarkGrey,
                        unfocusedIndicatorColor = Color.Transparent
                    )
                )
            }

            Spacer(modifier = Modifier.height(30.dp))


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedTextField(
                    value = price,
                    onValueChange = { data ->
                        price = data
                    },
                    shape = RoundedCornerShape(12.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                    placeholder = {
                        Text("Enter the price")
                    },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Greyy,
                        unfocusedContainerColor = Greyy,
                        focusedIndicatorColor = DarkGrey,
                        unfocusedIndicatorColor = Color.Transparent
                    )
                )

            }

            Spacer(modifier = Modifier.height(30.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedTextField(
                    value = description,
                    onValueChange = { data ->
                        description = data
                    },
                    shape = RoundedCornerShape(12.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    ),
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                    placeholder = {
                        Text("Enter the description")
                    },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Greyy,
                        unfocusedContainerColor = Greyy,
                        focusedIndicatorColor = DarkGrey,
                        unfocusedIndicatorColor = Color.Transparent
                    )
                )
            }

            Spacer(modifier = Modifier.height(30.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    onClick = {
                        val newProduct = ProductModel(
                            name = name,
                            price = price,
                            description = description
                        )
                        productViewModel.addProduct(newProduct){
                            success,msg ->
                            if(success){
                                Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
                            }
                            else{
                                Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()

                            }
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
                    Text("+ Add Product")
                }
            }


        }

    }


}