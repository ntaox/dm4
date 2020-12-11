package com.example.dm4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class menus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menus);
    }
    public void onClickHistory (View v){
        Intent intent2 = new Intent(menus.this, history.class);
        startActivity(intent2);

    }
    public void onClickSetting (View v){
        Intent intent2 = new Intent(menus.this, settings.class);
        startActivity(intent2);

    }
}