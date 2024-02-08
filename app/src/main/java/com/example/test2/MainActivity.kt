package com.example.test2

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var quiz: Button
    private lateinit var cal: Button
    private lateinit var log: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        quiz = findViewById(R.id.quiz)
        cal = findViewById(R.id.cal)
        log = findViewById(R.id.log)


        quiz.setOnClickListener {
            openProject("com.example.ez_04_quiz_11_hataiporn")
        }
        cal.setOnClickListener {
            openProject("com.example.calculator1")
        }
        log.setOnClickListener {
            openProject("com.example.loginandregistersql")
        }
    }


    private fun openProject(packageName: String) {
        val intent = packageManager.getLaunchIntentForPackage(packageName)
        if (intent != null) {
            startActivity(intent)
        } else {
            // แสดงข้อความว่าไม่พบแอปพลิเคชัน
            Toast.makeText(this, "ไม่พบแอปพลิเคชัน", Toast.LENGTH_SHORT).show()
            Log.e("MainActivity", "ไม่พบแอปพลิเคชันสำหรับแพ็คเกจ: $packageName")
        }

    }
}