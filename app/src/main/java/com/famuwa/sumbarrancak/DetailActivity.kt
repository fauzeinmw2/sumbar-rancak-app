package com.famuwa.sumbarrancak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    lateinit var i : Intent

    lateinit var tvJudul : TextView
    lateinit var tvLokasi : TextView
    lateinit var tvDeskripsi : TextView
    lateinit var ivPhoto : ImageView

    companion object{
        const val KEY_IMG = "key_img"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        i = intent
        var judul = i.getStringExtra("judul")
        var lokasi = i.getStringExtra("lokasi")
        var deskripsi = i.getStringExtra("deskripsi")
        var photo = i.getIntExtra(KEY_IMG, 0)

        tvJudul = findViewById(R.id.tvJudulDetail)
        tvLokasi = findViewById(R.id.tvLokasiDetail)
        tvDeskripsi = findViewById(R.id.tvDeskripsiDetail)
        ivPhoto = findViewById(R.id.ivPhotoDetail)

        tvJudul.text = judul
        tvLokasi.text = lokasi
        tvDeskripsi.text = deskripsi
        ivPhoto.setImageResource(photo)

        setActionBarTitle(judul.toString())
    }

    private fun setActionBarTitle(title: String){
        supportActionBar?.title = title
    }
}