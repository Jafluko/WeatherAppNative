package com.example.weatherappnative.viewcomponents

import androidx.compose.material.Button
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector

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
    fabIcon: ImageVector,
    contentDescription: String = "FloatActionButton",
    event: () -> Unit
) {
    FloatingActionButton(
        onClick = event
    ) {
        Icon(
            imageVector = fabIcon,
            contentDescription = contentDescription
        )
    }
}