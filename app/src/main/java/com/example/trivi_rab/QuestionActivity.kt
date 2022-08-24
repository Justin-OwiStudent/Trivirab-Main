package com.example.trivi_rab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import com.example.trivi_rab.databinding.ActivityQuestionBinding
import com.example.trivi_rab.models.Constants.getAllNarutoQuestions
import com.example.trivi_rab.models.Constants.getAllCartoonQuestions
import com.example.trivi_rab.models.Question

class QuestionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //infaltes the activity binding into our content
        binding = ActivityQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val username = intent.getStringExtra("username")
        //get the question number from previous activity
        val questionNumber = intent.getIntExtra("questionNumber", 0)

        //get the current score from previous question
        var currentScore = intent.getIntExtra("currentScore", 0)

        binding.tvProgress.text = (questionNumber+1).toString()

        //call for all my questions
        val questions = getAllNarutoQuestions()

        val currentQuestion = questions[questionNumber]


        updateUI(currentQuestion)

        //handle next question click
        binding.btnNextQuestion.setOnClickListener{

            var selectedAnswer = binding.rgAnswers.checkedRadioButtonId

            if(selectedAnswer == -1) { //not selected answer
                val toast = Toast.makeText(this, "Please select an answer", LENGTH_SHORT)
                toast.show()
            } else { // selected answer correct and navigate
                var userAnswer = findViewById<RadioButton>(selectedAnswer)

                //check correct answer
                if(userAnswer.text.toString() == currentQuestion.optionTwo) {
                    currentScore += 1

                    //TODO: update ui to show if answer is right
                }


                if(questionNumber + 1 == questions.count()) {
                    val intent = Intent(this, resultActivity::class.java)
                    intent.putExtra("currentScore", currentScore)
                    intent.putExtra("username", username)
                    startActivity(intent)
                    finish()
                } else {
                    val intent = Intent(this, QuestionActivity::class.java)
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

        //progressbar

        binding.pbLine.progress = currentQuestion.id
        binding.tvProgress.text = currentQuestion.id.toString() + "/7"

    }
}