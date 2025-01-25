package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val student = Student("John", 20)

    // Kotlin's named parameters
    val course = CourseRecord(
        name = "Math",
        yearCompleted = 2023,
        credits = 5,
        grade = 4.0
    )

    student.addCourse(course)

    // Kotlin string template
    println("Student ${student.name} is ${student.age} years old")
}