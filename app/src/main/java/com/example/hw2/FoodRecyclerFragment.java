package com.example.hw2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FoodRecyclerFragment extends Fragment {
    private RecyclerView recyclerView;
    public FoodRecyclerFragment(){

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        //inflate layout for this fragment

        View view = inflater.inflate(R.layout.fragment_food_recycler,container, false);

        //add normal set up stuff

        recyclerView = view.findViewById(R.id.rv_main);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        FoodAdapter foodAdapter = new FoodAdapter();

        foodAdapter.setData(FakeDatabase.getAllFoods());
        recyclerView.setAdapter(foodAdapter);

        return view;

    }

}
