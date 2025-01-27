package com.example.newsappcompose.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.newsappcompose.ui.screens.HomeScreen

/**
 * Created by Mohammad Mehedi Hasan on 17,September,2024
 * Email: themehedi.pro@gmail.com
 */

@Composable
fun AppNavigationGraph() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.HOME_SCREEN) {

        composable(Routes.HOME_SCREEN) {
            HomeScreen()
        }
    }
}