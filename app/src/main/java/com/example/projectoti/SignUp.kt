package com.example.projectoti

import android.os.Bundle
import android.service.controls.ControlsProviderService.TAG
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.projectoti.databinding.FragmentSignupBinding
import com.google.firebase.auth.FirebaseAuth


class SignUp : Fragment() {
    private lateinit var auth:FirebaseAuth
    private var _binding: FragmentSignupBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSignupBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val name=binding.editTextTextPersonName2.toString().trim();
        val password=binding.editTextTextPassword.toString().trim();
        val email=binding.editTextTextEmailAddress.toString().trim()
        binding.signinText.setOnClickListener  {
            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener() { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        val user = auth.currentUser
                    } else {
                        // If sign in fails, display a message to the user.
                        Log.w(TAG, "createUserWithEmail:failure", task.exception)
                        Toast.makeText(requireContext(), "Authentication failed. Try Again at a later time",
                            Toast.LENGTH_SHORT).show()
                    }
                }


        }


    }
}