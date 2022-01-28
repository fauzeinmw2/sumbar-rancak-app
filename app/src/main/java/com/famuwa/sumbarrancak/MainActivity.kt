package com.famuwa.sumbarrancak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvWisata : RecyclerView
    private lateinit var rvMakanan : RecyclerView

    private  var listWisata : ArrayList<Wisata> = arrayListOf()
    private var listMakanan : ArrayList<Makanan> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setActionBarTitle("Sumbar Rancak")

        rvWisata = findViewById(R.id.rv_wisata)
        rvWisata.setHasFixedSize(true)

        rvMakanan = findViewById(R.id.rv_makanan)
        rvMakanan.setHasFixedSize(true)

        listWisata.addAll(WisataData.listDataWisata)
        showRecyclerWisata()

        listMakanan.addAll(MakananData.listDataMakanan)
        showRecylerMakanan()
    }

    private fun setActionBarTitle(title: String){
        supportActionBar?.title = title
    }

    private fun showRecyclerWisata() {
        rvWisata.layoutManager = LinearLayoutManager(this)
        val listWisataAdapter = ListWisataAdapter(listWisata)
        rvWisata.adapter = listWisataAdapter
    }

    private fun showRecylerMakanan() {
        rvMakanan.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val listMakananAdapter = ListMakananAdapter(listMakanan)
        rvMakanan.adapter = listMakananAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when(selectedMode){
            R.id.menuOpenAbout -> {
                val intentAbout = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intentAbout)
            }

        }
    }



}