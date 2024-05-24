package com.example.foodapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface apiinterface {

    String Base_url="https://api.spoonacular.com/";


    @GET("recipes/complexSearch")
    Call<Root> getrecipie(
            @Query("cuisine") String cuisine,
            @Query("diet")  String diet,
            @Query("author") String author,
            @Query("apiKey") String apiKey


    );

}
