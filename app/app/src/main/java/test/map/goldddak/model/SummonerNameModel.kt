package test.map.goldddak.model

data class TotalModel(
    val goldSummonerName: MutableList<GoldModel>,
    val silverSummonerName: MutableList<SilverModel>,
    val bronzeSummonerName:MutableList<BronzeModel>
)

data class GoldModel(
    val goldSummonerName:String?
)

data class SilverModel(
    val silverSummonerName:String?
)

data class BronzeModel(
    val bronzeSummonerName:String?
)

data class GoldpuuidModel(
    var goldpuuid:String
)

