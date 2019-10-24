package com.example.hw2;

public class Food {

    private int foodID;

    private String foodName;

    private int foodPrice;

    private String foodDescription;

    private int imageDrawableId;

    public int getFoodID() { return foodID; }

    public void setFoodID(int foodID) { this.foodID = foodID; }

    public String getFoodName() { return foodName; }

    public void setFoodName(String foodName) { this.foodName = foodName; }

    public int getFoodPrice() { return foodPrice; }

    public void setFoodPrice(int foodPrice) { this.foodPrice = foodPrice; }

    public String getFoodDescription() { return foodDescription; }

    public void setFoodDescription(String foodDescription) { this.foodDescription = foodDescription; }

    public int getImageDrawableId() { return imageDrawableId; }

    public void setImageDrawableId(int imageDrawableId) { this.imageDrawableId = imageDrawableId; }

    public Food(int foodID, String foodName, int foodPrice, String foodDescription, int imageDrawableId){
        this.foodID = foodID;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.foodDescription = foodDescription;
        this.imageDrawableId = imageDrawableId;
    }
}
