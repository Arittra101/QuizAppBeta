package com.example.quizapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.NavOptions
import com.example.quizapp.databinding.FragmentSignInBinding


class SignFragment : Fragment(R.layout.fragment_sign_in) {
    private lateinit var binding: FragmentSignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding = FragmentSignInBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        binding.chShowPass.setOnClickListener {
//            binding.tvFrPass.inputType = Number.
        }

        binding.signBtn.setOnClickListener {


//            if we dont need to popup previous one
//            val navController1 = findNavController()
//            navController1.navigate(R.id.signUpFragment)


            val navController = findNavController()
            val navOptions = NavOptions.Builder()
                .setPopUpTo(
                    R.id.signFragment,
                    true
                ) // Replace with the actual ID of the current fragment
                .build()
            navController.navigate(R.id.signUpFragment, null, navOptions)
        }
        binding.signUp.setOnClickListener {
            val navController = findNavController()
            val navOptions = NavOptions.Builder()
                .build()
            navController.navigate(R.id.signUpFragment, null, navOptions)
        }

    }
}