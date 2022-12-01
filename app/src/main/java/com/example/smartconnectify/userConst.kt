package com.example.smartconnectify

object userConst {
    var thisUser : user? = null

    fun getUsers() : ArrayList<user> {
        val usersArray: ArrayList<user> = ArrayList<user>()

        val user1 = user(
            "Anirudh Parida",
            "anirudhparida08@gmail.com",
            "+91-8917627210",
            "08-05-2003",
            R.drawable.anirudh
        )
        usersArray.add(user1)

        val user2 = user(
            "Swoyam Siddharth",
            "swoyamsid@gmail.com",
            "+91-7608086659",
            "03-12-2002",
            R.drawable.userswoyam
        )
        usersArray.add(user2)

        val user3 = user(
            "Prince",
            "princepious2003@gmail.com",
            "+91-9827117988",
            "24-04-2003",
            R.drawable.prince
        )
        usersArray.add(user3)

        return usersArray
    }
}