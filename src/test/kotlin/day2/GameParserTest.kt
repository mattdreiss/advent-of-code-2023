package day2

import org.junit.jupiter.api.Test

internal class GameParserTest {

    private val gameParser = GameParser()

    @Test
    fun parse_validGame() {
        val actual = gameParser.parse("Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red")

        assert(actual.number == 4)
        assert(actual.rounds.count() == 3)
    }
}