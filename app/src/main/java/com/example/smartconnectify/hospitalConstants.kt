package com.example.smartconnectify

object hospitalConstants {

    var thisUser : hospital? = null

    fun getUsers() : ArrayList<hospital>{
        val hospitalsArray : ArrayList<hospital> = ArrayList<hospital>()

        val hospital1 = hospital(
            "Apollo Hospital",
            "Sainik School Rd, Unit 15, Gajapati Nagar, Bhubaneswar, Odisha 751005",
            "Private"
        )
        hospitalsArray.add(hospital1)

        val hospital2 = hospital(
            "SUM Hospital",
            "Kalinga Nagar, Kalinganagar, Bhubaneswar, Odisha 751003",
            "Private"
        )
        hospitalsArray.add(hospital2)

        val hospital3 = hospital(
            "AMRI Hospital",
            "Plot No. 1, Near Jayadev Vatika Park, Khandagiri, Bhubaneswar, Odisha 751019",
            "Private"
        )
        hospitalsArray.add(hospital3)

        val hospital4 = hospital(
            "UPHC Ghatikia",
            "Infront of Jaydevbatika, Khandagiri, Bhubaneswar, Odisha 751030",
            "Govt"
        )
        hospitalsArray.add(hospital4)

        val hospital5 = hospital(
            "Regional Govt. Hospital",
            "Unit 8, Gopabandhu Nagar, Bhubaneswar, Odisha 751008",
            "Govt"
        )
        hospitalsArray.add(hospital5)

        val hospital6 = hospital(
            "SCB Medical",
            "Behera Colony, Mangalabag, Cuttack, Odisha 753001",
            "Govt"
        )
        hospitalsArray.add(hospital6)

        return hospitalsArray
    }
}