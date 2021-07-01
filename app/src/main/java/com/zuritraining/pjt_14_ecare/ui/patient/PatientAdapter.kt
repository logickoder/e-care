package com.zuritraining.pjt_14_ecare.ui.patient

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.zuritraining.pjt_14_ecare.databinding.ItemProfileOptionsBinding
import com.zuritraining.pjt_14_ecare.ui.misc.Adapter

/**
 * @author Jeffrey Orazulike [chukwudumebiorazulike@gmail.com]
 * Created 30-Jun-21 at 3:15 PM
 */
class PatientAdapter {

    class PatientProfileAdapter(override val items: List<PatientData.Section>,
                                private val fragment: Fragment):
            Adapter<ItemProfileOptionsBinding>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(ItemProfileOptionsBinding.inflate(
                LayoutInflater.from(parent.context),parent,false))

        override fun onBindViewHolder(holder: ViewHolder<ItemProfileOptionsBinding>, position: Int) {
            holder.binding.apply {
                val item = items[holder.adapterPosition]
                textSectionTitle.text = item.title
                textSectionDescription.text = item.subTitle
                root.setOnClickListener { _ ->
                    fragment.requireView().findNavController().apply {
                        if(item.navigation != 0 &&
                                !popBackStack(item.navigation, false)){
                            navigate(item.navigation)
                        }
                    }
                }
            }
        }
    }

}