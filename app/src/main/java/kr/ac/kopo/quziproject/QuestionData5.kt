import kr.ac.kopo.quziproject.Question2

object QuestionData5 {
    fun getQuestion2(): ArrayList<Question2> {
        val queList: ArrayList<Question2> = arrayListOf()

        val q1 = Question2(
            1,
            "사과를 한입 베어 먹으면?",
            "파인애플",
            "열대과일"
        )
        val q2 = Question2(
            2,
            "무가 넥타이를 매면?",
            "무에타이",
            "격투 기술 중 하나"
        )
        val q3 = Question2(
            3,
            "콩이 바쁘면",
            "콩비지",
            "바쁘다를 영어로"
        )
        val q4 = Question2(
            4,
            "매일 가슴에 흑심을 품고 있는 것은?",
            "연필",
            "학용품"
        )
        val q5 = Question2(
            5,
            "왕이 넘어지면?",
            "킹콩",
            "동물"
        )
        val q6 = Question2(
            6,
            "세상에서 가장 큰 코는?",
            "멕시코",
            "나라이름"
        )
        val q7 = Question2(
            7,
            "엄마가 길을 잃으면?",
            "맘마미아",
            "이탈리아어로 세상에, 맙소사!라는 뜻"
        )
        val q8 = Question2(
            8,
            "진짜 새의 이름은 무엇인가?",
            "참새",
            "새 종류 중 하나"
        )
        val q9 = Question2(
            9,
            "키가 거꾸로 자라는 건?",
            "고드름",
            "얼음"
        )
        val q10 = Question2(
            10,
            "너 가수 비 알아?를 4글자로 줄이면?",
            "너비아니",
            "음식"
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
