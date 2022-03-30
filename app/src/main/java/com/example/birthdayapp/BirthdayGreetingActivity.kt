package com.example.birthdayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeting.*

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name= intent.getStringExtra(NAME_EXTRA)

        textView2.text="Happy Birthday \n$name !! <3"
    }
}