package com.example.practicee

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.practicee.ui.theme.Blue
import com.example.practicee.ui.theme.LightGreen

@Composable
fun NotificationScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
            .background(LightGreen)
    ) {
        Text("Notification Screen")
    }
}
