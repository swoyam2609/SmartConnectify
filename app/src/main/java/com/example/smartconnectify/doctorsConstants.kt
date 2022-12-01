package com.example.smartconnectify

object doctorsConstants {
    var thisdoc : doctors? = null
    fun getdocs() : ArrayList<doctors>{
        val docsArray : ArrayList<doctors> = ArrayList<doctors>()

        val docs1 = doctors(
            R.drawable.doc1,
            "Ayush Kumar",
            "Cardio"
        )
        docsArray.add(docs1)

        val docs2 = doctors(
            R.drawable.doc2,
            "Ashish Kumar",
            "Cardio"
        )
        docsArray.add(docs2)

        val docs3 = doctors(
            R.drawable.doc3,
            "Aman Tudu",
            "Cardio"
        )
        docsArray.add(docs3)

        val docs4 = doctors(
            R.drawable.doc4,
            "Abheek Dhal",
            "Dental"
        )
        docsArray.add(docs4)

        val docs5 = doctors(
            R.drawable.doc5,
            "Pravat Sahoo",
            "Dental"
        )
        docsArray.add(docs5)

        val docs6 = doctors(
            R.drawable.doc15,
            "Rosalin Sarangi",
            "Dental"
        )
        docsArray.add(docs6)

        val docs7 = doctors(
            R.drawable.doc14,
            "Garvisha Bansal",
            "Eye"
        )
        docsArray.add(docs7)

        val docs8 = doctors(
            R.drawable.doc8,
            "Ritwik Sandiliya",
            "Eye"
        )
        docsArray.add(docs8)

        val docs9 = doctors(
            R.drawable.doc9,
            "Sai Charan",
            "Eye"
        )
        docsArray.add(docs9)

        val docs10 = doctors(
            R.drawable.doc10,
            "Anirudh Das",
            "Neuro"
        )
        docsArray.add(docs10)

        val docs11 = doctors(
            R.drawable.doc13,
            "Rukshar Fatma",
            "Neuro"
        )
        docsArray.add(docs11)

        val docs12 = doctors(
            R.drawable.doc11,
            "Krish Tyagi",
            "Neuro"
        )
        docsArray.add(docs12)

        val docs13 = doctors(
            R.drawable.doc12,
            "Prithiviraj",
            "Child"
        )
        docsArray.add(docs13)

        val docs14 = doctors(
            R.drawable.doc6,
            "Kunal Kumar",
            "Child"
        )
        docsArray.add(docs14)

        val docs15 = doctors(
            R.drawable.doc7,
            "Aditya Panda",
            "Child"
        )
        docsArray.add(docs15)

        val docs16 = doctors(
            R.drawable.doc16,
            "Vivek Raj",
            "Skin"
        )
        docsArray.add(docs16)

        val docs17 = doctors(
            R.drawable.doc17,
            "Prince",
            "Skin"
        )
        docsArray.add(docs17)

        val docs18 = doctors(
            R.drawable.doc18,
            "Pratik Prakhar",
            "Skin"
        )
        docsArray.add(docs18)

        return docsArray
    }
}