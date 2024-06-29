package kr.ac.kopo.quziproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class genreChoice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_genre_choice)

        var btn1 = findViewById<ImageButton>(R.id.btn1)
        btn1.setOnClickListener {
            var intent = Intent(applicationContext, proverb::class.java)
            startActivity(intent)
            finish()
        }

        var btn2 = findViewById<ImageButton>(R.id.btn2)
        btn2.setOnClickListener {
            var intent = Intent(applicationContext, celebrity::class.java)
            startActivity(intent)
            finish()
        }

        var btn3 = findViewById<ImageButton>(R.id.btn3)
        btn3.setOnClickListener {
            var intent = Intent(applicationContext, spelling::class.java)
            startActivity(intent)
            finish()
        }

        var btn4 = findViewById<ImageButton>(R.id.btn4)
        btn4.setOnClickListener {
            var intent = Intent(applicationContext, commonsense::class.java)
            startActivity(intent)
            finish()
        }

        var btn5 = findViewById<ImageButton>(R.id.btn5)
        btn5.setOnClickListener {
            var intent = Intent(applicationContext, nonsense::class.java)
            startActivity(intent)
            finish()
        }

        var btn6 = findViewById<ImageButton>(R.id.btn6)
        btn6.setOnClickListener {
            var intent = Intent(applicationContext, neologism::class.java)
            startActivity(intent)
            finish()
        }

        // 홈버튼
        val homeBtn = findViewById<ImageButton>(R.id.home_btn)
        homeBtn.setOnClickListener {
            var intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}