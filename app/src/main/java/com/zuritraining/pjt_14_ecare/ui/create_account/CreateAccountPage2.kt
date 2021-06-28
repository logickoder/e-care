package com.zuritraining.pjt_14_ecare.ui.create_account

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.zuritraining.pjt_14_ecare.databinding.FragmentCreateAccountPage2Binding

/**
 * @author Jeffrey Orazulike [chukwudumebiorazulike@gmail.com]
 * Created 26-Jun-21 at 8:00 PM
 */
class CreateAccountPage2: Fragment() {

    private lateinit var binding: FragmentCreateAccountPage2Binding
    private lateinit var viewModel: CreateAccountViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewModel = ViewModelProvider(this).get(CreateAccountViewModel::class.java)
        binding = FragmentCreateAccountPage2Binding.inflate(inflater)
        return binding.root
    }
}