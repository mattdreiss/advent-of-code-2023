package day1

import utils.InputReader

fun main() {
    val input = InputReader("01.txt").readLines()
    val document = CalibrationDocument(input)

    println("part 1: ${document.findCalibrationNumberDigitsOnly()}")
    println("part 2: ${document.findCalibrationNumberDigitsAndWords()}")
}