package com.lhb.kiotviet_quanly.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AttachMoney
import androidx.compose.material.icons.outlined.Money
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.lhb.kiotviet_quanly.R
import com.lhb.kiotviet_quanly.view.components.ItemOverView
import com.lhb.kiotviet_quanly.view.components.TopBarOverView

@Composable
fun OverViewManagerScreen(navController: NavController){
    var isVisibleLoiNhuan by remember { mutableStateOf(false) }
    Scaffold(
        containerColor = Color(0xffF0F0F0),
        modifier = Modifier
            .navigationBarsPadding(),
        topBar = {
            TopBarOverView(
                onClickToNotification = { /*TODO*/ },
                onClickToEmail = { /*TODO*/ },
                onClickTopShowBottomSheetDate = {}
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            LazyColumn {
                item {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.White)
                                .padding(15.dp)
                                .border(
                                    width = 1.dp,
                                    color = Color.LightGray,
                                    shape = RoundedCornerShape(5.dp)
                                )
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(10.dp)
                            ) {
                                Column(
                                    modifier = Modifier
                                        .weight(1f)
                                        .padding(10.dp)
                                ) {
                                    Text(text = "1 hóa đơn", fontSize = 15.sp, color = Color(0xff686868))
                                    Spacer(modifier = Modifier.height(5.dp))
                                    Text(
                                        text = buildAnnotatedString {
                                            append("10.47")
                                            withStyle(style = SpanStyle(color = Color(0xff303030), fontWeight = FontWeight.Medium, fontSize = 15.sp)){
                                                append(" triệu")
                                            }
                                        },
                                        fontSize = 24.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color(0xff0066CC),
                                        modifier = Modifier.fillMaxWidth()
                                    )
                                }
                                Column(
                                    modifier = Modifier.weight(1f),
                                    horizontalAlignment = Alignment.Start,
                                    verticalArrangement = Arrangement.Top
                                ) {
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Text(text = "Lợi nhuận", fontSize = 15.sp, color = Color(0xff686868))
                                        Spacer(modifier = Modifier.width(5.dp))
                                        IconButton(onClick = { isVisibleLoiNhuan = !isVisibleLoiNhuan }) {
                                            Icon(
                                                if(isVisibleLoiNhuan) Icons.Outlined.Visibility else Icons.Outlined.VisibilityOff,
                                                contentDescription = "",
                                                tint = Color(0xff686868),
                                                modifier = Modifier.size(23.dp)
                                            )
                                        }
                                    }
                                    Text(
                                        text = buildAnnotatedString {
                                            if(isVisibleLoiNhuan){
                                                append("5.22")
                                                withStyle(style = SpanStyle(color = Color(0xff303030), fontWeight = FontWeight.Medium, fontSize = 15.sp)){
                                                    append(" triệu")
                                                }
                                            }else{
                                                append("*** ***")
                                            }
                                        },
                                        fontSize = 24.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color(0xff32CD32),
                                        modifier = Modifier.fillMaxWidth()
                                    )
                                }
                            }
                            Divider(color = Color.LightGray, thickness = 0.5.dp, modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp))
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 10.dp, bottom = 10.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.icon_box_back),
                                    contentDescription = "",
                                    modifier = Modifier.height(35.dp)
                                )
                                Text(
                                    text = buildAnnotatedString {
                                        append("0")
                                        withStyle(
                                            style = SpanStyle(
                                                color = Color(0xff686868),
                                                fontWeight = FontWeight.Normal,
                                                fontSize = 15.sp
                                            )
                                        ) {
                                            append(" phiếu trả hàng")
                                        }
                                    },
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color(0xff303030),
                                    modifier = Modifier.fillMaxWidth()
                                )
                            }
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth().padding(top = 20.dp, start = 20.dp, end = 20.dp, bottom = 10.dp),
                            horizontalArrangement = Arrangement.SpaceAround
                        ) {
                            ItemOverView(iconName = painterResource(id = R.drawable.money_bag), title = "Vay vốn",26, onCLick = {})
                            ItemOverView(iconName = painterResource(id = R.drawable.icon_delivery), title = "Giao hàng",26,onCLick = {})
                            ItemOverView(iconName = painterResource(id = R.drawable.icon_cart), title = "Nguồn hàng sỉ",26,onCLick = {})
                        }
                    }
                }
            }
        }
    }
}