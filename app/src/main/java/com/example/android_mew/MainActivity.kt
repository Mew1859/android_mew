package com.example.android_mew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        login.setOnClickListener {
            val username = username_login.text.toString()
            val password = password_login.text.toString()

            if (username == null || password == null){
                Toast.makeText(applicationContext, "$username,$password,null", Toast.LENGTH_SHORT).show()
            }
            if (username == "g@gmail.com" && password == "1234"){
                Toast.makeText(applicationContext, "$username,$password,successful", Toast.LENGTH_SHORT).show()
                val intent = Intent(applicationContext,page2::class.java)
                startActivity(intent)
                finish()
            }
            Toast.makeText(applicationContext, "$username, $password", Toast.LENGTH_SHORT).show()
        }
    }
}