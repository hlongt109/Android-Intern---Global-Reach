package com.lhb.kiotviet_quanly.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.lhb.kiotviet_quanly.R
import com.lhb.kiotviet_quanly.view.component.CustomBigButton
import com.lhb.kiotviet_quanly.view.component.CustomOutlinedTextField
import com.lhb.kiotviet_quanly.view.component.CustomTextFontSizeMedium

@Composable
fun SignUpScreen(navController: NavController) {

    val nameUser = remember { mutableStateOf("") }
    val phoneNumberUser = remember { mutableStateOf("") }
    val nationalityUser = remember { mutableStateOf("") }
    val areaUser = remember { mutableStateOf("") }

    val nameUserFocused = remember { mutableStateOf(false) }
    val phoneNumberUserFocused = remember { mutableStateOf(false) }
    val nationalityUserFocused = remember { mutableStateOf(false) }
    val areaUserFocused = remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            Column(
                modifier = Modifier
                    .background(Color(0xffffffff))
                    .fillMaxWidth()
                    .padding(20.dp)
                    .statusBarsPadding()
            ) {
                Icon(Icons.Default.ArrowBackIosNew, contentDescription = null, modifier = Modifier.size(25.dp).clickable { navController.popBackStack() }, tint = Color(0xff9fa5aa))
                Spacer(modifier = Modifier.padding(15.dp))
                CustomTextFontSizeMedium(title = "Tạo tài khoản dùng thử miễn phí", color = Color.Black, fontSize = 25)
            }
        }
    ) { innerPadding ->
       Column(modifier = Modifier.background(Color.White).fillMaxSize().padding(innerPadding).padding(20.dp)) {

           CustomOutlinedTextField(
               value = nameUser.value,
               onValueChange = { nameUser.value = it },
               label = "Quốc gia đang kinh doanh",
               isFocused = nameUserFocused
           )

           CustomOutlinedTextField(
               value = nameUser.value,
               onValueChange = { nameUser.value = it },
               label = "Nhập số điện thoại",
               isFocused = nameUserFocused,
               leadingIcon = {
                   Row(
                       modifier = Modifier.padding(start = 8.dp)
                   ) {
                       Image(
                           painter = painterResource(id = R.drawable.icon_vn),
                           contentDescription = null,
                           modifier = Modifier.size(24.dp)
                       )
                       Icon(Icons.Default.ArrowDropDown, contentDescription = null)
                   }
               }
           )

           CustomOutlinedTextField(
               value = nameUser.value,
               onValueChange = { nameUser.value = it },
               label = "Quốc gia đang kinh doanh",
               isFocused = nameUserFocused
           )

           CustomOutlinedTextField(
               value = nameUser.value,
               onValueChange = { nameUser.value = it },
               label = "Khu vực",
               isFocused = nameUserFocused
           )

           Spacer(modifier = Modifier.padding(top = 30.dp))

           Column(
               modifier = Modifier.fillMaxWidth(),
               verticalArrangement = Arrangement.Center,
               horizontalAlignment = Alignment.CenterHorizontally
           ) {
               Text(
                   text = "Bằng việc nhấn nút Tiếp tục đã đồng ý với",
                   fontSize = 16.sp,
                   fontWeight = FontWeight.Bold,
                   modifier = Modifier.padding(top = 10.dp)
               )

               Text(
                   text = "Điều khoản và chính sách sử dụng",
                   fontSize = 16.sp,
                   fontWeight = FontWeight.Bold,
                   color = Color(0xff005595)
               )
           }

           Spacer(modifier = Modifier.padding(top = 20.dp))

           CustomBigButton(
               title = "Tiếp tục",
               onClick = {
                   navController.popBackStack()
               }
           )
       }
    }
}

@Composable
@Preview
fun SignUpScreenPreview() {
    SignUpScreen(navController = rememberNavController())
}