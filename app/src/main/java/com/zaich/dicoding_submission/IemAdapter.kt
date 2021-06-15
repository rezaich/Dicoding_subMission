package com.zaich.dicoding_submission

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_layout.view.*

class iemAdapter(val listIem: ArrayList<IemModel>,
                    val context: Context)
    : RecyclerView.Adapter<iemAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_layout, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val Iem = listIem[position]
        holder.imgPhoto.setImageResource(Iem.imageIem)
        holder.tvName.text = Iem.nmIem
        holder.tvharga.text = Iem.hargaIem.toString()

        holder.itemView.setOnClickListener(){
            val model = listIem.get(position)

            var giem : String = model.nmIem
            var gdesc : String = model.descIem
            var gharga : Int = model.hargaIem
            var gimg : Int = Iem.imageIem

            val intent = Intent(context,OrderActivity :: class.java)
            intent.putExtra("pIem",giem)
            intent.putExtra("pDesc", gdesc)
            intent.putExtra("pHarga", gharga)
            intent.putExtra("pImg", gimg)

            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listIem.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.namaiem )
        var imgPhoto: ImageView = itemView.findViewById(R.id.imgiem)
        var tvharga: TextView = itemView.findViewById(R.id.hargaiem)
    }
}