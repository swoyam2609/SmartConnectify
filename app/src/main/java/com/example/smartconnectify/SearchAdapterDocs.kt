package com.example.smartconnectify

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SearchAdapterDocs (
    private val DocsList: ArrayList<doctors>
    ) : RecyclerView.Adapter<SearchAdapterDocs.SearchViewHolder>() {

        class SearchViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val doctor_image: ImageView = itemView.findViewById(R.id.iv_doc)
            val doctor_name:TextView = itemView.findViewById(R.id.doc_name)
            val doctor_special:TextView = itemView.findViewById(R.id.doc_special)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
            return SearchViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_search, parent, false))
        }

        override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
            val docs: doctors = DocsList[position]
            holder.doctor_name.text = docs.name
            holder.doctor_special.text = docs.speciality
            holder.doctor_image.setImageResource(docs.img)
        }

        override fun getItemCount() = DocsList.size
}