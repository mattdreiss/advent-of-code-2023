package day2

import java.util.*
import java.util.stream.Collectors

class GameParser {
    private val roundParser: RoundParser = RoundParser()

    fun parse(input: String): Game = Game(findGameNumber(input), findRounds(input))

    private fun findGameNumber(input: String): Int {
        val split = input.split(":")
        if (split.isEmpty()) {
            return 0
        }

        val regex = "\\d+".toRegex()
        val match = regex.find(split[0])
        return match?.value?.toInt() ?: 0
    }

    private fun findRounds(input: String): List<Round> {
        val split = input.split(":")
        if (split.count() < 2) {
            return Collections.emptyList()
        }

        val roundInputs = split[1].trim().split(";")
        return roundInputs
            .stream()
            .map { i -> roundParser.parse(i) }
            .collect(Collectors.toList())
    }
}