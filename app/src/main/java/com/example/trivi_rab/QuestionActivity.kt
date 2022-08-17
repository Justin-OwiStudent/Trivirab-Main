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


        //get the question number from previous activity
        var questionNumber = intent.getIntExtra("questionNumber", 0)

        //call for all my questions
        var questions = getAllNarutoQuestions()

        val currentQuestion = questions[questionNumber]


        updateUI(currentQuestion)

        //handle next question click
        binding.btnNextQuestion.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)



            if(questionNumber + 1 > questions.count()) {
                

            }

            //pass next questionvalue
            intent.putExtra("questionNumber", questionNumber + 1)



            //TODO: pass score

            startActivity(intent)
            finish()
        }




//        binding.tvQuestionText.text({questions[0].questionText})


//        binding.answerOne.text = "Hello my naam is Justin"
       // R.id.tv_question_text.




//get the current score from previous question
//        var currentScore = intnent.getIntExtra("currentscore", "0")
//
//        title = "Question" + (questionNumber+1).toString()
//
//        //Capture the answered question
//
//        binding.btnNext.setOnClickListener {
//
//            var selectedAnswer = binding.rgAnswers.checkedRadioButtonid
//
//            if(selectedAnswer == -1) { // -1 means user did not select an answer
//                val toast = Toast.makeText(this, "please select your answer", LENGTH_SHORT)
//                toast.show()
//            } else { // this means the user has selected an answer, lets check correct and navigate
//                var userAnswer = findViewById<RadioButton>(selectedAnswer) // fin the view that has been selected by their radio id
//                log.i("!!! selected answer: ", userAnswer.text.toString())
//
//                //check correct answer
//                if(userAnswer.text.toString() == currentQuestion.optionOne) { //youl have this to be equal corect answer "optionone" is the right answer then
//                    currentScore += 1
//                    log.i("!!! correct? ", "yes")
//                    //OPTIONAL: update UI to show the results if you want them to see correct in real time
//                }
//
//
//                //FINALLY DO NAVIGATION AFTER CHECKING ANSWER
//                //checl if this is the last question
//                if(questionNumber+1 == questions.count()){
//                    //Navigate to results activity
//                    var intent = Intent(this, ResultActivity::class.java)
//                    //pass the Final Score
//                    intent.putExtra("currentScore", currentScore)
//                    startActivity(intent)
//                    finish()
//                } else {
//                    //navigate to next question
//                    val intent = Intent(this, QuestionActivity::class.java)
//                    //pass username and nex questionvalue
//                    intent.putExtra("username", username)
//                    intent.putExtra("questionNumber", questionNumber + 1)
//                    //pass score
//                    intent.putExtra("currentScore", currentScore)
//
//                    startActivity(intent)
//                    finish()
//                }
//        }











//        binding.pbline.progress = currrentQuestion.id
//        binding.tvProgress.text = currrentQuestion.id.toString() + "/3"
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