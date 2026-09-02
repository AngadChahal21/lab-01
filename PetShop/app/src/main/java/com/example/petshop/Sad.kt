package com.example.petshop

public class Sad(date: String) : Mood(date) {
    override fun describeMood(): String {
        return "Sad"
    }
}