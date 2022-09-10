package com.example.ugd1.entity

import java.time.LocalDate

class user(
    var username: String, var password: String,
    var noTelp: Int, var email: String, val date: LocalDate?
) {

    companion object{
        @JvmField
        var userData = arrayOf(
            user("","",0,"",null)
        )
    }
}