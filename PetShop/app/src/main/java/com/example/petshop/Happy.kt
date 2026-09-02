package com.example.petshop

public class Happy(date: String) : Mood(date) {
    override fun describeMood(): String {
        return "Happy"
    }
}