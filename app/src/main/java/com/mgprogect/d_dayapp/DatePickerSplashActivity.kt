package com.mgprogect.d_dayapp

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.TextView
import java.util.*

class DatePickerSplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //날짜를 선택할 수 있는 다이얼로그 만들기
        val calendar = Calendar.getInstance()
        val targetYear = calendar.get(Calendar.YEAR)
        val targetMonth = calendar.get(Calendar.MONTH)
        val targetDate = calendar.get(Calendar.DAY_OF_MONTH)

        val dateSelectBtn = findViewById<TextView>(R.id.dday_date)

        dateSelectBtn?.setOnClickListener {

            val datePickerDialog = DatePickerDialog(this, { view: DatePicker?, year: Int, month: Int, dayOfMonth: Int ->
                    dateSelectBtn.text = "${year}년 ${month + 1}월 ${dayOfMonth}일"
                }, targetYear, targetMonth, targetDate)

            datePickerDialog.show()
        }

    }
}