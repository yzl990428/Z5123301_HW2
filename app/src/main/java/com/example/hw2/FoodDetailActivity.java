package com.example.hw2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FoodDetailActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView nameTextView;
    private TextView priceTextView;
    private TextView detailTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_detail);

        Intent intent = getIntent();

        int foodID = intent.getIntExtra("FoodID", 0);

        Food food = FakeDatabase.getFoodById(foodID);

        imageView = findViewById(R.id.foodDetailPhoto);
        nameTextView = findViewById(R.id.foodDetailName);
        priceTextView = findViewById(R.id.foodDetailPrice);
        detailTextView = findViewById(R.id.foodDetailDescription);

        nameTextView.setText(food.getFoodName());
        priceTextView.setText("$" + food.getFoodPrice());
        detailTextView.setText(food.getFoodDescription());
        imageView.setImageResource(food.getImageDrawableId());




    }


}
