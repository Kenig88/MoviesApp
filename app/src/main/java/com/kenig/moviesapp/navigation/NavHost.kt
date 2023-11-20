package com.kenig.moviesapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.kenig.moviesapp.Routes
import com.kenig.moviesapp.ui.screens.DetailsScreen
import com.kenig.moviesapp.ui.screens.MainScreen
import com.kenig.moviesapp.ui.screens.SplashScreen

@Composable
fun NavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Routes.SPLASH_SCREEN) {
        composable(Routes.SPLASH_SCREEN) {
            SplashScreen(navController)
        }
        composable(Routes.MAIN_SCREEN) {
            MainScreen()
        }
        composable(Routes.DETAILS_SCREEN) {
            DetailsScreen()
        }
    }
}