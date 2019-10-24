package com.example.hw2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    private ArrayList<Food> foodsToAdapt;

    public void setData(ArrayList<Food> foodsToAdapt){
        this.foodsToAdapt = foodsToAdapt;

    }

    @NonNull
    @Override

    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food,parent, false);

        FoodViewHolder foodViewHolder = new FoodViewHolder(view);
        return foodViewHolder;
    }

    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position){
        final Food foodAtPosition = foodsToAdapt.get(position);
        holder.foodTextView.setText(foodAtPosition.getFoodName());
        holder.foodImageView.setImageResource(foodAtPosition.getImageDrawableId());

        holder.view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Context context = view.getContext();
                Intent intent = new Intent(context, FoodDetailActivity.class);
                intent.putExtra("FoodID", foodAtPosition.getFoodID());
                context.startActivity(intent);            }
        });


    }

@Override
    public int getItemCount() {
        return foodsToAdapt.size();
    }


    public static class FoodViewHolder extends RecyclerView.ViewHolder{

        public View view;
        public TextView foodTextView;
        public ImageView foodImageView;

        public FoodViewHolder(View v) {
            super(v);
            view = v;
            foodTextView = v.findViewById(R.id.foodName);
            foodImageView = v.findViewById(R.id.foodPhoto);
        }
    }
}
