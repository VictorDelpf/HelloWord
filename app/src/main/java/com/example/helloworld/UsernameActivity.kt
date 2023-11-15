package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.helloworld.databinding.ActivityUsernameBinding

class UsernameActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUsernameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUsernameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.enviarBoton.setOnClickListener{
            if(binding.usernameET.text.isEmpty()){
                Toast.makeText(this, "Debe introducir un username", Toast.LENGTH_SHORT).show()
            }else{
                val displayUsernameActivityIntent = Intent(this, DisplayUsernameActivity::class.java)
                val username= "usernameET"
                displayUsernameActivityIntent.putExtra(DisplayUsernameActivity.Params.USERNAME.name, binding.usernameET.text.toString())
                startActivity(displayUsernameActivityIntent)
            }
        }

        binding.volverBoton.setOnClickListener {
            finish()
        }
    }
}