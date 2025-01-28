//package com.example.composeapp.roomdb
//
//import androidx.room.ColumnInfo
//import androidx.room.Entity
//import androidx.room.PrimaryKey
//import javax.annotation.Nonnull
//
//@Entity(tableName = "users")
//class User{
//    @PrimaryKey(autoGenerate = true)
//    @Nonnull
//    @ColumnInfo(name = "userID")
//    var id: Int = 0
//    @ColumnInfo(name = "userName")
//    private var name: String? = null
//    @ColumnInfo(name = "userAge")
//    private var age: Int? = null
//
//    constructor() {}
//    constructor(id: Int, name: String, age: Int){
//        this.id = id
//        this.name = name
//        this.age = age
//    }
//}
