package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.helloworld.databinding.ActivitySendEmailBinding
import com.example.helloworld.databinding.ActivityTextViewsBinding

class SendEmailActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySendEmailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySendEmailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sendEmail.setOnClickListener{ v ->
            Toast
                .makeText(
                    this,
                    "Enviando ${binding.T2.text} a ${binding.E1.text}",
                    Toast.LENGTH_SHORT)
                .show()
        }
    }
}