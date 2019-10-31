package com.example.responsi184

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val Email = findViewById<EditText>(R.id.txt_username)
        val Password = findViewById<EditText>(R.id.txt_pasword)



        btn_login.setOnClickListener {
            val email = Email.text.toString()
            val password = Password.text.toString()
            if (email.equals("prana@gmail.com") && password.equals("Hesoyam1998")){
                //toast("* success !", Toast.LENGTH_LONG)

                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            } else  {
                 toast("Silahkan Masukan Dengan Benar !",Toast.LENGTH_LONG)
            }
        }
        btn_register.setOnClickListener {
            intent = Intent(this,RegisterActivity::class.java)
        startActivity(intent)

        }
    }
    fun toast(message: String,lengthLong: Int=Toast.LENGTH_LONG){
        Toast.makeText(this,message,lengthLong).show()
    }

}
