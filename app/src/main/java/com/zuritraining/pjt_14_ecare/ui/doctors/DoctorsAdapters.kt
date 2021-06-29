package com.zuritraining.pjt_14_ecare.ui.doctors

import android.view.LayoutInflater
import android.view.ViewGroup
import com.zuritraining.pjt_14_ecare.databinding.ItemDoctorBinding
import com.zuritraining.pjt_14_ecare.ui.misc.Adapter

/**
 * @author Jeffrey Orazulike [chukwudumebiorazulike@gmail.com]
 * Created 27-Jun-21 at 1:49 PM
 */
class DoctorsAdapters {
    object Doctor: Adapter<ItemDoctorBinding>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
                ViewHolder(ItemDoctorBinding.inflate(LayoutInflater.from(parent.context), parent, false))

        override fun onBindViewHolder(holder: ViewHolder<ItemDoctorBinding>, position: Int) {
            //TODO Implement later
        }
    }
}