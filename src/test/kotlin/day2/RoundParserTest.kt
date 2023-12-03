package day2

import org.junit.jupiter.api.Test

internal class RoundParserTest {

    private val roundParser = RoundParser()

    @Test
    fun parse_nothing() {
        val actual = roundParser.parse("")
        assert(actual.red == 0)
        assert(actual.green == 0)
        assert(actual.blue == 0)
    }

    @Test
    fun parse_unknownColor() {
        val actual = roundParser.parse("20 yellow")
        assert(actual.red == 0)
        assert(actual.green == 0)
        assert(actual.blue == 0)
    }

    @Test
    fun parse_oneColor() {
        val actual = roundParser.parse("2 green")
        assert(actual.red == 0)
        assert(actual.green == 2)
        assert(actual.blue == 0)
    }

    @Test
    fun parse_allColors() {
        val actual = roundParser.parse("2 red, 4 green, 6 blue")
        assert(actual.red == 2)
        assert(actual.green == 4)
        assert(actual.blue == 6)
    }
}