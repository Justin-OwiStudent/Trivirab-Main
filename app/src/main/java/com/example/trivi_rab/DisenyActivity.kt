package com.example.trivi_rab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        //call for all my questions
        val questions = Constants.getAllDisneyQuestions()

        val currentQuestion = questions[questionNumber]


        updateUI(currentQuestion)

        //handle next question click
        binding.btnNextQuestion.setOnClickListener{

            if(questionNumber + 1 == questions.count()) {
                val intent = Intent(this, resultActivity::class.java)
                //TODO: pass final score
                startActivity(intent)
                finish()

            } else {

                val intent = Intent(this, QuestionActivity::class.java)
                //pass next questionvalue
                intent.putExtra("questionNumber", questionNumber + 1)

                //TODO: pass score

                startActivity(intent)
                finish()
            }

        }



    }

    fun updateUI(currentQuestion: Question) {
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