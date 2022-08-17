package com.example.trivi_rab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.example.trivi_rab.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    private lateinit var binding = ActivityMainBinding

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root) //this sets what XML frontend to use

        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}