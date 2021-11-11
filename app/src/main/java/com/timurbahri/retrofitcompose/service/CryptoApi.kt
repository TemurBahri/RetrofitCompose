package com.timurbahri.retrofitcompose.service

import com.timurbahri.retrofitcompose.model.CryptoModel
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {

    //https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json


    //https://api.nomics.com/v1/prices?key=8185875ee1ba7bf74917ff561539dd2a347c50c4
    //BASE -> https://api.nomics.com/v1

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    fun getData() : Call<List<CryptoModel>>
}