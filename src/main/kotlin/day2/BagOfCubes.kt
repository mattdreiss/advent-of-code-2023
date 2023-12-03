package day2

data class BagOfCubes(private val red: Int = 0, private val green: Int = 0, private val blue: Int = 0) {
    fun isPossibleGame(game: Game): Boolean {
        return game.rounds.all { round -> round.red <= red && round.green <= green && round.blue <= blue}
    }

    fun calculatePower(): Int = red * green * blue
}
