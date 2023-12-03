package day2

data class Game(val number: Int, val rounds: List<Round>) {
    fun findSmallestBagOfCubesRequired(): BagOfCubes {
        var redMax = 0
        var greenMax = 0
        var blueMax = 0

        for (round: Round in rounds) {
            if (round.red > redMax) redMax = round.red
            if (round.green > greenMax) greenMax = round.green
            if (round.blue > blueMax) blueMax = round.blue
        }

        return BagOfCubes(red = redMax, green = greenMax, blue = blueMax)
    }
}