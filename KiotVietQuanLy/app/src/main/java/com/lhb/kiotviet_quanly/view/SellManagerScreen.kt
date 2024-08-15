package com.lhb.kiotviet_quanly.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.lhb.kiotviet_quanly.view.components.ToggleBottom
import com.lhb.kiotviet_quanly.view.components.TopBarOverView
import com.lhb.kiotviet_quanly.view.components.TopBarSell

@Composable
fun SellManagerScreen(navController: NavController){
    var isSell by remember { mutableStateOf(false) }
    Scaffold(
        containerColor = Color(0xffF0F0F0),
        modifier = Modifier
            .navigationBarsPadding(),
        topBar = {
            TopBarSell(
                title = if(isSell) "Bán hàng" else "Đặt hàng",
                onClickToQR = { /*TODO*/ },
                onClickToAdd = {}
            )
        },
        bottomBar = {
            Box(modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .height(80.dp))
        },
        floatingActionButton = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Transparent)
                    .padding(10.dp),
                contentAlignment = Alignment.Center
            ){
                ToggleBottom(
                    isSelected = {isSell = it}
                )
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {

        }
    }
}