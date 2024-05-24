package com.example.foodapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.view> {

    Context context;
    ArrayList<Result> resultArrayList;

    public adapter(Context context, ArrayList<Result> resultArrayList) {
        this.context = context;
        this.resultArrayList = resultArrayList;
    }

    @NonNull
    @Override
    public view onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new view(view);
    }

    @Override
    public void onBindViewHolder(@NonNull view holder, int position) {
        holder.textView.setText(resultArrayList.get(position).title);
        Glide.with(context).load(resultArrayList.get(position).getImage()).into(holder.imageView);



    }

    @Override
    public int getItemCount() {
        return resultArrayList.size();
    }

    public class view extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;
        CardView cardView;

        public view(@NonNull View itemView) {


            super(itemView);
            imageView=itemView.findViewById(R.id.image);
            cardView=itemView.findViewById(R.id.card);
            textView=itemView.findViewById(R.id.tet);
        }
    }
}
