package com.example.btth2;

public class Food {
    private int id;
    private String name;
    private String description;
    private int imageResourceId; // Thêm hình ảnh

    public Food(int id, String name, String description, int imageResourceId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId; // Lưu ID của hình ảnh
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId; // Trả về ID của hình ảnh
    }
}



