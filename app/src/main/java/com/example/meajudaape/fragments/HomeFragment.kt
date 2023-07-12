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

class HomeFragment : Fragment() {
    val imovel = Imovel(
    1,
    1,
    "Teste",
    "Teste 123",
    450.0,
    450.0,
    30.0,
    1,
    "Rua dos bobos numero 0",
    "")
    var imoveis: List<Imovel> = listOf(imovel)
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

        binding.imoveisRecyclerView.apply{
            layoutManager = LinearLayoutManager(context)
            adapter = ImovelAdapter(imoveis)
        }
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}