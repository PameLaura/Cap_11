package com.example.cap_11

import android.os.Bundle
import android.content.Intent
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TableDinamicActivity : ExampleActivity(R.layout.activity_table_dinamic) {
 override fun onCreate(savedInstanceState: Bundle?) {
 super.onCreate(savedInstanceState)
 findViewById<Button>(R.id.action).setOnClickListener {
 val table = findViewById<TableLayout>(R.id.table)
 val row = TableRow(this)
 listOf("Producto ${table.childCount}", "S/ 10.00").forEach { value -> row.addView(TextView(this).apply { text=value; setPadding(12,12,12,12); layoutParams=TableRow.LayoutParams(0, -2, 1f) }) }
 table.addView(row)
 }
 }
}
