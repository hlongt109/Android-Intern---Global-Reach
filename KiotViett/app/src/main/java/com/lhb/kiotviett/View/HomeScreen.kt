package com.example.kiotviet.avtivities

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.kiotviet.avtivities.component.ItemTypes
import com.example.kiotviet.avtivities.component.ToolBar
import com.example.kiotviet.models.Category

@Composable
fun HomeScreen(navController: NavController) {

    var selectedTabIndex by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFdddddd))
            .statusBarsPadding()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
        ) {
            ToolBar()

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White)
                ) {
                    Scaffold(
                        topBar = {
                            TabRow(selectedTabIndex = selectedTabIndex, contentColor = Color.Black) {
                                Tab(selected = selectedTabIndex == 0, onClick = { selectedTabIndex = 0 }) {
                                    Text("Tất cả", modifier = Modifier.padding(16.dp), fontWeight = FontWeight.Bold, color = if(selectedTabIndex == 0) Color(0xFF0067c7) else Color.Black)
                                }
                                Tab(selected = selectedTabIndex == 1, onClick = { selectedTabIndex = 1 }) {
                                    Text("Sử dụng", modifier = Modifier.padding(16.dp), fontWeight = FontWeight.Bold, color = if(selectedTabIndex == 1) Color(0xFF0067c7) else Color.Black)
                                }
                                Tab(selected = selectedTabIndex == 2, onClick = { selectedTabIndex = 2 }) {
                                    Text("Còn trống", modifier = Modifier.padding(16.dp), fontWeight = FontWeight.Bold, color = if(selectedTabIndex == 2) Color(0xFF0067c7) else Color.Black)
                                }
                            }
                        }
                    ) { innerPadding ->
                        Box(modifier = Modifier.padding(innerPadding)) {
                            when (selectedTabIndex) {
                                0 -> AllScreen(navController)
                                1 -> UseScreen(navController)
                                2 -> StillEmptyScreen(navController)
                            }
                        }
                    }
                }
            }
        }
    }
}
