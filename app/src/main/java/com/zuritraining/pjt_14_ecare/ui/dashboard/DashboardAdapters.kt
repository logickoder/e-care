package com.zuritraining.pjt_14_ecare.ui.dashboard

import android.util.Log
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
    class HealthService(override val items: List<DashboardData.Service>): Adapter<ItemDashboardServicesBinding>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
                ViewHolder(ItemDashboardServicesBinding.inflate(LayoutInflater.from(parent.context), parent, false))

        override fun onBindViewHolder(holder: ViewHolder<ItemDashboardServicesBinding>, position: Int) {
            holder.binding.apply {
                val item = items[holder.adapterPosition]
                textService.text = item.name
                imageService.setImageResource(item.image)
                Log.e("helo", "onBindViewHolder: ${item.image}", )
            }
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