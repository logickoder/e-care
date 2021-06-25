package com.zuritraining.pjt_14_ecare.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import com.zuritraining.pjt_14_ecare.databinding.ItemHealthArticleBinding
import com.zuritraining.pjt_14_ecare.databinding.ItemServicesBinding
import com.zuritraining.pjt_14_ecare.ui.misc.Adapter

/**
 * @author Jeffrey Orazulike [chukwudumebiorazulike@gmail.com]
 * Created 25-Jun-21 at 3:20 PM
 */
object HealthService: Adapter<ItemServicesBinding>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(ItemServicesBinding.inflate(
                    LayoutInflater.from(parent.context),parent,false))

    override fun onBindViewHolder(holder: ViewHolder<ItemServicesBinding>, position: Int) {
        //TODO Implement later
    }
}

object HealthArticle: Adapter<ItemHealthArticleBinding>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(ItemHealthArticleBinding.inflate(
                    LayoutInflater.from(parent.context),parent,false))

    override fun onBindViewHolder(holder: ViewHolder<ItemHealthArticleBinding>, position: Int) {
        //TODO Implement later
    }
}