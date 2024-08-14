package com.lhb.kiotviet_quanly.view.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lhb.kiotviet_quanly.view.ForgotPassword
import com.lhb.kiotviet_quanly.view.OnBoardingScreen
import com.lhb.kiotviet_quanly.view.SignInScreen
import com.lhb.kiotviet_quanly.view.SignUpScreen
import com.lhb.kiotviet_quanly.view.WelcomeScreen

@Composable
fun ScreenNavigation(){
    val navController = rememberNavController()
    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = "WelcomeScreen"
    ) {
        composable(ScreenName.OnBoardingScreen.route){ OnBoardingScreen(navController = navController) }
        composable(ScreenName.WelcomeScreen.route){ WelcomeScreen(navController = navController) }
        composable(ScreenName.SignUpScreen.route){ SignUpScreen(navController = navController)}
        composable(ScreenName.SignInScreen.route) { SignInScreen(navController = navController)}
        composable(ScreenName.BottomTav.route){ BottomTav(navController) }
        composable(ScreenName.ForgotPasswordScreen.route){ ForgotPassword(navController = navController)}
    }
}