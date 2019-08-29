package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Total extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total);
        Intent intent =getIntent();
        String mTotal =intent.getStringExtra(HelloToast.EXTRA_MESSAGE_total);
        TextView textView = findViewById(R.id.text_num);
        textView.setText(mTotal);
    }
}
