package com.example.ngopideh.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ngopideh.R
import com.example.ngopideh.helper.SharedPref
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    lateinit var s:SharedPref

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        s = SharedPref(this)

        btn_prosesLogin.setOnClickListener{
            s.setStausLogin(true)
        }
    }
}