package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.helloworld.databinding.ActivityCalculatorTableBinding

class CalculatorTableActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCalculatorTableBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorTableBinding.inflate(layoutInflater)
        setContentView(binding.root)
/*
        fun presionarBoton(v: String){
            binding.pantallaTextView.text=binding.pantallaTextView.text.toString() + v
            val text
        }
*/
 /*

        binding.unoBoton.setOnClickListener { button ->
            val text = /button as Button).text.toString()
            presionarBoton
            presionarBoton(
        }
        binding.unoBoton.setOnClickListener { _ ->
            binding.pantallaTextView.text= binding.pantallaTextView.text.toString()+"1"
        }
        binding.dosBoton.setOnClickListener { _ ->
            binding.pantallaTextView.text= binding.pantallaTextView.text.toString()+"2"
        }
        binding.tresBoton.setOnClickListener { _ ->
            binding.pantallaTextView.text= binding.pantallaTextView.text.toString()+"3"
        }
        binding.cuatroBoton.setOnClickListener { _ ->
            binding.pantallaTextView.text= binding.pantallaTextView.text.toString()+"4"
        }
        binding.cincoBoton.setOnClickListener { _ ->
            binding.pantallaTextView.text= binding.pantallaTextView.text.toString()+"5"
        }
        binding.seisBoton.setOnClickListener { _ ->
            binding.pantallaTextView.text= binding.pantallaTextView.text.toString()+"6"
        }
        binding.sieteBoton.setOnClickListener { _ ->
            binding.pantallaTextView.text= binding.pantallaTextView.text.toString()+"7"
        }
        binding.ochoBoton.setOnClickListener { _ ->
            binding.pantallaTextView.text= binding.pantallaTextView.text.toString()+"8"
        }
        binding.nueveBoton.setOnClickListener { _ ->
            binding.pantallaTextView.text= binding.pantallaTextView.text.toString()+"9"
        }
        binding.masBoton.setOnClickListener { _ ->
            binding.pantallaTextView.text= binding.pantallaTextView.text.toString()+"+"
        }
        binding.menosBoton.setOnClickListener { _ ->
            binding.pantallaTextView.text= binding.pantallaTextView.text.toString()+"-"
        }
        binding.porBoton.setOnClickListener { _ ->
            binding.pantallaTextView.text= binding.pantallaTextView.text.toString()+"*"
        }
        binding.divBoton.setOnClickListener { _ ->
            binding.pantallaTextView.text= binding.pantallaTextView.text.toString()+"/"
        }
*/
    }
}