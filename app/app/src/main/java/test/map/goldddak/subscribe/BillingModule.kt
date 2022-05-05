package test.map.goldddak.subscribe

import android.app.Activity
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleCoroutineScope
import com.android.billingclient.api.*
import test.map.goldddak.Riot_URL.TAG
import javax.security.auth.callback.Callback

class BillingModule(
    private val activity : Activity,
    private val lifecycle: LifecycleCoroutineScope,
    private val callback: Callback
) {


    //구매관련 업데이트 수신
    private val purchasesUpdatedListener = PurchasesUpdatedListener {billingResult, purchases->
        when{
            billingResult.responseCode == BillingClient.BillingResponseCode.OK && purchases != null ->{
                for(purchase in purchases){
                    confirmPurchase(purchase)
                }
            }

            else -> {
                //구매 실패
                callback.onFailure(billingResult.responseCode)
            }
        }
    }


    private var billingClient: BillingClient = BillingClient.newBuilder(activity)
        .setListener(purchasesUpdatedListener)
        .enablePendingPurchases()
        .build()


    init {
        billingClient.startConnection(object:BillingClientStateListener{
            override fun onBillingSetupFinished(billingResult: BillingResult) {
                if(billingResult.responseCode== BillingClient.BillingResponseCode.OK){
                    callback.onBillingModulesIsReady()

                }else{
                    callback.onFailure(billingResult.responseCode)
                }
            }

            override fun onBillingServiceDisconnected() {
                Log.d(TAG, "onBillingServiceDisconnected: error")
            }

        })
    }





    private fun confirmPurchase(purchase: Purchase) {

    }



    interface Callback {
        //BillingClient가 연결에 성공하여 모듈을 사용할 준비가 되었을때 알리기 위함, 이것이 호출되어야 기능 사용 가능
        fun onBillingModulesIsReady()

        // 구매가 성공했을 때 호출, Purchase는 구매정보
        fun onSuccess(purchase : Purchase)

        // onFailure(int) : 구매가 실패했을때 호출,  BillingResponseCode가 넘겨진다.
        fun onFailure(errorCode: Int)

    }
}