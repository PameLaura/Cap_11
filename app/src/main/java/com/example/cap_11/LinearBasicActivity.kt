package com.example.cap_11

import android.os.Bundle
import android.content.Intent
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LinearBasicActivity : ExampleActivity(R.layout.activity_linear_basic) {
 override fun onCreate(savedInstanceState: Bundle?) {
 super.onCreate(savedInstanceState)
 findViewById<Button>(R.id.action).setOnClickListener { message("Acción realizada en el ejemplo") }
 }
}
