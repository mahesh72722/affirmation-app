package com.example.affirmationapp.adapter

import android.content.ClipData
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmationapp.R
import com.example.affirmationapp.model.Affirmation

class ItemAdapter(private val context: Context, val dataset: List<Affirmation>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
// Adapter for the [RecyclerView] in [Main Activity]. Displays Affirmation data object.

    class ItemViewHolder(private  val view: View):RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView =  view.findViewById(R.id.item_image)
    }

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // getting the single xml object in code and return the view on Item view holder
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    // called by layout manager to replace the contents of a list item view
    // Replace content of a view
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }



    // getItemCount needs to return the size of your data set property you are passing in item Adapter
    // Return size of the data set
    override fun getItemCount() = dataset.size



}