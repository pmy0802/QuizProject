package kr.ac.kopo.quziproject

object QuestionData3 {
    fun getQuestion(): ArrayList<Question3> {
        val queList: ArrayList<Question3> = arrayListOf()

        val q1 = Question3(
            1,
            "다음에 ().",
            "봬요",
            "뵈요",
            1
        )
        val q2 = Question3(
            2,
            "() 반말이야?",
            "어따대고",
            "얻다대고",
            2
        )
        val q3 = Question3(
            3,
            "() 그런 건 아냐.",
            "일부로",
            "일부러",
            2
        )
        val q4 = Question3(
            4,
            "()는 제가 할게요.",
            "설거지",
            "설겆이",
            1
        )
        val q5 = Question3(
            5,
            "거참 ().",
            "희안하네",
            "희한하네",
            2
        )
        val q6 = Question3(
            6,
            "눈에 () 색깔이다.",
            "띠는",
            "띄는",
            2
        )
        val q7 = Question3(
            7,
            "그때 다친 곳 다 ()?",
            "낳았어",
            "나았어",
            2
        )
        val q8 = Question3(
            8,
            "비가 올 거라고는 () 못했어.",
            "예상지",
            "예상치",
            2
        )
        val q9 = Question3(
            9,
            "숙제를 안내면 ()?",
            "어떡해",
            "어떻해",
            1
        )
        val q10 = Question3(
            10,
            "() 만났구나!",
            "오랜만에",
            "오랫만에",
            1
        )


        queList.add(q1)
        queList.add(q2)
        queList.add(q3)
        queList.add(q4)
        queList.add(q5)
        queList.add(q6)
        queList.add(q7)
        queList.add(q8)
        queList.add(q9)
        queList.add(q10)

        return queList
    }
}