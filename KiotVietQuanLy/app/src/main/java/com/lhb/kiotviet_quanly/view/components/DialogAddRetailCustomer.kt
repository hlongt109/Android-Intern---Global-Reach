package com.lhb.kiotviet_quanly.view.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddAPhoto
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DialogAddRetailCustomer() {

    var username by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var image by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(10.dp))
            .fillMaxWidth()
            .background(Color.White) // Sử dụng Color.White cho nền
            .padding(10.dp), // Padding cho toàn bộ Column
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = { },
            modifier = Modifier
                .width(130.dp)
                .height(130.dp)
                .shadow(3.dp, RoundedCornerShape(20.dp))
                .background(Color.White), // Đảm bảo Button cũng có nền trắng
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.White
            )
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    Icons.Default.AddAPhoto,
                    contentDescription = null,
                    tint = Color(0xFF0066c7),
                    modifier = Modifier.size(30.dp)
                )

                Text(
                    text = "Thêm ảnh",
                    color = Color(0xff303030),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
        }
        Spacer(modifier = Modifier.height(10.dp))

        CustomTextEnter(
            value = username,
            onValueChange = { username = it },
            label = "Nhập tên khách hàng"
        )
        CustomTextEnter(
            value = phone,
            onValueChange = { phone = it },
            label = "Nhập số điện thoại"
        )
        Spacer(modifier = Modifier.height(10.dp))
        CustomButtonBlue(
            onClick = { /*TODO*/ },
            title = "Thêm khách hàng"
        )
        Spacer(modifier = Modifier.height(10.dp))
    }
}

@Composable
@Preview
fun PreviewDialogAddRetailCustomer() {
    DialogAddRetailCustomer()
}
