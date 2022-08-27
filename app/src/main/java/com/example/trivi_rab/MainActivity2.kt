package com.example.trivi_rab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.trivi_rab.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.btnStart.setOnClickListener {
            val username = binding.etUsername.text

            if (username.toString() == ""){
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "$username", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Landing::class.java)

                intent.putExtra("username", "$username")

                startActivity(intent)
                finish()
            }
        }


    }
}