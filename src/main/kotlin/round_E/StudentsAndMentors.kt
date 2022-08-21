package round_E

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val testsNumber = scanner.nextInt()
    val studentsNumbers = Array(testsNumber){0}
    val cases = Array(testsNumber){"Case #"}

    for (i in 0  until testsNumber){
        studentsNumbers[i] = scanner.nextInt()
        val studentsRatings = Array(studentsNumbers[i]){0}
        for (j in 0 until studentsNumbers[i]){
            studentsRatings[j] = scanner.nextInt()
        }

        cases[i] += "${i + 1}: "
        for (j in studentsRatings.indices)
        cases[i] += " ${searchMentorRating(studentsRatings, j)}"

    }

    cases.forEach { case -> String()
        println(case)
    }

}

private fun searchMentorRating(studentsRatings: Array<Int>, studentPosition: Int): Int {
    var mentorRating = -1
    var studentRating = studentsRatings[studentPosition]
    val limit = studentRating * 2

    var i = 0
    studentsRatings.forEach { rating -> Int
        if (i != studentPosition && rating <= limit && mentorRating < rating) {
            mentorRating = rating
        }
        i++
    }
    return mentorRating
}
