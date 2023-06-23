package com.example.proguardassignment.models

data class Student(
    val name: String,
    val rollNumber: Int,
    val score: Double,
    val rank: Int,
    val hobbies: List<Hobby>,
    val friends: List<Student>
)
