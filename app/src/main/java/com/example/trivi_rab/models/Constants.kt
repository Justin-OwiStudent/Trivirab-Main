package com.example.trivi_rab.models

object Constants {
        // this function will return all my questions
    fun getAllNarutoQuestions() : ArrayList<Question> {
        //Create my empty arraylist
        var allNarutoQuestions = ArrayList<Question>()

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
            val que3 = Question(
                3,
                "What tailed beast does Naruto posses ?",
                "One Tails",
                "Three Tails",
                "Five Tails",
                "Nine Tails"
            )
            val que4 = Question(
                4,
                "Which character posesses the biakugan",
                "Saske Uchiha",
                "Naruto Uzumaki",
                "Rock Lee",
                "Hinata Huga"
            )
            val que5 = Question(
                5,
                "which Character can only do tai Jutsu?",
                "Saske Uchiha",
                "Naruto Uzumaki",
                "Rock Lee",
                "Hinata Huga"
            )
            val que6 = Question(
                6,
                "who became the 6th hokage?",
                "Kakashi Hatake",
                "Naruto Uzumaki",
                "Sasuske Uchiha",
                "Neji Huga"
            )
            val que7 = Question(
                7,
                "Which character can make multiple ShadowClones",
                "Saske Uchiha",
                "Naruto Uzumaki",
                "Rock Lee",
                "Hinata Huga"
            )
            val que8 = Question(
                8,
                "Who was not a student of Kakashi Sensei",
                "Saske Uchiha",
                "Naruto Uzumaki",
                "Sakura ",
                "Hinata Huga"
            )
            //add question to array
            allNarutoQuestions.add(que1)
            allNarutoQuestions.add(que2)
            allNarutoQuestions.add(que3)
            allNarutoQuestions.add(que4)
            allNarutoQuestions.add(que5)
            allNarutoQuestions.add(que6)
            allNarutoQuestions.add(que7)
            allNarutoQuestions.add(que8)

            //return data
            return allNarutoQuestions
    }

    //TODO: add cartoon questions
    fun getAllCartoonQuestions() : ArrayList<Question> {
        //Create my empty arraylist
        var allCartoonQuestions = ArrayList<Question>()

        //create data
        val que1 = Question(
            1,
            "What Cartoon had a purple dog?",
            "Currage The Cowerdly Dog",
            "Rug Rats",
            "The simpsons",
            "Code name kids next door"
        )
        val que2 = Question(
            1,
            "Which cartoon was based on babies?",
            "Rug Rats",
            "Code name kids next door",
            "Power Puff girls",
            "Spongebob"
        )
        val que3 = Question(
            1,
            "What Cartoon was based under the sea ?",
            "Spongebob Squarepants",
            "powerPuff girls",
            "The simpsons",
            "Family guy"
        )
        val que4 = Question(
            1,
            "What Cartoon had a talking dog?",
            "Rug Rats",
            "Family GUy",
            "the simpons",
            "Johnny Bravo"
        )
        val que5 = Question(
            1,
            "What cartoon is said to have predicted the future?",
            "The simpsons",
            "Family Guy",
            "Johnny bravo",
            "Rug Rats"
        )
        val que6 = Question(
            1,
            "What Cartoon was based on Small blue people?",
            "The Simpsons",
            "Smurfs",
            "Rug Rats",
            "Family guy"
        )
        val que7 = Question(
            1,
            "What was the dogs name in Family Guy?",
            "Petter",
            "Brian",
            "Louis",
            "Chris"
        )




        //add question to array
        allCartoonQuestions.add(que1)
        allCartoonQuestions.add(que2)
        allCartoonQuestions.add(que3)
        allCartoonQuestions.add(que4)
        allCartoonQuestions.add(que5)
        allCartoonQuestions.add(que6)
        allCartoonQuestions.add(que7)


        //return data
        return allCartoonQuestions
    }


    //TODO: add disney questions
    fun getAllDisneyQuestions() : ArrayList<Question> {
        //Create my empty arraylist
        var allDisneyQuestions = ArrayList<Question>()

        //create data
        val que1 = Question(
            1,
            "Which movie had a floating house?",
            "Naruto Uzumaki",
            "Kakashi Sensei",
            "Saske Uchiha",
            "Neji Huga"
        )
        val que2 = Question(
            1,
            "Which movie was based on lions?",
            "Cinderella",
            "Lion King",
            "Moana",
            "Nemo"
        )
        val que3 = Question(
            1,
            "Which movie was based on fish ?",
            "Moana",
            "Finding Nemo",
            "Lion King",
            "Beauty and the Beast"
        )
        val que4 = Question(
            1,
            "Which movie had a floating house?",
            "Naruto Uzumaki",
            "Kakashi Sensei",
            "Saske Uchiha",
            "Neji Huga"
        )
        val que5 = Question(
            1,
            "Which movie had a Geni?",
            "Cinderella",
            "Alladin",
            "Princess and the Frog",
            "Finding Nemo"
        )
        val que6 = Question(
            1,
            "What movie had a, not so real boy?",
            "Finding Nemo",
            "Pinocio",
            "Allading",
            "Cinderella"
        )

        //add question to array
        allDisneyQuestions.add(que1)
        allDisneyQuestions.add(que2)
        allDisneyQuestions.add(que3)
        allDisneyQuestions.add(que4)
        allDisneyQuestions.add(que5)
        allDisneyQuestions.add(que6)

        //return data
        return allDisneyQuestions
    }
}