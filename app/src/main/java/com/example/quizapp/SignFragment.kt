package com.example.quizapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.NavOptions
import com.example.quizapp.databinding.FragmentSignInBinding
import com.example.quizapp.util.AuthUtil
import com.example.quizapp.util.NavigationUtil


class SignFragment : Fragment(R.layout.fragment_sign_in) {
    private lateinit var binding: FragmentSignInBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding = FragmentSignInBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        AuthUtil.togglePasswordVisibility(view.context, binding)


        binding.signBtn.setOnClickListener {
            val navController = findNavController()
            NavigationUtil.fragmentToFragmentNavigation(
                navController,
                R.id.signUpFragment,
                R.id.signFragment,
            )

        }
        binding.signUp.setOnClickListener {
            val navController = findNavController()
            NavigationUtil.fragmentToFragmentNavigation(navController, R.id.signUpFragment)
        }

    }
}
