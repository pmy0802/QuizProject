package kr.ac.kopo.quziproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val score = intent.getIntExtra("score", 0)
        val totalSize = intent.getIntExtra("totalSize", 0)

        // 점수 보여주기
        val scoreText = findViewById<TextView>(R.id.score_text)
        scoreText.text = getString(R.string.progress_text_format, score, totalSize)

        // 다시하기 버튼
        val resetBtn = findViewById<Button>(R.id.reset_btn)
        resetBtn.setOnClickListener {
            val intent = Intent(this@ResultActivity, genreChoice::class.java)
            startActivity(intent)
        }

        val homeBtn = findViewById<Button>(R.id.home_btn)
        homeBtn.setOnClickListener {
            var intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}