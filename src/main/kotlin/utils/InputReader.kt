package utils

import java.io.File

class InputReader(private val fileName: String) {
    fun readLines(): List<String> {
        val resource = this.javaClass.classLoader.getResource(fileName)?.path ?: ""
        return File(resource).readLines()
    }
}
