package com.example.meajudaape.ui.formsimovel

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.meajudaape.R

class FormsImovelFragment : Fragment() {

    private lateinit var viewModel: FormsImovelViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_forms_imovel, container, false)
    }

    /*override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupButton()
    }

    private fun setupButton() {
        binding.btnSend.setOnClickListener {sendDataToServer()}
    }

    private fun sendDataToServer() {
        val dataStr =
    }
    */
}