package com.example.practicee

// Create a Dictionary app using mapOf() function where user will type a word and your program should return the meaning of that word.
fun main(){
    val meaning = mapOf(
        "happy" to "feeling good or pleased.",
        "fast" to "moving quickly.",
        "kind" to "being nice or helpful to others.",
        "cold" to "having a low temperature.",
        "big" to "large in size."
    )

    print("Enter the word to find its meaning: ")
    val input: String = readln().lowercase()
    println(meaning[input])
}