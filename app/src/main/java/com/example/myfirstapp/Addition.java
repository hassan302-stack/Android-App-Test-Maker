package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Addition extends AppCompatActivity {
    ImageView img1,img2;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

           img1 = findViewById(R.id.img1);
            img2 = findViewById(R.id.img2);


img1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        img2.setVisibility(view.VISIBLE);
        img1.setVisibility(view.INVISIBLE);
    }
});
img2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        img2.setVisibility(view.INVISIBLE);
        img1.setVisibility(view.VISIBLE);
    }
});
    }
}