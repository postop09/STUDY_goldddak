package test.map.goldddak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.coroutines.*
import test.map.goldddak.Riot_URL.TAG
import test.map.goldddak.databinding.ActivityMainBinding
import test.map.goldddak.mainfragment.BronzeFragment
import test.map.goldddak.mainfragment.GoldFragment
import test.map.goldddak.mainfragment.SilverFragment
import test.map.goldddak.retrofit.Retrofit_Manager
import java.lang.Exception
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity(), CoroutineScope {

    private lateinit var job: Job

    private var mainBinding : ActivityMainBinding ?=null
    private val binding get() = mainBinding!!

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + job

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        job = Job()




//        setFragment()



    }


    private fun setFragment() {
        binding.bottomMenu.run {
            setOnNavigationItemSelectedListener {
                when(it.itemId){
                    R.id.goldmenu ->{
                        changeFragment(GoldFragment())
                    }

                    R.id.silvermenu->{
                        changeFragment(SilverFragment())
                    }

                    R.id.bronzemenu->{
                        changeFragment(BronzeFragment())
                    }
                }
                true
            }
            selectedItemId = R.id.goldmenu
        }
    }

    private fun changeFragment(fragment:Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.mainFramgnet,fragment)
            .commit()
    }


    //소환사명을 가져오기 위한 함수
    private fun CallleageSummonerInfo() {
        launch(coroutineContext) {
            try {

                withContext(Dispatchers.Main) {
                    Retrofit_Manager.retrofitManager.EntireLeageCall(totalmodel = {it->
                        Log.d(TAG, "testleage: $it")
                        Log.d(TAG, "으아아아아앙아ㅏ: ${it.get(0).goldSummonerName.get(0).goldSummonerName}")

                        var testname = it.get(0).goldSummonerName.get(0).goldSummonerName!!
//                       CallMatchId("17_Z_Yc9PEi0Vusf7X8zhGopyl7NbIlbkZuIE1Imio2ZV-inmQHovgTf-mD1b4n_PqnaSg2Lo4DwEA")
                        Callmatchrecord(testname)






                        for(i in it.indices){
                            val goldsummonername = it.get(1).goldSummonerName.get(i).goldSummonerName!!
//                            Log.d(TAG, "CallleageSummonerInfo: $goldsummonername")

                            val silversummonername = it.get(i).silverSummonerName.get(i).silverSummonerName!!

                            val bronzesummonername = it.get(i).bronzeSummonerName.get(i).bronzeSummonerName!!

//                            CallSummonerpuuid(goldsummonername)
//                            val silverPuuid= CallSummonerpuuid(silversummonername)
//                            val bronzePuuid = CallSummonerpuuid(bronzesummonername)
                        }
                    })


                }
            } catch (e: Throwable) {

                Log.d(TAG, "testleage: $e")
            }
        }
    }



//    private fun CallMatchId(summonerpuuid:String){
//        launch(coroutineContext) {
//            try {
//                withContext(Dispatchers.Main){
//                    Retrofit_Manager.retrofitManager.MatchIdCall(summonerpuuid)
//                }
//            }catch (t:Throwable){
//                Log.d(TAG, "CallMatchId: $t")
//            }
//        }
//
//    }

    //서머너 이름을 입력하면 해당 소환사의 MATCHID를 불러옴
    private fun Callmatchrecord(summonerName:String)  {

        launch(coroutineContext) {
            try {
                withContext(Dispatchers.Main) {
                    Retrofit_Manager.retrofitManager.SummonerCall(summonerName) {
//                        Log.d(TAG, "Callmatchrecord: $it")
//                        CallMatchId(it)

                    }

                }
            } catch (t: Throwable) {
                Log.d(TAG, "testsummonerError: $t")
            }
        }


    }

    private fun CallMatchInfo(matchid:String){
        launch(coroutineContext) {
            try{
                withContext(Dispatchers.Main){
                    Retrofit_Manager.retrofitManager.MatchINfoCall(matchid)
                }
            }catch (t:Throwable){
                Log.d(TAG, "CallMatchInfo: $t")
            }
        }

    }


}