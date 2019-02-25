package com.myosetpaing.resturantapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.WindowManager;

import com.myosetpaing.resturantapp.delegate.FoodListDelegate;
import com.myosetpaing.resturantapp.adapter.FoodListRecyclerViewAdapter;
import com.myosetpaing.resturantapp.R;

public class MainActivity extends AppCompatActivity implements FoodListDelegate {
    private RecyclerView rvFoodList;
    private FoodListRecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        rvFoodList = findViewById(R.id.rv_FoodList);
        adapter = new FoodListRecyclerViewAdapter(this);
        rvFoodList.setLayoutManager(new LinearLayoutManager(getApplicationContext()
                , LinearLayoutManager.VERTICAL
                , false));
        rvFoodList.setAdapter(adapter);
        rvFoodList.setNestedScrollingEnabled(false);
    }

    @Override
    public void onClickFood() {
        Intent intent = FoodDetailActivity.newIntent(this);
        startActivity(intent);
    }
}
