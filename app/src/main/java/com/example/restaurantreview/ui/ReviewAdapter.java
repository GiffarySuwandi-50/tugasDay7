package com.example.restaurantreview.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.example.restaurantreview.R;

import java.text.BreakIterator;
import java.util.*;

public class ReviewAdapter extends RecyclerView.Adapter {
    private final ArrayList<String> listReview;
    public ReviewAdapter(ArrayList<String> listReview) {
        this.listReview = listReview;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public View tvItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvItem = itemView.findViewById(R.id.tvItem);
        }
    }

    @NonNull
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType){
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_review, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = null;
        viewHolder.tvItem.setTextDirection(Integer.parseInt(listReview.get(position)));
    }

    public int getItemCount() {
        return listReview.size();
    }
}

