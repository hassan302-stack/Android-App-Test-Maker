package com.example.myfirstapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class main_drawer extends AppCompatActivity{
    NavigationView nav;
    DrawerLayout drawer;
    ActionBarDrawerToggle toggle;
    Toolbar tools;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_drawer);


         tools = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(tools);
        nav = (NavigationView) findViewById(R.id.navigation);

        drawer = findViewById(R.id.drawer);
        View inflater = LayoutInflater.from(this).inflate(R.layout.activity_main_signin,null);

        toggle = new ActionBarDrawerToggle(this, drawer, tools, R.string.open, R.string.close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.logout:

                        startActivity(new Intent(main_drawer.this, MainActivity.class));
                        drawer.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.create_quiz:
                        AlertDialog.Builder builder = new AlertDialog.Builder(main_drawer.this).setView(inflater);
                        AlertDialog al =builder.create();
                        al.show();
                        startActivity(new Intent(main_drawer.this, Quiz_popup.class));
//                        Toast.makeText(getApplicationContext(),"this is Email page",Toast.LENGTH_LONG).show();
                        drawer.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.create_groups:


                        startActivity(new Intent(main_drawer.this, groups.class));
                                               drawer.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.feedback:
                        startActivity(new Intent(main_drawer.this, feedback.class));
                        drawer.closeDrawer(GravityCompat.START);
                        break;
                }
              item.setChecked(true);
             return true;
            }
        });
    }
}