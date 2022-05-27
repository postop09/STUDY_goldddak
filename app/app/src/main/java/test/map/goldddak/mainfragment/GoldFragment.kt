package test.map.goldddak.mainfragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.whenStarted
import kotlinx.android.synthetic.main.customtab_button.view.*
import kotlinx.coroutines.*
import test.map.goldddak.R
import test.map.goldddak.Riot_URL.TAG
import test.map.goldddak.databinding.GoldFragmentBinding
import test.map.goldddak.model.Mymatchid_model
import test.map.goldddak.retrofit.Retrofit_Manager
import test.map.goldddak.viewModel.TierViewModel
import kotlin.coroutines.CoroutineContext

class GoldFragment : Fragment() {

    private lateinit var tierViewModel: TierViewModel
    private lateinit var mContext: Context


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //onCreate에서 데이터를 불러와야 한다?

        Log.d(TAG, "onCreate: GOldDakcall")


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

    private fun createView(tabName:String):View {
        var tabView = LayoutInflater.from(mContext).inflate(R.layout.customtab_button, null)


        tabView.tab_text.text = tabName
        when (tabName) {
            "찾기" -> {
                tabView.tab_logo.setImageResource(android.R.drawable.ic_menu_search)
            }

            "사진" -> {
                tabView.tab_logo.setImageResource(android.R.drawable.ic_menu_camera)
                return tabView
            }
            "전화" -> {
                tabView.tab_logo.setImageResource(android.R.drawable.ic_menu_call)
                return tabView
            }
            else -> {
                return tabView
            }
        }

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