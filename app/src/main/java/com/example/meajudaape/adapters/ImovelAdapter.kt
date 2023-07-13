package com.example.meajudaape.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.meajudaape.classes.Imovel
import com.example.meajudaape.databinding.CardImovelBinding
import com.example.meajudaape.Descricao

class ImovelAdapter(private val imoveis: List<Imovel>) : RecyclerView.Adapter<ImovelAdapter.ImovelHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImovelHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = CardImovelBinding.inflate(inflater, parent, false)
        return ImovelHolder(binding)
    }

    override fun getItemCount(): Int {
        return imoveis.size
    }

    override fun onBindViewHolder(holder: ImovelHolder, position: Int) {
        val imovel = imoveis[position]
        holder.bindImovel(imovel)
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, Descricao::class.java)
            context.startActivity(intent)
        }
    }

    inner class ImovelHolder(private val binding: CardImovelBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindImovel(imovel: Imovel) {
            binding.imovelAluguel.text = "R$ ${imovel.aluguel.toString()}"
            binding.imovelCondominio.text = "R$ ${imovel.condominio.toString()}"
            binding.imovelDescricao.text = imovel.descricao
            binding.imovelTitulo.text = imovel.nome
        }
    }
}
