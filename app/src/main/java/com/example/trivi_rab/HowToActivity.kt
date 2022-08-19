package com.example.trivi_rab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.trivi_rab.databinding.ActivityCatagorieBinding
import com.example.trivi_rab.databinding.ActivityHowToBinding

class HowToActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHowToBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_how_to)

        binding = ActivityHowToBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.tvPagain.setOnClickListener {
            val intent = Intent(this, CatagorieActivity::class.java)
            startActivity(intent)

        }

    }
}