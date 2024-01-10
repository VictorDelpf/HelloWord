package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.databinding.ActivityDisplayUsernameBinding
import com.example.helloworld.databinding.ActivityMenuBinding

class DisplayUsernameActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDisplayUsernameBinding
        enum class Params{
            USERNAME, PASSWORD
        }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDisplayUsernameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra(Params.USERNAME.name)

        binding.UsernameTV.text= username
    }
}