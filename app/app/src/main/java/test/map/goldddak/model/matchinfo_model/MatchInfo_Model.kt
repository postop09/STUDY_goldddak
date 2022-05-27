package test.map.goldddak.model.matchinfo_model


import com.google.gson.annotations.SerializedName

data class MatchInfo_Model(
    @SerializedName("info")
    val info: Info?,
    @SerializedName("metadata")
    val metadata: Metadata?
)