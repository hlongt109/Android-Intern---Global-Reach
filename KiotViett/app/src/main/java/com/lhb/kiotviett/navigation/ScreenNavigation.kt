package com.lhb.kiotviett.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kiotviet.avtivities.HomeScreen
import com.lhb.kiotviett.View.CreateGroupProduct
import com.lhb.kiotviett.View.CreateProductScreen
import com.lhb.kiotviett.View.SignUp
import com.lhb.kiotviett.View.component.ChooseProductGroup

@Composable
fun ScreenNavigation(){
    val navController = rememberNavController()
    
    NavHost(
        navController = navController, 
        startDestination = "SignUp"
    ) {
        composable(ScreenList.HomeScreen.route){ HomeScreen(navController = navController) }
        composable(ScreenList.AddProduct.route){ CreateProductScreen(navController = navController) }
        composable(ScreenList.ChooseProductScreen.route){ ChooseProductGroup(navController = navController) }
        composable(ScreenList.CreateGroupProduct.route){ CreateGroupProduct(navController = navController ) }
        composable(ScreenList.ChooseGroupProduct.route){ ChooseProductGroup(navController = navController) }
        composable(ScreenList.SignUpScreen.route){ SignUp(navController = navController) }
    }
}