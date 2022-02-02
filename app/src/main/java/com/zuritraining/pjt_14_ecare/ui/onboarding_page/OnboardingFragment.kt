package com.zuritraining.pjt_14_ecare.ui.onboarding_page

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.zuritraining.pjt_14_ecare.R
import com.zuritraining.pjt_14_ecare.databinding.FragmentOnboardingPageBinding
import kotlin.math.abs
import kotlin.math.max

/**
 * @author Jeffrey Orazulike [chukwudumebiorazulike@gmail.com]
 * Created 22-Jun-21 at 1:37 PM
 *
 * The fragment for the onboarding screen, it contains the view pager
 * that transitions between the two onboarding screen
 */
class OnboardingFragment  : Fragment() {
    private lateinit var binding: FragmentOnboardingPageBinding
    private lateinit var pages: Array<Fragment>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnboardingPageBinding.inflate(inflater)
        pages = arrayOf(Page1(), Page2())
        // creates a new view pager adapter with the pages the viewpager will show
        // and assigns the adapter to the viewpager
        binding.viewPagerOnboarding.adapter = OnboardingAdapter(childFragmentManager,
            lifecycle, pages)
        binding.viewPagerOnboarding.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        binding.viewPagerOnboarding.setPageTransformer(ZoomPageTransformer())
        binding.viewPagerOnboarding.registerOnPageChangeCallback(
                object : ViewPager2.OnPageChangeCallback() {
                    override fun onPageSelected(position: Int) {
                        binding.progressbar.apply {
                            // increase the progress to indicate the current page the
                            // user is looking at
                            progress = (((position + 1).toDouble() / pages.size) * max).toInt()

                            // rotate the progress bar if this is the last page
                            if (position == pages.size - 1) {
                                progress /= pages.size
                                rotation = 180f
                            } else if (position == 0) rotation = 0f
                        }
                    }
                }
        )

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        // hide the bottom navigation view and toolbar to mimic the effect of a
        // full screen and also disable opening the left navigation view
        requireActivity().apply {
            this.findViewById<View>(R.id.toolbar).visibility = View.GONE
            this.findViewById<BottomNavigationView>(R.id.bottom_nav_view)
                    .visibility = View.GONE
            this.findViewById<DrawerLayout>(R.id.drawer_layout)
                    .setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
        }
    }

    inner class ZoomPageTransformer: ViewPager2.PageTransformer{
        private val MIN_SCALE = 0.85f
        private val MIN_ALPHA = 0.5f

        override fun transformPage(page: View, position: Float) {
            page.apply {
                val pageWidth = width
                val pageHeight = height

                when{
                    position < -1 -> { // [-Infinity, -1]
                        // This page is way off-screen to the left.
                        alpha = 0f
                    }
                    position <= 1 -> { // [-1,1]
                        // Modify the default slide transition to shrink the page as well
                        val scaleFactor = max(MIN_SCALE, 1 - abs(position))
                        val vertMargin = pageHeight * (1 - scaleFactor) / 2
                        val horzMargin = pageWidth * (1 - scaleFactor) / 2
                        translationX = if(position < 0)
                            horzMargin - vertMargin / 2  else horzMargin + vertMargin / 2

                        // Scale the page down (between MIN_SCALE and 1)
                        scaleX = scaleFactor
                        scaleY = scaleFactor

                        // Fade the page relative to its size
                        alpha = (MIN_ALPHA +
                                ((scaleFactor - MIN_SCALE) / (1 - MIN_SCALE) * (1 - MIN_ALPHA)))
                    }
                    else -> { // [1, +Infinity]
                        // This page is way of screen to the right
                        alpha = 0f
                    }
                }
            }
        }

    }
}