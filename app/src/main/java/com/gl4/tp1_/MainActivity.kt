package com.gl4.tp1_

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var txtEmail: EditText
    lateinit var btnLogin: Button
    lateinit var txtPassword: EditText
    lateinit var txtResult: TextView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtEmail = findViewById(R.id.editTextEmail)
        txtPassword = findViewById(R.id.editTextPassword)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener { view -> login(view)
        }
    }
    fun login(v: View) {
        if (txtEmail.text.toString() == "admin" && txtPassword.text.toString() == "admin") {
            val intent = Intent(v.context,WelcomeActivity::class.java)
            intent.putExtra("email",txtEmail.text.toString())
            startActivity(intent)
            val text = "Connecté"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext,text, duration)
            toast.show()
        } else {
            val text = "votre email ${txtEmail.text} ou mdp ${txtPassword.text} sont incorrectes"
         //   txtResult.setText("votre email ${txtEmail.text} ou mdp ${txtPassword.text} sont incorrectes")
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext,text, duration)
            toast.show()
        }
    }

    override fun onClick(view: View?) {
        if (view?.id == R.id.btnLogin) {
            if (txtEmail.text.toString() == "admin" && txtPassword.text.toString() == "admin") {
                val text = "Connecté"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext,text, duration)
                toast.show()
            } else {
                val text = "votre email ${txtEmail.text} ou mdp ${txtPassword.text} sont incorrectes"
                //   txtResult.setText("votre email ${txtEmail.text} ou mdp ${txtPassword.text} sont incorrectes")
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext,text, duration)
                toast.show()
            }
        }
    }

}