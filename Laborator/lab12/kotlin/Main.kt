package lab12.kotlin

import java.util.*

fun main() {
    val classroom = Classroom(
        Random().nextLong(),
        listOf(
            Student(
                id = Random().nextLong(),
                surname = "Florin",
                name = "Mihalache"
            ),
            Student(
                id = Random().nextLong(),
                surname = "George",
                name = "Mocanu"
            ),
            Student(
                id = Random().nextLong(),
                surname = "Constantin",
                name = "Raducanu"
            )
        )
    )

    println(classroom)
}