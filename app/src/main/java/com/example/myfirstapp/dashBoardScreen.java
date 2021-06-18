package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class dashBoardScreen extends main_drawer {


    TextView semail, spassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LayoutInflater inflater = LayoutInflater.from(this);
        View v = inflater.inflate(R.layout.activity_dash_board_screen,null,false);
        drawer.addView(v,1);

        semail = findViewById(R.id.semail);
        spassword=findViewById(R.id.spassword);
        Intent getting= getIntent();

        ;

        semail.setText(getting.getStringExtra("email"));
        spassword.setText(getting.getStringExtra("pass"));
    }
}