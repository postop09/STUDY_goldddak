package test.map.goldddak.mainfragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import test.map.goldddak.Riot_URL.TAG
import test.map.goldddak.databinding.GoldFragmentBinding

class GoldFragment:Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //onCreate에서 데이터를 불러와야 한다?
        CallGoldRate()
        Log.d(TAG, "onCreate: GOldDakcall")
    }



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = GoldFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }

    private fun CallGoldRate() {

    }




}