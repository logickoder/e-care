package com.zuritraining.pjt_14_ecare.ui.departments

import android.view.LayoutInflater
import android.view.ViewGroup
import com.zuritraining.pjt_14_ecare.databinding.ItemDepartmentBinding
import com.zuritraining.pjt_14_ecare.ui.misc.Adapter

/**
 * @author Jeffrey Orazulike [chukwudumebiorazulike@gmail.com]
 * Created 27-Jun-21 at 6:21 AM
 */
class DepartmentsAdapters {
    class Department(override val items: List<DepartmentData.Section>): Adapter<ItemDepartmentBinding>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(ItemDepartmentBinding.inflate(LayoutInflater.from(parent.context), parent, false))

        override fun onBindViewHolder(holder: ViewHolder<ItemDepartmentBinding>, position: Int) {
            holder.binding.apply {
                val item = items[holder.adapterPosition]
                textDepartmentName.text = item.name
                imageDepartment.setImageResource(item.image)
            }
        }
    }
}