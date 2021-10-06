package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmations

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmations>

    ): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    inner class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val title: TextView = itemView.findViewById(R.id.tvTitle)
        val image: ImageView = itemView.findViewById(R.id.ivImage)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view  = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val curAffirmation = dataset[position]
        holder.title.text = context.resources.getString(curAffirmation.stringResourceId)
        holder.image.setImageResource(curAffirmation.imageResourceId)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}