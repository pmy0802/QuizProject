package kr.ac.kopo.quziproject

object QuestionData2 {
    fun getQuestion(): ArrayList<Question> {
        val queList: ArrayList<Question> = arrayListOf()

        val q1 = Question(
            1,
            "세븐틴 멤버 수는?",
            "13",
            "17",
            "15",
            "10",
            1
        )
        val q2 = Question(
            1,
            "에스파 멤버가 아닌 사람은?",
            "카리나",
            "닝닝",
            "윈터",
            "설윤",
            4
        )
        val q3 = Question(
            1,
            "뉴진스의 막내는?",
            "혜인",
            "해린",
            "다니엘",
            "하니",
            1
        )
        val q4 = Question(
            1,
            "아이브 멤버 중 한국 멤버가 아닌 사람은?",
            "레이",
            "유진",
            "리즈",
            "이서",
            1
        )
        val q5 = Question(
            1,
            "눈물의 여왕 여자 주인공은?",
            "박소담",
            "송혜교",
            "김지원",
            "김태희",
            3
        )
        val q6 = Question(
            1,
            "유재석의 생일은?",
            "8월14일",
            "8월15일",
            "8월20일",
            "8월26일",
            1
        )
        val q7 = Question(
            1,
            "놀면 뭐하니? 멤버가 아닌 사람은?",
            "하하",
            "유재석",
            "이미주",
            "김종국",
            4
        )
        val q8 = Question(
            1,
            "24년에 나온 드라마가 아닌 것은?",
            "눈물의여왕",
            "선재업고튀어",
            "킹더랜드",
            "피라미드게임",
            3
        )
        val q9 = Question(
            1,
            "하정우가 출연하지 않은 영화는?",
            "비공식작전",
            "백두산",
            "신과함께",
            "비상선언",
            4
        )
        val q10 = Question(
            1,
            "백현은 어떤 그룹 멤버일까?",
            "BTS",
            "EXO",
            "빅뱅",
            "샤이니",
            2
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