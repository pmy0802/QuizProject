package kr.ac.kopo.quziproject

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat

class proverb : AppCompatActivity(), View.OnClickListener {
    private var currentPosition: Int = 1
    private var selectedOption: Int = 0
    private var score: Int = 0
    private lateinit var questionList: ArrayList<Question>
    private var canSelectOption: Boolean = true // 선택 가능 여부 플래그

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proverb)

        questionList = QuestionData.getQuestion()
        getQuestionData()

        findViewById<TextView>(R.id.option1_text).setOnClickListener(this)
        findViewById<TextView>(R.id.option2_text).setOnClickListener(this)
        findViewById<TextView>(R.id.option3_text).setOnClickListener(this)
        findViewById<TextView>(R.id.option4_text).setOnClickListener(this)

        findViewById<Button>(R.id.submit_btn).setOnClickListener {
            if (selectedOption != 0 && canSelectOption) {
                canSelectOption = false // 선택 불가능 상태로 변경
                val question = questionList[currentPosition - 1]

                if (selectedOption != question.correct_answer) {
                    setOptionColor(selectedOption, R.drawable.wrong_option_background)
                    setOptionColor(question.correct_answer, R.drawable.correct_option_background)
                    showCorrectAnswerDialog(question.correct_answer)
                } else {
                    score++
                    setOptionColor(question.correct_answer, R.drawable.correct_option_background)
                    moveToNextQuestionWithDelay()
                }
            } else if (selectedOption == 0) {
                showSelectAnswerDialog()
            }
        }
        // 홈버튼
        val homeBtn = findViewById<Button>(R.id.home_btn)
        homeBtn.setOnClickListener {
            var intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun getQuestionData() {
        setOptionStyle()

        val question = questionList[currentPosition - 1]

        findViewById<ProgressBar>(R.id.progressBar).progress = currentPosition
        findViewById<ProgressBar>(R.id.progressBar).max = questionList.size

        findViewById<TextView>(R.id.progress_text).text = getString(R.string.progress_text_format, currentPosition, questionList.size)
        findViewById<TextView>(R.id.question_text).text = question.question

        findViewById<TextView>(R.id.option1_text).text = question.option_one
        findViewById<TextView>(R.id.option2_text).text = question.option_two
        findViewById<TextView>(R.id.option3_text).text = question.option_three
        findViewById<TextView>(R.id.option4_text).text = question.option_four

        setSubmitBtn()
    }

    private fun setSubmitBtn() {
        val btnText = if (currentPosition == questionList.size) "제출" else "다음"
        findViewById<Button>(R.id.submit_btn).text = btnText
    }

    private fun setOptionStyle() {
        val optionList: ArrayList<TextView> = arrayListOf()
        optionList.add(findViewById(R.id.option1_text))
        optionList.add(findViewById(R.id.option2_text))
        optionList.add(findViewById(R.id.option3_text))
        optionList.add(findViewById(R.id.option4_text))

        for (op in optionList) {
            op.setTextColor(Color.parseColor("#555151"))
            op.background = ContextCompat.getDrawable(this, R.drawable.option_background)
            op.typeface = Typeface.DEFAULT
        }
        selectedOption = 0 // 선택된 옵션 초기화
    }

    private fun setOptionColor(opt: Int, color: Int) {
        when (opt) {
            1 -> findViewById<TextView>(R.id.option1_text).background = ContextCompat.getDrawable(this, color)
            2 -> findViewById<TextView>(R.id.option2_text).background = ContextCompat.getDrawable(this, color)
            3 -> findViewById<TextView>(R.id.option3_text).background = ContextCompat.getDrawable(this, color)
            4 -> findViewById<TextView>(R.id.option4_text).background = ContextCompat.getDrawable(this, color)
        }
    }

    override fun onClick(view: View) {
        if (canSelectOption) { // 선택 가능 여부 확인
            when (view.id) {
                R.id.option1_text -> selectedOptionStyle(findViewById(R.id.option1_text), 1)
                R.id.option2_text -> selectedOptionStyle(findViewById(R.id.option2_text), 2)
                R.id.option3_text -> selectedOptionStyle(findViewById(R.id.option3_text), 3)
                R.id.option4_text -> selectedOptionStyle(findViewById(R.id.option4_text), 4)
            }
        }
    }

    private fun selectedOptionStyle(view: TextView, opt: Int) {
        setOptionStyle()
        selectedOption = opt
        view.setTextColor(Color.parseColor("#5F00FF"))
        view.background = ContextCompat.getDrawable(this, R.drawable.selected_option_background)
        view.typeface = Typeface.DEFAULT_BOLD
    }

    private fun showCorrectAnswerDialog(correctAnswer: Int) {
        val correctAnswerText = when (correctAnswer) {
            1 -> findViewById<TextView>(R.id.option1_text).text
            2 -> findViewById<TextView>(R.id.option2_text).text
            3 -> findViewById<TextView>(R.id.option3_text).text
            4 -> findViewById<TextView>(R.id.option4_text).text
            else -> ""
        }

        AlertDialog.Builder(this)
            .setTitle("오답")
            .setMessage("정답: $correctAnswerText")
            .setPositiveButton("확인") { dialog, _ ->
                dialog.dismiss()
                moveToNextQuestionWithDelay()
            }
            .setCancelable(false)
            .show()
    }

    private fun showSelectAnswerDialog() {
        AlertDialog.Builder(this)
            .setTitle("선택 필요")
            .setMessage("답변을 선택해 주세요.")
            .setPositiveButton("확인") { dialog, _ ->
                dialog.dismiss()
            }
            .setCancelable(false)
            .show()
    }

    private fun moveToNextQuestionWithDelay() {
        Handler(Looper.getMainLooper()).postDelayed({
            moveToNextQuestion()
        }, 500) // 0.5초 딜레이 후 다음 질문으로 이동
    }

    private fun moveToNextQuestion() {
        currentPosition++
        if (currentPosition <= questionList.size) {
            getQuestionData()
        } else {
            val intent = Intent(this@proverb, ResultActivity::class.java)
            intent.putExtra("score", score)
            intent.putExtra("totalSize", questionList.size)
            startActivity(intent)
            finish()
        }
        canSelectOption = true // 선택 가능 상태로 변경
    }
}
