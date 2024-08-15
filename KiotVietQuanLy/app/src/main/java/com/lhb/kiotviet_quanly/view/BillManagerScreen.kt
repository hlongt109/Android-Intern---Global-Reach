package com.lhb.kiotviet_quanly.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
import com.lhb.kiotviet_quanly.model.Bill
import com.lhb.kiotviet_quanly.view.component.ItemBill
import com.lhb.kiotviet_quanly.view.components.TopBarBill
import com.lhb.kiotviet_quanly.view.components.TopBarOverView

@Composable
fun BillManagerScreen(navController: NavController){
    val fakeBill = listOf(
        Bill("b1","Trần Hoàng Long","Thứ Hai, 05/08/2024","HD0004","Thắt lưng nam Hermes",18,10465000, "Tiền mặt"),
        Bill("b2","Long - Hà Nội","Thứ Ba, 06/08/2024","HD0006","Thắt lưng nam LV xanh",13,1495000, "Tiền mặt"),
        Bill("b3","Bùi Quang Long","Thứ Ba, 06/08/2024","HD0004","Quần tây nam đen",14,7450000, "Tiền mặt"),
        Bill("b4","Khổng Tuấn","Thứ Tư, 07/08/2024","HD0007","Quần kaki nam nâu",11,2990000, "Tiền mặt"),
        Bill("b5","Anh Sơn","Thứ Tư, 05/07/2024","HD0002","Giày da nam màu nâu",9,5083000, "Tiền mặt"),
        Bill("b6","Linh Chi","Thứ Năm, 08/08/2024","HD0008","Giày nữ màu kem",8,9269000, "Tiền mặt"),
    )
    Scaffold(
        containerColor = Color(0xffF0F0F0),
        modifier = Modifier
            .navigationBarsPadding(),
        topBar = {
            TopBarBill(
                onClickToSearch = { /*TODO*/ },
                onClickToSort = { /*TODO*/ },
                onClickToFilter = { /*TODO*/ },
                onClickTopShowDateBottomSheet = {}
            )
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
        },
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            LazyColumn(
                modifier = Modifier.fillMaxSize()
            ) {
                items(fakeBill.size){index ->
                    ItemBill(bill = fakeBill[index])
                }
                item{
                    Box(modifier = Modifier.height(50.dp))
                }
            }
        }
    }
}