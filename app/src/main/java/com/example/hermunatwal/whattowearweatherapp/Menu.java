package com.example.hermunatwal.whattowearweatherapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        final Button button0 = findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ImageView temp = (ImageView)findViewById(R.id.imageView1);
                temp.setImageResource(R.drawable.suit);
            }
        });
        final Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ImageView temp = (ImageView)findViewById(R.id.imageView1);
                temp.setImageResource(R.drawable.casual1);
            }
        });
    }
}
