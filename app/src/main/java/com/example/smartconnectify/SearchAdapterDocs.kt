package com.example.smartconnectify

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SearchAdapterDocs (
    private val DocsList: ArrayList<doctors>
    ) : RecyclerView.Adapter<SearchAdapterDocs.SearchViewHolder>() {

        class SearchViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val titleTextView: TextView = itemView.findViewById(R.id.search_title_text_view)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
            return SearchViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_search, parent, false))
        }

        override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
            val docs: doctors = DocsList[position]
            holder.titleTextView.text = docs.name
        }

        override fun getItemCount() = DocsList.size
}