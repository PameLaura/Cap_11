package com.example.cap_11

import android.os.Bundle
import android.content.Intent
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GridGaleriaActivity : ExampleActivity(R.layout.activity_grid_galeria) {
 override fun onCreate(savedInstanceState: Bundle?) {
 super.onCreate(savedInstanceState)
 val grid = findViewById<GridLayout>(R.id.grid)
 repeat(12) { index -> grid.addView(Button(this).apply { text="${index+1}"; layoutParams=GridLayout.LayoutParams().apply { width=0; columnSpec=GridLayout.spec(GridLayout.UNDEFINED, 1f) }; setOnClickListener { message("Imagen ${index+1}") } }) }
 }
}
