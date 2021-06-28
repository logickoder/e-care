package com.zuritraining.pjt_14_ecare.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.zuritraining.pjt_14_ecare.R
import com.zuritraining.pjt_14_ecare.databinding.FragmentDashboardBinding

/**
 * @author Jeffrey Orazulike [chukwudumebiorazulike@gmail.com]
 * Created 27-Jun-21 at 7:26 AM
 */
class DashboardFragment: Fragment() {
    private lateinit var binding: FragmentDashboardBinding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        binding = FragmentDashboardBinding.inflate(inflater, container, false)
        binding.recyclerviewArticles.adapter = DashboardAdapters.HealthArticle
        binding.recyclerviewArticles.layoutManager = LinearLayoutManager(
                requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.showcasePatient.visibility = View.GONE
        binding.recyclerviewServices.adapter = DashboardAdapters.HealthService
        binding.recyclerviewServices.layoutManager = GridLayoutManager(
                requireContext(), 3)

        requireActivity().apply {
            findViewById<View>(R.id.toolbar).visibility = View.VISIBLE
            findViewById<BottomNavigationView>(R.id.bottom_nav_view).visibility = View.VISIBLE
            findViewById<DrawerLayout>(R.id.drawer_layout)
                    .setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
        }
        return binding.root
    }
}