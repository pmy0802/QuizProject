package kr.ac.kopo.quziproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnStart = findViewById<ImageButton>(R.id.btnStart)
        btnStart.setOnClickListener {
            var intent = Intent(applicationContext, genreChoice::class.java)
            startActivity(intent)
        }

        var btnEnd = findViewById<ImageButton>(R.id.btnEnd)
        btnEnd.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("종료 확인")
                .setMessage("앱을 종료하시겠습니까?")
                .setPositiveButton("예") { dialog, which ->
                    finish() // 앱 종료
                }
                .setNegativeButton("아니오", null)
                .show()
        }
    }
}