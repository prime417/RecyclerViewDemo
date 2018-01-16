package com.example.pankaj.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pankaj on 12-01-2018.
 */


class RecyclerViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;
    public TextView textView;


    public RecyclerViewHolder(View itemView) {
        super(itemView);

        imageView = (ImageView) itemView.findViewById(R.id.imageView);
        textView = (TextView) itemView.findViewById(R.id.textView);
    }
}

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private List<Data> listData = new ArrayList<Data>();

    public MyRecyclerViewAdapter(List<Data> listData) {
        this.listData = listData;
    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item, parent, false);
        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.imageView.setImageResource(listData.get(position).getImageID());
        holder.textView.setText(listData.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }
}






















