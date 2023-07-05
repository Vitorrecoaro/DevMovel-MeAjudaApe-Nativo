package com.example.meajudaape.ui.formsimovel2

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.meajudaape.R
import com.example.meajudaape.databinding.FragmentFormsImovel2Binding
import com.example.meajudaape.databinding.FragmentFormsImovelBinding

class FormsImovel2Fragment : Fragment() {

    private lateinit var viewModel: FormsImovel2ViewModel

    private var _binding: FragmentFormsImovel2Binding? = null
    private val binding get() = _binding!!

    override fun onResume() {
        super.onResume()
        val qtdQuartos = resources.getStringArray(R.array.quantidade)
        val arrayAdapterQuartos = ArrayAdapter(requireContext(), R.layout.dropdown_item, qtdQuartos)
        binding.quartosDropdown.setAdapter(arrayAdapterQuartos)

        val qtdSuites = resources.getStringArray(R.array.quantidade)
        val arrayAdapterSuites = ArrayAdapter(requireContext(), R.layout.dropdown_item, qtdSuites)
        binding.suitesDropdown.setAdapter(arrayAdapterSuites)

        val qtdBanheiros = resources.getStringArray(R.array.quantidade)
        val arrayAdapterBanheiros = ArrayAdapter(requireContext(), R.layout.dropdown_item, qtdBanheiros)
        binding.banheirosDropdown.setAdapter(arrayAdapterBanheiros)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFormsImovel2Binding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}