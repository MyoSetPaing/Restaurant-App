package com.myosetpaing.resturantapp.view;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.myosetpaing.resturantapp.R;

public class FoodDetailActivity extends AppCompatActivity {

    public static Intent newIntent(Context context) {

        return new Intent(context, FoodDetailActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);
    }
}
