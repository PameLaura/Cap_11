package com.example.cap_11

import android.os.Bundle
import android.content.Intent
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LinearLoginActivity : ExampleActivity(R.layout.activity_linear_login) {
 override fun onCreate(savedInstanceState: Bundle?) {
 super.onCreate(savedInstanceState)
 findViewById<Button>(R.id.action).setOnClickListener {
 val email = findViewById<EditText>(R.id.email)
 val password = findViewById<EditText>(R.id.password)
 when {
 !android.util.Patterns.EMAIL_ADDRESS.matcher(email.text.toString()).matches() -> email.error = "Escribe un correo válido"
 password.text.isBlank() -> password.error = "Escribe una contraseña"
 else -> message("Formulario válido · ejemplo local")
 }
 }
 }
}
