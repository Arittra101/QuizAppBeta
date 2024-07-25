package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.example.quizapp.databinding.FragmentSignInBinding
import com.example.quizapp.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment(R.layout.fragment_sign_up) {
    private lateinit var binding: FragmentSignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding = FragmentSignUpBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)
        binding.signUpBtn.setOnClickListener {


            val intent = Intent(context, MainActivity::class.java)
            // Clear the back stack
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)

        }
        binding.icBack.setOnClickListener {
            navigation(R.id.signUpFragment, R.id.signFragment)
        }
        binding.haveSignIn.setOnClickListener {
            navigation(R.id.signUpFragment, R.id.signFragment)
        }
    }

    private fun navigation(from: Int, to: Int) {
        val navController = findNavController()
        val navOptions = NavOptions.Builder()
            .setPopUpTo(
                from,
                true
            ) // Replace with the actual ID of the current fragment
            .build()
        navController.navigate(to, null, navOptions)
    }

}