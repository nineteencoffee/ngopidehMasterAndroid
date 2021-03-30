package com.example.ngopideh.helper

import android.content.Context
import android.content.SharedPreferences
import com.example.ngopideh.MainActivity

class SharedPref(activity: MainActivity) {

    val login = "login"

    val mypref = "MAIN.PRF"
    val sp:SharedPreferences

    init {
        sp = activity.getSharedPreferences(mypref, Context.MODE_PRIVATE)
    }

    fun setStausLogin(status:Boolean){
        sp.edit().putBoolean(login, status).apply()
    }

    fun getStatusLogin():Boolean{
        return sp.getBoolean(login, false)
    }

}