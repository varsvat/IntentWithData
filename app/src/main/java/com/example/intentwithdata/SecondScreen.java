package com.example.intentwithdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        textView = findViewById(R.id.textview);

        textView.setText("");

        String intenttext = getIntent().getStringExtra("extra");

        textView.setText(intenttext);
    }
}