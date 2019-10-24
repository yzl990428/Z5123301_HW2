package com.example.hw2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FakeDatabase {

    public static Food getFoodById(int foodID) {
        return foods.get(foodID);
    }


    public static ArrayList<Food> getAllFoods() {
        return new ArrayList<Food>((List) Arrays.asList(foods.values().toArray()));
    }

    private static final HashMap<Integer, Food> foods = new HashMap<>();


    static {
        foods.put(1, new Food(
                1,
                "burgermeal",
                10,
                "A Burger meal with a double burger and one coke and one chips",
                R.drawable.burgermeal
        ));
        foods.put(2,new Food(
                2,
                "chickenburger",
                5,
                "A  Burger with large chicken piece",
                R.drawable.chickenburger
        ));
        foods.put(3,new Food(
                3,
                "coke",
                3,
                "A can of coke, can be iced or ice free",
                R.drawable.coke
        ));
        foods.put(4,new Food(
                4,
                "doubleburger",
                7,
                "A Burger with cheese, two meat pieces, some vegetables include tomato, lettuce",
                R.drawable.doubleburger
        ));
        foods.put(5,new Food(
                5,
                "meatballsoup",
                6,
                "A soup in bowl with meatballs and vegetables",
                R.drawable.meatballbread
        ));
        foods.put(6,new Food(
                6,
                "hotdog",
                3,
                "A is a grilled or steamed link-sausage sandwich where the sausage is served in the slit of a partially sliced bun",
                R.drawable.hotdog
        ));
        foods.put(7,new Food(
                7,
                "meatballbread",
                4,
                "Mix of ground beef, bread crumbs, parsley, egg, salt, and pepper. Pinch off a ball of the mixture, roll between your hands to make ping-pong ball-sized meatballs.",
                R.drawable.meatballbread
        ));

        foods.put(8,new Food(
                8,
                "pizza",
                6,
                "A a savory dish of Italian origin, consisting off lattened base of leavened wheat-based dough topped",
                R.drawable.pizza
        ));

        foods.put(9,new Food(
                9,
                "sandwich",
                4,
                "This is a sandwich consist soft bread and meat.",
                R.drawable.sandwich
        ));

        foods.put(10,new Food(
                10,
                "singleburger",
                3,
                "A burger with one piece of meat",
                R.drawable.singleburger
        ));

        foods.put(11,new Food(
                11,
                "snackplatter",
                10,
                "A platter consist different types ot snacks",
                R.drawable.snackplatter
        ));

        foods.put(12,new Food(
                12,
                "tacos",
                2,
                "This is a docious tacos",
                R.drawable.tacos
        ));

        foods.put(13,new Food(
                13,
                "twopersonsmeal",
                14,
                "This is a meal for two persons consists burger, chips and drink",
                R.drawable.twopersonsmeal
        ));

        foods.put(14,new Food(
                14,
                "vegeburger",
                3,
                "A burger with vegetable only",
                R.drawable.vegeburger
        ));

        foods.put(15,new Food(
                15,
                "nuggets",
                5,
                "A box ot nuggets",
                R.drawable.nuggets
        ));



    }

}
