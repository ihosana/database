package com.example.database

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import com.example.database.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bind:ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        bind=DataBindingUtil.setContentView(this, R.layout.activity_main)
        bind.button.setOnClickListener{
          bind.textAula.text="Olá mundooo"
        }

    }
}