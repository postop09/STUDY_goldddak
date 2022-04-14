package test.map.goldddak.model.matchinfo_model


import com.google.gson.annotations.SerializedName

data class Info(
    @SerializedName("gameCreation")
    val gameCreation: Long?,
    @SerializedName("gameDuration")
    val gameDuration: Int?,
    @SerializedName("gameEndTimestamp")
    val gameEndTimestamp: Long?,
    @SerializedName("gameId")
    val gameId: Long?,
    @SerializedName("gameMode")
    val gameMode: String?,
    @SerializedName("gameName")
    val gameName: String?,
    @SerializedName("gameStartTimestamp")
    val gameStartTimestamp: Long?,
    @SerializedName("gameType")
    val gameType: String?,
    @SerializedName("gameVersion")
    val gameVersion: String?,
    @SerializedName("mapId")
    val mapId: Int?,
    @SerializedName("participants")
    val participants: List<Participant>?,
    @SerializedName("platformId")
    val platformId: String?,
    @SerializedName("queueId")
    val queueId: Int?,
    @SerializedName("teams")
    val teams: List<Team>?,
    @SerializedName("tournamentCode")
    val tournamentCode: String?
)