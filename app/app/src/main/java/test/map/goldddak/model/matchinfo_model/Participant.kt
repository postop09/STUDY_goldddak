package test.map.goldddak.model.matchinfo_model


import com.google.gson.annotations.SerializedName

data class Participant(
    @SerializedName("assists")
    val assists: Int?,
    @SerializedName("baronKills")
    val baronKills: Int?,
    @SerializedName("bountyLevel")
    val bountyLevel: Int?,
    @SerializedName("challenges")
    val challenges: Challenges?,
    @SerializedName("champExperience")
    val champExperience: Int?,
    @SerializedName("champLevel")
    val champLevel: Int?,
    @SerializedName("championId")
    val championId: Int?,
    @SerializedName("championName")
    val championName: String?,
    @SerializedName("championTransform")
    val championTransform: Int?,
    @SerializedName("consumablesPurchased")
    val consumablesPurchased: Int?,
    @SerializedName("damageDealtToBuildings")
    val damageDealtToBuildings: Int?,
    @SerializedName("damageDealtToObjectives")
    val damageDealtToObjectives: Int?,
    @SerializedName("damageDealtToTurrets")
    val damageDealtToTurrets: Int?,
    @SerializedName("damageSelfMitigated")
    val damageSelfMitigated: Int?,
    @SerializedName("deaths")
    val deaths: Int?,
    @SerializedName("detectorWardsPlaced")
    val detectorWardsPlaced: Int?,
    @SerializedName("doubleKills")
    val doubleKills: Int?,
    @SerializedName("dragonKills")
    val dragonKills: Int?,
    @SerializedName("eligibleForProgression")
    val eligibleForProgression: Boolean?,
    @SerializedName("firstBloodAssist")
    val firstBloodAssist: Boolean?,
    @SerializedName("firstBloodKill")
    val firstBloodKill: Boolean?,
    @SerializedName("firstTowerAssist")
    val firstTowerAssist: Boolean?,
    @SerializedName("firstTowerKill")
    val firstTowerKill: Boolean?,
    @SerializedName("gameEndedInEarlySurrender")
    val gameEndedInEarlySurrender: Boolean?,
    @SerializedName("gameEndedInSurrender")
    val gameEndedInSurrender: Boolean?,
    @SerializedName("goldEarned")
    val goldEarned: Int?,
    @SerializedName("goldSpent")
    val goldSpent: Int?,
    @SerializedName("individualPosition")
    val individualPosition: String?,
    @SerializedName("inhibitorKills")
    val inhibitorKills: Int?,
    @SerializedName("inhibitorTakedowns")
    val inhibitorTakedowns: Int?,
    @SerializedName("inhibitorsLost")
    val inhibitorsLost: Int?,
    @SerializedName("item0")
    val item0: Int?,
    @SerializedName("item1")
    val item1: Int?,
    @SerializedName("item2")
    val item2: Int?,
    @SerializedName("item3")
    val item3: Int?,
    @SerializedName("item4")
    val item4: Int?,
    @SerializedName("item5")
    val item5: Int?,
    @SerializedName("item6")
    val item6: Int?,
    @SerializedName("itemsPurchased")
    val itemsPurchased: Int?,
    @SerializedName("killingSprees")
    val killingSprees: Int?,
    @SerializedName("kills")
    val kills: Int?,
    @SerializedName("lane")
    val lane: String?,
    @SerializedName("largestCriticalStrike")
    val largestCriticalStrike: Int?,
    @SerializedName("largestKillingSpree")
    val largestKillingSpree: Int?,
    @SerializedName("largestMultiKill")
    val largestMultiKill: Int?,
    @SerializedName("longestTimeSpentLiving")
    val longestTimeSpentLiving: Int?,
    @SerializedName("magicDamageDealt")
    val magicDamageDealt: Int?,
    @SerializedName("magicDamageDealtToChampions")
    val magicDamageDealtToChampions: Int?,
    @SerializedName("magicDamageTaken")
    val magicDamageTaken: Int?,
    @SerializedName("neutralMinionsKilled")
    val neutralMinionsKilled: Int?,
    @SerializedName("nexusKills")
    val nexusKills: Int?,
    @SerializedName("nexusLost")
    val nexusLost: Int?,
    @SerializedName("nexusTakedowns")
    val nexusTakedowns: Int?,
    @SerializedName("objectivesStolen")
    val objectivesStolen: Int?,
    @SerializedName("objectivesStolenAssists")
    val objectivesStolenAssists: Int?,
    @SerializedName("participantId")
    val participantId: Int?,
    @SerializedName("pentaKills")
    val pentaKills: Int?,
    @SerializedName("perks")
    val perks: Perks?,
    @SerializedName("physicalDamageDealt")
    val physicalDamageDealt: Int?,
    @SerializedName("physicalDamageDealtToChampions")
    val physicalDamageDealtToChampions: Int?,
    @SerializedName("physicalDamageTaken")
    val physicalDamageTaken: Int?,
    @SerializedName("profileIcon")
    val profileIcon: Int?,
    @SerializedName("puuid")
    val puuid: String?,
    @SerializedName("quadraKills")
    val quadraKills: Int?,
    @SerializedName("riotIdName")
    val riotIdName: String?,
    @SerializedName("riotIdTagline")
    val riotIdTagline: String?,
    @SerializedName("role")
    val role: String?,
    @SerializedName("sightWardsBoughtInGame")
    val sightWardsBoughtInGame: Int?,
    @SerializedName("spell1Casts")
    val spell1Casts: Int?,
    @SerializedName("spell2Casts")
    val spell2Casts: Int?,
    @SerializedName("spell3Casts")
    val spell3Casts: Int?,
    @SerializedName("spell4Casts")
    val spell4Casts: Int?,
    @SerializedName("summoner1Casts")
    val summoner1Casts: Int?,
    @SerializedName("summoner1Id")
    val summoner1Id: Int?,
    @SerializedName("summoner2Casts")
    val summoner2Casts: Int?,
    @SerializedName("summoner2Id")
    val summoner2Id: Int?,
    @SerializedName("summonerId")
    val summonerId: String?,
    @SerializedName("summonerLevel")
    val summonerLevel: Int?,
    @SerializedName("summonerName")
    val summonerName: String?,
    @SerializedName("teamEarlySurrendered")
    val teamEarlySurrendered: Boolean?,
    @SerializedName("teamId")
    val teamId: Int?,
    @SerializedName("teamPosition")
    val teamPosition: String?,
    @SerializedName("timeCCingOthers")
    val timeCCingOthers: Int?,
    @SerializedName("timePlayed")
    val timePlayed: Int?,
    @SerializedName("totalDamageDealt")
    val totalDamageDealt: Int?,
    @SerializedName("totalDamageDealtToChampions")
    val totalDamageDealtToChampions: Int?,
    @SerializedName("totalDamageShieldedOnTeammates")
    val totalDamageShieldedOnTeammates: Int?,
    @SerializedName("totalDamageTaken")
    val totalDamageTaken: Int?,
    @SerializedName("totalHeal")
    val totalHeal: Int?,
    @SerializedName("totalHealsOnTeammates")
    val totalHealsOnTeammates: Int?,
    @SerializedName("totalMinionsKilled")
    val totalMinionsKilled: Int?,
    @SerializedName("totalTimeCCDealt")
    val totalTimeCCDealt: Int?,
    @SerializedName("totalTimeSpentDead")
    val totalTimeSpentDead: Int?,
    @SerializedName("totalUnitsHealed")
    val totalUnitsHealed: Int?,
    @SerializedName("tripleKills")
    val tripleKills: Int?,
    @SerializedName("trueDamageDealt")
    val trueDamageDealt: Int?,
    @SerializedName("trueDamageDealtToChampions")
    val trueDamageDealtToChampions: Int?,
    @SerializedName("trueDamageTaken")
    val trueDamageTaken: Int?,
    @SerializedName("turretKills")
    val turretKills: Int?,
    @SerializedName("turretTakedowns")
    val turretTakedowns: Int?,
    @SerializedName("turretsLost")
    val turretsLost: Int?,
    @SerializedName("unrealKills")
    val unrealKills: Int?,
    @SerializedName("visionScore")
    val visionScore: Int?,
    @SerializedName("visionWardsBoughtInGame")
    val visionWardsBoughtInGame: Int?,
    @SerializedName("wardsKilled")
    val wardsKilled: Int?,
    @SerializedName("wardsPlaced")
    val wardsPlaced: Int?,
    @SerializedName("win")
    val win: Boolean?
)