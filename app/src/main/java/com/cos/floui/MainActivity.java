package com.cos.floui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton test_fab;
    private Context mContext = MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test_fab = findViewById(R.id.test_fab);

        test_fab.setOnClickListener(v -> {

            Intent intent = new Intent(mContext, TestActivity.class);
            startActivity(intent);


        });


    }
}