package com.zuritraining.pjt_14_ecare.ui

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.zuritraining.pjt_14_ecare.R
import com.zuritraining.pjt_14_ecare.databinding.ActivityMainBinding
import com.zuritraining.pjt_14_ecare.databinding.AppBarMainBinding
import com.zuritraining.pjt_14_ecare.databinding.ContentMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
    private lateinit var appBarBinding: AppBarMainBinding
    private lateinit var mainContentBinding: ContentMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        // loads back the main theme
        setTheme(R.style.Theme_ECare_NoActionBar)
        super.onCreate(savedInstanceState)

        initializeDisplayContent()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }


    override fun onSupportNavigateUp() =
            navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()

    private fun initializeDisplayContent(){
        binding = ActivityMainBinding.inflate(layoutInflater)

        appBarBinding = binding.appBar
        mainContentBinding = appBarBinding.contentMain

        setContentView(binding.root)
        setSupportActionBar(appBarBinding.toolbar)

        navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_dashboard,
                R.id.navigation_appointments,
                R.id.navigation_login,
                R.id.navigation_departments,
                R.id.navigation_doctors
        ), binding.drawerLayout)
        setupActionBarWithNavController(navController, appBarConfiguration)
        binding.navView.setupWithNavController(navController)
        mainContentBinding.bottomNavView.setupWithNavController(navController)
    }
}