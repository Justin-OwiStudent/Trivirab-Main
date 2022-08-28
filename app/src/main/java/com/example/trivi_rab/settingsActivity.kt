package com.example.trivi_rab

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.trivi_rab.databinding.ActivitySettingsBinding


class settingsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val queryURL: Uri = Uri.parse("https://github.com/Justin-OwiStudent/Trivirab-Main")

        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        rangeSlider = findViewById(R.id.sliderRange)

        binding.btnBack.setOnClickListener{
            val intent = Intent(this, CatagorieActivity::class.java)
            startActivity(intent)
        }


        binding.tvMainLink.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, queryURL)
            startActivity(intent)

        }
//
    }
}