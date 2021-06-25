package com.zuritraining.pjt_14_ecare.ui.misc

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

/**
 * @author Jeffrey Orazulike [chukwudumebiorazulike@gmail.com]
 * Created 24-Jun-21 at 9:57 PM
 * TODO: Add arrays and stuff for this class
 */
abstract class Adapter<T>(): RecyclerView.Adapter<Adapter<T>.ViewHolder<T>>() {

    override fun getItemCount(): Int = 6

    inner class ViewHolder<T>(val binding: T): RecyclerView.ViewHolder((binding as ViewBinding).root)
}