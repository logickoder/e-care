package com.zuritraining.pjt_14_ecare.ui.create_account

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.zuritraining.pjt_14_ecare.R
import com.zuritraining.pjt_14_ecare.databinding.FragmentCreateAccountBinding

class CreateAccount : Fragment() {

    private lateinit var binding: FragmentCreateAccountBinding
    private lateinit var viewModel: CreateAccountViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        viewModel = ViewModelProvider(this).get(CreateAccountViewModel::class.java)
        binding = FragmentCreateAccountBinding.inflate(inflater)
        // resets everything back to normal
        requireActivity().apply {
            this.findViewById<View>(R.id.toolbar).visibility = View.VISIBLE
        }
        binding.buttonNext.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_create_account_to_navigation_create_account_page_2)
        }
        return binding.root
    }


}