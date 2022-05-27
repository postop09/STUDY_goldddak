package test.map.goldddak.model.matchinfo_model


import com.google.gson.annotations.SerializedName

data class Challenges(
    @SerializedName("abilityUses")
    val abilityUses: Int?,
    @SerializedName("acesBefore15Minutes")
    val acesBefore15Minutes: Int?,
    @SerializedName("alliedJungleMonsterKills")
    val alliedJungleMonsterKills: Double?,
    @SerializedName("12AssistStreakCount")
    val assistStreakCount: Int?,
    @SerializedName("baronBuffGoldAdvantageOverThreshold")
    val baronBuffGoldAdvantageOverThreshold: Int?,
    @SerializedName("baronTakedowns")
    val baronTakedowns: Int?,
    @SerializedName("blastConeOppositeOpponentCount")
    val blastConeOppositeOpponentCount: Int?,
    @SerializedName("bountyGold")
    val bountyGold: Int?,
    @SerializedName("buffsStolen")
    val buffsStolen: Int?,
    @SerializedName("completeSupportQuestInTime")
    val completeSupportQuestInTime: Int?,
    @SerializedName("controlWardTimeCoverageInRiverOrEnemyHalf")
    val controlWardTimeCoverageInRiverOrEnemyHalf: Double?,
    @SerializedName("controlWardsPlaced")
    val controlWardsPlaced: Int?,
    @SerializedName("damagePerMinute")
    val damagePerMinute: Double?,
    @SerializedName("damageTakenOnTeamPercentage")
    val damageTakenOnTeamPercentage: Double?,
    @SerializedName("dancedWithRiftHerald")
    val dancedWithRiftHerald: Int?,
    @SerializedName("deathsByEnemyChamps")
    val deathsByEnemyChamps: Int?,
    @SerializedName("dodgeSkillShotsSmallWindow")
    val dodgeSkillShotsSmallWindow: Int?,
    @SerializedName("doubleAces")
    val doubleAces: Int?,
    @SerializedName("dragonTakedowns")
    val dragonTakedowns: Int?,
    @SerializedName("earliestBaron")
    val earliestBaron: Double?,
    @SerializedName("earliestDragonTakedown")
    val earliestDragonTakedown: Double?,
    @SerializedName("earlyLaningPhaseGoldExpAdvantage")
    val earlyLaningPhaseGoldExpAdvantage: Double?,
    @SerializedName("effectiveHealAndShielding")
    val effectiveHealAndShielding: Float?,
    @SerializedName("elderDragonKillsWithOpposingSoul")
    val elderDragonKillsWithOpposingSoul: Int?,
    @SerializedName("elderDragonMultikills")
    val elderDragonMultikills: Int?,
    @SerializedName("enemyChampionImmobilizations")
    val enemyChampionImmobilizations: Int?,
    @SerializedName("enemyJungleMonsterKills")
    val enemyJungleMonsterKills: Float?,
    @SerializedName("epicMonsterKillsNearEnemyJungler")
    val epicMonsterKillsNearEnemyJungler: Int?,
    @SerializedName("epicMonsterKillsWithin30SecondsOfSpawn")
    val epicMonsterKillsWithin30SecondsOfSpawn: Int?,
    @SerializedName("epicMonsterSteals")
    val epicMonsterSteals: Int?,
    @SerializedName("epicMonsterStolenWithoutSmite")
    val epicMonsterStolenWithoutSmite: Int?,
    @SerializedName("fasterSupportQuestCompletion")
    val fasterSupportQuestCompletion: Int?,
    @SerializedName("firstTurretKilledTime")
    val firstTurretKilledTime: Double?,
    @SerializedName("flawlessAces")
    val flawlessAces: Int?,
    @SerializedName("fullTeamTakedown")
    val fullTeamTakedown: Int?,
    @SerializedName("gameLength")
    val gameLength: Double?,
    @SerializedName("getTakedownsInAllLanesEarlyJungleAsLaner")
    val getTakedownsInAllLanesEarlyJungleAsLaner: Int?,
    @SerializedName("goldPerMinute")
    val goldPerMinute: Double?,
    @SerializedName("hadAfkTeammate")
    val hadAfkTeammate: Int?,
    @SerializedName("hadOpenNexus")
    val hadOpenNexus: Int?,
    @SerializedName("highestChampionDamage")
    val highestChampionDamage: Int?,
    @SerializedName("highestCrowdControlScore")
    val highestCrowdControlScore: Int?,
    @SerializedName("highestWardKills")
    val highestWardKills: Int?,
    @SerializedName("immobilizeAndKillWithAlly")
    val immobilizeAndKillWithAlly: Int?,
    @SerializedName("initialBuffCount")
    val initialBuffCount: Int?,
    @SerializedName("initialCrabCount")
    val initialCrabCount: Int?,
    @SerializedName("jungleCsBefore10Minutes")
    val jungleCsBefore10Minutes: Float?,
    @SerializedName("junglerKillsEarlyJungle")
    val junglerKillsEarlyJungle: Int?,
    @SerializedName("junglerTakedownsNearDamagedEpicMonster")
    val junglerTakedownsNearDamagedEpicMonster: Int?,
    @SerializedName("kTurretsDestroyedBeforePlatesFall")
    val kTurretsDestroyedBeforePlatesFall: Int?,
    @SerializedName("kda")
    val kda: Double?,
    @SerializedName("killAfterHiddenWithAlly")
    val killAfterHiddenWithAlly: Int?,
    @SerializedName("killParticipation")
    val killParticipation: Double?,
    @SerializedName("killedChampTookFullTeamDamageSurvived")
    val killedChampTookFullTeamDamageSurvived: Int?,
    @SerializedName("killsNearEnemyTurret")
    val killsNearEnemyTurret: Int?,
    @SerializedName("killsOnLanersEarlyJungleAsJungler")
    val killsOnLanersEarlyJungleAsJungler: Int?,
    @SerializedName("killsOnOtherLanesEarlyJungleAsLaner")
    val killsOnOtherLanesEarlyJungleAsLaner: Int?,
    @SerializedName("killsOnRecentlyHealedByAramPack")
    val killsOnRecentlyHealedByAramPack: Int?,
    @SerializedName("killsUnderOwnTurret")
    val killsUnderOwnTurret: Int?,
    @SerializedName("killsWithHelpFromEpicMonster")
    val killsWithHelpFromEpicMonster: Int?,
    @SerializedName("knockEnemyIntoTeamAndKill")
    val knockEnemyIntoTeamAndKill: Int?,
    @SerializedName("landSkillShotsEarlyGame")
    val landSkillShotsEarlyGame: Int?,
    @SerializedName("laneMinionsFirst10Minutes")
    val laneMinionsFirst10Minutes: Int?,
    @SerializedName("laningPhaseGoldExpAdvantage")
    val laningPhaseGoldExpAdvantage: Double?,
    @SerializedName("legendaryCount")
    val legendaryCount: Int?,
    @SerializedName("lostAnInhibitor")
    val lostAnInhibitor: Int?,
    @SerializedName("maxCsAdvantageOnLaneOpponent")
    val maxCsAdvantageOnLaneOpponent: Float?,
    @SerializedName("maxKillDeficit")
    val maxKillDeficit: Int?,
    @SerializedName("maxLevelLeadLaneOpponent")
    val maxLevelLeadLaneOpponent: Int?,
    @SerializedName("moreEnemyJungleThanOpponent")
    val moreEnemyJungleThanOpponent: Double?,
    @SerializedName("multiKillOneSpell")
    val multiKillOneSpell: Int?,
    @SerializedName("multiTurretRiftHeraldCount")
    val multiTurretRiftHeraldCount: Int?,
    @SerializedName("multikills")
    val multikills: Int?,
    @SerializedName("multikillsAfterAggressiveFlash")
    val multikillsAfterAggressiveFlash: Int?,
    @SerializedName("mythicItemUsed")
    val mythicItemUsed: Int?,
    @SerializedName("outerTurretExecutesBefore10Minutes")
    val outerTurretExecutesBefore10Minutes: Int?,
    @SerializedName("outnumberedKills")
    val outnumberedKills: Int?,
    @SerializedName("outnumberedNexusKill")
    val outnumberedNexusKill: Int?,
    @SerializedName("perfectDragonSoulsTaken")
    val perfectDragonSoulsTaken: Int?,
    @SerializedName("perfectGame")
    val perfectGame: Int?,
    @SerializedName("pickKillWithAlly")
    val pickKillWithAlly: Int?,
    @SerializedName("poroExplosions")
    val poroExplosions: Int?,
    @SerializedName("quickCleanse")
    val quickCleanse: Int?,
    @SerializedName("quickFirstTurret")
    val quickFirstTurret: Int?,
    @SerializedName("quickSoloKills")
    val quickSoloKills: Int?,
    @SerializedName("riftHeraldTakedowns")
    val riftHeraldTakedowns: Int?,
    @SerializedName("saveAllyFromDeath")
    val saveAllyFromDeath: Int?,
    @SerializedName("scuttleCrabKills")
    val scuttleCrabKills: Int?,
    @SerializedName("shortestTimeToAceFromFirstTakedown")
    val shortestTimeToAceFromFirstTakedown: Double?,
    @SerializedName("skillshotsDodged")
    val skillshotsDodged: Int?,
    @SerializedName("skillshotsHit")
    val skillshotsHit: Int?,
    @SerializedName("snowballsHit")
    val snowballsHit: Int?,
    @SerializedName("soloBaronKills")
    val soloBaronKills: Int?,
    @SerializedName("soloKills")
    val soloKills: Int?,
    @SerializedName("soloTurretsLategame")
    val soloTurretsLategame: Int?,
    @SerializedName("stealthWardsPlaced")
    val stealthWardsPlaced: Int?,
    @SerializedName("survivedSingleDigitHpCount")
    val survivedSingleDigitHpCount: Int?,
    @SerializedName("survivedThreeImmobilizesInFight")
    val survivedThreeImmobilizesInFight: Int?,
    @SerializedName("takedownOnFirstTurret")
    val takedownOnFirstTurret: Int?,
    @SerializedName("takedowns")
    val takedowns: Int?,
    @SerializedName("takedownsAfterGainingLevelAdvantage")
    val takedownsAfterGainingLevelAdvantage: Int?,
    @SerializedName("takedownsBeforeJungleMinionSpawn")
    val takedownsBeforeJungleMinionSpawn: Int?,
    @SerializedName("takedownsFirst25Minutes")
    val takedownsFirst25Minutes: Int?,
    @SerializedName("takedownsInAlcove")
    val takedownsInAlcove: Int?,
    @SerializedName("takedownsInEnemyFountain")
    val takedownsInEnemyFountain: Int?,
    @SerializedName("teamBaronKills")
    val teamBaronKills: Int?,
    @SerializedName("teamDamagePercentage")
    val teamDamagePercentage: Double?,
    @SerializedName("teamElderDragonKills")
    val teamElderDragonKills: Int?,
    @SerializedName("teamRiftHeraldKills")
    val teamRiftHeraldKills: Int?,
    @SerializedName("threeWardsOneSweeperCount")
    val threeWardsOneSweeperCount: Int?,
    @SerializedName("tookLargeDamageSurvived")
    val tookLargeDamageSurvived: Int?,
    @SerializedName("turretPlatesTaken")
    val turretPlatesTaken: Int?,
    @SerializedName("turretTakedowns")
    val turretTakedowns: Int?,
    @SerializedName("turretsTakenWithRiftHerald")
    val turretsTakenWithRiftHerald: Int?,
    @SerializedName("twentyMinionsIn3SecondsCount")
    val twentyMinionsIn3SecondsCount: Int?,
    @SerializedName("unseenRecalls")
    val unseenRecalls: Int?,
    @SerializedName("visionScoreAdvantageLaneOpponent")
    val visionScoreAdvantageLaneOpponent: Double?,
    @SerializedName("visionScorePerMinute")
    val visionScorePerMinute: Double?,
    @SerializedName("wardTakedowns")
    val wardTakedowns: Int?,
    @SerializedName("wardTakedownsBefore20M")
    val wardTakedownsBefore20M: Int?,
    @SerializedName("wardsGuarded")
    val wardsGuarded: Int?
)