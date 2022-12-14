package com.example.trivi_rab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.trivi_rab.databinding.ActivityLandingBinding


class Landing : AppCompatActivity() {

    private lateinit var binding: ActivityLandingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        val username = intent.getStringExtra("username").toString()

        binding = ActivityLandingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.i("username", username).toString()

        binding.tvHowTo.setOnClickListener {
            val intent = Intent(this, HowToActivity::class.java)
            startActivity(intent)
            intent.putExtra("username", username).toString()
        }

        binding.tvCata.setOnClickListener {
            val intent = Intent(this, CatagorieActivity::class.java)
            startActivity(intent)
            intent.putExtra("username", username).toString()

            Log.i("username", username).toString()
        }

    }
}