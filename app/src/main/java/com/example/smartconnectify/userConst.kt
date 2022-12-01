package com.example.smartconnectify

object userConst {
    var thisUser : user? = null

    fun getUsers() : ArrayList<user>{
        val usersArray : ArrayList<user> = ArrayList<user>()

        val user1 = user(
            "Anirudh",
            "anirudhparida08@gmail.com",
            8917627210,
            "08-05-2003"
        )
        usersArray.add(user1)

        val user2 = user(
            "Swoyam",
            "swoyamsid@gmail.com",
            7608086659,
            "03-12-2002"
        )
        usersArray.add(user2)

        val user3 = user(
            "Prince",
            "princepious2003@gmail.com",
            9827117988,
            "24-04-2003"
        )
        usersArray.add(user3)
        
}