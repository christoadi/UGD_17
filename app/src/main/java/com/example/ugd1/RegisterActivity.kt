package com.example.ugd1

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import android.content.Intent
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout

class RegisterActivity: AppCompatActivity() {
    private lateinit var tilUsername: TextInputLayout
    private lateinit var tilPassword: TextInputLayout
    private lateinit var tilEmail: TextInputLayout
    private lateinit var tilTanggalLahir: TextInputLayout
    private lateinit var tilNomorTelepon: TextInputLayout
    private lateinit var btnRegister: Button
    private lateinit var btnClear: Button
    private lateinit var registerLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        tilUsername = findViewById(R.id.etUsername)
        tilPassword = findViewById(R.id.etPassword)
        tilEmail = findViewById(R.id.etEmail)
        tilTanggalLahir = findViewById(R.id.etTanggalLahir)
        tilNomorTelepon = findViewById(R.id.etNomorTelepon)
        val btnRegister: Button = findViewById(R.id.btnRegister)
        val btnClear: Button = findViewById(R.id.btnClear)
        var checkLogin = true

        btnRegister.setOnClickListener(View.OnClickListener {
            val mBundle = Bundle()
            val intent = Intent(this, MainActivity::class.java)

            val username: String = tilUsername.getEditText()?.getText().toString()
            val password: String = tilPassword.getEditText()?.getText().toString()
            val email: String = tilEmail.getEditText()?.getText().toString()
            val tanggalLahir: String = tilTanggalLahir.getEditText()?.getText().toString()
            val nomorTelepon: String = tilNomorTelepon.getEditText()?.getText().toString()

            if(username.isEmpty()){
                tilUsername.setError("Username masih Kosong")
                checkLogin = false
            }

            if(password.isEmpty()){
                tilPassword.setError("Password masih Kosong")
                checkLogin = false
            }

            if(email.isEmpty()) {
                tilEmail.setError("Email masih Kosong")
                checkLogin = false
            }

            if(tanggalLahir.isEmpty()){
                tilTanggalLahir.setError("Tanggal Lahir masih Kosong")
                checkLogin = false
            }

            if(nomorTelepon.isEmpty()){
                tilNomorTelepon.setError("Nomor Telepon masih Kosong")
                checkLogin = false
            }

            if(!username.isEmpty() && !password.isEmpty() && !email.isEmpty() && !tanggalLahir.isEmpty() && !nomorTelepon.isEmpty()){
                checkLogin = true
            }

            if(tilUsername.getEditText()?.getText()==null){
                tilUsername.getEditText()?.setText("")
            }

            if(tilPassword.getEditText()?.getText()==null){
                tilPassword.getEditText()?.setText("")
            }

            if(checkLogin == true){
                val moveRegister = Intent(this@RegisterActivity, MainActivity::class.java)
                mBundle.putString("username", tilUsername.editText?.text.toString())
                mBundle.putString("password", tilPassword.editText?.text.toString())
                mBundle.putString("email", tilEmail.editText?.text.toString())
                mBundle.putString("TanggalLahir", tilTanggalLahir.editText?.text.toString())
                mBundle.putString("NomorTelepon", tilNomorTelepon.editText?.text.toString())
                moveRegister.putExtra("register", mBundle)
                startActivity(moveRegister)
            }
            if(!checkLogin) return@OnClickListener
        })

        btnClear.setOnClickListener{
            tilUsername.editText?.setText("")
            tilPassword.editText?.setText("")
            tilEmail.editText?.setText("")
            tilTanggalLahir.editText?.setText("")
            tilNomorTelepon.editText?.setText("")

        }


    }

}