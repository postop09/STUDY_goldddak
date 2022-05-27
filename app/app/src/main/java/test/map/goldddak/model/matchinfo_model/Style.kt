package test.map.goldddak.model.matchinfo_model


import com.google.gson.annotations.SerializedName

data class Style(
    @SerializedName("description")
    val description: String?,
    @SerializedName("selections")
    val selections: List<Selection>?,
    @SerializedName("style")
    val style: Int?
)