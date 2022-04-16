package test.map.goldddak.mainfragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.whenStarted
import kotlinx.coroutines.*
import test.map.goldddak.Riot_URL.TAG
import test.map.goldddak.databinding.GoldFragmentBinding
import test.map.goldddak.retrofit.Retrofit_Manager
import test.map.goldddak.viewModel.TierViewModel
import kotlin.coroutines.CoroutineContext

class GoldFragment:Fragment() {

    private lateinit var tierViewModel: TierViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //onCreate에서 데이터를 불러와야 한다?

        Log.d(TAG, "onCreate: GOldDakcall")
        tierViewModel = ViewModelProvider(this).get(TierViewModel::class.java)

    }



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = GoldFragmentBinding.inflate(inflater,container,false)


        return binding.root
    }

    private suspend fun CallGoldRate() {


    }




}