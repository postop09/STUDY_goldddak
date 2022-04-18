package test.map.goldddak.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import test.map.goldddak.Riot_URL.TAG
import test.map.goldddak.model.TotalModel
import test.map.goldddak.retrofit.Retrofit_Manager

class TierViewModel:ViewModel() {
    private val job=Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + job)

    private val _totalmodel = MutableLiveData<MutableList<TotalModel>>()

    private val totalmodel : LiveData<MutableList<TotalModel>>
        get() = _totalmodel



//    fun setEntireLeaageCall(list: MutableList<TotalModel>) = uiScope.launch {
//        Retrofit_Manager.retrofitManager.EntireLeageCall(totalmodel = {
//            Log.d(TAG, "setEntireLeaageCall: $totalmodel")
//        })
////        _totalmodel.value = list
//    }





    fun setEntireLeaageCall() = uiScope.launch {
        Retrofit_Manager.retrofitManager.EntireLeageCall(totalmodel = {
            Log.d(TAG, "setEntireLeaageCall: $it")
        })
//        _totalmodel.value = list
    }






    override fun onCleared() {
        super.onCleared()

        //Memoery Leak의 방지를 위해서 job을 cancle 시켜 줘야함
        job.cancel()
    }
}

