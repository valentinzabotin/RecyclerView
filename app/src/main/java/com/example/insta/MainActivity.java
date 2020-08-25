package com.example.insta;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.RecyclerView)
    androidx.recyclerview.widget.RecyclerView RecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        ArrayList<Post> stringArrayList = new ArrayList<>();

        stringArrayList.add(new Post("skjfskdjf72834","Paris", false));
        stringArrayList.add(new Post("__barsik__","Berlin",false));
        stringArrayList.add(new Post("skjfskdjf72834","Paris", false));
        stringArrayList.add(new Post("__barsik__","Berlin",false));
        stringArrayList.add(new Post("godzilla","Moscow",false));
        stringArrayList.add(new Post("skjfskdjf72834","Paris", false));
        stringArrayList.add(new Post("__barsik__","Berlin",false));
        stringArrayList.add(new Post("godzilla","Moscow",false));
        stringArrayList.add(new Post("skjfskdjf72834","Paris", false));
        stringArrayList.add(new Post("__barsik__","Berlin",false));
        stringArrayList.add(new Post("godzilla","Moscow",false));
        stringArrayList.add(new Post("skjfskdjf72834","Paris", false));
        stringArrayList.add(new Post("__barsik__","Berlin",false));
        stringArrayList.add(new Post("godzilla","Moscow",false));
        stringArrayList.add(new Post("skjfskdjf72834","Paris", false));
        stringArrayList.add(new Post("__barsik__","Berlin",false));
        stringArrayList.add(new Post("godzilla","Moscow",false));
        stringArrayList.add(new Post("skjfskdjf72834","Paris", false));
        stringArrayList.add(new Post("__barsik__","Berlin",false));
        stringArrayList.add(new Post("godzilla","Moscow",false));

        MessageAdapter messageAdapter = new MessageAdapter(this,stringArrayList);
        RecyclerView.setAdapter(messageAdapter);


    }

}