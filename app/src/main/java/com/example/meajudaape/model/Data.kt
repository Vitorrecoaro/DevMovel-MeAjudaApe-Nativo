package com.example.meajudaape.model

//import com.google.gson.Gson

data class Imovel(
    val aluguel: String,
    val condominio: String,
    val iptu: String,
    val quartos: String,
    val suites: String,
    val banheiros: String,
    val area: String,
    val rua: String,
    val numero: String,
    val bairro: String,
    val cidade: String,
    val descricao: String,
    val caracteristicas: List<String>,
    val whatsapp: String,
    val codigoImovel: String
)

    //val gson = Gson()
    //val json = gson.toJson(imovel)
    //println(json)
}
