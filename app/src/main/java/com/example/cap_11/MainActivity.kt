package com.example.cap_11

import android.os.Bundle
import android.content.Intent
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  setContentView(R.layout.activity_main)
  ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
   val bars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
   v.setPadding(bars.left, bars.top, bars.right, bars.bottom)
   insets
  }
  findViewById<Button>(R.id.btnLinearBasic).setOnClickListener { startActivity(Intent(this, LinearBasicActivity::class.java)) }
  findViewById<Button>(R.id.btnLinearLogin).setOnClickListener { startActivity(Intent(this, LinearLoginActivity::class.java)) }
  findViewById<Button>(R.id.btnLinearCard).setOnClickListener { startActivity(Intent(this, LinearCardActivity::class.java)) }
  findViewById<Button>(R.id.btnLinearNested).setOnClickListener { startActivity(Intent(this, LinearNestedActivity::class.java)) }
  findViewById<Button>(R.id.btnLinearWeight).setOnClickListener { startActivity(Intent(this, LinearWeightActivity::class.java)) }
  findViewById<Button>(R.id.btnFrameBasic).setOnClickListener { startActivity(Intent(this, FrameBasicActivity::class.java)) }
  findViewById<Button>(R.id.btnFrameBadge).setOnClickListener { startActivity(Intent(this, FrameBadgeActivity::class.java)) }
  findViewById<Button>(R.id.btnFrameFragment).setOnClickListener { startActivity(Intent(this, FrameFragmentActivity::class.java)) }
  findViewById<Button>(R.id.btnRelativeBasic).setOnClickListener { startActivity(Intent(this, RelativeBasicActivity::class.java)) }
  findViewById<Button>(R.id.btnRelativeTransform).setOnClickListener { startActivity(Intent(this, RelativeTransformActivity::class.java)) }
  findViewById<Button>(R.id.btnConstraintBasic).setOnClickListener { startActivity(Intent(this, ConstraintBasicActivity::class.java)) }
  findViewById<Button>(R.id.btnConstraintGuideline).setOnClickListener { startActivity(Intent(this, ConstraintGuidelineActivity::class.java)) }
  findViewById<Button>(R.id.btnConstraintBarrier).setOnClickListener { startActivity(Intent(this, ConstraintBarrierActivity::class.java)) }
  findViewById<Button>(R.id.btnConstraintChain).setOnClickListener { startActivity(Intent(this, ConstraintChainActivity::class.java)) }
  findViewById<Button>(R.id.btnTableBasic).setOnClickListener { startActivity(Intent(this, TableBasicActivity::class.java)) }
  findViewById<Button>(R.id.btnTableDinamic).setOnClickListener { startActivity(Intent(this, TableDinamicActivity::class.java)) }
  findViewById<Button>(R.id.btnGridBasic).setOnClickListener { startActivity(Intent(this, GridBasicActivity::class.java)) }
  findViewById<Button>(R.id.btnGridCalculator).setOnClickListener { startActivity(Intent(this, GridCalculatorActivity::class.java)) }
  findViewById<Button>(R.id.btnGridGaleria).setOnClickListener { startActivity(Intent(this, GridGaleriaActivity::class.java)) }
  findViewById<Button>(R.id.btnSpaceBasic).setOnClickListener { startActivity(Intent(this, SpaceBasicActivity::class.java)) }
 }
}
