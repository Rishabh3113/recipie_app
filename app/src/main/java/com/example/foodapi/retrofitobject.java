package com.example.foodapi;

import static com.example.foodapi.apiinterface.Base_url;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class retrofitobject {
  private static Retrofit retrofit=null;

  public static apiinterface getapiinterface(){
      if(retrofit==null){
          retrofit=new Retrofit.Builder().baseUrl(Base_url).addConverterFactory(GsonConverterFactory.create()).build();

      }
      return retrofit.create(apiinterface.class);

    }
}
