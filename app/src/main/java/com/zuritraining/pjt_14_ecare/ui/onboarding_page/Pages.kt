package com.zuritraining.pjt_14_ecare.ui.onboarding_page

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.zuritraining.pjt_14_ecare.R
import com.zuritraining.pjt_14_ecare.databinding.PartialOnboardingPage2Binding

/**
 * @author Jeffrey Orazulike [chukwudumebiorazulike@gmail.com]
 * Created 22-Jun-21 at 2:00 PM
 */
class Page1: Fragment(R.layout.partial_onboarding_page_1)
class Page2  : Fragment() {
    private lateinit var binding: PartialOnboardingPage2Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = PartialOnboardingPage2Binding.inflate(inflater)

        binding.buttonGetStarted.setOnClickListener {
            requireView().findNavController().navigate(R.id.action_navigation_onboarding_to_navigation_login)
        }

        return binding.root
    }
}