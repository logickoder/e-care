package com.zuritraining.pjt_14_ecare.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.zuritraining.pjt_14_ecare.databinding.ContentHomeDoctorBinding

/**
 * @author Jeffrey Orazulike [chukwudumebiorazulike@gmail.com]
 * Created 25-Jun-21 at 3:45 PM
 */
class DoctorHome: Fragment(){
    private lateinit var binding: ContentHomeDoctorBinding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        binding = ContentHomeDoctorBinding.inflate(inflater, container, false)
        binding.recyclerviewArticles.adapter = HealthArticle
        binding.recyclerviewArticles.layoutManager = LinearLayoutManager(
                requireContext(), LinearLayoutManager.HORIZONTAL, false)

        binding.recyclerviewServices.adapter = HealthService
        binding.recyclerviewServices.layoutManager = GridLayoutManager(
                requireContext(), 3)
        return binding.root
    }
}