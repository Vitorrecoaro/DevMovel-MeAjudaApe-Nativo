package com.example.meajudaape.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.meajudaape.R
import com.example.meajudaape.adapters.ImovelAdapter
import com.example.meajudaape.classes.Imovel
import com.example.meajudaape.databinding.FragmentHomeBinding
import com.example.meajudaape.network.ImoveisApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class HomeFragment : Fragment() {
    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("http://my-json-server.typicode.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val imovelApi : ImoveisApiService = retrofit.create(ImoveisApiService::class.java)

        val call : Call<List<Imovel>> = imovelApi.getImoveis()

        call.enqueue(object : Callback<List<Imovel>> {
            override fun onFailure(call: Call<List<Imovel>>, t: Throwable) {
            }

            override fun onResponse(call: Call<List<Imovel>>, response: Response<List<Imovel>>) {
                binding.imoveisRecyclerView.apply{
                    layoutManager = LinearLayoutManager(context)
                    adapter = ImovelAdapter(response.body()!!)
                }
            }

        })

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}