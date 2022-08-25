package com.example.trivi_rab

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.widget.TextView
import com.example.trivi_rab.databinding.ActivityResultBinding
import com.example.trivi_rab.databinding.ActivitySettingsBinding
import com.google.android.material.slider.RangeSlider



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
            var intent = Intent(Intent.ACTION_VIEW, queryURL)
            startActivity(intent)

        }
//        fun MainLink() {
//            val linkTextView = findViewById<TextView>(R.id.MainLink)
//            linkTextView.movementMethod = LinkMovementMethod.getInstance();
//            linkTextView.setLinkTextColor(Color.BLUE)
//        }

    }
}