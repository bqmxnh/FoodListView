package com.example.btth2;

public class FoodDetail {
    private String name;
    private String price;
    private String oldPrice;
    private float rating;
    private int imageResourceId; // Thêm hình ảnh

    public FoodDetail(String name, String price, String oldPrice, float rating, int imageResourceId) {
        this.name = name;
        this.price = price;
        this.oldPrice = oldPrice;
        this.rating = rating;
        this.imageResourceId = imageResourceId; // Lưu ID của hình ảnh
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getOldPrice() {
        return oldPrice;
    }

    public float getRating() {
        return rating;
    }

    public int getImageResourceId() {
        return imageResourceId; // Trả về ID của hình ảnh
    }
}


