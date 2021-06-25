package com.zuritraining.pjt_14_ecare.ui.patient.appointments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.zuritraining.pjt_14_ecare.databinding.ItemAppointmentsHistoryBinding
import com.zuritraining.pjt_14_ecare.databinding.ItemAppointmentsUpcomingBinding

/**
 * @author Jeffrey Orazulike [chukwudumebiorazulike@gmail.com]
 * Created 24-Jun-21 at 9:57 PM
 * TODO: Add arrays and stuff for this class
 */
abstract class AppointmentsAdapter<T>(): RecyclerView.Adapter<AppointmentsAdapter<T>.ViewHolder<T>>() {

    override fun getItemCount(): Int = 3

    inner class ViewHolder<T>(val binding: T): RecyclerView.ViewHolder((binding as ViewBinding).root)

    class UpcomingAppointmentsAdapter: AppointmentsAdapter<ItemAppointmentsUpcomingBinding>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
                ViewHolder(ItemAppointmentsUpcomingBinding.inflate(
                        LayoutInflater.from(parent.context),parent,false))


        override fun onBindViewHolder(holder: ViewHolder<ItemAppointmentsUpcomingBinding>, position: Int) {
            //TODO: Implementation later
        }
    }

    class HistoryAppointmentsAdapter: AppointmentsAdapter<ItemAppointmentsHistoryBinding>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
                ViewHolder(ItemAppointmentsHistoryBinding.inflate(
                        LayoutInflater.from(parent.context),parent,false))

        override fun onBindViewHolder(holder: ViewHolder<ItemAppointmentsHistoryBinding>, position: Int) {
            //TODO: Implementation later
        }
    }
}