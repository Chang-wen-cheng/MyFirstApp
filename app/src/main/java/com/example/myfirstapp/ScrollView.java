package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ScrollView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);
    }

    public void addComment(View view) {
        Intent intent = new Intent(this,TwoActivities.class);
        startActivity(intent);
    }
}
