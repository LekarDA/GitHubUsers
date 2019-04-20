package com.dmitriy.android.githubusers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView listOfUsers;
    private LinearLayoutManager linearLayoutManager;
    private UsersAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tuningView();
    }

    private void tuningView() {
        listOfUsers = findViewById(R.id.listOfUsers);
        linearLayoutManager = new LinearLayoutManager(this);
        listOfUsers.setLayoutManager(linearLayoutManager);
        adapter = new UsersAdapter();
        listOfUsers.setAdapter(adapter);
    }
}
