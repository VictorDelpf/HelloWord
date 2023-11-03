package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.databinding.ActivityContactsBinding

class ContactsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityContactsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityContactsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.switch1.setOnClickListener{v->
            binding.editTextPhone.isEnabled = binding.switch1.isChecked
            binding.CountrySpinner.isEnabled = binding.switch1.isChecked

        }
    }
}