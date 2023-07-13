package com.example.meajudaape.holders

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.meajudaape.classes.Imovel
import com.example.meajudaape.databinding.CardImovelBinding

class ImovelHolder(private val cardImovelBinding: CardImovelBinding,
    val context: Context)
    : RecyclerView.ViewHolder(cardImovelBinding.root) {
    fun bindBook(imovel: Imovel){
        cardImovelBinding.imovelAluguel.text = "R$ ${imovel.aluguel.toString()}"
        cardImovelBinding.imovelCondominio.text = "R$ ${imovel.condominio.toString()}"
        cardImovelBinding.imovelDescricao.text = imovel.descricao
        cardImovelBinding.imovelTitulo.text = imovel.nome
    }
}