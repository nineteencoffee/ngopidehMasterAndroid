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
    lateinit var rvHot: RecyclerView
    lateinit var rvBesides: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view : View = inflater.inflate(R.layout.fragment_home, container, false)

        vpSlider = view.findViewById(R.id.vp_slider)
        rvProduk = view.findViewById(R.id.rv_produk)
        rvHot = view.findViewById(R.id.rv_Hot)
        rvBesides = view.findViewById(R.id.rv_besides)


        val arraySlider = ArrayList<Int>()
        arraySlider.add(R.drawable.slider1)
        arraySlider.add(R.drawable.slider2)
        arraySlider.add(R.drawable.slider3)

        val adapterSlider = AdapterSlider(arraySlider, activity)
        vpSlider.adapter = adapterSlider

        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        val layoutManager2 = LinearLayoutManager(activity)
        layoutManager2.orientation = LinearLayoutManager.HORIZONTAL

        val layoutManager3 = LinearLayoutManager(activity)
        layoutManager3.orientation = LinearLayoutManager.HORIZONTAL

        rvProduk.adapter = AdapterProduk(arrProduk)
        rvProduk.layoutManager = layoutManager

        rvHot.adapter = AdapterProduk(arrHot)
        rvHot.layoutManager = layoutManager2

        rvBesides.adapter = AdapterProduk(arrBesides)
        rvBesides.layoutManager = layoutManager3

        return view
    }
    //ice coffee
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
        p3.harga = "Rp. 25.0000,-"
        p3.gambar = R.drawable.frothy

        val p4 = Produk()
        p4.nama = "Coffee Ice Cubes"
        p4.harga = "Rp. 29.0000,-"
        p4.gambar = R.drawable.cubes
        val p5 = Produk()
        p5.nama = "Easy Iced Coffee"
        p5.harga = "Rp. 23.0000,-"
        p5.gambar = R.drawable.icecofffee

        val p6 = Produk()
        p6.nama = "Double Coffee Iced"
        p6.harga = "Rp. 25.0000,-"
        p6.gambar = R.drawable.latte

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)
        arr.add(p4)
        arr.add(p5)
        arr.add(p6)

        return arr
    }

    //hot coffee
    val arrHot: ArrayList<Produk>get () {
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
        p3.harga = "Rp. 25.0000,-"
        p3.gambar = R.drawable.frothy

        val p4 = Produk()
        p4.nama = "Coffee Ice Cubes"
        p4.harga = "Rp. 29.0000,-"
        p4.gambar = R.drawable.cubes
        val p5 = Produk()
        p5.nama = "Easy Iced Coffee"
        p5.harga = "Rp. 23.0000,-"
        p5.gambar = R.drawable.icecofffee

        val p6 = Produk()
        p6.nama = "Double Coffee Iced"
        p6.harga = "Rp. 25.0000,-"
        p6.gambar = R.drawable.latte

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)
        arr.add(p4)
        arr.add(p5)
        arr.add(p6)

        return arr
    }


    //selain coffee
    val arrBesides: ArrayList<Produk>get () {
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
        p3.harga = "Rp. 25.0000,-"
        p3.gambar = R.drawable.frothy

        val p4 = Produk()
        p4.nama = "Coffee Ice Cubes"
        p4.harga = "Rp. 29.0000,-"
        p4.gambar = R.drawable.cubes
        val p5 = Produk()
        p5.nama = "Easy Iced Coffee"
        p5.harga = "Rp. 23.0000,-"
        p5.gambar = R.drawable.icecofffee

        val p6 = Produk()
        p6.nama = "Double Coffee Iced"
        p6.harga = "Rp. 25.0000,-"
        p6.gambar = R.drawable.latte

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)
        arr.add(p4)
        arr.add(p5)
        arr.add(p6)

        return arr
    }
}