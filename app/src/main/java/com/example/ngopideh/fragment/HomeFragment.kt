package com.example.ngopideh.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.ngopideh.R
import com.example.ngopideh.adapter.AdapterProduk
import com.example.ngopideh.adapter.AdapterSlider
import com.example.ngopideh.model.Produk

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {

    lateinit var vpSlider : ViewPager
    lateinit var rvProduk: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view : View = inflater.inflate(R.layout.fragment_home, container, false)

        vpSlider = view.findViewById(R.id.vp_slider)
        rvProduk = view.findViewById(R.id.rv_produk)

        val arraySlider = ArrayList<Int>()
        arraySlider.add(R.drawable.slider1)
        arraySlider.add(R.drawable.slider2)
        arraySlider.add(R.drawable.slider3)

        val adapterSlider = AdapterSlider(arraySlider, activity)
        vpSlider.adapter = adapterSlider

        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        rvProduk.adapter = AdapterProduk(arrProduk)
        rvProduk.layoutManager = layoutManager

        return view
    }

    val arrProduk: ArrayList<Produk>get () {
        val arr = ArrayList<Produk>()
        val p1 = Produk()
        p1.nama = "Vanilla Iced Coffee"
        p1.harga = "Rp. 23.0000,-"
        p1.gambar = R.drawable.vanilla

        val p2 = Produk()
        p2.nama = "Avocado Iced Coffee"
        p2.harga = "Rp. 24.0000,-"
        p2.gambar = R.drawable.avocado

        val p3 = Produk()
        p3.nama = "Frothy Cold Coffee"
        p3.harga = "Rp. 27.0000,-"
        p3.gambar = R.drawable.frothy

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)

        return arr
    }
}