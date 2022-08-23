package com.example.trivi_rab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.trivi_rab.databinding.ActivityCatagorieBinding
import com.example.trivi_rab.databinding.ActivityQuestionBinding

class CatagorieActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCatagorieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catagorie)

        binding = ActivityCatagorieBinding.inflate(layoutInflater)
        setContentView(binding.root)



//        val intent = Intent(this, CatagorieActivity::class.java)

        binding.btnAnime.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            startActivity(intent)

        }

        binding.btnCartoon.setOnClickListener{
            val intent = Intent(this, CartoonActivity::class.java)
            startActivity(intent)

        }
//
        binding.btnDisney.setOnClickListener{
            val intent = Intent(this, DisenyActivity::class.java)
            startActivity(intent)

        }
//        val intent = Intent(this, )
    }
}