package com.example.meajudaape.network

import com.example.meajudaape.classes.Imovel
import retrofit2.Call
import retrofit2.http.GET

interface ImoveisApiService {
    @GET("/Vitorrecoaro/DevMovel-MeAjudaApe-API/imoveis")
    fun getImoveis(): Call<List<Imovel>>
}