package test.map.goldddak.retrofit

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import test.map.goldddak.Riot_URL
import test.map.goldddak.model.EntireLeageModel
import test.map.goldddak.model.EntireLeageModelItem
import test.map.goldddak.model.SummonerModel

interface Retrofit_InterFace {

    @GET(Riot_URL.SUMMNER_URL)
//    /lol/summoner/v4/summoners/by-name/{summonerName}
    suspend fun summonerCall(
        @Path("summonerName") summoner: String,
        @Query("api_key") api_key: String,
    ): Response<SummonerModel>


    @GET(Riot_URL.LEAGE_URL)
    ///lol/league/v4/entries/{queue}/{tier}/{division}
    suspend fun leageCall(

        @Path("queue") queue: String,
        @Path("tier") tier: String,
        @Path("division") division: String,
        @Query("page") page:Int,
        @Query("api_key") api_key: String,

    ): Response<EntireLeageModel>


    @GET(Riot_URL.SUMMNER_URL)
//    /lol/summoner/v4/summoners/by-name/{summonerName}
    fun testsummonerCall(
        @Path("summonerName") summoner: String,
        @Query("api_key") api_key: String,
    ): Call<SummonerModel>


    @GET(Riot_URL.LEAGE_URL)
//    /lol/summoner/v4/summoners/by-name/{summonerName}
    fun testleageCall(

        @Path("queue") queue: String,
        @Path("tier") tier: String,
        @Path("division") division: String,
        @Query("page") page:Int,
        @Query("api_key") api_key: String,
    ): Call<EntireLeageModel>


}