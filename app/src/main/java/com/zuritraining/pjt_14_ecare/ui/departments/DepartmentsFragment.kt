package com.zuritraining.pjt_14_ecare.ui.departments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.zuritraining.pjt_14_ecare.databinding.FragmentWithSearchAndRecyclerBinding

/**
 * @author Jeffrey Orazulike [chukwudumebiorazulike@gmail.com]
 * Created 27-Jun-21 at 6:19 AM
 */
class DepartmentsFragment: Fragment() {
    private lateinit var binding: FragmentWithSearchAndRecyclerBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentWithSearchAndRecyclerBinding.inflate(inflater, container, false)
        binding.includeRecyclerview.root.apply {
            adapter = Department
            layoutManager = LinearLayoutManager(requireContext())
        }
        return binding.root
    }
}