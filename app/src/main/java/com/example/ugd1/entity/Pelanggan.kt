package com.example.ugd1.entity

class Pelanggan(
    var nama: String, var umur: Int,
    var noTelp: String, var gender: String
) {

    companion object{
        @JvmField
        var userData = arrayOf(
            Pelanggan("Ace Nasutiyon",19,"087816234217","Laki-laki"),
            Pelanggan("Erik Somba",20,"081292742817","Laki-laki"),
            Pelanggan("Aldyo Karnavion",18,"081292816352","Laki-laki"),
            Pelanggan("Ella Margaretta",19,"087791726255","Perempuan"),
            Pelanggan("Rafa Markomar",21,"081262518499","Laki-laki"),
        )
    }
}