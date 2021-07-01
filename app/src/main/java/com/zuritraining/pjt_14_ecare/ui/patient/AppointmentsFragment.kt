package com.zuritraining.pjt_14_ecare.ui.patient

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.tabs.TabLayout
import com.zuritraining.pjt_14_ecare.databinding.FragmentAppointmentsBinding

/**
 * @author Jeffrey Orazulike [chukwudumebiorazulike@gmail.com]
 * Created 24-Jun-21 at 9:57 PM
 */
class AppointmentsFragment : Fragment(){
    private lateinit var binding: FragmentAppointmentsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAppointmentsBinding.inflate(inflater, container, false)
        binding.recyclerviewAppointments.adapter = AppointmentAdapters.UpcomingAdapter
        binding.recyclerviewAppointments.layoutManager = LinearLayoutManager(requireContext())
        binding.tabsAppointments.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.let {
                    when(it.position){
                        0 -> binding.recyclerviewAppointments.adapter =
                            AppointmentAdapters.UpcomingAdapter
                        1 -> binding.recyclerviewAppointments.adapter =
                            AppointmentAdapters.HistoryAdapter
                    }
                    binding.recyclerviewAppointments.adapter?.notifyDataSetChanged()
                }
            }
            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })
        return binding.root
    }
}