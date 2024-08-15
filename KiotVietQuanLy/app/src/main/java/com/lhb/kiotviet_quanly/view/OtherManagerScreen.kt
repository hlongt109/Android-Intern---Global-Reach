package com.lhb.kiotviet_quanly.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material.icons.filled.Create
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.lhb.kiotviet_quanly.R
import com.lhb.kiotviet_quanly.view.component.Content1
import com.lhb.kiotviet_quanly.view.component.Content2
import com.lhb.kiotviet_quanly.view.component.ContentDelivery
import com.lhb.kiotviet_quanly.view.component.ContentFinance
import com.lhb.kiotviet_quanly.view.component.ContentGeneralSettings
import com.lhb.kiotviet_quanly.view.component.ContentGeneralSettings2
import com.lhb.kiotviet_quanly.view.component.ContentGeneralSettings3
import com.lhb.kiotviet_quanly.view.component.ContentGoods
import com.lhb.kiotviet_quanly.view.component.ContentPartner
import com.lhb.kiotviet_quanly.view.component.ContentReport
import com.lhb.kiotviet_quanly.view.component.ContentSellOnline
import com.lhb.kiotviet_quanly.view.component.ContentStaff
import com.lhb.kiotviet_quanly.view.component.ContentTransaction
import com.lhb.kiotviet_quanly.view.component.CustomContent3Icon
import com.lhb.kiotviet_quanly.view.component.CustomContentIcon
import com.lhb.kiotviet_quanly.view.component.CustomTextFontSize
import com.lhb.kiotviet_quanly.view.component.CustomTextFontSizeMedium

@Composable
fun OtherManagerScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .background(Color(0xffeff1f3))
            .fillMaxSize()

    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp)
        ) {
            item {
                Content1()

                ContentTransaction()

                ContentGoods()

                ContentSellOnline()

                ContentPartner()

                ContentDelivery()

                ContentStaff()

                ContentReport()

                ContentFinance()

                Content2()

                ContentGeneralSettings()

                ContentGeneralSettings2()

                ContentGeneralSettings3()
            }
            item {
                Spacer(modifier = Modifier.padding(60.dp))
            }

        }
    }
}

@Composable
@Preview
fun OtherManagerScreenPreview() {
    OtherManagerScreen(navController = rememberNavController())
}