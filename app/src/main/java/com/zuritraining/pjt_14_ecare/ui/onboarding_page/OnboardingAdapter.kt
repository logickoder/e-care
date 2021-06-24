package com.zuritraining.pjt_14_ecare.ui.onboarding_page

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 * @author Jeffrey Orazulike [chukwudumebiorazulike@gmail.com]
 * Created 22-Jun-21 at 1:38 PM
 */
class OnboardingAdapter(
    private val fragmentManager: FragmentManager,
    private val lifecycle: Lifecycle,
    private val layouts: Array<Fragment>):
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount() = layouts.size

    override fun createFragment(position: Int) = layouts[position]
}