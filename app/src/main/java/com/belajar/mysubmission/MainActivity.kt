package com.belajar.mysubmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.belajar.mysubmission.pariwisata.CardViewPariwisataAdapter
import com.belajar.mysubmission.pariwisata.Pariwisata
import com.belajar.mysubmission.pariwisata.PariwisataData

class MainActivity : AppCompatActivity() {
    private lateinit var rvPariwisata: RecyclerView
    private var list: ArrayList<Pariwisata> = arrayListOf()
    private var title: String = "Wisata Indonesia"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = title

        rvPariwisata = findViewById(R.id.rv_pariwisata)
        rvPariwisata.setHasFixedSize(true)

        list.addAll(PariwisataData.listData)
        showHomeMenu()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.about_menu -> {
                val aboutIntent = Intent(this, AboutActivity::class.java)
                startActivity(aboutIntent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showHomeMenu() {
        rvPariwisata.layoutManager = LinearLayoutManager(this)
        val cardViewPariwisataAdapter = CardViewPariwisataAdapter(list)
        rvPariwisata.adapter = cardViewPariwisataAdapter
    }
}