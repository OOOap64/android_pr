package com.example.reg1
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteOpenHelper
import android.database.sqlite.SQLiteDatabase

class DbHelper (val context:Context, val factory : SQLiteDatabase.CursorFactory?) :
    SQLiteOpenHelper(context, "data_base", factory, 1 ){
    override fun onCreate(db: SQLiteDatabase?) {
        val query = "CREATE TABLE users (id INT PRIMARY KEY, email TEXT, login TEXT, pass TEXT)  "
        db!!.execSQL(query)
    }

    override fun onUpgrade(
        db: SQLiteDatabase?,
        p1: Int,
        p2: Int
    ) {
        db!!.execSQL("DROP TABLE IF EXISTS users ")
        onCreate(db)
    }
    fun addUser(user : User){
        val values= ContentValues()
        values.put("Login", user.lg)
        values.put("Login", user.em)
        values.put("Login", user.pw)
        val db=this.writableDatabase
        db.insert("users", null, values)
        db.close()


    }

}