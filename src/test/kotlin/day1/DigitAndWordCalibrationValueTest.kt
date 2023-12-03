package day1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class DigitAndWordCalibrationValueTest {
    @Test
    fun getValue_overlappingDigitWords() {
        val calibrationValue = DigitAndWordCalibrationValue("sevenoneight")
        assertEquals(78, calibrationValue.getValue())
    }
}