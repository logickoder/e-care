package com.zuritraining.pjt_14_ecare.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zuritraining.pjt_14_ecare.R

class PersonalInformation : Fragment() {

    companion object {
        fun newInstance() = PersonalInformation()
    }

    private lateinit var viewModel: PersonalInformationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.personal_information_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PersonalInformationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}