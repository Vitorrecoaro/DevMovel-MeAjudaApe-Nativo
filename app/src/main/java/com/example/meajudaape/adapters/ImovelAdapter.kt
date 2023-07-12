package com.example.meajudaape.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.meajudaape.classes.Imovel
import com.example.meajudaape.databinding.CardImovelBinding
import com.example.meajudaape.holders.ImovelHolder

class ImovelAdapter (private val imoveis: List<Imovel>) : RecyclerView.Adapter<ImovelHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImovelHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardImovelBinding.inflate(from, parent, false)

        return ImovelHolder(binding);
    }

    override fun getItemCount(): Int {
        return imoveis.size
    }

    override fun onBindViewHolder(holder: ImovelHolder, position: Int) {
        holder.bindBook(imoveis[position])
    }
}