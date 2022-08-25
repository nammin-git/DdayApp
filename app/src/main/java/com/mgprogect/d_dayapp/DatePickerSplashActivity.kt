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
        setContentView(R.layout.activity_date_picker_splash)

        //날짜를 선택할 수 있는 다이얼로그 만들기
        val datePicker = findViewById<TextView>(R.id.deadline_date)
       datePicker?.setOnClickListener {

            val today = GregorianCalendar()
            var year : Int = today.get(Calendar.YEAR)
            var month : Int = today.get(Calendar.MONTH)
            var date : Int = today.get(Calendar.DATE)

            val dlg = DatePickerDialog(this, object : DatePickerDialog.OnDateSetListener{
                override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
                    Log.d("Main", "${year}, ${month+1}, ${dayOfMonth}")
                    datePicker.setText("${year}, ${month+1}, ${dayOfMonth}")

                }
            }, year, month, date)
            dlg.show()

        }

    }
}