package com.example.diabetescalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mgInput = findViewById<EditText>(R.id.mgInput)
        mmlInput = findViewById<EditText>(R.id.mmlInput)

        mgInput.setOnClickListener {
            convert("fromMg")
        }
        mmlInput.setOnClickListener {
            convert("fromMml")
        }

    }

    private fun convert(direction: String) {
        if (direction == "fromMg") {
            val value = Integer.parseInt(mgInput.text.toString()) / 18
            mmlInput.setText( value.toString())
        } else {
            val value = Integer.parseInt(mmlInput.text.toString()) * 18
            mgInput.setText( value.toString())
        }
    }
}

