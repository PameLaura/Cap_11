package com.example.cap_11

import android.os.Bundle
import android.content.Intent
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GridCalculatorActivity : ExampleActivity(R.layout.activity_grid_calculator) {
 override fun onCreate(savedInstanceState: Bundle?) {
 super.onCreate(savedInstanceState)
 setupCalculator()
 }

 private var first: Double? = null
 private var operation = ""
 private var fresh = true
 private fun setupCalculator() {
 val display = findViewById<TextView>(R.id.display)
 val keys = listOf("7","8","9","÷","4","5","6","×","1","2","3","−","C","0","=","+")
 keys.forEachIndexed { index, key -> findViewById<Button>(resources.getIdentifier("key$index", "id", packageName)).setOnClickListener {
 val current = display.text.toString().toDoubleOrNull() ?: 0.0
 when {
 key == "C" -> { first=null; operation=""; display.text="0"; fresh=true }
 key.all { it.isDigit() } -> { display.text=if(fresh || display.text=="0") key else display.text.toString()+key; fresh=false }
 key == "=" -> { val a=first; if(a!=null && operation.isNotEmpty()) {
 val result=when(operation) { "+" -> a+current; "−" -> a-current; "×" -> a*current; else -> if(current==0.0) Double.NaN else a/current }
 display.text=if(result.isFinite()) java.math.BigDecimal.valueOf(result).stripTrailingZeros().toPlainString() else "Error"
 first=null; operation=""; fresh=true
 } }
 else -> { first=current; operation=key; fresh=true }
 }
 } }
 }
}
