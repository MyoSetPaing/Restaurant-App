package com.myosetpaing.resturantapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myosetpaing.resturantapp.delegate.FoodListDelegate;
import com.myosetpaing.resturantapp.viewHolder.FoodViewHolder;
import com.myosetpaing.resturantapp.R;

public class FoodListRecyclerViewAdapter extends RecyclerView.Adapter<FoodViewHolder> {

    private FoodListDelegate mDelegate;

    public FoodListRecyclerViewAdapter(FoodListDelegate delegate) {

        this.mDelegate = delegate;

    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.item_food, viewGroup, false);
        return new FoodViewHolder(view,mDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder foodViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
