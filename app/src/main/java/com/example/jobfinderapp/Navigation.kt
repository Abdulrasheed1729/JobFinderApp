package com.example.jobfinderapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Page.OnboardingPage.route) {
        composable(route = Page.OnboardingPage.route) {
            OnboardingPage(navController)
        }
    }
}