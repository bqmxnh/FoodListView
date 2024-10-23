package com.example.btth2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {

    RecyclerView recyclerViewDetail;
    FoodDetailAdapter foodDetailAdapter;
    List<FoodDetail> foodDetailList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        recyclerViewDetail = findViewById(R.id.recyclerViewDetail);
        foodDetailList = getFoodDetailList(); // Hàm tạo danh sách chi tiết món ăn
        foodDetailAdapter = new FoodDetailAdapter(foodDetailList, this);
        recyclerViewDetail.setAdapter(foodDetailAdapter);
        recyclerViewDetail.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<FoodDetail> getFoodDetailList() {
        // Thêm dữ liệu cho chi tiết món ăn kèm theo ID của hình ảnh
        List<FoodDetail> foodDetails = new ArrayList<>();
        foodDetails.add(new FoodDetail("Sườn nướng", "12000 đ", "15000 đ", 3, R.drawable.suon_nuong));
        foodDetails.add(new FoodDetail("Gà kho", "15000 đ", "15000 đ", 4, R.drawable.ga_kho));
        foodDetails.add(new FoodDetail("Thịt kho trứng", "12000 đ", "12000 đ", 3, R.drawable.thit_kho_trung));
        return foodDetails;
    }

}

