package com.mgprogect.d_dayapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.mgprogect.d_dayapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

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
            val intent = Intent(this, DatePickerSplashActivity::class.java)
            startActivity(intent)
        }

    }
}