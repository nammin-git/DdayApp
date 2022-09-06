package com.mgprogect.d_dayapp

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.DatePicker
import android.widget.TextView
import java.util.*

class DatePickerSplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.custom_dialog)

        //날짜를 선택할 수 있는 다이얼로그 만들기
        val calendar = Calendar.getInstance()
        val targetYear = calendar.get(Calendar.YEAR)
        val targetMonth = calendar.get(Calendar.MONTH)
        val targetDate = calendar.get(Calendar.DAY_OF_MONTH)

        val rvDate = findViewById<TextView>(R.id.rv_date)

         val datePickerDialog = DatePickerDialog(this, object : DatePickerDialog.OnDateSetListener {
             override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
                 Log.d("DatePickerSplash", "${year}, ${month+1}, ${dayOfMonth}")
                 rvDate.text = "${year}, ${month+1}, ${dayOfMonth}"
             }

         }, targetYear, targetMonth, targetDate)

        datePickerDialog.show()


    }
}