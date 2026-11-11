package com.example.cap_11

import android.os.Bundle
import android.content.Intent
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RelativeTransformActivity : ExampleActivity(R.layout.activity_relative_transform) {
 override fun onCreate(savedInstanceState: Bundle?) {
 super.onCreate(savedInstanceState)
 findViewById<Button>(R.id.action).setOnClickListener { it.animate().translationY(100f).scaleX(1.2f).scaleY(1.2f).setDuration(400).start() }
 }
}
