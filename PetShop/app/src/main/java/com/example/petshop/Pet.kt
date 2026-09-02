package com.example.petshop

abstract class Pet(val name: String, val age: Int) {
    abstract fun speak(): String
}