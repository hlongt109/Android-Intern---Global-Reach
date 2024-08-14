package com.lhb.kiotviet_quanly.view.component

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.lhb.kiotviet_quanly.ui.theme.OpenSans

@Composable
fun CustomTextFontSize16(
    title: String,
    color: Color,
    onclick: () -> Unit
){
    Text(
        text = title,
        fontSize = 16.sp,
        color = color,
        fontFamily = OpenSans,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .clickable { onclick() }
    )
}