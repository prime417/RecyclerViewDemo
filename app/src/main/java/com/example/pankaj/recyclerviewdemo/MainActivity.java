package com.example.pankaj.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyRecyclerViewAdapter myRecyclerViewAdapter;
    private RecyclerView.LayoutManager layoutManager;

    private List<Data> listData = new ArrayList<Data>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        myRecyclerViewAdapter = new MyRecyclerViewAdapter(listData);
        recyclerView.setAdapter(myRecyclerViewAdapter);
    }

    private void initData() {
        listData.add(new Data(R.drawable.bear, "Bear"));
        listData.add(new Data(R.drawable.bird, "Bird"));
        listData.add(new Data(R.drawable.bear, "Bear"));
        listData.add(new Data(R.drawable.bird, "Bird"));
        listData.add(new Data(R.drawable.bear, "Bear"));
        listData.add(new Data(R.drawable.bird, "Bird"));
    }
}
