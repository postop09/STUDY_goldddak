package test.map.goldddak.retrofit

import android.util.Log
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import test.map.goldddak.Riot_URL.API_KEY
import test.map.goldddak.Riot_URL.RIOT_ASIA_URL
import test.map.goldddak.Riot_URL.RIOT_BASE_URL
import test.map.goldddak.Riot_URL.TAG
import test.map.goldddak.model.*
import test.map.goldddak.myobject.MyObject

class Retrofit_Manager {

    companion object {
        val retrofitManager = Retrofit_Manager()
    }

    private val retrofitInterface: Retrofit_InterFace =
        Retrofit_Client.getClient(RIOT_BASE_URL).create(Retrofit_InterFace::class.java)


    //MatchId를 불러오기 위해서는 베이스URL이 바뀌어서 새로운 객체선언
    private val asiaInterface : Retrofit_InterFace=
        Retrofit_Client.getClient(RIOT_ASIA_URL).create(Retrofit_InterFace::class.java)
    suspend fun SummonerCall(summnoername: String, puuid:(String)->Unit) {
        val call = retrofitInterface.summonerCall(
            summoner = summnoername,
            api_key = API_KEY
        )

        if (call.isSuccessful) {
            val summonerpuuid = call.body()!!.puuid.toString()
            puuid(summonerpuuid)

        }
    }

    suspend fun EntireLeageCall(totalmodel: (MutableList<TotalModel>) -> Unit) {

//        val call = retrofitInterface.testleageCall(queue, tire, division, 1, API_KEY)

        val call = retrofitInterface.leageCall("RANKED_SOLO_5x5", "GOLD", "I", 1, API_KEY)

        val resultmodel = mutableListOf<TotalModel>()
        val goldmodel = mutableListOf<GoldModel>()
        val silvermodel = mutableListOf<SilverModel>()
        val bronzemodel = mutableListOf<BronzeModel>()

        var stopInt = 1


        while (call.isSuccessful) {

            if (stopInt == 5) {
//                Log.d(TAG, "GoldModel: $goldmodel")
//                Log.d(TAG, "SilverModel: $silvermodel")
//                Log.d(TAG, "Bronze: $bronzemodel")
//                Log.d(TAG, "EntireLeageCall: $resultmodel")
                totalmodel(resultmodel)
                break
            }

            val mydivision = MyObject.myObject.TireInt(stopInt)
            val GoldTireCall =
                retrofitInterface.leageCall("RANKED_SOLO_5x5", "GOLD", mydivision, 1, API_KEY)
            val SilverTireCall =
                retrofitInterface.leageCall("RANKED_SOLO_5x5", "SILVER", mydivision, 1, API_KEY)
            val bronzeTireCall =
                retrofitInterface.leageCall("RANKED_SOLO_5x5", "BRONZE", "I", 1, API_KEY)



            for (i in 0..2) {
                val goldsummonerName = GoldTireCall.body()!!.get(i).summonerName
                goldmodel.add(GoldModel(goldsummonerName))

                val silversummnoerName = SilverTireCall.body()!!.get(i).summonerName.toString()
                silvermodel.add(SilverModel(silversummnoerName))

                val bronzesummnerName = bronzeTireCall.body()!!.get(i).summonerName.toString()
                bronzemodel.add(BronzeModel(bronzesummnerName))

                resultmodel.add(
                    TotalModel(goldmodel, silvermodel, bronzemodel)
                )


            }


//            Log.d(TAG, "EntireLeageCall: $testmodel")
            stopInt++
        }


        //해당 티어의 모든 소환사 정보를 가져오는 함수, API의 한계로 일단 보류
//        while(call.isSuccessful){
//
//            if(call.body()==null){
//                break
//            }
//
//            val hi = retrofitInterface.leageCall(queue,tire,division, testInt, API_KEY)
//            Log.d(TAG, "야호~~~: $hi")
//            testInt++
//        }


    }

    suspend fun MatchIdCall(puuid:String){
        val call = asiaInterface.matchidcall(puuid, API_KEY)
        if(call.isSuccessful){
            Log.d(TAG, "MatchIdCall: ${call.body()}")
        }else
        {
            Log.d(TAG, "에잉: affasf")
        }
    }

    suspend fun MatchINfoCall(matchid:String){
        val call = asiaInterface.matchinfocall(matchid, API_KEY )

        if(call.isSuccessful){
//            Log.d(TAG, "MatchINfoCall: ${call.body()}")



            //플레이한 챔피언 이름
            for(i in 0..9){
                val championName = call.body()!!.info?.participants?.get(i)?.championName
                Log.d(TAG, "MatchINfoCall$i : $championName")
                //킬/뎃/어시
                val kda = call.body()!!.info?.participants?.get(i)?.challenges!!.kda

                //승리여부
                val win = call.body()!!.info!!.participants!!.get(i).win

            }



//
//            챔피언에게 가한 피해
//
//            요종도 뽑아버림
        }

    }

    fun testsummonercall(summnoername: String) {
        val call = retrofitInterface.testsummonerCall(summnoername, API_KEY)

        call.enqueue(object : retrofit2.Callback<SummonerModel> {
            override fun onResponse(call: Call<SummonerModel>, response: Response<SummonerModel>) {
                val body = response.body()
                Log.d(TAG, "onResponse: $body")
            }

            override fun onFailure(call: Call<SummonerModel>, t: Throwable) {
                Log.d(TAG, "onFailure: $t")
            }

        })
    }

    fun testleageCall(queue: String, tire: String, division: String) {
        val call = retrofitInterface.testleageCall(queue, tire, division, 1, API_KEY)

        call.enqueue(object : retrofit2.Callback<EntireLeageModel> {
            override fun onResponse(
                call: Call<EntireLeageModel>,
                response: Response<EntireLeageModel>,
            ) {
                Log.d(TAG, "onResponse: ${response.raw()}")
            }

            override fun onFailure(call: Call<EntireLeageModel>, t: Throwable) {
                Log.d(TAG, "onFailure: $t")
            }

        })
    }

}