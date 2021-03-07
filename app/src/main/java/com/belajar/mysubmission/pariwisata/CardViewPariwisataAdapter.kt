package com.belajar.mysubmission.pariwisata

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.belajar.mysubmission.DetailActivity
import com.belajar.mysubmission.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewPariwisataAdapter(private val listPariwisata: ArrayList<Pariwisata>) :
    RecyclerView.Adapter<CardViewPariwisataAdapter.CardViewViewHolder>() {

    class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var gambar: ImageView = itemView.findViewById(R.id.img_item)
        var tvNamaTempat: TextView = itemView.findViewById(R.id.tv_nama_tempat)
        var tvLokasi: TextView = itemView.findViewById(R.id.tv_lokasi)
        var tvRating: TextView = itemView.findViewById(R.id.tv_rating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cardview_pariwisata, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val pariwisata = listPariwisata[position]

        Glide.with(holder.itemView.context)
            .load(pariwisata.foto)
            .apply(RequestOptions().override(350, 550))
            .into(holder.gambar)

        holder.tvNamaTempat.text = pariwisata.nama
        holder.tvLokasi.text = pariwisata.lokasi
        holder.tvRating.text = pariwisata.rating.toString()

        holder.itemView.setOnClickListener {
            val context = holder.tvNamaTempat.context
            val detailIntent = Intent(context, DetailActivity::class.java)
            detailIntent.apply {
                putExtra(DetailActivity.EXTRA_NAMA, pariwisata.nama)
                putExtra(DetailActivity.EXTRA_LOKASI, pariwisata.lokasi)
                putExtra(DetailActivity.EXTRA_DESKRIPSI, pariwisata.deskripsi)
                putExtra(DetailActivity.EXTRA_RATING, pariwisata.rating)
                putExtra(DetailActivity.EXTRA_FOTO, pariwisata.foto)
            }
//            detailIntent.putExtra(DetailActivity.EXTRA_NAMA, pariwisata.nama)
//            detailIntent.putExtra(DetailActivity.EXTRA_LOKASI, pariwisata.lokasi)
//            detailIntent.putExtra(DetailActivity.EXTRA_DESKRIPSI, pariwisata.deskripsi)
//            detailIntent.putExtra(DetailActivity.EXTRA_RATING, pariwisata.rating)
//            detailIntent.putExtra(DetailActivity.EXTRA_FOTO, pariwisata.foto)
            context.startActivity(detailIntent)
        }
    }

    override fun getItemCount(): Int {
        return listPariwisata.size
    }
}