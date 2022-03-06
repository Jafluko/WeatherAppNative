package com.example.weatherappnative.viewcomponents

import androidx.compose.material.Button
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap

@Composable
fun SimpleBtn(btnName: String, event: () -> Unit) {
    Button(
        onClick = event
    ) {
        Text(text = btnName)
    }
}

@Composable
fun FloatBtn(
    fabIcon: ImageBitmap,
    contentDescription: String = "FloatActionButton",
    event: () -> Unit
) {
    FloatingActionButton(
        onClick = event
    ) {
        Icon(
            bitmap = fabIcon,
            contentDescription = contentDescription
        )
    }
}