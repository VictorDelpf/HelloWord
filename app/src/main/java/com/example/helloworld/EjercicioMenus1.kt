package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.databinding.ActivityEjercicioMenus1Binding

class EjercicioMenus1 : AppCompatActivity() {
    private lateinit var binding: ActivityEjercicioMenus1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_menus1)
    }
}