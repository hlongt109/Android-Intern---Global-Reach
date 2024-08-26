package com.lhb.kiotviet_quanly.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.lhb.kiotviet_quanly.model.Product
import com.lhb.kiotviet_quanly.view.components.BottomBarOrderDetail
import com.lhb.kiotviet_quanly.view.components.ItemOrderDetail
import com.lhb.kiotviet_quanly.view.components.TopBarOrderDetail

@Composable
fun OrderDetailScreen(navController: NavController,selectedProducts: List<Product>) {

    var quantities = remember { mutableStateListOf<Int>().apply {
        addAll(selectedProducts.map { 1 })
    } }

    var totalAmount by remember { mutableIntStateOf(0) }
    var totalQuantity by remember { mutableIntStateOf(0) }

    fun calculateTotalAmount() {
        totalAmount = 0
        totalQuantity = 0
        selectedProducts.zip(quantities).forEach { (product, quantity) ->
            totalAmount += product.price * quantity
            totalQuantity += quantity
        }
    }

    calculateTotalAmount()

    Scaffold(
        containerColor = Color(0xffeff1f3),
        modifier = Modifier.statusBarsPadding(),
        topBar = {
            TopBarOrderDetail(
                onClickToQR = { /*TODO*/ },
                onClickToAdd = {},
                clickRetailCustomer = {navController.navigate("RetailCustomersScreen")},
                navController
            )
        },
        bottomBar = {
            BottomBarOrderDetail(
                productNumber = totalQuantity,
                totalAmount = totalAmount,
                onClickAddToCard = {},
                onClickPay = {
                    navController.navigate("Payment/${totalAmount}/${totalQuantity}")
                }
            )
        }
    ) { innerPadding ->
        Column(modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()) {
            Spacer(modifier = Modifier.padding(10.dp))
            LazyColumn(
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color(0xffffffff))
            ) {
                items(selectedProducts.size) { index ->
                    ItemOrderDetail(
                        product = selectedProducts[index],
                        onCLick = {
                            navController.navigate("ProductOrderDetailScreen/${selectedProducts[index].id}/${quantities[index]}")
                        },
                        onItemSelectedNumber = { number ->
                            quantities[index] = number
                            calculateTotalAmount()
                        }
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun OrderDetailScreenPreview() {
    val navController = rememberNavController()
    val fakeProduct = listOf(
        Product("1", "Product 1", 10000, "Description 1", 1),
        Product("2", "Product 2", 20000, "Description 2", 2),
        Product("3", "Product 3", 30000, "Description 3", 4)
    )
    OrderDetailScreen(navController, fakeProduct)
}