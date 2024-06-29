import kr.ac.kopo.quziproject.Question2

object QuestionData4 {
    fun getQuestion2(): ArrayList<Question2> {
        val queList: ArrayList<Question2> = arrayListOf()

        val q1 = Question2(
            1,
            "세계에서 가장 긴 강은?",
            "나일강",
            "아프리카"
        )
        val q2 = Question2(
            2,
            "인구가 가장 많은 대륙은?",
            "아시아",
            "한국, 일본, 인도 등이 속함"
        )
        val q3 = Question2(
            3,
            "후백제를 세운 사람은?",
            "견훤",
            "ㄱㅎ"
        )
        val q4 = Question2(
            4,
            "조선시대 왕은 총 몇명이었을까?(숫자만 입력)",
            "27",
            "20명 보다 많음"
        )
        val q5 = Question2(
            5,
            "발해를 세운 사람은?",
            "대조영",
            "드라마 제목으로도 있음"
        )
        val q6 = Question2(
            6,
            "우리나라에서 가장 긴 강은?",
            "압록강",
            "ㅇㄹ강"
        )
        val q7 = Question2(
            7,
            "우리나라 국보 1호는?",
            "숭례문",
            "남대문이라고도 함(ㅅㄹㅁ)"
        )
        val q8 = Question2(
            8,
            "세계에서 가장 넓은 나라는?",
            "러시아",
            "연방제 국가"
        )
        val q9 = Question2(
            9,
            "마이크로 소프트 창업자는?",
            "빌게이츠",
            "ㅂㄱㅇㅊ"
        )
        val q10 = Question2(
            10,
            "12지신 띠 중 첫번째는?",
            "쥐",
            "1글자"
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
