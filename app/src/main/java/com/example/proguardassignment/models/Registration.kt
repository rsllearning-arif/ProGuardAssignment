package com.example.proguardassignment.models

class Registration {
    private var registeredStudents = mutableListOf<Student>()

    fun findStudentsByHobby(hobby: Hobby): List<Student> {
        return registeredStudents.filter {
            it.hobbies.map { hobby -> hobby.name }
                .contains(hobby.name)
        }
    }

    fun registerStudent(student: Student) {
        registeredStudents.add(student)
    }
}