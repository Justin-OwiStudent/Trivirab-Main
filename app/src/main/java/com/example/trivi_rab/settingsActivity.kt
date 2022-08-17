package com.example.trivi_rab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.slider.RangeSlider



class settingsActivity : AppCompatActivity() {

    private lateinit var rangeSlider: RangeSlider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

//        rangeSlider = findViewById(R.id.sliderRange)
    }
}