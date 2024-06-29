package kr.ac.kopo.quziproject

object QuestionData6 {
    fun getQuestion(): ArrayList<Question> {
        val queList: ArrayList<Question> = arrayListOf()

        val q1 = Question(
            1,
            "솔직히 순대국엔 깍두기가 OO이지",
            "흑우",
            "영끌",
            "국룰",
            "캘박",
            3
        )
        val q2 = Question(
            2,
            "다음 중 비담의 쓰임이 자연스러운 상황은?",
            "너가 지불하려면 비담 아니야?",
            "비담은 우리만의 일이 아니야",
            "얘가 여기서 비담이야",
            "날씨가 안좋네 비담하려나?",
            3
        )
        val q3 = Question(
            3,
            "다음 중 네넴띤의 쓰임이 자연스러운 상황은?",
            "네넴띤에 소스를 더 넣어 먹으면 맛있어",
            "대답은 네넴띤으로 하자",
            "내 친구 나이는 네넴띤",
            "아 걔는 좀 네넴띤이더라",
            1
        )
        val q4 = Question(
            4,
            "미먼과 가장 관련성이 높은 것은?",
            "미래",
            "방송",
            "로봇",
            "대기",
            4
        )
        val q5 = Question(
            5,
            "다음 중 자낳괴의 의미는?",
            "자식을 낳으면 괴롭다",
            "자본주의가 낳은 괴물",
            "자연이 낳은 괴생명체",
            "자유롭게 날아다니면 괴로움은 사라져",
            2
        )
        val q6 = Question(
            6,
            "아바라의 쓰임이 가장 자연스러운 것은?",
            "내 아바라는 귀렵게 생겼어",
            "아바라와 치즈케잌의 조화가 최고야",
            "아바라, 그렇게 해서 되겠냐?",
            "가나다라 아바라?",
            2
        )
        val q7 = Question(
            7,
            "다음 중 처돌이를 대체할 수 있는 단어는?",
            "차돌박이",
            "순순",
            "덕후",
            "흑우",
            3
        )
        val q8 = Question(
            8,
            "다음 중 팬아저의 쓰임이 자연스러운 상황은?",
            "아이유는 40대 팬아저 많잖아",
            "너무 잘생겨서 팬아저",
            "아 이런건 특히 팬아저로 요리해야 제맛이지",
            "이렇게 먹으면 팬아저",
            2
        )
        val q9 = Question(
            9,
            "법블레스를 할 수 있는 상황은?",
            "친구가 재채기를 하는 경우",
            "동생이 화나게 하는 경우",
            "노블리스 오블리제를 실천해야하는 경우",
            "사촌언니가 취업한 경우",
            2
        )
        val q10 = Question(
            10,
            "고나리자의 쓰임이 자연스러운 상황은",
            "액자 속 눈썹이 없는 고나리자",
            "너 왜 엄마한테 고나리자",
            "초원을 뛰노는 고나리자 한 마리",
            "학교에 고나리자 한 명 있어",
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