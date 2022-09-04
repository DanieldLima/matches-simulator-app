package me.dio.simulator.domain

import com.google.gson.annotations.SerializedName

data class Match(
    val description: String,
    val place: Place,
    @SerializedName("home_team")
    val homeTeam: Team,
    @SerializedName("away_team")
    val awayTeam: Team
)
