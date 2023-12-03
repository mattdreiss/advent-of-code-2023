package day1

class DigitAndWordCalibrationValue(private val input: String) {
    companion object {
        private const val REGEX: String = "\\d|one|two|three|four|five|six|seven|eight|nine"
        private val WORD_TO_VALUE: Map<String, String> = mapOf(
            "one" to "1",
            "two" to "2",
            "three" to "3",
            "four" to "4",
            "five" to "5",
            "six" to "6",
            "seven" to "7",
            "eight" to "8",
            "nine" to "9"
        )
    }

    fun getValue(): Int {
        return "${findFirstDigit()}${findLastDigit()}".toInt()
    }

    private fun findFirstDigit(): String {
        val token = REGEX.toRegex().find(input)
        return if (token == null) "0" else convertToDigit(token.value)
    }

    private fun findLastDigit(): String {
        val regex = REGEX.toRegex()
        var pos = input.length - 1
        while (pos >= 0) {
            val substr = input.substring(pos)
            val token = regex.find(substr)
            if (token != null) {
                return convertToDigit(token.value)
            }
            pos--
        }

        return "0"
    }

    private fun convertToDigit(token: String): String {
        if (token.length > 1) {
            return WORD_TO_VALUE.getValue(token)
        }

        return token
    }
}