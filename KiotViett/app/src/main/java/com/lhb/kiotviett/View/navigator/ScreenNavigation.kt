package com.lhb.kiotviett.View.navigator

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.lhb.kiotviett.View.CartScreen
import com.lhb.kiotviett.View.FoodAndDrinkScreen
import com.lhb.kiotviett.View.LoginScreen
import com.lhb.kiotviett.View.OrderSummaryScreen
import com.lhb.kiotviett.View.PaymentMethodScreen
import com.lhb.kiotviett.View.PaymentScreen

@Composable
fun ScreenNavigation(){
    val navController = rememberNavController()
    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = ScreenNames.LoginScreen.route
    ){
        composable(ScreenNames.FoodAndDrinkScreen.route){ FoodAndDrinkScreen(navController)}
        composable(ScreenNames.CartScreen.route){ CartScreen(navController) }
        composable(ScreenNames.OrderSummaryScreen.route){ OrderSummaryScreen(navController)}
        composable(
            "${ScreenNames.PaymentScreen.route}/{totalAmount}/{totalProduct}",
            arguments = listOf(
                navArgument("totalAmount"){type = NavType.IntType},
                navArgument("totalProduct"){type = NavType.IntType}
            )
        ){ backStackEntry ->
            PaymentScreen(
                totalAmount = backStackEntry.arguments?.getInt("totalAmount") ?: 0,
                totalProduct = backStackEntry.arguments?.getInt("totalProduct") ?: 0,
                navController
            )
        }
        composable(
            "${ScreenNames.PaymentMethodScreen.route}/{totalAmount}",
            arguments = listOf(
                navArgument("totalAmount"){type = NavType.IntType}
            )
        ){ backStackEntry ->
            PaymentMethodScreen(totalAmount = backStackEntry.arguments?.getInt("totalAmount") ?: 0,navController)
        }
        composable(ScreenNames.LoginScreen.route){ LoginScreen(navController)}
    }
}