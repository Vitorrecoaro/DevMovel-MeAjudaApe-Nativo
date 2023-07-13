package com.example.meajudaape.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.meajudaape.databinding.FragmentFormsImovelBinding
import com.example.meajudaape.R
import androidx.navigation.fragment.findNavController

class FormsImovelFragment : Fragment() {

    private var _binding: FragmentFormsImovelBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFormsImovelBinding.inflate(inflater , container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupButton()
    }

    private fun setupButton() {
//        binding.continueButton.setOnClickListener {sendDataToServer()}
        binding.continueButton.setOnClickListener {
            val formsImovel2 = FormsImovel2Fragment()

            parentFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, formsImovel2)
                .addToBackStack(null) //Adiciona o Fragmento atual à pilha de retrocesso
                .commit()
        }
    }

    private fun sendDataToServer() {
        val dataStr = "CEP: ${binding.editTextCep.text.toString()}"
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}