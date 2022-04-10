package test.map.goldddak.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofit_Client {

    fun getClient(baseUrl:String) : Retrofit{

        val myretrofit= Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return myretrofit
    }
}