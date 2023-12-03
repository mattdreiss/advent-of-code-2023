package day1

import java.util.stream.Collectors

class CalibrationDocument(private val document: List<String>) {
    fun findCalibrationNumberDigitsOnly(): Int =
        document
            .stream()
            .map { i -> DigitCalibrationValue(i).getValue() }
            .collect(Collectors.toList())
            .sum()

    fun findCalibrationNumberDigitsAndWords(): Int =
        document
            .stream()
            .map { i -> DigitAndWordCalibrationValue(i).getValue() }
            .collect(Collectors.toList())
            .sum()
}
