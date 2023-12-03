package day1

class DigitCalibrationValue(private val input: String) {
    companion object {
        private const val REGEX: String = "\\d"
    }

    fun getValue(): Int = (findFirstDigit() + findLastDigit()).toInt()

    private fun findFirstDigit(): String = REGEX.toRegex().find(input)?.value ?: "0"

    private fun findLastDigit(): String = REGEX.toRegex().find(input.reversed())?.value ?: "0"
}