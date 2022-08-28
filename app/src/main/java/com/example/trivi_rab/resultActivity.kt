package com.example.trivi_rab

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.trivi_rab.databinding.ActivityResultBinding
import com.example.trivi_rab.models.Constants


class resultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding


    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //get scores
        val finalScore = intent.getIntExtra("currentScore", 0)

        val username = intent.getStringExtra("username").toString()






        binding.tvResult.text = "$finalScore/7"
        if(finalScore >= 5) {
            intent.putExtra("username", username)
            binding.tvMessage.text = "Well done, You passed!"
            binding.ivImage.setImageResource(R.drawable.ic_success)

        } else {
            intent.putExtra("username", username)
            binding.tvMessage.text = "Bad luck, try again ?"
            binding.ivImage.setImageResource(R.drawable.ic_cancel)

        }




        binding.btnGoHome.setOnClickListener{
            saveLastResults("username", finalScore)

            val intent = Intent(this, Landing::class.java)
            intent.putExtra("username", username)
            startActivity(intent)
            finish()

        }

        binding.btnAgain.setOnClickListener{

            saveLastResults("username", finalScore)


            val intent = Intent(this, CatagorieActivity::class.java)
            intent.putExtra("username", username)
            startActivity(intent)
            finish()

            }

        }

    private fun saveLastResults(username: String, result: Int){
        intent.putExtra("username", username).toString()
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()

        editor.apply{
            putString(Constants.USER_NAME, username)
            putInt(Constants.LAST_RESULT, result)
            apply()
        }
    }
}