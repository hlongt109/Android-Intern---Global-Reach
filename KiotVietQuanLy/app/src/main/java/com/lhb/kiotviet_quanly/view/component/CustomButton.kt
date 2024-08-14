package com.lhb.kiotviet_quanly.view.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lhb.kiotviet_quanly.ui.theme.OpenSans

@Composable
fun CustomButtonTransparent(
    onClick: () -> Unit,
    title: String
){
    Button(
        onClick = { onClick() },
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .border(
                width = 2.dp,
                color = Color(0xff3f86f7),
                shape = RoundedCornerShape(10.dp)
            ),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent
        ),
        shape = RectangleShape
    ) {
        Text(
            text = title,
            fontSize = 22.sp,
            color = Color(0xff3f86f7),
            fontFamily = OpenSans,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun CustomButtonBlue(
    onClick: () -> Unit,
    title: String
){
    Button(
        onClick = { onClick() },
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .clip(RoundedCornerShape(10.dp)),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xff3f86f7)
        ),
        shape = RectangleShape
    ) {
        Text(
            text = title,
            fontSize = 22.sp,
            color = Color.White,
            fontFamily = OpenSans,
            fontWeight = FontWeight.Bold
        )
    }
}