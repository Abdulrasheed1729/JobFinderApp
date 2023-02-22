package com.example.jobfinderapp

sealed class Page (val route: String) {
    object OnboardingPage : Page("onboarding_page")
    object HomePage : Page("home_page")
}