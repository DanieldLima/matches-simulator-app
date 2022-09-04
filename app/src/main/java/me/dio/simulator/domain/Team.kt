package me.dio.simulator.domain

data class Team(
    val name: String,
    val stars: Int,
    val image: String,
    var score: Int?
)
