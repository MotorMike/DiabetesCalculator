package com.example.diabetescalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.TextView.OnEditorActionListener
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity() {

    lateinit var mgInput: EditText
    lateinit var mmlInput: EditText
    lateinit var startTimerBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mgInput = findViewById<EditText>(R.id.mgInput)
        mmlInput = findViewById<EditText>(R.id.mmlInput)
        startTimerBtn = findViewById(R.id.timerStartBtn)

        mgInput.setOnClickListener {
            convert("fromMg")
        }
        mmlInput.setOnClickListener {
            convert("fromMml")
        }
        startTimerBtn.setOnClickListener {
            startTimer();
        }

    }

    private fun convert(direction: String) {
        if (direction == "fromMg") {
            val value = mgInput.text.toString().toFloat() / 18
            mmlInput.setText(value.toString())
        } else {
            val value = mmlInput.text.toString().toFloat() * 18
            mgInput.setText(value.toString())
        }
    }

    private fun startTimer() {
        var timeView = findViewById<EditText>(R.id.timeRemainingView)
        timeView.setText("15");
    }
}

