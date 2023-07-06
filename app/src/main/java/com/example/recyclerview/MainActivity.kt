package com.example.recyclerview

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayNamesList()
    }
    fun displayNamesList(){
        var names = listOf("Mary","Purity","Rita","Masian","Grace","Rita","Angel","Glory","Zuhura",
            "Georgina","Joy","Peace","Febronia","Necta","Rosemary","Juliet","Juliana","Vallary","Joel",
            "Joyeuse","Arsene","Arsitide","Vladmir","Arnaud","Yvon","Floris","Ottedo","Godfrey","Juma"
        ,"Emmanuel","Mashaka","Abdulkarim","Amedeus","Rashid","Weledi","Kayla")
        binding.rvNames.layoutManager=LinearLayoutManager(this)
        val namesAdapter=RecyclerViewAdapter (names)
        binding.rvNames.adapter=namesAdapter
    }
}