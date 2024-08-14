package com.lhb.kiotviet_quanly.view.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lhb.kiotviet_quanly.view.OnBoardingScreen

@Composable
fun ScreenNavigation(){
    val navController = rememberNavController()
    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = "OnBoardingScreen"
    ) {
        composable(ScreenName.OnBoardingScreen.route){ OnBoardingScreen(navController = navController) }
    }
}