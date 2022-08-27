package com.example.trivi_rab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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

        val username = intent.getStringExtra("username").toString()

        Log.i("username", username)


//        val intent = Intent(this, CatagorieActivity::class.java)

        binding.btnAnime.setOnClickListener{
            Log.i("username", username)
            intent.putExtra("username", username)
            val intent = Intent(this, QuestionActivity::class.java)
            startActivity(intent)

        }

        binding.btnCartoon.setOnClickListener{
            intent.putExtra("username", username)
            val intent = Intent(this, CartoonActivity::class.java)
            startActivity(intent)

        }
//
        binding.btnDisney.setOnClickListener{
            intent.putExtra("username", username)
            val intent = Intent(this, DisenyActivity::class.java)
            startActivity(intent)

        }

        binding.btnSettings.setOnClickListener{
            intent.putExtra("username", username)
            val intent = Intent(this, settingsActivity::class.java)
            startActivity(intent)
        }

        //get last results
        binding.fabInfo.setOnClickListener{
//            val username = intent.putExtra("username", username)
            val sharedPref = getSharedPreferences("myPref", MODE_PRIVATE)
            val username = sharedPref.getString(Constants.USER_NAME, "username")
            val lastResult = sharedPref.getInt(Constants.LAST_RESULT, 0)

            val toast = Toast.makeText(this, "Last User: $username ($lastResult)", Toast.LENGTH_LONG)
            toast.show()
        }

//        val intent = Intent(this, )
    }
}