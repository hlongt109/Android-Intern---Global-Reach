package com.lhb.kiotviet_quanly.view.navigator

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun ScreenNavigation(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = ScreenNames.BottomTav.route
    ) {
        composable(ScreenNames.BottomTav.route){ BottomTav(navController)}

    }
}