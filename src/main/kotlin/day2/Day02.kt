package day2

import utils.InputReader
import java.util.stream.Collectors

fun main() {
    val input = InputReader("02.txt").readLines()
    val gameParser = GameParser()

    val games = input
        .stream()
        .map { i -> gameParser.parse(i) }
        .collect(Collectors.toList())

    val partOne = sumPossibleGameIds(games)
    val partTwo = sumMinimumBagOfCubesPower(games)

    println("part 1: $partOne")
    println("part 2: $partTwo")
}

private fun sumPossibleGameIds(games: List<Game>): Int {
    val bagOfCubes = BagOfCubes(red = 12, green = 13, blue = 14)
    return games
        .stream()
        .filter { g -> bagOfCubes.isPossibleGame(g) }
        .collect(Collectors.summingInt { g -> g.number })
}

private fun sumMinimumBagOfCubesPower(games: List<Game>): Int {
    return games
        .stream()
        .map { g -> g.findSmallestBagOfCubesRequired() }
        .collect(Collectors.summingInt { b -> b.calculatePower() })
}