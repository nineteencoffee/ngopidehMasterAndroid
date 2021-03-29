package com.example.ngopideh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.ngopideh.fragment.AkunFragment
import com.example.ngopideh.fragment.HomeFragment
import com.example.ngopideh.fragment.KeranjangFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private val fargmentHome: Fragment = HomeFragment()
    private val fargmnetKeranjang: Fragment = KeranjangFragment()
    private val fargmentAkun: Fragment = AkunFragment()
    private val fm: FragmentManager = supportFragmentManager
    //halaman mana yang aktif default
    private var activity: Fragment = fargmentHome

    private lateinit var menu : Menu
    private lateinit var menuItem : MenuItem
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpBottomNav()
    }
    fun setUpBottomNav(){
        fm.beginTransaction().add(R.id.container, fargmentHome). show(fargmentHome).commit()
        fm.beginTransaction().add(R.id.container, fargmnetKeranjang). hide(fargmnetKeranjang).commit()
        fm.beginTransaction().add(R.id.container, fargmentAkun). hide(fargmentAkun).commit()


        bottomNavigationView = findViewById(R.id.nav_view) //bentuk inisialisasi
        menu = bottomNavigationView.menu //deklarasi menu sebagai bottom
        menuItem = menu.getItem(0)
        menuItem.isChecked = true

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->

            when(item.itemId){
                R.id.navigation_home ->{
                    callFargment(0, fargmentHome)
                }
                R.id.navigation_keranjang ->{
                    callFargment(1, fargmnetKeranjang)
                }
                R.id.navigation_akun ->{
                    callFargment(2, fargmentAkun)
                }
            }

            false
        }
    }

    fun callFargment(int: Int, fragment: Fragment){
        menuItem = menu.getItem(int)
        menuItem.isChecked = true
        fm.beginTransaction().hide(activity).show(fragment).commit()
        activity = fragment
    }
}