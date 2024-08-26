package com.lhb.kiotviet_quanly.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.lhb.kiotviet_quanly.model.Product
import com.lhb.kiotviet_quanly.model.ProductRepository.allProducts
import com.lhb.kiotviet_quanly.view.components.BottomBarSellScreen
import com.lhb.kiotviet_quanly.view.components.ItemProduct
import com.lhb.kiotviet_quanly.view.components.ToggleBottom
import com.lhb.kiotviet_quanly.view.components.TopBarOverView
import com.lhb.kiotviet_quanly.view.components.TopBarSell

@Composable
fun SellManagerScreen(navController: NavController, onCartChange: (Int) -> Unit) {
    var isSell by remember { mutableStateOf(false) }
    val fakeProduct = allProducts
    var selectedItems by remember { mutableStateOf(List(fakeProduct.size) { false }) }
    var itemCartNumber by remember { mutableIntStateOf(0) }
    onCartChange(itemCartNumber)
    Scaffold(
        containerColor = Color(0xffF0F0F0),
        modifier = Modifier
            .navigationBarsPadding(),
        topBar = {
            TopBarSell(
                title = if (isSell) "Bán hàng" else "Đặt hàng",
                onClickToQR = { /*TODO*/ },
                onClickToAdd = {}
            )
        },
        bottomBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .height(80.dp)
                    .navigationBarsPadding()
            )
            if (itemCartNumber != 0) {
                BottomBarSellScreen(
                    onClickToCancel = {
                        itemCartNumber = 0
                        selectedItems = List(fakeProduct.size) { false }
                    },
                    onClickToSaveCart = {
                        val selectedProductIds = fakeProduct.filterIndexed{ index, _ -> selectedItems[index] }
                            .joinToString(separator = "|"){it.id}
                        navController.navigate("OrderDetailScreen/$selectedProductIds")
                    },
                    productNumber = itemCartNumber
                )
            }
        },
        floatingActionButton = {
            if (itemCartNumber == 0) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Transparent),
                    contentAlignment = Alignment.Center
                ) {
                    Card(
                        modifier = Modifier
                            .clip(RoundedCornerShape(20.dp))
                            .background(Color.LightGray)
                            .padding(top = 1.dp, start = 2.dp, end = 2.dp, bottom = 3.dp)
                    ) {
                        ToggleBottom(
                            isSelected = { isSell = it }
                        )
                    }
                }
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            LazyColumn {
                items(fakeProduct.size) { index ->
                    val isSelected = selectedItems[index]
                    ItemProduct(
                        product = fakeProduct[index],
                        isSelected = isSelected, // Truyền trạng thái chọn
                        onCLick = {
                            if (isSelected) {
                                itemCartNumber -= 1
                            } else {
                                itemCartNumber += 1
                            }
                            selectedItems = selectedItems.toMutableList().also {
                                it[index] = !isSelected
                            }
                            onCartChange(itemCartNumber)
                        },
                        onItemSelectedNumber = { number ->
                            // Xử lý thay đổi số lượng
                        }
                    )
                }
            }
        }
    }
}