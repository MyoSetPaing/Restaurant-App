package com.myosetpaing.resturantapp.viewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.myosetpaing.resturantapp.R;
import com.myosetpaing.resturantapp.delegate.FoodListDelegate;

public class FoodViewHolder extends RecyclerView.ViewHolder {

    private FoodListDelegate mDelegate;
    Button btnFood;

    public FoodViewHolder(@NonNull View itemView, FoodListDelegate delegate) {
        super(itemView);

        btnFood = itemView.findViewById(R.id.btn_detail);

        mDelegate = delegate;

        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mDelegate.onClickFood();
            }
        });
    }
}
