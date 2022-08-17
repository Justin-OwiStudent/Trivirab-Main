package com.example.trivi_rab.models

//Data keyword = blueprint
data class Question (
        val id: Int,
        val questionText: String,
//        val icon: Int,
        val optionOne: String,
        val optionTwo: String,
        val optionThree: String,
        val optionFour: String
        )