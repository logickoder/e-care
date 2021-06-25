package com.zuritraining.pjt_14_ecare.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.zuritraining.pjt_14_ecare.R
import com.zuritraining.pjt_14_ecare.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        // resets everything back to normal
        requireActivity().apply {
            this.findViewById<View>(R.id.toolbar).visibility = View.VISIBLE
            this.findViewById<BottomNavigationView>(R.id.bottom_nav_view)
                    .visibility = View.VISIBLE
            this.findViewById<DrawerLayout>(R.id.drawer_layout)
                    .setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
        }
        childFragmentManager.beginTransaction().replace(R.id.fragment_home, DoctorHome()).commit()
        return binding.root
    }
}