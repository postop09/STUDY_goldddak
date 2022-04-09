package test.map.goldddak.retrofit

import android.util.Log
import android.widget.Button
import retrofit2.Call
import retrofit2.Response
import test.map.goldddak.Riot_URL
import test.map.goldddak.Riot_URL.API_KEY
import test.map.goldddak.Riot_URL.RIOT_BASE_URL
import test.map.goldddak.Riot_URL.TAG
import test.map.goldddak.model.EntireLeageModel
import test.map.goldddak.model.EntireLeageModelItem
import test.map.goldddak.model.SummonerModel

class Retrofit_Manager {

    companion object {
        val retrofitManager = Retrofit_Manager()
    }

    private val retrofitInterface: Retrofit_InterFace =
        Retrofit_Client.getClient(RIOT_BASE_URL).create(Retrofit_InterFace::class.java)


    suspend fun SummonerCall(summnoername: String) {
        val call = retrofitInterface.summonerCall(
            summoner = summnoername,
            api_key = API_KEY
        )

        if (call.isSuccessful) {
            Log.d(TAG, "SummonerCall: ${call.body()}")
        }
    }

    suspend fun EntireLeageCall(queue: String, tire: String, division: String, page: Int) {

//        val call = retrofitInterface.testleageCall(queue, tire, division, 1, API_KEY)

        val call = retrofitInterface.leageCall(queue, tire, division, page, API_KEY)


        var testInt = 1

        while(call.isSuccessful){

            if(call.body()==null){
                break
            }

            val hi = retrofitInterface.leageCall(queue,tire,division, testInt, API_KEY)
            Log.d(TAG, "무야호~~~: $hi")
            testInt++
        }



//        if (call.isSuccessful) {
//            Log.d(TAG, "EntireLeageCall: ${call.raw()}")
//
//        }
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