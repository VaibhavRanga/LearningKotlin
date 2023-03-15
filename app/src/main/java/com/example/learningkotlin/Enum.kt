package com.example.learningkotlin

fun main () {
    println("Today is: " + WeekDays.MONDAY)

    for (day in WeekDays.values()) {
        if (day.holiday) {
            println("" + day + " is a holiday")
        }
    }
}

enum class WeekDays (val holiday: Boolean = false) {
    SUNDAY(true),
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY(true)
}