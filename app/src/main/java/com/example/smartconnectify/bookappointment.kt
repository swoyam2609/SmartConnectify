package com.example.smartconnectify

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.widget.doOnTextChanged
import androidx.recyclerview.widget.RecyclerView
import com.example.smartconnectify.doctorsConstants.getdocs
import java.util.*
import kotlin.collections.ArrayList

class bookappointment : AppCompatActivity() {
    private lateinit var editText: AppCompatEditText
    private lateinit var recyclerView: RecyclerView
    private lateinit var noSearchResultsFoundText: TextView
    private val docsList: ArrayList<doctors> = getdocs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        recyclerView = findViewById(R.id.search_list)
        noSearchResultsFoundText = findViewById(R.id.no_search_results_found_text)

        attachAdapter(docsList)

        editText = findViewById(R.id.search_edit_text)
        editText.doOnTextChanged { text, _, _, _ ->
            val query = text.toString().toLowerCase(Locale.getDefault())
            filterWithQuery(query)
        }
        
        toggleRecyclerView(docsList)
    }

    private fun attachAdapter(list: ArrayList<doctors>) {
        val searchAdapter = SearchAdapterDocs(list)
        recyclerView.adapter = searchAdapter
    }

    private fun toggleRecyclerView(sportsList: ArrayList<doctors>) {
        if (sportsList.isEmpty()) {
            recyclerView.visibility = View.INVISIBLE
            noSearchResultsFoundText.visibility = View.VISIBLE
        } else {
            recyclerView.visibility = View.VISIBLE
            noSearchResultsFoundText.visibility = View.INVISIBLE
        }
    }

    private fun onQueryChanged(filterQuery: String): ArrayList<doctors> {
        // Empty new array list which contains new strings
        val filteredList = kotlin.collections.ArrayList<doctors>()
        // Loop through each item in list
        for (currentSport in docsList) {
            // Before checking string matching convert string to lower case.
            if (currentSport.name.toLowerCase(Locale.getDefault()).contains(filterQuery)) {
                // If the match is success, add item to list.
                filteredList.add(currentSport)
            }
        }
        return filteredList
    }

    private fun filterWithQuery(query: String) {
        // Perform operation only is query is not empty
        if (query.isNotEmpty()) {
            // Call the function with valid query and take new filtered list.
            val filteredList: ArrayList<doctors> = onQueryChanged(query)
            // Call the adapter with new filtered array list
            attachAdapter(filteredList)
            // If the matches are empty hide RecyclerView and show error text
            toggleRecyclerView(filteredList)
        } else if (query.isEmpty()) {
            // If query is empty don't make changes to list
            attachAdapter(docsList)
        }
    }
}
