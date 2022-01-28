package com.famuwa.sumbarrancak

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListMakananAdapter(private val listMakanan : ArrayList<Makanan>) : RecyclerView.Adapter<ListMakananAdapter.MakananViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MakananViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_makanan, parent, false)
        return MakananViewHolder(view)
    }

    override fun onBindViewHolder(holder: MakananViewHolder, position: Int) {
        val makanan = listMakanan[position]

        Glide.with(holder.itemView.context)
            .load(makanan.photoMakanan)
            .apply(RequestOptions().override(350, 550))
            .into(holder.ivPhotoMakanan)

        holder.tvNamaMakanan.text = makanan.namaMakanan

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra("judul", listMakanan[holder.adapterPosition].namaMakanan)
            intent.putExtra("lokasi", "Kuliner")
            intent.putExtra("deskripsi", listMakanan[holder.adapterPosition].deskripsiMakanan)
            intent.putExtra(DetailActivity.KEY_IMG, listMakanan[holder.adapterPosition].photoMakanan)
            holder.itemView.context.startActivity(intent)
        }


    }

    override fun getItemCount(): Int {
        return listMakanan.size
    }

    inner class MakananViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ivPhotoMakanan : ImageView = itemView.findViewById(R.id.ivPhotoMakanan)
        var tvNamaMakanan : TextView = itemView.findViewById(R.id.tvNamaMakanan)
    }
}