package com.zuritraining.pjt_14_ecare.ui.departments

import android.view.LayoutInflater
import android.view.ViewGroup
import com.zuritraining.pjt_14_ecare.databinding.ItemDepartmentBinding
import com.zuritraining.pjt_14_ecare.ui.misc.Adapter

/**
 * @author Jeffrey Orazulike [chukwudumebiorazulike@gmail.com]
 * Created 27-Jun-21 at 6:21 AM
 */
object Department: Adapter<ItemDepartmentBinding>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(ItemDepartmentBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: ViewHolder<ItemDepartmentBinding>, position: Int) {
        //TODO Implement later
    }
}