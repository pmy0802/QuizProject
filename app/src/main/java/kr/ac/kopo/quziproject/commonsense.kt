package kr.ac.kopo.quziproject

import QuestionData4
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class commonsense : AppCompatActivity(), View.OnClickListener {
    private var currentPosition: Int = 1
    private var score: Int = 0
    private lateinit var questionList: ArrayList<Question2>
    private var canSubmitAnswer: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nonsense)

        questionList = QuestionData4.getQuestion2()
        getQuestionData()

        findViewById<Button>(R.id.submit_btn).setOnClickListener {
            if (canSubmitAnswer) {
                val userAnswer = findViewById<EditText>(R.id.answer_input).text.toString()
                if (userAnswer.isNotEmpty()) {
                    canSubmitAnswer = false
                    val question = questionList[currentPosition - 1]

                    if (userAnswer.equals(question.correct_answer, true)) {
                        score++
                        showCorrectAnswerDialog(true, question.correct_answer)
                    } else {
                        showCorrectAnswerDialog(false, question.correct_answer)
                    }
                } else {
                    showSelectAnswerDialog()
                }
            }
        }

        findViewById<ImageButton>(R.id.hint_btn).setOnClickListener {            showHintDialog()
        }

        findViewById<Button>(R.id.home_btn).setOnClickListener {
            startActivity(Intent(applicationContext, MainActivity::class.java))
            finish()
        }
    }

    private fun getQuestionData() {
        val question = questionList[currentPosition - 1]

        findViewById<ProgressBar>(R.id.progressBar).progress = currentPosition
        findViewById<ProgressBar>(R.id.progressBar).max = questionList.size

        findViewById<TextView>(R.id.progress_text).text = getString(R.string.progress_text_format, currentPosition, questionList.size)
        findViewById<TextView>(R.id.question_text).text = question.question

        findViewById<EditText>(R.id.answer_input).text.clear()
        findViewById<TextView>(R.id.hint_text).visibility = View.GONE
        findViewById<TextView>(R.id.hint_text).text = question.hint

        setSubmitBtn()
    }

    private fun setSubmitBtn() {
        val btnText = if (currentPosition == questionList.size) "제출" else "다음"
        findViewById<Button>(R.id.submit_btn).text = btnText
    }

    private fun showCorrectAnswerDialog(isCorrect: Boolean, correctAnswer: String) {
        val title = if (isCorrect) "정답" else "오답"
        val message = if (isCorrect) "정답입니다!" else "정답은 $correctAnswer 입니다."

        AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton("확인") { dialog, _ ->
                dialog.dismiss()
                moveToNextQuestionWithDelay()
            }
            .setCancelable(false)
            .show()
    }

    private fun showHintDialog() {
        AlertDialog.Builder(this)
            .setTitle("힌트 보기")
            .setMessage("힌트를 보시겠습니까?")
            .setPositiveButton("확인") { dialog, _ ->
                dialog.dismiss()
                findViewById<TextView>(R.id.hint_text).visibility = View.VISIBLE
            }
            .setNegativeButton("취소") { dialog, _ ->
                dialog.dismiss()
            }
            .setCancelable(false)
            .show()
    }

    private fun showSelectAnswerDialog() {
        AlertDialog.Builder(this)
            .setTitle("선택 필요")
            .setMessage("답변을 입력해 주세요.")
            .setPositiveButton("확인") { dialog, _ ->
                dialog.dismiss()
            }
            .setCancelable(false)
            .show()
    }

    private fun moveToNextQuestionWithDelay() {
        Handler(Looper.getMainLooper()).postDelayed({
            moveToNextQuestion()
        }, 500)
    }

    private fun moveToNextQuestion() {
        currentPosition++
        if (currentPosition <= questionList.size) {
            getQuestionData()
        } else {
            val intent = Intent(this@commonsense, ResultActivity::class.java)
            intent.putExtra("score", score)
            intent.putExtra("totalSize", questionList.size)
            startActivity(intent)
            finish()
        }
        canSubmitAnswer = true
    }

    override fun onClick(view: View) {
        if (view.id == R.id.hint_btn) {
            showHintDialog()
        }
    }
}
