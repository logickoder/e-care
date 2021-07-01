package com.zuritraining.pjt_14_ecare.ui.patient

import android.view.LayoutInflater
import android.view.ViewGroup
import com.zuritraining.pjt_14_ecare.databinding.ItemAppointmentsHistoryBinding
import com.zuritraining.pjt_14_ecare.databinding.ItemAppointmentsUpcomingBinding
import com.zuritraining.pjt_14_ecare.ui.misc.Adapter
import java.util.*

/**
 * @author Jeffrey Orazulike [chukwudumebiorazulike@gmail.com]
 * Created 25-Jun-21 at 3:24 PM
 */
class AppointmentAdapters {
    object UpcomingAdapter: Adapter<ItemAppointmentsUpcomingBinding>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(ItemAppointmentsUpcomingBinding.inflate(
                LayoutInflater.from(parent.context),parent,false))


        override fun onBindViewHolder(holder: ViewHolder<ItemAppointmentsUpcomingBinding>, position: Int) {
            holder.binding.apply {
                val date = Date()
                textUpcomingAppointmentDate.text = "${date.day}/${date.month}/${date.year}"
                textUpcomingAppointmentTime.text = "${date.hours}:${date.minutes} ${date.time}"
            }
        }
    }

    object HistoryAdapter: Adapter<ItemAppointmentsHistoryBinding>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(ItemAppointmentsHistoryBinding.inflate(
                LayoutInflater.from(parent.context),parent,false))

        override fun onBindViewHolder(holder: ViewHolder<ItemAppointmentsHistoryBinding>, position: Int) {
            holder.binding.apply {
                val date = Date()
                textUpcomingAppointmentDate.text = "${date.day}/${date.month}/${date.year}"
                textUpcomingAppointmentTime.text = "${date.hours}:${date.minutes} ${date.time}"
            }
        }
    }
}