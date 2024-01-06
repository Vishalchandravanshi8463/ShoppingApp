package com.example.shoppingapp

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("Products")
    fun getProductData() : Call<MyData>

}