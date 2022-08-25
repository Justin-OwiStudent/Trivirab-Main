package com.example.trivi_rab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.trivi_rab.databinding.ActivityCatagorieBinding
import com.example.trivi_rab.databinding.ActivityLandingBinding

class Landing : AppCompatActivity() {

    private lateinit var binding: ActivityLandingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        val username = intent.getStringExtra("username")

        binding = ActivityLandingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvHowTo.setOnClickListener {
            intent.putExtra("username", username)

            val intent = Intent(this, HowToActivity::class.java)
            startActivity(intent)
        }

        binding.tvCata.setOnClickListener {
            intent.putExtra("username", username)

            val intent = Intent(this, CatagorieActivity::class.java)
            startActivity(intent)
        }

    }
}