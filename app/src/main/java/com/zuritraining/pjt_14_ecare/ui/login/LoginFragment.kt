package com.zuritraining.pjt_14_ecare.ui.login

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.zuritraining.pjt_14_ecare.R
import com.zuritraining.pjt_14_ecare.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    companion object {}

    private lateinit var viewModel: LoginViewModel
    private lateinit var  binding:FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.loginBtn.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_nav_home)
        }
    }
}