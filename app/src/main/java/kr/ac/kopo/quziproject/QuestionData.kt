package kr.ac.kopo.quziproject

object QuestionData {
    fun getQuestion(): ArrayList<Question> {
        val queList: ArrayList<Question> = arrayListOf()

        val q1 = Question(
            1,
            "가을 OO는 문 걸어 잠그고 먹는다",
            "부추",
            "상추",
            "대추",
            "고추",
            2
        )
        val q2 = Question(
            1,
            "눈은 있어도 OO이 없다",
            "눈썹",
            "망울",
            "중심",
            "의지",
            2
        )
        val q3 = Question(
            1,
            "장꾼은 하나인데 OOOO는 열둘이라",
            "개구쟁이",
            "고집쟁이",
            "풍각쟁이",
            "쑥부쟁이",
            3
        )
        val q4 = Question(
            1,
            "식은 O 먹기",
            "밥",
            "떡",
            "면",
            "죽",
            4
        )
        val q5 = Question(
            1,
            "OOO도 나무에서 떨어진다",
            "원숭이",
            "부엉이",
            "독수리",
            "고릴라",
            1
        )
        val q6 = Question(
            1,
            "말 한마디에 OOO도 갚는다",
            "한냥빚",
            "백냥빚",
            "천냥빚",
            "만냥빚",
            3
        )
        val q7 = Question(
            1,
            "낫놓고 OO자도 모른다",
            "기역",
            "니은",
            "디귿",
            "리을",
            1
        )
        val q8 = Question(
            1,
            "바른말 하는 사람 OO 못 받는다",
            "대우",
            "인정",
            "예쁨",
            "귀염",
            4
        )
        val q9 = Question(
            1,
            "도둑이 제 O 저린다",
            "손",
            "발",
            "뼈",
            "턱",
            2
        )
        val q10 = Question(
            1,
            "벗 줄 것은 없어도 OO 줄 것은 있다.",
            "친구",
            "손님",
            "누이",
            "도둑",
            4
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