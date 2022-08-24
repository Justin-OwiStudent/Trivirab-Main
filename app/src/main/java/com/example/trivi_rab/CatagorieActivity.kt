package com.example.trivi_rab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.trivi_rab.databinding.ActivityCatagorieBinding
import com.example.trivi_rab.databinding.ActivityQuestionBinding
import com.example.trivi_rab.models.Constants

class CatagorieActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCatagorieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catagorie)

        binding = ActivityCatagorieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra("username")


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

        //get last results
        binding.fabInfo.setOnClickListener{
            val sharedPref = getSharedPreferences("myPref", MODE_PRIVATE)
            val lastUser = sharedPref.getString(Constants.LAST_USER, "None")
            val lastResult = sharedPref.getInt(Constants.LAST_RESULT, 0)

            val toast = Toast.makeText(this, "Last User: $lastUser ($lastResult)", Toast.LENGTH_LONG)
            toast.show()
        }

//        val intent = Intent(this, )
    }
}