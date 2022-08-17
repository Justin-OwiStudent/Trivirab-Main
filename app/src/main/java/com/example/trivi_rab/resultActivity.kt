package com.example.trivi_rab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.trivi_rab.databinding.ActivityMainBinding
import com.example.trivi_rab.databinding.ActivityResultBinding

class resultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //get scores
        val finalScore = intent.getIntExtra("currenScore", 0)



//        //TODO: uopdate UI
//        binding.tvResult.text = "$finalScore/2"
//        if(finalScore >= 2) {
//            binding.tvMessage.text = "youa rea s robot"
//            binding.ivImage.setImageResource(R.drawable.ic_success)
//            binding.tvResults.setTextColor(R.color.success_color)
//        } else {
//            binding.tvMessage.text = "you are a human"
//            binding.ivImage.setImageResource(R.drawable.ic_cancel)
//            binding.tvResults.setTextColor(R.color.error_color)
//        }
//
//        //handle navigation clicks
//        binding.btnGoHome.setOnClickListener {
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//            finish()
//        }
//
//        binding.btnAgain.setOnClickListener {
//            val intent = Intent(this, QuestionActivity::class.java)
//            startActivity(intent)
//            finish()
//        }

    }
}