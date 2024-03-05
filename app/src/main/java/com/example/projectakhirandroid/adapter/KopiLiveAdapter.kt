package com.example.projectakhirandroid.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.projectakhirandroid.DetailActivity
import com.example.projectakhirandroid.R
import com.example.projectakhirandroid.databinding.ItemKopiLiveBinding
import com.example.projectakhirandroid.model.KopiLive

class KopiLiveAdapter(private var listKopiLive : ArrayList<KopiLive>) : RecyclerView.Adapter<KopiLiveAdapter.LoveLiveViewHolder>() {

    inner class LoveLiveViewHolder(private val itemKopiLiveBinding: ItemKopiLiveBinding) : RecyclerView.ViewHolder(itemKopiLiveBinding.root) {
        fun bindItem(loveLive: KopiLive) {
            // Set Nama & Deskripsi Karakter
            with(itemKopiLiveBinding){
                tvName.text = loveLive.name
                tvDescription.text = loveLive.description
            }

            // Set Gambar Thumbnail Character
            Glide.with(itemView)
                .load(loveLive.thumbnail)
                .apply(RequestOptions.circleCropTransform())
                .into(itemKopiLiveBinding.ivThumbnail)

            // Set Bingkai Karakter sesuai dengan Nama
            when(loveLive.name){
                "Robusta" -> setThumbnail(R.drawable.circle_robusta)
                "Rasberi" -> setThumbnail(R.drawable.circle_rasberi)
                "Atu" -> setThumbnail(R.drawable.circle_atu)
                "Takengen" -> setThumbnail(R.drawable.circle_ai)
                "Bener" -> setThumbnail(R.drawable.circle_bener)
                "Meriah" -> setThumbnail(R.drawable.circle_meriah)
                "Gayo" -> setThumbnail(R.drawable.circle_gayo)
                "Kopi" -> setThumbnail(R.drawable.circle_kopi)
                "Ras" -> setThumbnail(R.drawable.circle_ras)
            }

            // Pindah ke Detail Activity ketika item diklik
            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_KOPI_LIVE, loveLive)
                itemView.context.startActivity(intent)
            }

        }

        // Fungsi set Bingkai
        private fun setThumbnail(circle: Int) {
            itemKopiLiveBinding.rlThumbnail.setBackgroundResource(circle)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LoveLiveViewHolder {
        val adapter = ItemKopiLiveBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LoveLiveViewHolder(adapter)
    }

    override fun onBindViewHolder(holder: LoveLiveViewHolder, position: Int) {
        holder.bindItem(listKopiLive[position])
    }

    override fun getItemCount(): Int = listKopiLive.size
}