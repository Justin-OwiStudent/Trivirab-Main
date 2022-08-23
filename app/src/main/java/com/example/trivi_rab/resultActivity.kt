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
        val finalScore = intent.getIntExtra("currentScore", 0)

        binding.btnGoHome.setOnClickListener{
            val intent = Intent(this, Landing::class.java)
            startActivity(intent)

        }

        binding.btnAgain.setOnClickListener{
            val intent = Intent(this, CatagorieActivity::class.java)
            startActivity(intent)

        }

        //TODO: uopdate UI
        binding.tvResult.text = "$finalScore/2"
        if(finalScore >= 2) {
            binding.tvMessage.text = "Well done, You passed!"
            binding.ivImage.setImageResource(R.drawable.ic_success)
//            binding.tvResult.setTextColor(R.color.MySuccessColor)
        } else {
            binding.tvMessage.text = "Bad luck, try again ?"
            binding.ivImage.setImageResource(R.drawable.ic_cancel)
//            binding.tvResult.setTextColor(R.color.error_color)
        }

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