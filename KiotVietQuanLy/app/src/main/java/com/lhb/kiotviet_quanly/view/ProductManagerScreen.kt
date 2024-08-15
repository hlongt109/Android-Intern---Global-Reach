package com.lhb.kiotviet_quanly.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.lhb.kiotviet_quanly.view.components.TopBarProduct

@Composable
fun ProductManagerScreen(navController: NavController) {
    Scaffold(
        containerColor = Color(0xffF0F0F0),
        modifier = Modifier
            .navigationBarsPadding(),
        topBar = {
            TopBarProduct()
        },
        floatingActionButton = {
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(bottom = 70.dp)
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
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            
        }
    }
}