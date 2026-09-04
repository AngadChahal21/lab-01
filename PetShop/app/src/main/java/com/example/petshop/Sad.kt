package com.example.petshop

class Sad(date: String) : Mood(date) {
    override fun describeMood(): String {
        return "Sad on $date"
    }
}