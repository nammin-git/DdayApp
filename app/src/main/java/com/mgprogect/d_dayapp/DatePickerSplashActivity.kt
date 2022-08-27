package com.mgprogect.d_dayapp

import android.app.AlertDialog
import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.DatePicker
import android.widget.TextView
import java.util.*

class DatePickerSplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //dialog를 띄우는 코드
        val mDialogView = LayoutInflater.from(this).inflate(R.layout.custom_dialog, null)
        val mBuilder = AlertDialog.Builder(this)
            .setView(mDialogView)
            .setTitle("THE DAY TODAY")

        val mAlertDialog = mBuilder.show()

        //날짜를 선택할 수 있는 다이얼로그 만들기
        val calendar = Calendar.getInstance()
        var targetYear = calendar.get(Calendar.YEAR)
        var targetMonth = calendar.get(Calendar.MONTH)
        var targetDate = calendar.get(Calendar.DAY_OF_MONTH)

        val dateSelectBtn = findViewById<TextView>(R.id.dday_date)

        dateSelectBtn?.setOnClickListener {

            val datePickerDialog = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view: DatePicker?, year: Int, month: Int, dayOfMonth: Int ->
                dateSelectBtn.text = "${year}년 ${month+1}월 ${dayOfMonth}일"
            }, targetYear, targetMonth, targetDate)

            datePickerDialog.show()
        }

    }
}