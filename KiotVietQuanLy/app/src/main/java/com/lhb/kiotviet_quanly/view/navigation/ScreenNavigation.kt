package com.lhb.kiotviet_quanly.view.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lhb.kiotviet_quanly.view.AddDescriptionScreen
import com.lhb.kiotviet_quanly.view.AddressScreen
import com.lhb.kiotviet_quanly.view.CancelExportScreen
import com.lhb.kiotviet_quanly.view.CheckInventoryScreen
import com.lhb.kiotviet_quanly.view.ForgotPassword
import com.lhb.kiotviet_quanly.view.InventoryLevels
import com.lhb.kiotviet_quanly.view.NewAddressScreen
import com.lhb.kiotviet_quanly.view.NewTradeMarkScreen
import com.lhb.kiotviet_quanly.view.OnBoardingScreen
import com.lhb.kiotviet_quanly.view.OrderScreen
import com.lhb.kiotviet_quanly.view.ProductDetailScreen
import com.lhb.kiotviet_quanly.view.ReturnGoodsScreen
import com.lhb.kiotviet_quanly.view.ReturnImportedGoodsScreen
import com.lhb.kiotviet_quanly.view.SignInScreen
import com.lhb.kiotviet_quanly.view.SignUpScreen
import com.lhb.kiotviet_quanly.view.TradeMarkScreen
import com.lhb.kiotviet_quanly.view.UpdateOtherInformationScreen
import com.lhb.kiotviet_quanly.view.WarehouseCardScreen
import com.lhb.kiotviet_quanly.view.WelcomeScreen

@Composable
fun ScreenNavigation(){
    val navController = rememberNavController()
    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = "ProductDetailScreen"
    ) {
        composable(ScreenName.OnBoardingScreen.route){ OnBoardingScreen(navController = navController) }
        composable(ScreenName.WelcomeScreen.route){ WelcomeScreen(navController = navController) }
        composable(ScreenName.SignUpScreen.route){ SignUpScreen(navController = navController)}
        composable(ScreenName.SignInScreen.route) { SignInScreen(navController = navController)}
        composable(ScreenName.BottomTav.route){ BottomTav(navController = navController)}
        composable(ScreenName.ForgotPasswordScreen.route){ ForgotPassword(navController = navController)}
        composable(ScreenName.OrderScreen.route){ OrderScreen(navController = navController)}
        composable(ScreenName.ReturnGoodsScreen.route){ ReturnGoodsScreen(navController = navController)}
        composable(ScreenName.CheckInventoryScreen.route){ CheckInventoryScreen(navController = navController)}
        composable(ScreenName.ReturnImportedGoodsScreen.route){ ReturnImportedGoodsScreen(navController = navController)}
        composable(ScreenName.CancelExportScreen.route){ CancelExportScreen(navController = navController)}
        composable(ScreenName.ProductDetailScreen.route){ ProductDetailScreen(navController = navController)}
        composable(ScreenName.UpdateOtherInformationScreen.route){ UpdateOtherInformationScreen(navController = navController)}
        composable(ScreenName.TrademarkScreen.route){ TradeMarkScreen(navController = navController)}
        composable(ScreenName.NewTrademarkScreen.route){ NewTradeMarkScreen(navController = navController)}
        composable(ScreenName.AddressScreen.route){ AddressScreen(navController = navController)}
        composable(ScreenName.NewAddressScreen.route){ NewAddressScreen(navController = navController)}
        composable(ScreenName.AddDescription.route){ AddDescriptionScreen(navController = navController) }
        composable(ScreenName.WarehouseCardScreen.route){ WarehouseCardScreen(navController = navController)}
        composable(ScreenName.InventoryLevels.route){ InventoryLevels(navController = navController)}
    }
}