package test.map.goldddak.model.matchinfo_model


import com.google.gson.annotations.SerializedName

data class StatPerks(
    @SerializedName("defense")
    val defense: Int?,
    @SerializedName("flex")
    val flex: Int?,
    @SerializedName("offense")
    val offense: Int?
)