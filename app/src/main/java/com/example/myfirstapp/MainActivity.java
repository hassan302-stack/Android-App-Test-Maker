package com.example.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import static android.widget.Toast.*;

public class MainActivity extends main_drawer {

        Button btnLogin;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LayoutInflater inflater = LayoutInflater.from(this);
        View v = inflater.inflate(R.layout.activity_main,null,false);
        drawer.addView(v);
        EditText txtEmail,txtPass;

        Button reg = findViewById(R.id.reg);
        Button quiz_pop = findViewById(R.id.LetcreateQuiz);
        Button login = findViewById(R.id.login);
        txtEmail =(EditText) findViewById(R.id.editTextTextPassword);
        txtPass = (EditText)findViewById(R.id.editTextTextPassword2);

        VideoView video = (VideoView) findViewById(R.id.working);
        String uriPath = "android.resource://" + getPackageName() + "/" + R.raw.appvideo;
        Uri uri = Uri.parse(uriPath);
        video.setVideoURI(uri);
        MediaController ctl = new MediaController(this);
        video.setMediaController(ctl);
        ctl.setAnchorView(video);
        //        video.start();S


        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                startActivity(new Intent(MainActivity.this, main_signin.class));
            }
        });
        quiz_pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Quiz_popup.class));
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 String email,password;
                email = txtEmail.getText().toString();
                password=txtPass.getText().toString();
                    Intent i =new Intent(MainActivity.this, dashBoardScreen.class);
                i.putExtra("email",email);
                i.putExtra("pass",password);
                    startActivity(i);

                   Toast.makeText(getApplicationContext(),email+ password, LENGTH_LONG).show();


            }
        });



    }
//public void login(View v){
//      txtEmail = findViewById(R.id.editTextTextPassword);
//    txtPass = findViewById(R.id.editTextTextPassword2);
//    if(txtEmail.getText().toString()=="kazmihassan336@gmail.com"&&txtPass.getText().toString()=="1234") {
//        startActivity(new Intent(MainActivity.this, dashBoardScreen.class));
//    }
//    }
}