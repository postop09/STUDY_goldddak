package test.map.goldddak.mainfragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.whenStarted
import kotlinx.coroutines.*
import test.map.goldddak.Riot_URL.TAG
import test.map.goldddak.databinding.GoldFragmentBinding
import test.map.goldddak.model.Mymatchid_model
import test.map.goldddak.retrofit.Retrofit_Manager
import test.map.goldddak.viewModel.TierViewModel
import kotlin.coroutines.CoroutineContext

class GoldFragment : Fragment() {

    private lateinit var tierViewModel: TierViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //onCreate에서 데이터를 불러와야 한다?

        Log.d(TAG, "onCreate: GOldDakcall")

//        tierViewModel = ViewModelProvider(this).get(TierViewModel::class.java)
//        tierViewModel.setEntireLeaageCall()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        val binding = GoldFragmentBinding.inflate(inflater, container, false)


        return binding.root
    }

    // View 의 초기값을 설정해주거나 LiveData 옵저빙, RecyclerView Adapter 세팅 등은 onViewCreated()에서 하는 것이 적절
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        callSummerName()
    }


    fun callSummerName() {
        viewLifecycleOwner.lifecycleScope.launch {
            Retrofit_Manager.retrofitManager.EntireLeageCall(totalmodel = {
                val summonerName = it.get(0).goldSummonerName.get(0).goldSummonerName!!

                callmatchrecord(summonerName, matchidmodel = {
                    viewLifecycleOwner.lifecycleScope.launch {
                        Retrofit_Manager.retrofitManager.MatchIdCall(it,dd={
                            viewLifecycleOwner.lifecycleScope.launch{
                                Retrofit_Manager.retrofitManager.MatchINfoCall(it.get(0))
                            }
                        })
//                        Retrofit_Manager.retrofitManager.MatchINfoCall("KR_5872354496")
                    }


                })


            })
        }
    }

    fun callmatchrecord(summonerName: String ,matchidmodel:(String)->Unit) {
        viewLifecycleOwner.lifecycleScope.launch {

            Retrofit_Manager.retrofitManager.SummonerCall(summonerName) {
//                Log.d(TAG, "callmatchrecord: $it")
                matchidmodel(it)
            }
        }
    }

    fun test(){
        viewLifecycleOwner.lifecycleScope.launch {
            Retrofit_Manager.retrofitManager.MatchINfoCall( "17_Z_Yc9PEi0Vusf7X8zhGopyl7NbIlbkZuIE1Imio2ZV-inmQHovgTf-mD1b4n_PqnaSg2Lo4DwEA")

        }

    }


}