fun main() {
    var wordOne = "Modern"
    var wordTwo = "Concise"
    var wordThree = "Pragmatic"
    var wordFour = "Safe"
    val baris = """
        Kotlin is $wordOne
        Kotlin is $wordTwo
        Kotlin is $wordThree
        Kotlin is $wordFour
        """.trimIndent()

    print(baris)
}