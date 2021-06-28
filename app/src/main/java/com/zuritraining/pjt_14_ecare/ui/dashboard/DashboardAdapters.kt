package com.zuritraining.pjt_14_ecare.ui.dashboard

import android.view.LayoutInflater
import android.view.ViewGroup
import com.zuritraining.pjt_14_ecare.databinding.ItemDashboardHealthArticleBinding
import com.zuritraining.pjt_14_ecare.databinding.ItemDashboardServicesBinding
import com.zuritraining.pjt_14_ecare.ui.misc.Adapter

/**
 * @author Jeffrey Orazulike [chukwudumebiorazulike@gmail.com]
 * Created 27-Jun-21 at 6:21 AM
 */
class DashboardAdapters {
    object HealthService: Adapter<ItemDashboardServicesBinding>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
                ViewHolder(ItemDashboardServicesBinding.inflate(LayoutInflater.from(parent.context), parent, false))

        override fun onBindViewHolder(holder: ViewHolder<ItemDashboardServicesBinding>, position: Int) {
            //TODO Implement later
        }
    }
    object HealthArticle: Adapter<ItemDashboardHealthArticleBinding>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
                ViewHolder(ItemDashboardHealthArticleBinding.inflate(LayoutInflater.from(parent.context), parent, false))

        override fun onBindViewHolder(holder: ViewHolder<ItemDashboardHealthArticleBinding>, position: Int) {
            //TODO Implement later
        }
    }
}