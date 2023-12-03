package day2

class RoundParser {
    fun parse(input: String): Round {
        var red = 0
        var green = 0
        var blue = 0

        val colorInputs = input.trim().split(",")

        for (colorInput: String in colorInputs) {
            val split = colorInput.trim().split("\\s".toRegex())
            if (split.count() < 2) {
                continue
            }

            val number = split[0].trim().toInt()
            when (split[1].trim()) {
                "red" -> {
                    red = number
                }
                "green" -> {
                    green = number
                }
                "blue" -> {
                    blue = number
                }
            }
        }

        return Round(red, green, blue)
    }
}