package com.example.helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.helloworld.databinding.ActivityCalculatorBinding

class CalculatorActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCalculatorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonmas.setOnClickListener{ v ->
            val number1 = binding.decimal1.text.toString().toDoubleOrNull()
            val number2 = binding.decimal2.text.toString().toDoubleOrNull()
            if (number1 != null && number2 != null){
                val sum = number1+number2
                binding.texto.text = sum.toString()
            }else {
                Toast.makeText(this, "Debes introducir ambos numeros", Toast.LENGTH_SHORT).show()
            }
        }

        binding.botonmenos.setOnClickListener { v->
            val number1 = binding.decimal1.text.toString().toDoubleOrNull()
            val number2 = binding.decimal2.text.toString().toDoubleOrNull()
            if (number1 != null && number2 != null){
                val res = number1-number2
                binding.texto.text = res.toString()
            }else {
                Toast.makeText(this, "Debes introducir ambos numeros", Toast.LENGTH_SHORT).show()
            }
        }

        binding.botonpor.setOnClickListener { v ->
            val number1 = binding.decimal1.text.toString().toDoubleOrNull()
            val number2 = binding.decimal2.text.toString().toDoubleOrNull()
            if (number1 != null && number2 != null){
                val mul = number1 * number2
                binding.texto.text = mul.toString()
            }else{
                Toast.makeText(this, "Debes introducir ambos numeros", Toast.LENGTH_SHORT).show()
            }
        }

        binding.botondiv.setOnClickListener { v ->
            val number1 = binding.decimal1.text.toString().toDoubleOrNull()
            val number2 = binding.decimal2.text.toString().toDoubleOrNull()
            if (number1 != null && number2 != null) {

                    val div = number1 / number2
                    binding.texto.text = div.toString()
            } else {
                Toast.makeText(this, "Debes introducir ambos numeros", Toast.LENGTH_SHORT).show()
            }
        }

        binding.botonReset.setOnClickListener { v ->
            binding.texto.text = null
            binding.decimal1.text= null
            binding.decimal2.text= null
        }
    }
}
