package com.zuritraining.pjt_14_ecare.ui.patient

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.zuritraining.pjt_14_ecare.R
import com.zuritraining.pjt_14_ecare.databinding.FragmentProfileBinding
import com.zuritraining.pjt_14_ecare.ui.patient.PatientData.*

/**
 * @author Jeffrey Orazulike [chukwudumebiorazulike@gmail.com]
 * Created 30-Jun-21 at 3:13 PM
 */
class ProfileFragment: Fragment(){
    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        requireActivity().resources.apply {
            val titles = getStringArray(R.array.profile_entries)
            val subTitles = getStringArray(R.array.profile_entries_subtitle)
            val navigations = obtainTypedArray(R.array.profile_values)
            val sections = mutableListOf<Section>()

            for((index, title) in titles.withIndex()){
                sections.add(Section(title,
                        subTitles[index], navigations.getResourceId(index, 0)))
            }
            navigations.recycle()
            binding.recyclerviewProfileSections.adapter = PatientAdapter.PatientProfileAdapter(sections, this@ProfileFragment)
            binding.recyclerviewProfileSections.layoutManager = LinearLayoutManager(requireContext())
        }
        return binding.root
    }
}