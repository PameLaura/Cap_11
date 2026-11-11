package com.example.cap_11

import android.os.Bundle
import android.content.Intent
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

abstract class ExampleActivity(private val layout: Int) : AppCompatActivity() {
 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  val container = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
  val back = Button(this).apply { text = "Volver al menú"; setOnClickListener { finish() } }
  container.addView(back)
  layoutInflater.inflate(layout, container, true)
  container.getChildAt(1).layoutParams = LinearLayout.LayoutParams(-1, 0, 1f)
  setContentView(container)
  ViewCompat.setOnApplyWindowInsetsListener(container) { v, insets ->
   val bars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
   v.setPadding(bars.left, bars.top, bars.right, bars.bottom)
   insets
  }
 }
 protected fun message(value: String) = Toast.makeText(this, value, Toast.LENGTH_SHORT).show()
}

