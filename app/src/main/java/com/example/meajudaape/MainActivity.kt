package com.example.meajudaape

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.meajudaape.databinding.ActivityMainBinding
import com.example.meajudaape.fragments.BlankFragment
import com.example.meajudaape.fragments.HomeFragment
import com.example.meajudaape.fragments.ProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import com.example.meajudaape.fragments.FormsImovelFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var bottomAppBar: BottomNavigationView
    private var homeFragment = HomeFragment()
    private var profileFragment = ProfileFragment()
    private var formsImovel = FormsImovelFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        bottomAppBar = binding.bottomNavigationView;

        bottomAppBar.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener {this.onItemClick(it)})
    }

    private fun onItemClick(item: MenuItem) : Boolean{
        if (item.itemId == R.id.homeNavBar){
            supportFragmentManager.beginTransaction().replace(binding.fragmentContainerView.id, homeFragment).commit()
            return true
        }
        if (item.itemId == R.id.addNavBar) {
            supportFragmentManager.beginTransaction()
                .replace(binding.fragmentContainerView.id, formsImovel).commit()
            return true
        }
        if (item.itemId == R.id.profileNavBar){
            supportFragmentManager.beginTransaction().replace(binding.fragmentContainerView.id, profileFragment ).commit()
            return true
        }
        return false
    }
}
