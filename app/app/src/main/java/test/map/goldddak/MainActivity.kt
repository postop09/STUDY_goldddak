package test.map.goldddak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.coroutines.*
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


        testleage("RANKED_SOLO_5x5", "GOLD", "I", 1)

//        var int_data = 1;
//
//        while(true){
//            if(int_data == 5){
//                println("["+int_data+"]")
//                break //while 무한루프 탈출
//            }
//            println("["+int_data+"]")
//            int_data ++ //int 값 증가 실시
//        }


    }


    //소환사명을 가져오기 위한 함수
    private fun testleage(queue: String, tire: String, division: String, page: Int) {
        launch(coroutineContext) {
            try {
                withContext(Dispatchers.Main) {
                    Retrofit_Manager.retrofitManager.EntireLeageCall(queue, tire, division, page)


                }
            } catch (e: Exception) {
                Toast.makeText(this@MainActivity, "${e.printStackTrace()}", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

    private fun testsummoner() {

        launch(coroutineContext) {
            try {
                withContext(Dispatchers.Main) {
                    Retrofit_Manager.retrofitManager.SummonerCall("막나가기")

                }
            } catch (e: Exception) {
                Toast.makeText(this@MainActivity, "${e.printStackTrace()}", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }


}