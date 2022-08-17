package com.example.trivi_rab.models

object Constants {
        // this function will return all my questions
    fun getAllNarutoQuestions() : ArrayList<Question> {
        //Create my empty arraylist
        var allQuestions = ArrayList<Question>()

        //create data
        val que1 = Question(
            1,
            "What Character always wears a mask?",
            "Naruto Uzumaki",
            "Kakashi Sensei",
            "Saske Uchiha",
            "Neji Huga"
        )
            val que2 = Question(
                2,
                "Which character posesses the sharingan",
                "Saske Uchiha",
                "Naruto Uzumaki",
                "Rock Lee",
                "Hinata Huga"
            )
            //add question to array
            allQuestions.add(que1)
            allQuestions.add(que2)

        //return data
            return allQuestions
    }

    //TODO: add cartoon questions
    fun getAllCartoonQuestions() : ArrayList<Question> {
        //Create my empty arraylist
        var allQuestions = ArrayList<Question>()

        //create data
        val que1 = Question(
            1,
            "What Cartoon had a purple dog?",
            "Naruto Uzumaki",
            "Kakashi Sensei",
            "Saske Uchiha",
            "Neji Huga"
        )
        //add question to array
        allQuestions.add(que1)

        //return data
        return allQuestions
    }


    //TODO: add disney questions

}