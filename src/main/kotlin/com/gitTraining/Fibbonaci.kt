package com.gitTraining

fun computeFibbonaciNumber(position: Int?): Int {
    var notNullPosition = position
    if (notNullPosition == null) {
        notNullPosition = 1
    }
    var i = 1
    var j = 1

    if (notNullPosition <= 2) return 1

    var currentPosition = 2
    while (currentPosition < notNullPosition) {
        val temp = i
        i = j
        j += temp
        currentPosition ++
    }
    return j
}
