//package com.example.composeapp.roomdb
//
//import androidx.lifecycle.LiveData
//import androidx.room.Dao
//import androidx.room.Insert
//import androidx.room.Query
//import androidx.room.Update
//
//@Dao
//interface UserDAO {
//    @Query("select * from users")
//    fun getUsers():LiveData<List<User>>
//
//    @Insert
//    fun addUser(user: User)
//
//    @Update
//    fun updateUsers(user: User)
//
//    @Query("DELETE FROM users WHERE userName = :name")
//    fun deleteUser(name: String)
//
//    @Query("select userName from users")
//    fun getUserName(name: String)
//}