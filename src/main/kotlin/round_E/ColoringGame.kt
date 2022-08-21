package round_E

fun main() {
    val testNumber: Int = readLine()!!.toInt()
    val gameCellsNumber = Array(testNumber){0}
    val computerRecords = Array(testNumber){0}

    for (i in 0 until testNumber){
        gameCellsNumber[i] = readLine()!!.toInt()
    }

    var i = 0
    gameCellsNumber.forEach {gameCell -> Int
        if (gameCell % 5 != 0){
        computerRecords[i] += gameCell/5 + 1
        }
        else{
            computerRecords[i] += gameCell/5
        }
        println("Case #${i+1}: ${computerRecords[i]}")
        i++
    }
}