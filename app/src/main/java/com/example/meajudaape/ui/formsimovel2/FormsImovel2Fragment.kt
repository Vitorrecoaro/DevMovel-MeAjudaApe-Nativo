package com.example.meajudaape.ui.formsimovel2

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.meajudaape.R

class FormsImovel2Fragment : Fragment() {

    private lateinit var viewModel: FormsImovel2ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_forms_imovel2, container, false)
    }

}