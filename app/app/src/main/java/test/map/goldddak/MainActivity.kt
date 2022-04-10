package test.map.goldddak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.coroutines.*
import test.map.goldddak.Riot_URL.TAG
import test.map.goldddak.retrofit.Retrofit_Manager
import java.lang.Exception
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity(), CoroutineScope {

    private lateinit var job: Job

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + job

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        job = Job()

        CallleageSummonerInfo()


    }



    //소환사명을 가져오기 위한 함수
    private fun CallleageSummonerInfo() {
        launch(coroutineContext) {
            try {
                withContext(Dispatchers.Main) {
                    Retrofit_Manager.retrofitManager.EntireLeageCall(totalmodel = {it->
                        Log.d(TAG, "testleage: $it")

                        for(i in it.indices){
                            val goldsummonername = it.get(i).goldSummonerName.get(i).goldSummonerName!!
//                            Log.d(TAG, "CallleageSummonerInfo: $goldsummonername")

                            val silversummonername = it.get(i).silverSummonerName.get(i).silverSummonerName!!

                            val bronzesummonername = it.get(i).bronzeSummonerName.get(i).bronzeSummonerName!!

                            CallSummonerpuuid(goldsummonername)
//                            val silverPuuid= CallSummonerpuuid(silversummonername)
//                            val bronzePuuid = CallSummonerpuuid(bronzesummonername)



                        }
                    })


                }
            } catch (e: Exception) {

                Log.d(TAG, "testleage: $e")
            }
        }
    }

    private fun CallSummonerpuuid(summonerName:String) {

        launch(coroutineContext) {
            try {
                withContext(Dispatchers.Main) {
                    Retrofit_Manager.retrofitManager.SummonerCall(summonerName)

                }
            } catch (e: Exception) {
                Log.d(TAG, "testsummonerError: $e")
            }
        }
    }


}