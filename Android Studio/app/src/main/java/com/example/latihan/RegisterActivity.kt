package com.example.latihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var etusernames : EditText
    private lateinit var etpassword : EditText
    private lateinit var etConfirmpassword : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etusernames = findViewById(R.id.edt_usernames)
        etpassword = findViewById(R.id.edt_password)
        etConfirmpassword = findViewById(R.id.edt_confrm_password)


        val btnRegister: Button = findViewById(R.id.btn_register)
        btnRegister.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.btn_register -> {

                val bundle = Bundle()
                bundle.putString("username", etusernames.text.toString())
                bundle.putString("password",etpassword.text.toString())

                val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)

            }
        }
    }
}