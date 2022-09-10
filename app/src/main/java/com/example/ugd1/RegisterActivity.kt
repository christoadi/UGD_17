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
    lateinit var mainLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_register)

        tilUsername = findViewById(R.id.etUsername)
        tilPassword = findViewById(R.id.etPassword)
        tilEmail = findViewById(R.id.etEmail)
        tilTanggalLahir = findViewById(R.id.etTanggalLahir)
        tilNomorTelepon = findViewById(R.id.etNomorTelepon)
        btnRegister = findViewById(R.id.btnRegister)
        btnClear = findViewById(R.id.btnClear)

        btnClear.setOnClickListener{
            tilUsername.editText?.setText("")
            tilPassword.editText?.setText("")
            tilEmail.editText?.setText("")
            tilTanggalLahir.editText?.setText("")
            tilNomorTelepon.editText?.setText("")

            Snackbar.make(mainLayout, "Success Clear Field", Snackbar.LENGTH_LONG).show()
        }
        btnRegister.setOnClickListener(View.OnClickListener {

            var checkLogin = false
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

            if(username.isNotEmpty() && password.isNotEmpty() && email.isNotEmpty() && tanggalLahir.isNotEmpty() && nomorTelepon.isNotEmpty()){
                val moveLogin = Intent(this@RegisterActivity, MainActivity::class.java)
                startActivity(moveLogin)

                checkLogin = true
            }
            if(!checkLogin) return@OnClickListener


        })
    }

}