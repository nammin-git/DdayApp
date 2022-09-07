package com.mgprogect.d_dayapp

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.DatePicker
import android.widget.ImageButton
import android.widget.TextView
import com.mgprogect.d_dayapp.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //header 의 버튼 클릭 시 동작
        val plusListBtn = findViewById<ImageButton>(R.id.plus_list_btn)
        val myAccountBtn = findViewById<ImageButton>(R.id.my_account_btn)

        plusListBtn.setOnClickListener{
            //리스트를 만들기

        }

        myAccountBtn.setOnClickListener {
            //개인 정보 화면으로 이동
            val intent = Intent(this, MyAccountActivity::class.java)
            startActivity(intent)
        }


        //날짜 선택하기 버튼 클릭 시 동작
        val selectDateBtn = findViewById<TextView>(R.id.rv_date)
        selectDateBtn?.setOnClickListener {
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
}