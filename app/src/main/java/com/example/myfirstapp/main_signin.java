package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class main_signin extends main_drawer {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View inflater = LayoutInflater.from(this).inflate(R.layout.activity_main_signin,null);

        drawer.addView(inflater ,1);
    }
}