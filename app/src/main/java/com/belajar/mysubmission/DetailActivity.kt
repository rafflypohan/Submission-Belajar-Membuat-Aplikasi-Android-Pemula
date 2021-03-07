package com.belajar.mysubmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAMA = "extra_nama"
        const val EXTRA_LOKASI = "extra_lokasi"
        const val EXTRA_DESKRIPSI = "extra_deskripsi"
        const val EXTRA_RATING = "extra_rating"
        const val EXTRA_FOTO = "extra_foto"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.apply {
            title = intent.getStringExtra(EXTRA_NAMA)
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        val tvNamaTempat: TextView = findViewById(R.id.tv_nama_tempat)
        val tvLokasi: TextView = findViewById(R.id.tv_lokasi)
        val tvDeskripsi: TextView = findViewById(R.id.tv_deskripsi)
        val tvRating: TextView = findViewById(R.id.tv_rating)
        val imageTempat: ImageView = findViewById(R.id.img_item)

        val namaTempat = intent.getStringExtra(EXTRA_NAMA)
        val lokasi = intent.getStringExtra(EXTRA_LOKASI)
        val deskripsi = intent.getStringExtra(EXTRA_DESKRIPSI)
        val rating = intent.getDoubleExtra(EXTRA_RATING, 0.0)

        tvNamaTempat.text = namaTempat
        tvLokasi.text = lokasi
        tvDeskripsi.text = deskripsi
        tvRating.text = rating.toString()

        val bundle: Bundle? = intent.extras

        val foto = bundle?.getInt(EXTRA_FOTO)
        if (foto != null) {
            imageTempat.setImageResource(foto)
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        finish()
        return true
    }
}