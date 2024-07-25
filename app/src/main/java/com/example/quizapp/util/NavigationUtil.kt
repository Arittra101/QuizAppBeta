package com.example.quizapp.util

import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import com.example.quizapp.R

object NavigationUtil {

    fun fragmentToFragmentNavigation(
        navController: NavController,
        toFragment: Int,
        popFragment: Int? = null
    ) {

        if (popFragment != null) {
            val navOptions = NavOptions.Builder()
                .setPopUpTo(
                    popFragment,
                    true
                ) // Replace with the actual ID of the current fragment
                .build()
            navController.navigate(toFragment, null, navOptions)
        } else {
            val navOptions = NavOptions.Builder().build()
            navController.navigate(toFragment, null, navOptions)
        }
    }

}