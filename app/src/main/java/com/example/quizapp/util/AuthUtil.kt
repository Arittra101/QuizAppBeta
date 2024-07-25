package com.example.quizapp.util

import android.content.Context
import android.content.Intent
import android.text.InputType
import com.example.quizapp.MainActivity
import com.example.quizapp.databinding.FragmentSignInBinding

object AuthUtil {

    fun togglePasswordVisibility(context: Context, binding: FragmentSignInBinding) {
        binding.chShowPass.setOnClickListener {

            val selectionStart = binding.etPass.selectionStart
            val selectionEnd = binding.etPass.selectionEnd

            if (binding.chShowPass.isChecked) {
                binding.etPass.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
            } else {
                binding.etPass.inputType =
                    InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            }

            binding.etPass.setSelection(selectionStart, selectionEnd)
        }
    }
    fun fragmentToActivity(){
        //destroy fragment
//        val intent = Intent(context, MainActivity::class.java)
//        // Clear the back stack
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
//        startActivity(intent)
    }
}