package com.example.foodapi;



import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    String api="ebde54c6315c4aca942e10b507593bcf";

    ArrayList<Result> arrayList;
    adapter adapter;
    String cuisine="Indian";
    String diet="vegetarian";
    String author="";
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=  findViewById(R.id.recycler);
        arrayList=new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new adapter(this,arrayList);
        recyclerView.setAdapter(adapter);
        findnews();


    }

    private void findnews() {
   retrofitobject.getapiinterface().getrecipie(cuisine,diet,author,api).enqueue(new Callback<Root>() {
       @Override
       public void onResponse(Call<Root> call, Response<Root> response) {
           if(response.isSuccessful()){
               arrayList.addAll(response.body().getResults());
               adapter.notifyDataSetChanged();

           }

       }

       @Override
       public void onFailure(Call<Root> call, Throwable t) {

       }
   });
    }
}