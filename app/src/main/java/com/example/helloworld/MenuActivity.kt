package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.CheckMailActivityBoton.setOnClickListener{
            val sendEmailActivityIntent = Intent(this, SendEmailActivity::class.java)
            startActivity(sendEmailActivityIntent)
        }

        binding.calculatorBoton.setOnClickListener{
            val calculatorActivityIntent = Intent(this, CalculatorActivity::class.java)
            startActivity(calculatorActivityIntent)
        }

        binding.textViewActivityBoton.setOnClickListener{
            val textViewsActivityIntent = Intent(this, TextViewsActivity::class.java)
            startActivity(textViewsActivityIntent)
        }

        binding.Calculator2ActivityBoton.setOnClickListener{
            val calculator2ActivityIntent = Intent(this, CalculatorTableActivity::class.java)
            startActivity(calculator2ActivityIntent)
        }

        binding.usernameActivityBoton.setOnClickListener{
            val usernameActivity = Intent(this, UsernameActivity::class.java)
            startActivity(usernameActivity)
        }
    }
}