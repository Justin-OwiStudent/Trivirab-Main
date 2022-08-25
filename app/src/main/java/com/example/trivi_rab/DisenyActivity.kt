package com.example.trivi_rab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import com.example.trivi_rab.databinding.ActivityQuestionBinding
import com.example.trivi_rab.models.Constants
import com.example.trivi_rab.models.Question

class DisenyActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //get the question number from previous activity
        val questionNumber = intent.getIntExtra("questionNumber", 0)

        var currentScore = intent.getIntExtra("currentScore", 0)

        val username = intent.getStringExtra("username")

        //call for all my questions
        val questions = Constants.getAllDisneyQuestions()

        val currentQuestion = questions[questionNumber]


        updateUI(currentQuestion)

        //handle next question click
        binding.btnNextQuestion.setOnClickListener{

            var selectedAnswer = binding.rgAnswers.checkedRadioButtonId

            if(selectedAnswer == -1) { //not selected answer
                val toast = Toast.makeText(this, "Please select an answer", Toast.LENGTH_SHORT)
                toast.show()
            } else { // selected answer correct and navigate
                var userAnswer = findViewById<RadioButton>(selectedAnswer)

                //check correct answer
                if(userAnswer.text.toString() == currentQuestion.optionThree) {
                    currentScore += 1



                }


                if(questionNumber + 1 == questions.count()) {
                    val intent = Intent(this, resultActivity::class.java)
                    intent.putExtra("currentScore", currentScore)
                    intent.putExtra("username", username)
                    startActivity(intent)
                    finish()
                } else {
                    val intent = Intent(this, DisenyActivity::class.java)
                    //pass next questionvalue
                    intent.putExtra("questionNumber", questionNumber + 1)
                    intent.putExtra("currentScore", currentScore)
                    intent.putExtra("username", username)
                    startActivity(intent)
                    finish()
                }
            }
        }



    }

    private fun updateUI(currentQuestion: Question) {
        if (currentQuestion.id == 1){
            binding.tvQuestionText.text = "${currentQuestion.questionText}"
        }else {
            binding.tvQuestionText.text = "${currentQuestion.questionText}"
        }
        binding.rbAnswerOne.text = currentQuestion.optionOne
        binding.rbAnswerTwo.text = currentQuestion.optionTwo
        binding.rbAnswerThree.text = currentQuestion.optionThree
        binding.rbAnswerFour.text = currentQuestion.optionFour
    }


}