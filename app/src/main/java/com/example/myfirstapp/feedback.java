package com.example.myfirstapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class feedback extends AppCompatActivity {
    TextView txt_per,txt_working,txt_etu;
    RatingBar rb_perf,rb_working,rb_etu;
    Button rt_msg;
   float r1,r2,r3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback);

        rb_perf =findViewById(R.id.perfomance_rb);
        rb_working = findViewById(R.id.working_rb);
        rb_etu =findViewById(R.id.etu_rb);
        txt_working=findViewById(R.id.working_txt);
        txt_etu=findViewById(R.id.etu_txt);
        txt_per=findViewById(R.id.perfomance_txt);
        rt_msg =findViewById(R.id.submitRating);
        rb_perf.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                if(v >2.5){
                      r1=v;
                   // Drawable drawable = rb_perf.getProgressDrawable();
                    // drawable.setColorFilter(Color.parseColor("#0064A8"), PorterDuff.Mode.SRC_ATOP);
                    txt_per.setText("5/" + v );
                    rb_perf.setProgressBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));
                }
                else{
                    rb_perf.setBackgroundColor(Color.RED);
                    txt_per.setText("5/" + v );
                    r1=v;
                }
            }
        });
        rb_working.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                if(v >2.5){

                     r2=v;
                    // Drawable drawable = rb_perf.getProgressDrawable();
                    // drawable.setColorFilter(Color.parseColor("#0064A8"), PorterDuff.Mode.SRC_ATOP);
                    rb_working.setBackgroundColor(Color.GREEN);
                    txt_working.setText("5/" + v );
                }
                else{
                    r2=v;
                    rb_working.setBackgroundColor(Color.RED);
                    txt_working.setText("5/" + v );
                }
            }
        });
        rb_etu.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                if(v >2.5){
                    r3=v;
                    // Drawable drawable = rb_perf.getProgressDrawable();
                    // drawable.setColorFilter(Color.parseColor("#0064A8"), PorterDuff.Mode.SRC_ATOP);
                    txt_etu.setText("5/" + v );
                    rb_etu.setBackgroundColor(Color.GREEN);
                }
                else{
                    r3=v;
                    rb_etu.setBackgroundColor(Color.RED);
                    txt_etu.setText("5/" + v );

                }
            }
        });
        rt_msg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(feedback.this);
                builder.setMessage("Avg Rating is: "+ ""+ (r1+r2+r3)/3).setPositiveButton("Thanks, Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                AlertDialog alert =builder.create();
                alert.show();
            }

        });

    }
}