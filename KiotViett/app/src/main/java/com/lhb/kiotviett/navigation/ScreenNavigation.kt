package com.lhb.kiotviett.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kiotviet.avtivities.HomeScreen

@Composable
fun ScreenNavigation(){
    val navController = rememberNavController()
    
    NavHost(
        navController = navController, 
        startDestination = "HomeScreen"
    ) {
        composable(ScreenList.HomeScreen.route){ HomeScreen(navController = navController) }
    }
}