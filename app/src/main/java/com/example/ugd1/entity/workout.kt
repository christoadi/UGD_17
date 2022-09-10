package com.example.ugd1.entity

import java.time.LocalDate

class workout(
    var jenis: String
) {

    companion object{
        @JvmField
        var userData = arrayOf(
            workout("Jumping Jacks"),
            workout("Russian Twist"),
            workout("Push Up"),
            workout("Heel Touch"),
            workout("Plank"),

        )
    }
}