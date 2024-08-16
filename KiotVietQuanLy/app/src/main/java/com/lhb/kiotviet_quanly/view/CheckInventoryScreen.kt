package com.lhb.kiotviet_quanly.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.lhb.kiotviet_quanly.R
import com.lhb.kiotviet_quanly.view.components.CustomTextFontSize
import com.lhb.kiotviet_quanly.view.components.TopBarAll

@Composable
fun CheckInventoryScreen(navController: NavController){
    Scaffold(
        topBar = {
            TopBarAll(
                onClickToSearch = { /*TODO*/ },
                onClickToSort = { /*TODO*/ },
                onClickToFilter = { /*TODO*/ },
                onClickTopShowDateBottomSheet = { /*TODO*/ },
                onClickToBack = { navController.popBackStack() },
                title = "Kiểm kho"
            )
        },
        floatingActionButton = {
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(bottom = 20.dp)
                    .clip(RoundedCornerShape(30.dp))
                    .background(Color(0xff014e8a))
                    .padding(5.dp)
            ) {
                Icon(
                    Icons.Default.Add,
                    contentDescription = "",
                    modifier = Modifier.size(28.dp),
                    tint = Color.White
                )
            }
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xffeff1f3))
                .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.icon_bill),
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
            )
            Spacer(modifier = Modifier.padding(10.dp))
            CustomTextFontSize(title = "Chưa có phiếu kiểm kho", color = Color(0xff525d69), fontSize = 18)
        }
    }
}