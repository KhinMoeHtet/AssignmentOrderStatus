package com.example.orderstatus.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.orderstatus.R
import com.example.orderstatus.model.Utilities
import kotlinx.android.synthetic.main.item_utilities.view.*

class UtilitiesAdapter(var utilitiesList: ArrayList<Utilities>) :
    RecyclerView.Adapter<UtilitiesAdapter.UtilitiesViewHolder>(){

    class UtilitiesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(utilities: Utilities) {
            itemView.txtUtilities.text = utilities.name
            itemView.imgUtilities.setImageResource(utilities.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UtilitiesViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_utilities, parent, false)
        return UtilitiesViewHolder(view)
    }

    override fun getItemCount(): Int = utilitiesList.size

    override fun onBindViewHolder(holder: UtilitiesViewHolder, position: Int) {

        holder.bind(utilitiesList[position])

    }


}