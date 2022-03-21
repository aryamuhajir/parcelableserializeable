package com.binar.chapter3d

import java.io.Serializable

data class Person(
    val nama : String,
    val umur : Int,
    val alamat : String,
    val hobi : String
    ) : Serializable
