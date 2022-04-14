package test.map.goldddak.model.matchinfo_model


import com.google.gson.annotations.SerializedName

data class Ban(
    @SerializedName("championId")
    val championId: Int?,
    @SerializedName("pickTurn")
    val pickTurn: Int?
)