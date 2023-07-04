package com.example.meajudaape

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.meajudaape.ui.formsimovel.FormsImovelFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment : Fragment = FormsImovelFragment()

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commit()

    }
}