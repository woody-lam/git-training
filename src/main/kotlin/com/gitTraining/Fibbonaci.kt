package com.gitTraining

fun computeFibbonaciNumber(position: Int, recursion: Boolean = false): Int {
    if (recursion) return recursiveFibbonachi(1, 1, position - 2)

    if (position == 0) return 0
    if (position < 0) {
        val positionIsOdd = position % 2 == -1
        return if (positionIsOdd) computeFibbonaciNumber(-position) else (computeFibbonaciNumber(-position) * -1)
    }

    var i = 1
    var j = 1

    if (position <= 2) return 1
    
    var currentPosition = 2
    while (currentPosition < position) {
        val temp = i
        i = j
        j += temp
        currentPosition ++
    }
    return j
}

fun recursiveFibbonachi(previous: Int, current: Int, stepsLeft: Int): Int {
    if (stepsLeft < 0) return 1
    return when (stepsLeft) {
        0 -> current
        else -> recursiveFibbonachi(current, previous + current, stepsLeft - 1)
    }
}
