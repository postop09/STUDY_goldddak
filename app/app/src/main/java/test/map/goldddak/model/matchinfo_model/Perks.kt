package test.map.goldddak.model.matchinfo_model


import com.google.gson.annotations.SerializedName

data class Perks(
    @SerializedName("statPerks")
    val statPerks: StatPerks?,
    @SerializedName("styles")
    val styles: List<Style>?
)