package com.example.latihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var tv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.textView8)

        val username = intent.getParcelableExtra<User>("User")?.username
        val password = intent.getParcelableExtra<User>("User")?.password
        tv.text = "Username: $username dan Password : $password"



        val btn_implicit: Button = findViewById(R.id.btn_implicit)
        btn_implicit.setOnClickListener(this)

        val btnfragment : Button = findViewById(R.id.btn_fragment)
        btnfragment.setOnClickListener(this)
    }

    override fun onClick(im: View) {
        when(im.id) {
            R.id.btn_implicit -> {
                val message = "hallo infinite learning"
                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT, message)
                intent.type = "text/plain"
                startActivity(intent)

                val kiki = Intent()
                kiki.putExtra("history", "Anda sudah login!")
                setResult(RESULT_OK, kiki)
                finish()
            }
            R.id.btn_fragment -> {
                val dede = Intent(this@MainActivity, TestActivity::class.java)
                startActivity(dede)
            }
        }
    }
}