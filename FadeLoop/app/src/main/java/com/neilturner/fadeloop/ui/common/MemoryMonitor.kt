package com.neilturner.fadeloop.ui.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Text
import kotlinx.coroutines.delay

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun MemoryMonitor(modifier: Modifier = Modifier) {
    var memoryText by remember { mutableStateOf("Mem: ...") }

    LaunchedEffect(Unit) {
        while (true) {
            val runtime = Runtime.getRuntime()
            val usedMemInMB = (runtime.totalMemory() - runtime.freeMemory()) / 1048576L
            val maxMemInMB = runtime.maxMemory() / 1048576L
            val availMemInMB = runtime.freeMemory() / 1048576L
            
            memoryText = "Used: ${usedMemInMB}MB / Max: ${maxMemInMB}MB"
            delay(1000)
        }
    }

    Text(
        text = memoryText,
        color = Color.Green,
        fontSize = 12.sp,
        fontFamily = FontFamily.Monospace,
        modifier = modifier
            .background(Color.Black.copy(alpha = 0.5f), RoundedCornerShape(4.dp))
            .padding(4.dp)
    )
}
