package org.example
class Student(name: String, age: Int) : Human(name, age) {
    val courses = mutableListOf<CourseRecord>()  // List to store courses

    // Add a new course to student's record
    fun addCourse(course: CourseRecord) {
        courses.add(course)
    }

    // Calculate average grade (weighted by credits)
    fun weightedAverage(): Double {
        if (courses.isEmpty()) return 0.0

        val totalWeightedGrade = courses.sumOf { it.grade * it.credits }
        val totalCredits = courses.sumOf { it.credits }
        return totalWeightedGrade / totalCredits
    }

    // Find lowest and highest grades
    fun minMaxGrades(): Pair<Double, Double> {
        if (courses.isEmpty()) return Pair(0.0, 0.0)

        val minGrade = courses.minOf { it.grade }
        val maxGrade = courses.maxOf { it.grade }
        return Pair(minGrade, maxGrade)
    }
}
