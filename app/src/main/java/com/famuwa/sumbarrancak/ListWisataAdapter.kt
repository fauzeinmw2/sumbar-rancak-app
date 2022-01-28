package com.famuwa.sumbarrancak

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListWisataAdapter(private val listWisata : ArrayList<Wisata>) : RecyclerView.Adapter<ListWisataAdapter.WisataViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WisataViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_wisata, parent, false)
        return WisataViewHolder(view)
    }

    override fun onBindViewHolder(holder: WisataViewHolder, position: Int) {
        val wisata = listWisata[position]

        Glide.with(holder.itemView.context)
            .load(wisata.wisataPhoto)
            .apply(RequestOptions().override(350, 550))
            .into(holder.wisataPhoto)

        holder.wisataName.text = wisata.wisataName
        holder.wisataLocation.text = wisata.wisataLocation

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra("judul", listWisata[holder.adapterPosition].wisataName)
            intent.putExtra("lokasi", listWisata[holder.adapterPosition].wisataLocation)
            intent.putExtra("deskripsi", listWisata[holder.adapterPosition].wisataDetail)
            intent.putExtra(DetailActivity.KEY_IMG, listWisata[holder.adapterPosition].wisataPhoto)
            holder.itemView.context.startActivity(intent)
        }

        var statusLike = "false"
        var statusDislike = "false"

        holder.btnLike.setOnClickListener {
            if (statusLike == "false"){
                Toast.makeText(holder.itemView.context, "Anda Menyukai " + listWisata[holder.adapterPosition].wisataName, Toast.LENGTH_SHORT).show()
                holder.btnLike.setBackgroundResource(R.drawable.ic_like)
                statusLike = "true"
                holder.btnDislike.setBackgroundResource(R.drawable.ic_dislike2)
                statusDislike = "false"
            }else{
                holder.btnLike.setBackgroundResource(R.drawable.ic_like2)
                statusLike = "false"
            }
        }


        holder.btnDislike.setOnClickListener {
            if (statusDislike == "false"){
                Toast.makeText(holder.itemView.context, "Anda Tidak Menyukai " + listWisata[holder.adapterPosition].wisataName, Toast.LENGTH_SHORT).show()
                holder.btnDislike.setBackgroundResource(R.drawable.ic_dislike)
                statusDislike = "true"
                holder.btnLike.setBackgroundResource(R.drawable.ic_like2)
                statusLike = "false"
            }else{
                holder.btnDislike.setBackgroundResource(R.drawable.ic_dislike2)
                statusDislike = "false"
            }
        }

        holder.btnShare.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Mohon Maaf, Fitur ini sekarang masih dalam pengembangan...", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return listWisata.size
    }

    inner class WisataViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var wisataPhoto : ImageView = itemView.findViewById(R.id.img_wisata_photo)
        var wisataName : TextView = itemView.findViewById(R.id.tv_wisata_name)
        var wisataLocation : TextView = itemView.findViewById(R.id.tv_wisata_location)
        var btnLike : ImageView = itemView.findViewById(R.id.btn_like)
        var btnDislike : ImageView = itemView.findViewById(R.id.btn_dislike)
        var btnShare : ImageView = itemView.findViewById(R.id.btn_share)

    }
}